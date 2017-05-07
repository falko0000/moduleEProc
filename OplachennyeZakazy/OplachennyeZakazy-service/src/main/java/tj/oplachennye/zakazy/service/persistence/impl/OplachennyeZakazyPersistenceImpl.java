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

package tj.oplachennye.zakazy.service.persistence.impl;

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

import tj.oplachennye.zakazy.exception.NoSuchOplachennyeZakazyException;
import tj.oplachennye.zakazy.model.OplachennyeZakazy;
import tj.oplachennye.zakazy.model.impl.OplachennyeZakazyImpl;
import tj.oplachennye.zakazy.model.impl.OplachennyeZakazyModelImpl;
import tj.oplachennye.zakazy.service.persistence.OplachennyeZakazyPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the oplachennye zakazy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OplachennyeZakazyPersistence
 * @see tj.oplachennye.zakazy.service.persistence.OplachennyeZakazyUtil
 * @generated
 */
@ProviderType
public class OplachennyeZakazyPersistenceImpl extends BasePersistenceImpl<OplachennyeZakazy>
	implements OplachennyeZakazyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OplachennyeZakazyUtil} to access the oplachennye zakazy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OplachennyeZakazyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OplachennyeZakazyModelImpl.ENTITY_CACHE_ENABLED,
			OplachennyeZakazyModelImpl.FINDER_CACHE_ENABLED,
			OplachennyeZakazyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OplachennyeZakazyModelImpl.ENTITY_CACHE_ENABLED,
			OplachennyeZakazyModelImpl.FINDER_CACHE_ENABLED,
			OplachennyeZakazyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OplachennyeZakazyModelImpl.ENTITY_CACHE_ENABLED,
			OplachennyeZakazyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_POSTAVWIKIDIZVEWENIEID = new FinderPath(OplachennyeZakazyModelImpl.ENTITY_CACHE_ENABLED,
			OplachennyeZakazyModelImpl.FINDER_CACHE_ENABLED,
			OplachennyeZakazyImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBypostavwikIdIzvewenieId",
			new String[] { Long.class.getName(), Long.class.getName() },
			OplachennyeZakazyModelImpl.POSTAVWIK_ID_COLUMN_BITMASK |
			OplachennyeZakazyModelImpl.IZVEWENIE_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_POSTAVWIKIDIZVEWENIEID = new FinderPath(OplachennyeZakazyModelImpl.ENTITY_CACHE_ENABLED,
			OplachennyeZakazyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBypostavwikIdIzvewenieId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the oplachennye zakazy where postavwik_id = &#63; and izvewenie_id = &#63; or throws a {@link NoSuchOplachennyeZakazyException} if it could not be found.
	 *
	 * @param postavwik_id the postavwik_id
	 * @param izvewenie_id the izvewenie_id
	 * @return the matching oplachennye zakazy
	 * @throws NoSuchOplachennyeZakazyException if a matching oplachennye zakazy could not be found
	 */
	@Override
	public OplachennyeZakazy findBypostavwikIdIzvewenieId(long postavwik_id,
		long izvewenie_id) throws NoSuchOplachennyeZakazyException {
		OplachennyeZakazy oplachennyeZakazy = fetchBypostavwikIdIzvewenieId(postavwik_id,
				izvewenie_id);

		if (oplachennyeZakazy == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("postavwik_id=");
			msg.append(postavwik_id);

			msg.append(", izvewenie_id=");
			msg.append(izvewenie_id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchOplachennyeZakazyException(msg.toString());
		}

		return oplachennyeZakazy;
	}

	/**
	 * Returns the oplachennye zakazy where postavwik_id = &#63; and izvewenie_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param postavwik_id the postavwik_id
	 * @param izvewenie_id the izvewenie_id
	 * @return the matching oplachennye zakazy, or <code>null</code> if a matching oplachennye zakazy could not be found
	 */
	@Override
	public OplachennyeZakazy fetchBypostavwikIdIzvewenieId(long postavwik_id,
		long izvewenie_id) {
		return fetchBypostavwikIdIzvewenieId(postavwik_id, izvewenie_id, true);
	}

	/**
	 * Returns the oplachennye zakazy where postavwik_id = &#63; and izvewenie_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param postavwik_id the postavwik_id
	 * @param izvewenie_id the izvewenie_id
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching oplachennye zakazy, or <code>null</code> if a matching oplachennye zakazy could not be found
	 */
	@Override
	public OplachennyeZakazy fetchBypostavwikIdIzvewenieId(long postavwik_id,
		long izvewenie_id, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { postavwik_id, izvewenie_id };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_POSTAVWIKIDIZVEWENIEID,
					finderArgs, this);
		}

		if (result instanceof OplachennyeZakazy) {
			OplachennyeZakazy oplachennyeZakazy = (OplachennyeZakazy)result;

			if ((postavwik_id != oplachennyeZakazy.getPostavwik_id()) ||
					(izvewenie_id != oplachennyeZakazy.getIzvewenie_id())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_OPLACHENNYEZAKAZY_WHERE);

			query.append(_FINDER_COLUMN_POSTAVWIKIDIZVEWENIEID_POSTAVWIK_ID_2);

			query.append(_FINDER_COLUMN_POSTAVWIKIDIZVEWENIEID_IZVEWENIE_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(postavwik_id);

				qPos.add(izvewenie_id);

				List<OplachennyeZakazy> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_POSTAVWIKIDIZVEWENIEID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"OplachennyeZakazyPersistenceImpl.fetchBypostavwikIdIzvewenieId(long, long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OplachennyeZakazy oplachennyeZakazy = list.get(0);

					result = oplachennyeZakazy;

					cacheResult(oplachennyeZakazy);

					if ((oplachennyeZakazy.getPostavwik_id() != postavwik_id) ||
							(oplachennyeZakazy.getIzvewenie_id() != izvewenie_id)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_POSTAVWIKIDIZVEWENIEID,
							finderArgs, oplachennyeZakazy);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_POSTAVWIKIDIZVEWENIEID,
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
			return (OplachennyeZakazy)result;
		}
	}

	/**
	 * Removes the oplachennye zakazy where postavwik_id = &#63; and izvewenie_id = &#63; from the database.
	 *
	 * @param postavwik_id the postavwik_id
	 * @param izvewenie_id the izvewenie_id
	 * @return the oplachennye zakazy that was removed
	 */
	@Override
	public OplachennyeZakazy removeBypostavwikIdIzvewenieId(long postavwik_id,
		long izvewenie_id) throws NoSuchOplachennyeZakazyException {
		OplachennyeZakazy oplachennyeZakazy = findBypostavwikIdIzvewenieId(postavwik_id,
				izvewenie_id);

		return remove(oplachennyeZakazy);
	}

	/**
	 * Returns the number of oplachennye zakazies where postavwik_id = &#63; and izvewenie_id = &#63;.
	 *
	 * @param postavwik_id the postavwik_id
	 * @param izvewenie_id the izvewenie_id
	 * @return the number of matching oplachennye zakazies
	 */
	@Override
	public int countBypostavwikIdIzvewenieId(long postavwik_id,
		long izvewenie_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_POSTAVWIKIDIZVEWENIEID;

		Object[] finderArgs = new Object[] { postavwik_id, izvewenie_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_OPLACHENNYEZAKAZY_WHERE);

			query.append(_FINDER_COLUMN_POSTAVWIKIDIZVEWENIEID_POSTAVWIK_ID_2);

			query.append(_FINDER_COLUMN_POSTAVWIKIDIZVEWENIEID_IZVEWENIE_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(postavwik_id);

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

	private static final String _FINDER_COLUMN_POSTAVWIKIDIZVEWENIEID_POSTAVWIK_ID_2 =
		"oplachennyeZakazy.postavwik_id = ? AND ";
	private static final String _FINDER_COLUMN_POSTAVWIKIDIZVEWENIEID_IZVEWENIE_ID_2 =
		"oplachennyeZakazy.izvewenie_id = ?";

	public OplachennyeZakazyPersistenceImpl() {
		setModelClass(OplachennyeZakazy.class);
	}

	/**
	 * Caches the oplachennye zakazy in the entity cache if it is enabled.
	 *
	 * @param oplachennyeZakazy the oplachennye zakazy
	 */
	@Override
	public void cacheResult(OplachennyeZakazy oplachennyeZakazy) {
		entityCache.putResult(OplachennyeZakazyModelImpl.ENTITY_CACHE_ENABLED,
			OplachennyeZakazyImpl.class, oplachennyeZakazy.getPrimaryKey(),
			oplachennyeZakazy);

		finderCache.putResult(FINDER_PATH_FETCH_BY_POSTAVWIKIDIZVEWENIEID,
			new Object[] {
				oplachennyeZakazy.getPostavwik_id(),
				oplachennyeZakazy.getIzvewenie_id()
			}, oplachennyeZakazy);

		oplachennyeZakazy.resetOriginalValues();
	}

	/**
	 * Caches the oplachennye zakazies in the entity cache if it is enabled.
	 *
	 * @param oplachennyeZakazies the oplachennye zakazies
	 */
	@Override
	public void cacheResult(List<OplachennyeZakazy> oplachennyeZakazies) {
		for (OplachennyeZakazy oplachennyeZakazy : oplachennyeZakazies) {
			if (entityCache.getResult(
						OplachennyeZakazyModelImpl.ENTITY_CACHE_ENABLED,
						OplachennyeZakazyImpl.class,
						oplachennyeZakazy.getPrimaryKey()) == null) {
				cacheResult(oplachennyeZakazy);
			}
			else {
				oplachennyeZakazy.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all oplachennye zakazies.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OplachennyeZakazyImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the oplachennye zakazy.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OplachennyeZakazy oplachennyeZakazy) {
		entityCache.removeResult(OplachennyeZakazyModelImpl.ENTITY_CACHE_ENABLED,
			OplachennyeZakazyImpl.class, oplachennyeZakazy.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((OplachennyeZakazyModelImpl)oplachennyeZakazy,
			true);
	}

	@Override
	public void clearCache(List<OplachennyeZakazy> oplachennyeZakazies) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (OplachennyeZakazy oplachennyeZakazy : oplachennyeZakazies) {
			entityCache.removeResult(OplachennyeZakazyModelImpl.ENTITY_CACHE_ENABLED,
				OplachennyeZakazyImpl.class, oplachennyeZakazy.getPrimaryKey());

			clearUniqueFindersCache((OplachennyeZakazyModelImpl)oplachennyeZakazy,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		OplachennyeZakazyModelImpl oplachennyeZakazyModelImpl) {
		Object[] args = new Object[] {
				oplachennyeZakazyModelImpl.getPostavwik_id(),
				oplachennyeZakazyModelImpl.getIzvewenie_id()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_POSTAVWIKIDIZVEWENIEID,
			args, Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_POSTAVWIKIDIZVEWENIEID,
			args, oplachennyeZakazyModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		OplachennyeZakazyModelImpl oplachennyeZakazyModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					oplachennyeZakazyModelImpl.getPostavwik_id(),
					oplachennyeZakazyModelImpl.getIzvewenie_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_POSTAVWIKIDIZVEWENIEID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_POSTAVWIKIDIZVEWENIEID,
				args);
		}

		if ((oplachennyeZakazyModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_POSTAVWIKIDIZVEWENIEID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					oplachennyeZakazyModelImpl.getOriginalPostavwik_id(),
					oplachennyeZakazyModelImpl.getOriginalIzvewenie_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_POSTAVWIKIDIZVEWENIEID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_POSTAVWIKIDIZVEWENIEID,
				args);
		}
	}

	/**
	 * Creates a new oplachennye zakazy with the primary key. Does not add the oplachennye zakazy to the database.
	 *
	 * @param oplachennye_zakazy_id the primary key for the new oplachennye zakazy
	 * @return the new oplachennye zakazy
	 */
	@Override
	public OplachennyeZakazy create(long oplachennye_zakazy_id) {
		OplachennyeZakazy oplachennyeZakazy = new OplachennyeZakazyImpl();

		oplachennyeZakazy.setNew(true);
		oplachennyeZakazy.setPrimaryKey(oplachennye_zakazy_id);

		return oplachennyeZakazy;
	}

	/**
	 * Removes the oplachennye zakazy with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param oplachennye_zakazy_id the primary key of the oplachennye zakazy
	 * @return the oplachennye zakazy that was removed
	 * @throws NoSuchOplachennyeZakazyException if a oplachennye zakazy with the primary key could not be found
	 */
	@Override
	public OplachennyeZakazy remove(long oplachennye_zakazy_id)
		throws NoSuchOplachennyeZakazyException {
		return remove((Serializable)oplachennye_zakazy_id);
	}

	/**
	 * Removes the oplachennye zakazy with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the oplachennye zakazy
	 * @return the oplachennye zakazy that was removed
	 * @throws NoSuchOplachennyeZakazyException if a oplachennye zakazy with the primary key could not be found
	 */
	@Override
	public OplachennyeZakazy remove(Serializable primaryKey)
		throws NoSuchOplachennyeZakazyException {
		Session session = null;

		try {
			session = openSession();

			OplachennyeZakazy oplachennyeZakazy = (OplachennyeZakazy)session.get(OplachennyeZakazyImpl.class,
					primaryKey);

			if (oplachennyeZakazy == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOplachennyeZakazyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(oplachennyeZakazy);
		}
		catch (NoSuchOplachennyeZakazyException nsee) {
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
	protected OplachennyeZakazy removeImpl(OplachennyeZakazy oplachennyeZakazy) {
		oplachennyeZakazy = toUnwrappedModel(oplachennyeZakazy);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(oplachennyeZakazy)) {
				oplachennyeZakazy = (OplachennyeZakazy)session.get(OplachennyeZakazyImpl.class,
						oplachennyeZakazy.getPrimaryKeyObj());
			}

			if (oplachennyeZakazy != null) {
				session.delete(oplachennyeZakazy);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (oplachennyeZakazy != null) {
			clearCache(oplachennyeZakazy);
		}

		return oplachennyeZakazy;
	}

	@Override
	public OplachennyeZakazy updateImpl(OplachennyeZakazy oplachennyeZakazy) {
		oplachennyeZakazy = toUnwrappedModel(oplachennyeZakazy);

		boolean isNew = oplachennyeZakazy.isNew();

		OplachennyeZakazyModelImpl oplachennyeZakazyModelImpl = (OplachennyeZakazyModelImpl)oplachennyeZakazy;

		Session session = null;

		try {
			session = openSession();

			if (oplachennyeZakazy.isNew()) {
				session.save(oplachennyeZakazy);

				oplachennyeZakazy.setNew(false);
			}
			else {
				oplachennyeZakazy = (OplachennyeZakazy)session.merge(oplachennyeZakazy);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !OplachennyeZakazyModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(OplachennyeZakazyModelImpl.ENTITY_CACHE_ENABLED,
			OplachennyeZakazyImpl.class, oplachennyeZakazy.getPrimaryKey(),
			oplachennyeZakazy, false);

		clearUniqueFindersCache(oplachennyeZakazyModelImpl, false);
		cacheUniqueFindersCache(oplachennyeZakazyModelImpl);

		oplachennyeZakazy.resetOriginalValues();

		return oplachennyeZakazy;
	}

	protected OplachennyeZakazy toUnwrappedModel(
		OplachennyeZakazy oplachennyeZakazy) {
		if (oplachennyeZakazy instanceof OplachennyeZakazyImpl) {
			return oplachennyeZakazy;
		}

		OplachennyeZakazyImpl oplachennyeZakazyImpl = new OplachennyeZakazyImpl();

		oplachennyeZakazyImpl.setNew(oplachennyeZakazy.isNew());
		oplachennyeZakazyImpl.setPrimaryKey(oplachennyeZakazy.getPrimaryKey());

		oplachennyeZakazyImpl.setOplachennye_zakazy_id(oplachennyeZakazy.getOplachennye_zakazy_id());
		oplachennyeZakazyImpl.setTranzakcija(oplachennyeZakazy.getTranzakcija());
		oplachennyeZakazyImpl.setIzvewenie_id(oplachennyeZakazy.getIzvewenie_id());
		oplachennyeZakazyImpl.setPostavwik_id(oplachennyeZakazy.getPostavwik_id());
		oplachennyeZakazyImpl.setSumma(oplachennyeZakazy.getSumma());
		oplachennyeZakazyImpl.setOplatil(oplachennyeZakazy.getOplatil());
		oplachennyeZakazyImpl.setData_oplaty(oplachennyeZakazy.getData_oplaty());

		return oplachennyeZakazyImpl;
	}

	/**
	 * Returns the oplachennye zakazy with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the oplachennye zakazy
	 * @return the oplachennye zakazy
	 * @throws NoSuchOplachennyeZakazyException if a oplachennye zakazy with the primary key could not be found
	 */
	@Override
	public OplachennyeZakazy findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOplachennyeZakazyException {
		OplachennyeZakazy oplachennyeZakazy = fetchByPrimaryKey(primaryKey);

		if (oplachennyeZakazy == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOplachennyeZakazyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return oplachennyeZakazy;
	}

	/**
	 * Returns the oplachennye zakazy with the primary key or throws a {@link NoSuchOplachennyeZakazyException} if it could not be found.
	 *
	 * @param oplachennye_zakazy_id the primary key of the oplachennye zakazy
	 * @return the oplachennye zakazy
	 * @throws NoSuchOplachennyeZakazyException if a oplachennye zakazy with the primary key could not be found
	 */
	@Override
	public OplachennyeZakazy findByPrimaryKey(long oplachennye_zakazy_id)
		throws NoSuchOplachennyeZakazyException {
		return findByPrimaryKey((Serializable)oplachennye_zakazy_id);
	}

	/**
	 * Returns the oplachennye zakazy with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the oplachennye zakazy
	 * @return the oplachennye zakazy, or <code>null</code> if a oplachennye zakazy with the primary key could not be found
	 */
	@Override
	public OplachennyeZakazy fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(OplachennyeZakazyModelImpl.ENTITY_CACHE_ENABLED,
				OplachennyeZakazyImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		OplachennyeZakazy oplachennyeZakazy = (OplachennyeZakazy)serializable;

		if (oplachennyeZakazy == null) {
			Session session = null;

			try {
				session = openSession();

				oplachennyeZakazy = (OplachennyeZakazy)session.get(OplachennyeZakazyImpl.class,
						primaryKey);

				if (oplachennyeZakazy != null) {
					cacheResult(oplachennyeZakazy);
				}
				else {
					entityCache.putResult(OplachennyeZakazyModelImpl.ENTITY_CACHE_ENABLED,
						OplachennyeZakazyImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(OplachennyeZakazyModelImpl.ENTITY_CACHE_ENABLED,
					OplachennyeZakazyImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return oplachennyeZakazy;
	}

	/**
	 * Returns the oplachennye zakazy with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param oplachennye_zakazy_id the primary key of the oplachennye zakazy
	 * @return the oplachennye zakazy, or <code>null</code> if a oplachennye zakazy with the primary key could not be found
	 */
	@Override
	public OplachennyeZakazy fetchByPrimaryKey(long oplachennye_zakazy_id) {
		return fetchByPrimaryKey((Serializable)oplachennye_zakazy_id);
	}

	@Override
	public Map<Serializable, OplachennyeZakazy> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, OplachennyeZakazy> map = new HashMap<Serializable, OplachennyeZakazy>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			OplachennyeZakazy oplachennyeZakazy = fetchByPrimaryKey(primaryKey);

			if (oplachennyeZakazy != null) {
				map.put(primaryKey, oplachennyeZakazy);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(OplachennyeZakazyModelImpl.ENTITY_CACHE_ENABLED,
					OplachennyeZakazyImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (OplachennyeZakazy)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_OPLACHENNYEZAKAZY_WHERE_PKS_IN);

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

			for (OplachennyeZakazy oplachennyeZakazy : (List<OplachennyeZakazy>)q.list()) {
				map.put(oplachennyeZakazy.getPrimaryKeyObj(), oplachennyeZakazy);

				cacheResult(oplachennyeZakazy);

				uncachedPrimaryKeys.remove(oplachennyeZakazy.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(OplachennyeZakazyModelImpl.ENTITY_CACHE_ENABLED,
					OplachennyeZakazyImpl.class, primaryKey, nullModel);
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
	 * Returns all the oplachennye zakazies.
	 *
	 * @return the oplachennye zakazies
	 */
	@Override
	public List<OplachennyeZakazy> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the oplachennye zakazies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OplachennyeZakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of oplachennye zakazies
	 * @param end the upper bound of the range of oplachennye zakazies (not inclusive)
	 * @return the range of oplachennye zakazies
	 */
	@Override
	public List<OplachennyeZakazy> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the oplachennye zakazies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OplachennyeZakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of oplachennye zakazies
	 * @param end the upper bound of the range of oplachennye zakazies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of oplachennye zakazies
	 */
	@Override
	public List<OplachennyeZakazy> findAll(int start, int end,
		OrderByComparator<OplachennyeZakazy> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the oplachennye zakazies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OplachennyeZakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of oplachennye zakazies
	 * @param end the upper bound of the range of oplachennye zakazies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of oplachennye zakazies
	 */
	@Override
	public List<OplachennyeZakazy> findAll(int start, int end,
		OrderByComparator<OplachennyeZakazy> orderByComparator,
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

		List<OplachennyeZakazy> list = null;

		if (retrieveFromCache) {
			list = (List<OplachennyeZakazy>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_OPLACHENNYEZAKAZY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OPLACHENNYEZAKAZY;

				if (pagination) {
					sql = sql.concat(OplachennyeZakazyModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<OplachennyeZakazy>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<OplachennyeZakazy>)QueryUtil.list(q,
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
	 * Removes all the oplachennye zakazies from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OplachennyeZakazy oplachennyeZakazy : findAll()) {
			remove(oplachennyeZakazy);
		}
	}

	/**
	 * Returns the number of oplachennye zakazies.
	 *
	 * @return the number of oplachennye zakazies
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_OPLACHENNYEZAKAZY);

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
		return OplachennyeZakazyModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the oplachennye zakazy persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(OplachennyeZakazyImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_OPLACHENNYEZAKAZY = "SELECT oplachennyeZakazy FROM OplachennyeZakazy oplachennyeZakazy";
	private static final String _SQL_SELECT_OPLACHENNYEZAKAZY_WHERE_PKS_IN = "SELECT oplachennyeZakazy FROM OplachennyeZakazy oplachennyeZakazy WHERE oplachennye_zakazy_id IN (";
	private static final String _SQL_SELECT_OPLACHENNYEZAKAZY_WHERE = "SELECT oplachennyeZakazy FROM OplachennyeZakazy oplachennyeZakazy WHERE ";
	private static final String _SQL_COUNT_OPLACHENNYEZAKAZY = "SELECT COUNT(oplachennyeZakazy) FROM OplachennyeZakazy oplachennyeZakazy";
	private static final String _SQL_COUNT_OPLACHENNYEZAKAZY_WHERE = "SELECT COUNT(oplachennyeZakazy) FROM OplachennyeZakazy oplachennyeZakazy WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "oplachennyeZakazy.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No OplachennyeZakazy exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No OplachennyeZakazy exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(OplachennyeZakazyPersistenceImpl.class);
}