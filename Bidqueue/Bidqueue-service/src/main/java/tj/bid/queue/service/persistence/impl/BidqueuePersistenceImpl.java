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

package tj.bid.queue.service.persistence.impl;

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

import tj.bid.queue.exception.NoSuchBidqueueException;
import tj.bid.queue.model.Bidqueue;
import tj.bid.queue.model.impl.BidqueueImpl;
import tj.bid.queue.model.impl.BidqueueModelImpl;
import tj.bid.queue.service.persistence.BidqueuePersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the bidqueue service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BidqueuePersistence
 * @see tj.bid.queue.service.persistence.BidqueueUtil
 * @generated
 */
@ProviderType
public class BidqueuePersistenceImpl extends BasePersistenceImpl<Bidqueue>
	implements BidqueuePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BidqueueUtil} to access the bidqueue persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BidqueueImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BidqueueModelImpl.ENTITY_CACHE_ENABLED,
			BidqueueModelImpl.FINDER_CACHE_ENABLED, BidqueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BidqueueModelImpl.ENTITY_CACHE_ENABLED,
			BidqueueModelImpl.FINDER_CACHE_ENABLED, BidqueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BidqueueModelImpl.ENTITY_CACHE_ENABLED,
			BidqueueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public BidqueuePersistenceImpl() {
		setModelClass(Bidqueue.class);
	}

	/**
	 * Caches the bidqueue in the entity cache if it is enabled.
	 *
	 * @param bidqueue the bidqueue
	 */
	@Override
	public void cacheResult(Bidqueue bidqueue) {
		entityCache.putResult(BidqueueModelImpl.ENTITY_CACHE_ENABLED,
			BidqueueImpl.class, bidqueue.getPrimaryKey(), bidqueue);

		bidqueue.resetOriginalValues();
	}

	/**
	 * Caches the bidqueues in the entity cache if it is enabled.
	 *
	 * @param bidqueues the bidqueues
	 */
	@Override
	public void cacheResult(List<Bidqueue> bidqueues) {
		for (Bidqueue bidqueue : bidqueues) {
			if (entityCache.getResult(BidqueueModelImpl.ENTITY_CACHE_ENABLED,
						BidqueueImpl.class, bidqueue.getPrimaryKey()) == null) {
				cacheResult(bidqueue);
			}
			else {
				bidqueue.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all bidqueues.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(BidqueueImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the bidqueue.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Bidqueue bidqueue) {
		entityCache.removeResult(BidqueueModelImpl.ENTITY_CACHE_ENABLED,
			BidqueueImpl.class, bidqueue.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Bidqueue> bidqueues) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Bidqueue bidqueue : bidqueues) {
			entityCache.removeResult(BidqueueModelImpl.ENTITY_CACHE_ENABLED,
				BidqueueImpl.class, bidqueue.getPrimaryKey());
		}
	}

	/**
	 * Creates a new bidqueue with the primary key. Does not add the bidqueue to the database.
	 *
	 * @param bid_queue_id the primary key for the new bidqueue
	 * @return the new bidqueue
	 */
	@Override
	public Bidqueue create(long bid_queue_id) {
		Bidqueue bidqueue = new BidqueueImpl();

		bidqueue.setNew(true);
		bidqueue.setPrimaryKey(bid_queue_id);

		return bidqueue;
	}

	/**
	 * Removes the bidqueue with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bid_queue_id the primary key of the bidqueue
	 * @return the bidqueue that was removed
	 * @throws NoSuchBidqueueException if a bidqueue with the primary key could not be found
	 */
	@Override
	public Bidqueue remove(long bid_queue_id) throws NoSuchBidqueueException {
		return remove((Serializable)bid_queue_id);
	}

	/**
	 * Removes the bidqueue with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bidqueue
	 * @return the bidqueue that was removed
	 * @throws NoSuchBidqueueException if a bidqueue with the primary key could not be found
	 */
	@Override
	public Bidqueue remove(Serializable primaryKey)
		throws NoSuchBidqueueException {
		Session session = null;

		try {
			session = openSession();

			Bidqueue bidqueue = (Bidqueue)session.get(BidqueueImpl.class,
					primaryKey);

			if (bidqueue == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBidqueueException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(bidqueue);
		}
		catch (NoSuchBidqueueException nsee) {
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
	protected Bidqueue removeImpl(Bidqueue bidqueue) {
		bidqueue = toUnwrappedModel(bidqueue);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bidqueue)) {
				bidqueue = (Bidqueue)session.get(BidqueueImpl.class,
						bidqueue.getPrimaryKeyObj());
			}

			if (bidqueue != null) {
				session.delete(bidqueue);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (bidqueue != null) {
			clearCache(bidqueue);
		}

		return bidqueue;
	}

	@Override
	public Bidqueue updateImpl(Bidqueue bidqueue) {
		bidqueue = toUnwrappedModel(bidqueue);

		boolean isNew = bidqueue.isNew();

		Session session = null;

		try {
			session = openSession();

			if (bidqueue.isNew()) {
				session.save(bidqueue);

				bidqueue.setNew(false);
			}
			else {
				bidqueue = (Bidqueue)session.merge(bidqueue);
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

		entityCache.putResult(BidqueueModelImpl.ENTITY_CACHE_ENABLED,
			BidqueueImpl.class, bidqueue.getPrimaryKey(), bidqueue, false);

		bidqueue.resetOriginalValues();

		return bidqueue;
	}

	protected Bidqueue toUnwrappedModel(Bidqueue bidqueue) {
		if (bidqueue instanceof BidqueueImpl) {
			return bidqueue;
		}

		BidqueueImpl bidqueueImpl = new BidqueueImpl();

		bidqueueImpl.setNew(bidqueue.isNew());
		bidqueueImpl.setPrimaryKey(bidqueue.getPrimaryKey());

		bidqueueImpl.setBid_queue_id(bidqueue.getBid_queue_id());
		bidqueueImpl.setIzvewenija_id(bidqueue.getIzvewenija_id());
		bidqueueImpl.setClosing_date(bidqueue.getClosing_date());
		bidqueueImpl.setClosing_by_minutes(bidqueue.getClosing_by_minutes());

		return bidqueueImpl;
	}

	/**
	 * Returns the bidqueue with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the bidqueue
	 * @return the bidqueue
	 * @throws NoSuchBidqueueException if a bidqueue with the primary key could not be found
	 */
	@Override
	public Bidqueue findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBidqueueException {
		Bidqueue bidqueue = fetchByPrimaryKey(primaryKey);

		if (bidqueue == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBidqueueException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return bidqueue;
	}

	/**
	 * Returns the bidqueue with the primary key or throws a {@link NoSuchBidqueueException} if it could not be found.
	 *
	 * @param bid_queue_id the primary key of the bidqueue
	 * @return the bidqueue
	 * @throws NoSuchBidqueueException if a bidqueue with the primary key could not be found
	 */
	@Override
	public Bidqueue findByPrimaryKey(long bid_queue_id)
		throws NoSuchBidqueueException {
		return findByPrimaryKey((Serializable)bid_queue_id);
	}

	/**
	 * Returns the bidqueue with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bidqueue
	 * @return the bidqueue, or <code>null</code> if a bidqueue with the primary key could not be found
	 */
	@Override
	public Bidqueue fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(BidqueueModelImpl.ENTITY_CACHE_ENABLED,
				BidqueueImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Bidqueue bidqueue = (Bidqueue)serializable;

		if (bidqueue == null) {
			Session session = null;

			try {
				session = openSession();

				bidqueue = (Bidqueue)session.get(BidqueueImpl.class, primaryKey);

				if (bidqueue != null) {
					cacheResult(bidqueue);
				}
				else {
					entityCache.putResult(BidqueueModelImpl.ENTITY_CACHE_ENABLED,
						BidqueueImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(BidqueueModelImpl.ENTITY_CACHE_ENABLED,
					BidqueueImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return bidqueue;
	}

	/**
	 * Returns the bidqueue with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bid_queue_id the primary key of the bidqueue
	 * @return the bidqueue, or <code>null</code> if a bidqueue with the primary key could not be found
	 */
	@Override
	public Bidqueue fetchByPrimaryKey(long bid_queue_id) {
		return fetchByPrimaryKey((Serializable)bid_queue_id);
	}

	@Override
	public Map<Serializable, Bidqueue> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Bidqueue> map = new HashMap<Serializable, Bidqueue>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Bidqueue bidqueue = fetchByPrimaryKey(primaryKey);

			if (bidqueue != null) {
				map.put(primaryKey, bidqueue);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(BidqueueModelImpl.ENTITY_CACHE_ENABLED,
					BidqueueImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Bidqueue)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BIDQUEUE_WHERE_PKS_IN);

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

			for (Bidqueue bidqueue : (List<Bidqueue>)q.list()) {
				map.put(bidqueue.getPrimaryKeyObj(), bidqueue);

				cacheResult(bidqueue);

				uncachedPrimaryKeys.remove(bidqueue.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(BidqueueModelImpl.ENTITY_CACHE_ENABLED,
					BidqueueImpl.class, primaryKey, nullModel);
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
	 * Returns all the bidqueues.
	 *
	 * @return the bidqueues
	 */
	@Override
	public List<Bidqueue> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bidqueues.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BidqueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bidqueues
	 * @param end the upper bound of the range of bidqueues (not inclusive)
	 * @return the range of bidqueues
	 */
	@Override
	public List<Bidqueue> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the bidqueues.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BidqueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bidqueues
	 * @param end the upper bound of the range of bidqueues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bidqueues
	 */
	@Override
	public List<Bidqueue> findAll(int start, int end,
		OrderByComparator<Bidqueue> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bidqueues.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BidqueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bidqueues
	 * @param end the upper bound of the range of bidqueues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of bidqueues
	 */
	@Override
	public List<Bidqueue> findAll(int start, int end,
		OrderByComparator<Bidqueue> orderByComparator, boolean retrieveFromCache) {
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

		List<Bidqueue> list = null;

		if (retrieveFromCache) {
			list = (List<Bidqueue>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BIDQUEUE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BIDQUEUE;

				if (pagination) {
					sql = sql.concat(BidqueueModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Bidqueue>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Bidqueue>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the bidqueues from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Bidqueue bidqueue : findAll()) {
			remove(bidqueue);
		}
	}

	/**
	 * Returns the number of bidqueues.
	 *
	 * @return the number of bidqueues
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BIDQUEUE);

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
		return BidqueueModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the bidqueue persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(BidqueueImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_BIDQUEUE = "SELECT bidqueue FROM Bidqueue bidqueue";
	private static final String _SQL_SELECT_BIDQUEUE_WHERE_PKS_IN = "SELECT bidqueue FROM Bidqueue bidqueue WHERE bid_queue_id IN (";
	private static final String _SQL_COUNT_BIDQUEUE = "SELECT COUNT(bidqueue) FROM Bidqueue bidqueue";
	private static final String _ORDER_BY_ENTITY_ALIAS = "bidqueue.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Bidqueue exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(BidqueuePersistenceImpl.class);
}