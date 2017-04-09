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

package tj.obwaja.informacija.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import tj.obwaja.informacija.exception.NoSuchObwajaInformacijaException;
import tj.obwaja.informacija.model.ObwajaInformacija;
import tj.obwaja.informacija.model.impl.ObwajaInformacijaImpl;
import tj.obwaja.informacija.model.impl.ObwajaInformacijaModelImpl;
import tj.obwaja.informacija.service.persistence.ObwajaInformacijaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the obwaja informacija service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ObwajaInformacijaPersistence
 * @see tj.obwaja.informacija.service.persistence.ObwajaInformacijaUtil
 * @generated
 */
@ProviderType
public class ObwajaInformacijaPersistenceImpl extends BasePersistenceImpl<ObwajaInformacija>
	implements ObwajaInformacijaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ObwajaInformacijaUtil} to access the obwaja informacija persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ObwajaInformacijaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ObwajaInformacijaModelImpl.ENTITY_CACHE_ENABLED,
			ObwajaInformacijaModelImpl.FINDER_CACHE_ENABLED,
			ObwajaInformacijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ObwajaInformacijaModelImpl.ENTITY_CACHE_ENABLED,
			ObwajaInformacijaModelImpl.FINDER_CACHE_ENABLED,
			ObwajaInformacijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ObwajaInformacijaModelImpl.ENTITY_CACHE_ENABLED,
			ObwajaInformacijaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_IZVEWENIEID = new FinderPath(ObwajaInformacijaModelImpl.ENTITY_CACHE_ENABLED,
			ObwajaInformacijaModelImpl.FINDER_CACHE_ENABLED,
			ObwajaInformacijaImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByIzvewenieID", new String[] { Long.class.getName() },
			ObwajaInformacijaModelImpl.IZVEWENIE_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IZVEWENIEID = new FinderPath(ObwajaInformacijaModelImpl.ENTITY_CACHE_ENABLED,
			ObwajaInformacijaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIzvewenieID",
			new String[] { Long.class.getName() });

	/**
	 * Returns the obwaja informacija where izvewenie_id = &#63; or throws a {@link NoSuchObwajaInformacijaException} if it could not be found.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the matching obwaja informacija
	 * @throws NoSuchObwajaInformacijaException if a matching obwaja informacija could not be found
	 */
	@Override
	public ObwajaInformacija findByIzvewenieID(long izvewenie_id)
		throws NoSuchObwajaInformacijaException {
		ObwajaInformacija obwajaInformacija = fetchByIzvewenieID(izvewenie_id);

		if (obwajaInformacija == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("izvewenie_id=");
			msg.append(izvewenie_id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchObwajaInformacijaException(msg.toString());
		}

		return obwajaInformacija;
	}

	/**
	 * Returns the obwaja informacija where izvewenie_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the matching obwaja informacija, or <code>null</code> if a matching obwaja informacija could not be found
	 */
	@Override
	public ObwajaInformacija fetchByIzvewenieID(long izvewenie_id) {
		return fetchByIzvewenieID(izvewenie_id, true);
	}

	/**
	 * Returns the obwaja informacija where izvewenie_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching obwaja informacija, or <code>null</code> if a matching obwaja informacija could not be found
	 */
	@Override
	public ObwajaInformacija fetchByIzvewenieID(long izvewenie_id,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { izvewenie_id };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_IZVEWENIEID,
					finderArgs, this);
		}

		if (result instanceof ObwajaInformacija) {
			ObwajaInformacija obwajaInformacija = (ObwajaInformacija)result;

			if ((izvewenie_id != obwajaInformacija.getIzvewenie_id())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_OBWAJAINFORMACIJA_WHERE);

			query.append(_FINDER_COLUMN_IZVEWENIEID_IZVEWENIE_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(izvewenie_id);

				List<ObwajaInformacija> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_IZVEWENIEID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"ObwajaInformacijaPersistenceImpl.fetchByIzvewenieID(long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ObwajaInformacija obwajaInformacija = list.get(0);

					result = obwajaInformacija;

					cacheResult(obwajaInformacija);

					if ((obwajaInformacija.getIzvewenie_id() != izvewenie_id)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_IZVEWENIEID,
							finderArgs, obwajaInformacija);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_IZVEWENIEID,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (ObwajaInformacija)result;
		}
	}

	/**
	 * Removes the obwaja informacija where izvewenie_id = &#63; from the database.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the obwaja informacija that was removed
	 */
	@Override
	public ObwajaInformacija removeByIzvewenieID(long izvewenie_id)
		throws NoSuchObwajaInformacijaException {
		ObwajaInformacija obwajaInformacija = findByIzvewenieID(izvewenie_id);

		return remove(obwajaInformacija);
	}

	/**
	 * Returns the number of obwaja informacijas where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the number of matching obwaja informacijas
	 */
	@Override
	public int countByIzvewenieID(long izvewenie_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IZVEWENIEID;

		Object[] finderArgs = new Object[] { izvewenie_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_OBWAJAINFORMACIJA_WHERE);

			query.append(_FINDER_COLUMN_IZVEWENIEID_IZVEWENIE_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(izvewenie_id);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_IZVEWENIEID_IZVEWENIE_ID_2 = "obwajaInformacija.izvewenie_id = ?";

	public ObwajaInformacijaPersistenceImpl() {
		setModelClass(ObwajaInformacija.class);
	}

	/**
	 * Caches the obwaja informacija in the entity cache if it is enabled.
	 *
	 * @param obwajaInformacija the obwaja informacija
	 */
	@Override
	public void cacheResult(ObwajaInformacija obwajaInformacija) {
		entityCache.putResult(ObwajaInformacijaModelImpl.ENTITY_CACHE_ENABLED,
			ObwajaInformacijaImpl.class, obwajaInformacija.getPrimaryKey(),
			obwajaInformacija);

		finderCache.putResult(FINDER_PATH_FETCH_BY_IZVEWENIEID,
			new Object[] { obwajaInformacija.getIzvewenie_id() },
			obwajaInformacija);

		obwajaInformacija.resetOriginalValues();
	}

	/**
	 * Caches the obwaja informacijas in the entity cache if it is enabled.
	 *
	 * @param obwajaInformacijas the obwaja informacijas
	 */
	@Override
	public void cacheResult(List<ObwajaInformacija> obwajaInformacijas) {
		for (ObwajaInformacija obwajaInformacija : obwajaInformacijas) {
			if (entityCache.getResult(
						ObwajaInformacijaModelImpl.ENTITY_CACHE_ENABLED,
						ObwajaInformacijaImpl.class,
						obwajaInformacija.getPrimaryKey()) == null) {
				cacheResult(obwajaInformacija);
			}
			else {
				obwajaInformacija.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all obwaja informacijas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ObwajaInformacijaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the obwaja informacija.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ObwajaInformacija obwajaInformacija) {
		entityCache.removeResult(ObwajaInformacijaModelImpl.ENTITY_CACHE_ENABLED,
			ObwajaInformacijaImpl.class, obwajaInformacija.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((ObwajaInformacijaModelImpl)obwajaInformacija,
			true);
	}

	@Override
	public void clearCache(List<ObwajaInformacija> obwajaInformacijas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ObwajaInformacija obwajaInformacija : obwajaInformacijas) {
			entityCache.removeResult(ObwajaInformacijaModelImpl.ENTITY_CACHE_ENABLED,
				ObwajaInformacijaImpl.class, obwajaInformacija.getPrimaryKey());

			clearUniqueFindersCache((ObwajaInformacijaModelImpl)obwajaInformacija,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		ObwajaInformacijaModelImpl obwajaInformacijaModelImpl) {
		Object[] args = new Object[] {
				obwajaInformacijaModelImpl.getIzvewenie_id()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_IZVEWENIEID, args,
			obwajaInformacijaModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		ObwajaInformacijaModelImpl obwajaInformacijaModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					obwajaInformacijaModelImpl.getIzvewenie_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_IZVEWENIEID, args);
		}

		if ((obwajaInformacijaModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_IZVEWENIEID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					obwajaInformacijaModelImpl.getOriginalIzvewenie_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_IZVEWENIEID, args);
		}
	}

	/**
	 * Creates a new obwaja informacija with the primary key. Does not add the obwaja informacija to the database.
	 *
	 * @param obwaja_informacija_id the primary key for the new obwaja informacija
	 * @return the new obwaja informacija
	 */
	@Override
	public ObwajaInformacija create(long obwaja_informacija_id) {
		ObwajaInformacija obwajaInformacija = new ObwajaInformacijaImpl();

		obwajaInformacija.setNew(true);
		obwajaInformacija.setPrimaryKey(obwaja_informacija_id);

		return obwajaInformacija;
	}

	/**
	 * Removes the obwaja informacija with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param obwaja_informacija_id the primary key of the obwaja informacija
	 * @return the obwaja informacija that was removed
	 * @throws NoSuchObwajaInformacijaException if a obwaja informacija with the primary key could not be found
	 */
	@Override
	public ObwajaInformacija remove(long obwaja_informacija_id)
		throws NoSuchObwajaInformacijaException {
		return remove((Serializable)obwaja_informacija_id);
	}

	/**
	 * Removes the obwaja informacija with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the obwaja informacija
	 * @return the obwaja informacija that was removed
	 * @throws NoSuchObwajaInformacijaException if a obwaja informacija with the primary key could not be found
	 */
	@Override
	public ObwajaInformacija remove(Serializable primaryKey)
		throws NoSuchObwajaInformacijaException {
		Session session = null;

		try {
			session = openSession();

			ObwajaInformacija obwajaInformacija = (ObwajaInformacija)session.get(ObwajaInformacijaImpl.class,
					primaryKey);

			if (obwajaInformacija == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchObwajaInformacijaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(obwajaInformacija);
		}
		catch (NoSuchObwajaInformacijaException nsee) {
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
	protected ObwajaInformacija removeImpl(ObwajaInformacija obwajaInformacija) {
		obwajaInformacija = toUnwrappedModel(obwajaInformacija);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(obwajaInformacija)) {
				obwajaInformacija = (ObwajaInformacija)session.get(ObwajaInformacijaImpl.class,
						obwajaInformacija.getPrimaryKeyObj());
			}

			if (obwajaInformacija != null) {
				session.delete(obwajaInformacija);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (obwajaInformacija != null) {
			clearCache(obwajaInformacija);
		}

		return obwajaInformacija;
	}

	@Override
	public ObwajaInformacija updateImpl(ObwajaInformacija obwajaInformacija) {
		obwajaInformacija = toUnwrappedModel(obwajaInformacija);

		boolean isNew = obwajaInformacija.isNew();

		ObwajaInformacijaModelImpl obwajaInformacijaModelImpl = (ObwajaInformacijaModelImpl)obwajaInformacija;

		Session session = null;

		try {
			session = openSession();

			if (obwajaInformacija.isNew()) {
				session.save(obwajaInformacija);

				obwajaInformacija.setNew(false);
			}
			else {
				obwajaInformacija = (ObwajaInformacija)session.merge(obwajaInformacija);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ObwajaInformacijaModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(ObwajaInformacijaModelImpl.ENTITY_CACHE_ENABLED,
			ObwajaInformacijaImpl.class, obwajaInformacija.getPrimaryKey(),
			obwajaInformacija, false);

		clearUniqueFindersCache(obwajaInformacijaModelImpl, false);
		cacheUniqueFindersCache(obwajaInformacijaModelImpl);

		obwajaInformacija.resetOriginalValues();

		return obwajaInformacija;
	}

	protected ObwajaInformacija toUnwrappedModel(
		ObwajaInformacija obwajaInformacija) {
		if (obwajaInformacija instanceof ObwajaInformacijaImpl) {
			return obwajaInformacija;
		}

		ObwajaInformacijaImpl obwajaInformacijaImpl = new ObwajaInformacijaImpl();

		obwajaInformacijaImpl.setNew(obwajaInformacija.isNew());
		obwajaInformacijaImpl.setPrimaryKey(obwajaInformacija.getPrimaryKey());

		obwajaInformacijaImpl.setData_izmenenija(obwajaInformacija.getData_izmenenija());
		obwajaInformacijaImpl.setData_sozdanija(obwajaInformacija.getData_sozdanija());
		obwajaInformacijaImpl.setIzmenil(obwajaInformacija.getIzmenil());
		obwajaInformacijaImpl.setIzvewenie_id(obwajaInformacija.getIzvewenie_id());
		obwajaInformacijaImpl.setJe_pochta(obwajaInformacija.getJe_pochta());
		obwajaInformacijaImpl.setKontaktnoe_lico(obwajaInformacija.getKontaktnoe_lico());
		obwajaInformacijaImpl.setKontaktnyj_telefon(obwajaInformacija.getKontaktnyj_telefon());
		obwajaInformacijaImpl.setObwaja_informacija_id(obwajaInformacija.getObwaja_informacija_id());
		obwajaInformacijaImpl.setSozdal(obwajaInformacija.getSozdal());

		return obwajaInformacijaImpl;
	}

	/**
	 * Returns the obwaja informacija with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the obwaja informacija
	 * @return the obwaja informacija
	 * @throws NoSuchObwajaInformacijaException if a obwaja informacija with the primary key could not be found
	 */
	@Override
	public ObwajaInformacija findByPrimaryKey(Serializable primaryKey)
		throws NoSuchObwajaInformacijaException {
		ObwajaInformacija obwajaInformacija = fetchByPrimaryKey(primaryKey);

		if (obwajaInformacija == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchObwajaInformacijaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return obwajaInformacija;
	}

	/**
	 * Returns the obwaja informacija with the primary key or throws a {@link NoSuchObwajaInformacijaException} if it could not be found.
	 *
	 * @param obwaja_informacija_id the primary key of the obwaja informacija
	 * @return the obwaja informacija
	 * @throws NoSuchObwajaInformacijaException if a obwaja informacija with the primary key could not be found
	 */
	@Override
	public ObwajaInformacija findByPrimaryKey(long obwaja_informacija_id)
		throws NoSuchObwajaInformacijaException {
		return findByPrimaryKey((Serializable)obwaja_informacija_id);
	}

	/**
	 * Returns the obwaja informacija with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the obwaja informacija
	 * @return the obwaja informacija, or <code>null</code> if a obwaja informacija with the primary key could not be found
	 */
	@Override
	public ObwajaInformacija fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ObwajaInformacijaModelImpl.ENTITY_CACHE_ENABLED,
				ObwajaInformacijaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ObwajaInformacija obwajaInformacija = (ObwajaInformacija)serializable;

		if (obwajaInformacija == null) {
			Session session = null;

			try {
				session = openSession();

				obwajaInformacija = (ObwajaInformacija)session.get(ObwajaInformacijaImpl.class,
						primaryKey);

				if (obwajaInformacija != null) {
					cacheResult(obwajaInformacija);
				}
				else {
					entityCache.putResult(ObwajaInformacijaModelImpl.ENTITY_CACHE_ENABLED,
						ObwajaInformacijaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ObwajaInformacijaModelImpl.ENTITY_CACHE_ENABLED,
					ObwajaInformacijaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return obwajaInformacija;
	}

	/**
	 * Returns the obwaja informacija with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param obwaja_informacija_id the primary key of the obwaja informacija
	 * @return the obwaja informacija, or <code>null</code> if a obwaja informacija with the primary key could not be found
	 */
	@Override
	public ObwajaInformacija fetchByPrimaryKey(long obwaja_informacija_id) {
		return fetchByPrimaryKey((Serializable)obwaja_informacija_id);
	}

	@Override
	public Map<Serializable, ObwajaInformacija> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ObwajaInformacija> map = new HashMap<Serializable, ObwajaInformacija>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ObwajaInformacija obwajaInformacija = fetchByPrimaryKey(primaryKey);

			if (obwajaInformacija != null) {
				map.put(primaryKey, obwajaInformacija);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ObwajaInformacijaModelImpl.ENTITY_CACHE_ENABLED,
					ObwajaInformacijaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ObwajaInformacija)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_OBWAJAINFORMACIJA_WHERE_PKS_IN);

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

			for (ObwajaInformacija obwajaInformacija : (List<ObwajaInformacija>)q.list()) {
				map.put(obwajaInformacija.getPrimaryKeyObj(), obwajaInformacija);

				cacheResult(obwajaInformacija);

				uncachedPrimaryKeys.remove(obwajaInformacija.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ObwajaInformacijaModelImpl.ENTITY_CACHE_ENABLED,
					ObwajaInformacijaImpl.class, primaryKey, nullModel);
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
	 * Returns all the obwaja informacijas.
	 *
	 * @return the obwaja informacijas
	 */
	@Override
	public List<ObwajaInformacija> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the obwaja informacijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ObwajaInformacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of obwaja informacijas
	 * @param end the upper bound of the range of obwaja informacijas (not inclusive)
	 * @return the range of obwaja informacijas
	 */
	@Override
	public List<ObwajaInformacija> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the obwaja informacijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ObwajaInformacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of obwaja informacijas
	 * @param end the upper bound of the range of obwaja informacijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of obwaja informacijas
	 */
	@Override
	public List<ObwajaInformacija> findAll(int start, int end,
		OrderByComparator<ObwajaInformacija> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the obwaja informacijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ObwajaInformacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of obwaja informacijas
	 * @param end the upper bound of the range of obwaja informacijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of obwaja informacijas
	 */
	@Override
	public List<ObwajaInformacija> findAll(int start, int end,
		OrderByComparator<ObwajaInformacija> orderByComparator,
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

		List<ObwajaInformacija> list = null;

		if (retrieveFromCache) {
			list = (List<ObwajaInformacija>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_OBWAJAINFORMACIJA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OBWAJAINFORMACIJA;

				if (pagination) {
					sql = sql.concat(ObwajaInformacijaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ObwajaInformacija>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ObwajaInformacija>)QueryUtil.list(q,
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
	 * Removes all the obwaja informacijas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ObwajaInformacija obwajaInformacija : findAll()) {
			remove(obwajaInformacija);
		}
	}

	/**
	 * Returns the number of obwaja informacijas.
	 *
	 * @return the number of obwaja informacijas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_OBWAJAINFORMACIJA);

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
		return ObwajaInformacijaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the obwaja informacija persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ObwajaInformacijaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_OBWAJAINFORMACIJA = "SELECT obwajaInformacija FROM ObwajaInformacija obwajaInformacija";
	private static final String _SQL_SELECT_OBWAJAINFORMACIJA_WHERE_PKS_IN = "SELECT obwajaInformacija FROM ObwajaInformacija obwajaInformacija WHERE obwaja_informacija_id IN (";
	private static final String _SQL_SELECT_OBWAJAINFORMACIJA_WHERE = "SELECT obwajaInformacija FROM ObwajaInformacija obwajaInformacija WHERE ";
	private static final String _SQL_COUNT_OBWAJAINFORMACIJA = "SELECT COUNT(obwajaInformacija) FROM ObwajaInformacija obwajaInformacija";
	private static final String _SQL_COUNT_OBWAJAINFORMACIJA_WHERE = "SELECT COUNT(obwajaInformacija) FROM ObwajaInformacija obwajaInformacija WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "obwajaInformacija.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ObwajaInformacija exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ObwajaInformacija exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ObwajaInformacijaPersistenceImpl.class);
}