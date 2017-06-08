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

package tj.supplier.criteria.service.persistence.impl;

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

import tj.supplier.criteria.exception.NoSuchSupplirCriteriaException;
import tj.supplier.criteria.model.SupplirCriteria;
import tj.supplier.criteria.model.impl.SupplirCriteriaImpl;
import tj.supplier.criteria.model.impl.SupplirCriteriaModelImpl;
import tj.supplier.criteria.service.persistence.SupplirCriteriaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the supplir criteria service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SupplirCriteriaPersistence
 * @see tj.supplier.criteria.service.persistence.SupplirCriteriaUtil
 * @generated
 */
@ProviderType
public class SupplirCriteriaPersistenceImpl extends BasePersistenceImpl<SupplirCriteria>
	implements SupplirCriteriaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SupplirCriteriaUtil} to access the supplir criteria persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SupplirCriteriaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SupplirCriteriaModelImpl.ENTITY_CACHE_ENABLED,
			SupplirCriteriaModelImpl.FINDER_CACHE_ENABLED,
			SupplirCriteriaImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SupplirCriteriaModelImpl.ENTITY_CACHE_ENABLED,
			SupplirCriteriaModelImpl.FINDER_CACHE_ENABLED,
			SupplirCriteriaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SupplirCriteriaModelImpl.ENTITY_CACHE_ENABLED,
			SupplirCriteriaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_CRITERIAIDORGID = new FinderPath(SupplirCriteriaModelImpl.ENTITY_CACHE_ENABLED,
			SupplirCriteriaModelImpl.FINDER_CACHE_ENABLED,
			SupplirCriteriaImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBycriteriaIdorgId",
			new String[] { Long.class.getName(), Long.class.getName() },
			SupplirCriteriaModelImpl.CRITERIA_ID_COLUMN_BITMASK |
			SupplirCriteriaModelImpl.ORGANIZATION_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CRITERIAIDORGID = new FinderPath(SupplirCriteriaModelImpl.ENTITY_CACHE_ENABLED,
			SupplirCriteriaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycriteriaIdorgId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the supplir criteria where criteria_id = &#63; and organization_id = &#63; or throws a {@link NoSuchSupplirCriteriaException} if it could not be found.
	 *
	 * @param criteria_id the criteria_id
	 * @param organization_id the organization_id
	 * @return the matching supplir criteria
	 * @throws NoSuchSupplirCriteriaException if a matching supplir criteria could not be found
	 */
	@Override
	public SupplirCriteria findBycriteriaIdorgId(long criteria_id,
		long organization_id) throws NoSuchSupplirCriteriaException {
		SupplirCriteria supplirCriteria = fetchBycriteriaIdorgId(criteria_id,
				organization_id);

		if (supplirCriteria == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("criteria_id=");
			msg.append(criteria_id);

			msg.append(", organization_id=");
			msg.append(organization_id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchSupplirCriteriaException(msg.toString());
		}

		return supplirCriteria;
	}

	/**
	 * Returns the supplir criteria where criteria_id = &#63; and organization_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param criteria_id the criteria_id
	 * @param organization_id the organization_id
	 * @return the matching supplir criteria, or <code>null</code> if a matching supplir criteria could not be found
	 */
	@Override
	public SupplirCriteria fetchBycriteriaIdorgId(long criteria_id,
		long organization_id) {
		return fetchBycriteriaIdorgId(criteria_id, organization_id, true);
	}

	/**
	 * Returns the supplir criteria where criteria_id = &#63; and organization_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param criteria_id the criteria_id
	 * @param organization_id the organization_id
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching supplir criteria, or <code>null</code> if a matching supplir criteria could not be found
	 */
	@Override
	public SupplirCriteria fetchBycriteriaIdorgId(long criteria_id,
		long organization_id, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { criteria_id, organization_id };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_CRITERIAIDORGID,
					finderArgs, this);
		}

		if (result instanceof SupplirCriteria) {
			SupplirCriteria supplirCriteria = (SupplirCriteria)result;

			if ((criteria_id != supplirCriteria.getCriteria_id()) ||
					(organization_id != supplirCriteria.getOrganization_id())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_SUPPLIRCRITERIA_WHERE);

			query.append(_FINDER_COLUMN_CRITERIAIDORGID_CRITERIA_ID_2);

			query.append(_FINDER_COLUMN_CRITERIAIDORGID_ORGANIZATION_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(criteria_id);

				qPos.add(organization_id);

				List<SupplirCriteria> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_CRITERIAIDORGID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"SupplirCriteriaPersistenceImpl.fetchBycriteriaIdorgId(long, long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SupplirCriteria supplirCriteria = list.get(0);

					result = supplirCriteria;

					cacheResult(supplirCriteria);

					if ((supplirCriteria.getCriteria_id() != criteria_id) ||
							(supplirCriteria.getOrganization_id() != organization_id)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_CRITERIAIDORGID,
							finderArgs, supplirCriteria);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_CRITERIAIDORGID,
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
			return (SupplirCriteria)result;
		}
	}

	/**
	 * Removes the supplir criteria where criteria_id = &#63; and organization_id = &#63; from the database.
	 *
	 * @param criteria_id the criteria_id
	 * @param organization_id the organization_id
	 * @return the supplir criteria that was removed
	 */
	@Override
	public SupplirCriteria removeBycriteriaIdorgId(long criteria_id,
		long organization_id) throws NoSuchSupplirCriteriaException {
		SupplirCriteria supplirCriteria = findBycriteriaIdorgId(criteria_id,
				organization_id);

		return remove(supplirCriteria);
	}

	/**
	 * Returns the number of supplir criterias where criteria_id = &#63; and organization_id = &#63;.
	 *
	 * @param criteria_id the criteria_id
	 * @param organization_id the organization_id
	 * @return the number of matching supplir criterias
	 */
	@Override
	public int countBycriteriaIdorgId(long criteria_id, long organization_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CRITERIAIDORGID;

		Object[] finderArgs = new Object[] { criteria_id, organization_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SUPPLIRCRITERIA_WHERE);

			query.append(_FINDER_COLUMN_CRITERIAIDORGID_CRITERIA_ID_2);

			query.append(_FINDER_COLUMN_CRITERIAIDORGID_ORGANIZATION_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(criteria_id);

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

	private static final String _FINDER_COLUMN_CRITERIAIDORGID_CRITERIA_ID_2 = "supplirCriteria.criteria_id = ? AND ";
	private static final String _FINDER_COLUMN_CRITERIAIDORGID_ORGANIZATION_ID_2 =
		"supplirCriteria.organization_id = ?";

	public SupplirCriteriaPersistenceImpl() {
		setModelClass(SupplirCriteria.class);
	}

	/**
	 * Caches the supplir criteria in the entity cache if it is enabled.
	 *
	 * @param supplirCriteria the supplir criteria
	 */
	@Override
	public void cacheResult(SupplirCriteria supplirCriteria) {
		entityCache.putResult(SupplirCriteriaModelImpl.ENTITY_CACHE_ENABLED,
			SupplirCriteriaImpl.class, supplirCriteria.getPrimaryKey(),
			supplirCriteria);

		finderCache.putResult(FINDER_PATH_FETCH_BY_CRITERIAIDORGID,
			new Object[] {
				supplirCriteria.getCriteria_id(),
				supplirCriteria.getOrganization_id()
			}, supplirCriteria);

		supplirCriteria.resetOriginalValues();
	}

	/**
	 * Caches the supplir criterias in the entity cache if it is enabled.
	 *
	 * @param supplirCriterias the supplir criterias
	 */
	@Override
	public void cacheResult(List<SupplirCriteria> supplirCriterias) {
		for (SupplirCriteria supplirCriteria : supplirCriterias) {
			if (entityCache.getResult(
						SupplirCriteriaModelImpl.ENTITY_CACHE_ENABLED,
						SupplirCriteriaImpl.class,
						supplirCriteria.getPrimaryKey()) == null) {
				cacheResult(supplirCriteria);
			}
			else {
				supplirCriteria.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all supplir criterias.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SupplirCriteriaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the supplir criteria.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SupplirCriteria supplirCriteria) {
		entityCache.removeResult(SupplirCriteriaModelImpl.ENTITY_CACHE_ENABLED,
			SupplirCriteriaImpl.class, supplirCriteria.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((SupplirCriteriaModelImpl)supplirCriteria, true);
	}

	@Override
	public void clearCache(List<SupplirCriteria> supplirCriterias) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SupplirCriteria supplirCriteria : supplirCriterias) {
			entityCache.removeResult(SupplirCriteriaModelImpl.ENTITY_CACHE_ENABLED,
				SupplirCriteriaImpl.class, supplirCriteria.getPrimaryKey());

			clearUniqueFindersCache((SupplirCriteriaModelImpl)supplirCriteria,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		SupplirCriteriaModelImpl supplirCriteriaModelImpl) {
		Object[] args = new Object[] {
				supplirCriteriaModelImpl.getCriteria_id(),
				supplirCriteriaModelImpl.getOrganization_id()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_CRITERIAIDORGID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_CRITERIAIDORGID, args,
			supplirCriteriaModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		SupplirCriteriaModelImpl supplirCriteriaModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					supplirCriteriaModelImpl.getCriteria_id(),
					supplirCriteriaModelImpl.getOrganization_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CRITERIAIDORGID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_CRITERIAIDORGID, args);
		}

		if ((supplirCriteriaModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CRITERIAIDORGID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					supplirCriteriaModelImpl.getOriginalCriteria_id(),
					supplirCriteriaModelImpl.getOriginalOrganization_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CRITERIAIDORGID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_CRITERIAIDORGID, args);
		}
	}

	/**
	 * Creates a new supplir criteria with the primary key. Does not add the supplir criteria to the database.
	 *
	 * @param supplier_criteria_id the primary key for the new supplir criteria
	 * @return the new supplir criteria
	 */
	@Override
	public SupplirCriteria create(long supplier_criteria_id) {
		SupplirCriteria supplirCriteria = new SupplirCriteriaImpl();

		supplirCriteria.setNew(true);
		supplirCriteria.setPrimaryKey(supplier_criteria_id);

		return supplirCriteria;
	}

	/**
	 * Removes the supplir criteria with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param supplier_criteria_id the primary key of the supplir criteria
	 * @return the supplir criteria that was removed
	 * @throws NoSuchSupplirCriteriaException if a supplir criteria with the primary key could not be found
	 */
	@Override
	public SupplirCriteria remove(long supplier_criteria_id)
		throws NoSuchSupplirCriteriaException {
		return remove((Serializable)supplier_criteria_id);
	}

	/**
	 * Removes the supplir criteria with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the supplir criteria
	 * @return the supplir criteria that was removed
	 * @throws NoSuchSupplirCriteriaException if a supplir criteria with the primary key could not be found
	 */
	@Override
	public SupplirCriteria remove(Serializable primaryKey)
		throws NoSuchSupplirCriteriaException {
		Session session = null;

		try {
			session = openSession();

			SupplirCriteria supplirCriteria = (SupplirCriteria)session.get(SupplirCriteriaImpl.class,
					primaryKey);

			if (supplirCriteria == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSupplirCriteriaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(supplirCriteria);
		}
		catch (NoSuchSupplirCriteriaException nsee) {
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
	protected SupplirCriteria removeImpl(SupplirCriteria supplirCriteria) {
		supplirCriteria = toUnwrappedModel(supplirCriteria);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(supplirCriteria)) {
				supplirCriteria = (SupplirCriteria)session.get(SupplirCriteriaImpl.class,
						supplirCriteria.getPrimaryKeyObj());
			}

			if (supplirCriteria != null) {
				session.delete(supplirCriteria);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (supplirCriteria != null) {
			clearCache(supplirCriteria);
		}

		return supplirCriteria;
	}

	@Override
	public SupplirCriteria updateImpl(SupplirCriteria supplirCriteria) {
		supplirCriteria = toUnwrappedModel(supplirCriteria);

		boolean isNew = supplirCriteria.isNew();

		SupplirCriteriaModelImpl supplirCriteriaModelImpl = (SupplirCriteriaModelImpl)supplirCriteria;

		Session session = null;

		try {
			session = openSession();

			if (supplirCriteria.isNew()) {
				session.save(supplirCriteria);

				supplirCriteria.setNew(false);
			}
			else {
				supplirCriteria = (SupplirCriteria)session.merge(supplirCriteria);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !SupplirCriteriaModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(SupplirCriteriaModelImpl.ENTITY_CACHE_ENABLED,
			SupplirCriteriaImpl.class, supplirCriteria.getPrimaryKey(),
			supplirCriteria, false);

		clearUniqueFindersCache(supplirCriteriaModelImpl, false);
		cacheUniqueFindersCache(supplirCriteriaModelImpl);

		supplirCriteria.resetOriginalValues();

		return supplirCriteria;
	}

	protected SupplirCriteria toUnwrappedModel(SupplirCriteria supplirCriteria) {
		if (supplirCriteria instanceof SupplirCriteriaImpl) {
			return supplirCriteria;
		}

		SupplirCriteriaImpl supplirCriteriaImpl = new SupplirCriteriaImpl();

		supplirCriteriaImpl.setNew(supplirCriteria.isNew());
		supplirCriteriaImpl.setPrimaryKey(supplirCriteria.getPrimaryKey());

		supplirCriteriaImpl.setSupplier_criteria_id(supplirCriteria.getSupplier_criteria_id());
		supplirCriteriaImpl.setCriteria_id(supplirCriteria.getCriteria_id());
		supplirCriteriaImpl.setOrganization_id(supplirCriteria.getOrganization_id());
		supplirCriteriaImpl.setDescription(supplirCriteria.getDescription());

		return supplirCriteriaImpl;
	}

	/**
	 * Returns the supplir criteria with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the supplir criteria
	 * @return the supplir criteria
	 * @throws NoSuchSupplirCriteriaException if a supplir criteria with the primary key could not be found
	 */
	@Override
	public SupplirCriteria findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSupplirCriteriaException {
		SupplirCriteria supplirCriteria = fetchByPrimaryKey(primaryKey);

		if (supplirCriteria == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSupplirCriteriaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return supplirCriteria;
	}

	/**
	 * Returns the supplir criteria with the primary key or throws a {@link NoSuchSupplirCriteriaException} if it could not be found.
	 *
	 * @param supplier_criteria_id the primary key of the supplir criteria
	 * @return the supplir criteria
	 * @throws NoSuchSupplirCriteriaException if a supplir criteria with the primary key could not be found
	 */
	@Override
	public SupplirCriteria findByPrimaryKey(long supplier_criteria_id)
		throws NoSuchSupplirCriteriaException {
		return findByPrimaryKey((Serializable)supplier_criteria_id);
	}

	/**
	 * Returns the supplir criteria with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the supplir criteria
	 * @return the supplir criteria, or <code>null</code> if a supplir criteria with the primary key could not be found
	 */
	@Override
	public SupplirCriteria fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(SupplirCriteriaModelImpl.ENTITY_CACHE_ENABLED,
				SupplirCriteriaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		SupplirCriteria supplirCriteria = (SupplirCriteria)serializable;

		if (supplirCriteria == null) {
			Session session = null;

			try {
				session = openSession();

				supplirCriteria = (SupplirCriteria)session.get(SupplirCriteriaImpl.class,
						primaryKey);

				if (supplirCriteria != null) {
					cacheResult(supplirCriteria);
				}
				else {
					entityCache.putResult(SupplirCriteriaModelImpl.ENTITY_CACHE_ENABLED,
						SupplirCriteriaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(SupplirCriteriaModelImpl.ENTITY_CACHE_ENABLED,
					SupplirCriteriaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return supplirCriteria;
	}

	/**
	 * Returns the supplir criteria with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param supplier_criteria_id the primary key of the supplir criteria
	 * @return the supplir criteria, or <code>null</code> if a supplir criteria with the primary key could not be found
	 */
	@Override
	public SupplirCriteria fetchByPrimaryKey(long supplier_criteria_id) {
		return fetchByPrimaryKey((Serializable)supplier_criteria_id);
	}

	@Override
	public Map<Serializable, SupplirCriteria> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, SupplirCriteria> map = new HashMap<Serializable, SupplirCriteria>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			SupplirCriteria supplirCriteria = fetchByPrimaryKey(primaryKey);

			if (supplirCriteria != null) {
				map.put(primaryKey, supplirCriteria);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(SupplirCriteriaModelImpl.ENTITY_CACHE_ENABLED,
					SupplirCriteriaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (SupplirCriteria)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SUPPLIRCRITERIA_WHERE_PKS_IN);

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

			for (SupplirCriteria supplirCriteria : (List<SupplirCriteria>)q.list()) {
				map.put(supplirCriteria.getPrimaryKeyObj(), supplirCriteria);

				cacheResult(supplirCriteria);

				uncachedPrimaryKeys.remove(supplirCriteria.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(SupplirCriteriaModelImpl.ENTITY_CACHE_ENABLED,
					SupplirCriteriaImpl.class, primaryKey, nullModel);
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
	 * Returns all the supplir criterias.
	 *
	 * @return the supplir criterias
	 */
	@Override
	public List<SupplirCriteria> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the supplir criterias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SupplirCriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of supplir criterias
	 * @param end the upper bound of the range of supplir criterias (not inclusive)
	 * @return the range of supplir criterias
	 */
	@Override
	public List<SupplirCriteria> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the supplir criterias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SupplirCriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of supplir criterias
	 * @param end the upper bound of the range of supplir criterias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of supplir criterias
	 */
	@Override
	public List<SupplirCriteria> findAll(int start, int end,
		OrderByComparator<SupplirCriteria> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the supplir criterias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SupplirCriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of supplir criterias
	 * @param end the upper bound of the range of supplir criterias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of supplir criterias
	 */
	@Override
	public List<SupplirCriteria> findAll(int start, int end,
		OrderByComparator<SupplirCriteria> orderByComparator,
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

		List<SupplirCriteria> list = null;

		if (retrieveFromCache) {
			list = (List<SupplirCriteria>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SUPPLIRCRITERIA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SUPPLIRCRITERIA;

				if (pagination) {
					sql = sql.concat(SupplirCriteriaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SupplirCriteria>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SupplirCriteria>)QueryUtil.list(q,
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
	 * Removes all the supplir criterias from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SupplirCriteria supplirCriteria : findAll()) {
			remove(supplirCriteria);
		}
	}

	/**
	 * Returns the number of supplir criterias.
	 *
	 * @return the number of supplir criterias
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SUPPLIRCRITERIA);

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
		return SupplirCriteriaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the supplir criteria persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(SupplirCriteriaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SUPPLIRCRITERIA = "SELECT supplirCriteria FROM SupplirCriteria supplirCriteria";
	private static final String _SQL_SELECT_SUPPLIRCRITERIA_WHERE_PKS_IN = "SELECT supplirCriteria FROM SupplirCriteria supplirCriteria WHERE supplier_criteria_id IN (";
	private static final String _SQL_SELECT_SUPPLIRCRITERIA_WHERE = "SELECT supplirCriteria FROM SupplirCriteria supplirCriteria WHERE ";
	private static final String _SQL_COUNT_SUPPLIRCRITERIA = "SELECT COUNT(supplirCriteria) FROM SupplirCriteria supplirCriteria";
	private static final String _SQL_COUNT_SUPPLIRCRITERIA_WHERE = "SELECT COUNT(supplirCriteria) FROM SupplirCriteria supplirCriteria WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "supplirCriteria.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SupplirCriteria exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SupplirCriteria exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(SupplirCriteriaPersistenceImpl.class);
}