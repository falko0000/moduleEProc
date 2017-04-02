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

package tj.okgz.service.persistence.impl;

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

import tj.okgz.exception.NoSuchOkgzException;

import tj.okgz.model.Okgz;
import tj.okgz.model.impl.OkgzImpl;
import tj.okgz.model.impl.OkgzModelImpl;

import tj.okgz.service.persistence.OkgzPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the okgz service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OkgzPersistence
 * @see tj.okgz.service.persistence.OkgzUtil
 * @generated
 */
@ProviderType
public class OkgzPersistenceImpl extends BasePersistenceImpl<Okgz>
	implements OkgzPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OkgzUtil} to access the okgz persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OkgzImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OkgzModelImpl.ENTITY_CACHE_ENABLED,
			OkgzModelImpl.FINDER_CACHE_ENABLED, OkgzImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OkgzModelImpl.ENTITY_CACHE_ENABLED,
			OkgzModelImpl.FINDER_CACHE_ENABLED, OkgzImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OkgzModelImpl.ENTITY_CACHE_ENABLED,
			OkgzModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public OkgzPersistenceImpl() {
		setModelClass(Okgz.class);
	}

	/**
	 * Caches the okgz in the entity cache if it is enabled.
	 *
	 * @param okgz the okgz
	 */
	@Override
	public void cacheResult(Okgz okgz) {
		entityCache.putResult(OkgzModelImpl.ENTITY_CACHE_ENABLED,
			OkgzImpl.class, okgz.getPrimaryKey(), okgz);

		okgz.resetOriginalValues();
	}

	/**
	 * Caches the okgzs in the entity cache if it is enabled.
	 *
	 * @param okgzs the okgzs
	 */
	@Override
	public void cacheResult(List<Okgz> okgzs) {
		for (Okgz okgz : okgzs) {
			if (entityCache.getResult(OkgzModelImpl.ENTITY_CACHE_ENABLED,
						OkgzImpl.class, okgz.getPrimaryKey()) == null) {
				cacheResult(okgz);
			}
			else {
				okgz.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all okgzs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OkgzImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the okgz.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Okgz okgz) {
		entityCache.removeResult(OkgzModelImpl.ENTITY_CACHE_ENABLED,
			OkgzImpl.class, okgz.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Okgz> okgzs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Okgz okgz : okgzs) {
			entityCache.removeResult(OkgzModelImpl.ENTITY_CACHE_ENABLED,
				OkgzImpl.class, okgz.getPrimaryKey());
		}
	}

	/**
	 * Creates a new okgz with the primary key. Does not add the okgz to the database.
	 *
	 * @param okgz_id the primary key for the new okgz
	 * @return the new okgz
	 */
	@Override
	public Okgz create(long okgz_id) {
		Okgz okgz = new OkgzImpl();

		okgz.setNew(true);
		okgz.setPrimaryKey(okgz_id);

		return okgz;
	}

	/**
	 * Removes the okgz with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param okgz_id the primary key of the okgz
	 * @return the okgz that was removed
	 * @throws NoSuchOkgzException if a okgz with the primary key could not be found
	 */
	@Override
	public Okgz remove(long okgz_id) throws NoSuchOkgzException {
		return remove((Serializable)okgz_id);
	}

	/**
	 * Removes the okgz with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the okgz
	 * @return the okgz that was removed
	 * @throws NoSuchOkgzException if a okgz with the primary key could not be found
	 */
	@Override
	public Okgz remove(Serializable primaryKey) throws NoSuchOkgzException {
		Session session = null;

		try {
			session = openSession();

			Okgz okgz = (Okgz)session.get(OkgzImpl.class, primaryKey);

			if (okgz == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOkgzException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(okgz);
		}
		catch (NoSuchOkgzException nsee) {
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
	protected Okgz removeImpl(Okgz okgz) {
		okgz = toUnwrappedModel(okgz);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(okgz)) {
				okgz = (Okgz)session.get(OkgzImpl.class, okgz.getPrimaryKeyObj());
			}

			if (okgz != null) {
				session.delete(okgz);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (okgz != null) {
			clearCache(okgz);
		}

		return okgz;
	}

	@Override
	public Okgz updateImpl(Okgz okgz) {
		okgz = toUnwrappedModel(okgz);

		boolean isNew = okgz.isNew();

		Session session = null;

		try {
			session = openSession();

			if (okgz.isNew()) {
				session.save(okgz);

				okgz.setNew(false);
			}
			else {
				okgz = (Okgz)session.merge(okgz);
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

		entityCache.putResult(OkgzModelImpl.ENTITY_CACHE_ENABLED,
			OkgzImpl.class, okgz.getPrimaryKey(), okgz, false);

		okgz.resetOriginalValues();

		return okgz;
	}

	protected Okgz toUnwrappedModel(Okgz okgz) {
		if (okgz instanceof OkgzImpl) {
			return okgz;
		}

		OkgzImpl okgzImpl = new OkgzImpl();

		okgzImpl.setNew(okgz.isNew());
		okgzImpl.setPrimaryKey(okgz.getPrimaryKey());

		okgzImpl.setOkgz_id(okgz.getOkgz_id());
		okgzImpl.setKod(okgz.getKod());
		okgzImpl.setNaimenovanie(okgz.getNaimenovanie());

		return okgzImpl;
	}

	/**
	 * Returns the okgz with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the okgz
	 * @return the okgz
	 * @throws NoSuchOkgzException if a okgz with the primary key could not be found
	 */
	@Override
	public Okgz findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOkgzException {
		Okgz okgz = fetchByPrimaryKey(primaryKey);

		if (okgz == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOkgzException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return okgz;
	}

	/**
	 * Returns the okgz with the primary key or throws a {@link NoSuchOkgzException} if it could not be found.
	 *
	 * @param okgz_id the primary key of the okgz
	 * @return the okgz
	 * @throws NoSuchOkgzException if a okgz with the primary key could not be found
	 */
	@Override
	public Okgz findByPrimaryKey(long okgz_id) throws NoSuchOkgzException {
		return findByPrimaryKey((Serializable)okgz_id);
	}

	/**
	 * Returns the okgz with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the okgz
	 * @return the okgz, or <code>null</code> if a okgz with the primary key could not be found
	 */
	@Override
	public Okgz fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(OkgzModelImpl.ENTITY_CACHE_ENABLED,
				OkgzImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Okgz okgz = (Okgz)serializable;

		if (okgz == null) {
			Session session = null;

			try {
				session = openSession();

				okgz = (Okgz)session.get(OkgzImpl.class, primaryKey);

				if (okgz != null) {
					cacheResult(okgz);
				}
				else {
					entityCache.putResult(OkgzModelImpl.ENTITY_CACHE_ENABLED,
						OkgzImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(OkgzModelImpl.ENTITY_CACHE_ENABLED,
					OkgzImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return okgz;
	}

	/**
	 * Returns the okgz with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param okgz_id the primary key of the okgz
	 * @return the okgz, or <code>null</code> if a okgz with the primary key could not be found
	 */
	@Override
	public Okgz fetchByPrimaryKey(long okgz_id) {
		return fetchByPrimaryKey((Serializable)okgz_id);
	}

	@Override
	public Map<Serializable, Okgz> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Okgz> map = new HashMap<Serializable, Okgz>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Okgz okgz = fetchByPrimaryKey(primaryKey);

			if (okgz != null) {
				map.put(primaryKey, okgz);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(OkgzModelImpl.ENTITY_CACHE_ENABLED,
					OkgzImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Okgz)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_OKGZ_WHERE_PKS_IN);

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

			for (Okgz okgz : (List<Okgz>)q.list()) {
				map.put(okgz.getPrimaryKeyObj(), okgz);

				cacheResult(okgz);

				uncachedPrimaryKeys.remove(okgz.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(OkgzModelImpl.ENTITY_CACHE_ENABLED,
					OkgzImpl.class, primaryKey, nullModel);
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
	 * Returns all the okgzs.
	 *
	 * @return the okgzs
	 */
	@Override
	public List<Okgz> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the okgzs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OkgzModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of okgzs
	 * @param end the upper bound of the range of okgzs (not inclusive)
	 * @return the range of okgzs
	 */
	@Override
	public List<Okgz> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the okgzs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OkgzModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of okgzs
	 * @param end the upper bound of the range of okgzs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of okgzs
	 */
	@Override
	public List<Okgz> findAll(int start, int end,
		OrderByComparator<Okgz> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the okgzs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OkgzModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of okgzs
	 * @param end the upper bound of the range of okgzs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of okgzs
	 */
	@Override
	public List<Okgz> findAll(int start, int end,
		OrderByComparator<Okgz> orderByComparator, boolean retrieveFromCache) {
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

		List<Okgz> list = null;

		if (retrieveFromCache) {
			list = (List<Okgz>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_OKGZ);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OKGZ;

				if (pagination) {
					sql = sql.concat(OkgzModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Okgz>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Okgz>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the okgzs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Okgz okgz : findAll()) {
			remove(okgz);
		}
	}

	/**
	 * Returns the number of okgzs.
	 *
	 * @return the number of okgzs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_OKGZ);

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
		return OkgzModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the okgz persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(OkgzImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_OKGZ = "SELECT okgz FROM Okgz okgz";
	private static final String _SQL_SELECT_OKGZ_WHERE_PKS_IN = "SELECT okgz FROM Okgz okgz WHERE okgz_id IN (";
	private static final String _SQL_COUNT_OKGZ = "SELECT COUNT(okgz) FROM Okgz okgz";
	private static final String _ORDER_BY_ENTITY_ALIAS = "okgz.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Okgz exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(OkgzPersistenceImpl.class);
}