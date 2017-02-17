/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package tj.sapp.services.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import tj.sapp.services.exception.NoSuchVBKException;
import tj.sapp.services.model.VBK;
import tj.sapp.services.model.impl.VBKImpl;
import tj.sapp.services.model.impl.VBKModelImpl;
import tj.sapp.services.service.persistence.VBKPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the v b k service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VBKPersistence
 * @see tj.sapp.services.service.persistence.VBKUtil
 * @generated
 */
@ProviderType
public class VBKPersistenceImpl extends BasePersistenceImpl<VBK>
	implements VBKPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VBKUtil} to access the v b k persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VBKImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VBKModelImpl.ENTITY_CACHE_ENABLED,
			VBKModelImpl.FINDER_CACHE_ENABLED, VBKImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VBKModelImpl.ENTITY_CACHE_ENABLED,
			VBKModelImpl.FINDER_CACHE_ENABLED, VBKImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VBKModelImpl.ENTITY_CACHE_ENABLED,
			VBKModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public VBKPersistenceImpl() {
		setModelClass(VBK.class);
	}

	/**
	 * Caches the v b k in the entity cache if it is enabled.
	 *
	 * @param vbk the v b k
	 */
	@Override
	public void cacheResult(VBK vbk) {
		entityCache.putResult(VBKModelImpl.ENTITY_CACHE_ENABLED, VBKImpl.class,
			vbk.getPrimaryKey(), vbk);

		vbk.resetOriginalValues();
	}

	/**
	 * Caches the v b ks in the entity cache if it is enabled.
	 *
	 * @param vbks the v b ks
	 */
	@Override
	public void cacheResult(List<VBK> vbks) {
		for (VBK vbk : vbks) {
			if (entityCache.getResult(VBKModelImpl.ENTITY_CACHE_ENABLED,
						VBKImpl.class, vbk.getPrimaryKey()) == null) {
				cacheResult(vbk);
			}
			else {
				vbk.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all v b ks.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VBKImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the v b k.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VBK vbk) {
		entityCache.removeResult(VBKModelImpl.ENTITY_CACHE_ENABLED,
			VBKImpl.class, vbk.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VBK> vbks) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VBK vbk : vbks) {
			entityCache.removeResult(VBKModelImpl.ENTITY_CACHE_ENABLED,
				VBKImpl.class, vbk.getPrimaryKey());
		}
	}

	/**
	 * Creates a new v b k with the primary key. Does not add the v b k to the database.
	 *
	 * @param id_ the primary key for the new v b k
	 * @return the new v b k
	 */
	@Override
	public VBK create(long id_) {
		VBK vbk = new VBKImpl();

		vbk.setNew(true);
		vbk.setPrimaryKey(id_);

		return vbk;
	}

	/**
	 * Removes the v b k with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id_ the primary key of the v b k
	 * @return the v b k that was removed
	 * @throws NoSuchVBKException if a v b k with the primary key could not be found
	 */
	@Override
	public VBK remove(long id_) throws NoSuchVBKException {
		return remove((Serializable)id_);
	}

	/**
	 * Removes the v b k with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v b k
	 * @return the v b k that was removed
	 * @throws NoSuchVBKException if a v b k with the primary key could not be found
	 */
	@Override
	public VBK remove(Serializable primaryKey) throws NoSuchVBKException {
		Session session = null;

		try {
			session = openSession();

			VBK vbk = (VBK)session.get(VBKImpl.class, primaryKey);

			if (vbk == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVBKException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vbk);
		}
		catch (NoSuchVBKException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected VBK removeImpl(VBK vbk) {
		vbk = toUnwrappedModel(vbk);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vbk)) {
				vbk = (VBK)session.get(VBKImpl.class, vbk.getPrimaryKeyObj());
			}

			if (vbk != null) {
				session.delete(vbk);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vbk != null) {
			clearCache(vbk);
		}

		return vbk;
	}

	@Override
	public VBK updateImpl(VBK vbk) {
		vbk = toUnwrappedModel(vbk);

		boolean isNew = vbk.isNew();

		Session session = null;

		try {
			session = openSession();

			if (vbk.isNew()) {
				session.save(vbk);

				vbk.setNew(false);
			}
			else {
				vbk = (VBK)session.merge(vbk);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(VBKModelImpl.ENTITY_CACHE_ENABLED, VBKImpl.class,
			vbk.getPrimaryKey(), vbk, false);

		vbk.resetOriginalValues();

		return vbk;
	}

	protected VBK toUnwrappedModel(VBK vbk) {
		if (vbk instanceof VBKImpl) {
			return vbk;
		}

		VBKImpl vbkImpl = new VBKImpl();

		vbkImpl.setNew(vbk.isNew());
		vbkImpl.setPrimaryKey(vbk.getPrimaryKey());

		vbkImpl.setId_(vbk.getId_());
		vbkImpl.setKod(vbk.getKod());
		vbkImpl.setNazvanie_tj(vbk.getNazvanie_tj());
		vbkImpl.setNazvanie_ru(vbk.getNazvanie_ru());

		return vbkImpl;
	}

	/**
	 * Returns the v b k with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v b k
	 * @return the v b k
	 * @throws NoSuchVBKException if a v b k with the primary key could not be found
	 */
	@Override
	public VBK findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVBKException {
		VBK vbk = fetchByPrimaryKey(primaryKey);

		if (vbk == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVBKException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vbk;
	}

	/**
	 * Returns the v b k with the primary key or throws a {@link NoSuchVBKException} if it could not be found.
	 *
	 * @param id_ the primary key of the v b k
	 * @return the v b k
	 * @throws NoSuchVBKException if a v b k with the primary key could not be found
	 */
	@Override
	public VBK findByPrimaryKey(long id_) throws NoSuchVBKException {
		return findByPrimaryKey((Serializable)id_);
	}

	/**
	 * Returns the v b k with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v b k
	 * @return the v b k, or <code>null</code> if a v b k with the primary key could not be found
	 */
	@Override
	public VBK fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VBKModelImpl.ENTITY_CACHE_ENABLED,
				VBKImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VBK vbk = (VBK)serializable;

		if (vbk == null) {
			Session session = null;

			try {
				session = openSession();

				vbk = (VBK)session.get(VBKImpl.class, primaryKey);

				if (vbk != null) {
					cacheResult(vbk);
				}
				else {
					entityCache.putResult(VBKModelImpl.ENTITY_CACHE_ENABLED,
						VBKImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VBKModelImpl.ENTITY_CACHE_ENABLED,
					VBKImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vbk;
	}

	/**
	 * Returns the v b k with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id_ the primary key of the v b k
	 * @return the v b k, or <code>null</code> if a v b k with the primary key could not be found
	 */
	@Override
	public VBK fetchByPrimaryKey(long id_) {
		return fetchByPrimaryKey((Serializable)id_);
	}

	@Override
	public Map<Serializable, VBK> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VBK> map = new HashMap<Serializable, VBK>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VBK vbk = fetchByPrimaryKey(primaryKey);

			if (vbk != null) {
				map.put(primaryKey, vbk);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VBKModelImpl.ENTITY_CACHE_ENABLED,
					VBKImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VBK)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VBK_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (VBK vbk : (List<VBK>)q.list()) {
				map.put(vbk.getPrimaryKeyObj(), vbk);

				cacheResult(vbk);

				uncachedPrimaryKeys.remove(vbk.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VBKModelImpl.ENTITY_CACHE_ENABLED,
					VBKImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the v b ks.
	 *
	 * @return the v b ks
	 */
	@Override
	public List<VBK> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v b ks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VBKModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v b ks
	 * @param end the upper bound of the range of v b ks (not inclusive)
	 * @return the range of v b ks
	 */
	@Override
	public List<VBK> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the v b ks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VBKModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v b ks
	 * @param end the upper bound of the range of v b ks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of v b ks
	 */
	@Override
	public List<VBK> findAll(int start, int end,
		OrderByComparator<VBK> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v b ks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VBKModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v b ks
	 * @param end the upper bound of the range of v b ks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of v b ks
	 */
	@Override
	public List<VBK> findAll(int start, int end,
		OrderByComparator<VBK> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<VBK> list = null;

		if (retrieveFromCache) {
			list = (List<VBK>)finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VBK);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VBK;

				if (pagination) {
					sql = sql.concat(VBKModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VBK>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VBK>)QueryUtil.list(q, getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the v b ks from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VBK vbk : findAll()) {
			remove(vbk);
		}
	}

	/**
	 * Returns the number of v b ks.
	 *
	 * @return the number of v b ks
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VBK);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return VBKModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the v b k persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VBKImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VBK = "SELECT vbk FROM VBK vbk";
	private static final String _SQL_SELECT_VBK_WHERE_PKS_IN = "SELECT vbk FROM VBK vbk WHERE id_ IN (";
	private static final String _SQL_COUNT_VBK = "SELECT COUNT(vbk) FROM VBK vbk";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vbk.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VBK exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(VBKPersistenceImpl.class);
}