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

package tj.izvewenieput.service.persistence.impl;

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

import tj.izvewenieput.exception.NoSuchIzveweniePutException;

import tj.izvewenieput.model.IzveweniePut;
import tj.izvewenieput.model.impl.IzveweniePutImpl;
import tj.izvewenieput.model.impl.IzveweniePutModelImpl;

import tj.izvewenieput.service.persistence.IzveweniePutPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the izvewenie put service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IzveweniePutPersistence
 * @see tj.izvewenieput.service.persistence.IzveweniePutUtil
 * @generated
 */
@ProviderType
public class IzveweniePutPersistenceImpl extends BasePersistenceImpl<IzveweniePut>
	implements IzveweniePutPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link IzveweniePutUtil} to access the izvewenie put persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = IzveweniePutImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(IzveweniePutModelImpl.ENTITY_CACHE_ENABLED,
			IzveweniePutModelImpl.FINDER_CACHE_ENABLED, IzveweniePutImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(IzveweniePutModelImpl.ENTITY_CACHE_ENABLED,
			IzveweniePutModelImpl.FINDER_CACHE_ENABLED, IzveweniePutImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(IzveweniePutModelImpl.ENTITY_CACHE_ENABLED,
			IzveweniePutModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IZVEWENIEID =
		new FinderPath(IzveweniePutModelImpl.ENTITY_CACHE_ENABLED,
			IzveweniePutModelImpl.FINDER_CACHE_ENABLED, IzveweniePutImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByIzvewenieId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID =
		new FinderPath(IzveweniePutModelImpl.ENTITY_CACHE_ENABLED,
			IzveweniePutModelImpl.FINDER_CACHE_ENABLED, IzveweniePutImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByIzvewenieId",
			new String[] { Long.class.getName() },
			IzveweniePutModelImpl.IZVEWENIE_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IZVEWENIEID = new FinderPath(IzveweniePutModelImpl.ENTITY_CACHE_ENABLED,
			IzveweniePutModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIzvewenieId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the izvewenie puts where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the matching izvewenie puts
	 */
	@Override
	public List<IzveweniePut> findByIzvewenieId(long izvewenie_id) {
		return findByIzvewenieId(izvewenie_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the izvewenie puts where izvewenie_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzveweniePutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param start the lower bound of the range of izvewenie puts
	 * @param end the upper bound of the range of izvewenie puts (not inclusive)
	 * @return the range of matching izvewenie puts
	 */
	@Override
	public List<IzveweniePut> findByIzvewenieId(long izvewenie_id, int start,
		int end) {
		return findByIzvewenieId(izvewenie_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the izvewenie puts where izvewenie_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzveweniePutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param start the lower bound of the range of izvewenie puts
	 * @param end the upper bound of the range of izvewenie puts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching izvewenie puts
	 */
	@Override
	public List<IzveweniePut> findByIzvewenieId(long izvewenie_id, int start,
		int end, OrderByComparator<IzveweniePut> orderByComparator) {
		return findByIzvewenieId(izvewenie_id, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the izvewenie puts where izvewenie_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzveweniePutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param start the lower bound of the range of izvewenie puts
	 * @param end the upper bound of the range of izvewenie puts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching izvewenie puts
	 */
	@Override
	public List<IzveweniePut> findByIzvewenieId(long izvewenie_id, int start,
		int end, OrderByComparator<IzveweniePut> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID;
			finderArgs = new Object[] { izvewenie_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_IZVEWENIEID;
			finderArgs = new Object[] {
					izvewenie_id,
					
					start, end, orderByComparator
				};
		}

		List<IzveweniePut> list = null;

		if (retrieveFromCache) {
			list = (List<IzveweniePut>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (IzveweniePut izveweniePut : list) {
					if ((izvewenie_id != izveweniePut.getIzvewenie_id())) {
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

			query.append(_SQL_SELECT_IZVEWENIEPUT_WHERE);

			query.append(_FINDER_COLUMN_IZVEWENIEID_IZVEWENIE_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(IzveweniePutModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(izvewenie_id);

				if (!pagination) {
					list = (List<IzveweniePut>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<IzveweniePut>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first izvewenie put in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching izvewenie put
	 * @throws NoSuchIzveweniePutException if a matching izvewenie put could not be found
	 */
	@Override
	public IzveweniePut findByIzvewenieId_First(long izvewenie_id,
		OrderByComparator<IzveweniePut> orderByComparator)
		throws NoSuchIzveweniePutException {
		IzveweniePut izveweniePut = fetchByIzvewenieId_First(izvewenie_id,
				orderByComparator);

		if (izveweniePut != null) {
			return izveweniePut;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("izvewenie_id=");
		msg.append(izvewenie_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIzveweniePutException(msg.toString());
	}

	/**
	 * Returns the first izvewenie put in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching izvewenie put, or <code>null</code> if a matching izvewenie put could not be found
	 */
	@Override
	public IzveweniePut fetchByIzvewenieId_First(long izvewenie_id,
		OrderByComparator<IzveweniePut> orderByComparator) {
		List<IzveweniePut> list = findByIzvewenieId(izvewenie_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last izvewenie put in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching izvewenie put
	 * @throws NoSuchIzveweniePutException if a matching izvewenie put could not be found
	 */
	@Override
	public IzveweniePut findByIzvewenieId_Last(long izvewenie_id,
		OrderByComparator<IzveweniePut> orderByComparator)
		throws NoSuchIzveweniePutException {
		IzveweniePut izveweniePut = fetchByIzvewenieId_Last(izvewenie_id,
				orderByComparator);

		if (izveweniePut != null) {
			return izveweniePut;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("izvewenie_id=");
		msg.append(izvewenie_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIzveweniePutException(msg.toString());
	}

	/**
	 * Returns the last izvewenie put in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching izvewenie put, or <code>null</code> if a matching izvewenie put could not be found
	 */
	@Override
	public IzveweniePut fetchByIzvewenieId_Last(long izvewenie_id,
		OrderByComparator<IzveweniePut> orderByComparator) {
		int count = countByIzvewenieId(izvewenie_id);

		if (count == 0) {
			return null;
		}

		List<IzveweniePut> list = findByIzvewenieId(izvewenie_id, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the izvewenie puts before and after the current izvewenie put in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_put_id the primary key of the current izvewenie put
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next izvewenie put
	 * @throws NoSuchIzveweniePutException if a izvewenie put with the primary key could not be found
	 */
	@Override
	public IzveweniePut[] findByIzvewenieId_PrevAndNext(long izvewenie_put_id,
		long izvewenie_id, OrderByComparator<IzveweniePut> orderByComparator)
		throws NoSuchIzveweniePutException {
		IzveweniePut izveweniePut = findByPrimaryKey(izvewenie_put_id);

		Session session = null;

		try {
			session = openSession();

			IzveweniePut[] array = new IzveweniePutImpl[3];

			array[0] = getByIzvewenieId_PrevAndNext(session, izveweniePut,
					izvewenie_id, orderByComparator, true);

			array[1] = izveweniePut;

			array[2] = getByIzvewenieId_PrevAndNext(session, izveweniePut,
					izvewenie_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected IzveweniePut getByIzvewenieId_PrevAndNext(Session session,
		IzveweniePut izveweniePut, long izvewenie_id,
		OrderByComparator<IzveweniePut> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_IZVEWENIEPUT_WHERE);

		query.append(_FINDER_COLUMN_IZVEWENIEID_IZVEWENIE_ID_2);

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
			query.append(IzveweniePutModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(izvewenie_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(izveweniePut);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IzveweniePut> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the izvewenie puts where izvewenie_id = &#63; from the database.
	 *
	 * @param izvewenie_id the izvewenie_id
	 */
	@Override
	public void removeByIzvewenieId(long izvewenie_id) {
		for (IzveweniePut izveweniePut : findByIzvewenieId(izvewenie_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(izveweniePut);
		}
	}

	/**
	 * Returns the number of izvewenie puts where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the number of matching izvewenie puts
	 */
	@Override
	public int countByIzvewenieId(long izvewenie_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IZVEWENIEID;

		Object[] finderArgs = new Object[] { izvewenie_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_IZVEWENIEPUT_WHERE);

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

	private static final String _FINDER_COLUMN_IZVEWENIEID_IZVEWENIE_ID_2 = "izveweniePut.izvewenie_id = ?";

	public IzveweniePutPersistenceImpl() {
		setModelClass(IzveweniePut.class);
	}

	/**
	 * Caches the izvewenie put in the entity cache if it is enabled.
	 *
	 * @param izveweniePut the izvewenie put
	 */
	@Override
	public void cacheResult(IzveweniePut izveweniePut) {
		entityCache.putResult(IzveweniePutModelImpl.ENTITY_CACHE_ENABLED,
			IzveweniePutImpl.class, izveweniePut.getPrimaryKey(), izveweniePut);

		izveweniePut.resetOriginalValues();
	}

	/**
	 * Caches the izvewenie puts in the entity cache if it is enabled.
	 *
	 * @param izveweniePuts the izvewenie puts
	 */
	@Override
	public void cacheResult(List<IzveweniePut> izveweniePuts) {
		for (IzveweniePut izveweniePut : izveweniePuts) {
			if (entityCache.getResult(
						IzveweniePutModelImpl.ENTITY_CACHE_ENABLED,
						IzveweniePutImpl.class, izveweniePut.getPrimaryKey()) == null) {
				cacheResult(izveweniePut);
			}
			else {
				izveweniePut.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all izvewenie puts.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(IzveweniePutImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the izvewenie put.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(IzveweniePut izveweniePut) {
		entityCache.removeResult(IzveweniePutModelImpl.ENTITY_CACHE_ENABLED,
			IzveweniePutImpl.class, izveweniePut.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<IzveweniePut> izveweniePuts) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (IzveweniePut izveweniePut : izveweniePuts) {
			entityCache.removeResult(IzveweniePutModelImpl.ENTITY_CACHE_ENABLED,
				IzveweniePutImpl.class, izveweniePut.getPrimaryKey());
		}
	}

	/**
	 * Creates a new izvewenie put with the primary key. Does not add the izvewenie put to the database.
	 *
	 * @param izvewenie_put_id the primary key for the new izvewenie put
	 * @return the new izvewenie put
	 */
	@Override
	public IzveweniePut create(long izvewenie_put_id) {
		IzveweniePut izveweniePut = new IzveweniePutImpl();

		izveweniePut.setNew(true);
		izveweniePut.setPrimaryKey(izvewenie_put_id);

		return izveweniePut;
	}

	/**
	 * Removes the izvewenie put with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param izvewenie_put_id the primary key of the izvewenie put
	 * @return the izvewenie put that was removed
	 * @throws NoSuchIzveweniePutException if a izvewenie put with the primary key could not be found
	 */
	@Override
	public IzveweniePut remove(long izvewenie_put_id)
		throws NoSuchIzveweniePutException {
		return remove((Serializable)izvewenie_put_id);
	}

	/**
	 * Removes the izvewenie put with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the izvewenie put
	 * @return the izvewenie put that was removed
	 * @throws NoSuchIzveweniePutException if a izvewenie put with the primary key could not be found
	 */
	@Override
	public IzveweniePut remove(Serializable primaryKey)
		throws NoSuchIzveweniePutException {
		Session session = null;

		try {
			session = openSession();

			IzveweniePut izveweniePut = (IzveweniePut)session.get(IzveweniePutImpl.class,
					primaryKey);

			if (izveweniePut == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchIzveweniePutException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(izveweniePut);
		}
		catch (NoSuchIzveweniePutException nsee) {
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
	protected IzveweniePut removeImpl(IzveweniePut izveweniePut) {
		izveweniePut = toUnwrappedModel(izveweniePut);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(izveweniePut)) {
				izveweniePut = (IzveweniePut)session.get(IzveweniePutImpl.class,
						izveweniePut.getPrimaryKeyObj());
			}

			if (izveweniePut != null) {
				session.delete(izveweniePut);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (izveweniePut != null) {
			clearCache(izveweniePut);
		}

		return izveweniePut;
	}

	@Override
	public IzveweniePut updateImpl(IzveweniePut izveweniePut) {
		izveweniePut = toUnwrappedModel(izveweniePut);

		boolean isNew = izveweniePut.isNew();

		IzveweniePutModelImpl izveweniePutModelImpl = (IzveweniePutModelImpl)izveweniePut;

		Session session = null;

		try {
			session = openSession();

			if (izveweniePut.isNew()) {
				session.save(izveweniePut);

				izveweniePut.setNew(false);
			}
			else {
				izveweniePut = (IzveweniePut)session.merge(izveweniePut);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !IzveweniePutModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((izveweniePutModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						izveweniePutModelImpl.getOriginalIzvewenie_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID,
					args);

				args = new Object[] { izveweniePutModelImpl.getIzvewenie_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID,
					args);
			}
		}

		entityCache.putResult(IzveweniePutModelImpl.ENTITY_CACHE_ENABLED,
			IzveweniePutImpl.class, izveweniePut.getPrimaryKey(), izveweniePut,
			false);

		izveweniePut.resetOriginalValues();

		return izveweniePut;
	}

	protected IzveweniePut toUnwrappedModel(IzveweniePut izveweniePut) {
		if (izveweniePut instanceof IzveweniePutImpl) {
			return izveweniePut;
		}

		IzveweniePutImpl izveweniePutImpl = new IzveweniePutImpl();

		izveweniePutImpl.setNew(izveweniePut.isNew());
		izveweniePutImpl.setPrimaryKey(izveweniePut.getPrimaryKey());

		izveweniePutImpl.setIzvewenie_id(izveweniePut.getIzvewenie_id());
		izveweniePutImpl.setIzvewenie_put_id(izveweniePut.getIzvewenie_put_id());
		izveweniePutImpl.setPut_a(izveweniePut.getPut_a());
		izveweniePutImpl.setPut_b(izveweniePut.getPut_b());
		izveweniePutImpl.setPut_c(izveweniePut.getPut_c());

		return izveweniePutImpl;
	}

	/**
	 * Returns the izvewenie put with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the izvewenie put
	 * @return the izvewenie put
	 * @throws NoSuchIzveweniePutException if a izvewenie put with the primary key could not be found
	 */
	@Override
	public IzveweniePut findByPrimaryKey(Serializable primaryKey)
		throws NoSuchIzveweniePutException {
		IzveweniePut izveweniePut = fetchByPrimaryKey(primaryKey);

		if (izveweniePut == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchIzveweniePutException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return izveweniePut;
	}

	/**
	 * Returns the izvewenie put with the primary key or throws a {@link NoSuchIzveweniePutException} if it could not be found.
	 *
	 * @param izvewenie_put_id the primary key of the izvewenie put
	 * @return the izvewenie put
	 * @throws NoSuchIzveweniePutException if a izvewenie put with the primary key could not be found
	 */
	@Override
	public IzveweniePut findByPrimaryKey(long izvewenie_put_id)
		throws NoSuchIzveweniePutException {
		return findByPrimaryKey((Serializable)izvewenie_put_id);
	}

	/**
	 * Returns the izvewenie put with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the izvewenie put
	 * @return the izvewenie put, or <code>null</code> if a izvewenie put with the primary key could not be found
	 */
	@Override
	public IzveweniePut fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(IzveweniePutModelImpl.ENTITY_CACHE_ENABLED,
				IzveweniePutImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		IzveweniePut izveweniePut = (IzveweniePut)serializable;

		if (izveweniePut == null) {
			Session session = null;

			try {
				session = openSession();

				izveweniePut = (IzveweniePut)session.get(IzveweniePutImpl.class,
						primaryKey);

				if (izveweniePut != null) {
					cacheResult(izveweniePut);
				}
				else {
					entityCache.putResult(IzveweniePutModelImpl.ENTITY_CACHE_ENABLED,
						IzveweniePutImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(IzveweniePutModelImpl.ENTITY_CACHE_ENABLED,
					IzveweniePutImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return izveweniePut;
	}

	/**
	 * Returns the izvewenie put with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param izvewenie_put_id the primary key of the izvewenie put
	 * @return the izvewenie put, or <code>null</code> if a izvewenie put with the primary key could not be found
	 */
	@Override
	public IzveweniePut fetchByPrimaryKey(long izvewenie_put_id) {
		return fetchByPrimaryKey((Serializable)izvewenie_put_id);
	}

	@Override
	public Map<Serializable, IzveweniePut> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, IzveweniePut> map = new HashMap<Serializable, IzveweniePut>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			IzveweniePut izveweniePut = fetchByPrimaryKey(primaryKey);

			if (izveweniePut != null) {
				map.put(primaryKey, izveweniePut);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(IzveweniePutModelImpl.ENTITY_CACHE_ENABLED,
					IzveweniePutImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (IzveweniePut)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_IZVEWENIEPUT_WHERE_PKS_IN);

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

			for (IzveweniePut izveweniePut : (List<IzveweniePut>)q.list()) {
				map.put(izveweniePut.getPrimaryKeyObj(), izveweniePut);

				cacheResult(izveweniePut);

				uncachedPrimaryKeys.remove(izveweniePut.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(IzveweniePutModelImpl.ENTITY_CACHE_ENABLED,
					IzveweniePutImpl.class, primaryKey, nullModel);
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
	 * Returns all the izvewenie puts.
	 *
	 * @return the izvewenie puts
	 */
	@Override
	public List<IzveweniePut> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the izvewenie puts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzveweniePutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of izvewenie puts
	 * @param end the upper bound of the range of izvewenie puts (not inclusive)
	 * @return the range of izvewenie puts
	 */
	@Override
	public List<IzveweniePut> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the izvewenie puts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzveweniePutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of izvewenie puts
	 * @param end the upper bound of the range of izvewenie puts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of izvewenie puts
	 */
	@Override
	public List<IzveweniePut> findAll(int start, int end,
		OrderByComparator<IzveweniePut> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the izvewenie puts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzveweniePutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of izvewenie puts
	 * @param end the upper bound of the range of izvewenie puts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of izvewenie puts
	 */
	@Override
	public List<IzveweniePut> findAll(int start, int end,
		OrderByComparator<IzveweniePut> orderByComparator,
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

		List<IzveweniePut> list = null;

		if (retrieveFromCache) {
			list = (List<IzveweniePut>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_IZVEWENIEPUT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_IZVEWENIEPUT;

				if (pagination) {
					sql = sql.concat(IzveweniePutModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<IzveweniePut>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<IzveweniePut>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the izvewenie puts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (IzveweniePut izveweniePut : findAll()) {
			remove(izveweniePut);
		}
	}

	/**
	 * Returns the number of izvewenie puts.
	 *
	 * @return the number of izvewenie puts
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_IZVEWENIEPUT);

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
		return IzveweniePutModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the izvewenie put persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(IzveweniePutImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_IZVEWENIEPUT = "SELECT izveweniePut FROM IzveweniePut izveweniePut";
	private static final String _SQL_SELECT_IZVEWENIEPUT_WHERE_PKS_IN = "SELECT izveweniePut FROM IzveweniePut izveweniePut WHERE izvewenie_put_id IN (";
	private static final String _SQL_SELECT_IZVEWENIEPUT_WHERE = "SELECT izveweniePut FROM IzveweniePut izveweniePut WHERE ";
	private static final String _SQL_COUNT_IZVEWENIEPUT = "SELECT COUNT(izveweniePut) FROM IzveweniePut izveweniePut";
	private static final String _SQL_COUNT_IZVEWENIEPUT_WHERE = "SELECT COUNT(izveweniePut) FROM IzveweniePut izveweniePut WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "izveweniePut.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No IzveweniePut exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No IzveweniePut exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(IzveweniePutPersistenceImpl.class);
}