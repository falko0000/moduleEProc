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

package tj.balans.postavwika.service.persistence.impl;

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

import tj.balans.postavwika.exception.NoSuchSalansPostavwikaException;
import tj.balans.postavwika.model.SalansPostavwika;
import tj.balans.postavwika.model.impl.SalansPostavwikaImpl;
import tj.balans.postavwika.model.impl.SalansPostavwikaModelImpl;
import tj.balans.postavwika.service.persistence.SalansPostavwikaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the salans postavwika service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SalansPostavwikaPersistence
 * @see tj.balans.postavwika.service.persistence.SalansPostavwikaUtil
 * @generated
 */
@ProviderType
public class SalansPostavwikaPersistenceImpl extends BasePersistenceImpl<SalansPostavwika>
	implements SalansPostavwikaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SalansPostavwikaUtil} to access the salans postavwika persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SalansPostavwikaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			SalansPostavwikaModelImpl.FINDER_CACHE_ENABLED,
			SalansPostavwikaImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			SalansPostavwikaModelImpl.FINDER_CACHE_ENABLED,
			SalansPostavwikaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			SalansPostavwikaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public SalansPostavwikaPersistenceImpl() {
		setModelClass(SalansPostavwika.class);
	}

	/**
	 * Caches the salans postavwika in the entity cache if it is enabled.
	 *
	 * @param salansPostavwika the salans postavwika
	 */
	@Override
	public void cacheResult(SalansPostavwika salansPostavwika) {
		entityCache.putResult(SalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			SalansPostavwikaImpl.class, salansPostavwika.getPrimaryKey(),
			salansPostavwika);

		salansPostavwika.resetOriginalValues();
	}

	/**
	 * Caches the salans postavwikas in the entity cache if it is enabled.
	 *
	 * @param salansPostavwikas the salans postavwikas
	 */
	@Override
	public void cacheResult(List<SalansPostavwika> salansPostavwikas) {
		for (SalansPostavwika salansPostavwika : salansPostavwikas) {
			if (entityCache.getResult(
						SalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
						SalansPostavwikaImpl.class,
						salansPostavwika.getPrimaryKey()) == null) {
				cacheResult(salansPostavwika);
			}
			else {
				salansPostavwika.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all salans postavwikas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SalansPostavwikaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the salans postavwika.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SalansPostavwika salansPostavwika) {
		entityCache.removeResult(SalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			SalansPostavwikaImpl.class, salansPostavwika.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SalansPostavwika> salansPostavwikas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SalansPostavwika salansPostavwika : salansPostavwikas) {
			entityCache.removeResult(SalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
				SalansPostavwikaImpl.class, salansPostavwika.getPrimaryKey());
		}
	}

	/**
	 * Creates a new salans postavwika with the primary key. Does not add the salans postavwika to the database.
	 *
	 * @param balans_postavwika_id the primary key for the new salans postavwika
	 * @return the new salans postavwika
	 */
	@Override
	public SalansPostavwika create(long balans_postavwika_id) {
		SalansPostavwika salansPostavwika = new SalansPostavwikaImpl();

		salansPostavwika.setNew(true);
		salansPostavwika.setPrimaryKey(balans_postavwika_id);

		return salansPostavwika;
	}

	/**
	 * Removes the salans postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param balans_postavwika_id the primary key of the salans postavwika
	 * @return the salans postavwika that was removed
	 * @throws NoSuchSalansPostavwikaException if a salans postavwika with the primary key could not be found
	 */
	@Override
	public SalansPostavwika remove(long balans_postavwika_id)
		throws NoSuchSalansPostavwikaException {
		return remove((Serializable)balans_postavwika_id);
	}

	/**
	 * Removes the salans postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the salans postavwika
	 * @return the salans postavwika that was removed
	 * @throws NoSuchSalansPostavwikaException if a salans postavwika with the primary key could not be found
	 */
	@Override
	public SalansPostavwika remove(Serializable primaryKey)
		throws NoSuchSalansPostavwikaException {
		Session session = null;

		try {
			session = openSession();

			SalansPostavwika salansPostavwika = (SalansPostavwika)session.get(SalansPostavwikaImpl.class,
					primaryKey);

			if (salansPostavwika == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSalansPostavwikaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(salansPostavwika);
		}
		catch (NoSuchSalansPostavwikaException nsee) {
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
	protected SalansPostavwika removeImpl(SalansPostavwika salansPostavwika) {
		salansPostavwika = toUnwrappedModel(salansPostavwika);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(salansPostavwika)) {
				salansPostavwika = (SalansPostavwika)session.get(SalansPostavwikaImpl.class,
						salansPostavwika.getPrimaryKeyObj());
			}

			if (salansPostavwika != null) {
				session.delete(salansPostavwika);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (salansPostavwika != null) {
			clearCache(salansPostavwika);
		}

		return salansPostavwika;
	}

	@Override
	public SalansPostavwika updateImpl(SalansPostavwika salansPostavwika) {
		salansPostavwika = toUnwrappedModel(salansPostavwika);

		boolean isNew = salansPostavwika.isNew();

		Session session = null;

		try {
			session = openSession();

			if (salansPostavwika.isNew()) {
				session.save(salansPostavwika);

				salansPostavwika.setNew(false);
			}
			else {
				salansPostavwika = (SalansPostavwika)session.merge(salansPostavwika);
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

		entityCache.putResult(SalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			SalansPostavwikaImpl.class, salansPostavwika.getPrimaryKey(),
			salansPostavwika, false);

		salansPostavwika.resetOriginalValues();

		return salansPostavwika;
	}

	protected SalansPostavwika toUnwrappedModel(
		SalansPostavwika salansPostavwika) {
		if (salansPostavwika instanceof SalansPostavwikaImpl) {
			return salansPostavwika;
		}

		SalansPostavwikaImpl salansPostavwikaImpl = new SalansPostavwikaImpl();

		salansPostavwikaImpl.setNew(salansPostavwika.isNew());
		salansPostavwikaImpl.setPrimaryKey(salansPostavwika.getPrimaryKey());

		salansPostavwikaImpl.setBalans_postavwika_id(salansPostavwika.getBalans_postavwika_id());
		salansPostavwikaImpl.setPostavwik_id(salansPostavwika.getPostavwik_id());
		salansPostavwikaImpl.setBalans(salansPostavwika.getBalans());

		return salansPostavwikaImpl;
	}

	/**
	 * Returns the salans postavwika with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the salans postavwika
	 * @return the salans postavwika
	 * @throws NoSuchSalansPostavwikaException if a salans postavwika with the primary key could not be found
	 */
	@Override
	public SalansPostavwika findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSalansPostavwikaException {
		SalansPostavwika salansPostavwika = fetchByPrimaryKey(primaryKey);

		if (salansPostavwika == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSalansPostavwikaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return salansPostavwika;
	}

	/**
	 * Returns the salans postavwika with the primary key or throws a {@link NoSuchSalansPostavwikaException} if it could not be found.
	 *
	 * @param balans_postavwika_id the primary key of the salans postavwika
	 * @return the salans postavwika
	 * @throws NoSuchSalansPostavwikaException if a salans postavwika with the primary key could not be found
	 */
	@Override
	public SalansPostavwika findByPrimaryKey(long balans_postavwika_id)
		throws NoSuchSalansPostavwikaException {
		return findByPrimaryKey((Serializable)balans_postavwika_id);
	}

	/**
	 * Returns the salans postavwika with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the salans postavwika
	 * @return the salans postavwika, or <code>null</code> if a salans postavwika with the primary key could not be found
	 */
	@Override
	public SalansPostavwika fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(SalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
				SalansPostavwikaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		SalansPostavwika salansPostavwika = (SalansPostavwika)serializable;

		if (salansPostavwika == null) {
			Session session = null;

			try {
				session = openSession();

				salansPostavwika = (SalansPostavwika)session.get(SalansPostavwikaImpl.class,
						primaryKey);

				if (salansPostavwika != null) {
					cacheResult(salansPostavwika);
				}
				else {
					entityCache.putResult(SalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
						SalansPostavwikaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(SalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
					SalansPostavwikaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return salansPostavwika;
	}

	/**
	 * Returns the salans postavwika with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param balans_postavwika_id the primary key of the salans postavwika
	 * @return the salans postavwika, or <code>null</code> if a salans postavwika with the primary key could not be found
	 */
	@Override
	public SalansPostavwika fetchByPrimaryKey(long balans_postavwika_id) {
		return fetchByPrimaryKey((Serializable)balans_postavwika_id);
	}

	@Override
	public Map<Serializable, SalansPostavwika> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, SalansPostavwika> map = new HashMap<Serializable, SalansPostavwika>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			SalansPostavwika salansPostavwika = fetchByPrimaryKey(primaryKey);

			if (salansPostavwika != null) {
				map.put(primaryKey, salansPostavwika);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(SalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
					SalansPostavwikaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (SalansPostavwika)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SALANSPOSTAVWIKA_WHERE_PKS_IN);

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

			for (SalansPostavwika salansPostavwika : (List<SalansPostavwika>)q.list()) {
				map.put(salansPostavwika.getPrimaryKeyObj(), salansPostavwika);

				cacheResult(salansPostavwika);

				uncachedPrimaryKeys.remove(salansPostavwika.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(SalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
					SalansPostavwikaImpl.class, primaryKey, nullModel);
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
	 * Returns all the salans postavwikas.
	 *
	 * @return the salans postavwikas
	 */
	@Override
	public List<SalansPostavwika> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the salans postavwikas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of salans postavwikas
	 * @param end the upper bound of the range of salans postavwikas (not inclusive)
	 * @return the range of salans postavwikas
	 */
	@Override
	public List<SalansPostavwika> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the salans postavwikas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of salans postavwikas
	 * @param end the upper bound of the range of salans postavwikas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of salans postavwikas
	 */
	@Override
	public List<SalansPostavwika> findAll(int start, int end,
		OrderByComparator<SalansPostavwika> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the salans postavwikas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of salans postavwikas
	 * @param end the upper bound of the range of salans postavwikas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of salans postavwikas
	 */
	@Override
	public List<SalansPostavwika> findAll(int start, int end,
		OrderByComparator<SalansPostavwika> orderByComparator,
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

		List<SalansPostavwika> list = null;

		if (retrieveFromCache) {
			list = (List<SalansPostavwika>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SALANSPOSTAVWIKA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SALANSPOSTAVWIKA;

				if (pagination) {
					sql = sql.concat(SalansPostavwikaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SalansPostavwika>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SalansPostavwika>)QueryUtil.list(q,
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
	 * Removes all the salans postavwikas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SalansPostavwika salansPostavwika : findAll()) {
			remove(salansPostavwika);
		}
	}

	/**
	 * Returns the number of salans postavwikas.
	 *
	 * @return the number of salans postavwikas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SALANSPOSTAVWIKA);

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
		return SalansPostavwikaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the salans postavwika persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(SalansPostavwikaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SALANSPOSTAVWIKA = "SELECT salansPostavwika FROM SalansPostavwika salansPostavwika";
	private static final String _SQL_SELECT_SALANSPOSTAVWIKA_WHERE_PKS_IN = "SELECT salansPostavwika FROM SalansPostavwika salansPostavwika WHERE balans_postavwika_id IN (";
	private static final String _SQL_COUNT_SALANSPOSTAVWIKA = "SELECT COUNT(salansPostavwika) FROM SalansPostavwika salansPostavwika";
	private static final String _ORDER_BY_ENTITY_ALIAS = "salansPostavwika.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SalansPostavwika exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(SalansPostavwikaPersistenceImpl.class);
}