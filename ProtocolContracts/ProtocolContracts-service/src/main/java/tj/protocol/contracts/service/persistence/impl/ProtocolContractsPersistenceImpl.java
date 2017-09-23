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

import tj.protocol.contracts.exception.NoSuchProtocolContractsException;
import tj.protocol.contracts.model.ProtocolContracts;
import tj.protocol.contracts.model.impl.ProtocolContractsImpl;
import tj.protocol.contracts.model.impl.ProtocolContractsModelImpl;
import tj.protocol.contracts.service.persistence.ProtocolContractsPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the protocol contracts service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProtocolContractsPersistence
 * @see tj.protocol.contracts.service.persistence.ProtocolContractsUtil
 * @generated
 */
@ProviderType
public class ProtocolContractsPersistenceImpl extends BasePersistenceImpl<ProtocolContracts>
	implements ProtocolContractsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ProtocolContractsUtil} to access the protocol contracts persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ProtocolContractsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ProtocolContractsModelImpl.ENTITY_CACHE_ENABLED,
			ProtocolContractsModelImpl.FINDER_CACHE_ENABLED,
			ProtocolContractsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ProtocolContractsModelImpl.ENTITY_CACHE_ENABLED,
			ProtocolContractsModelImpl.FINDER_CACHE_ENABLED,
			ProtocolContractsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ProtocolContractsModelImpl.ENTITY_CACHE_ENABLED,
			ProtocolContractsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_IZVEWENIEID = new FinderPath(ProtocolContractsModelImpl.ENTITY_CACHE_ENABLED,
			ProtocolContractsModelImpl.FINDER_CACHE_ENABLED,
			ProtocolContractsImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByIzvewenieId", new String[] { Long.class.getName() },
			ProtocolContractsModelImpl.IZVEWENIE_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IZVEWENIEID = new FinderPath(ProtocolContractsModelImpl.ENTITY_CACHE_ENABLED,
			ProtocolContractsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIzvewenieId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the protocol contracts where izvewenie_id = &#63; or throws a {@link NoSuchProtocolContractsException} if it could not be found.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the matching protocol contracts
	 * @throws NoSuchProtocolContractsException if a matching protocol contracts could not be found
	 */
	@Override
	public ProtocolContracts findByIzvewenieId(long izvewenie_id)
		throws NoSuchProtocolContractsException {
		ProtocolContracts protocolContracts = fetchByIzvewenieId(izvewenie_id);

		if (protocolContracts == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("izvewenie_id=");
			msg.append(izvewenie_id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchProtocolContractsException(msg.toString());
		}

		return protocolContracts;
	}

	/**
	 * Returns the protocol contracts where izvewenie_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the matching protocol contracts, or <code>null</code> if a matching protocol contracts could not be found
	 */
	@Override
	public ProtocolContracts fetchByIzvewenieId(long izvewenie_id) {
		return fetchByIzvewenieId(izvewenie_id, true);
	}

	/**
	 * Returns the protocol contracts where izvewenie_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching protocol contracts, or <code>null</code> if a matching protocol contracts could not be found
	 */
	@Override
	public ProtocolContracts fetchByIzvewenieId(long izvewenie_id,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { izvewenie_id };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_IZVEWENIEID,
					finderArgs, this);
		}

		if (result instanceof ProtocolContracts) {
			ProtocolContracts protocolContracts = (ProtocolContracts)result;

			if ((izvewenie_id != protocolContracts.getIzvewenie_id())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_PROTOCOLCONTRACTS_WHERE);

			query.append(_FINDER_COLUMN_IZVEWENIEID_IZVEWENIE_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(izvewenie_id);

				List<ProtocolContracts> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_IZVEWENIEID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"ProtocolContractsPersistenceImpl.fetchByIzvewenieId(long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ProtocolContracts protocolContracts = list.get(0);

					result = protocolContracts;

					cacheResult(protocolContracts);

					if ((protocolContracts.getIzvewenie_id() != izvewenie_id)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_IZVEWENIEID,
							finderArgs, protocolContracts);
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
			return (ProtocolContracts)result;
		}
	}

	/**
	 * Removes the protocol contracts where izvewenie_id = &#63; from the database.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the protocol contracts that was removed
	 */
	@Override
	public ProtocolContracts removeByIzvewenieId(long izvewenie_id)
		throws NoSuchProtocolContractsException {
		ProtocolContracts protocolContracts = findByIzvewenieId(izvewenie_id);

		return remove(protocolContracts);
	}

	/**
	 * Returns the number of protocol contractses where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the number of matching protocol contractses
	 */
	@Override
	public int countByIzvewenieId(long izvewenie_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IZVEWENIEID;

		Object[] finderArgs = new Object[] { izvewenie_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PROTOCOLCONTRACTS_WHERE);

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

	private static final String _FINDER_COLUMN_IZVEWENIEID_IZVEWENIE_ID_2 = "protocolContracts.izvewenie_id = ?";

	public ProtocolContractsPersistenceImpl() {
		setModelClass(ProtocolContracts.class);
	}

	/**
	 * Caches the protocol contracts in the entity cache if it is enabled.
	 *
	 * @param protocolContracts the protocol contracts
	 */
	@Override
	public void cacheResult(ProtocolContracts protocolContracts) {
		entityCache.putResult(ProtocolContractsModelImpl.ENTITY_CACHE_ENABLED,
			ProtocolContractsImpl.class, protocolContracts.getPrimaryKey(),
			protocolContracts);

		finderCache.putResult(FINDER_PATH_FETCH_BY_IZVEWENIEID,
			new Object[] { protocolContracts.getIzvewenie_id() },
			protocolContracts);

		protocolContracts.resetOriginalValues();
	}

	/**
	 * Caches the protocol contractses in the entity cache if it is enabled.
	 *
	 * @param protocolContractses the protocol contractses
	 */
	@Override
	public void cacheResult(List<ProtocolContracts> protocolContractses) {
		for (ProtocolContracts protocolContracts : protocolContractses) {
			if (entityCache.getResult(
						ProtocolContractsModelImpl.ENTITY_CACHE_ENABLED,
						ProtocolContractsImpl.class,
						protocolContracts.getPrimaryKey()) == null) {
				cacheResult(protocolContracts);
			}
			else {
				protocolContracts.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all protocol contractses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ProtocolContractsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the protocol contracts.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ProtocolContracts protocolContracts) {
		entityCache.removeResult(ProtocolContractsModelImpl.ENTITY_CACHE_ENABLED,
			ProtocolContractsImpl.class, protocolContracts.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((ProtocolContractsModelImpl)protocolContracts,
			true);
	}

	@Override
	public void clearCache(List<ProtocolContracts> protocolContractses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ProtocolContracts protocolContracts : protocolContractses) {
			entityCache.removeResult(ProtocolContractsModelImpl.ENTITY_CACHE_ENABLED,
				ProtocolContractsImpl.class, protocolContracts.getPrimaryKey());

			clearUniqueFindersCache((ProtocolContractsModelImpl)protocolContracts,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		ProtocolContractsModelImpl protocolContractsModelImpl) {
		Object[] args = new Object[] {
				protocolContractsModelImpl.getIzvewenie_id()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_IZVEWENIEID, args,
			protocolContractsModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		ProtocolContractsModelImpl protocolContractsModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					protocolContractsModelImpl.getIzvewenie_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_IZVEWENIEID, args);
		}

		if ((protocolContractsModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_IZVEWENIEID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					protocolContractsModelImpl.getOriginalIzvewenie_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_IZVEWENIEID, args);
		}
	}

	/**
	 * Creates a new protocol contracts with the primary key. Does not add the protocol contracts to the database.
	 *
	 * @param protocol_contracts_id the primary key for the new protocol contracts
	 * @return the new protocol contracts
	 */
	@Override
	public ProtocolContracts create(long protocol_contracts_id) {
		ProtocolContracts protocolContracts = new ProtocolContractsImpl();

		protocolContracts.setNew(true);
		protocolContracts.setPrimaryKey(protocol_contracts_id);

		return protocolContracts;
	}

	/**
	 * Removes the protocol contracts with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param protocol_contracts_id the primary key of the protocol contracts
	 * @return the protocol contracts that was removed
	 * @throws NoSuchProtocolContractsException if a protocol contracts with the primary key could not be found
	 */
	@Override
	public ProtocolContracts remove(long protocol_contracts_id)
		throws NoSuchProtocolContractsException {
		return remove((Serializable)protocol_contracts_id);
	}

	/**
	 * Removes the protocol contracts with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the protocol contracts
	 * @return the protocol contracts that was removed
	 * @throws NoSuchProtocolContractsException if a protocol contracts with the primary key could not be found
	 */
	@Override
	public ProtocolContracts remove(Serializable primaryKey)
		throws NoSuchProtocolContractsException {
		Session session = null;

		try {
			session = openSession();

			ProtocolContracts protocolContracts = (ProtocolContracts)session.get(ProtocolContractsImpl.class,
					primaryKey);

			if (protocolContracts == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProtocolContractsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(protocolContracts);
		}
		catch (NoSuchProtocolContractsException nsee) {
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
	protected ProtocolContracts removeImpl(ProtocolContracts protocolContracts) {
		protocolContracts = toUnwrappedModel(protocolContracts);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(protocolContracts)) {
				protocolContracts = (ProtocolContracts)session.get(ProtocolContractsImpl.class,
						protocolContracts.getPrimaryKeyObj());
			}

			if (protocolContracts != null) {
				session.delete(protocolContracts);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (protocolContracts != null) {
			clearCache(protocolContracts);
		}

		return protocolContracts;
	}

	@Override
	public ProtocolContracts updateImpl(ProtocolContracts protocolContracts) {
		protocolContracts = toUnwrappedModel(protocolContracts);

		boolean isNew = protocolContracts.isNew();

		ProtocolContractsModelImpl protocolContractsModelImpl = (ProtocolContractsModelImpl)protocolContracts;

		Session session = null;

		try {
			session = openSession();

			if (protocolContracts.isNew()) {
				session.save(protocolContracts);

				protocolContracts.setNew(false);
			}
			else {
				protocolContracts = (ProtocolContracts)session.merge(protocolContracts);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!ProtocolContractsModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(ProtocolContractsModelImpl.ENTITY_CACHE_ENABLED,
			ProtocolContractsImpl.class, protocolContracts.getPrimaryKey(),
			protocolContracts, false);

		clearUniqueFindersCache(protocolContractsModelImpl, false);
		cacheUniqueFindersCache(protocolContractsModelImpl);

		protocolContracts.resetOriginalValues();

		return protocolContracts;
	}

	protected ProtocolContracts toUnwrappedModel(
		ProtocolContracts protocolContracts) {
		if (protocolContracts instanceof ProtocolContractsImpl) {
			return protocolContracts;
		}

		ProtocolContractsImpl protocolContractsImpl = new ProtocolContractsImpl();

		protocolContractsImpl.setNew(protocolContracts.isNew());
		protocolContractsImpl.setPrimaryKey(protocolContracts.getPrimaryKey());

		protocolContractsImpl.setProtocol_contracts_id(protocolContracts.getProtocol_contracts_id());
		protocolContractsImpl.setIzvewenie_id(protocolContracts.getIzvewenie_id());
		protocolContractsImpl.setCreated(protocolContracts.getCreated());
		protocolContractsImpl.setUpdated(protocolContracts.getUpdated());

		return protocolContractsImpl;
	}

	/**
	 * Returns the protocol contracts with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the protocol contracts
	 * @return the protocol contracts
	 * @throws NoSuchProtocolContractsException if a protocol contracts with the primary key could not be found
	 */
	@Override
	public ProtocolContracts findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProtocolContractsException {
		ProtocolContracts protocolContracts = fetchByPrimaryKey(primaryKey);

		if (protocolContracts == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProtocolContractsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return protocolContracts;
	}

	/**
	 * Returns the protocol contracts with the primary key or throws a {@link NoSuchProtocolContractsException} if it could not be found.
	 *
	 * @param protocol_contracts_id the primary key of the protocol contracts
	 * @return the protocol contracts
	 * @throws NoSuchProtocolContractsException if a protocol contracts with the primary key could not be found
	 */
	@Override
	public ProtocolContracts findByPrimaryKey(long protocol_contracts_id)
		throws NoSuchProtocolContractsException {
		return findByPrimaryKey((Serializable)protocol_contracts_id);
	}

	/**
	 * Returns the protocol contracts with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the protocol contracts
	 * @return the protocol contracts, or <code>null</code> if a protocol contracts with the primary key could not be found
	 */
	@Override
	public ProtocolContracts fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ProtocolContractsModelImpl.ENTITY_CACHE_ENABLED,
				ProtocolContractsImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ProtocolContracts protocolContracts = (ProtocolContracts)serializable;

		if (protocolContracts == null) {
			Session session = null;

			try {
				session = openSession();

				protocolContracts = (ProtocolContracts)session.get(ProtocolContractsImpl.class,
						primaryKey);

				if (protocolContracts != null) {
					cacheResult(protocolContracts);
				}
				else {
					entityCache.putResult(ProtocolContractsModelImpl.ENTITY_CACHE_ENABLED,
						ProtocolContractsImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ProtocolContractsModelImpl.ENTITY_CACHE_ENABLED,
					ProtocolContractsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return protocolContracts;
	}

	/**
	 * Returns the protocol contracts with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param protocol_contracts_id the primary key of the protocol contracts
	 * @return the protocol contracts, or <code>null</code> if a protocol contracts with the primary key could not be found
	 */
	@Override
	public ProtocolContracts fetchByPrimaryKey(long protocol_contracts_id) {
		return fetchByPrimaryKey((Serializable)protocol_contracts_id);
	}

	@Override
	public Map<Serializable, ProtocolContracts> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ProtocolContracts> map = new HashMap<Serializable, ProtocolContracts>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ProtocolContracts protocolContracts = fetchByPrimaryKey(primaryKey);

			if (protocolContracts != null) {
				map.put(primaryKey, protocolContracts);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ProtocolContractsModelImpl.ENTITY_CACHE_ENABLED,
					ProtocolContractsImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ProtocolContracts)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PROTOCOLCONTRACTS_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (ProtocolContracts protocolContracts : (List<ProtocolContracts>)q.list()) {
				map.put(protocolContracts.getPrimaryKeyObj(), protocolContracts);

				cacheResult(protocolContracts);

				uncachedPrimaryKeys.remove(protocolContracts.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ProtocolContractsModelImpl.ENTITY_CACHE_ENABLED,
					ProtocolContractsImpl.class, primaryKey, nullModel);
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
	 * Returns all the protocol contractses.
	 *
	 * @return the protocol contractses
	 */
	@Override
	public List<ProtocolContracts> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the protocol contractses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProtocolContractsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of protocol contractses
	 * @param end the upper bound of the range of protocol contractses (not inclusive)
	 * @return the range of protocol contractses
	 */
	@Override
	public List<ProtocolContracts> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the protocol contractses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProtocolContractsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of protocol contractses
	 * @param end the upper bound of the range of protocol contractses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of protocol contractses
	 */
	@Override
	public List<ProtocolContracts> findAll(int start, int end,
		OrderByComparator<ProtocolContracts> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the protocol contractses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProtocolContractsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of protocol contractses
	 * @param end the upper bound of the range of protocol contractses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of protocol contractses
	 */
	@Override
	public List<ProtocolContracts> findAll(int start, int end,
		OrderByComparator<ProtocolContracts> orderByComparator,
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

		List<ProtocolContracts> list = null;

		if (retrieveFromCache) {
			list = (List<ProtocolContracts>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PROTOCOLCONTRACTS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PROTOCOLCONTRACTS;

				if (pagination) {
					sql = sql.concat(ProtocolContractsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ProtocolContracts>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ProtocolContracts>)QueryUtil.list(q,
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
	 * Removes all the protocol contractses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ProtocolContracts protocolContracts : findAll()) {
			remove(protocolContracts);
		}
	}

	/**
	 * Returns the number of protocol contractses.
	 *
	 * @return the number of protocol contractses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PROTOCOLCONTRACTS);

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
		return ProtocolContractsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the protocol contracts persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ProtocolContractsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_PROTOCOLCONTRACTS = "SELECT protocolContracts FROM ProtocolContracts protocolContracts";
	private static final String _SQL_SELECT_PROTOCOLCONTRACTS_WHERE_PKS_IN = "SELECT protocolContracts FROM ProtocolContracts protocolContracts WHERE protocol_contracts_id IN (";
	private static final String _SQL_SELECT_PROTOCOLCONTRACTS_WHERE = "SELECT protocolContracts FROM ProtocolContracts protocolContracts WHERE ";
	private static final String _SQL_COUNT_PROTOCOLCONTRACTS = "SELECT COUNT(protocolContracts) FROM ProtocolContracts protocolContracts";
	private static final String _SQL_COUNT_PROTOCOLCONTRACTS_WHERE = "SELECT COUNT(protocolContracts) FROM ProtocolContracts protocolContracts WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "protocolContracts.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ProtocolContracts exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ProtocolContracts exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ProtocolContractsPersistenceImpl.class);
}