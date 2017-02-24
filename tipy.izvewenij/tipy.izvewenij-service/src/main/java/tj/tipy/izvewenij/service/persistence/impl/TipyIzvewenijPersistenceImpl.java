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

import tj.tipy.izvewenij.exception.NoSuchTipyIzvewenijException;
import tj.tipy.izvewenij.model.TipyIzvewenij;
import tj.tipy.izvewenij.model.impl.TipyIzvewenijImpl;
import tj.tipy.izvewenij.model.impl.TipyIzvewenijModelImpl;
import tj.tipy.izvewenij.service.persistence.TipyIzvewenijPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the tipy izvewenij service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TipyIzvewenijPersistence
 * @see tj.tipy.izvewenij.service.persistence.TipyIzvewenijUtil
 * @generated
 */
@ProviderType
public class TipyIzvewenijPersistenceImpl extends BasePersistenceImpl<TipyIzvewenij>
	implements TipyIzvewenijPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TipyIzvewenijUtil} to access the tipy izvewenij persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TipyIzvewenijImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TipyIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
			TipyIzvewenijModelImpl.FINDER_CACHE_ENABLED,
			TipyIzvewenijImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TipyIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
			TipyIzvewenijModelImpl.FINDER_CACHE_ENABLED,
			TipyIzvewenijImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TipyIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
			TipyIzvewenijModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TipyIzvewenijPersistenceImpl() {
		setModelClass(TipyIzvewenij.class);
	}

	/**
	 * Caches the tipy izvewenij in the entity cache if it is enabled.
	 *
	 * @param tipyIzvewenij the tipy izvewenij
	 */
	@Override
	public void cacheResult(TipyIzvewenij tipyIzvewenij) {
		entityCache.putResult(TipyIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
			TipyIzvewenijImpl.class, tipyIzvewenij.getPrimaryKey(),
			tipyIzvewenij);

		tipyIzvewenij.resetOriginalValues();
	}

	/**
	 * Caches the tipy izvewenijs in the entity cache if it is enabled.
	 *
	 * @param tipyIzvewenijs the tipy izvewenijs
	 */
	@Override
	public void cacheResult(List<TipyIzvewenij> tipyIzvewenijs) {
		for (TipyIzvewenij tipyIzvewenij : tipyIzvewenijs) {
			if (entityCache.getResult(
						TipyIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
						TipyIzvewenijImpl.class, tipyIzvewenij.getPrimaryKey()) == null) {
				cacheResult(tipyIzvewenij);
			}
			else {
				tipyIzvewenij.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tipy izvewenijs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TipyIzvewenijImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tipy izvewenij.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TipyIzvewenij tipyIzvewenij) {
		entityCache.removeResult(TipyIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
			TipyIzvewenijImpl.class, tipyIzvewenij.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TipyIzvewenij> tipyIzvewenijs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TipyIzvewenij tipyIzvewenij : tipyIzvewenijs) {
			entityCache.removeResult(TipyIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
				TipyIzvewenijImpl.class, tipyIzvewenij.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tipy izvewenij with the primary key. Does not add the tipy izvewenij to the database.
	 *
	 * @param tipy_izvewenij_id the primary key for the new tipy izvewenij
	 * @return the new tipy izvewenij
	 */
	@Override
	public TipyIzvewenij create(long tipy_izvewenij_id) {
		TipyIzvewenij tipyIzvewenij = new TipyIzvewenijImpl();

		tipyIzvewenij.setNew(true);
		tipyIzvewenij.setPrimaryKey(tipy_izvewenij_id);

		return tipyIzvewenij;
	}

	/**
	 * Removes the tipy izvewenij with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tipy_izvewenij_id the primary key of the tipy izvewenij
	 * @return the tipy izvewenij that was removed
	 * @throws NoSuchTipyIzvewenijException if a tipy izvewenij with the primary key could not be found
	 */
	@Override
	public TipyIzvewenij remove(long tipy_izvewenij_id)
		throws NoSuchTipyIzvewenijException {
		return remove((Serializable)tipy_izvewenij_id);
	}

	/**
	 * Removes the tipy izvewenij with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tipy izvewenij
	 * @return the tipy izvewenij that was removed
	 * @throws NoSuchTipyIzvewenijException if a tipy izvewenij with the primary key could not be found
	 */
	@Override
	public TipyIzvewenij remove(Serializable primaryKey)
		throws NoSuchTipyIzvewenijException {
		Session session = null;

		try {
			session = openSession();

			TipyIzvewenij tipyIzvewenij = (TipyIzvewenij)session.get(TipyIzvewenijImpl.class,
					primaryKey);

			if (tipyIzvewenij == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTipyIzvewenijException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tipyIzvewenij);
		}
		catch (NoSuchTipyIzvewenijException nsee) {
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
	protected TipyIzvewenij removeImpl(TipyIzvewenij tipyIzvewenij) {
		tipyIzvewenij = toUnwrappedModel(tipyIzvewenij);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tipyIzvewenij)) {
				tipyIzvewenij = (TipyIzvewenij)session.get(TipyIzvewenijImpl.class,
						tipyIzvewenij.getPrimaryKeyObj());
			}

			if (tipyIzvewenij != null) {
				session.delete(tipyIzvewenij);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tipyIzvewenij != null) {
			clearCache(tipyIzvewenij);
		}

		return tipyIzvewenij;
	}

	@Override
	public TipyIzvewenij updateImpl(TipyIzvewenij tipyIzvewenij) {
		tipyIzvewenij = toUnwrappedModel(tipyIzvewenij);

		boolean isNew = tipyIzvewenij.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tipyIzvewenij.isNew()) {
				session.save(tipyIzvewenij);

				tipyIzvewenij.setNew(false);
			}
			else {
				tipyIzvewenij = (TipyIzvewenij)session.merge(tipyIzvewenij);
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

		entityCache.putResult(TipyIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
			TipyIzvewenijImpl.class, tipyIzvewenij.getPrimaryKey(),
			tipyIzvewenij, false);

		tipyIzvewenij.resetOriginalValues();

		return tipyIzvewenij;
	}

	protected TipyIzvewenij toUnwrappedModel(TipyIzvewenij tipyIzvewenij) {
		if (tipyIzvewenij instanceof TipyIzvewenijImpl) {
			return tipyIzvewenij;
		}

		TipyIzvewenijImpl tipyIzvewenijImpl = new TipyIzvewenijImpl();

		tipyIzvewenijImpl.setNew(tipyIzvewenij.isNew());
		tipyIzvewenijImpl.setPrimaryKey(tipyIzvewenij.getPrimaryKey());

		tipyIzvewenijImpl.setTip(tipyIzvewenij.getTip());
		tipyIzvewenijImpl.setTipy_izvewenij_id(tipyIzvewenij.getTipy_izvewenij_id());

		return tipyIzvewenijImpl;
	}

	/**
	 * Returns the tipy izvewenij with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tipy izvewenij
	 * @return the tipy izvewenij
	 * @throws NoSuchTipyIzvewenijException if a tipy izvewenij with the primary key could not be found
	 */
	@Override
	public TipyIzvewenij findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTipyIzvewenijException {
		TipyIzvewenij tipyIzvewenij = fetchByPrimaryKey(primaryKey);

		if (tipyIzvewenij == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTipyIzvewenijException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tipyIzvewenij;
	}

	/**
	 * Returns the tipy izvewenij with the primary key or throws a {@link NoSuchTipyIzvewenijException} if it could not be found.
	 *
	 * @param tipy_izvewenij_id the primary key of the tipy izvewenij
	 * @return the tipy izvewenij
	 * @throws NoSuchTipyIzvewenijException if a tipy izvewenij with the primary key could not be found
	 */
	@Override
	public TipyIzvewenij findByPrimaryKey(long tipy_izvewenij_id)
		throws NoSuchTipyIzvewenijException {
		return findByPrimaryKey((Serializable)tipy_izvewenij_id);
	}

	/**
	 * Returns the tipy izvewenij with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tipy izvewenij
	 * @return the tipy izvewenij, or <code>null</code> if a tipy izvewenij with the primary key could not be found
	 */
	@Override
	public TipyIzvewenij fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(TipyIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
				TipyIzvewenijImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		TipyIzvewenij tipyIzvewenij = (TipyIzvewenij)serializable;

		if (tipyIzvewenij == null) {
			Session session = null;

			try {
				session = openSession();

				tipyIzvewenij = (TipyIzvewenij)session.get(TipyIzvewenijImpl.class,
						primaryKey);

				if (tipyIzvewenij != null) {
					cacheResult(tipyIzvewenij);
				}
				else {
					entityCache.putResult(TipyIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
						TipyIzvewenijImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(TipyIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
					TipyIzvewenijImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tipyIzvewenij;
	}

	/**
	 * Returns the tipy izvewenij with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tipy_izvewenij_id the primary key of the tipy izvewenij
	 * @return the tipy izvewenij, or <code>null</code> if a tipy izvewenij with the primary key could not be found
	 */
	@Override
	public TipyIzvewenij fetchByPrimaryKey(long tipy_izvewenij_id) {
		return fetchByPrimaryKey((Serializable)tipy_izvewenij_id);
	}

	@Override
	public Map<Serializable, TipyIzvewenij> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, TipyIzvewenij> map = new HashMap<Serializable, TipyIzvewenij>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			TipyIzvewenij tipyIzvewenij = fetchByPrimaryKey(primaryKey);

			if (tipyIzvewenij != null) {
				map.put(primaryKey, tipyIzvewenij);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(TipyIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
					TipyIzvewenijImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (TipyIzvewenij)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TIPYIZVEWENIJ_WHERE_PKS_IN);

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

			for (TipyIzvewenij tipyIzvewenij : (List<TipyIzvewenij>)q.list()) {
				map.put(tipyIzvewenij.getPrimaryKeyObj(), tipyIzvewenij);

				cacheResult(tipyIzvewenij);

				uncachedPrimaryKeys.remove(tipyIzvewenij.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(TipyIzvewenijModelImpl.ENTITY_CACHE_ENABLED,
					TipyIzvewenijImpl.class, primaryKey, nullModel);
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
	 * Returns all the tipy izvewenijs.
	 *
	 * @return the tipy izvewenijs
	 */
	@Override
	public List<TipyIzvewenij> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tipy izvewenijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipyIzvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tipy izvewenijs
	 * @param end the upper bound of the range of tipy izvewenijs (not inclusive)
	 * @return the range of tipy izvewenijs
	 */
	@Override
	public List<TipyIzvewenij> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tipy izvewenijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipyIzvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tipy izvewenijs
	 * @param end the upper bound of the range of tipy izvewenijs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tipy izvewenijs
	 */
	@Override
	public List<TipyIzvewenij> findAll(int start, int end,
		OrderByComparator<TipyIzvewenij> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tipy izvewenijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipyIzvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tipy izvewenijs
	 * @param end the upper bound of the range of tipy izvewenijs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of tipy izvewenijs
	 */
	@Override
	public List<TipyIzvewenij> findAll(int start, int end,
		OrderByComparator<TipyIzvewenij> orderByComparator,
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

		List<TipyIzvewenij> list = null;

		if (retrieveFromCache) {
			list = (List<TipyIzvewenij>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TIPYIZVEWENIJ);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TIPYIZVEWENIJ;

				if (pagination) {
					sql = sql.concat(TipyIzvewenijModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TipyIzvewenij>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TipyIzvewenij>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the tipy izvewenijs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TipyIzvewenij tipyIzvewenij : findAll()) {
			remove(tipyIzvewenij);
		}
	}

	/**
	 * Returns the number of tipy izvewenijs.
	 *
	 * @return the number of tipy izvewenijs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TIPYIZVEWENIJ);

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
		return TipyIzvewenijModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tipy izvewenij persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(TipyIzvewenijImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_TIPYIZVEWENIJ = "SELECT tipyIzvewenij FROM TipyIzvewenij tipyIzvewenij";
	private static final String _SQL_SELECT_TIPYIZVEWENIJ_WHERE_PKS_IN = "SELECT tipyIzvewenij FROM TipyIzvewenij tipyIzvewenij WHERE tipy_izvewenij_id IN (";
	private static final String _SQL_COUNT_TIPYIZVEWENIJ = "SELECT COUNT(tipyIzvewenij) FROM TipyIzvewenij tipyIzvewenij";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tipyIzvewenij.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TipyIzvewenij exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(TipyIzvewenijPersistenceImpl.class);
}