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

package tj.protocol.contracts.service.persistence.impl;

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

import tj.protocol.contracts.exception.NoSuchProtocolOpeningException;
import tj.protocol.contracts.model.ProtocolOpening;
import tj.protocol.contracts.model.impl.ProtocolOpeningImpl;
import tj.protocol.contracts.model.impl.ProtocolOpeningModelImpl;
import tj.protocol.contracts.service.persistence.ProtocolOpeningPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the protocol opening service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProtocolOpeningPersistence
 * @see tj.protocol.contracts.service.persistence.ProtocolOpeningUtil
 * @generated
 */
@ProviderType
public class ProtocolOpeningPersistenceImpl extends BasePersistenceImpl<ProtocolOpening>
	implements ProtocolOpeningPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ProtocolOpeningUtil} to access the protocol opening persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ProtocolOpeningImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ProtocolOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ProtocolOpeningModelImpl.FINDER_CACHE_ENABLED,
			ProtocolOpeningImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ProtocolOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ProtocolOpeningModelImpl.FINDER_CACHE_ENABLED,
			ProtocolOpeningImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ProtocolOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ProtocolOpeningModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_IZVEWENIEID = new FinderPath(ProtocolOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ProtocolOpeningModelImpl.FINDER_CACHE_ENABLED,
			ProtocolOpeningImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByIzvewenieId", new String[] { Long.class.getName() },
			ProtocolOpeningModelImpl.IZVEWENIE_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IZVEWENIEID = new FinderPath(ProtocolOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ProtocolOpeningModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIzvewenieId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the protocol opening where izvewenie_id = &#63; or throws a {@link NoSuchProtocolOpeningException} if it could not be found.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the matching protocol opening
	 * @throws NoSuchProtocolOpeningException if a matching protocol opening could not be found
	 */
	@Override
	public ProtocolOpening findByIzvewenieId(long izvewenie_id)
		throws NoSuchProtocolOpeningException {
		ProtocolOpening protocolOpening = fetchByIzvewenieId(izvewenie_id);

		if (protocolOpening == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("izvewenie_id=");
			msg.append(izvewenie_id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchProtocolOpeningException(msg.toString());
		}

		return protocolOpening;
	}

	/**
	 * Returns the protocol opening where izvewenie_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the matching protocol opening, or <code>null</code> if a matching protocol opening could not be found
	 */
	@Override
	public ProtocolOpening fetchByIzvewenieId(long izvewenie_id) {
		return fetchByIzvewenieId(izvewenie_id, true);
	}

	/**
	 * Returns the protocol opening where izvewenie_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching protocol opening, or <code>null</code> if a matching protocol opening could not be found
	 */
	@Override
	public ProtocolOpening fetchByIzvewenieId(long izvewenie_id,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { izvewenie_id };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_IZVEWENIEID,
					finderArgs, this);
		}

		if (result instanceof ProtocolOpening) {
			ProtocolOpening protocolOpening = (ProtocolOpening)result;

			if ((izvewenie_id != protocolOpening.getIzvewenie_id())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_PROTOCOLOPENING_WHERE);

			query.append(_FINDER_COLUMN_IZVEWENIEID_IZVEWENIE_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(izvewenie_id);

				List<ProtocolOpening> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_IZVEWENIEID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"ProtocolOpeningPersistenceImpl.fetchByIzvewenieId(long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ProtocolOpening protocolOpening = list.get(0);

					result = protocolOpening;

					cacheResult(protocolOpening);

					if ((protocolOpening.getIzvewenie_id() != izvewenie_id)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_IZVEWENIEID,
							finderArgs, protocolOpening);
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
			return (ProtocolOpening)result;
		}
	}

	/**
	 * Removes the protocol opening where izvewenie_id = &#63; from the database.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the protocol opening that was removed
	 */
	@Override
	public ProtocolOpening removeByIzvewenieId(long izvewenie_id)
		throws NoSuchProtocolOpeningException {
		ProtocolOpening protocolOpening = findByIzvewenieId(izvewenie_id);

		return remove(protocolOpening);
	}

	/**
	 * Returns the number of protocol openings where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the number of matching protocol openings
	 */
	@Override
	public int countByIzvewenieId(long izvewenie_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IZVEWENIEID;

		Object[] finderArgs = new Object[] { izvewenie_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PROTOCOLOPENING_WHERE);

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

	private static final String _FINDER_COLUMN_IZVEWENIEID_IZVEWENIE_ID_2 = "protocolOpening.izvewenie_id = ?";

	public ProtocolOpeningPersistenceImpl() {
		setModelClass(ProtocolOpening.class);
	}

	/**
	 * Caches the protocol opening in the entity cache if it is enabled.
	 *
	 * @param protocolOpening the protocol opening
	 */
	@Override
	public void cacheResult(ProtocolOpening protocolOpening) {
		entityCache.putResult(ProtocolOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ProtocolOpeningImpl.class, protocolOpening.getPrimaryKey(),
			protocolOpening);

		finderCache.putResult(FINDER_PATH_FETCH_BY_IZVEWENIEID,
			new Object[] { protocolOpening.getIzvewenie_id() }, protocolOpening);

		protocolOpening.resetOriginalValues();
	}

	/**
	 * Caches the protocol openings in the entity cache if it is enabled.
	 *
	 * @param protocolOpenings the protocol openings
	 */
	@Override
	public void cacheResult(List<ProtocolOpening> protocolOpenings) {
		for (ProtocolOpening protocolOpening : protocolOpenings) {
			if (entityCache.getResult(
						ProtocolOpeningModelImpl.ENTITY_CACHE_ENABLED,
						ProtocolOpeningImpl.class,
						protocolOpening.getPrimaryKey()) == null) {
				cacheResult(protocolOpening);
			}
			else {
				protocolOpening.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all protocol openings.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ProtocolOpeningImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the protocol opening.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ProtocolOpening protocolOpening) {
		entityCache.removeResult(ProtocolOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ProtocolOpeningImpl.class, protocolOpening.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((ProtocolOpeningModelImpl)protocolOpening, true);
	}

	@Override
	public void clearCache(List<ProtocolOpening> protocolOpenings) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ProtocolOpening protocolOpening : protocolOpenings) {
			entityCache.removeResult(ProtocolOpeningModelImpl.ENTITY_CACHE_ENABLED,
				ProtocolOpeningImpl.class, protocolOpening.getPrimaryKey());

			clearUniqueFindersCache((ProtocolOpeningModelImpl)protocolOpening,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		ProtocolOpeningModelImpl protocolOpeningModelImpl) {
		Object[] args = new Object[] { protocolOpeningModelImpl.getIzvewenie_id() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_IZVEWENIEID, args,
			protocolOpeningModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		ProtocolOpeningModelImpl protocolOpeningModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					protocolOpeningModelImpl.getIzvewenie_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_IZVEWENIEID, args);
		}

		if ((protocolOpeningModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_IZVEWENIEID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					protocolOpeningModelImpl.getOriginalIzvewenie_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_IZVEWENIEID, args);
		}
	}

	/**
	 * Creates a new protocol opening with the primary key. Does not add the protocol opening to the database.
	 *
	 * @param protocol_opening_id the primary key for the new protocol opening
	 * @return the new protocol opening
	 */
	@Override
	public ProtocolOpening create(long protocol_opening_id) {
		ProtocolOpening protocolOpening = new ProtocolOpeningImpl();

		protocolOpening.setNew(true);
		protocolOpening.setPrimaryKey(protocol_opening_id);

		return protocolOpening;
	}

	/**
	 * Removes the protocol opening with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param protocol_opening_id the primary key of the protocol opening
	 * @return the protocol opening that was removed
	 * @throws NoSuchProtocolOpeningException if a protocol opening with the primary key could not be found
	 */
	@Override
	public ProtocolOpening remove(long protocol_opening_id)
		throws NoSuchProtocolOpeningException {
		return remove((Serializable)protocol_opening_id);
	}

	/**
	 * Removes the protocol opening with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the protocol opening
	 * @return the protocol opening that was removed
	 * @throws NoSuchProtocolOpeningException if a protocol opening with the primary key could not be found
	 */
	@Override
	public ProtocolOpening remove(Serializable primaryKey)
		throws NoSuchProtocolOpeningException {
		Session session = null;

		try {
			session = openSession();

			ProtocolOpening protocolOpening = (ProtocolOpening)session.get(ProtocolOpeningImpl.class,
					primaryKey);

			if (protocolOpening == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProtocolOpeningException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(protocolOpening);
		}
		catch (NoSuchProtocolOpeningException nsee) {
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
	protected ProtocolOpening removeImpl(ProtocolOpening protocolOpening) {
		protocolOpening = toUnwrappedModel(protocolOpening);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(protocolOpening)) {
				protocolOpening = (ProtocolOpening)session.get(ProtocolOpeningImpl.class,
						protocolOpening.getPrimaryKeyObj());
			}

			if (protocolOpening != null) {
				session.delete(protocolOpening);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (protocolOpening != null) {
			clearCache(protocolOpening);
		}

		return protocolOpening;
	}

	@Override
	public ProtocolOpening updateImpl(ProtocolOpening protocolOpening) {
		protocolOpening = toUnwrappedModel(protocolOpening);

		boolean isNew = protocolOpening.isNew();

		ProtocolOpeningModelImpl protocolOpeningModelImpl = (ProtocolOpeningModelImpl)protocolOpening;

		Session session = null;

		try {
			session = openSession();

			if (protocolOpening.isNew()) {
				session.save(protocolOpening);

				protocolOpening.setNew(false);
			}
			else {
				protocolOpening = (ProtocolOpening)session.merge(protocolOpening);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ProtocolOpeningModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(ProtocolOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ProtocolOpeningImpl.class, protocolOpening.getPrimaryKey(),
			protocolOpening, false);

		clearUniqueFindersCache(protocolOpeningModelImpl, false);
		cacheUniqueFindersCache(protocolOpeningModelImpl);

		protocolOpening.resetOriginalValues();

		return protocolOpening;
	}

	protected ProtocolOpening toUnwrappedModel(ProtocolOpening protocolOpening) {
		if (protocolOpening instanceof ProtocolOpeningImpl) {
			return protocolOpening;
		}

		ProtocolOpeningImpl protocolOpeningImpl = new ProtocolOpeningImpl();

		protocolOpeningImpl.setNew(protocolOpening.isNew());
		protocolOpeningImpl.setPrimaryKey(protocolOpening.getPrimaryKey());

		protocolOpeningImpl.setProtocol_opening_id(protocolOpening.getProtocol_opening_id());
		protocolOpeningImpl.setIzvewenie_id(protocolOpening.getIzvewenie_id());
		protocolOpeningImpl.setCreated(protocolOpening.getCreated());
		protocolOpeningImpl.setUpdated(protocolOpening.getUpdated());

		return protocolOpeningImpl;
	}

	/**
	 * Returns the protocol opening with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the protocol opening
	 * @return the protocol opening
	 * @throws NoSuchProtocolOpeningException if a protocol opening with the primary key could not be found
	 */
	@Override
	public ProtocolOpening findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProtocolOpeningException {
		ProtocolOpening protocolOpening = fetchByPrimaryKey(primaryKey);

		if (protocolOpening == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProtocolOpeningException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return protocolOpening;
	}

	/**
	 * Returns the protocol opening with the primary key or throws a {@link NoSuchProtocolOpeningException} if it could not be found.
	 *
	 * @param protocol_opening_id the primary key of the protocol opening
	 * @return the protocol opening
	 * @throws NoSuchProtocolOpeningException if a protocol opening with the primary key could not be found
	 */
	@Override
	public ProtocolOpening findByPrimaryKey(long protocol_opening_id)
		throws NoSuchProtocolOpeningException {
		return findByPrimaryKey((Serializable)protocol_opening_id);
	}

	/**
	 * Returns the protocol opening with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the protocol opening
	 * @return the protocol opening, or <code>null</code> if a protocol opening with the primary key could not be found
	 */
	@Override
	public ProtocolOpening fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ProtocolOpeningModelImpl.ENTITY_CACHE_ENABLED,
				ProtocolOpeningImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ProtocolOpening protocolOpening = (ProtocolOpening)serializable;

		if (protocolOpening == null) {
			Session session = null;

			try {
				session = openSession();

				protocolOpening = (ProtocolOpening)session.get(ProtocolOpeningImpl.class,
						primaryKey);

				if (protocolOpening != null) {
					cacheResult(protocolOpening);
				}
				else {
					entityCache.putResult(ProtocolOpeningModelImpl.ENTITY_CACHE_ENABLED,
						ProtocolOpeningImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ProtocolOpeningModelImpl.ENTITY_CACHE_ENABLED,
					ProtocolOpeningImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return protocolOpening;
	}

	/**
	 * Returns the protocol opening with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param protocol_opening_id the primary key of the protocol opening
	 * @return the protocol opening, or <code>null</code> if a protocol opening with the primary key could not be found
	 */
	@Override
	public ProtocolOpening fetchByPrimaryKey(long protocol_opening_id) {
		return fetchByPrimaryKey((Serializable)protocol_opening_id);
	}

	@Override
	public Map<Serializable, ProtocolOpening> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ProtocolOpening> map = new HashMap<Serializable, ProtocolOpening>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ProtocolOpening protocolOpening = fetchByPrimaryKey(primaryKey);

			if (protocolOpening != null) {
				map.put(primaryKey, protocolOpening);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ProtocolOpeningModelImpl.ENTITY_CACHE_ENABLED,
					ProtocolOpeningImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ProtocolOpening)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PROTOCOLOPENING_WHERE_PKS_IN);

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

			for (ProtocolOpening protocolOpening : (List<ProtocolOpening>)q.list()) {
				map.put(protocolOpening.getPrimaryKeyObj(), protocolOpening);

				cacheResult(protocolOpening);

				uncachedPrimaryKeys.remove(protocolOpening.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ProtocolOpeningModelImpl.ENTITY_CACHE_ENABLED,
					ProtocolOpeningImpl.class, primaryKey, nullModel);
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
	 * Returns all the protocol openings.
	 *
	 * @return the protocol openings
	 */
	@Override
	public List<ProtocolOpening> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the protocol openings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProtocolOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of protocol openings
	 * @param end the upper bound of the range of protocol openings (not inclusive)
	 * @return the range of protocol openings
	 */
	@Override
	public List<ProtocolOpening> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the protocol openings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProtocolOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of protocol openings
	 * @param end the upper bound of the range of protocol openings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of protocol openings
	 */
	@Override
	public List<ProtocolOpening> findAll(int start, int end,
		OrderByComparator<ProtocolOpening> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the protocol openings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProtocolOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of protocol openings
	 * @param end the upper bound of the range of protocol openings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of protocol openings
	 */
	@Override
	public List<ProtocolOpening> findAll(int start, int end,
		OrderByComparator<ProtocolOpening> orderByComparator,
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

		List<ProtocolOpening> list = null;

		if (retrieveFromCache) {
			list = (List<ProtocolOpening>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PROTOCOLOPENING);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PROTOCOLOPENING;

				if (pagination) {
					sql = sql.concat(ProtocolOpeningModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ProtocolOpening>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ProtocolOpening>)QueryUtil.list(q,
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
	 * Removes all the protocol openings from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ProtocolOpening protocolOpening : findAll()) {
			remove(protocolOpening);
		}
	}

	/**
	 * Returns the number of protocol openings.
	 *
	 * @return the number of protocol openings
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PROTOCOLOPENING);

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
		return ProtocolOpeningModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the protocol opening persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ProtocolOpeningImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_PROTOCOLOPENING = "SELECT protocolOpening FROM ProtocolOpening protocolOpening";
	private static final String _SQL_SELECT_PROTOCOLOPENING_WHERE_PKS_IN = "SELECT protocolOpening FROM ProtocolOpening protocolOpening WHERE protocol_opening_id IN (";
	private static final String _SQL_SELECT_PROTOCOLOPENING_WHERE = "SELECT protocolOpening FROM ProtocolOpening protocolOpening WHERE ";
	private static final String _SQL_COUNT_PROTOCOLOPENING = "SELECT COUNT(protocolOpening) FROM ProtocolOpening protocolOpening";
	private static final String _SQL_COUNT_PROTOCOLOPENING_WHERE = "SELECT COUNT(protocolOpening) FROM ProtocolOpening protocolOpening WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "protocolOpening.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ProtocolOpening exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ProtocolOpening exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ProtocolOpeningPersistenceImpl.class);
}