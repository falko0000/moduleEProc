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

package tj.porjadok.raboty.komissii.service.persistence.impl;

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

import tj.porjadok.raboty.komissii.exception.NoSuchPorjadokRabotyKomissiiException;
import tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii;
import tj.porjadok.raboty.komissii.model.impl.PorjadokRabotyKomissiiImpl;
import tj.porjadok.raboty.komissii.model.impl.PorjadokRabotyKomissiiModelImpl;
import tj.porjadok.raboty.komissii.service.persistence.PorjadokRabotyKomissiiPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the porjadok raboty komissii service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PorjadokRabotyKomissiiPersistence
 * @see tj.porjadok.raboty.komissii.service.persistence.PorjadokRabotyKomissiiUtil
 * @generated
 */
@ProviderType
public class PorjadokRabotyKomissiiPersistenceImpl extends BasePersistenceImpl<PorjadokRabotyKomissii>
	implements PorjadokRabotyKomissiiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PorjadokRabotyKomissiiUtil} to access the porjadok raboty komissii persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PorjadokRabotyKomissiiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
			PorjadokRabotyKomissiiModelImpl.FINDER_CACHE_ENABLED,
			PorjadokRabotyKomissiiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
			PorjadokRabotyKomissiiModelImpl.FINDER_CACHE_ENABLED,
			PorjadokRabotyKomissiiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
			PorjadokRabotyKomissiiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_IZVEWENIEID = new FinderPath(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
			PorjadokRabotyKomissiiModelImpl.FINDER_CACHE_ENABLED,
			PorjadokRabotyKomissiiImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByIzvewenieId", new String[] { Long.class.getName() },
			PorjadokRabotyKomissiiModelImpl.IZVEWENIE_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IZVEWENIEID = new FinderPath(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
			PorjadokRabotyKomissiiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIzvewenieId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the porjadok raboty komissii where izvewenie_id = &#63; or throws a {@link NoSuchPorjadokRabotyKomissiiException} if it could not be found.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the matching porjadok raboty komissii
	 * @throws NoSuchPorjadokRabotyKomissiiException if a matching porjadok raboty komissii could not be found
	 */
	@Override
	public PorjadokRabotyKomissii findByIzvewenieId(long izvewenie_id)
		throws NoSuchPorjadokRabotyKomissiiException {
		PorjadokRabotyKomissii porjadokRabotyKomissii = fetchByIzvewenieId(izvewenie_id);

		if (porjadokRabotyKomissii == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("izvewenie_id=");
			msg.append(izvewenie_id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchPorjadokRabotyKomissiiException(msg.toString());
		}

		return porjadokRabotyKomissii;
	}

	/**
	 * Returns the porjadok raboty komissii where izvewenie_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the matching porjadok raboty komissii, or <code>null</code> if a matching porjadok raboty komissii could not be found
	 */
	@Override
	public PorjadokRabotyKomissii fetchByIzvewenieId(long izvewenie_id) {
		return fetchByIzvewenieId(izvewenie_id, true);
	}

	/**
	 * Returns the porjadok raboty komissii where izvewenie_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching porjadok raboty komissii, or <code>null</code> if a matching porjadok raboty komissii could not be found
	 */
	@Override
	public PorjadokRabotyKomissii fetchByIzvewenieId(long izvewenie_id,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { izvewenie_id };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_IZVEWENIEID,
					finderArgs, this);
		}

		if (result instanceof PorjadokRabotyKomissii) {
			PorjadokRabotyKomissii porjadokRabotyKomissii = (PorjadokRabotyKomissii)result;

			if ((izvewenie_id != porjadokRabotyKomissii.getIzvewenie_id())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_PORJADOKRABOTYKOMISSII_WHERE);

			query.append(_FINDER_COLUMN_IZVEWENIEID_IZVEWENIE_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(izvewenie_id);

				List<PorjadokRabotyKomissii> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_IZVEWENIEID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"PorjadokRabotyKomissiiPersistenceImpl.fetchByIzvewenieId(long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PorjadokRabotyKomissii porjadokRabotyKomissii = list.get(0);

					result = porjadokRabotyKomissii;

					cacheResult(porjadokRabotyKomissii);

					if ((porjadokRabotyKomissii.getIzvewenie_id() != izvewenie_id)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_IZVEWENIEID,
							finderArgs, porjadokRabotyKomissii);
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
			return (PorjadokRabotyKomissii)result;
		}
	}

	/**
	 * Removes the porjadok raboty komissii where izvewenie_id = &#63; from the database.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the porjadok raboty komissii that was removed
	 */
	@Override
	public PorjadokRabotyKomissii removeByIzvewenieId(long izvewenie_id)
		throws NoSuchPorjadokRabotyKomissiiException {
		PorjadokRabotyKomissii porjadokRabotyKomissii = findByIzvewenieId(izvewenie_id);

		return remove(porjadokRabotyKomissii);
	}

	/**
	 * Returns the number of porjadok raboty komissiis where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the number of matching porjadok raboty komissiis
	 */
	@Override
	public int countByIzvewenieId(long izvewenie_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IZVEWENIEID;

		Object[] finderArgs = new Object[] { izvewenie_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PORJADOKRABOTYKOMISSII_WHERE);

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

	private static final String _FINDER_COLUMN_IZVEWENIEID_IZVEWENIE_ID_2 = "porjadokRabotyKomissii.izvewenie_id = ?";

	public PorjadokRabotyKomissiiPersistenceImpl() {
		setModelClass(PorjadokRabotyKomissii.class);
	}

	/**
	 * Caches the porjadok raboty komissii in the entity cache if it is enabled.
	 *
	 * @param porjadokRabotyKomissii the porjadok raboty komissii
	 */
	@Override
	public void cacheResult(PorjadokRabotyKomissii porjadokRabotyKomissii) {
		entityCache.putResult(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
			PorjadokRabotyKomissiiImpl.class,
			porjadokRabotyKomissii.getPrimaryKey(), porjadokRabotyKomissii);

		finderCache.putResult(FINDER_PATH_FETCH_BY_IZVEWENIEID,
			new Object[] { porjadokRabotyKomissii.getIzvewenie_id() },
			porjadokRabotyKomissii);

		porjadokRabotyKomissii.resetOriginalValues();
	}

	/**
	 * Caches the porjadok raboty komissiis in the entity cache if it is enabled.
	 *
	 * @param porjadokRabotyKomissiis the porjadok raboty komissiis
	 */
	@Override
	public void cacheResult(
		List<PorjadokRabotyKomissii> porjadokRabotyKomissiis) {
		for (PorjadokRabotyKomissii porjadokRabotyKomissii : porjadokRabotyKomissiis) {
			if (entityCache.getResult(
						PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
						PorjadokRabotyKomissiiImpl.class,
						porjadokRabotyKomissii.getPrimaryKey()) == null) {
				cacheResult(porjadokRabotyKomissii);
			}
			else {
				porjadokRabotyKomissii.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all porjadok raboty komissiis.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PorjadokRabotyKomissiiImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the porjadok raboty komissii.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PorjadokRabotyKomissii porjadokRabotyKomissii) {
		entityCache.removeResult(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
			PorjadokRabotyKomissiiImpl.class,
			porjadokRabotyKomissii.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((PorjadokRabotyKomissiiModelImpl)porjadokRabotyKomissii,
			true);
	}

	@Override
	public void clearCache(List<PorjadokRabotyKomissii> porjadokRabotyKomissiis) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PorjadokRabotyKomissii porjadokRabotyKomissii : porjadokRabotyKomissiis) {
			entityCache.removeResult(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
				PorjadokRabotyKomissiiImpl.class,
				porjadokRabotyKomissii.getPrimaryKey());

			clearUniqueFindersCache((PorjadokRabotyKomissiiModelImpl)porjadokRabotyKomissii,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		PorjadokRabotyKomissiiModelImpl porjadokRabotyKomissiiModelImpl) {
		Object[] args = new Object[] {
				porjadokRabotyKomissiiModelImpl.getIzvewenie_id()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_IZVEWENIEID, args,
			porjadokRabotyKomissiiModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		PorjadokRabotyKomissiiModelImpl porjadokRabotyKomissiiModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					porjadokRabotyKomissiiModelImpl.getIzvewenie_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_IZVEWENIEID, args);
		}

		if ((porjadokRabotyKomissiiModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_IZVEWENIEID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					porjadokRabotyKomissiiModelImpl.getOriginalIzvewenie_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_IZVEWENIEID, args);
		}
	}

	/**
	 * Creates a new porjadok raboty komissii with the primary key. Does not add the porjadok raboty komissii to the database.
	 *
	 * @param porjadok_raboty_komissii_id the primary key for the new porjadok raboty komissii
	 * @return the new porjadok raboty komissii
	 */
	@Override
	public PorjadokRabotyKomissii create(long porjadok_raboty_komissii_id) {
		PorjadokRabotyKomissii porjadokRabotyKomissii = new PorjadokRabotyKomissiiImpl();

		porjadokRabotyKomissii.setNew(true);
		porjadokRabotyKomissii.setPrimaryKey(porjadok_raboty_komissii_id);

		return porjadokRabotyKomissii;
	}

	/**
	 * Removes the porjadok raboty komissii with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param porjadok_raboty_komissii_id the primary key of the porjadok raboty komissii
	 * @return the porjadok raboty komissii that was removed
	 * @throws NoSuchPorjadokRabotyKomissiiException if a porjadok raboty komissii with the primary key could not be found
	 */
	@Override
	public PorjadokRabotyKomissii remove(long porjadok_raboty_komissii_id)
		throws NoSuchPorjadokRabotyKomissiiException {
		return remove((Serializable)porjadok_raboty_komissii_id);
	}

	/**
	 * Removes the porjadok raboty komissii with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the porjadok raboty komissii
	 * @return the porjadok raboty komissii that was removed
	 * @throws NoSuchPorjadokRabotyKomissiiException if a porjadok raboty komissii with the primary key could not be found
	 */
	@Override
	public PorjadokRabotyKomissii remove(Serializable primaryKey)
		throws NoSuchPorjadokRabotyKomissiiException {
		Session session = null;

		try {
			session = openSession();

			PorjadokRabotyKomissii porjadokRabotyKomissii = (PorjadokRabotyKomissii)session.get(PorjadokRabotyKomissiiImpl.class,
					primaryKey);

			if (porjadokRabotyKomissii == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPorjadokRabotyKomissiiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(porjadokRabotyKomissii);
		}
		catch (NoSuchPorjadokRabotyKomissiiException nsee) {
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
	protected PorjadokRabotyKomissii removeImpl(
		PorjadokRabotyKomissii porjadokRabotyKomissii) {
		porjadokRabotyKomissii = toUnwrappedModel(porjadokRabotyKomissii);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(porjadokRabotyKomissii)) {
				porjadokRabotyKomissii = (PorjadokRabotyKomissii)session.get(PorjadokRabotyKomissiiImpl.class,
						porjadokRabotyKomissii.getPrimaryKeyObj());
			}

			if (porjadokRabotyKomissii != null) {
				session.delete(porjadokRabotyKomissii);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (porjadokRabotyKomissii != null) {
			clearCache(porjadokRabotyKomissii);
		}

		return porjadokRabotyKomissii;
	}

	@Override
	public PorjadokRabotyKomissii updateImpl(
		PorjadokRabotyKomissii porjadokRabotyKomissii) {
		porjadokRabotyKomissii = toUnwrappedModel(porjadokRabotyKomissii);

		boolean isNew = porjadokRabotyKomissii.isNew();

		PorjadokRabotyKomissiiModelImpl porjadokRabotyKomissiiModelImpl = (PorjadokRabotyKomissiiModelImpl)porjadokRabotyKomissii;

		Session session = null;

		try {
			session = openSession();

			if (porjadokRabotyKomissii.isNew()) {
				session.save(porjadokRabotyKomissii);

				porjadokRabotyKomissii.setNew(false);
			}
			else {
				porjadokRabotyKomissii = (PorjadokRabotyKomissii)session.merge(porjadokRabotyKomissii);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !PorjadokRabotyKomissiiModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
			PorjadokRabotyKomissiiImpl.class,
			porjadokRabotyKomissii.getPrimaryKey(), porjadokRabotyKomissii,
			false);

		clearUniqueFindersCache(porjadokRabotyKomissiiModelImpl, false);
		cacheUniqueFindersCache(porjadokRabotyKomissiiModelImpl);

		porjadokRabotyKomissii.resetOriginalValues();

		return porjadokRabotyKomissii;
	}

	protected PorjadokRabotyKomissii toUnwrappedModel(
		PorjadokRabotyKomissii porjadokRabotyKomissii) {
		if (porjadokRabotyKomissii instanceof PorjadokRabotyKomissiiImpl) {
			return porjadokRabotyKomissii;
		}

		PorjadokRabotyKomissiiImpl porjadokRabotyKomissiiImpl = new PorjadokRabotyKomissiiImpl();

		porjadokRabotyKomissiiImpl.setNew(porjadokRabotyKomissii.isNew());
		porjadokRabotyKomissiiImpl.setPrimaryKey(porjadokRabotyKomissii.getPrimaryKey());

		porjadokRabotyKomissiiImpl.setData_izmenenija(porjadokRabotyKomissii.getData_izmenenija());
		porjadokRabotyKomissiiImpl.setData_podvedenija_itogov(porjadokRabotyKomissii.getData_podvedenija_itogov());
		porjadokRabotyKomissiiImpl.setData_publikacii(porjadokRabotyKomissii.getData_publikacii());
		porjadokRabotyKomissiiImpl.setData_sozdanija(porjadokRabotyKomissii.getData_sozdanija());
		porjadokRabotyKomissiiImpl.setIzmenil(porjadokRabotyKomissii.getIzmenil());
		porjadokRabotyKomissiiImpl.setIzvewenie_id(porjadokRabotyKomissii.getIzvewenie_id());
		porjadokRabotyKomissiiImpl.setPo_istecheniju_dnej(porjadokRabotyKomissii.getPo_istecheniju_dnej());
		porjadokRabotyKomissiiImpl.setPorjadok_raboty_komissii_id(porjadokRabotyKomissii.getPorjadok_raboty_komissii_id());
		porjadokRabotyKomissiiImpl.setSozdal(porjadokRabotyKomissii.getSozdal());

		return porjadokRabotyKomissiiImpl;
	}

	/**
	 * Returns the porjadok raboty komissii with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the porjadok raboty komissii
	 * @return the porjadok raboty komissii
	 * @throws NoSuchPorjadokRabotyKomissiiException if a porjadok raboty komissii with the primary key could not be found
	 */
	@Override
	public PorjadokRabotyKomissii findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPorjadokRabotyKomissiiException {
		PorjadokRabotyKomissii porjadokRabotyKomissii = fetchByPrimaryKey(primaryKey);

		if (porjadokRabotyKomissii == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPorjadokRabotyKomissiiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return porjadokRabotyKomissii;
	}

	/**
	 * Returns the porjadok raboty komissii with the primary key or throws a {@link NoSuchPorjadokRabotyKomissiiException} if it could not be found.
	 *
	 * @param porjadok_raboty_komissii_id the primary key of the porjadok raboty komissii
	 * @return the porjadok raboty komissii
	 * @throws NoSuchPorjadokRabotyKomissiiException if a porjadok raboty komissii with the primary key could not be found
	 */
	@Override
	public PorjadokRabotyKomissii findByPrimaryKey(
		long porjadok_raboty_komissii_id)
		throws NoSuchPorjadokRabotyKomissiiException {
		return findByPrimaryKey((Serializable)porjadok_raboty_komissii_id);
	}

	/**
	 * Returns the porjadok raboty komissii with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the porjadok raboty komissii
	 * @return the porjadok raboty komissii, or <code>null</code> if a porjadok raboty komissii with the primary key could not be found
	 */
	@Override
	public PorjadokRabotyKomissii fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
				PorjadokRabotyKomissiiImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		PorjadokRabotyKomissii porjadokRabotyKomissii = (PorjadokRabotyKomissii)serializable;

		if (porjadokRabotyKomissii == null) {
			Session session = null;

			try {
				session = openSession();

				porjadokRabotyKomissii = (PorjadokRabotyKomissii)session.get(PorjadokRabotyKomissiiImpl.class,
						primaryKey);

				if (porjadokRabotyKomissii != null) {
					cacheResult(porjadokRabotyKomissii);
				}
				else {
					entityCache.putResult(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
						PorjadokRabotyKomissiiImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
					PorjadokRabotyKomissiiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return porjadokRabotyKomissii;
	}

	/**
	 * Returns the porjadok raboty komissii with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param porjadok_raboty_komissii_id the primary key of the porjadok raboty komissii
	 * @return the porjadok raboty komissii, or <code>null</code> if a porjadok raboty komissii with the primary key could not be found
	 */
	@Override
	public PorjadokRabotyKomissii fetchByPrimaryKey(
		long porjadok_raboty_komissii_id) {
		return fetchByPrimaryKey((Serializable)porjadok_raboty_komissii_id);
	}

	@Override
	public Map<Serializable, PorjadokRabotyKomissii> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, PorjadokRabotyKomissii> map = new HashMap<Serializable, PorjadokRabotyKomissii>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			PorjadokRabotyKomissii porjadokRabotyKomissii = fetchByPrimaryKey(primaryKey);

			if (porjadokRabotyKomissii != null) {
				map.put(primaryKey, porjadokRabotyKomissii);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
					PorjadokRabotyKomissiiImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (PorjadokRabotyKomissii)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PORJADOKRABOTYKOMISSII_WHERE_PKS_IN);

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

			for (PorjadokRabotyKomissii porjadokRabotyKomissii : (List<PorjadokRabotyKomissii>)q.list()) {
				map.put(porjadokRabotyKomissii.getPrimaryKeyObj(),
					porjadokRabotyKomissii);

				cacheResult(porjadokRabotyKomissii);

				uncachedPrimaryKeys.remove(porjadokRabotyKomissii.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
					PorjadokRabotyKomissiiImpl.class, primaryKey, nullModel);
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
	 * Returns all the porjadok raboty komissiis.
	 *
	 * @return the porjadok raboty komissiis
	 */
	@Override
	public List<PorjadokRabotyKomissii> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the porjadok raboty komissiis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of porjadok raboty komissiis
	 * @param end the upper bound of the range of porjadok raboty komissiis (not inclusive)
	 * @return the range of porjadok raboty komissiis
	 */
	@Override
	public List<PorjadokRabotyKomissii> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the porjadok raboty komissiis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of porjadok raboty komissiis
	 * @param end the upper bound of the range of porjadok raboty komissiis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of porjadok raboty komissiis
	 */
	@Override
	public List<PorjadokRabotyKomissii> findAll(int start, int end,
		OrderByComparator<PorjadokRabotyKomissii> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the porjadok raboty komissiis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of porjadok raboty komissiis
	 * @param end the upper bound of the range of porjadok raboty komissiis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of porjadok raboty komissiis
	 */
	@Override
	public List<PorjadokRabotyKomissii> findAll(int start, int end,
		OrderByComparator<PorjadokRabotyKomissii> orderByComparator,
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

		List<PorjadokRabotyKomissii> list = null;

		if (retrieveFromCache) {
			list = (List<PorjadokRabotyKomissii>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PORJADOKRABOTYKOMISSII);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PORJADOKRABOTYKOMISSII;

				if (pagination) {
					sql = sql.concat(PorjadokRabotyKomissiiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PorjadokRabotyKomissii>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<PorjadokRabotyKomissii>)QueryUtil.list(q,
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
	 * Removes all the porjadok raboty komissiis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PorjadokRabotyKomissii porjadokRabotyKomissii : findAll()) {
			remove(porjadokRabotyKomissii);
		}
	}

	/**
	 * Returns the number of porjadok raboty komissiis.
	 *
	 * @return the number of porjadok raboty komissiis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PORJADOKRABOTYKOMISSII);

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
		return PorjadokRabotyKomissiiModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the porjadok raboty komissii persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(PorjadokRabotyKomissiiImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_PORJADOKRABOTYKOMISSII = "SELECT porjadokRabotyKomissii FROM PorjadokRabotyKomissii porjadokRabotyKomissii";
	private static final String _SQL_SELECT_PORJADOKRABOTYKOMISSII_WHERE_PKS_IN = "SELECT porjadokRabotyKomissii FROM PorjadokRabotyKomissii porjadokRabotyKomissii WHERE porjadok_raboty_komissii_id IN (";
	private static final String _SQL_SELECT_PORJADOKRABOTYKOMISSII_WHERE = "SELECT porjadokRabotyKomissii FROM PorjadokRabotyKomissii porjadokRabotyKomissii WHERE ";
	private static final String _SQL_COUNT_PORJADOKRABOTYKOMISSII = "SELECT COUNT(porjadokRabotyKomissii) FROM PorjadokRabotyKomissii porjadokRabotyKomissii";
	private static final String _SQL_COUNT_PORJADOKRABOTYKOMISSII_WHERE = "SELECT COUNT(porjadokRabotyKomissii) FROM PorjadokRabotyKomissii porjadokRabotyKomissii WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "porjadokRabotyKomissii.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PorjadokRabotyKomissii exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PorjadokRabotyKomissii exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(PorjadokRabotyKomissiiPersistenceImpl.class);
}