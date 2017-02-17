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

package tj.spisok.lotov.service.persistence.impl;

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

import tj.spisok.lotov.exception.NoSuchspisok_lotovException;
import tj.spisok.lotov.model.impl.spisok_lotovImpl;
import tj.spisok.lotov.model.impl.spisok_lotovModelImpl;
import tj.spisok.lotov.model.spisok_lotov;
import tj.spisok.lotov.service.persistence.spisok_lotovPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the spisok_lotov service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see spisok_lotovPersistence
 * @see tj.spisok.lotov.service.persistence.spisok_lotovUtil
 * @generated
 */
@ProviderType
public class spisok_lotovPersistenceImpl extends BasePersistenceImpl<spisok_lotov>
	implements spisok_lotovPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link spisok_lotovUtil} to access the spisok_lotov persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = spisok_lotovImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(spisok_lotovModelImpl.ENTITY_CACHE_ENABLED,
			spisok_lotovModelImpl.FINDER_CACHE_ENABLED, spisok_lotovImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(spisok_lotovModelImpl.ENTITY_CACHE_ENABLED,
			spisok_lotovModelImpl.FINDER_CACHE_ENABLED, spisok_lotovImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(spisok_lotovModelImpl.ENTITY_CACHE_ENABLED,
			spisok_lotovModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public spisok_lotovPersistenceImpl() {
		setModelClass(spisok_lotov.class);
	}

	/**
	 * Caches the spisok_lotov in the entity cache if it is enabled.
	 *
	 * @param spisok_lotov the spisok_lotov
	 */
	@Override
	public void cacheResult(spisok_lotov spisok_lotov) {
		entityCache.putResult(spisok_lotovModelImpl.ENTITY_CACHE_ENABLED,
			spisok_lotovImpl.class, spisok_lotov.getPrimaryKey(), spisok_lotov);

		spisok_lotov.resetOriginalValues();
	}

	/**
	 * Caches the spisok_lotovs in the entity cache if it is enabled.
	 *
	 * @param spisok_lotovs the spisok_lotovs
	 */
	@Override
	public void cacheResult(List<spisok_lotov> spisok_lotovs) {
		for (spisok_lotov spisok_lotov : spisok_lotovs) {
			if (entityCache.getResult(
						spisok_lotovModelImpl.ENTITY_CACHE_ENABLED,
						spisok_lotovImpl.class, spisok_lotov.getPrimaryKey()) == null) {
				cacheResult(spisok_lotov);
			}
			else {
				spisok_lotov.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all spisok_lotovs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(spisok_lotovImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the spisok_lotov.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(spisok_lotov spisok_lotov) {
		entityCache.removeResult(spisok_lotovModelImpl.ENTITY_CACHE_ENABLED,
			spisok_lotovImpl.class, spisok_lotov.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<spisok_lotov> spisok_lotovs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (spisok_lotov spisok_lotov : spisok_lotovs) {
			entityCache.removeResult(spisok_lotovModelImpl.ENTITY_CACHE_ENABLED,
				spisok_lotovImpl.class, spisok_lotov.getPrimaryKey());
		}
	}

	/**
	 * Creates a new spisok_lotov with the primary key. Does not add the spisok_lotov to the database.
	 *
	 * @param spisok_lotov_id the primary key for the new spisok_lotov
	 * @return the new spisok_lotov
	 */
	@Override
	public spisok_lotov create(long spisok_lotov_id) {
		spisok_lotov spisok_lotov = new spisok_lotovImpl();

		spisok_lotov.setNew(true);
		spisok_lotov.setPrimaryKey(spisok_lotov_id);

		return spisok_lotov;
	}

	/**
	 * Removes the spisok_lotov with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param spisok_lotov_id the primary key of the spisok_lotov
	 * @return the spisok_lotov that was removed
	 * @throws NoSuchspisok_lotovException if a spisok_lotov with the primary key could not be found
	 */
	@Override
	public spisok_lotov remove(long spisok_lotov_id)
		throws NoSuchspisok_lotovException {
		return remove((Serializable)spisok_lotov_id);
	}

	/**
	 * Removes the spisok_lotov with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the spisok_lotov
	 * @return the spisok_lotov that was removed
	 * @throws NoSuchspisok_lotovException if a spisok_lotov with the primary key could not be found
	 */
	@Override
	public spisok_lotov remove(Serializable primaryKey)
		throws NoSuchspisok_lotovException {
		Session session = null;

		try {
			session = openSession();

			spisok_lotov spisok_lotov = (spisok_lotov)session.get(spisok_lotovImpl.class,
					primaryKey);

			if (spisok_lotov == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchspisok_lotovException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(spisok_lotov);
		}
		catch (NoSuchspisok_lotovException nsee) {
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
	protected spisok_lotov removeImpl(spisok_lotov spisok_lotov) {
		spisok_lotov = toUnwrappedModel(spisok_lotov);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(spisok_lotov)) {
				spisok_lotov = (spisok_lotov)session.get(spisok_lotovImpl.class,
						spisok_lotov.getPrimaryKeyObj());
			}

			if (spisok_lotov != null) {
				session.delete(spisok_lotov);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (spisok_lotov != null) {
			clearCache(spisok_lotov);
		}

		return spisok_lotov;
	}

	@Override
	public spisok_lotov updateImpl(spisok_lotov spisok_lotov) {
		spisok_lotov = toUnwrappedModel(spisok_lotov);

		boolean isNew = spisok_lotov.isNew();

		Session session = null;

		try {
			session = openSession();

			if (spisok_lotov.isNew()) {
				session.save(spisok_lotov);

				spisok_lotov.setNew(false);
			}
			else {
				spisok_lotov = (spisok_lotov)session.merge(spisok_lotov);
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

		entityCache.putResult(spisok_lotovModelImpl.ENTITY_CACHE_ENABLED,
			spisok_lotovImpl.class, spisok_lotov.getPrimaryKey(), spisok_lotov,
			false);

		spisok_lotov.resetOriginalValues();

		return spisok_lotov;
	}

	protected spisok_lotov toUnwrappedModel(spisok_lotov spisok_lotov) {
		if (spisok_lotov instanceof spisok_lotovImpl) {
			return spisok_lotov;
		}

		spisok_lotovImpl spisok_lotovImpl = new spisok_lotovImpl();

		spisok_lotovImpl.setNew(spisok_lotov.isNew());
		spisok_lotovImpl.setPrimaryKey(spisok_lotov.getPrimaryKey());

		spisok_lotovImpl.setCena_kontrakta(spisok_lotov.getCena_kontrakta());
		spisok_lotovImpl.setCena_postavki(spisok_lotov.getCena_postavki());
		spisok_lotovImpl.setData_izmenenija(spisok_lotov.getData_izmenenija());
		spisok_lotovImpl.setData_sozdanija(spisok_lotov.getData_sozdanija());
		spisok_lotovImpl.setId_jebk(spisok_lotov.getId_jebk());
		spisok_lotovImpl.setIstochnik_finansirovanija_id(spisok_lotov.getIstochnik_finansirovanija_id());
		spisok_lotovImpl.setIzmenil(spisok_lotov.getIzmenil());
		spisok_lotovImpl.setIzvewenie_id(spisok_lotov.getIzvewenie_id());
		spisok_lotovImpl.setKlassifikacija_po_jekb(spisok_lotov.getKlassifikacija_po_jekb());
		spisok_lotovImpl.setKod_jekb(spisok_lotov.getKod_jekb());
		spisok_lotovImpl.setKod_zakazchika(spisok_lotov.getKod_zakazchika());
		spisok_lotovImpl.setMesto_postavki(spisok_lotov.getMesto_postavki());
		spisok_lotovImpl.setNaimenovanie_lota(spisok_lotov.getNaimenovanie_lota());
		spisok_lotovImpl.setNomer_lota(spisok_lotov.getNomer_lota());
		spisok_lotovImpl.setObespechenie_ispolnenija(spisok_lotov.getObespechenie_ispolnenija());
		spisok_lotovImpl.setObespechenie_ispolnenija_v_procentah(spisok_lotov.getObespechenie_ispolnenija_v_procentah());
		spisok_lotovImpl.setObespechenie_v_procentah(spisok_lotov.getObespechenie_v_procentah());
		spisok_lotovImpl.setObespechenie_zajavki(spisok_lotov.getObespechenie_zajavki());
		spisok_lotovImpl.setOplata(spisok_lotov.getOplata());
		spisok_lotovImpl.setSoputstvujuwie_uslovija(spisok_lotov.getSoputstvujuwie_uslovija());
		spisok_lotovImpl.setSozdal(spisok_lotov.getSozdal());
		spisok_lotovImpl.setSpisok_lotov_id(spisok_lotov.getSpisok_lotov_id());
		spisok_lotovImpl.setSrok_dejstvija(spisok_lotov.getSrok_dejstvija());
		spisok_lotovImpl.setSrok_ispolnenija_zajavki(spisok_lotov.getSrok_ispolnenija_zajavki());
		spisok_lotovImpl.setSrok_obespechenija_zajavki(spisok_lotov.getSrok_obespechenija_zajavki());
		spisok_lotovImpl.setSrok_postavki(spisok_lotov.getSrok_postavki());
		spisok_lotovImpl.setZakazchik(spisok_lotov.getZakazchik());

		return spisok_lotovImpl;
	}

	/**
	 * Returns the spisok_lotov with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the spisok_lotov
	 * @return the spisok_lotov
	 * @throws NoSuchspisok_lotovException if a spisok_lotov with the primary key could not be found
	 */
	@Override
	public spisok_lotov findByPrimaryKey(Serializable primaryKey)
		throws NoSuchspisok_lotovException {
		spisok_lotov spisok_lotov = fetchByPrimaryKey(primaryKey);

		if (spisok_lotov == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchspisok_lotovException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return spisok_lotov;
	}

	/**
	 * Returns the spisok_lotov with the primary key or throws a {@link NoSuchspisok_lotovException} if it could not be found.
	 *
	 * @param spisok_lotov_id the primary key of the spisok_lotov
	 * @return the spisok_lotov
	 * @throws NoSuchspisok_lotovException if a spisok_lotov with the primary key could not be found
	 */
	@Override
	public spisok_lotov findByPrimaryKey(long spisok_lotov_id)
		throws NoSuchspisok_lotovException {
		return findByPrimaryKey((Serializable)spisok_lotov_id);
	}

	/**
	 * Returns the spisok_lotov with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the spisok_lotov
	 * @return the spisok_lotov, or <code>null</code> if a spisok_lotov with the primary key could not be found
	 */
	@Override
	public spisok_lotov fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(spisok_lotovModelImpl.ENTITY_CACHE_ENABLED,
				spisok_lotovImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		spisok_lotov spisok_lotov = (spisok_lotov)serializable;

		if (spisok_lotov == null) {
			Session session = null;

			try {
				session = openSession();

				spisok_lotov = (spisok_lotov)session.get(spisok_lotovImpl.class,
						primaryKey);

				if (spisok_lotov != null) {
					cacheResult(spisok_lotov);
				}
				else {
					entityCache.putResult(spisok_lotovModelImpl.ENTITY_CACHE_ENABLED,
						spisok_lotovImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(spisok_lotovModelImpl.ENTITY_CACHE_ENABLED,
					spisok_lotovImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return spisok_lotov;
	}

	/**
	 * Returns the spisok_lotov with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param spisok_lotov_id the primary key of the spisok_lotov
	 * @return the spisok_lotov, or <code>null</code> if a spisok_lotov with the primary key could not be found
	 */
	@Override
	public spisok_lotov fetchByPrimaryKey(long spisok_lotov_id) {
		return fetchByPrimaryKey((Serializable)spisok_lotov_id);
	}

	@Override
	public Map<Serializable, spisok_lotov> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, spisok_lotov> map = new HashMap<Serializable, spisok_lotov>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			spisok_lotov spisok_lotov = fetchByPrimaryKey(primaryKey);

			if (spisok_lotov != null) {
				map.put(primaryKey, spisok_lotov);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(spisok_lotovModelImpl.ENTITY_CACHE_ENABLED,
					spisok_lotovImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (spisok_lotov)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SPISOK_LOTOV_WHERE_PKS_IN);

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

			for (spisok_lotov spisok_lotov : (List<spisok_lotov>)q.list()) {
				map.put(spisok_lotov.getPrimaryKeyObj(), spisok_lotov);

				cacheResult(spisok_lotov);

				uncachedPrimaryKeys.remove(spisok_lotov.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(spisok_lotovModelImpl.ENTITY_CACHE_ENABLED,
					spisok_lotovImpl.class, primaryKey, nullModel);
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
	 * Returns all the spisok_lotovs.
	 *
	 * @return the spisok_lotovs
	 */
	@Override
	public List<spisok_lotov> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the spisok_lotovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link spisok_lotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of spisok_lotovs
	 * @param end the upper bound of the range of spisok_lotovs (not inclusive)
	 * @return the range of spisok_lotovs
	 */
	@Override
	public List<spisok_lotov> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the spisok_lotovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link spisok_lotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of spisok_lotovs
	 * @param end the upper bound of the range of spisok_lotovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of spisok_lotovs
	 */
	@Override
	public List<spisok_lotov> findAll(int start, int end,
		OrderByComparator<spisok_lotov> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the spisok_lotovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link spisok_lotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of spisok_lotovs
	 * @param end the upper bound of the range of spisok_lotovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of spisok_lotovs
	 */
	@Override
	public List<spisok_lotov> findAll(int start, int end,
		OrderByComparator<spisok_lotov> orderByComparator,
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

		List<spisok_lotov> list = null;

		if (retrieveFromCache) {
			list = (List<spisok_lotov>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SPISOK_LOTOV);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SPISOK_LOTOV;

				if (pagination) {
					sql = sql.concat(spisok_lotovModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<spisok_lotov>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<spisok_lotov>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the spisok_lotovs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (spisok_lotov spisok_lotov : findAll()) {
			remove(spisok_lotov);
		}
	}

	/**
	 * Returns the number of spisok_lotovs.
	 *
	 * @return the number of spisok_lotovs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SPISOK_LOTOV);

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
		return spisok_lotovModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the spisok_lotov persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(spisok_lotovImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SPISOK_LOTOV = "SELECT spisok_lotov FROM spisok_lotov spisok_lotov";
	private static final String _SQL_SELECT_SPISOK_LOTOV_WHERE_PKS_IN = "SELECT spisok_lotov FROM spisok_lotov spisok_lotov WHERE spisok_lotov_id IN (";
	private static final String _SQL_COUNT_SPISOK_LOTOV = "SELECT COUNT(spisok_lotov) FROM spisok_lotov spisok_lotov";
	private static final String _ORDER_BY_ENTITY_ALIAS = "spisok_lotov.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No spisok_lotov exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(spisok_lotovPersistenceImpl.class);
}