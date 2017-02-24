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

package tj.tipy.izvewenij.service.persistence.impl;

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

import tj.tipy.izvewenij.exception.NoSuchtipy_izvewenijException;
import tj.tipy.izvewenij.model.impl.tipy_izvewenijImpl;
import tj.tipy.izvewenij.model.impl.tipy_izvewenijModelImpl;
import tj.tipy.izvewenij.model.tipy_izvewenij;
import tj.tipy.izvewenij.service.persistence.tipy_izvewenijPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the tipy_izvewenij service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tipy_izvewenijPersistence
 * @see tj.tipy.izvewenij.service.persistence.tipy_izvewenijUtil
 * @generated
 */
@ProviderType
public class tipy_izvewenijPersistenceImpl extends BasePersistenceImpl<tipy_izvewenij>
	implements tipy_izvewenijPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link tipy_izvewenijUtil} to access the tipy_izvewenij persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = tipy_izvewenijImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(tipy_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
			tipy_izvewenijModelImpl.FINDER_CACHE_ENABLED,
			tipy_izvewenijImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(tipy_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
			tipy_izvewenijModelImpl.FINDER_CACHE_ENABLED,
			tipy_izvewenijImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(tipy_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
			tipy_izvewenijModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public tipy_izvewenijPersistenceImpl() {
		setModelClass(tipy_izvewenij.class);
	}

	/**
	 * Caches the tipy_izvewenij in the entity cache if it is enabled.
	 *
	 * @param tipy_izvewenij the tipy_izvewenij
	 */
	@Override
	public void cacheResult(tipy_izvewenij tipy_izvewenij) {
		entityCache.putResult(tipy_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
			tipy_izvewenijImpl.class, tipy_izvewenij.getPrimaryKey(),
			tipy_izvewenij);

		tipy_izvewenij.resetOriginalValues();
	}

	/**
	 * Caches the tipy_izvewenijs in the entity cache if it is enabled.
	 *
	 * @param tipy_izvewenijs the tipy_izvewenijs
	 */
	@Override
	public void cacheResult(List<tipy_izvewenij> tipy_izvewenijs) {
		for (tipy_izvewenij tipy_izvewenij : tipy_izvewenijs) {
			if (entityCache.getResult(
						tipy_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
						tipy_izvewenijImpl.class, tipy_izvewenij.getPrimaryKey()) == null) {
				cacheResult(tipy_izvewenij);
			}
			else {
				tipy_izvewenij.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tipy_izvewenijs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(tipy_izvewenijImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tipy_izvewenij.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(tipy_izvewenij tipy_izvewenij) {
		entityCache.removeResult(tipy_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
			tipy_izvewenijImpl.class, tipy_izvewenij.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<tipy_izvewenij> tipy_izvewenijs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (tipy_izvewenij tipy_izvewenij : tipy_izvewenijs) {
			entityCache.removeResult(tipy_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
				tipy_izvewenijImpl.class, tipy_izvewenij.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tipy_izvewenij with the primary key. Does not add the tipy_izvewenij to the database.
	 *
	 * @param tipy_izvewenij_id the primary key for the new tipy_izvewenij
	 * @return the new tipy_izvewenij
	 */
	@Override
	public tipy_izvewenij create(long tipy_izvewenij_id) {
		tipy_izvewenij tipy_izvewenij = new tipy_izvewenijImpl();

		tipy_izvewenij.setNew(true);
		tipy_izvewenij.setPrimaryKey(tipy_izvewenij_id);

		return tipy_izvewenij;
	}

	/**
	 * Removes the tipy_izvewenij with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tipy_izvewenij_id the primary key of the tipy_izvewenij
	 * @return the tipy_izvewenij that was removed
	 * @throws NoSuchtipy_izvewenijException if a tipy_izvewenij with the primary key could not be found
	 */
	@Override
	public tipy_izvewenij remove(long tipy_izvewenij_id)
		throws NoSuchtipy_izvewenijException {
		return remove((Serializable)tipy_izvewenij_id);
	}

	/**
	 * Removes the tipy_izvewenij with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tipy_izvewenij
	 * @return the tipy_izvewenij that was removed
	 * @throws NoSuchtipy_izvewenijException if a tipy_izvewenij with the primary key could not be found
	 */
	@Override
	public tipy_izvewenij remove(Serializable primaryKey)
		throws NoSuchtipy_izvewenijException {
		Session session = null;

		try {
			session = openSession();

			tipy_izvewenij tipy_izvewenij = (tipy_izvewenij)session.get(tipy_izvewenijImpl.class,
					primaryKey);

			if (tipy_izvewenij == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchtipy_izvewenijException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tipy_izvewenij);
		}
		catch (NoSuchtipy_izvewenijException nsee) {
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
	protected tipy_izvewenij removeImpl(tipy_izvewenij tipy_izvewenij) {
		tipy_izvewenij = toUnwrappedModel(tipy_izvewenij);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tipy_izvewenij)) {
				tipy_izvewenij = (tipy_izvewenij)session.get(tipy_izvewenijImpl.class,
						tipy_izvewenij.getPrimaryKeyObj());
			}

			if (tipy_izvewenij != null) {
				session.delete(tipy_izvewenij);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tipy_izvewenij != null) {
			clearCache(tipy_izvewenij);
		}

		return tipy_izvewenij;
	}

	@Override
	public tipy_izvewenij updateImpl(tipy_izvewenij tipy_izvewenij) {
		tipy_izvewenij = toUnwrappedModel(tipy_izvewenij);

		boolean isNew = tipy_izvewenij.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tipy_izvewenij.isNew()) {
				session.save(tipy_izvewenij);

				tipy_izvewenij.setNew(false);
			}
			else {
				tipy_izvewenij = (tipy_izvewenij)session.merge(tipy_izvewenij);
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

		entityCache.putResult(tipy_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
			tipy_izvewenijImpl.class, tipy_izvewenij.getPrimaryKey(),
			tipy_izvewenij, false);

		tipy_izvewenij.resetOriginalValues();

		return tipy_izvewenij;
	}

	protected tipy_izvewenij toUnwrappedModel(tipy_izvewenij tipy_izvewenij) {
		if (tipy_izvewenij instanceof tipy_izvewenijImpl) {
			return tipy_izvewenij;
		}

		tipy_izvewenijImpl tipy_izvewenijImpl = new tipy_izvewenijImpl();

		tipy_izvewenijImpl.setNew(tipy_izvewenij.isNew());
		tipy_izvewenijImpl.setPrimaryKey(tipy_izvewenij.getPrimaryKey());

		tipy_izvewenijImpl.setTip(tipy_izvewenij.getTip());
		tipy_izvewenijImpl.setTipy_izvewenij_id(tipy_izvewenij.getTipy_izvewenij_id());

		return tipy_izvewenijImpl;
	}

	/**
	 * Returns the tipy_izvewenij with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tipy_izvewenij
	 * @return the tipy_izvewenij
	 * @throws NoSuchtipy_izvewenijException if a tipy_izvewenij with the primary key could not be found
	 */
	@Override
	public tipy_izvewenij findByPrimaryKey(Serializable primaryKey)
		throws NoSuchtipy_izvewenijException {
		tipy_izvewenij tipy_izvewenij = fetchByPrimaryKey(primaryKey);

		if (tipy_izvewenij == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchtipy_izvewenijException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tipy_izvewenij;
	}

	/**
	 * Returns the tipy_izvewenij with the primary key or throws a {@link NoSuchtipy_izvewenijException} if it could not be found.
	 *
	 * @param tipy_izvewenij_id the primary key of the tipy_izvewenij
	 * @return the tipy_izvewenij
	 * @throws NoSuchtipy_izvewenijException if a tipy_izvewenij with the primary key could not be found
	 */
	@Override
	public tipy_izvewenij findByPrimaryKey(long tipy_izvewenij_id)
		throws NoSuchtipy_izvewenijException {
		return findByPrimaryKey((Serializable)tipy_izvewenij_id);
	}

	/**
	 * Returns the tipy_izvewenij with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tipy_izvewenij
	 * @return the tipy_izvewenij, or <code>null</code> if a tipy_izvewenij with the primary key could not be found
	 */
	@Override
	public tipy_izvewenij fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(tipy_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
				tipy_izvewenijImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		tipy_izvewenij tipy_izvewenij = (tipy_izvewenij)serializable;

		if (tipy_izvewenij == null) {
			Session session = null;

			try {
				session = openSession();

				tipy_izvewenij = (tipy_izvewenij)session.get(tipy_izvewenijImpl.class,
						primaryKey);

				if (tipy_izvewenij != null) {
					cacheResult(tipy_izvewenij);
				}
				else {
					entityCache.putResult(tipy_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
						tipy_izvewenijImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(tipy_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
					tipy_izvewenijImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tipy_izvewenij;
	}

	/**
	 * Returns the tipy_izvewenij with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tipy_izvewenij_id the primary key of the tipy_izvewenij
	 * @return the tipy_izvewenij, or <code>null</code> if a tipy_izvewenij with the primary key could not be found
	 */
	@Override
	public tipy_izvewenij fetchByPrimaryKey(long tipy_izvewenij_id) {
		return fetchByPrimaryKey((Serializable)tipy_izvewenij_id);
	}

	@Override
	public Map<Serializable, tipy_izvewenij> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, tipy_izvewenij> map = new HashMap<Serializable, tipy_izvewenij>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			tipy_izvewenij tipy_izvewenij = fetchByPrimaryKey(primaryKey);

			if (tipy_izvewenij != null) {
				map.put(primaryKey, tipy_izvewenij);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(tipy_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
					tipy_izvewenijImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (tipy_izvewenij)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TIPY_IZVEWENIJ_WHERE_PKS_IN);

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

			for (tipy_izvewenij tipy_izvewenij : (List<tipy_izvewenij>)q.list()) {
				map.put(tipy_izvewenij.getPrimaryKeyObj(), tipy_izvewenij);

				cacheResult(tipy_izvewenij);

				uncachedPrimaryKeys.remove(tipy_izvewenij.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(tipy_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
					tipy_izvewenijImpl.class, primaryKey, nullModel);
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
	 * Returns all the tipy_izvewenijs.
	 *
	 * @return the tipy_izvewenijs
	 */
	@Override
	public List<tipy_izvewenij> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tipy_izvewenijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tipy_izvewenijs
	 * @param end the upper bound of the range of tipy_izvewenijs (not inclusive)
	 * @return the range of tipy_izvewenijs
	 */
	@Override
	public List<tipy_izvewenij> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tipy_izvewenijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tipy_izvewenijs
	 * @param end the upper bound of the range of tipy_izvewenijs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tipy_izvewenijs
	 */
	@Override
	public List<tipy_izvewenij> findAll(int start, int end,
		OrderByComparator<tipy_izvewenij> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tipy_izvewenijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tipy_izvewenijs
	 * @param end the upper bound of the range of tipy_izvewenijs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of tipy_izvewenijs
	 */
	@Override
	public List<tipy_izvewenij> findAll(int start, int end,
		OrderByComparator<tipy_izvewenij> orderByComparator,
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

		List<tipy_izvewenij> list = null;

		if (retrieveFromCache) {
			list = (List<tipy_izvewenij>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TIPY_IZVEWENIJ);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TIPY_IZVEWENIJ;

				if (pagination) {
					sql = sql.concat(tipy_izvewenijModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<tipy_izvewenij>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<tipy_izvewenij>)QueryUtil.list(q,
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
	 * Removes all the tipy_izvewenijs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (tipy_izvewenij tipy_izvewenij : findAll()) {
			remove(tipy_izvewenij);
		}
	}

	/**
	 * Returns the number of tipy_izvewenijs.
	 *
	 * @return the number of tipy_izvewenijs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TIPY_IZVEWENIJ);

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
		return tipy_izvewenijModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tipy_izvewenij persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(tipy_izvewenijImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_TIPY_IZVEWENIJ = "SELECT tipy_izvewenij FROM tipy_izvewenij tipy_izvewenij";
	private static final String _SQL_SELECT_TIPY_IZVEWENIJ_WHERE_PKS_IN = "SELECT tipy_izvewenij FROM tipy_izvewenij tipy_izvewenij WHERE tipy_izvewenij_id IN (";
	private static final String _SQL_COUNT_TIPY_IZVEWENIJ = "SELECT COUNT(tipy_izvewenij) FROM tipy_izvewenij tipy_izvewenij";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tipy_izvewenij.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No tipy_izvewenij exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(tipy_izvewenijPersistenceImpl.class);
}