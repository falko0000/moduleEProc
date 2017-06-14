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

package tj.criterias.service.persistence.impl;

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

import tj.criterias.exception.NoSuchCriteriasWeightException;

import tj.criterias.model.CriteriasWeight;
import tj.criterias.model.impl.CriteriasWeightImpl;
import tj.criterias.model.impl.CriteriasWeightModelImpl;

import tj.criterias.service.persistence.CriteriasWeightPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the criterias weight service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CriteriasWeightPersistence
 * @see tj.criterias.service.persistence.CriteriasWeightUtil
 * @generated
 */
@ProviderType
public class CriteriasWeightPersistenceImpl extends BasePersistenceImpl<CriteriasWeight>
	implements CriteriasWeightPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CriteriasWeightUtil} to access the criterias weight persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CriteriasWeightImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CriteriasWeightModelImpl.ENTITY_CACHE_ENABLED,
			CriteriasWeightModelImpl.FINDER_CACHE_ENABLED,
			CriteriasWeightImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CriteriasWeightModelImpl.ENTITY_CACHE_ENABLED,
			CriteriasWeightModelImpl.FINDER_CACHE_ENABLED,
			CriteriasWeightImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CriteriasWeightModelImpl.ENTITY_CACHE_ENABLED,
			CriteriasWeightModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_LOTOVIDANDCATEGORYID = new FinderPath(CriteriasWeightModelImpl.ENTITY_CACHE_ENABLED,
			CriteriasWeightModelImpl.FINDER_CACHE_ENABLED,
			CriteriasWeightImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByLotovIdAndCategoryId",
			new String[] { Long.class.getName(), Integer.class.getName() },
			CriteriasWeightModelImpl.SPISOK_LOTOV_ID_COLUMN_BITMASK |
			CriteriasWeightModelImpl.CRITERIA_CATEGORY_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOTOVIDANDCATEGORYID = new FinderPath(CriteriasWeightModelImpl.ENTITY_CACHE_ENABLED,
			CriteriasWeightModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByLotovIdAndCategoryId",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns the criterias weight where spisok_lotov_id = &#63; and criteria_category_id = &#63; or throws a {@link NoSuchCriteriasWeightException} if it could not be found.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @return the matching criterias weight
	 * @throws NoSuchCriteriasWeightException if a matching criterias weight could not be found
	 */
	@Override
	public CriteriasWeight findByLotovIdAndCategoryId(long spisok_lotov_id,
		int criteria_category_id) throws NoSuchCriteriasWeightException {
		CriteriasWeight criteriasWeight = fetchByLotovIdAndCategoryId(spisok_lotov_id,
				criteria_category_id);

		if (criteriasWeight == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("spisok_lotov_id=");
			msg.append(spisok_lotov_id);

			msg.append(", criteria_category_id=");
			msg.append(criteria_category_id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchCriteriasWeightException(msg.toString());
		}

		return criteriasWeight;
	}

	/**
	 * Returns the criterias weight where spisok_lotov_id = &#63; and criteria_category_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @return the matching criterias weight, or <code>null</code> if a matching criterias weight could not be found
	 */
	@Override
	public CriteriasWeight fetchByLotovIdAndCategoryId(long spisok_lotov_id,
		int criteria_category_id) {
		return fetchByLotovIdAndCategoryId(spisok_lotov_id,
			criteria_category_id, true);
	}

	/**
	 * Returns the criterias weight where spisok_lotov_id = &#63; and criteria_category_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching criterias weight, or <code>null</code> if a matching criterias weight could not be found
	 */
	@Override
	public CriteriasWeight fetchByLotovIdAndCategoryId(long spisok_lotov_id,
		int criteria_category_id, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { spisok_lotov_id, criteria_category_id };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_LOTOVIDANDCATEGORYID,
					finderArgs, this);
		}

		if (result instanceof CriteriasWeight) {
			CriteriasWeight criteriasWeight = (CriteriasWeight)result;

			if ((spisok_lotov_id != criteriasWeight.getSpisok_lotov_id()) ||
					(criteria_category_id != criteriasWeight.getCriteria_category_id())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CRITERIASWEIGHT_WHERE);

			query.append(_FINDER_COLUMN_LOTOVIDANDCATEGORYID_SPISOK_LOTOV_ID_2);

			query.append(_FINDER_COLUMN_LOTOVIDANDCATEGORYID_CRITERIA_CATEGORY_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

				qPos.add(criteria_category_id);

				List<CriteriasWeight> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_LOTOVIDANDCATEGORYID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"CriteriasWeightPersistenceImpl.fetchByLotovIdAndCategoryId(long, int, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CriteriasWeight criteriasWeight = list.get(0);

					result = criteriasWeight;

					cacheResult(criteriasWeight);

					if ((criteriasWeight.getSpisok_lotov_id() != spisok_lotov_id) ||
							(criteriasWeight.getCriteria_category_id() != criteria_category_id)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_LOTOVIDANDCATEGORYID,
							finderArgs, criteriasWeight);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_LOTOVIDANDCATEGORYID,
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
			return (CriteriasWeight)result;
		}
	}

	/**
	 * Removes the criterias weight where spisok_lotov_id = &#63; and criteria_category_id = &#63; from the database.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @return the criterias weight that was removed
	 */
	@Override
	public CriteriasWeight removeByLotovIdAndCategoryId(long spisok_lotov_id,
		int criteria_category_id) throws NoSuchCriteriasWeightException {
		CriteriasWeight criteriasWeight = findByLotovIdAndCategoryId(spisok_lotov_id,
				criteria_category_id);

		return remove(criteriasWeight);
	}

	/**
	 * Returns the number of criterias weights where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @return the number of matching criterias weights
	 */
	@Override
	public int countByLotovIdAndCategoryId(long spisok_lotov_id,
		int criteria_category_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOTOVIDANDCATEGORYID;

		Object[] finderArgs = new Object[] { spisok_lotov_id, criteria_category_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRITERIASWEIGHT_WHERE);

			query.append(_FINDER_COLUMN_LOTOVIDANDCATEGORYID_SPISOK_LOTOV_ID_2);

			query.append(_FINDER_COLUMN_LOTOVIDANDCATEGORYID_CRITERIA_CATEGORY_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

				qPos.add(criteria_category_id);

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

	private static final String _FINDER_COLUMN_LOTOVIDANDCATEGORYID_SPISOK_LOTOV_ID_2 =
		"criteriasWeight.spisok_lotov_id = ? AND ";
	private static final String _FINDER_COLUMN_LOTOVIDANDCATEGORYID_CRITERIA_CATEGORY_ID_2 =
		"criteriasWeight.criteria_category_id = ?";

	public CriteriasWeightPersistenceImpl() {
		setModelClass(CriteriasWeight.class);
	}

	/**
	 * Caches the criterias weight in the entity cache if it is enabled.
	 *
	 * @param criteriasWeight the criterias weight
	 */
	@Override
	public void cacheResult(CriteriasWeight criteriasWeight) {
		entityCache.putResult(CriteriasWeightModelImpl.ENTITY_CACHE_ENABLED,
			CriteriasWeightImpl.class, criteriasWeight.getPrimaryKey(),
			criteriasWeight);

		finderCache.putResult(FINDER_PATH_FETCH_BY_LOTOVIDANDCATEGORYID,
			new Object[] {
				criteriasWeight.getSpisok_lotov_id(),
				criteriasWeight.getCriteria_category_id()
			}, criteriasWeight);

		criteriasWeight.resetOriginalValues();
	}

	/**
	 * Caches the criterias weights in the entity cache if it is enabled.
	 *
	 * @param criteriasWeights the criterias weights
	 */
	@Override
	public void cacheResult(List<CriteriasWeight> criteriasWeights) {
		for (CriteriasWeight criteriasWeight : criteriasWeights) {
			if (entityCache.getResult(
						CriteriasWeightModelImpl.ENTITY_CACHE_ENABLED,
						CriteriasWeightImpl.class,
						criteriasWeight.getPrimaryKey()) == null) {
				cacheResult(criteriasWeight);
			}
			else {
				criteriasWeight.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all criterias weights.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CriteriasWeightImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the criterias weight.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CriteriasWeight criteriasWeight) {
		entityCache.removeResult(CriteriasWeightModelImpl.ENTITY_CACHE_ENABLED,
			CriteriasWeightImpl.class, criteriasWeight.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((CriteriasWeightModelImpl)criteriasWeight, true);
	}

	@Override
	public void clearCache(List<CriteriasWeight> criteriasWeights) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CriteriasWeight criteriasWeight : criteriasWeights) {
			entityCache.removeResult(CriteriasWeightModelImpl.ENTITY_CACHE_ENABLED,
				CriteriasWeightImpl.class, criteriasWeight.getPrimaryKey());

			clearUniqueFindersCache((CriteriasWeightModelImpl)criteriasWeight,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		CriteriasWeightModelImpl criteriasWeightModelImpl) {
		Object[] args = new Object[] {
				criteriasWeightModelImpl.getSpisok_lotov_id(),
				criteriasWeightModelImpl.getCriteria_category_id()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_LOTOVIDANDCATEGORYID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_LOTOVIDANDCATEGORYID, args,
			criteriasWeightModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		CriteriasWeightModelImpl criteriasWeightModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					criteriasWeightModelImpl.getSpisok_lotov_id(),
					criteriasWeightModelImpl.getCriteria_category_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTOVIDANDCATEGORYID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_LOTOVIDANDCATEGORYID,
				args);
		}

		if ((criteriasWeightModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_LOTOVIDANDCATEGORYID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					criteriasWeightModelImpl.getOriginalSpisok_lotov_id(),
					criteriasWeightModelImpl.getOriginalCriteria_category_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTOVIDANDCATEGORYID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_LOTOVIDANDCATEGORYID,
				args);
		}
	}

	/**
	 * Creates a new criterias weight with the primary key. Does not add the criterias weight to the database.
	 *
	 * @param criterias_weight_id the primary key for the new criterias weight
	 * @return the new criterias weight
	 */
	@Override
	public CriteriasWeight create(long criterias_weight_id) {
		CriteriasWeight criteriasWeight = new CriteriasWeightImpl();

		criteriasWeight.setNew(true);
		criteriasWeight.setPrimaryKey(criterias_weight_id);

		return criteriasWeight;
	}

	/**
	 * Removes the criterias weight with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param criterias_weight_id the primary key of the criterias weight
	 * @return the criterias weight that was removed
	 * @throws NoSuchCriteriasWeightException if a criterias weight with the primary key could not be found
	 */
	@Override
	public CriteriasWeight remove(long criterias_weight_id)
		throws NoSuchCriteriasWeightException {
		return remove((Serializable)criterias_weight_id);
	}

	/**
	 * Removes the criterias weight with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the criterias weight
	 * @return the criterias weight that was removed
	 * @throws NoSuchCriteriasWeightException if a criterias weight with the primary key could not be found
	 */
	@Override
	public CriteriasWeight remove(Serializable primaryKey)
		throws NoSuchCriteriasWeightException {
		Session session = null;

		try {
			session = openSession();

			CriteriasWeight criteriasWeight = (CriteriasWeight)session.get(CriteriasWeightImpl.class,
					primaryKey);

			if (criteriasWeight == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCriteriasWeightException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(criteriasWeight);
		}
		catch (NoSuchCriteriasWeightException nsee) {
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
	protected CriteriasWeight removeImpl(CriteriasWeight criteriasWeight) {
		criteriasWeight = toUnwrappedModel(criteriasWeight);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(criteriasWeight)) {
				criteriasWeight = (CriteriasWeight)session.get(CriteriasWeightImpl.class,
						criteriasWeight.getPrimaryKeyObj());
			}

			if (criteriasWeight != null) {
				session.delete(criteriasWeight);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (criteriasWeight != null) {
			clearCache(criteriasWeight);
		}

		return criteriasWeight;
	}

	@Override
	public CriteriasWeight updateImpl(CriteriasWeight criteriasWeight) {
		criteriasWeight = toUnwrappedModel(criteriasWeight);

		boolean isNew = criteriasWeight.isNew();

		CriteriasWeightModelImpl criteriasWeightModelImpl = (CriteriasWeightModelImpl)criteriasWeight;

		Session session = null;

		try {
			session = openSession();

			if (criteriasWeight.isNew()) {
				session.save(criteriasWeight);

				criteriasWeight.setNew(false);
			}
			else {
				criteriasWeight = (CriteriasWeight)session.merge(criteriasWeight);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CriteriasWeightModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(CriteriasWeightModelImpl.ENTITY_CACHE_ENABLED,
			CriteriasWeightImpl.class, criteriasWeight.getPrimaryKey(),
			criteriasWeight, false);

		clearUniqueFindersCache(criteriasWeightModelImpl, false);
		cacheUniqueFindersCache(criteriasWeightModelImpl);

		criteriasWeight.resetOriginalValues();

		return criteriasWeight;
	}

	protected CriteriasWeight toUnwrappedModel(CriteriasWeight criteriasWeight) {
		if (criteriasWeight instanceof CriteriasWeightImpl) {
			return criteriasWeight;
		}

		CriteriasWeightImpl criteriasWeightImpl = new CriteriasWeightImpl();

		criteriasWeightImpl.setNew(criteriasWeight.isNew());
		criteriasWeightImpl.setPrimaryKey(criteriasWeight.getPrimaryKey());

		criteriasWeightImpl.setCriterias_weight_id(criteriasWeight.getCriterias_weight_id());
		criteriasWeightImpl.setSpisok_lotov_id(criteriasWeight.getSpisok_lotov_id());
		criteriasWeightImpl.setCriteria_category_id(criteriasWeight.getCriteria_category_id());
		criteriasWeightImpl.setCriterias_weight(criteriasWeight.getCriterias_weight());
		criteriasWeightImpl.setCreated(criteriasWeight.getCreated());
		criteriasWeightImpl.setUpdated(criteriasWeight.getUpdated());
		criteriasWeightImpl.setCreatedby(criteriasWeight.getCreatedby());
		criteriasWeightImpl.setUpdatedby(criteriasWeight.getUpdatedby());
		criteriasWeightImpl.setPassing_score(criteriasWeight.getPassing_score());

		return criteriasWeightImpl;
	}

	/**
	 * Returns the criterias weight with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the criterias weight
	 * @return the criterias weight
	 * @throws NoSuchCriteriasWeightException if a criterias weight with the primary key could not be found
	 */
	@Override
	public CriteriasWeight findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCriteriasWeightException {
		CriteriasWeight criteriasWeight = fetchByPrimaryKey(primaryKey);

		if (criteriasWeight == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCriteriasWeightException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return criteriasWeight;
	}

	/**
	 * Returns the criterias weight with the primary key or throws a {@link NoSuchCriteriasWeightException} if it could not be found.
	 *
	 * @param criterias_weight_id the primary key of the criterias weight
	 * @return the criterias weight
	 * @throws NoSuchCriteriasWeightException if a criterias weight with the primary key could not be found
	 */
	@Override
	public CriteriasWeight findByPrimaryKey(long criterias_weight_id)
		throws NoSuchCriteriasWeightException {
		return findByPrimaryKey((Serializable)criterias_weight_id);
	}

	/**
	 * Returns the criterias weight with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the criterias weight
	 * @return the criterias weight, or <code>null</code> if a criterias weight with the primary key could not be found
	 */
	@Override
	public CriteriasWeight fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CriteriasWeightModelImpl.ENTITY_CACHE_ENABLED,
				CriteriasWeightImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CriteriasWeight criteriasWeight = (CriteriasWeight)serializable;

		if (criteriasWeight == null) {
			Session session = null;

			try {
				session = openSession();

				criteriasWeight = (CriteriasWeight)session.get(CriteriasWeightImpl.class,
						primaryKey);

				if (criteriasWeight != null) {
					cacheResult(criteriasWeight);
				}
				else {
					entityCache.putResult(CriteriasWeightModelImpl.ENTITY_CACHE_ENABLED,
						CriteriasWeightImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CriteriasWeightModelImpl.ENTITY_CACHE_ENABLED,
					CriteriasWeightImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return criteriasWeight;
	}

	/**
	 * Returns the criterias weight with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param criterias_weight_id the primary key of the criterias weight
	 * @return the criterias weight, or <code>null</code> if a criterias weight with the primary key could not be found
	 */
	@Override
	public CriteriasWeight fetchByPrimaryKey(long criterias_weight_id) {
		return fetchByPrimaryKey((Serializable)criterias_weight_id);
	}

	@Override
	public Map<Serializable, CriteriasWeight> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CriteriasWeight> map = new HashMap<Serializable, CriteriasWeight>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CriteriasWeight criteriasWeight = fetchByPrimaryKey(primaryKey);

			if (criteriasWeight != null) {
				map.put(primaryKey, criteriasWeight);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CriteriasWeightModelImpl.ENTITY_CACHE_ENABLED,
					CriteriasWeightImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CriteriasWeight)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CRITERIASWEIGHT_WHERE_PKS_IN);

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

			for (CriteriasWeight criteriasWeight : (List<CriteriasWeight>)q.list()) {
				map.put(criteriasWeight.getPrimaryKeyObj(), criteriasWeight);

				cacheResult(criteriasWeight);

				uncachedPrimaryKeys.remove(criteriasWeight.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CriteriasWeightModelImpl.ENTITY_CACHE_ENABLED,
					CriteriasWeightImpl.class, primaryKey, nullModel);
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
	 * Returns all the criterias weights.
	 *
	 * @return the criterias weights
	 */
	@Override
	public List<CriteriasWeight> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the criterias weights.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriasWeightModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of criterias weights
	 * @param end the upper bound of the range of criterias weights (not inclusive)
	 * @return the range of criterias weights
	 */
	@Override
	public List<CriteriasWeight> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the criterias weights.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriasWeightModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of criterias weights
	 * @param end the upper bound of the range of criterias weights (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of criterias weights
	 */
	@Override
	public List<CriteriasWeight> findAll(int start, int end,
		OrderByComparator<CriteriasWeight> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the criterias weights.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriasWeightModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of criterias weights
	 * @param end the upper bound of the range of criterias weights (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of criterias weights
	 */
	@Override
	public List<CriteriasWeight> findAll(int start, int end,
		OrderByComparator<CriteriasWeight> orderByComparator,
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

		List<CriteriasWeight> list = null;

		if (retrieveFromCache) {
			list = (List<CriteriasWeight>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CRITERIASWEIGHT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRITERIASWEIGHT;

				if (pagination) {
					sql = sql.concat(CriteriasWeightModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CriteriasWeight>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CriteriasWeight>)QueryUtil.list(q,
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
	 * Removes all the criterias weights from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CriteriasWeight criteriasWeight : findAll()) {
			remove(criteriasWeight);
		}
	}

	/**
	 * Returns the number of criterias weights.
	 *
	 * @return the number of criterias weights
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CRITERIASWEIGHT);

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
		return CriteriasWeightModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the criterias weight persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CriteriasWeightImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CRITERIASWEIGHT = "SELECT criteriasWeight FROM CriteriasWeight criteriasWeight";
	private static final String _SQL_SELECT_CRITERIASWEIGHT_WHERE_PKS_IN = "SELECT criteriasWeight FROM CriteriasWeight criteriasWeight WHERE criterias_weight_id IN (";
	private static final String _SQL_SELECT_CRITERIASWEIGHT_WHERE = "SELECT criteriasWeight FROM CriteriasWeight criteriasWeight WHERE ";
	private static final String _SQL_COUNT_CRITERIASWEIGHT = "SELECT COUNT(criteriasWeight) FROM CriteriasWeight criteriasWeight";
	private static final String _SQL_COUNT_CRITERIASWEIGHT_WHERE = "SELECT COUNT(criteriasWeight) FROM CriteriasWeight criteriasWeight WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "criteriasWeight.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CriteriasWeight exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CriteriasWeight exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CriteriasWeightPersistenceImpl.class);
}