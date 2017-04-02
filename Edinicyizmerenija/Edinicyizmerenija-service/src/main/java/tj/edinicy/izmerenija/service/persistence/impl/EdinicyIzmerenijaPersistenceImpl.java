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

package tj.edinicy.izmerenija.service.persistence.impl;

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

import tj.edinicy.izmerenija.exception.NoSuchEdinicyIzmerenijaException;
import tj.edinicy.izmerenija.model.EdinicyIzmerenija;
import tj.edinicy.izmerenija.model.impl.EdinicyIzmerenijaImpl;
import tj.edinicy.izmerenija.model.impl.EdinicyIzmerenijaModelImpl;
import tj.edinicy.izmerenija.service.persistence.EdinicyIzmerenijaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the edinicy izmerenija service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EdinicyIzmerenijaPersistence
 * @see tj.edinicy.izmerenija.service.persistence.EdinicyIzmerenijaUtil
 * @generated
 */
@ProviderType
public class EdinicyIzmerenijaPersistenceImpl extends BasePersistenceImpl<EdinicyIzmerenija>
	implements EdinicyIzmerenijaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EdinicyIzmerenijaUtil} to access the edinicy izmerenija persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EdinicyIzmerenijaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EdinicyIzmerenijaModelImpl.ENTITY_CACHE_ENABLED,
			EdinicyIzmerenijaModelImpl.FINDER_CACHE_ENABLED,
			EdinicyIzmerenijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EdinicyIzmerenijaModelImpl.ENTITY_CACHE_ENABLED,
			EdinicyIzmerenijaModelImpl.FINDER_CACHE_ENABLED,
			EdinicyIzmerenijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EdinicyIzmerenijaModelImpl.ENTITY_CACHE_ENABLED,
			EdinicyIzmerenijaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EdinicyIzmerenijaPersistenceImpl() {
		setModelClass(EdinicyIzmerenija.class);
	}

	/**
	 * Caches the edinicy izmerenija in the entity cache if it is enabled.
	 *
	 * @param edinicyIzmerenija the edinicy izmerenija
	 */
	@Override
	public void cacheResult(EdinicyIzmerenija edinicyIzmerenija) {
		entityCache.putResult(EdinicyIzmerenijaModelImpl.ENTITY_CACHE_ENABLED,
			EdinicyIzmerenijaImpl.class, edinicyIzmerenija.getPrimaryKey(),
			edinicyIzmerenija);

		edinicyIzmerenija.resetOriginalValues();
	}

	/**
	 * Caches the edinicy izmerenijas in the entity cache if it is enabled.
	 *
	 * @param edinicyIzmerenijas the edinicy izmerenijas
	 */
	@Override
	public void cacheResult(List<EdinicyIzmerenija> edinicyIzmerenijas) {
		for (EdinicyIzmerenija edinicyIzmerenija : edinicyIzmerenijas) {
			if (entityCache.getResult(
						EdinicyIzmerenijaModelImpl.ENTITY_CACHE_ENABLED,
						EdinicyIzmerenijaImpl.class,
						edinicyIzmerenija.getPrimaryKey()) == null) {
				cacheResult(edinicyIzmerenija);
			}
			else {
				edinicyIzmerenija.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all edinicy izmerenijas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EdinicyIzmerenijaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the edinicy izmerenija.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EdinicyIzmerenija edinicyIzmerenija) {
		entityCache.removeResult(EdinicyIzmerenijaModelImpl.ENTITY_CACHE_ENABLED,
			EdinicyIzmerenijaImpl.class, edinicyIzmerenija.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EdinicyIzmerenija> edinicyIzmerenijas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EdinicyIzmerenija edinicyIzmerenija : edinicyIzmerenijas) {
			entityCache.removeResult(EdinicyIzmerenijaModelImpl.ENTITY_CACHE_ENABLED,
				EdinicyIzmerenijaImpl.class, edinicyIzmerenija.getPrimaryKey());
		}
	}

	/**
	 * Creates a new edinicy izmerenija with the primary key. Does not add the edinicy izmerenija to the database.
	 *
	 * @param edinicy_izmerenija_id the primary key for the new edinicy izmerenija
	 * @return the new edinicy izmerenija
	 */
	@Override
	public EdinicyIzmerenija create(long edinicy_izmerenija_id) {
		EdinicyIzmerenija edinicyIzmerenija = new EdinicyIzmerenijaImpl();

		edinicyIzmerenija.setNew(true);
		edinicyIzmerenija.setPrimaryKey(edinicy_izmerenija_id);

		return edinicyIzmerenija;
	}

	/**
	 * Removes the edinicy izmerenija with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param edinicy_izmerenija_id the primary key of the edinicy izmerenija
	 * @return the edinicy izmerenija that was removed
	 * @throws NoSuchEdinicyIzmerenijaException if a edinicy izmerenija with the primary key could not be found
	 */
	@Override
	public EdinicyIzmerenija remove(long edinicy_izmerenija_id)
		throws NoSuchEdinicyIzmerenijaException {
		return remove((Serializable)edinicy_izmerenija_id);
	}

	/**
	 * Removes the edinicy izmerenija with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the edinicy izmerenija
	 * @return the edinicy izmerenija that was removed
	 * @throws NoSuchEdinicyIzmerenijaException if a edinicy izmerenija with the primary key could not be found
	 */
	@Override
	public EdinicyIzmerenija remove(Serializable primaryKey)
		throws NoSuchEdinicyIzmerenijaException {
		Session session = null;

		try {
			session = openSession();

			EdinicyIzmerenija edinicyIzmerenija = (EdinicyIzmerenija)session.get(EdinicyIzmerenijaImpl.class,
					primaryKey);

			if (edinicyIzmerenija == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEdinicyIzmerenijaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(edinicyIzmerenija);
		}
		catch (NoSuchEdinicyIzmerenijaException nsee) {
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
	protected EdinicyIzmerenija removeImpl(EdinicyIzmerenija edinicyIzmerenija) {
		edinicyIzmerenija = toUnwrappedModel(edinicyIzmerenija);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(edinicyIzmerenija)) {
				edinicyIzmerenija = (EdinicyIzmerenija)session.get(EdinicyIzmerenijaImpl.class,
						edinicyIzmerenija.getPrimaryKeyObj());
			}

			if (edinicyIzmerenija != null) {
				session.delete(edinicyIzmerenija);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (edinicyIzmerenija != null) {
			clearCache(edinicyIzmerenija);
		}

		return edinicyIzmerenija;
	}

	@Override
	public EdinicyIzmerenija updateImpl(EdinicyIzmerenija edinicyIzmerenija) {
		edinicyIzmerenija = toUnwrappedModel(edinicyIzmerenija);

		boolean isNew = edinicyIzmerenija.isNew();

		Session session = null;

		try {
			session = openSession();

			if (edinicyIzmerenija.isNew()) {
				session.save(edinicyIzmerenija);

				edinicyIzmerenija.setNew(false);
			}
			else {
				edinicyIzmerenija = (EdinicyIzmerenija)session.merge(edinicyIzmerenija);
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

		entityCache.putResult(EdinicyIzmerenijaModelImpl.ENTITY_CACHE_ENABLED,
			EdinicyIzmerenijaImpl.class, edinicyIzmerenija.getPrimaryKey(),
			edinicyIzmerenija, false);

		edinicyIzmerenija.resetOriginalValues();

		return edinicyIzmerenija;
	}

	protected EdinicyIzmerenija toUnwrappedModel(
		EdinicyIzmerenija edinicyIzmerenija) {
		if (edinicyIzmerenija instanceof EdinicyIzmerenijaImpl) {
			return edinicyIzmerenija;
		}

		EdinicyIzmerenijaImpl edinicyIzmerenijaImpl = new EdinicyIzmerenijaImpl();

		edinicyIzmerenijaImpl.setNew(edinicyIzmerenija.isNew());
		edinicyIzmerenijaImpl.setPrimaryKey(edinicyIzmerenija.getPrimaryKey());

		edinicyIzmerenijaImpl.setEdinicy_izmerenija_id(edinicyIzmerenija.getEdinicy_izmerenija_id());
		edinicyIzmerenijaImpl.setNazvanie(edinicyIzmerenija.getNazvanie());

		return edinicyIzmerenijaImpl;
	}

	/**
	 * Returns the edinicy izmerenija with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the edinicy izmerenija
	 * @return the edinicy izmerenija
	 * @throws NoSuchEdinicyIzmerenijaException if a edinicy izmerenija with the primary key could not be found
	 */
	@Override
	public EdinicyIzmerenija findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEdinicyIzmerenijaException {
		EdinicyIzmerenija edinicyIzmerenija = fetchByPrimaryKey(primaryKey);

		if (edinicyIzmerenija == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEdinicyIzmerenijaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return edinicyIzmerenija;
	}

	/**
	 * Returns the edinicy izmerenija with the primary key or throws a {@link NoSuchEdinicyIzmerenijaException} if it could not be found.
	 *
	 * @param edinicy_izmerenija_id the primary key of the edinicy izmerenija
	 * @return the edinicy izmerenija
	 * @throws NoSuchEdinicyIzmerenijaException if a edinicy izmerenija with the primary key could not be found
	 */
	@Override
	public EdinicyIzmerenija findByPrimaryKey(long edinicy_izmerenija_id)
		throws NoSuchEdinicyIzmerenijaException {
		return findByPrimaryKey((Serializable)edinicy_izmerenija_id);
	}

	/**
	 * Returns the edinicy izmerenija with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the edinicy izmerenija
	 * @return the edinicy izmerenija, or <code>null</code> if a edinicy izmerenija with the primary key could not be found
	 */
	@Override
	public EdinicyIzmerenija fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(EdinicyIzmerenijaModelImpl.ENTITY_CACHE_ENABLED,
				EdinicyIzmerenijaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		EdinicyIzmerenija edinicyIzmerenija = (EdinicyIzmerenija)serializable;

		if (edinicyIzmerenija == null) {
			Session session = null;

			try {
				session = openSession();

				edinicyIzmerenija = (EdinicyIzmerenija)session.get(EdinicyIzmerenijaImpl.class,
						primaryKey);

				if (edinicyIzmerenija != null) {
					cacheResult(edinicyIzmerenija);
				}
				else {
					entityCache.putResult(EdinicyIzmerenijaModelImpl.ENTITY_CACHE_ENABLED,
						EdinicyIzmerenijaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(EdinicyIzmerenijaModelImpl.ENTITY_CACHE_ENABLED,
					EdinicyIzmerenijaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return edinicyIzmerenija;
	}

	/**
	 * Returns the edinicy izmerenija with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param edinicy_izmerenija_id the primary key of the edinicy izmerenija
	 * @return the edinicy izmerenija, or <code>null</code> if a edinicy izmerenija with the primary key could not be found
	 */
	@Override
	public EdinicyIzmerenija fetchByPrimaryKey(long edinicy_izmerenija_id) {
		return fetchByPrimaryKey((Serializable)edinicy_izmerenija_id);
	}

	@Override
	public Map<Serializable, EdinicyIzmerenija> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, EdinicyIzmerenija> map = new HashMap<Serializable, EdinicyIzmerenija>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			EdinicyIzmerenija edinicyIzmerenija = fetchByPrimaryKey(primaryKey);

			if (edinicyIzmerenija != null) {
				map.put(primaryKey, edinicyIzmerenija);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(EdinicyIzmerenijaModelImpl.ENTITY_CACHE_ENABLED,
					EdinicyIzmerenijaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (EdinicyIzmerenija)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_EDINICYIZMERENIJA_WHERE_PKS_IN);

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

			for (EdinicyIzmerenija edinicyIzmerenija : (List<EdinicyIzmerenija>)q.list()) {
				map.put(edinicyIzmerenija.getPrimaryKeyObj(), edinicyIzmerenija);

				cacheResult(edinicyIzmerenija);

				uncachedPrimaryKeys.remove(edinicyIzmerenija.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(EdinicyIzmerenijaModelImpl.ENTITY_CACHE_ENABLED,
					EdinicyIzmerenijaImpl.class, primaryKey, nullModel);
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
	 * Returns all the edinicy izmerenijas.
	 *
	 * @return the edinicy izmerenijas
	 */
	@Override
	public List<EdinicyIzmerenija> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edinicy izmerenijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EdinicyIzmerenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of edinicy izmerenijas
	 * @param end the upper bound of the range of edinicy izmerenijas (not inclusive)
	 * @return the range of edinicy izmerenijas
	 */
	@Override
	public List<EdinicyIzmerenija> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the edinicy izmerenijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EdinicyIzmerenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of edinicy izmerenijas
	 * @param end the upper bound of the range of edinicy izmerenijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of edinicy izmerenijas
	 */
	@Override
	public List<EdinicyIzmerenija> findAll(int start, int end,
		OrderByComparator<EdinicyIzmerenija> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edinicy izmerenijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EdinicyIzmerenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of edinicy izmerenijas
	 * @param end the upper bound of the range of edinicy izmerenijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of edinicy izmerenijas
	 */
	@Override
	public List<EdinicyIzmerenija> findAll(int start, int end,
		OrderByComparator<EdinicyIzmerenija> orderByComparator,
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

		List<EdinicyIzmerenija> list = null;

		if (retrieveFromCache) {
			list = (List<EdinicyIzmerenija>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_EDINICYIZMERENIJA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EDINICYIZMERENIJA;

				if (pagination) {
					sql = sql.concat(EdinicyIzmerenijaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EdinicyIzmerenija>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<EdinicyIzmerenija>)QueryUtil.list(q,
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
	 * Removes all the edinicy izmerenijas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (EdinicyIzmerenija edinicyIzmerenija : findAll()) {
			remove(edinicyIzmerenija);
		}
	}

	/**
	 * Returns the number of edinicy izmerenijas.
	 *
	 * @return the number of edinicy izmerenijas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EDINICYIZMERENIJA);

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
		return EdinicyIzmerenijaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the edinicy izmerenija persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(EdinicyIzmerenijaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_EDINICYIZMERENIJA = "SELECT edinicyIzmerenija FROM EdinicyIzmerenija edinicyIzmerenija";
	private static final String _SQL_SELECT_EDINICYIZMERENIJA_WHERE_PKS_IN = "SELECT edinicyIzmerenija FROM EdinicyIzmerenija edinicyIzmerenija WHERE edinicy_izmerenija_id IN (";
	private static final String _SQL_COUNT_EDINICYIZMERENIJA = "SELECT COUNT(edinicyIzmerenija) FROM EdinicyIzmerenija edinicyIzmerenija";
	private static final String _ORDER_BY_ENTITY_ALIAS = "edinicyIzmerenija.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EdinicyIzmerenija exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(EdinicyIzmerenijaPersistenceImpl.class);
}