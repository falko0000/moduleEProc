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

package tj.izvewenija.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.permission.InlineSQLHelperUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import tj.izvewenija.exception.NoSuchIzvewenijaException;

import tj.izvewenija.model.Izvewenija;
import tj.izvewenija.model.impl.IzvewenijaImpl;
import tj.izvewenija.model.impl.IzvewenijaModelImpl;

import tj.izvewenija.service.persistence.IzvewenijaPersistence;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the izvewenija service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IzvewenijaPersistence
 * @see tj.izvewenija.service.persistence.IzvewenijaUtil
 * @generated
 */
@ProviderType
public class IzvewenijaPersistenceImpl extends BasePersistenceImpl<Izvewenija>
	implements IzvewenijaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link IzvewenijaUtil} to access the izvewenija persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = IzvewenijaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			IzvewenijaModelImpl.FINDER_CACHE_ENABLED, IzvewenijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			IzvewenijaModelImpl.FINDER_CACHE_ENABLED, IzvewenijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			IzvewenijaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID_GROUPID =
		new FinderPath(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			IzvewenijaModelImpl.FINDER_CACHE_ENABLED, IzvewenijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId_GroupId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID_GROUPID =
		new FinderPath(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			IzvewenijaModelImpl.FINDER_CACHE_ENABLED, IzvewenijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCompanyId_GroupId",
			new String[] { Long.class.getName(), Long.class.getName() },
			IzvewenijaModelImpl.COMPANYID_COLUMN_BITMASK |
			IzvewenijaModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID_GROUPID = new FinderPath(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			IzvewenijaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCompanyId_GroupId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the izvewenijas where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the matching izvewenijas
	 */
	@Override
	public List<Izvewenija> findByCompanyId_GroupId(long companyId, long groupId) {
		return findByCompanyId_GroupId(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the izvewenijas where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of izvewenijas
	 * @param end the upper bound of the range of izvewenijas (not inclusive)
	 * @return the range of matching izvewenijas
	 */
	@Override
	public List<Izvewenija> findByCompanyId_GroupId(long companyId,
		long groupId, int start, int end) {
		return findByCompanyId_GroupId(companyId, groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the izvewenijas where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of izvewenijas
	 * @param end the upper bound of the range of izvewenijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching izvewenijas
	 */
	@Override
	public List<Izvewenija> findByCompanyId_GroupId(long companyId,
		long groupId, int start, int end,
		OrderByComparator<Izvewenija> orderByComparator) {
		return findByCompanyId_GroupId(companyId, groupId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the izvewenijas where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of izvewenijas
	 * @param end the upper bound of the range of izvewenijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching izvewenijas
	 */
	@Override
	public List<Izvewenija> findByCompanyId_GroupId(long companyId,
		long groupId, int start, int end,
		OrderByComparator<Izvewenija> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID_GROUPID;
			finderArgs = new Object[] { companyId, groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID_GROUPID;
			finderArgs = new Object[] {
					companyId, groupId,
					
					start, end, orderByComparator
				};
		}

		List<Izvewenija> list = null;

		if (retrieveFromCache) {
			list = (List<Izvewenija>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Izvewenija izvewenija : list) {
					if ((companyId != izvewenija.getCompanyId()) ||
							(groupId != izvewenija.getGroupId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_IZVEWENIJA_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_GROUPID_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYID_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(IzvewenijaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<Izvewenija>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Izvewenija>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first izvewenija in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching izvewenija
	 * @throws NoSuchIzvewenijaException if a matching izvewenija could not be found
	 */
	@Override
	public Izvewenija findByCompanyId_GroupId_First(long companyId,
		long groupId, OrderByComparator<Izvewenija> orderByComparator)
		throws NoSuchIzvewenijaException {
		Izvewenija izvewenija = fetchByCompanyId_GroupId_First(companyId,
				groupId, orderByComparator);

		if (izvewenija != null) {
			return izvewenija;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIzvewenijaException(msg.toString());
	}

	/**
	 * Returns the first izvewenija in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching izvewenija, or <code>null</code> if a matching izvewenija could not be found
	 */
	@Override
	public Izvewenija fetchByCompanyId_GroupId_First(long companyId,
		long groupId, OrderByComparator<Izvewenija> orderByComparator) {
		List<Izvewenija> list = findByCompanyId_GroupId(companyId, groupId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last izvewenija in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching izvewenija
	 * @throws NoSuchIzvewenijaException if a matching izvewenija could not be found
	 */
	@Override
	public Izvewenija findByCompanyId_GroupId_Last(long companyId,
		long groupId, OrderByComparator<Izvewenija> orderByComparator)
		throws NoSuchIzvewenijaException {
		Izvewenija izvewenija = fetchByCompanyId_GroupId_Last(companyId,
				groupId, orderByComparator);

		if (izvewenija != null) {
			return izvewenija;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIzvewenijaException(msg.toString());
	}

	/**
	 * Returns the last izvewenija in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching izvewenija, or <code>null</code> if a matching izvewenija could not be found
	 */
	@Override
	public Izvewenija fetchByCompanyId_GroupId_Last(long companyId,
		long groupId, OrderByComparator<Izvewenija> orderByComparator) {
		int count = countByCompanyId_GroupId(companyId, groupId);

		if (count == 0) {
			return null;
		}

		List<Izvewenija> list = findByCompanyId_GroupId(companyId, groupId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the izvewenijas before and after the current izvewenija in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param izvewenija_id the primary key of the current izvewenija
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next izvewenija
	 * @throws NoSuchIzvewenijaException if a izvewenija with the primary key could not be found
	 */
	@Override
	public Izvewenija[] findByCompanyId_GroupId_PrevAndNext(
		long izvewenija_id, long companyId, long groupId,
		OrderByComparator<Izvewenija> orderByComparator)
		throws NoSuchIzvewenijaException {
		Izvewenija izvewenija = findByPrimaryKey(izvewenija_id);

		Session session = null;

		try {
			session = openSession();

			Izvewenija[] array = new IzvewenijaImpl[3];

			array[0] = getByCompanyId_GroupId_PrevAndNext(session, izvewenija,
					companyId, groupId, orderByComparator, true);

			array[1] = izvewenija;

			array[2] = getByCompanyId_GroupId_PrevAndNext(session, izvewenija,
					companyId, groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Izvewenija getByCompanyId_GroupId_PrevAndNext(Session session,
		Izvewenija izvewenija, long companyId, long groupId,
		OrderByComparator<Izvewenija> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_IZVEWENIJA_WHERE);

		query.append(_FINDER_COLUMN_COMPANYID_GROUPID_COMPANYID_2);

		query.append(_FINDER_COLUMN_COMPANYID_GROUPID_GROUPID_2);

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
			query.append(IzvewenijaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(izvewenija);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Izvewenija> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the matching izvewenijas that the user has permission to view
	 */
	@Override
	public List<Izvewenija> filterFindByCompanyId_GroupId(long companyId,
		long groupId) {
		return filterFindByCompanyId_GroupId(companyId, groupId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of izvewenijas
	 * @param end the upper bound of the range of izvewenijas (not inclusive)
	 * @return the range of matching izvewenijas that the user has permission to view
	 */
	@Override
	public List<Izvewenija> filterFindByCompanyId_GroupId(long companyId,
		long groupId, int start, int end) {
		return filterFindByCompanyId_GroupId(companyId, groupId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the izvewenijas that the user has permissions to view where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of izvewenijas
	 * @param end the upper bound of the range of izvewenijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching izvewenijas that the user has permission to view
	 */
	@Override
	public List<Izvewenija> filterFindByCompanyId_GroupId(long companyId,
		long groupId, int start, int end,
		OrderByComparator<Izvewenija> orderByComparator) {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByCompanyId_GroupId(companyId, groupId, start, end,
				orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByFields().length * 2));
		}
		else {
			query = new StringBundler(5);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_IZVEWENIJA_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_IZVEWENIJA_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_COMPANYID_GROUPID_COMPANYID_2);

		query.append(_FINDER_COLUMN_COMPANYID_GROUPID_GROUPID_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_IZVEWENIJA_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator, true);
			}
			else {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
					orderByComparator, true);
			}
		}
		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(IzvewenijaModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(IzvewenijaModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				Izvewenija.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSynchronizedSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, IzvewenijaImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, IzvewenijaImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(companyId);

			qPos.add(groupId);

			return (List<Izvewenija>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the izvewenijas before and after the current izvewenija in the ordered set of izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63;.
	 *
	 * @param izvewenija_id the primary key of the current izvewenija
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next izvewenija
	 * @throws NoSuchIzvewenijaException if a izvewenija with the primary key could not be found
	 */
	@Override
	public Izvewenija[] filterFindByCompanyId_GroupId_PrevAndNext(
		long izvewenija_id, long companyId, long groupId,
		OrderByComparator<Izvewenija> orderByComparator)
		throws NoSuchIzvewenijaException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByCompanyId_GroupId_PrevAndNext(izvewenija_id,
				companyId, groupId, orderByComparator);
		}

		Izvewenija izvewenija = findByPrimaryKey(izvewenija_id);

		Session session = null;

		try {
			session = openSession();

			Izvewenija[] array = new IzvewenijaImpl[3];

			array[0] = filterGetByCompanyId_GroupId_PrevAndNext(session,
					izvewenija, companyId, groupId, orderByComparator, true);

			array[1] = izvewenija;

			array[2] = filterGetByCompanyId_GroupId_PrevAndNext(session,
					izvewenija, companyId, groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Izvewenija filterGetByCompanyId_GroupId_PrevAndNext(
		Session session, Izvewenija izvewenija, long companyId, long groupId,
		OrderByComparator<Izvewenija> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_IZVEWENIJA_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_IZVEWENIJA_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_COMPANYID_GROUPID_COMPANYID_2);

		query.append(_FINDER_COLUMN_COMPANYID_GROUPID_GROUPID_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_IZVEWENIJA_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
			if (getDB().isSupportsInlineDistinct()) {
				query.append(IzvewenijaModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(IzvewenijaModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				Izvewenija.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		SQLQuery q = session.createSynchronizedSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, IzvewenijaImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, IzvewenijaImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(izvewenija);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Izvewenija> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the izvewenijas where companyId = &#63; and groupId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 */
	@Override
	public void removeByCompanyId_GroupId(long companyId, long groupId) {
		for (Izvewenija izvewenija : findByCompanyId_GroupId(companyId,
				groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(izvewenija);
		}
	}

	/**
	 * Returns the number of izvewenijas where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the number of matching izvewenijas
	 */
	@Override
	public int countByCompanyId_GroupId(long companyId, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYID_GROUPID;

		Object[] finderArgs = new Object[] { companyId, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_IZVEWENIJA_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_GROUPID_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYID_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

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

	/**
	 * Returns the number of izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the number of matching izvewenijas that the user has permission to view
	 */
	@Override
	public int filterCountByCompanyId_GroupId(long companyId, long groupId) {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByCompanyId_GroupId(companyId, groupId);
		}

		StringBundler query = new StringBundler(3);

		query.append(_FILTER_SQL_COUNT_IZVEWENIJA_WHERE);

		query.append(_FINDER_COLUMN_COMPANYID_GROUPID_COMPANYID_2);

		query.append(_FINDER_COLUMN_COMPANYID_GROUPID_GROUPID_2);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				Izvewenija.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSynchronizedSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(companyId);

			qPos.add(groupId);

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	private static final String _FINDER_COLUMN_COMPANYID_GROUPID_COMPANYID_2 = "izvewenija.companyId = ? AND ";
	private static final String _FINDER_COLUMN_COMPANYID_GROUPID_GROUPID_2 = "izvewenija.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IZVEWENIJAID =
		new FinderPath(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			IzvewenijaModelImpl.FINDER_CACHE_ENABLED, IzvewenijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByIzvewenijaId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIJAID =
		new FinderPath(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			IzvewenijaModelImpl.FINDER_CACHE_ENABLED, IzvewenijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByIzvewenijaId",
			new String[] { Long.class.getName(), Long.class.getName() },
			IzvewenijaModelImpl.IZVEWENIJA_ID_COLUMN_BITMASK |
			IzvewenijaModelImpl.SOZDAL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IZVEWENIJAID = new FinderPath(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			IzvewenijaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIzvewenijaId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the izvewenijas where izvewenija_id = &#63; and sozdal = &#63;.
	 *
	 * @param izvewenija_id the izvewenija_id
	 * @param sozdal the sozdal
	 * @return the matching izvewenijas
	 */
	@Override
	public List<Izvewenija> findByIzvewenijaId(long izvewenija_id, long sozdal) {
		return findByIzvewenijaId(izvewenija_id, sozdal, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the izvewenijas where izvewenija_id = &#63; and sozdal = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param izvewenija_id the izvewenija_id
	 * @param sozdal the sozdal
	 * @param start the lower bound of the range of izvewenijas
	 * @param end the upper bound of the range of izvewenijas (not inclusive)
	 * @return the range of matching izvewenijas
	 */
	@Override
	public List<Izvewenija> findByIzvewenijaId(long izvewenija_id, long sozdal,
		int start, int end) {
		return findByIzvewenijaId(izvewenija_id, sozdal, start, end, null);
	}

	/**
	 * Returns an ordered range of all the izvewenijas where izvewenija_id = &#63; and sozdal = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param izvewenija_id the izvewenija_id
	 * @param sozdal the sozdal
	 * @param start the lower bound of the range of izvewenijas
	 * @param end the upper bound of the range of izvewenijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching izvewenijas
	 */
	@Override
	public List<Izvewenija> findByIzvewenijaId(long izvewenija_id, long sozdal,
		int start, int end, OrderByComparator<Izvewenija> orderByComparator) {
		return findByIzvewenijaId(izvewenija_id, sozdal, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the izvewenijas where izvewenija_id = &#63; and sozdal = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param izvewenija_id the izvewenija_id
	 * @param sozdal the sozdal
	 * @param start the lower bound of the range of izvewenijas
	 * @param end the upper bound of the range of izvewenijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching izvewenijas
	 */
	@Override
	public List<Izvewenija> findByIzvewenijaId(long izvewenija_id, long sozdal,
		int start, int end, OrderByComparator<Izvewenija> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIJAID;
			finderArgs = new Object[] { izvewenija_id, sozdal };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_IZVEWENIJAID;
			finderArgs = new Object[] {
					izvewenija_id, sozdal,
					
					start, end, orderByComparator
				};
		}

		List<Izvewenija> list = null;

		if (retrieveFromCache) {
			list = (List<Izvewenija>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Izvewenija izvewenija : list) {
					if ((izvewenija_id != izvewenija.getIzvewenija_id()) ||
							(sozdal != izvewenija.getSozdal())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_IZVEWENIJA_WHERE);

			query.append(_FINDER_COLUMN_IZVEWENIJAID_IZVEWENIJA_ID_2);

			query.append(_FINDER_COLUMN_IZVEWENIJAID_SOZDAL_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(IzvewenijaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(izvewenija_id);

				qPos.add(sozdal);

				if (!pagination) {
					list = (List<Izvewenija>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Izvewenija>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first izvewenija in the ordered set where izvewenija_id = &#63; and sozdal = &#63;.
	 *
	 * @param izvewenija_id the izvewenija_id
	 * @param sozdal the sozdal
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching izvewenija
	 * @throws NoSuchIzvewenijaException if a matching izvewenija could not be found
	 */
	@Override
	public Izvewenija findByIzvewenijaId_First(long izvewenija_id, long sozdal,
		OrderByComparator<Izvewenija> orderByComparator)
		throws NoSuchIzvewenijaException {
		Izvewenija izvewenija = fetchByIzvewenijaId_First(izvewenija_id,
				sozdal, orderByComparator);

		if (izvewenija != null) {
			return izvewenija;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("izvewenija_id=");
		msg.append(izvewenija_id);

		msg.append(", sozdal=");
		msg.append(sozdal);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIzvewenijaException(msg.toString());
	}

	/**
	 * Returns the first izvewenija in the ordered set where izvewenija_id = &#63; and sozdal = &#63;.
	 *
	 * @param izvewenija_id the izvewenija_id
	 * @param sozdal the sozdal
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching izvewenija, or <code>null</code> if a matching izvewenija could not be found
	 */
	@Override
	public Izvewenija fetchByIzvewenijaId_First(long izvewenija_id,
		long sozdal, OrderByComparator<Izvewenija> orderByComparator) {
		List<Izvewenija> list = findByIzvewenijaId(izvewenija_id, sozdal, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last izvewenija in the ordered set where izvewenija_id = &#63; and sozdal = &#63;.
	 *
	 * @param izvewenija_id the izvewenija_id
	 * @param sozdal the sozdal
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching izvewenija
	 * @throws NoSuchIzvewenijaException if a matching izvewenija could not be found
	 */
	@Override
	public Izvewenija findByIzvewenijaId_Last(long izvewenija_id, long sozdal,
		OrderByComparator<Izvewenija> orderByComparator)
		throws NoSuchIzvewenijaException {
		Izvewenija izvewenija = fetchByIzvewenijaId_Last(izvewenija_id, sozdal,
				orderByComparator);

		if (izvewenija != null) {
			return izvewenija;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("izvewenija_id=");
		msg.append(izvewenija_id);

		msg.append(", sozdal=");
		msg.append(sozdal);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIzvewenijaException(msg.toString());
	}

	/**
	 * Returns the last izvewenija in the ordered set where izvewenija_id = &#63; and sozdal = &#63;.
	 *
	 * @param izvewenija_id the izvewenija_id
	 * @param sozdal the sozdal
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching izvewenija, or <code>null</code> if a matching izvewenija could not be found
	 */
	@Override
	public Izvewenija fetchByIzvewenijaId_Last(long izvewenija_id, long sozdal,
		OrderByComparator<Izvewenija> orderByComparator) {
		int count = countByIzvewenijaId(izvewenija_id, sozdal);

		if (count == 0) {
			return null;
		}

		List<Izvewenija> list = findByIzvewenijaId(izvewenija_id, sozdal,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the izvewenijas where izvewenija_id = &#63; and sozdal = &#63; from the database.
	 *
	 * @param izvewenija_id the izvewenija_id
	 * @param sozdal the sozdal
	 */
	@Override
	public void removeByIzvewenijaId(long izvewenija_id, long sozdal) {
		for (Izvewenija izvewenija : findByIzvewenijaId(izvewenija_id, sozdal,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(izvewenija);
		}
	}

	/**
	 * Returns the number of izvewenijas where izvewenija_id = &#63; and sozdal = &#63;.
	 *
	 * @param izvewenija_id the izvewenija_id
	 * @param sozdal the sozdal
	 * @return the number of matching izvewenijas
	 */
	@Override
	public int countByIzvewenijaId(long izvewenija_id, long sozdal) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IZVEWENIJAID;

		Object[] finderArgs = new Object[] { izvewenija_id, sozdal };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_IZVEWENIJA_WHERE);

			query.append(_FINDER_COLUMN_IZVEWENIJAID_IZVEWENIJA_ID_2);

			query.append(_FINDER_COLUMN_IZVEWENIJAID_SOZDAL_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(izvewenija_id);

				qPos.add(sozdal);

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

	private static final String _FINDER_COLUMN_IZVEWENIJAID_IZVEWENIJA_ID_2 = "izvewenija.izvewenija_id = ? AND ";
	private static final String _FINDER_COLUMN_IZVEWENIJAID_SOZDAL_2 = "izvewenija.sozdal = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID =
		new FinderPath(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			IzvewenijaModelImpl.FINDER_CACHE_ENABLED, IzvewenijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCompanyIdGroupIdSostojanieIdStatusId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID =
		new FinderPath(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			IzvewenijaModelImpl.FINDER_CACHE_ENABLED, IzvewenijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCompanyIdGroupIdSostojanieIdStatusId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				Long.class.getName()
			},
			IzvewenijaModelImpl.COMPANYID_COLUMN_BITMASK |
			IzvewenijaModelImpl.GROUPID_COLUMN_BITMASK |
			IzvewenijaModelImpl.SOSTOJANIE_ID_COLUMN_BITMASK |
			IzvewenijaModelImpl.STATUS_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID =
		new FinderPath(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			IzvewenijaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCompanyIdGroupIdSostojanieIdStatusId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				Long.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID =
		new FinderPath(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			IzvewenijaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"countByCompanyIdGroupIdSostojanieIdStatusId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_id the sostojanie_id
	 * @param status_id the status_id
	 * @return the matching izvewenijas
	 */
	@Override
	public List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id) {
		return findByCompanyIdGroupIdSostojanieIdStatusId(companyId, groupId,
			sostojanie_id, status_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_id the sostojanie_id
	 * @param status_id the status_id
	 * @param start the lower bound of the range of izvewenijas
	 * @param end the upper bound of the range of izvewenijas (not inclusive)
	 * @return the range of matching izvewenijas
	 */
	@Override
	public List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id,
		int start, int end) {
		return findByCompanyIdGroupIdSostojanieIdStatusId(companyId, groupId,
			sostojanie_id, status_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_id the sostojanie_id
	 * @param status_id the status_id
	 * @param start the lower bound of the range of izvewenijas
	 * @param end the upper bound of the range of izvewenijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching izvewenijas
	 */
	@Override
	public List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id,
		int start, int end, OrderByComparator<Izvewenija> orderByComparator) {
		return findByCompanyIdGroupIdSostojanieIdStatusId(companyId, groupId,
			sostojanie_id, status_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_id the sostojanie_id
	 * @param status_id the status_id
	 * @param start the lower bound of the range of izvewenijas
	 * @param end the upper bound of the range of izvewenijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching izvewenijas
	 */
	@Override
	public List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id,
		int start, int end, OrderByComparator<Izvewenija> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID;
			finderArgs = new Object[] {
					companyId, groupId, sostojanie_id, status_id
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID;
			finderArgs = new Object[] {
					companyId, groupId, sostojanie_id, status_id,
					
					start, end, orderByComparator
				};
		}

		List<Izvewenija> list = null;

		if (retrieveFromCache) {
			list = (List<Izvewenija>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Izvewenija izvewenija : list) {
					if ((companyId != izvewenija.getCompanyId()) ||
							(groupId != izvewenija.getGroupId()) ||
							(sostojanie_id != izvewenija.getSostojanie_id()) ||
							(status_id != izvewenija.getStatus_id())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_IZVEWENIJA_WHERE);

			query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_GROUPID_2);

			query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_SOSTOJANIE_ID_2);

			query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_STATUS_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(IzvewenijaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(sostojanie_id);

				qPos.add(status_id);

				if (!pagination) {
					list = (List<Izvewenija>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Izvewenija>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first izvewenija in the ordered set where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_id the sostojanie_id
	 * @param status_id the status_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching izvewenija
	 * @throws NoSuchIzvewenijaException if a matching izvewenija could not be found
	 */
	@Override
	public Izvewenija findByCompanyIdGroupIdSostojanieIdStatusId_First(
		long companyId, long groupId, long sostojanie_id, long status_id,
		OrderByComparator<Izvewenija> orderByComparator)
		throws NoSuchIzvewenijaException {
		Izvewenija izvewenija = fetchByCompanyIdGroupIdSostojanieIdStatusId_First(companyId,
				groupId, sostojanie_id, status_id, orderByComparator);

		if (izvewenija != null) {
			return izvewenija;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", sostojanie_id=");
		msg.append(sostojanie_id);

		msg.append(", status_id=");
		msg.append(status_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIzvewenijaException(msg.toString());
	}

	/**
	 * Returns the first izvewenija in the ordered set where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_id the sostojanie_id
	 * @param status_id the status_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching izvewenija, or <code>null</code> if a matching izvewenija could not be found
	 */
	@Override
	public Izvewenija fetchByCompanyIdGroupIdSostojanieIdStatusId_First(
		long companyId, long groupId, long sostojanie_id, long status_id,
		OrderByComparator<Izvewenija> orderByComparator) {
		List<Izvewenija> list = findByCompanyIdGroupIdSostojanieIdStatusId(companyId,
				groupId, sostojanie_id, status_id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last izvewenija in the ordered set where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_id the sostojanie_id
	 * @param status_id the status_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching izvewenija
	 * @throws NoSuchIzvewenijaException if a matching izvewenija could not be found
	 */
	@Override
	public Izvewenija findByCompanyIdGroupIdSostojanieIdStatusId_Last(
		long companyId, long groupId, long sostojanie_id, long status_id,
		OrderByComparator<Izvewenija> orderByComparator)
		throws NoSuchIzvewenijaException {
		Izvewenija izvewenija = fetchByCompanyIdGroupIdSostojanieIdStatusId_Last(companyId,
				groupId, sostojanie_id, status_id, orderByComparator);

		if (izvewenija != null) {
			return izvewenija;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", sostojanie_id=");
		msg.append(sostojanie_id);

		msg.append(", status_id=");
		msg.append(status_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIzvewenijaException(msg.toString());
	}

	/**
	 * Returns the last izvewenija in the ordered set where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_id the sostojanie_id
	 * @param status_id the status_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching izvewenija, or <code>null</code> if a matching izvewenija could not be found
	 */
	@Override
	public Izvewenija fetchByCompanyIdGroupIdSostojanieIdStatusId_Last(
		long companyId, long groupId, long sostojanie_id, long status_id,
		OrderByComparator<Izvewenija> orderByComparator) {
		int count = countByCompanyIdGroupIdSostojanieIdStatusId(companyId,
				groupId, sostojanie_id, status_id);

		if (count == 0) {
			return null;
		}

		List<Izvewenija> list = findByCompanyIdGroupIdSostojanieIdStatusId(companyId,
				groupId, sostojanie_id, status_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the izvewenijas before and after the current izvewenija in the ordered set where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	 *
	 * @param izvewenija_id the primary key of the current izvewenija
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_id the sostojanie_id
	 * @param status_id the status_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next izvewenija
	 * @throws NoSuchIzvewenijaException if a izvewenija with the primary key could not be found
	 */
	@Override
	public Izvewenija[] findByCompanyIdGroupIdSostojanieIdStatusId_PrevAndNext(
		long izvewenija_id, long companyId, long groupId, long sostojanie_id,
		long status_id, OrderByComparator<Izvewenija> orderByComparator)
		throws NoSuchIzvewenijaException {
		Izvewenija izvewenija = findByPrimaryKey(izvewenija_id);

		Session session = null;

		try {
			session = openSession();

			Izvewenija[] array = new IzvewenijaImpl[3];

			array[0] = getByCompanyIdGroupIdSostojanieIdStatusId_PrevAndNext(session,
					izvewenija, companyId, groupId, sostojanie_id, status_id,
					orderByComparator, true);

			array[1] = izvewenija;

			array[2] = getByCompanyIdGroupIdSostojanieIdStatusId_PrevAndNext(session,
					izvewenija, companyId, groupId, sostojanie_id, status_id,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Izvewenija getByCompanyIdGroupIdSostojanieIdStatusId_PrevAndNext(
		Session session, Izvewenija izvewenija, long companyId, long groupId,
		long sostojanie_id, long status_id,
		OrderByComparator<Izvewenija> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_IZVEWENIJA_WHERE);

		query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_COMPANYID_2);

		query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_GROUPID_2);

		query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_SOSTOJANIE_ID_2);

		query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_STATUS_ID_2);

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
			query.append(IzvewenijaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		qPos.add(sostojanie_id);

		qPos.add(status_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(izvewenija);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Izvewenija> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_id the sostojanie_id
	 * @param status_id the status_id
	 * @return the matching izvewenijas that the user has permission to view
	 */
	@Override
	public List<Izvewenija> filterFindByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id) {
		return filterFindByCompanyIdGroupIdSostojanieIdStatusId(companyId,
			groupId, sostojanie_id, status_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_id the sostojanie_id
	 * @param status_id the status_id
	 * @param start the lower bound of the range of izvewenijas
	 * @param end the upper bound of the range of izvewenijas (not inclusive)
	 * @return the range of matching izvewenijas that the user has permission to view
	 */
	@Override
	public List<Izvewenija> filterFindByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id,
		int start, int end) {
		return filterFindByCompanyIdGroupIdSostojanieIdStatusId(companyId,
			groupId, sostojanie_id, status_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the izvewenijas that the user has permissions to view where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_id the sostojanie_id
	 * @param status_id the status_id
	 * @param start the lower bound of the range of izvewenijas
	 * @param end the upper bound of the range of izvewenijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching izvewenijas that the user has permission to view
	 */
	@Override
	public List<Izvewenija> filterFindByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id,
		int start, int end, OrderByComparator<Izvewenija> orderByComparator) {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByCompanyIdGroupIdSostojanieIdStatusId(companyId,
				groupId, sostojanie_id, status_id, start, end, orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 2));
		}
		else {
			query = new StringBundler(7);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_IZVEWENIJA_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_IZVEWENIJA_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_COMPANYID_2);

		query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_GROUPID_2);

		query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_SOSTOJANIE_ID_2);

		query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_STATUS_ID_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_IZVEWENIJA_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator, true);
			}
			else {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
					orderByComparator, true);
			}
		}
		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(IzvewenijaModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(IzvewenijaModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				Izvewenija.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSynchronizedSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, IzvewenijaImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, IzvewenijaImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(companyId);

			qPos.add(groupId);

			qPos.add(sostojanie_id);

			qPos.add(status_id);

			return (List<Izvewenija>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the izvewenijas before and after the current izvewenija in the ordered set of izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	 *
	 * @param izvewenija_id the primary key of the current izvewenija
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_id the sostojanie_id
	 * @param status_id the status_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next izvewenija
	 * @throws NoSuchIzvewenijaException if a izvewenija with the primary key could not be found
	 */
	@Override
	public Izvewenija[] filterFindByCompanyIdGroupIdSostojanieIdStatusId_PrevAndNext(
		long izvewenija_id, long companyId, long groupId, long sostojanie_id,
		long status_id, OrderByComparator<Izvewenija> orderByComparator)
		throws NoSuchIzvewenijaException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByCompanyIdGroupIdSostojanieIdStatusId_PrevAndNext(izvewenija_id,
				companyId, groupId, sostojanie_id, status_id, orderByComparator);
		}

		Izvewenija izvewenija = findByPrimaryKey(izvewenija_id);

		Session session = null;

		try {
			session = openSession();

			Izvewenija[] array = new IzvewenijaImpl[3];

			array[0] = filterGetByCompanyIdGroupIdSostojanieIdStatusId_PrevAndNext(session,
					izvewenija, companyId, groupId, sostojanie_id, status_id,
					orderByComparator, true);

			array[1] = izvewenija;

			array[2] = filterGetByCompanyIdGroupIdSostojanieIdStatusId_PrevAndNext(session,
					izvewenija, companyId, groupId, sostojanie_id, status_id,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Izvewenija filterGetByCompanyIdGroupIdSostojanieIdStatusId_PrevAndNext(
		Session session, Izvewenija izvewenija, long companyId, long groupId,
		long sostojanie_id, long status_id,
		OrderByComparator<Izvewenija> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(8 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(7);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_IZVEWENIJA_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_IZVEWENIJA_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_COMPANYID_2);

		query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_GROUPID_2);

		query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_SOSTOJANIE_ID_2);

		query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_STATUS_ID_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_IZVEWENIJA_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
			if (getDB().isSupportsInlineDistinct()) {
				query.append(IzvewenijaModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(IzvewenijaModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				Izvewenija.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		SQLQuery q = session.createSynchronizedSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, IzvewenijaImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, IzvewenijaImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		qPos.add(sostojanie_id);

		qPos.add(status_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(izvewenija);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Izvewenija> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_ids the sostojanie_ids
	 * @param status_ids the status_ids
	 * @return the matching izvewenijas that the user has permission to view
	 */
	@Override
	public List<Izvewenija> filterFindByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids) {
		return filterFindByCompanyIdGroupIdSostojanieIdStatusId(companyId,
			groupId, sostojanie_ids, status_ids, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_ids the sostojanie_ids
	 * @param status_ids the status_ids
	 * @param start the lower bound of the range of izvewenijas
	 * @param end the upper bound of the range of izvewenijas (not inclusive)
	 * @return the range of matching izvewenijas that the user has permission to view
	 */
	@Override
	public List<Izvewenija> filterFindByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids,
		int start, int end) {
		return filterFindByCompanyIdGroupIdSostojanieIdStatusId(companyId,
			groupId, sostojanie_ids, status_ids, start, end, null);
	}

	/**
	 * Returns an ordered range of all the izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_ids the sostojanie_ids
	 * @param status_ids the status_ids
	 * @param start the lower bound of the range of izvewenijas
	 * @param end the upper bound of the range of izvewenijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching izvewenijas that the user has permission to view
	 */
	@Override
	public List<Izvewenija> filterFindByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids,
		int start, int end, OrderByComparator<Izvewenija> orderByComparator) {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByCompanyIdGroupIdSostojanieIdStatusId(companyId,
				groupId, sostojanie_ids, status_ids, start, end,
				orderByComparator);
		}

		if (sostojanie_ids == null) {
			sostojanie_ids = new long[0];
		}
		else if (sostojanie_ids.length > 1) {
			sostojanie_ids = ArrayUtil.unique(sostojanie_ids);

			Arrays.sort(sostojanie_ids);
		}

		if (status_ids == null) {
			status_ids = new long[0];
		}
		else if (status_ids.length > 1) {
			status_ids = ArrayUtil.unique(status_ids);

			Arrays.sort(status_ids);
		}

		StringBundler query = new StringBundler();

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_IZVEWENIJA_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_IZVEWENIJA_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_COMPANYID_2);

		query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_GROUPID_2);

		if (sostojanie_ids.length > 0) {
			query.append(StringPool.OPEN_PARENTHESIS);

			query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_SOSTOJANIE_ID_7);

			query.append(StringUtil.merge(sostojanie_ids));

			query.append(StringPool.CLOSE_PARENTHESIS);

			query.append(StringPool.CLOSE_PARENTHESIS);

			query.append(WHERE_AND);
		}

		if (status_ids.length > 0) {
			query.append(StringPool.OPEN_PARENTHESIS);

			query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_STATUS_ID_7);

			query.append(StringUtil.merge(status_ids));

			query.append(StringPool.CLOSE_PARENTHESIS);

			query.append(StringPool.CLOSE_PARENTHESIS);
		}

		query.setStringAt(removeConjunction(query.stringAt(query.index() - 1)),
			query.index() - 1);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_IZVEWENIJA_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator, true);
			}
			else {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
					orderByComparator, true);
			}
		}
		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(IzvewenijaModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(IzvewenijaModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				Izvewenija.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSynchronizedSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, IzvewenijaImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, IzvewenijaImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(companyId);

			qPos.add(groupId);

			return (List<Izvewenija>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_ids the sostojanie_ids
	 * @param status_ids the status_ids
	 * @return the matching izvewenijas
	 */
	@Override
	public List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids) {
		return findByCompanyIdGroupIdSostojanieIdStatusId(companyId, groupId,
			sostojanie_ids, status_ids, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_ids the sostojanie_ids
	 * @param status_ids the status_ids
	 * @param start the lower bound of the range of izvewenijas
	 * @param end the upper bound of the range of izvewenijas (not inclusive)
	 * @return the range of matching izvewenijas
	 */
	@Override
	public List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids,
		int start, int end) {
		return findByCompanyIdGroupIdSostojanieIdStatusId(companyId, groupId,
			sostojanie_ids, status_ids, start, end, null);
	}

	/**
	 * Returns an ordered range of all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_ids the sostojanie_ids
	 * @param status_ids the status_ids
	 * @param start the lower bound of the range of izvewenijas
	 * @param end the upper bound of the range of izvewenijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching izvewenijas
	 */
	@Override
	public List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids,
		int start, int end, OrderByComparator<Izvewenija> orderByComparator) {
		return findByCompanyIdGroupIdSostojanieIdStatusId(companyId, groupId,
			sostojanie_ids, status_ids, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_id the sostojanie_id
	 * @param status_id the status_id
	 * @param start the lower bound of the range of izvewenijas
	 * @param end the upper bound of the range of izvewenijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching izvewenijas
	 */
	@Override
	public List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids,
		int start, int end, OrderByComparator<Izvewenija> orderByComparator,
		boolean retrieveFromCache) {
		if (sostojanie_ids == null) {
			sostojanie_ids = new long[0];
		}
		else if (sostojanie_ids.length > 1) {
			sostojanie_ids = ArrayUtil.unique(sostojanie_ids);

			Arrays.sort(sostojanie_ids);
		}

		if (status_ids == null) {
			status_ids = new long[0];
		}
		else if (status_ids.length > 1) {
			status_ids = ArrayUtil.unique(status_ids);

			Arrays.sort(status_ids);
		}

		if ((sostojanie_ids.length == 1) && (status_ids.length == 1)) {
			return findByCompanyIdGroupIdSostojanieIdStatusId(companyId,
				groupId, sostojanie_ids[0], status_ids[0], start, end,
				orderByComparator);
		}

		boolean pagination = true;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderArgs = new Object[] {
					companyId, groupId, StringUtil.merge(sostojanie_ids),
					StringUtil.merge(status_ids)
				};
		}
		else {
			finderArgs = new Object[] {
					companyId, groupId, StringUtil.merge(sostojanie_ids),
					StringUtil.merge(status_ids),
					
					start, end, orderByComparator
				};
		}

		List<Izvewenija> list = null;

		if (retrieveFromCache) {
			list = (List<Izvewenija>)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Izvewenija izvewenija : list) {
					if ((companyId != izvewenija.getCompanyId()) ||
							(groupId != izvewenija.getGroupId()) ||
							!ArrayUtil.contains(sostojanie_ids,
								izvewenija.getSostojanie_id()) ||
							!ArrayUtil.contains(status_ids,
								izvewenija.getStatus_id())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_IZVEWENIJA_WHERE);

			query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_GROUPID_2);

			if (sostojanie_ids.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_SOSTOJANIE_ID_7);

				query.append(StringUtil.merge(sostojanie_ids));

				query.append(StringPool.CLOSE_PARENTHESIS);

				query.append(StringPool.CLOSE_PARENTHESIS);

				query.append(WHERE_AND);
			}

			if (status_ids.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_STATUS_ID_7);

				query.append(StringUtil.merge(status_ids));

				query.append(StringPool.CLOSE_PARENTHESIS);

				query.append(StringPool.CLOSE_PARENTHESIS);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(IzvewenijaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<Izvewenija>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Izvewenija>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID,
					finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_id the sostojanie_id
	 * @param status_id the status_id
	 */
	@Override
	public void removeByCompanyIdGroupIdSostojanieIdStatusId(long companyId,
		long groupId, long sostojanie_id, long status_id) {
		for (Izvewenija izvewenija : findByCompanyIdGroupIdSostojanieIdStatusId(
				companyId, groupId, sostojanie_id, status_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(izvewenija);
		}
	}

	/**
	 * Returns the number of izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_id the sostojanie_id
	 * @param status_id the status_id
	 * @return the number of matching izvewenijas
	 */
	@Override
	public int countByCompanyIdGroupIdSostojanieIdStatusId(long companyId,
		long groupId, long sostojanie_id, long status_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID;

		Object[] finderArgs = new Object[] {
				companyId, groupId, sostojanie_id, status_id
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_IZVEWENIJA_WHERE);

			query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_GROUPID_2);

			query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_SOSTOJANIE_ID_2);

			query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_STATUS_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(sostojanie_id);

				qPos.add(status_id);

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

	/**
	 * Returns the number of izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_ids the sostojanie_ids
	 * @param status_ids the status_ids
	 * @return the number of matching izvewenijas
	 */
	@Override
	public int countByCompanyIdGroupIdSostojanieIdStatusId(long companyId,
		long groupId, long[] sostojanie_ids, long[] status_ids) {
		if (sostojanie_ids == null) {
			sostojanie_ids = new long[0];
		}
		else if (sostojanie_ids.length > 1) {
			sostojanie_ids = ArrayUtil.unique(sostojanie_ids);

			Arrays.sort(sostojanie_ids);
		}

		if (status_ids == null) {
			status_ids = new long[0];
		}
		else if (status_ids.length > 1) {
			status_ids = ArrayUtil.unique(status_ids);

			Arrays.sort(status_ids);
		}

		Object[] finderArgs = new Object[] {
				companyId, groupId, StringUtil.merge(sostojanie_ids),
				StringUtil.merge(status_ids)
			};

		Long count = (Long)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_IZVEWENIJA_WHERE);

			query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_GROUPID_2);

			if (sostojanie_ids.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_SOSTOJANIE_ID_7);

				query.append(StringUtil.merge(sostojanie_ids));

				query.append(StringPool.CLOSE_PARENTHESIS);

				query.append(StringPool.CLOSE_PARENTHESIS);

				query.append(WHERE_AND);
			}

			if (status_ids.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_STATUS_ID_7);

				query.append(StringUtil.merge(status_ids));

				query.append(StringPool.CLOSE_PARENTHESIS);

				query.append(StringPool.CLOSE_PARENTHESIS);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID,
					finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_id the sostojanie_id
	 * @param status_id the status_id
	 * @return the number of matching izvewenijas that the user has permission to view
	 */
	@Override
	public int filterCountByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id) {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByCompanyIdGroupIdSostojanieIdStatusId(companyId,
				groupId, sostojanie_id, status_id);
		}

		StringBundler query = new StringBundler(5);

		query.append(_FILTER_SQL_COUNT_IZVEWENIJA_WHERE);

		query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_COMPANYID_2);

		query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_GROUPID_2);

		query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_SOSTOJANIE_ID_2);

		query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_STATUS_ID_2);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				Izvewenija.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSynchronizedSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(companyId);

			qPos.add(groupId);

			qPos.add(sostojanie_id);

			qPos.add(status_id);

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the number of izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param sostojanie_ids the sostojanie_ids
	 * @param status_ids the status_ids
	 * @return the number of matching izvewenijas that the user has permission to view
	 */
	@Override
	public int filterCountByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids) {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByCompanyIdGroupIdSostojanieIdStatusId(companyId,
				groupId, sostojanie_ids, status_ids);
		}

		if (sostojanie_ids == null) {
			sostojanie_ids = new long[0];
		}
		else if (sostojanie_ids.length > 1) {
			sostojanie_ids = ArrayUtil.unique(sostojanie_ids);

			Arrays.sort(sostojanie_ids);
		}

		if (status_ids == null) {
			status_ids = new long[0];
		}
		else if (status_ids.length > 1) {
			status_ids = ArrayUtil.unique(status_ids);

			Arrays.sort(status_ids);
		}

		StringBundler query = new StringBundler();

		query.append(_FILTER_SQL_COUNT_IZVEWENIJA_WHERE);

		query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_COMPANYID_2);

		query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_GROUPID_2);

		if (sostojanie_ids.length > 0) {
			query.append(StringPool.OPEN_PARENTHESIS);

			query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_SOSTOJANIE_ID_7);

			query.append(StringUtil.merge(sostojanie_ids));

			query.append(StringPool.CLOSE_PARENTHESIS);

			query.append(StringPool.CLOSE_PARENTHESIS);

			query.append(WHERE_AND);
		}

		if (status_ids.length > 0) {
			query.append(StringPool.OPEN_PARENTHESIS);

			query.append(_FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_STATUS_ID_7);

			query.append(StringUtil.merge(status_ids));

			query.append(StringPool.CLOSE_PARENTHESIS);

			query.append(StringPool.CLOSE_PARENTHESIS);
		}

		query.setStringAt(removeConjunction(query.stringAt(query.index() - 1)),
			query.index() - 1);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				Izvewenija.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSynchronizedSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(companyId);

			qPos.add(groupId);

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	private static final String _FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_COMPANYID_2 =
		"izvewenija.companyId = ? AND ";
	private static final String _FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_GROUPID_2 =
		"izvewenija.groupId = ? AND ";
	private static final String _FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_SOSTOJANIE_ID_2 =
		"izvewenija.sostojanie_id = ? AND ";
	private static final String _FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_SOSTOJANIE_ID_7 =
		"izvewenija.sostojanie_id IN (";
	private static final String _FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_STATUS_ID_2 =
		"izvewenija.status_id = ?";
	private static final String _FINDER_COLUMN_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID_STATUS_ID_7 =
		"izvewenija.status_id IN (";
	public static final FinderPath FINDER_PATH_FETCH_BY_USERGROUPID = new FinderPath(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			IzvewenijaModelImpl.FINDER_CACHE_ENABLED, IzvewenijaImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUserGroupId",
			new String[] { Long.class.getName() },
			IzvewenijaModelImpl.USERGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERGROUPID = new FinderPath(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			IzvewenijaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the izvewenija where UserGroupId = &#63; or throws a {@link NoSuchIzvewenijaException} if it could not be found.
	 *
	 * @param UserGroupId the user group ID
	 * @return the matching izvewenija
	 * @throws NoSuchIzvewenijaException if a matching izvewenija could not be found
	 */
	@Override
	public Izvewenija findByUserGroupId(long UserGroupId)
		throws NoSuchIzvewenijaException {
		Izvewenija izvewenija = fetchByUserGroupId(UserGroupId);

		if (izvewenija == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("UserGroupId=");
			msg.append(UserGroupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchIzvewenijaException(msg.toString());
		}

		return izvewenija;
	}

	/**
	 * Returns the izvewenija where UserGroupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param UserGroupId the user group ID
	 * @return the matching izvewenija, or <code>null</code> if a matching izvewenija could not be found
	 */
	@Override
	public Izvewenija fetchByUserGroupId(long UserGroupId) {
		return fetchByUserGroupId(UserGroupId, true);
	}

	/**
	 * Returns the izvewenija where UserGroupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param UserGroupId the user group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching izvewenija, or <code>null</code> if a matching izvewenija could not be found
	 */
	@Override
	public Izvewenija fetchByUserGroupId(long UserGroupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { UserGroupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_USERGROUPID,
					finderArgs, this);
		}

		if (result instanceof Izvewenija) {
			Izvewenija izvewenija = (Izvewenija)result;

			if ((UserGroupId != izvewenija.getUserGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_IZVEWENIJA_WHERE);

			query.append(_FINDER_COLUMN_USERGROUPID_USERGROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(UserGroupId);

				List<Izvewenija> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_USERGROUPID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"IzvewenijaPersistenceImpl.fetchByUserGroupId(long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					Izvewenija izvewenija = list.get(0);

					result = izvewenija;

					cacheResult(izvewenija);

					if ((izvewenija.getUserGroupId() != UserGroupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_USERGROUPID,
							finderArgs, izvewenija);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_USERGROUPID,
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
			return (Izvewenija)result;
		}
	}

	/**
	 * Removes the izvewenija where UserGroupId = &#63; from the database.
	 *
	 * @param UserGroupId the user group ID
	 * @return the izvewenija that was removed
	 */
	@Override
	public Izvewenija removeByUserGroupId(long UserGroupId)
		throws NoSuchIzvewenijaException {
		Izvewenija izvewenija = findByUserGroupId(UserGroupId);

		return remove(izvewenija);
	}

	/**
	 * Returns the number of izvewenijas where UserGroupId = &#63;.
	 *
	 * @param UserGroupId the user group ID
	 * @return the number of matching izvewenijas
	 */
	@Override
	public int countByUserGroupId(long UserGroupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERGROUPID;

		Object[] finderArgs = new Object[] { UserGroupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_IZVEWENIJA_WHERE);

			query.append(_FINDER_COLUMN_USERGROUPID_USERGROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(UserGroupId);

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

	private static final String _FINDER_COLUMN_USERGROUPID_USERGROUPID_2 = "izvewenija.UserGroupId = ?";

	public IzvewenijaPersistenceImpl() {
		setModelClass(Izvewenija.class);
	}

	/**
	 * Caches the izvewenija in the entity cache if it is enabled.
	 *
	 * @param izvewenija the izvewenija
	 */
	@Override
	public void cacheResult(Izvewenija izvewenija) {
		entityCache.putResult(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			IzvewenijaImpl.class, izvewenija.getPrimaryKey(), izvewenija);

		finderCache.putResult(FINDER_PATH_FETCH_BY_USERGROUPID,
			new Object[] { izvewenija.getUserGroupId() }, izvewenija);

		izvewenija.resetOriginalValues();
	}

	/**
	 * Caches the izvewenijas in the entity cache if it is enabled.
	 *
	 * @param izvewenijas the izvewenijas
	 */
	@Override
	public void cacheResult(List<Izvewenija> izvewenijas) {
		for (Izvewenija izvewenija : izvewenijas) {
			if (entityCache.getResult(
						IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
						IzvewenijaImpl.class, izvewenija.getPrimaryKey()) == null) {
				cacheResult(izvewenija);
			}
			else {
				izvewenija.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all izvewenijas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(IzvewenijaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the izvewenija.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Izvewenija izvewenija) {
		entityCache.removeResult(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			IzvewenijaImpl.class, izvewenija.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((IzvewenijaModelImpl)izvewenija, true);
	}

	@Override
	public void clearCache(List<Izvewenija> izvewenijas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Izvewenija izvewenija : izvewenijas) {
			entityCache.removeResult(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
				IzvewenijaImpl.class, izvewenija.getPrimaryKey());

			clearUniqueFindersCache((IzvewenijaModelImpl)izvewenija, true);
		}
	}

	protected void cacheUniqueFindersCache(
		IzvewenijaModelImpl izvewenijaModelImpl) {
		Object[] args = new Object[] { izvewenijaModelImpl.getUserGroupId() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_USERGROUPID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_USERGROUPID, args,
			izvewenijaModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		IzvewenijaModelImpl izvewenijaModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] { izvewenijaModelImpl.getUserGroupId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_USERGROUPID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_USERGROUPID, args);
		}

		if ((izvewenijaModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_USERGROUPID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					izvewenijaModelImpl.getOriginalUserGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_USERGROUPID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_USERGROUPID, args);
		}
	}

	/**
	 * Creates a new izvewenija with the primary key. Does not add the izvewenija to the database.
	 *
	 * @param izvewenija_id the primary key for the new izvewenija
	 * @return the new izvewenija
	 */
	@Override
	public Izvewenija create(long izvewenija_id) {
		Izvewenija izvewenija = new IzvewenijaImpl();

		izvewenija.setNew(true);
		izvewenija.setPrimaryKey(izvewenija_id);

		izvewenija.setCompanyId(companyProvider.getCompanyId());

		return izvewenija;
	}

	/**
	 * Removes the izvewenija with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param izvewenija_id the primary key of the izvewenija
	 * @return the izvewenija that was removed
	 * @throws NoSuchIzvewenijaException if a izvewenija with the primary key could not be found
	 */
	@Override
	public Izvewenija remove(long izvewenija_id)
		throws NoSuchIzvewenijaException {
		return remove((Serializable)izvewenija_id);
	}

	/**
	 * Removes the izvewenija with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the izvewenija
	 * @return the izvewenija that was removed
	 * @throws NoSuchIzvewenijaException if a izvewenija with the primary key could not be found
	 */
	@Override
	public Izvewenija remove(Serializable primaryKey)
		throws NoSuchIzvewenijaException {
		Session session = null;

		try {
			session = openSession();

			Izvewenija izvewenija = (Izvewenija)session.get(IzvewenijaImpl.class,
					primaryKey);

			if (izvewenija == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchIzvewenijaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(izvewenija);
		}
		catch (NoSuchIzvewenijaException nsee) {
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
	protected Izvewenija removeImpl(Izvewenija izvewenija) {
		izvewenija = toUnwrappedModel(izvewenija);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(izvewenija)) {
				izvewenija = (Izvewenija)session.get(IzvewenijaImpl.class,
						izvewenija.getPrimaryKeyObj());
			}

			if (izvewenija != null) {
				session.delete(izvewenija);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (izvewenija != null) {
			clearCache(izvewenija);
		}

		return izvewenija;
	}

	@Override
	public Izvewenija updateImpl(Izvewenija izvewenija) {
		izvewenija = toUnwrappedModel(izvewenija);

		boolean isNew = izvewenija.isNew();

		IzvewenijaModelImpl izvewenijaModelImpl = (IzvewenijaModelImpl)izvewenija;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (izvewenija.getCreateDate() == null)) {
			if (serviceContext == null) {
				izvewenija.setCreateDate(now);
			}
			else {
				izvewenija.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!izvewenijaModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				izvewenija.setModifiedDate(now);
			}
			else {
				izvewenija.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (izvewenija.isNew()) {
				session.save(izvewenija);

				izvewenija.setNew(false);
			}
			else {
				izvewenija = (Izvewenija)session.merge(izvewenija);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !IzvewenijaModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((izvewenijaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						izvewenijaModelImpl.getOriginalCompanyId(),
						izvewenijaModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPANYID_GROUPID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID_GROUPID,
					args);

				args = new Object[] {
						izvewenijaModelImpl.getCompanyId(),
						izvewenijaModelImpl.getGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPANYID_GROUPID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID_GROUPID,
					args);
			}

			if ((izvewenijaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIJAID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						izvewenijaModelImpl.getOriginalIzvewenija_id(),
						izvewenijaModelImpl.getOriginalSozdal()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIJAID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIJAID,
					args);

				args = new Object[] {
						izvewenijaModelImpl.getIzvewenija_id(),
						izvewenijaModelImpl.getSozdal()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIJAID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIJAID,
					args);
			}

			if ((izvewenijaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						izvewenijaModelImpl.getOriginalCompanyId(),
						izvewenijaModelImpl.getOriginalGroupId(),
						izvewenijaModelImpl.getOriginalSostojanie_id(),
						izvewenijaModelImpl.getOriginalStatus_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID,
					args);

				args = new Object[] {
						izvewenijaModelImpl.getCompanyId(),
						izvewenijaModelImpl.getGroupId(),
						izvewenijaModelImpl.getSostojanie_id(),
						izvewenijaModelImpl.getStatus_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDGROUPIDSOSTOJANIEIDSTATUSID,
					args);
			}
		}

		entityCache.putResult(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			IzvewenijaImpl.class, izvewenija.getPrimaryKey(), izvewenija, false);

		clearUniqueFindersCache(izvewenijaModelImpl, false);
		cacheUniqueFindersCache(izvewenijaModelImpl);

		izvewenija.resetOriginalValues();

		return izvewenija;
	}

	protected Izvewenija toUnwrappedModel(Izvewenija izvewenija) {
		if (izvewenija instanceof IzvewenijaImpl) {
			return izvewenija;
		}

		IzvewenijaImpl izvewenijaImpl = new IzvewenijaImpl();

		izvewenijaImpl.setNew(izvewenija.isNew());
		izvewenijaImpl.setPrimaryKey(izvewenija.getPrimaryKey());

		izvewenijaImpl.setModifiedDate(izvewenija.getModifiedDate());
		izvewenijaImpl.setCreateDate(izvewenija.getCreateDate());
		izvewenijaImpl.setIzmenil(izvewenija.getIzmenil());
		izvewenijaImpl.setIzvewenija_id(izvewenija.getIzvewenija_id());
		izvewenijaImpl.setKod_id(izvewenija.getKod_id());
		izvewenijaImpl.setNaimenovanie(izvewenija.getNaimenovanie());
		izvewenijaImpl.setOrganizacija_id(izvewenija.getOrganizacija_id());
		izvewenijaImpl.setSostojanie_id(izvewenija.getSostojanie_id());
		izvewenijaImpl.setSozdal(izvewenija.getSozdal());
		izvewenijaImpl.setStatus_id(izvewenija.getStatus_id());
		izvewenijaImpl.setTip_izvewenija_id(izvewenija.getTip_izvewenija_id());
		izvewenijaImpl.setVyshestojawaja_organizacija_id(izvewenija.getVyshestojawaja_organizacija_id());
		izvewenijaImpl.setUserId(izvewenija.getUserId());
		izvewenijaImpl.setGroupId(izvewenija.getGroupId());
		izvewenijaImpl.setCompanyId(izvewenija.getCompanyId());
		izvewenijaImpl.setUserName(izvewenija.getUserName());
		izvewenijaImpl.setUserGroupId(izvewenija.getUserGroupId());

		return izvewenijaImpl;
	}

	/**
	 * Returns the izvewenija with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the izvewenija
	 * @return the izvewenija
	 * @throws NoSuchIzvewenijaException if a izvewenija with the primary key could not be found
	 */
	@Override
	public Izvewenija findByPrimaryKey(Serializable primaryKey)
		throws NoSuchIzvewenijaException {
		Izvewenija izvewenija = fetchByPrimaryKey(primaryKey);

		if (izvewenija == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchIzvewenijaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return izvewenija;
	}

	/**
	 * Returns the izvewenija with the primary key or throws a {@link NoSuchIzvewenijaException} if it could not be found.
	 *
	 * @param izvewenija_id the primary key of the izvewenija
	 * @return the izvewenija
	 * @throws NoSuchIzvewenijaException if a izvewenija with the primary key could not be found
	 */
	@Override
	public Izvewenija findByPrimaryKey(long izvewenija_id)
		throws NoSuchIzvewenijaException {
		return findByPrimaryKey((Serializable)izvewenija_id);
	}

	/**
	 * Returns the izvewenija with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the izvewenija
	 * @return the izvewenija, or <code>null</code> if a izvewenija with the primary key could not be found
	 */
	@Override
	public Izvewenija fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
				IzvewenijaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Izvewenija izvewenija = (Izvewenija)serializable;

		if (izvewenija == null) {
			Session session = null;

			try {
				session = openSession();

				izvewenija = (Izvewenija)session.get(IzvewenijaImpl.class,
						primaryKey);

				if (izvewenija != null) {
					cacheResult(izvewenija);
				}
				else {
					entityCache.putResult(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
						IzvewenijaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
					IzvewenijaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return izvewenija;
	}

	/**
	 * Returns the izvewenija with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param izvewenija_id the primary key of the izvewenija
	 * @return the izvewenija, or <code>null</code> if a izvewenija with the primary key could not be found
	 */
	@Override
	public Izvewenija fetchByPrimaryKey(long izvewenija_id) {
		return fetchByPrimaryKey((Serializable)izvewenija_id);
	}

	@Override
	public Map<Serializable, Izvewenija> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Izvewenija> map = new HashMap<Serializable, Izvewenija>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Izvewenija izvewenija = fetchByPrimaryKey(primaryKey);

			if (izvewenija != null) {
				map.put(primaryKey, izvewenija);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
					IzvewenijaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Izvewenija)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_IZVEWENIJA_WHERE_PKS_IN);

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

			for (Izvewenija izvewenija : (List<Izvewenija>)q.list()) {
				map.put(izvewenija.getPrimaryKeyObj(), izvewenija);

				cacheResult(izvewenija);

				uncachedPrimaryKeys.remove(izvewenija.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
					IzvewenijaImpl.class, primaryKey, nullModel);
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
	 * Returns all the izvewenijas.
	 *
	 * @return the izvewenijas
	 */
	@Override
	public List<Izvewenija> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the izvewenijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of izvewenijas
	 * @param end the upper bound of the range of izvewenijas (not inclusive)
	 * @return the range of izvewenijas
	 */
	@Override
	public List<Izvewenija> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the izvewenijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of izvewenijas
	 * @param end the upper bound of the range of izvewenijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of izvewenijas
	 */
	@Override
	public List<Izvewenija> findAll(int start, int end,
		OrderByComparator<Izvewenija> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the izvewenijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of izvewenijas
	 * @param end the upper bound of the range of izvewenijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of izvewenijas
	 */
	@Override
	public List<Izvewenija> findAll(int start, int end,
		OrderByComparator<Izvewenija> orderByComparator,
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

		List<Izvewenija> list = null;

		if (retrieveFromCache) {
			list = (List<Izvewenija>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_IZVEWENIJA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_IZVEWENIJA;

				if (pagination) {
					sql = sql.concat(IzvewenijaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Izvewenija>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Izvewenija>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the izvewenijas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Izvewenija izvewenija : findAll()) {
			remove(izvewenija);
		}
	}

	/**
	 * Returns the number of izvewenijas.
	 *
	 * @return the number of izvewenijas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_IZVEWENIJA);

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
		return IzvewenijaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the izvewenija persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(IzvewenijaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_IZVEWENIJA = "SELECT izvewenija FROM Izvewenija izvewenija";
	private static final String _SQL_SELECT_IZVEWENIJA_WHERE_PKS_IN = "SELECT izvewenija FROM Izvewenija izvewenija WHERE izvewenija_id IN (";
	private static final String _SQL_SELECT_IZVEWENIJA_WHERE = "SELECT izvewenija FROM Izvewenija izvewenija WHERE ";
	private static final String _SQL_COUNT_IZVEWENIJA = "SELECT COUNT(izvewenija) FROM Izvewenija izvewenija";
	private static final String _SQL_COUNT_IZVEWENIJA_WHERE = "SELECT COUNT(izvewenija) FROM Izvewenija izvewenija WHERE ";
	private static final String _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN = "izvewenija.izvewenija_id";
	private static final String _FILTER_SQL_SELECT_IZVEWENIJA_WHERE = "SELECT DISTINCT {izvewenija.*} FROM sapp.izvewenija izvewenija WHERE ";
	private static final String _FILTER_SQL_SELECT_IZVEWENIJA_NO_INLINE_DISTINCT_WHERE_1 =
		"SELECT {sapp.izvewenija.*} FROM (SELECT DISTINCT izvewenija.izvewenija_id FROM sapp.izvewenija izvewenija WHERE ";
	private static final String _FILTER_SQL_SELECT_IZVEWENIJA_NO_INLINE_DISTINCT_WHERE_2 =
		") TEMP_TABLE INNER JOIN sapp.izvewenija ON TEMP_TABLE.izvewenija_id = sapp.izvewenija.izvewenija_id";
	private static final String _FILTER_SQL_COUNT_IZVEWENIJA_WHERE = "SELECT COUNT(DISTINCT izvewenija.izvewenija_id) AS COUNT_VALUE FROM sapp.izvewenija izvewenija WHERE ";
	private static final String _FILTER_ENTITY_ALIAS = "izvewenija";
	private static final String _FILTER_ENTITY_TABLE = "sapp.izvewenija";
	private static final String _ORDER_BY_ENTITY_ALIAS = "izvewenija.";
	private static final String _ORDER_BY_ENTITY_TABLE = "sapp.izvewenija.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Izvewenija exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Izvewenija exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(IzvewenijaPersistenceImpl.class);
}