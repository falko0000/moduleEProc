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

package tj.profil.polzovatelej.service.persistence.impl;

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

import tj.profil.polzovatelej.exception.NoSuchprofil_polzovatelejException;
import tj.profil.polzovatelej.model.impl.profil_polzovatelejImpl;
import tj.profil.polzovatelej.model.impl.profil_polzovatelejModelImpl;
import tj.profil.polzovatelej.model.profil_polzovatelej;
import tj.profil.polzovatelej.service.persistence.profil_polzovatelejPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the profil_polzovatelej service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see profil_polzovatelejPersistence
 * @see tj.profil.polzovatelej.service.persistence.profil_polzovatelejUtil
 * @generated
 */
@ProviderType
public class profil_polzovatelejPersistenceImpl extends BasePersistenceImpl<profil_polzovatelej>
	implements profil_polzovatelejPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link profil_polzovatelejUtil} to access the profil_polzovatelej persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = profil_polzovatelejImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(profil_polzovatelejModelImpl.ENTITY_CACHE_ENABLED,
			profil_polzovatelejModelImpl.FINDER_CACHE_ENABLED,
			profil_polzovatelejImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(profil_polzovatelejModelImpl.ENTITY_CACHE_ENABLED,
			profil_polzovatelejModelImpl.FINDER_CACHE_ENABLED,
			profil_polzovatelejImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(profil_polzovatelejModelImpl.ENTITY_CACHE_ENABLED,
			profil_polzovatelejModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public profil_polzovatelejPersistenceImpl() {
		setModelClass(profil_polzovatelej.class);
	}

	/**
	 * Caches the profil_polzovatelej in the entity cache if it is enabled.
	 *
	 * @param profil_polzovatelej the profil_polzovatelej
	 */
	@Override
	public void cacheResult(profil_polzovatelej profil_polzovatelej) {
		entityCache.putResult(profil_polzovatelejModelImpl.ENTITY_CACHE_ENABLED,
			profil_polzovatelejImpl.class, profil_polzovatelej.getPrimaryKey(),
			profil_polzovatelej);

		profil_polzovatelej.resetOriginalValues();
	}

	/**
	 * Caches the profil_polzovatelejs in the entity cache if it is enabled.
	 *
	 * @param profil_polzovatelejs the profil_polzovatelejs
	 */
	@Override
	public void cacheResult(List<profil_polzovatelej> profil_polzovatelejs) {
		for (profil_polzovatelej profil_polzovatelej : profil_polzovatelejs) {
			if (entityCache.getResult(
						profil_polzovatelejModelImpl.ENTITY_CACHE_ENABLED,
						profil_polzovatelejImpl.class,
						profil_polzovatelej.getPrimaryKey()) == null) {
				cacheResult(profil_polzovatelej);
			}
			else {
				profil_polzovatelej.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all profil_polzovatelejs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(profil_polzovatelejImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the profil_polzovatelej.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(profil_polzovatelej profil_polzovatelej) {
		entityCache.removeResult(profil_polzovatelejModelImpl.ENTITY_CACHE_ENABLED,
			profil_polzovatelejImpl.class, profil_polzovatelej.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<profil_polzovatelej> profil_polzovatelejs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (profil_polzovatelej profil_polzovatelej : profil_polzovatelejs) {
			entityCache.removeResult(profil_polzovatelejModelImpl.ENTITY_CACHE_ENABLED,
				profil_polzovatelejImpl.class,
				profil_polzovatelej.getPrimaryKey());
		}
	}

	/**
	 * Creates a new profil_polzovatelej with the primary key. Does not add the profil_polzovatelej to the database.
	 *
	 * @param profil_polzovatelej_id the primary key for the new profil_polzovatelej
	 * @return the new profil_polzovatelej
	 */
	@Override
	public profil_polzovatelej create(long profil_polzovatelej_id) {
		profil_polzovatelej profil_polzovatelej = new profil_polzovatelejImpl();

		profil_polzovatelej.setNew(true);
		profil_polzovatelej.setPrimaryKey(profil_polzovatelej_id);

		return profil_polzovatelej;
	}

	/**
	 * Removes the profil_polzovatelej with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param profil_polzovatelej_id the primary key of the profil_polzovatelej
	 * @return the profil_polzovatelej that was removed
	 * @throws NoSuchprofil_polzovatelejException if a profil_polzovatelej with the primary key could not be found
	 */
	@Override
	public profil_polzovatelej remove(long profil_polzovatelej_id)
		throws NoSuchprofil_polzovatelejException {
		return remove((Serializable)profil_polzovatelej_id);
	}

	/**
	 * Removes the profil_polzovatelej with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the profil_polzovatelej
	 * @return the profil_polzovatelej that was removed
	 * @throws NoSuchprofil_polzovatelejException if a profil_polzovatelej with the primary key could not be found
	 */
	@Override
	public profil_polzovatelej remove(Serializable primaryKey)
		throws NoSuchprofil_polzovatelejException {
		Session session = null;

		try {
			session = openSession();

			profil_polzovatelej profil_polzovatelej = (profil_polzovatelej)session.get(profil_polzovatelejImpl.class,
					primaryKey);

			if (profil_polzovatelej == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchprofil_polzovatelejException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(profil_polzovatelej);
		}
		catch (NoSuchprofil_polzovatelejException nsee) {
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
	protected profil_polzovatelej removeImpl(
		profil_polzovatelej profil_polzovatelej) {
		profil_polzovatelej = toUnwrappedModel(profil_polzovatelej);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(profil_polzovatelej)) {
				profil_polzovatelej = (profil_polzovatelej)session.get(profil_polzovatelejImpl.class,
						profil_polzovatelej.getPrimaryKeyObj());
			}

			if (profil_polzovatelej != null) {
				session.delete(profil_polzovatelej);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (profil_polzovatelej != null) {
			clearCache(profil_polzovatelej);
		}

		return profil_polzovatelej;
	}

	@Override
	public profil_polzovatelej updateImpl(
		profil_polzovatelej profil_polzovatelej) {
		profil_polzovatelej = toUnwrappedModel(profil_polzovatelej);

		boolean isNew = profil_polzovatelej.isNew();

		Session session = null;

		try {
			session = openSession();

			if (profil_polzovatelej.isNew()) {
				session.save(profil_polzovatelej);

				profil_polzovatelej.setNew(false);
			}
			else {
				profil_polzovatelej = (profil_polzovatelej)session.merge(profil_polzovatelej);
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

		entityCache.putResult(profil_polzovatelejModelImpl.ENTITY_CACHE_ENABLED,
			profil_polzovatelejImpl.class, profil_polzovatelej.getPrimaryKey(),
			profil_polzovatelej, false);

		profil_polzovatelej.resetOriginalValues();

		return profil_polzovatelej;
	}

	protected profil_polzovatelej toUnwrappedModel(
		profil_polzovatelej profil_polzovatelej) {
		if (profil_polzovatelej instanceof profil_polzovatelejImpl) {
			return profil_polzovatelej;
		}

		profil_polzovatelejImpl profil_polzovatelejImpl = new profil_polzovatelejImpl();

		profil_polzovatelejImpl.setNew(profil_polzovatelej.isNew());
		profil_polzovatelejImpl.setPrimaryKey(profil_polzovatelej.getPrimaryKey());

		profil_polzovatelejImpl.setProfil_polzovatelej_id(profil_polzovatelej.getProfil_polzovatelej_id());
		profil_polzovatelejImpl.setPolzovatel_id(profil_polzovatelej.getPolzovatel_id());
		profil_polzovatelejImpl.setInicialy(profil_polzovatelej.getInicialy());
		profil_polzovatelejImpl.setKontaktnyj_telefon(profil_polzovatelej.getKontaktnyj_telefon());
		profil_polzovatelejImpl.setJe_pochta(profil_polzovatelej.getJe_pochta());
		profil_polzovatelejImpl.setSozdal(profil_polzovatelej.getSozdal());
		profil_polzovatelejImpl.setIzmenil(profil_polzovatelej.getIzmenil());
		profil_polzovatelejImpl.setData_sozdanija(profil_polzovatelej.getData_sozdanija());
		profil_polzovatelejImpl.setData_izmenenija(profil_polzovatelej.getData_izmenenija());

		return profil_polzovatelejImpl;
	}

	/**
	 * Returns the profil_polzovatelej with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the profil_polzovatelej
	 * @return the profil_polzovatelej
	 * @throws NoSuchprofil_polzovatelejException if a profil_polzovatelej with the primary key could not be found
	 */
	@Override
	public profil_polzovatelej findByPrimaryKey(Serializable primaryKey)
		throws NoSuchprofil_polzovatelejException {
		profil_polzovatelej profil_polzovatelej = fetchByPrimaryKey(primaryKey);

		if (profil_polzovatelej == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchprofil_polzovatelejException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return profil_polzovatelej;
	}

	/**
	 * Returns the profil_polzovatelej with the primary key or throws a {@link NoSuchprofil_polzovatelejException} if it could not be found.
	 *
	 * @param profil_polzovatelej_id the primary key of the profil_polzovatelej
	 * @return the profil_polzovatelej
	 * @throws NoSuchprofil_polzovatelejException if a profil_polzovatelej with the primary key could not be found
	 */
	@Override
	public profil_polzovatelej findByPrimaryKey(long profil_polzovatelej_id)
		throws NoSuchprofil_polzovatelejException {
		return findByPrimaryKey((Serializable)profil_polzovatelej_id);
	}

	/**
	 * Returns the profil_polzovatelej with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the profil_polzovatelej
	 * @return the profil_polzovatelej, or <code>null</code> if a profil_polzovatelej with the primary key could not be found
	 */
	@Override
	public profil_polzovatelej fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(profil_polzovatelejModelImpl.ENTITY_CACHE_ENABLED,
				profil_polzovatelejImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		profil_polzovatelej profil_polzovatelej = (profil_polzovatelej)serializable;

		if (profil_polzovatelej == null) {
			Session session = null;

			try {
				session = openSession();

				profil_polzovatelej = (profil_polzovatelej)session.get(profil_polzovatelejImpl.class,
						primaryKey);

				if (profil_polzovatelej != null) {
					cacheResult(profil_polzovatelej);
				}
				else {
					entityCache.putResult(profil_polzovatelejModelImpl.ENTITY_CACHE_ENABLED,
						profil_polzovatelejImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(profil_polzovatelejModelImpl.ENTITY_CACHE_ENABLED,
					profil_polzovatelejImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return profil_polzovatelej;
	}

	/**
	 * Returns the profil_polzovatelej with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param profil_polzovatelej_id the primary key of the profil_polzovatelej
	 * @return the profil_polzovatelej, or <code>null</code> if a profil_polzovatelej with the primary key could not be found
	 */
	@Override
	public profil_polzovatelej fetchByPrimaryKey(long profil_polzovatelej_id) {
		return fetchByPrimaryKey((Serializable)profil_polzovatelej_id);
	}

	@Override
	public Map<Serializable, profil_polzovatelej> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, profil_polzovatelej> map = new HashMap<Serializable, profil_polzovatelej>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			profil_polzovatelej profil_polzovatelej = fetchByPrimaryKey(primaryKey);

			if (profil_polzovatelej != null) {
				map.put(primaryKey, profil_polzovatelej);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(profil_polzovatelejModelImpl.ENTITY_CACHE_ENABLED,
					profil_polzovatelejImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (profil_polzovatelej)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PROFIL_POLZOVATELEJ_WHERE_PKS_IN);

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

			for (profil_polzovatelej profil_polzovatelej : (List<profil_polzovatelej>)q.list()) {
				map.put(profil_polzovatelej.getPrimaryKeyObj(),
					profil_polzovatelej);

				cacheResult(profil_polzovatelej);

				uncachedPrimaryKeys.remove(profil_polzovatelej.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(profil_polzovatelejModelImpl.ENTITY_CACHE_ENABLED,
					profil_polzovatelejImpl.class, primaryKey, nullModel);
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
	 * Returns all the profil_polzovatelejs.
	 *
	 * @return the profil_polzovatelejs
	 */
	@Override
	public List<profil_polzovatelej> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the profil_polzovatelejs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link profil_polzovatelejModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of profil_polzovatelejs
	 * @param end the upper bound of the range of profil_polzovatelejs (not inclusive)
	 * @return the range of profil_polzovatelejs
	 */
	@Override
	public List<profil_polzovatelej> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the profil_polzovatelejs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link profil_polzovatelejModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of profil_polzovatelejs
	 * @param end the upper bound of the range of profil_polzovatelejs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of profil_polzovatelejs
	 */
	@Override
	public List<profil_polzovatelej> findAll(int start, int end,
		OrderByComparator<profil_polzovatelej> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the profil_polzovatelejs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link profil_polzovatelejModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of profil_polzovatelejs
	 * @param end the upper bound of the range of profil_polzovatelejs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of profil_polzovatelejs
	 */
	@Override
	public List<profil_polzovatelej> findAll(int start, int end,
		OrderByComparator<profil_polzovatelej> orderByComparator,
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

		List<profil_polzovatelej> list = null;

		if (retrieveFromCache) {
			list = (List<profil_polzovatelej>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PROFIL_POLZOVATELEJ);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PROFIL_POLZOVATELEJ;

				if (pagination) {
					sql = sql.concat(profil_polzovatelejModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<profil_polzovatelej>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<profil_polzovatelej>)QueryUtil.list(q,
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
	 * Removes all the profil_polzovatelejs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (profil_polzovatelej profil_polzovatelej : findAll()) {
			remove(profil_polzovatelej);
		}
	}

	/**
	 * Returns the number of profil_polzovatelejs.
	 *
	 * @return the number of profil_polzovatelejs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PROFIL_POLZOVATELEJ);

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
		return profil_polzovatelejModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the profil_polzovatelej persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(profil_polzovatelejImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_PROFIL_POLZOVATELEJ = "SELECT profil_polzovatelej FROM profil_polzovatelej profil_polzovatelej";
	private static final String _SQL_SELECT_PROFIL_POLZOVATELEJ_WHERE_PKS_IN = "SELECT profil_polzovatelej FROM profil_polzovatelej profil_polzovatelej WHERE profil_polzovatelej_id IN (";
	private static final String _SQL_COUNT_PROFIL_POLZOVATELEJ = "SELECT COUNT(profil_polzovatelej) FROM profil_polzovatelej profil_polzovatelej";
	private static final String _ORDER_BY_ENTITY_ALIAS = "profil_polzovatelej.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No profil_polzovatelej exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(profil_polzovatelejPersistenceImpl.class);
}