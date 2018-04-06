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

package tj.polzovateli.service.persistence.impl;

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

import tj.polzovateli.exception.NoSuchPolzovateliException;

import tj.polzovateli.model.Polzovateli;
import tj.polzovateli.model.impl.PolzovateliImpl;
import tj.polzovateli.model.impl.PolzovateliModelImpl;

import tj.polzovateli.service.persistence.PolzovateliPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the polzovateli service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PolzovateliPersistence
 * @see tj.polzovateli.service.persistence.PolzovateliUtil
 * @generated
 */
@ProviderType
public class PolzovateliPersistenceImpl extends BasePersistenceImpl<Polzovateli>
	implements PolzovateliPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PolzovateliUtil} to access the polzovateli persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PolzovateliImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PolzovateliModelImpl.ENTITY_CACHE_ENABLED,
			PolzovateliModelImpl.FINDER_CACHE_ENABLED, PolzovateliImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PolzovateliModelImpl.ENTITY_CACHE_ENABLED,
			PolzovateliModelImpl.FINDER_CACHE_ENABLED, PolzovateliImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PolzovateliModelImpl.ENTITY_CACHE_ENABLED,
			PolzovateliModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PolzovateliPersistenceImpl() {
		setModelClass(Polzovateli.class);
	}

	/**
	 * Caches the polzovateli in the entity cache if it is enabled.
	 *
	 * @param polzovateli the polzovateli
	 */
	@Override
	public void cacheResult(Polzovateli polzovateli) {
		entityCache.putResult(PolzovateliModelImpl.ENTITY_CACHE_ENABLED,
			PolzovateliImpl.class, polzovateli.getPrimaryKey(), polzovateli);

		polzovateli.resetOriginalValues();
	}

	/**
	 * Caches the polzovatelis in the entity cache if it is enabled.
	 *
	 * @param polzovatelis the polzovatelis
	 */
	@Override
	public void cacheResult(List<Polzovateli> polzovatelis) {
		for (Polzovateli polzovateli : polzovatelis) {
			if (entityCache.getResult(
						PolzovateliModelImpl.ENTITY_CACHE_ENABLED,
						PolzovateliImpl.class, polzovateli.getPrimaryKey()) == null) {
				cacheResult(polzovateli);
			}
			else {
				polzovateli.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all polzovatelis.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PolzovateliImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the polzovateli.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Polzovateli polzovateli) {
		entityCache.removeResult(PolzovateliModelImpl.ENTITY_CACHE_ENABLED,
			PolzovateliImpl.class, polzovateli.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Polzovateli> polzovatelis) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Polzovateli polzovateli : polzovatelis) {
			entityCache.removeResult(PolzovateliModelImpl.ENTITY_CACHE_ENABLED,
				PolzovateliImpl.class, polzovateli.getPrimaryKey());
		}
	}

	/**
	 * Creates a new polzovateli with the primary key. Does not add the polzovateli to the database.
	 *
	 * @param polzovateli_id the primary key for the new polzovateli
	 * @return the new polzovateli
	 */
	@Override
	public Polzovateli create(long polzovateli_id) {
		Polzovateli polzovateli = new PolzovateliImpl();

		polzovateli.setNew(true);
		polzovateli.setPrimaryKey(polzovateli_id);

		return polzovateli;
	}

	/**
	 * Removes the polzovateli with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param polzovateli_id the primary key of the polzovateli
	 * @return the polzovateli that was removed
	 * @throws NoSuchPolzovateliException if a polzovateli with the primary key could not be found
	 */
	@Override
	public Polzovateli remove(long polzovateli_id)
		throws NoSuchPolzovateliException {
		return remove((Serializable)polzovateli_id);
	}

	/**
	 * Removes the polzovateli with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the polzovateli
	 * @return the polzovateli that was removed
	 * @throws NoSuchPolzovateliException if a polzovateli with the primary key could not be found
	 */
	@Override
	public Polzovateli remove(Serializable primaryKey)
		throws NoSuchPolzovateliException {
		Session session = null;

		try {
			session = openSession();

			Polzovateli polzovateli = (Polzovateli)session.get(PolzovateliImpl.class,
					primaryKey);

			if (polzovateli == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPolzovateliException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(polzovateli);
		}
		catch (NoSuchPolzovateliException nsee) {
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
	protected Polzovateli removeImpl(Polzovateli polzovateli) {
		polzovateli = toUnwrappedModel(polzovateli);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(polzovateli)) {
				polzovateli = (Polzovateli)session.get(PolzovateliImpl.class,
						polzovateli.getPrimaryKeyObj());
			}

			if (polzovateli != null) {
				session.delete(polzovateli);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (polzovateli != null) {
			clearCache(polzovateli);
		}

		return polzovateli;
	}

	@Override
	public Polzovateli updateImpl(Polzovateli polzovateli) {
		polzovateli = toUnwrappedModel(polzovateli);

		boolean isNew = polzovateli.isNew();

		Session session = null;

		try {
			session = openSession();

			if (polzovateli.isNew()) {
				session.save(polzovateli);

				polzovateli.setNew(false);
			}
			else {
				polzovateli = (Polzovateli)session.merge(polzovateli);
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

		entityCache.putResult(PolzovateliModelImpl.ENTITY_CACHE_ENABLED,
			PolzovateliImpl.class, polzovateli.getPrimaryKey(), polzovateli,
			false);

		polzovateli.resetOriginalValues();

		return polzovateli;
	}

	protected Polzovateli toUnwrappedModel(Polzovateli polzovateli) {
		if (polzovateli instanceof PolzovateliImpl) {
			return polzovateli;
		}

		PolzovateliImpl polzovateliImpl = new PolzovateliImpl();

		polzovateliImpl.setNew(polzovateli.isNew());
		polzovateliImpl.setPrimaryKey(polzovateli.getPrimaryKey());

		polzovateliImpl.setPolzovateli_id(polzovateli.getPolzovateli_id());
		polzovateliImpl.setOrganizacija_id(polzovateli.getOrganizacija_id());
		polzovateliImpl.setTip_organizacii_id(polzovateli.getTip_organizacii_id());
		polzovateliImpl.setRol_id(polzovateli.getRol_id());
		polzovateliImpl.setImja_polzovatelja(polzovateli.getImja_polzovatelja());
		polzovateliImpl.setParol(polzovateli.getParol());
		polzovateliImpl.setAktivnost(polzovateli.getAktivnost());
		polzovateliImpl.setSozdal(polzovateli.getSozdal());
		polzovateliImpl.setIzmenil(polzovateli.getIzmenil());
		polzovateliImpl.setData_sozdanija(polzovateli.getData_sozdanija());
		polzovateliImpl.setData_izmenenija(polzovateli.getData_izmenenija());
		polzovateliImpl.setPodrazdelenije_id(polzovateli.getPodrazdelenije_id());

		return polzovateliImpl;
	}

	/**
	 * Returns the polzovateli with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the polzovateli
	 * @return the polzovateli
	 * @throws NoSuchPolzovateliException if a polzovateli with the primary key could not be found
	 */
	@Override
	public Polzovateli findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPolzovateliException {
		Polzovateli polzovateli = fetchByPrimaryKey(primaryKey);

		if (polzovateli == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPolzovateliException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return polzovateli;
	}

	/**
	 * Returns the polzovateli with the primary key or throws a {@link NoSuchPolzovateliException} if it could not be found.
	 *
	 * @param polzovateli_id the primary key of the polzovateli
	 * @return the polzovateli
	 * @throws NoSuchPolzovateliException if a polzovateli with the primary key could not be found
	 */
	@Override
	public Polzovateli findByPrimaryKey(long polzovateli_id)
		throws NoSuchPolzovateliException {
		return findByPrimaryKey((Serializable)polzovateli_id);
	}

	/**
	 * Returns the polzovateli with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the polzovateli
	 * @return the polzovateli, or <code>null</code> if a polzovateli with the primary key could not be found
	 */
	@Override
	public Polzovateli fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(PolzovateliModelImpl.ENTITY_CACHE_ENABLED,
				PolzovateliImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Polzovateli polzovateli = (Polzovateli)serializable;

		if (polzovateli == null) {
			Session session = null;

			try {
				session = openSession();

				polzovateli = (Polzovateli)session.get(PolzovateliImpl.class,
						primaryKey);

				if (polzovateli != null) {
					cacheResult(polzovateli);
				}
				else {
					entityCache.putResult(PolzovateliModelImpl.ENTITY_CACHE_ENABLED,
						PolzovateliImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(PolzovateliModelImpl.ENTITY_CACHE_ENABLED,
					PolzovateliImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return polzovateli;
	}

	/**
	 * Returns the polzovateli with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param polzovateli_id the primary key of the polzovateli
	 * @return the polzovateli, or <code>null</code> if a polzovateli with the primary key could not be found
	 */
	@Override
	public Polzovateli fetchByPrimaryKey(long polzovateli_id) {
		return fetchByPrimaryKey((Serializable)polzovateli_id);
	}

	@Override
	public Map<Serializable, Polzovateli> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Polzovateli> map = new HashMap<Serializable, Polzovateli>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Polzovateli polzovateli = fetchByPrimaryKey(primaryKey);

			if (polzovateli != null) {
				map.put(primaryKey, polzovateli);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(PolzovateliModelImpl.ENTITY_CACHE_ENABLED,
					PolzovateliImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Polzovateli)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_POLZOVATELI_WHERE_PKS_IN);

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

			for (Polzovateli polzovateli : (List<Polzovateli>)q.list()) {
				map.put(polzovateli.getPrimaryKeyObj(), polzovateli);

				cacheResult(polzovateli);

				uncachedPrimaryKeys.remove(polzovateli.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(PolzovateliModelImpl.ENTITY_CACHE_ENABLED,
					PolzovateliImpl.class, primaryKey, nullModel);
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
	 * Returns all the polzovatelis.
	 *
	 * @return the polzovatelis
	 */
	@Override
	public List<Polzovateli> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the polzovatelis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PolzovateliModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of polzovatelis
	 * @param end the upper bound of the range of polzovatelis (not inclusive)
	 * @return the range of polzovatelis
	 */
	@Override
	public List<Polzovateli> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the polzovatelis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PolzovateliModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of polzovatelis
	 * @param end the upper bound of the range of polzovatelis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of polzovatelis
	 */
	@Override
	public List<Polzovateli> findAll(int start, int end,
		OrderByComparator<Polzovateli> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the polzovatelis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PolzovateliModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of polzovatelis
	 * @param end the upper bound of the range of polzovatelis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of polzovatelis
	 */
	@Override
	public List<Polzovateli> findAll(int start, int end,
		OrderByComparator<Polzovateli> orderByComparator,
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

		List<Polzovateli> list = null;

		if (retrieveFromCache) {
			list = (List<Polzovateli>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_POLZOVATELI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_POLZOVATELI;

				if (pagination) {
					sql = sql.concat(PolzovateliModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Polzovateli>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Polzovateli>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the polzovatelis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Polzovateli polzovateli : findAll()) {
			remove(polzovateli);
		}
	}

	/**
	 * Returns the number of polzovatelis.
	 *
	 * @return the number of polzovatelis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_POLZOVATELI);

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
		return PolzovateliModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the polzovateli persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(PolzovateliImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_POLZOVATELI = "SELECT polzovateli FROM Polzovateli polzovateli";
	private static final String _SQL_SELECT_POLZOVATELI_WHERE_PKS_IN = "SELECT polzovateli FROM Polzovateli polzovateli WHERE polzovateli_id IN (";
	private static final String _SQL_COUNT_POLZOVATELI = "SELECT COUNT(polzovateli) FROM Polzovateli polzovateli";
	private static final String _ORDER_BY_ENTITY_ALIAS = "polzovateli.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Polzovateli exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(PolzovateliPersistenceImpl.class);
}