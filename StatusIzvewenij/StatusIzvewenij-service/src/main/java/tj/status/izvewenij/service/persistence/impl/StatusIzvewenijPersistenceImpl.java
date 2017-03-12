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

package tj.status.izvewenij.service.persistence.impl;

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

import tj.status.izvewenij.exception.NoSuchStatusIzvewenijException;
import tj.status.izvewenij.model.StatusIzvewenij;
import tj.status.izvewenij.model.impl.StatusIzvewenijImpl;
import tj.status.izvewenij.model.impl.StatusIzvewenijModelImpl;
import tj.status.izvewenij.service.persistence.StatusIzvewenijPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the status izvewenij service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author falko
 * @see StatusIzvewenijPersistence
 * @see tj.status.izvewenij.service.persistence.StatusIzvewenijUtil
 * @generated
 */
@ProviderType
public class StatusIzvewenijPersistenceImpl extends BasePersistenceImpl<StatusIzvewenij>
	implements StatusIzvewenijPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link StatusIzvewenijUtil} to access the status izvewenij persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = StatusIzvewenijImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StatusIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
			StatusIzvewenijModelImpl.FINDER_CACHE_ENABLED,
			StatusIzvewenijImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StatusIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
			StatusIzvewenijModelImpl.FINDER_CACHE_ENABLED,
			StatusIzvewenijImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StatusIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
			StatusIzvewenijModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public StatusIzvewenijPersistenceImpl() {
		setModelClass(StatusIzvewenij.class);
	}

	/**
	 * Caches the status izvewenij in the entity cache if it is enabled.
	 *
	 * @param statusIzvewenij the status izvewenij
	 */
	@Override
	public void cacheResult(StatusIzvewenij statusIzvewenij) {
		entityCache.putResult(StatusIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
			StatusIzvewenijImpl.class, statusIzvewenij.getPrimaryKey(),
			statusIzvewenij);

		statusIzvewenij.resetOriginalValues();
	}

	/**
	 * Caches the status izvewenijs in the entity cache if it is enabled.
	 *
	 * @param statusIzvewenijs the status izvewenijs
	 */
	@Override
	public void cacheResult(List<StatusIzvewenij> statusIzvewenijs) {
		for (StatusIzvewenij statusIzvewenij : statusIzvewenijs) {
			if (entityCache.getResult(
						StatusIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
						StatusIzvewenijImpl.class,
						statusIzvewenij.getPrimaryKey()) == null) {
				cacheResult(statusIzvewenij);
			}
			else {
				statusIzvewenij.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all status izvewenijs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(StatusIzvewenijImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the status izvewenij.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(StatusIzvewenij statusIzvewenij) {
		entityCache.removeResult(StatusIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
			StatusIzvewenijImpl.class, statusIzvewenij.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<StatusIzvewenij> statusIzvewenijs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (StatusIzvewenij statusIzvewenij : statusIzvewenijs) {
			entityCache.removeResult(StatusIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
				StatusIzvewenijImpl.class, statusIzvewenij.getPrimaryKey());
		}
	}

	/**
	 * Creates a new status izvewenij with the primary key. Does not add the status izvewenij to the database.
	 *
	 * @param status_izvewenij_id the primary key for the new status izvewenij
	 * @return the new status izvewenij
	 */
	@Override
	public StatusIzvewenij create(long status_izvewenij_id) {
		StatusIzvewenij statusIzvewenij = new StatusIzvewenijImpl();

		statusIzvewenij.setNew(true);
		statusIzvewenij.setPrimaryKey(status_izvewenij_id);

		return statusIzvewenij;
	}

	/**
	 * Removes the status izvewenij with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param status_izvewenij_id the primary key of the status izvewenij
	 * @return the status izvewenij that was removed
	 * @throws NoSuchStatusIzvewenijException if a status izvewenij with the primary key could not be found
	 */
	@Override
	public StatusIzvewenij remove(long status_izvewenij_id)
		throws NoSuchStatusIzvewenijException {
		return remove((Serializable)status_izvewenij_id);
	}

	/**
	 * Removes the status izvewenij with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the status izvewenij
	 * @return the status izvewenij that was removed
	 * @throws NoSuchStatusIzvewenijException if a status izvewenij with the primary key could not be found
	 */
	@Override
	public StatusIzvewenij remove(Serializable primaryKey)
		throws NoSuchStatusIzvewenijException {
		Session session = null;

		try {
			session = openSession();

			StatusIzvewenij statusIzvewenij = (StatusIzvewenij)session.get(StatusIzvewenijImpl.class,
					primaryKey);

			if (statusIzvewenij == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStatusIzvewenijException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(statusIzvewenij);
		}
		catch (NoSuchStatusIzvewenijException nsee) {
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
	protected StatusIzvewenij removeImpl(StatusIzvewenij statusIzvewenij) {
		statusIzvewenij = toUnwrappedModel(statusIzvewenij);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(statusIzvewenij)) {
				statusIzvewenij = (StatusIzvewenij)session.get(StatusIzvewenijImpl.class,
						statusIzvewenij.getPrimaryKeyObj());
			}

			if (statusIzvewenij != null) {
				session.delete(statusIzvewenij);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (statusIzvewenij != null) {
			clearCache(statusIzvewenij);
		}

		return statusIzvewenij;
	}

	@Override
	public StatusIzvewenij updateImpl(StatusIzvewenij statusIzvewenij) {
		statusIzvewenij = toUnwrappedModel(statusIzvewenij);

		boolean isNew = statusIzvewenij.isNew();

		Session session = null;

		try {
			session = openSession();

			if (statusIzvewenij.isNew()) {
				session.save(statusIzvewenij);

				statusIzvewenij.setNew(false);
			}
			else {
				statusIzvewenij = (StatusIzvewenij)session.merge(statusIzvewenij);
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

		entityCache.putResult(StatusIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
			StatusIzvewenijImpl.class, statusIzvewenij.getPrimaryKey(),
			statusIzvewenij, false);

		statusIzvewenij.resetOriginalValues();

		return statusIzvewenij;
	}

	protected StatusIzvewenij toUnwrappedModel(StatusIzvewenij statusIzvewenij) {
		if (statusIzvewenij instanceof StatusIzvewenijImpl) {
			return statusIzvewenij;
		}

		StatusIzvewenijImpl statusIzvewenijImpl = new StatusIzvewenijImpl();

		statusIzvewenijImpl.setNew(statusIzvewenij.isNew());
		statusIzvewenijImpl.setPrimaryKey(statusIzvewenij.getPrimaryKey());

		statusIzvewenijImpl.setStatus_izvewenij_id(statusIzvewenij.getStatus_izvewenij_id());
		statusIzvewenijImpl.setStatus(statusIzvewenij.getStatus());

		return statusIzvewenijImpl;
	}

	/**
	 * Returns the status izvewenij with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the status izvewenij
	 * @return the status izvewenij
	 * @throws NoSuchStatusIzvewenijException if a status izvewenij with the primary key could not be found
	 */
	@Override
	public StatusIzvewenij findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStatusIzvewenijException {
		StatusIzvewenij statusIzvewenij = fetchByPrimaryKey(primaryKey);

		if (statusIzvewenij == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStatusIzvewenijException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return statusIzvewenij;
	}

	/**
	 * Returns the status izvewenij with the primary key or throws a {@link NoSuchStatusIzvewenijException} if it could not be found.
	 *
	 * @param status_izvewenij_id the primary key of the status izvewenij
	 * @return the status izvewenij
	 * @throws NoSuchStatusIzvewenijException if a status izvewenij with the primary key could not be found
	 */
	@Override
	public StatusIzvewenij findByPrimaryKey(long status_izvewenij_id)
		throws NoSuchStatusIzvewenijException {
		return findByPrimaryKey((Serializable)status_izvewenij_id);
	}

	/**
	 * Returns the status izvewenij with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the status izvewenij
	 * @return the status izvewenij, or <code>null</code> if a status izvewenij with the primary key could not be found
	 */
	@Override
	public StatusIzvewenij fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(StatusIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
				StatusIzvewenijImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		StatusIzvewenij statusIzvewenij = (StatusIzvewenij)serializable;

		if (statusIzvewenij == null) {
			Session session = null;

			try {
				session = openSession();

				statusIzvewenij = (StatusIzvewenij)session.get(StatusIzvewenijImpl.class,
						primaryKey);

				if (statusIzvewenij != null) {
					cacheResult(statusIzvewenij);
				}
				else {
					entityCache.putResult(StatusIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
						StatusIzvewenijImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(StatusIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
					StatusIzvewenijImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return statusIzvewenij;
	}

	/**
	 * Returns the status izvewenij with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param status_izvewenij_id the primary key of the status izvewenij
	 * @return the status izvewenij, or <code>null</code> if a status izvewenij with the primary key could not be found
	 */
	@Override
	public StatusIzvewenij fetchByPrimaryKey(long status_izvewenij_id) {
		return fetchByPrimaryKey((Serializable)status_izvewenij_id);
	}

	@Override
	public Map<Serializable, StatusIzvewenij> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, StatusIzvewenij> map = new HashMap<Serializable, StatusIzvewenij>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			StatusIzvewenij statusIzvewenij = fetchByPrimaryKey(primaryKey);

			if (statusIzvewenij != null) {
				map.put(primaryKey, statusIzvewenij);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(StatusIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
					StatusIzvewenijImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (StatusIzvewenij)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_STATUSIZVEWENIJ_WHERE_PKS_IN);

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

			for (StatusIzvewenij statusIzvewenij : (List<StatusIzvewenij>)q.list()) {
				map.put(statusIzvewenij.getPrimaryKeyObj(), statusIzvewenij);

				cacheResult(statusIzvewenij);

				uncachedPrimaryKeys.remove(statusIzvewenij.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(StatusIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
					StatusIzvewenijImpl.class, primaryKey, nullModel);
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
	 * Returns all the status izvewenijs.
	 *
	 * @return the status izvewenijs
	 */
	@Override
	public List<StatusIzvewenij> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the status izvewenijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StatusIzvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of status izvewenijs
	 * @param end the upper bound of the range of status izvewenijs (not inclusive)
	 * @return the range of status izvewenijs
	 */
	@Override
	public List<StatusIzvewenij> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the status izvewenijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StatusIzvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of status izvewenijs
	 * @param end the upper bound of the range of status izvewenijs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of status izvewenijs
	 */
	@Override
	public List<StatusIzvewenij> findAll(int start, int end,
		OrderByComparator<StatusIzvewenij> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the status izvewenijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StatusIzvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of status izvewenijs
	 * @param end the upper bound of the range of status izvewenijs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of status izvewenijs
	 */
	@Override
	public List<StatusIzvewenij> findAll(int start, int end,
		OrderByComparator<StatusIzvewenij> orderByComparator,
		boolean retrieveFromCache) {
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

		List<StatusIzvewenij> list = null;

		if (retrieveFromCache) {
			list = (List<StatusIzvewenij>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_STATUSIZVEWENIJ);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STATUSIZVEWENIJ;

				if (pagination) {
					sql = sql.concat(StatusIzvewenijModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<StatusIzvewenij>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<StatusIzvewenij>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the status izvewenijs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (StatusIzvewenij statusIzvewenij : findAll()) {
			remove(statusIzvewenij);
		}
	}

	/**
	 * Returns the number of status izvewenijs.
	 *
	 * @return the number of status izvewenijs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_STATUSIZVEWENIJ);

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
		return StatusIzvewenijModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the status izvewenij persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(StatusIzvewenijImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_STATUSIZVEWENIJ = "SELECT statusIzvewenij FROM StatusIzvewenij statusIzvewenij";
	private static final String _SQL_SELECT_STATUSIZVEWENIJ_WHERE_PKS_IN = "SELECT statusIzvewenij FROM StatusIzvewenij statusIzvewenij WHERE status_izvewenij_id IN (";
	private static final String _SQL_COUNT_STATUSIZVEWENIJ = "SELECT COUNT(statusIzvewenij) FROM StatusIzvewenij statusIzvewenij";
	private static final String _ORDER_BY_ENTITY_ALIAS = "statusIzvewenij.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No StatusIzvewenij exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(StatusIzvewenijPersistenceImpl.class);
}