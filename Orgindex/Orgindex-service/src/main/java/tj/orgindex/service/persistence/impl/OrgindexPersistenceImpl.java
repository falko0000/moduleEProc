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

package tj.orgindex.service.persistence.impl;

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
import com.liferay.portal.spring.extender.service.ServiceReference;

import tj.orgindex.exception.NoSuchOrgindexException;

import tj.orgindex.model.Orgindex;
import tj.orgindex.model.impl.OrgindexImpl;
import tj.orgindex.model.impl.OrgindexModelImpl;

import tj.orgindex.service.persistence.OrgindexPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the orgindex service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OrgindexPersistence
 * @see tj.orgindex.service.persistence.OrgindexUtil
 * @generated
 */
@ProviderType
public class OrgindexPersistenceImpl extends BasePersistenceImpl<Orgindex>
	implements OrgindexPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OrgindexUtil} to access the orgindex persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OrgindexImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OrgindexModelImpl.ENTITY_CACHE_ENABLED,
			OrgindexModelImpl.FINDER_CACHE_ENABLED, OrgindexImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OrgindexModelImpl.ENTITY_CACHE_ENABLED,
			OrgindexModelImpl.FINDER_CACHE_ENABLED, OrgindexImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OrgindexModelImpl.ENTITY_CACHE_ENABLED,
			OrgindexModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDBYORGID =
		new FinderPath(OrgindexModelImpl.ENTITY_CACHE_ENABLED,
			OrgindexModelImpl.FINDER_CACHE_ENABLED, OrgindexImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByFindByOrgID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYORGID =
		new FinderPath(OrgindexModelImpl.ENTITY_CACHE_ENABLED,
			OrgindexModelImpl.FINDER_CACHE_ENABLED, OrgindexImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByFindByOrgID",
			new String[] { Long.class.getName() },
			OrgindexModelImpl.ORGANIZATION_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FINDBYORGID = new FinderPath(OrgindexModelImpl.ENTITY_CACHE_ENABLED,
			OrgindexModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByFindByOrgID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the orgindexs where organization_id = &#63;.
	 *
	 * @param organization_id the organization_id
	 * @return the matching orgindexs
	 */
	@Override
	public List<Orgindex> findByFindByOrgID(long organization_id) {
		return findByFindByOrgID(organization_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the orgindexs where organization_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgindexModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organization_id the organization_id
	 * @param start the lower bound of the range of orgindexs
	 * @param end the upper bound of the range of orgindexs (not inclusive)
	 * @return the range of matching orgindexs
	 */
	@Override
	public List<Orgindex> findByFindByOrgID(long organization_id, int start,
		int end) {
		return findByFindByOrgID(organization_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the orgindexs where organization_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgindexModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organization_id the organization_id
	 * @param start the lower bound of the range of orgindexs
	 * @param end the upper bound of the range of orgindexs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching orgindexs
	 */
	@Override
	public List<Orgindex> findByFindByOrgID(long organization_id, int start,
		int end, OrderByComparator<Orgindex> orderByComparator) {
		return findByFindByOrgID(organization_id, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the orgindexs where organization_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgindexModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organization_id the organization_id
	 * @param start the lower bound of the range of orgindexs
	 * @param end the upper bound of the range of orgindexs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching orgindexs
	 */
	@Override
	public List<Orgindex> findByFindByOrgID(long organization_id, int start,
		int end, OrderByComparator<Orgindex> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYORGID;
			finderArgs = new Object[] { organization_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDBYORGID;
			finderArgs = new Object[] {
					organization_id,
					
					start, end, orderByComparator
				};
		}

		List<Orgindex> list = null;

		if (retrieveFromCache) {
			list = (List<Orgindex>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Orgindex orgindex : list) {
					if ((organization_id != orgindex.getOrganization_id())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_ORGINDEX_WHERE);

			query.append(_FINDER_COLUMN_FINDBYORGID_ORGANIZATION_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OrgindexModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organization_id);

				if (!pagination) {
					list = (List<Orgindex>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Orgindex>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first orgindex in the ordered set where organization_id = &#63;.
	 *
	 * @param organization_id the organization_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching orgindex
	 * @throws NoSuchOrgindexException if a matching orgindex could not be found
	 */
	@Override
	public Orgindex findByFindByOrgID_First(long organization_id,
		OrderByComparator<Orgindex> orderByComparator)
		throws NoSuchOrgindexException {
		Orgindex orgindex = fetchByFindByOrgID_First(organization_id,
				orderByComparator);

		if (orgindex != null) {
			return orgindex;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organization_id=");
		msg.append(organization_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrgindexException(msg.toString());
	}

	/**
	 * Returns the first orgindex in the ordered set where organization_id = &#63;.
	 *
	 * @param organization_id the organization_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching orgindex, or <code>null</code> if a matching orgindex could not be found
	 */
	@Override
	public Orgindex fetchByFindByOrgID_First(long organization_id,
		OrderByComparator<Orgindex> orderByComparator) {
		List<Orgindex> list = findByFindByOrgID(organization_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last orgindex in the ordered set where organization_id = &#63;.
	 *
	 * @param organization_id the organization_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching orgindex
	 * @throws NoSuchOrgindexException if a matching orgindex could not be found
	 */
	@Override
	public Orgindex findByFindByOrgID_Last(long organization_id,
		OrderByComparator<Orgindex> orderByComparator)
		throws NoSuchOrgindexException {
		Orgindex orgindex = fetchByFindByOrgID_Last(organization_id,
				orderByComparator);

		if (orgindex != null) {
			return orgindex;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organization_id=");
		msg.append(organization_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrgindexException(msg.toString());
	}

	/**
	 * Returns the last orgindex in the ordered set where organization_id = &#63;.
	 *
	 * @param organization_id the organization_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching orgindex, or <code>null</code> if a matching orgindex could not be found
	 */
	@Override
	public Orgindex fetchByFindByOrgID_Last(long organization_id,
		OrderByComparator<Orgindex> orderByComparator) {
		int count = countByFindByOrgID(organization_id);

		if (count == 0) {
			return null;
		}

		List<Orgindex> list = findByFindByOrgID(organization_id, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the orgindexs before and after the current orgindex in the ordered set where organization_id = &#63;.
	 *
	 * @param orgindex_id the primary key of the current orgindex
	 * @param organization_id the organization_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next orgindex
	 * @throws NoSuchOrgindexException if a orgindex with the primary key could not be found
	 */
	@Override
	public Orgindex[] findByFindByOrgID_PrevAndNext(long orgindex_id,
		long organization_id, OrderByComparator<Orgindex> orderByComparator)
		throws NoSuchOrgindexException {
		Orgindex orgindex = findByPrimaryKey(orgindex_id);

		Session session = null;

		try {
			session = openSession();

			Orgindex[] array = new OrgindexImpl[3];

			array[0] = getByFindByOrgID_PrevAndNext(session, orgindex,
					organization_id, orderByComparator, true);

			array[1] = orgindex;

			array[2] = getByFindByOrgID_PrevAndNext(session, orgindex,
					organization_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Orgindex getByFindByOrgID_PrevAndNext(Session session,
		Orgindex orgindex, long organization_id,
		OrderByComparator<Orgindex> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ORGINDEX_WHERE);

		query.append(_FINDER_COLUMN_FINDBYORGID_ORGANIZATION_ID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(OrgindexModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(organization_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(orgindex);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Orgindex> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the orgindexs where organization_id = &#63; from the database.
	 *
	 * @param organization_id the organization_id
	 */
	@Override
	public void removeByFindByOrgID(long organization_id) {
		for (Orgindex orgindex : findByFindByOrgID(organization_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(orgindex);
		}
	}

	/**
	 * Returns the number of orgindexs where organization_id = &#63;.
	 *
	 * @param organization_id the organization_id
	 * @return the number of matching orgindexs
	 */
	@Override
	public int countByFindByOrgID(long organization_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FINDBYORGID;

		Object[] finderArgs = new Object[] { organization_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ORGINDEX_WHERE);

			query.append(_FINDER_COLUMN_FINDBYORGID_ORGANIZATION_ID_2);

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

	private static final String _FINDER_COLUMN_FINDBYORGID_ORGANIZATION_ID_2 = "orgindex.organization_id = ?";

	public OrgindexPersistenceImpl() {
		setModelClass(Orgindex.class);
	}

	/**
	 * Caches the orgindex in the entity cache if it is enabled.
	 *
	 * @param orgindex the orgindex
	 */
	@Override
	public void cacheResult(Orgindex orgindex) {
		entityCache.putResult(OrgindexModelImpl.ENTITY_CACHE_ENABLED,
			OrgindexImpl.class, orgindex.getPrimaryKey(), orgindex);

		orgindex.resetOriginalValues();
	}

	/**
	 * Caches the orgindexs in the entity cache if it is enabled.
	 *
	 * @param orgindexs the orgindexs
	 */
	@Override
	public void cacheResult(List<Orgindex> orgindexs) {
		for (Orgindex orgindex : orgindexs) {
			if (entityCache.getResult(OrgindexModelImpl.ENTITY_CACHE_ENABLED,
						OrgindexImpl.class, orgindex.getPrimaryKey()) == null) {
				cacheResult(orgindex);
			}
			else {
				orgindex.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all orgindexs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OrgindexImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the orgindex.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Orgindex orgindex) {
		entityCache.removeResult(OrgindexModelImpl.ENTITY_CACHE_ENABLED,
			OrgindexImpl.class, orgindex.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Orgindex> orgindexs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Orgindex orgindex : orgindexs) {
			entityCache.removeResult(OrgindexModelImpl.ENTITY_CACHE_ENABLED,
				OrgindexImpl.class, orgindex.getPrimaryKey());
		}
	}

	/**
	 * Creates a new orgindex with the primary key. Does not add the orgindex to the database.
	 *
	 * @param orgindex_id the primary key for the new orgindex
	 * @return the new orgindex
	 */
	@Override
	public Orgindex create(long orgindex_id) {
		Orgindex orgindex = new OrgindexImpl();

		orgindex.setNew(true);
		orgindex.setPrimaryKey(orgindex_id);

		return orgindex;
	}

	/**
	 * Removes the orgindex with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param orgindex_id the primary key of the orgindex
	 * @return the orgindex that was removed
	 * @throws NoSuchOrgindexException if a orgindex with the primary key could not be found
	 */
	@Override
	public Orgindex remove(long orgindex_id) throws NoSuchOrgindexException {
		return remove((Serializable)orgindex_id);
	}

	/**
	 * Removes the orgindex with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the orgindex
	 * @return the orgindex that was removed
	 * @throws NoSuchOrgindexException if a orgindex with the primary key could not be found
	 */
	@Override
	public Orgindex remove(Serializable primaryKey)
		throws NoSuchOrgindexException {
		Session session = null;

		try {
			session = openSession();

			Orgindex orgindex = (Orgindex)session.get(OrgindexImpl.class,
					primaryKey);

			if (orgindex == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOrgindexException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(orgindex);
		}
		catch (NoSuchOrgindexException nsee) {
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
	protected Orgindex removeImpl(Orgindex orgindex) {
		orgindex = toUnwrappedModel(orgindex);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(orgindex)) {
				orgindex = (Orgindex)session.get(OrgindexImpl.class,
						orgindex.getPrimaryKeyObj());
			}

			if (orgindex != null) {
				session.delete(orgindex);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (orgindex != null) {
			clearCache(orgindex);
		}

		return orgindex;
	}

	@Override
	public Orgindex updateImpl(Orgindex orgindex) {
		orgindex = toUnwrappedModel(orgindex);

		boolean isNew = orgindex.isNew();

		OrgindexModelImpl orgindexModelImpl = (OrgindexModelImpl)orgindex;

		Session session = null;

		try {
			session = openSession();

			if (orgindex.isNew()) {
				session.save(orgindex);

				orgindex.setNew(false);
			}
			else {
				orgindex = (Orgindex)session.merge(orgindex);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !OrgindexModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((orgindexModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYORGID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						orgindexModelImpl.getOriginalOrganization_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FINDBYORGID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYORGID,
					args);

				args = new Object[] { orgindexModelImpl.getOrganization_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FINDBYORGID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYORGID,
					args);
			}
		}

		entityCache.putResult(OrgindexModelImpl.ENTITY_CACHE_ENABLED,
			OrgindexImpl.class, orgindex.getPrimaryKey(), orgindex, false);

		orgindex.resetOriginalValues();

		return orgindex;
	}

	protected Orgindex toUnwrappedModel(Orgindex orgindex) {
		if (orgindex instanceof OrgindexImpl) {
			return orgindex;
		}

		OrgindexImpl orgindexImpl = new OrgindexImpl();

		orgindexImpl.setNew(orgindex.isNew());
		orgindexImpl.setPrimaryKey(orgindex.getPrimaryKey());

		orgindexImpl.setOrgindex_id(orgindex.getOrgindex_id());
		orgindexImpl.setOrganization_id(orgindex.getOrganization_id());
		orgindexImpl.setSubdivision_index(orgindex.getSubdivision_index());
		orgindexImpl.setSozdal(orgindex.getSozdal());
		orgindexImpl.setIzmenil(orgindex.getIzmenil());
		orgindexImpl.setData_sozdanija(orgindex.getData_sozdanija());
		orgindexImpl.setData_izmenenija(orgindex.getData_izmenenija());
		orgindexImpl.setName(orgindex.getName());

		return orgindexImpl;
	}

	/**
	 * Returns the orgindex with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the orgindex
	 * @return the orgindex
	 * @throws NoSuchOrgindexException if a orgindex with the primary key could not be found
	 */
	@Override
	public Orgindex findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOrgindexException {
		Orgindex orgindex = fetchByPrimaryKey(primaryKey);

		if (orgindex == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOrgindexException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return orgindex;
	}

	/**
	 * Returns the orgindex with the primary key or throws a {@link NoSuchOrgindexException} if it could not be found.
	 *
	 * @param orgindex_id the primary key of the orgindex
	 * @return the orgindex
	 * @throws NoSuchOrgindexException if a orgindex with the primary key could not be found
	 */
	@Override
	public Orgindex findByPrimaryKey(long orgindex_id)
		throws NoSuchOrgindexException {
		return findByPrimaryKey((Serializable)orgindex_id);
	}

	/**
	 * Returns the orgindex with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the orgindex
	 * @return the orgindex, or <code>null</code> if a orgindex with the primary key could not be found
	 */
	@Override
	public Orgindex fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(OrgindexModelImpl.ENTITY_CACHE_ENABLED,
				OrgindexImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Orgindex orgindex = (Orgindex)serializable;

		if (orgindex == null) {
			Session session = null;

			try {
				session = openSession();

				orgindex = (Orgindex)session.get(OrgindexImpl.class, primaryKey);

				if (orgindex != null) {
					cacheResult(orgindex);
				}
				else {
					entityCache.putResult(OrgindexModelImpl.ENTITY_CACHE_ENABLED,
						OrgindexImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(OrgindexModelImpl.ENTITY_CACHE_ENABLED,
					OrgindexImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return orgindex;
	}

	/**
	 * Returns the orgindex with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param orgindex_id the primary key of the orgindex
	 * @return the orgindex, or <code>null</code> if a orgindex with the primary key could not be found
	 */
	@Override
	public Orgindex fetchByPrimaryKey(long orgindex_id) {
		return fetchByPrimaryKey((Serializable)orgindex_id);
	}

	@Override
	public Map<Serializable, Orgindex> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Orgindex> map = new HashMap<Serializable, Orgindex>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Orgindex orgindex = fetchByPrimaryKey(primaryKey);

			if (orgindex != null) {
				map.put(primaryKey, orgindex);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(OrgindexModelImpl.ENTITY_CACHE_ENABLED,
					OrgindexImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Orgindex)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ORGINDEX_WHERE_PKS_IN);

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

			for (Orgindex orgindex : (List<Orgindex>)q.list()) {
				map.put(orgindex.getPrimaryKeyObj(), orgindex);

				cacheResult(orgindex);

				uncachedPrimaryKeys.remove(orgindex.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(OrgindexModelImpl.ENTITY_CACHE_ENABLED,
					OrgindexImpl.class, primaryKey, nullModel);
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
	 * Returns all the orgindexs.
	 *
	 * @return the orgindexs
	 */
	@Override
	public List<Orgindex> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the orgindexs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgindexModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of orgindexs
	 * @param end the upper bound of the range of orgindexs (not inclusive)
	 * @return the range of orgindexs
	 */
	@Override
	public List<Orgindex> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the orgindexs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgindexModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of orgindexs
	 * @param end the upper bound of the range of orgindexs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of orgindexs
	 */
	@Override
	public List<Orgindex> findAll(int start, int end,
		OrderByComparator<Orgindex> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the orgindexs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgindexModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of orgindexs
	 * @param end the upper bound of the range of orgindexs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of orgindexs
	 */
	@Override
	public List<Orgindex> findAll(int start, int end,
		OrderByComparator<Orgindex> orderByComparator, boolean retrieveFromCache) {
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

		List<Orgindex> list = null;

		if (retrieveFromCache) {
			list = (List<Orgindex>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ORGINDEX);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ORGINDEX;

				if (pagination) {
					sql = sql.concat(OrgindexModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Orgindex>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Orgindex>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the orgindexs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Orgindex orgindex : findAll()) {
			remove(orgindex);
		}
	}

	/**
	 * Returns the number of orgindexs.
	 *
	 * @return the number of orgindexs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ORGINDEX);

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
		return OrgindexModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the orgindex persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(OrgindexImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ORGINDEX = "SELECT orgindex FROM Orgindex orgindex";
	private static final String _SQL_SELECT_ORGINDEX_WHERE_PKS_IN = "SELECT orgindex FROM Orgindex orgindex WHERE orgindex_id IN (";
	private static final String _SQL_SELECT_ORGINDEX_WHERE = "SELECT orgindex FROM Orgindex orgindex WHERE ";
	private static final String _SQL_COUNT_ORGINDEX = "SELECT COUNT(orgindex) FROM Orgindex orgindex";
	private static final String _SQL_COUNT_ORGINDEX_WHERE = "SELECT COUNT(orgindex) FROM Orgindex orgindex WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "orgindex.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Orgindex exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Orgindex exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(OrgindexPersistenceImpl.class);
}