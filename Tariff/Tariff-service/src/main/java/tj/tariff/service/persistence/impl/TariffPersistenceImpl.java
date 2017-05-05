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

package tj.tariff.service.persistence.impl;

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

import tj.tariff.exception.NoSuchTariffException;

import tj.tariff.model.Tariff;
import tj.tariff.model.impl.TariffImpl;
import tj.tariff.model.impl.TariffModelImpl;

import tj.tariff.service.persistence.TariffPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the tariff service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TariffPersistence
 * @see tj.tariff.service.persistence.TariffUtil
 * @generated
 */
@ProviderType
public class TariffPersistenceImpl extends BasePersistenceImpl<Tariff>
	implements TariffPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TariffUtil} to access the tariff persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TariffImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TariffModelImpl.ENTITY_CACHE_ENABLED,
			TariffModelImpl.FINDER_CACHE_ENABLED, TariffImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TariffModelImpl.ENTITY_CACHE_ENABLED,
			TariffModelImpl.FINDER_CACHE_ENABLED, TariffImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TariffModelImpl.ENTITY_CACHE_ENABLED,
			TariffModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_REGIONIDTYPETARIFF = new FinderPath(TariffModelImpl.ENTITY_CACHE_ENABLED,
			TariffModelImpl.FINDER_CACHE_ENABLED, TariffImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByregionIdTypeTariff",
			new String[] { Long.class.getName(), Integer.class.getName() },
			TariffModelImpl.REGION_ID_COLUMN_BITMASK |
			TariffModelImpl.TYPE_TARIFF_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REGIONIDTYPETARIFF = new FinderPath(TariffModelImpl.ENTITY_CACHE_ENABLED,
			TariffModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByregionIdTypeTariff",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns the tariff where region_id = &#63; and type_tariff = &#63; or throws a {@link NoSuchTariffException} if it could not be found.
	 *
	 * @param region_id the region_id
	 * @param type_tariff the type_tariff
	 * @return the matching tariff
	 * @throws NoSuchTariffException if a matching tariff could not be found
	 */
	@Override
	public Tariff findByregionIdTypeTariff(long region_id, int type_tariff)
		throws NoSuchTariffException {
		Tariff tariff = fetchByregionIdTypeTariff(region_id, type_tariff);

		if (tariff == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("region_id=");
			msg.append(region_id);

			msg.append(", type_tariff=");
			msg.append(type_tariff);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchTariffException(msg.toString());
		}

		return tariff;
	}

	/**
	 * Returns the tariff where region_id = &#63; and type_tariff = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param region_id the region_id
	 * @param type_tariff the type_tariff
	 * @return the matching tariff, or <code>null</code> if a matching tariff could not be found
	 */
	@Override
	public Tariff fetchByregionIdTypeTariff(long region_id, int type_tariff) {
		return fetchByregionIdTypeTariff(region_id, type_tariff, true);
	}

	/**
	 * Returns the tariff where region_id = &#63; and type_tariff = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param region_id the region_id
	 * @param type_tariff the type_tariff
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching tariff, or <code>null</code> if a matching tariff could not be found
	 */
	@Override
	public Tariff fetchByregionIdTypeTariff(long region_id, int type_tariff,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { region_id, type_tariff };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_REGIONIDTYPETARIFF,
					finderArgs, this);
		}

		if (result instanceof Tariff) {
			Tariff tariff = (Tariff)result;

			if ((region_id != tariff.getRegion_id()) ||
					(type_tariff != tariff.getType_tariff())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TARIFF_WHERE);

			query.append(_FINDER_COLUMN_REGIONIDTYPETARIFF_REGION_ID_2);

			query.append(_FINDER_COLUMN_REGIONIDTYPETARIFF_TYPE_TARIFF_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(region_id);

				qPos.add(type_tariff);

				List<Tariff> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_REGIONIDTYPETARIFF,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"TariffPersistenceImpl.fetchByregionIdTypeTariff(long, int, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					Tariff tariff = list.get(0);

					result = tariff;

					cacheResult(tariff);

					if ((tariff.getRegion_id() != region_id) ||
							(tariff.getType_tariff() != type_tariff)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_REGIONIDTYPETARIFF,
							finderArgs, tariff);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_REGIONIDTYPETARIFF,
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
			return (Tariff)result;
		}
	}

	/**
	 * Removes the tariff where region_id = &#63; and type_tariff = &#63; from the database.
	 *
	 * @param region_id the region_id
	 * @param type_tariff the type_tariff
	 * @return the tariff that was removed
	 */
	@Override
	public Tariff removeByregionIdTypeTariff(long region_id, int type_tariff)
		throws NoSuchTariffException {
		Tariff tariff = findByregionIdTypeTariff(region_id, type_tariff);

		return remove(tariff);
	}

	/**
	 * Returns the number of tariffs where region_id = &#63; and type_tariff = &#63;.
	 *
	 * @param region_id the region_id
	 * @param type_tariff the type_tariff
	 * @return the number of matching tariffs
	 */
	@Override
	public int countByregionIdTypeTariff(long region_id, int type_tariff) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REGIONIDTYPETARIFF;

		Object[] finderArgs = new Object[] { region_id, type_tariff };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TARIFF_WHERE);

			query.append(_FINDER_COLUMN_REGIONIDTYPETARIFF_REGION_ID_2);

			query.append(_FINDER_COLUMN_REGIONIDTYPETARIFF_TYPE_TARIFF_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(region_id);

				qPos.add(type_tariff);

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

	private static final String _FINDER_COLUMN_REGIONIDTYPETARIFF_REGION_ID_2 = "tariff.region_id = ? AND ";
	private static final String _FINDER_COLUMN_REGIONIDTYPETARIFF_TYPE_TARIFF_2 = "tariff.type_tariff = ?";

	public TariffPersistenceImpl() {
		setModelClass(Tariff.class);
	}

	/**
	 * Caches the tariff in the entity cache if it is enabled.
	 *
	 * @param tariff the tariff
	 */
	@Override
	public void cacheResult(Tariff tariff) {
		entityCache.putResult(TariffModelImpl.ENTITY_CACHE_ENABLED,
			TariffImpl.class, tariff.getPrimaryKey(), tariff);

		finderCache.putResult(FINDER_PATH_FETCH_BY_REGIONIDTYPETARIFF,
			new Object[] { tariff.getRegion_id(), tariff.getType_tariff() },
			tariff);

		tariff.resetOriginalValues();
	}

	/**
	 * Caches the tariffs in the entity cache if it is enabled.
	 *
	 * @param tariffs the tariffs
	 */
	@Override
	public void cacheResult(List<Tariff> tariffs) {
		for (Tariff tariff : tariffs) {
			if (entityCache.getResult(TariffModelImpl.ENTITY_CACHE_ENABLED,
						TariffImpl.class, tariff.getPrimaryKey()) == null) {
				cacheResult(tariff);
			}
			else {
				tariff.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tariffs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TariffImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tariff.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Tariff tariff) {
		entityCache.removeResult(TariffModelImpl.ENTITY_CACHE_ENABLED,
			TariffImpl.class, tariff.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((TariffModelImpl)tariff, true);
	}

	@Override
	public void clearCache(List<Tariff> tariffs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Tariff tariff : tariffs) {
			entityCache.removeResult(TariffModelImpl.ENTITY_CACHE_ENABLED,
				TariffImpl.class, tariff.getPrimaryKey());

			clearUniqueFindersCache((TariffModelImpl)tariff, true);
		}
	}

	protected void cacheUniqueFindersCache(TariffModelImpl tariffModelImpl) {
		Object[] args = new Object[] {
				tariffModelImpl.getRegion_id(), tariffModelImpl.getType_tariff()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_REGIONIDTYPETARIFF, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_REGIONIDTYPETARIFF, args,
			tariffModelImpl, false);
	}

	protected void clearUniqueFindersCache(TariffModelImpl tariffModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					tariffModelImpl.getRegion_id(),
					tariffModelImpl.getType_tariff()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_REGIONIDTYPETARIFF,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_REGIONIDTYPETARIFF,
				args);
		}

		if ((tariffModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_REGIONIDTYPETARIFF.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					tariffModelImpl.getOriginalRegion_id(),
					tariffModelImpl.getOriginalType_tariff()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_REGIONIDTYPETARIFF,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_REGIONIDTYPETARIFF,
				args);
		}
	}

	/**
	 * Creates a new tariff with the primary key. Does not add the tariff to the database.
	 *
	 * @param tariff_id the primary key for the new tariff
	 * @return the new tariff
	 */
	@Override
	public Tariff create(long tariff_id) {
		Tariff tariff = new TariffImpl();

		tariff.setNew(true);
		tariff.setPrimaryKey(tariff_id);

		return tariff;
	}

	/**
	 * Removes the tariff with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tariff_id the primary key of the tariff
	 * @return the tariff that was removed
	 * @throws NoSuchTariffException if a tariff with the primary key could not be found
	 */
	@Override
	public Tariff remove(long tariff_id) throws NoSuchTariffException {
		return remove((Serializable)tariff_id);
	}

	/**
	 * Removes the tariff with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tariff
	 * @return the tariff that was removed
	 * @throws NoSuchTariffException if a tariff with the primary key could not be found
	 */
	@Override
	public Tariff remove(Serializable primaryKey) throws NoSuchTariffException {
		Session session = null;

		try {
			session = openSession();

			Tariff tariff = (Tariff)session.get(TariffImpl.class, primaryKey);

			if (tariff == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTariffException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tariff);
		}
		catch (NoSuchTariffException nsee) {
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
	protected Tariff removeImpl(Tariff tariff) {
		tariff = toUnwrappedModel(tariff);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tariff)) {
				tariff = (Tariff)session.get(TariffImpl.class,
						tariff.getPrimaryKeyObj());
			}

			if (tariff != null) {
				session.delete(tariff);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tariff != null) {
			clearCache(tariff);
		}

		return tariff;
	}

	@Override
	public Tariff updateImpl(Tariff tariff) {
		tariff = toUnwrappedModel(tariff);

		boolean isNew = tariff.isNew();

		TariffModelImpl tariffModelImpl = (TariffModelImpl)tariff;

		Session session = null;

		try {
			session = openSession();

			if (tariff.isNew()) {
				session.save(tariff);

				tariff.setNew(false);
			}
			else {
				tariff = (Tariff)session.merge(tariff);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TariffModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(TariffModelImpl.ENTITY_CACHE_ENABLED,
			TariffImpl.class, tariff.getPrimaryKey(), tariff, false);

		clearUniqueFindersCache(tariffModelImpl, false);
		cacheUniqueFindersCache(tariffModelImpl);

		tariff.resetOriginalValues();

		return tariff;
	}

	protected Tariff toUnwrappedModel(Tariff tariff) {
		if (tariff instanceof TariffImpl) {
			return tariff;
		}

		TariffImpl tariffImpl = new TariffImpl();

		tariffImpl.setNew(tariff.isNew());
		tariffImpl.setPrimaryKey(tariff.getPrimaryKey());

		tariffImpl.setTariff_id(tariff.getTariff_id());
		tariffImpl.setRegion_id(tariff.getRegion_id());
		tariffImpl.setType_tariff(tariff.getType_tariff());
		tariffImpl.setTariff_value(tariff.getTariff_value());

		return tariffImpl;
	}

	/**
	 * Returns the tariff with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tariff
	 * @return the tariff
	 * @throws NoSuchTariffException if a tariff with the primary key could not be found
	 */
	@Override
	public Tariff findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTariffException {
		Tariff tariff = fetchByPrimaryKey(primaryKey);

		if (tariff == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTariffException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tariff;
	}

	/**
	 * Returns the tariff with the primary key or throws a {@link NoSuchTariffException} if it could not be found.
	 *
	 * @param tariff_id the primary key of the tariff
	 * @return the tariff
	 * @throws NoSuchTariffException if a tariff with the primary key could not be found
	 */
	@Override
	public Tariff findByPrimaryKey(long tariff_id) throws NoSuchTariffException {
		return findByPrimaryKey((Serializable)tariff_id);
	}

	/**
	 * Returns the tariff with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tariff
	 * @return the tariff, or <code>null</code> if a tariff with the primary key could not be found
	 */
	@Override
	public Tariff fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(TariffModelImpl.ENTITY_CACHE_ENABLED,
				TariffImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Tariff tariff = (Tariff)serializable;

		if (tariff == null) {
			Session session = null;

			try {
				session = openSession();

				tariff = (Tariff)session.get(TariffImpl.class, primaryKey);

				if (tariff != null) {
					cacheResult(tariff);
				}
				else {
					entityCache.putResult(TariffModelImpl.ENTITY_CACHE_ENABLED,
						TariffImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(TariffModelImpl.ENTITY_CACHE_ENABLED,
					TariffImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tariff;
	}

	/**
	 * Returns the tariff with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tariff_id the primary key of the tariff
	 * @return the tariff, or <code>null</code> if a tariff with the primary key could not be found
	 */
	@Override
	public Tariff fetchByPrimaryKey(long tariff_id) {
		return fetchByPrimaryKey((Serializable)tariff_id);
	}

	@Override
	public Map<Serializable, Tariff> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Tariff> map = new HashMap<Serializable, Tariff>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Tariff tariff = fetchByPrimaryKey(primaryKey);

			if (tariff != null) {
				map.put(primaryKey, tariff);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(TariffModelImpl.ENTITY_CACHE_ENABLED,
					TariffImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Tariff)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TARIFF_WHERE_PKS_IN);

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

			for (Tariff tariff : (List<Tariff>)q.list()) {
				map.put(tariff.getPrimaryKeyObj(), tariff);

				cacheResult(tariff);

				uncachedPrimaryKeys.remove(tariff.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(TariffModelImpl.ENTITY_CACHE_ENABLED,
					TariffImpl.class, primaryKey, nullModel);
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
	 * Returns all the tariffs.
	 *
	 * @return the tariffs
	 */
	@Override
	public List<Tariff> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tariffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TariffModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tariffs
	 * @param end the upper bound of the range of tariffs (not inclusive)
	 * @return the range of tariffs
	 */
	@Override
	public List<Tariff> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tariffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TariffModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tariffs
	 * @param end the upper bound of the range of tariffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tariffs
	 */
	@Override
	public List<Tariff> findAll(int start, int end,
		OrderByComparator<Tariff> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tariffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TariffModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tariffs
	 * @param end the upper bound of the range of tariffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of tariffs
	 */
	@Override
	public List<Tariff> findAll(int start, int end,
		OrderByComparator<Tariff> orderByComparator, boolean retrieveFromCache) {
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

		List<Tariff> list = null;

		if (retrieveFromCache) {
			list = (List<Tariff>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TARIFF);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TARIFF;

				if (pagination) {
					sql = sql.concat(TariffModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Tariff>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Tariff>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the tariffs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Tariff tariff : findAll()) {
			remove(tariff);
		}
	}

	/**
	 * Returns the number of tariffs.
	 *
	 * @return the number of tariffs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TARIFF);

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
		return TariffModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tariff persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(TariffImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_TARIFF = "SELECT tariff FROM Tariff tariff";
	private static final String _SQL_SELECT_TARIFF_WHERE_PKS_IN = "SELECT tariff FROM Tariff tariff WHERE tariff_id IN (";
	private static final String _SQL_SELECT_TARIFF_WHERE = "SELECT tariff FROM Tariff tariff WHERE ";
	private static final String _SQL_COUNT_TARIFF = "SELECT COUNT(tariff) FROM Tariff tariff";
	private static final String _SQL_COUNT_TARIFF_WHERE = "SELECT COUNT(tariff) FROM Tariff tariff WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tariff.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Tariff exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Tariff exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(TariffPersistenceImpl.class);
}