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

package tj.jekb.service.persistence.impl;

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

import tj.jekb.exception.NoSuchJekbException;

import tj.jekb.model.Jekb;
import tj.jekb.model.impl.JekbImpl;
import tj.jekb.model.impl.JekbModelImpl;

import tj.jekb.service.persistence.JekbPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the jekb service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author falko
 * @see JekbPersistence
 * @see tj.jekb.service.persistence.JekbUtil
 * @generated
 */
@ProviderType
public class JekbPersistenceImpl extends BasePersistenceImpl<Jekb>
	implements JekbPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link JekbUtil} to access the jekb persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = JekbImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(JekbModelImpl.ENTITY_CACHE_ENABLED,
			JekbModelImpl.FINDER_CACHE_ENABLED, JekbImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(JekbModelImpl.ENTITY_CACHE_ENABLED,
			JekbModelImpl.FINDER_CACHE_ENABLED, JekbImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(JekbModelImpl.ENTITY_CACHE_ENABLED,
			JekbModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public JekbPersistenceImpl() {
		setModelClass(Jekb.class);
	}

	/**
	 * Caches the jekb in the entity cache if it is enabled.
	 *
	 * @param jekb the jekb
	 */
	@Override
	public void cacheResult(Jekb jekb) {
		entityCache.putResult(JekbModelImpl.ENTITY_CACHE_ENABLED,
			JekbImpl.class, jekb.getPrimaryKey(), jekb);

		jekb.resetOriginalValues();
	}

	/**
	 * Caches the jekbs in the entity cache if it is enabled.
	 *
	 * @param jekbs the jekbs
	 */
	@Override
	public void cacheResult(List<Jekb> jekbs) {
		for (Jekb jekb : jekbs) {
			if (entityCache.getResult(JekbModelImpl.ENTITY_CACHE_ENABLED,
						JekbImpl.class, jekb.getPrimaryKey()) == null) {
				cacheResult(jekb);
			}
			else {
				jekb.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all jekbs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JekbImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the jekb.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Jekb jekb) {
		entityCache.removeResult(JekbModelImpl.ENTITY_CACHE_ENABLED,
			JekbImpl.class, jekb.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Jekb> jekbs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Jekb jekb : jekbs) {
			entityCache.removeResult(JekbModelImpl.ENTITY_CACHE_ENABLED,
				JekbImpl.class, jekb.getPrimaryKey());
		}
	}

	/**
	 * Creates a new jekb with the primary key. Does not add the jekb to the database.
	 *
	 * @param jekb_id the primary key for the new jekb
	 * @return the new jekb
	 */
	@Override
	public Jekb create(long jekb_id) {
		Jekb jekb = new JekbImpl();

		jekb.setNew(true);
		jekb.setPrimaryKey(jekb_id);

		return jekb;
	}

	/**
	 * Removes the jekb with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jekb_id the primary key of the jekb
	 * @return the jekb that was removed
	 * @throws NoSuchJekbException if a jekb with the primary key could not be found
	 */
	@Override
	public Jekb remove(long jekb_id) throws NoSuchJekbException {
		return remove((Serializable)jekb_id);
	}

	/**
	 * Removes the jekb with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jekb
	 * @return the jekb that was removed
	 * @throws NoSuchJekbException if a jekb with the primary key could not be found
	 */
	@Override
	public Jekb remove(Serializable primaryKey) throws NoSuchJekbException {
		Session session = null;

		try {
			session = openSession();

			Jekb jekb = (Jekb)session.get(JekbImpl.class, primaryKey);

			if (jekb == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJekbException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(jekb);
		}
		catch (NoSuchJekbException nsee) {
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
	protected Jekb removeImpl(Jekb jekb) {
		jekb = toUnwrappedModel(jekb);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jekb)) {
				jekb = (Jekb)session.get(JekbImpl.class, jekb.getPrimaryKeyObj());
			}

			if (jekb != null) {
				session.delete(jekb);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (jekb != null) {
			clearCache(jekb);
		}

		return jekb;
	}

	@Override
	public Jekb updateImpl(Jekb jekb) {
		jekb = toUnwrappedModel(jekb);

		boolean isNew = jekb.isNew();

		Session session = null;

		try {
			session = openSession();

			if (jekb.isNew()) {
				session.save(jekb);

				jekb.setNew(false);
			}
			else {
				jekb = (Jekb)session.merge(jekb);
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

		entityCache.putResult(JekbModelImpl.ENTITY_CACHE_ENABLED,
			JekbImpl.class, jekb.getPrimaryKey(), jekb, false);

		jekb.resetOriginalValues();

		return jekb;
	}

	protected Jekb toUnwrappedModel(Jekb jekb) {
		if (jekb instanceof JekbImpl) {
			return jekb;
		}

		JekbImpl jekbImpl = new JekbImpl();

		jekbImpl.setNew(jekb.isNew());
		jekbImpl.setPrimaryKey(jekb.getPrimaryKey());

		jekbImpl.setJekb_id(jekb.getJekb_id());
		jekbImpl.setKod(jekb.getKod());
		jekbImpl.setNazvanie_ru(jekb.getNazvanie_ru());
		jekbImpl.setNazvanie_tj(jekb.getNazvanie_tj());
		jekbImpl.setNazvanie_en(jekb.getNazvanie_en());

		return jekbImpl;
	}

	/**
	 * Returns the jekb with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the jekb
	 * @return the jekb
	 * @throws NoSuchJekbException if a jekb with the primary key could not be found
	 */
	@Override
	public Jekb findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJekbException {
		Jekb jekb = fetchByPrimaryKey(primaryKey);

		if (jekb == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJekbException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return jekb;
	}

	/**
	 * Returns the jekb with the primary key or throws a {@link NoSuchJekbException} if it could not be found.
	 *
	 * @param jekb_id the primary key of the jekb
	 * @return the jekb
	 * @throws NoSuchJekbException if a jekb with the primary key could not be found
	 */
	@Override
	public Jekb findByPrimaryKey(long jekb_id) throws NoSuchJekbException {
		return findByPrimaryKey((Serializable)jekb_id);
	}

	/**
	 * Returns the jekb with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jekb
	 * @return the jekb, or <code>null</code> if a jekb with the primary key could not be found
	 */
	@Override
	public Jekb fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(JekbModelImpl.ENTITY_CACHE_ENABLED,
				JekbImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Jekb jekb = (Jekb)serializable;

		if (jekb == null) {
			Session session = null;

			try {
				session = openSession();

				jekb = (Jekb)session.get(JekbImpl.class, primaryKey);

				if (jekb != null) {
					cacheResult(jekb);
				}
				else {
					entityCache.putResult(JekbModelImpl.ENTITY_CACHE_ENABLED,
						JekbImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(JekbModelImpl.ENTITY_CACHE_ENABLED,
					JekbImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return jekb;
	}

	/**
	 * Returns the jekb with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jekb_id the primary key of the jekb
	 * @return the jekb, or <code>null</code> if a jekb with the primary key could not be found
	 */
	@Override
	public Jekb fetchByPrimaryKey(long jekb_id) {
		return fetchByPrimaryKey((Serializable)jekb_id);
	}

	@Override
	public Map<Serializable, Jekb> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Jekb> map = new HashMap<Serializable, Jekb>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Jekb jekb = fetchByPrimaryKey(primaryKey);

			if (jekb != null) {
				map.put(primaryKey, jekb);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(JekbModelImpl.ENTITY_CACHE_ENABLED,
					JekbImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Jekb)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_JEKB_WHERE_PKS_IN);

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

			for (Jekb jekb : (List<Jekb>)q.list()) {
				map.put(jekb.getPrimaryKeyObj(), jekb);

				cacheResult(jekb);

				uncachedPrimaryKeys.remove(jekb.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(JekbModelImpl.ENTITY_CACHE_ENABLED,
					JekbImpl.class, primaryKey, nullModel);
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
	 * Returns all the jekbs.
	 *
	 * @return the jekbs
	 */
	@Override
	public List<Jekb> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jekbs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JekbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of jekbs
	 * @param end the upper bound of the range of jekbs (not inclusive)
	 * @return the range of jekbs
	 */
	@Override
	public List<Jekb> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jekbs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JekbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of jekbs
	 * @param end the upper bound of the range of jekbs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jekbs
	 */
	@Override
	public List<Jekb> findAll(int start, int end,
		OrderByComparator<Jekb> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jekbs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JekbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of jekbs
	 * @param end the upper bound of the range of jekbs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of jekbs
	 */
	@Override
	public List<Jekb> findAll(int start, int end,
		OrderByComparator<Jekb> orderByComparator, boolean retrieveFromCache) {
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

		List<Jekb> list = null;

		if (retrieveFromCache) {
			list = (List<Jekb>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_JEKB);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_JEKB;

				if (pagination) {
					sql = sql.concat(JekbModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Jekb>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Jekb>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the jekbs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Jekb jekb : findAll()) {
			remove(jekb);
		}
	}

	/**
	 * Returns the number of jekbs.
	 *
	 * @return the number of jekbs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_JEKB);

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
		return JekbModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jekb persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(JekbImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_JEKB = "SELECT jekb FROM Jekb jekb";
	private static final String _SQL_SELECT_JEKB_WHERE_PKS_IN = "SELECT jekb FROM Jekb jekb WHERE jekb_id IN (";
	private static final String _SQL_COUNT_JEKB = "SELECT COUNT(jekb) FROM Jekb jekb";
	private static final String _ORDER_BY_ENTITY_ALIAS = "jekb.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Jekb exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(JekbPersistenceImpl.class);
}