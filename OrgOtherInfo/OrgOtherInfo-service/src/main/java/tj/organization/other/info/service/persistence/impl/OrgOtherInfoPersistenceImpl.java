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

package tj.organization.other.info.service.persistence.impl;

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

import tj.organization.other.info.exception.NoSuchOrgOtherInfoException;
import tj.organization.other.info.model.OrgOtherInfo;
import tj.organization.other.info.model.impl.OrgOtherInfoImpl;
import tj.organization.other.info.model.impl.OrgOtherInfoModelImpl;
import tj.organization.other.info.service.persistence.OrgOtherInfoPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the org other info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OrgOtherInfoPersistence
 * @see tj.organization.other.info.service.persistence.OrgOtherInfoUtil
 * @generated
 */
@ProviderType
public class OrgOtherInfoPersistenceImpl extends BasePersistenceImpl<OrgOtherInfo>
	implements OrgOtherInfoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OrgOtherInfoUtil} to access the org other info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OrgOtherInfoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OrgOtherInfoModelImpl.ENTITY_CACHE_ENABLED,
			OrgOtherInfoModelImpl.FINDER_CACHE_ENABLED, OrgOtherInfoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OrgOtherInfoModelImpl.ENTITY_CACHE_ENABLED,
			OrgOtherInfoModelImpl.FINDER_CACHE_ENABLED, OrgOtherInfoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OrgOtherInfoModelImpl.ENTITY_CACHE_ENABLED,
			OrgOtherInfoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_INN = new FinderPath(OrgOtherInfoModelImpl.ENTITY_CACHE_ENABLED,
			OrgOtherInfoModelImpl.FINDER_CACHE_ENABLED, OrgOtherInfoImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByinn",
			new String[] { String.class.getName() },
			OrgOtherInfoModelImpl.INN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INN = new FinderPath(OrgOtherInfoModelImpl.ENTITY_CACHE_ENABLED,
			OrgOtherInfoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByinn",
			new String[] { String.class.getName() });

	/**
	 * Returns the org other info where inn = &#63; or throws a {@link NoSuchOrgOtherInfoException} if it could not be found.
	 *
	 * @param inn the inn
	 * @return the matching org other info
	 * @throws NoSuchOrgOtherInfoException if a matching org other info could not be found
	 */
	@Override
	public OrgOtherInfo findByinn(String inn)
		throws NoSuchOrgOtherInfoException {
		OrgOtherInfo orgOtherInfo = fetchByinn(inn);

		if (orgOtherInfo == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("inn=");
			msg.append(inn);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchOrgOtherInfoException(msg.toString());
		}

		return orgOtherInfo;
	}

	/**
	 * Returns the org other info where inn = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param inn the inn
	 * @return the matching org other info, or <code>null</code> if a matching org other info could not be found
	 */
	@Override
	public OrgOtherInfo fetchByinn(String inn) {
		return fetchByinn(inn, true);
	}

	/**
	 * Returns the org other info where inn = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param inn the inn
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching org other info, or <code>null</code> if a matching org other info could not be found
	 */
	@Override
	public OrgOtherInfo fetchByinn(String inn, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { inn };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_INN,
					finderArgs, this);
		}

		if (result instanceof OrgOtherInfo) {
			OrgOtherInfo orgOtherInfo = (OrgOtherInfo)result;

			if (!Objects.equals(inn, orgOtherInfo.getInn())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_ORGOTHERINFO_WHERE);

			boolean bindInn = false;

			if (inn == null) {
				query.append(_FINDER_COLUMN_INN_INN_1);
			}
			else if (inn.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INN_INN_3);
			}
			else {
				bindInn = true;

				query.append(_FINDER_COLUMN_INN_INN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindInn) {
					qPos.add(inn);
				}

				List<OrgOtherInfo> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_INN, finderArgs,
						list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"OrgOtherInfoPersistenceImpl.fetchByinn(String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OrgOtherInfo orgOtherInfo = list.get(0);

					result = orgOtherInfo;

					cacheResult(orgOtherInfo);

					if ((orgOtherInfo.getInn() == null) ||
							!orgOtherInfo.getInn().equals(inn)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_INN,
							finderArgs, orgOtherInfo);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_INN, finderArgs);

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
			return (OrgOtherInfo)result;
		}
	}

	/**
	 * Removes the org other info where inn = &#63; from the database.
	 *
	 * @param inn the inn
	 * @return the org other info that was removed
	 */
	@Override
	public OrgOtherInfo removeByinn(String inn)
		throws NoSuchOrgOtherInfoException {
		OrgOtherInfo orgOtherInfo = findByinn(inn);

		return remove(orgOtherInfo);
	}

	/**
	 * Returns the number of org other infos where inn = &#63;.
	 *
	 * @param inn the inn
	 * @return the number of matching org other infos
	 */
	@Override
	public int countByinn(String inn) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INN;

		Object[] finderArgs = new Object[] { inn };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ORGOTHERINFO_WHERE);

			boolean bindInn = false;

			if (inn == null) {
				query.append(_FINDER_COLUMN_INN_INN_1);
			}
			else if (inn.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INN_INN_3);
			}
			else {
				bindInn = true;

				query.append(_FINDER_COLUMN_INN_INN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindInn) {
					qPos.add(inn);
				}

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

	private static final String _FINDER_COLUMN_INN_INN_1 = "orgOtherInfo.inn IS NULL";
	private static final String _FINDER_COLUMN_INN_INN_2 = "orgOtherInfo.inn = ?";
	private static final String _FINDER_COLUMN_INN_INN_3 = "(orgOtherInfo.inn IS NULL OR orgOtherInfo.inn = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_ORGOTHERINFOID = new FinderPath(OrgOtherInfoModelImpl.ENTITY_CACHE_ENABLED,
			OrgOtherInfoModelImpl.FINDER_CACHE_ENABLED, OrgOtherInfoImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByOrgOtherInfoId",
			new String[] { Long.class.getName() },
			OrgOtherInfoModelImpl.ORGANIZATION_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORGOTHERINFOID = new FinderPath(OrgOtherInfoModelImpl.ENTITY_CACHE_ENABLED,
			OrgOtherInfoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOrgOtherInfoId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the org other info where organization_id = &#63; or throws a {@link NoSuchOrgOtherInfoException} if it could not be found.
	 *
	 * @param organization_id the organization_id
	 * @return the matching org other info
	 * @throws NoSuchOrgOtherInfoException if a matching org other info could not be found
	 */
	@Override
	public OrgOtherInfo findByOrgOtherInfoId(long organization_id)
		throws NoSuchOrgOtherInfoException {
		OrgOtherInfo orgOtherInfo = fetchByOrgOtherInfoId(organization_id);

		if (orgOtherInfo == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("organization_id=");
			msg.append(organization_id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchOrgOtherInfoException(msg.toString());
		}

		return orgOtherInfo;
	}

	/**
	 * Returns the org other info where organization_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param organization_id the organization_id
	 * @return the matching org other info, or <code>null</code> if a matching org other info could not be found
	 */
	@Override
	public OrgOtherInfo fetchByOrgOtherInfoId(long organization_id) {
		return fetchByOrgOtherInfoId(organization_id, true);
	}

	/**
	 * Returns the org other info where organization_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param organization_id the organization_id
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching org other info, or <code>null</code> if a matching org other info could not be found
	 */
	@Override
	public OrgOtherInfo fetchByOrgOtherInfoId(long organization_id,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { organization_id };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_ORGOTHERINFOID,
					finderArgs, this);
		}

		if (result instanceof OrgOtherInfo) {
			OrgOtherInfo orgOtherInfo = (OrgOtherInfo)result;

			if ((organization_id != orgOtherInfo.getOrganization_id())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_ORGOTHERINFO_WHERE);

			query.append(_FINDER_COLUMN_ORGOTHERINFOID_ORGANIZATION_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organization_id);

				List<OrgOtherInfo> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_ORGOTHERINFOID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"OrgOtherInfoPersistenceImpl.fetchByOrgOtherInfoId(long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OrgOtherInfo orgOtherInfo = list.get(0);

					result = orgOtherInfo;

					cacheResult(orgOtherInfo);

					if ((orgOtherInfo.getOrganization_id() != organization_id)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_ORGOTHERINFOID,
							finderArgs, orgOtherInfo);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_ORGOTHERINFOID,
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
			return (OrgOtherInfo)result;
		}
	}

	/**
	 * Removes the org other info where organization_id = &#63; from the database.
	 *
	 * @param organization_id the organization_id
	 * @return the org other info that was removed
	 */
	@Override
	public OrgOtherInfo removeByOrgOtherInfoId(long organization_id)
		throws NoSuchOrgOtherInfoException {
		OrgOtherInfo orgOtherInfo = findByOrgOtherInfoId(organization_id);

		return remove(orgOtherInfo);
	}

	/**
	 * Returns the number of org other infos where organization_id = &#63;.
	 *
	 * @param organization_id the organization_id
	 * @return the number of matching org other infos
	 */
	@Override
	public int countByOrgOtherInfoId(long organization_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ORGOTHERINFOID;

		Object[] finderArgs = new Object[] { organization_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ORGOTHERINFO_WHERE);

			query.append(_FINDER_COLUMN_ORGOTHERINFOID_ORGANIZATION_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organization_id);

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

	private static final String _FINDER_COLUMN_ORGOTHERINFOID_ORGANIZATION_ID_2 = "orgOtherInfo.organization_id = ?";

	public OrgOtherInfoPersistenceImpl() {
		setModelClass(OrgOtherInfo.class);
	}

	/**
	 * Caches the org other info in the entity cache if it is enabled.
	 *
	 * @param orgOtherInfo the org other info
	 */
	@Override
	public void cacheResult(OrgOtherInfo orgOtherInfo) {
		entityCache.putResult(OrgOtherInfoModelImpl.ENTITY_CACHE_ENABLED,
			OrgOtherInfoImpl.class, orgOtherInfo.getPrimaryKey(), orgOtherInfo);

		finderCache.putResult(FINDER_PATH_FETCH_BY_INN,
			new Object[] { orgOtherInfo.getInn() }, orgOtherInfo);

		finderCache.putResult(FINDER_PATH_FETCH_BY_ORGOTHERINFOID,
			new Object[] { orgOtherInfo.getOrganization_id() }, orgOtherInfo);

		orgOtherInfo.resetOriginalValues();
	}

	/**
	 * Caches the org other infos in the entity cache if it is enabled.
	 *
	 * @param orgOtherInfos the org other infos
	 */
	@Override
	public void cacheResult(List<OrgOtherInfo> orgOtherInfos) {
		for (OrgOtherInfo orgOtherInfo : orgOtherInfos) {
			if (entityCache.getResult(
						OrgOtherInfoModelImpl.ENTITY_CACHE_ENABLED,
						OrgOtherInfoImpl.class, orgOtherInfo.getPrimaryKey()) == null) {
				cacheResult(orgOtherInfo);
			}
			else {
				orgOtherInfo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all org other infos.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OrgOtherInfoImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the org other info.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OrgOtherInfo orgOtherInfo) {
		entityCache.removeResult(OrgOtherInfoModelImpl.ENTITY_CACHE_ENABLED,
			OrgOtherInfoImpl.class, orgOtherInfo.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((OrgOtherInfoModelImpl)orgOtherInfo, true);
	}

	@Override
	public void clearCache(List<OrgOtherInfo> orgOtherInfos) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (OrgOtherInfo orgOtherInfo : orgOtherInfos) {
			entityCache.removeResult(OrgOtherInfoModelImpl.ENTITY_CACHE_ENABLED,
				OrgOtherInfoImpl.class, orgOtherInfo.getPrimaryKey());

			clearUniqueFindersCache((OrgOtherInfoModelImpl)orgOtherInfo, true);
		}
	}

	protected void cacheUniqueFindersCache(
		OrgOtherInfoModelImpl orgOtherInfoModelImpl) {
		Object[] args = new Object[] { orgOtherInfoModelImpl.getInn() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_INN, args, Long.valueOf(1),
			false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_INN, args,
			orgOtherInfoModelImpl, false);

		args = new Object[] { orgOtherInfoModelImpl.getOrganization_id() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_ORGOTHERINFOID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_ORGOTHERINFOID, args,
			orgOtherInfoModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		OrgOtherInfoModelImpl orgOtherInfoModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] { orgOtherInfoModelImpl.getInn() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_INN, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_INN, args);
		}

		if ((orgOtherInfoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_INN.getColumnBitmask()) != 0) {
			Object[] args = new Object[] { orgOtherInfoModelImpl.getOriginalInn() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_INN, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_INN, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					orgOtherInfoModelImpl.getOrganization_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ORGOTHERINFOID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_ORGOTHERINFOID, args);
		}

		if ((orgOtherInfoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_ORGOTHERINFOID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					orgOtherInfoModelImpl.getOriginalOrganization_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ORGOTHERINFOID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_ORGOTHERINFOID, args);
		}
	}

	/**
	 * Creates a new org other info with the primary key. Does not add the org other info to the database.
	 *
	 * @param organization_id the primary key for the new org other info
	 * @return the new org other info
	 */
	@Override
	public OrgOtherInfo create(long organization_id) {
		OrgOtherInfo orgOtherInfo = new OrgOtherInfoImpl();

		orgOtherInfo.setNew(true);
		orgOtherInfo.setPrimaryKey(organization_id);

		return orgOtherInfo;
	}

	/**
	 * Removes the org other info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param organization_id the primary key of the org other info
	 * @return the org other info that was removed
	 * @throws NoSuchOrgOtherInfoException if a org other info with the primary key could not be found
	 */
	@Override
	public OrgOtherInfo remove(long organization_id)
		throws NoSuchOrgOtherInfoException {
		return remove((Serializable)organization_id);
	}

	/**
	 * Removes the org other info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the org other info
	 * @return the org other info that was removed
	 * @throws NoSuchOrgOtherInfoException if a org other info with the primary key could not be found
	 */
	@Override
	public OrgOtherInfo remove(Serializable primaryKey)
		throws NoSuchOrgOtherInfoException {
		Session session = null;

		try {
			session = openSession();

			OrgOtherInfo orgOtherInfo = (OrgOtherInfo)session.get(OrgOtherInfoImpl.class,
					primaryKey);

			if (orgOtherInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOrgOtherInfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(orgOtherInfo);
		}
		catch (NoSuchOrgOtherInfoException nsee) {
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
	protected OrgOtherInfo removeImpl(OrgOtherInfo orgOtherInfo) {
		orgOtherInfo = toUnwrappedModel(orgOtherInfo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(orgOtherInfo)) {
				orgOtherInfo = (OrgOtherInfo)session.get(OrgOtherInfoImpl.class,
						orgOtherInfo.getPrimaryKeyObj());
			}

			if (orgOtherInfo != null) {
				session.delete(orgOtherInfo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (orgOtherInfo != null) {
			clearCache(orgOtherInfo);
		}

		return orgOtherInfo;
	}

	@Override
	public OrgOtherInfo updateImpl(OrgOtherInfo orgOtherInfo) {
		orgOtherInfo = toUnwrappedModel(orgOtherInfo);

		boolean isNew = orgOtherInfo.isNew();

		OrgOtherInfoModelImpl orgOtherInfoModelImpl = (OrgOtherInfoModelImpl)orgOtherInfo;

		Session session = null;

		try {
			session = openSession();

			if (orgOtherInfo.isNew()) {
				session.save(orgOtherInfo);

				orgOtherInfo.setNew(false);
			}
			else {
				orgOtherInfo = (OrgOtherInfo)session.merge(orgOtherInfo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !OrgOtherInfoModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(OrgOtherInfoModelImpl.ENTITY_CACHE_ENABLED,
			OrgOtherInfoImpl.class, orgOtherInfo.getPrimaryKey(), orgOtherInfo,
			false);

		clearUniqueFindersCache(orgOtherInfoModelImpl, false);
		cacheUniqueFindersCache(orgOtherInfoModelImpl);

		orgOtherInfo.resetOriginalValues();

		return orgOtherInfo;
	}

	protected OrgOtherInfo toUnwrappedModel(OrgOtherInfo orgOtherInfo) {
		if (orgOtherInfo instanceof OrgOtherInfoImpl) {
			return orgOtherInfo;
		}

		OrgOtherInfoImpl orgOtherInfoImpl = new OrgOtherInfoImpl();

		orgOtherInfoImpl.setNew(orgOtherInfo.isNew());
		orgOtherInfoImpl.setPrimaryKey(orgOtherInfo.getPrimaryKey());

		orgOtherInfoImpl.setOrganization_id(orgOtherInfo.getOrganization_id());
		orgOtherInfoImpl.setMesto_registracii(orgOtherInfo.getMesto_registracii());
		orgOtherInfoImpl.setKratkoe_naimenovanie(orgOtherInfo.getKratkoe_naimenovanie());
		orgOtherInfoImpl.setVbk_id(orgOtherInfo.getVbk_id());
		orgOtherInfoImpl.setFbk_id(orgOtherInfo.getFbk_id());
		orgOtherInfoImpl.setIstochnik_finansirovanija_id(orgOtherInfo.getIstochnik_finansirovanija_id());
		orgOtherInfoImpl.setKvalificirovannaja_organizacija(orgOtherInfo.isKvalificirovannaja_organizacija());
		orgOtherInfoImpl.setData_gosudarstvennoj_registracii(orgOtherInfo.getData_gosudarstvennoj_registracii());
		orgOtherInfoImpl.setRajon_id(orgOtherInfo.getRajon_id());
		orgOtherInfoImpl.setInn(orgOtherInfo.getInn());
		orgOtherInfoImpl.setEin(orgOtherInfo.getEin());
		orgOtherInfoImpl.setSin(orgOtherInfo.getSin());
		orgOtherInfoImpl.setSozdal(orgOtherInfo.getSozdal());
		orgOtherInfoImpl.setData_sozdanija(orgOtherInfo.getData_sozdanija());
		orgOtherInfoImpl.setIzmenil(orgOtherInfo.getIzmenil());
		orgOtherInfoImpl.setData_izmenenija(orgOtherInfo.getData_izmenenija());

		return orgOtherInfoImpl;
	}

	/**
	 * Returns the org other info with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the org other info
	 * @return the org other info
	 * @throws NoSuchOrgOtherInfoException if a org other info with the primary key could not be found
	 */
	@Override
	public OrgOtherInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOrgOtherInfoException {
		OrgOtherInfo orgOtherInfo = fetchByPrimaryKey(primaryKey);

		if (orgOtherInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOrgOtherInfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return orgOtherInfo;
	}

	/**
	 * Returns the org other info with the primary key or throws a {@link NoSuchOrgOtherInfoException} if it could not be found.
	 *
	 * @param organization_id the primary key of the org other info
	 * @return the org other info
	 * @throws NoSuchOrgOtherInfoException if a org other info with the primary key could not be found
	 */
	@Override
	public OrgOtherInfo findByPrimaryKey(long organization_id)
		throws NoSuchOrgOtherInfoException {
		return findByPrimaryKey((Serializable)organization_id);
	}

	/**
	 * Returns the org other info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the org other info
	 * @return the org other info, or <code>null</code> if a org other info with the primary key could not be found
	 */
	@Override
	public OrgOtherInfo fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(OrgOtherInfoModelImpl.ENTITY_CACHE_ENABLED,
				OrgOtherInfoImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		OrgOtherInfo orgOtherInfo = (OrgOtherInfo)serializable;

		if (orgOtherInfo == null) {
			Session session = null;

			try {
				session = openSession();

				orgOtherInfo = (OrgOtherInfo)session.get(OrgOtherInfoImpl.class,
						primaryKey);

				if (orgOtherInfo != null) {
					cacheResult(orgOtherInfo);
				}
				else {
					entityCache.putResult(OrgOtherInfoModelImpl.ENTITY_CACHE_ENABLED,
						OrgOtherInfoImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(OrgOtherInfoModelImpl.ENTITY_CACHE_ENABLED,
					OrgOtherInfoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return orgOtherInfo;
	}

	/**
	 * Returns the org other info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param organization_id the primary key of the org other info
	 * @return the org other info, or <code>null</code> if a org other info with the primary key could not be found
	 */
	@Override
	public OrgOtherInfo fetchByPrimaryKey(long organization_id) {
		return fetchByPrimaryKey((Serializable)organization_id);
	}

	@Override
	public Map<Serializable, OrgOtherInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, OrgOtherInfo> map = new HashMap<Serializable, OrgOtherInfo>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			OrgOtherInfo orgOtherInfo = fetchByPrimaryKey(primaryKey);

			if (orgOtherInfo != null) {
				map.put(primaryKey, orgOtherInfo);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(OrgOtherInfoModelImpl.ENTITY_CACHE_ENABLED,
					OrgOtherInfoImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (OrgOtherInfo)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ORGOTHERINFO_WHERE_PKS_IN);

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

			for (OrgOtherInfo orgOtherInfo : (List<OrgOtherInfo>)q.list()) {
				map.put(orgOtherInfo.getPrimaryKeyObj(), orgOtherInfo);

				cacheResult(orgOtherInfo);

				uncachedPrimaryKeys.remove(orgOtherInfo.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(OrgOtherInfoModelImpl.ENTITY_CACHE_ENABLED,
					OrgOtherInfoImpl.class, primaryKey, nullModel);
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
	 * Returns all the org other infos.
	 *
	 * @return the org other infos
	 */
	@Override
	public List<OrgOtherInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the org other infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgOtherInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of org other infos
	 * @param end the upper bound of the range of org other infos (not inclusive)
	 * @return the range of org other infos
	 */
	@Override
	public List<OrgOtherInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the org other infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgOtherInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of org other infos
	 * @param end the upper bound of the range of org other infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of org other infos
	 */
	@Override
	public List<OrgOtherInfo> findAll(int start, int end,
		OrderByComparator<OrgOtherInfo> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the org other infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgOtherInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of org other infos
	 * @param end the upper bound of the range of org other infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of org other infos
	 */
	@Override
	public List<OrgOtherInfo> findAll(int start, int end,
		OrderByComparator<OrgOtherInfo> orderByComparator,
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

		List<OrgOtherInfo> list = null;

		if (retrieveFromCache) {
			list = (List<OrgOtherInfo>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ORGOTHERINFO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ORGOTHERINFO;

				if (pagination) {
					sql = sql.concat(OrgOtherInfoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<OrgOtherInfo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<OrgOtherInfo>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the org other infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OrgOtherInfo orgOtherInfo : findAll()) {
			remove(orgOtherInfo);
		}
	}

	/**
	 * Returns the number of org other infos.
	 *
	 * @return the number of org other infos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ORGOTHERINFO);

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
		return OrgOtherInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the org other info persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(OrgOtherInfoImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ORGOTHERINFO = "SELECT orgOtherInfo FROM OrgOtherInfo orgOtherInfo";
	private static final String _SQL_SELECT_ORGOTHERINFO_WHERE_PKS_IN = "SELECT orgOtherInfo FROM OrgOtherInfo orgOtherInfo WHERE organization_id IN (";
	private static final String _SQL_SELECT_ORGOTHERINFO_WHERE = "SELECT orgOtherInfo FROM OrgOtherInfo orgOtherInfo WHERE ";
	private static final String _SQL_COUNT_ORGOTHERINFO = "SELECT COUNT(orgOtherInfo) FROM OrgOtherInfo orgOtherInfo";
	private static final String _SQL_COUNT_ORGOTHERINFO_WHERE = "SELECT COUNT(orgOtherInfo) FROM OrgOtherInfo orgOtherInfo WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "orgOtherInfo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No OrgOtherInfo exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No OrgOtherInfo exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(OrgOtherInfoPersistenceImpl.class);
}