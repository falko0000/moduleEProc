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

package tj.istochnik.finansirovanija.service.persistence.impl;

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

import tj.istochnik.finansirovanija.exception.NoSuchIstochnikFinansirovanijaException;
import tj.istochnik.finansirovanija.model.IstochnikFinansirovanija;
import tj.istochnik.finansirovanija.model.impl.IstochnikFinansirovanijaImpl;
import tj.istochnik.finansirovanija.model.impl.IstochnikFinansirovanijaModelImpl;
import tj.istochnik.finansirovanija.service.persistence.IstochnikFinansirovanijaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the istochnik finansirovanija service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IstochnikFinansirovanijaPersistence
 * @see tj.istochnik.finansirovanija.service.persistence.IstochnikFinansirovanijaUtil
 * @generated
 */
@ProviderType
public class IstochnikFinansirovanijaPersistenceImpl extends BasePersistenceImpl<IstochnikFinansirovanija>
	implements IstochnikFinansirovanijaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link IstochnikFinansirovanijaUtil} to access the istochnik finansirovanija persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = IstochnikFinansirovanijaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(IstochnikFinansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
			IstochnikFinansirovanijaModelImpl.FINDER_CACHE_ENABLED,
			IstochnikFinansirovanijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(IstochnikFinansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
			IstochnikFinansirovanijaModelImpl.FINDER_CACHE_ENABLED,
			IstochnikFinansirovanijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(IstochnikFinansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
			IstochnikFinansirovanijaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public IstochnikFinansirovanijaPersistenceImpl() {
		setModelClass(IstochnikFinansirovanija.class);
	}

	/**
	 * Caches the istochnik finansirovanija in the entity cache if it is enabled.
	 *
	 * @param istochnikFinansirovanija the istochnik finansirovanija
	 */
	@Override
	public void cacheResult(IstochnikFinansirovanija istochnikFinansirovanija) {
		entityCache.putResult(IstochnikFinansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
			IstochnikFinansirovanijaImpl.class,
			istochnikFinansirovanija.getPrimaryKey(), istochnikFinansirovanija);

		istochnikFinansirovanija.resetOriginalValues();
	}

	/**
	 * Caches the istochnik finansirovanijas in the entity cache if it is enabled.
	 *
	 * @param istochnikFinansirovanijas the istochnik finansirovanijas
	 */
	@Override
	public void cacheResult(
		List<IstochnikFinansirovanija> istochnikFinansirovanijas) {
		for (IstochnikFinansirovanija istochnikFinansirovanija : istochnikFinansirovanijas) {
			if (entityCache.getResult(
						IstochnikFinansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
						IstochnikFinansirovanijaImpl.class,
						istochnikFinansirovanija.getPrimaryKey()) == null) {
				cacheResult(istochnikFinansirovanija);
			}
			else {
				istochnikFinansirovanija.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all istochnik finansirovanijas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(IstochnikFinansirovanijaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the istochnik finansirovanija.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(IstochnikFinansirovanija istochnikFinansirovanija) {
		entityCache.removeResult(IstochnikFinansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
			IstochnikFinansirovanijaImpl.class,
			istochnikFinansirovanija.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<IstochnikFinansirovanija> istochnikFinansirovanijas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (IstochnikFinansirovanija istochnikFinansirovanija : istochnikFinansirovanijas) {
			entityCache.removeResult(IstochnikFinansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
				IstochnikFinansirovanijaImpl.class,
				istochnikFinansirovanija.getPrimaryKey());
		}
	}

	/**
	 * Creates a new istochnik finansirovanija with the primary key. Does not add the istochnik finansirovanija to the database.
	 *
	 * @param istochnik_finansirovanija_id the primary key for the new istochnik finansirovanija
	 * @return the new istochnik finansirovanija
	 */
	@Override
	public IstochnikFinansirovanija create(long istochnik_finansirovanija_id) {
		IstochnikFinansirovanija istochnikFinansirovanija = new IstochnikFinansirovanijaImpl();

		istochnikFinansirovanija.setNew(true);
		istochnikFinansirovanija.setPrimaryKey(istochnik_finansirovanija_id);

		return istochnikFinansirovanija;
	}

	/**
	 * Removes the istochnik finansirovanija with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param istochnik_finansirovanija_id the primary key of the istochnik finansirovanija
	 * @return the istochnik finansirovanija that was removed
	 * @throws NoSuchIstochnikFinansirovanijaException if a istochnik finansirovanija with the primary key could not be found
	 */
	@Override
	public IstochnikFinansirovanija remove(long istochnik_finansirovanija_id)
		throws NoSuchIstochnikFinansirovanijaException {
		return remove((Serializable)istochnik_finansirovanija_id);
	}

	/**
	 * Removes the istochnik finansirovanija with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the istochnik finansirovanija
	 * @return the istochnik finansirovanija that was removed
	 * @throws NoSuchIstochnikFinansirovanijaException if a istochnik finansirovanija with the primary key could not be found
	 */
	@Override
	public IstochnikFinansirovanija remove(Serializable primaryKey)
		throws NoSuchIstochnikFinansirovanijaException {
		Session session = null;

		try {
			session = openSession();

			IstochnikFinansirovanija istochnikFinansirovanija = (IstochnikFinansirovanija)session.get(IstochnikFinansirovanijaImpl.class,
					primaryKey);

			if (istochnikFinansirovanija == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchIstochnikFinansirovanijaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(istochnikFinansirovanija);
		}
		catch (NoSuchIstochnikFinansirovanijaException nsee) {
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
	protected IstochnikFinansirovanija removeImpl(
		IstochnikFinansirovanija istochnikFinansirovanija) {
		istochnikFinansirovanija = toUnwrappedModel(istochnikFinansirovanija);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(istochnikFinansirovanija)) {
				istochnikFinansirovanija = (IstochnikFinansirovanija)session.get(IstochnikFinansirovanijaImpl.class,
						istochnikFinansirovanija.getPrimaryKeyObj());
			}

			if (istochnikFinansirovanija != null) {
				session.delete(istochnikFinansirovanija);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (istochnikFinansirovanija != null) {
			clearCache(istochnikFinansirovanija);
		}

		return istochnikFinansirovanija;
	}

	@Override
	public IstochnikFinansirovanija updateImpl(
		IstochnikFinansirovanija istochnikFinansirovanija) {
		istochnikFinansirovanija = toUnwrappedModel(istochnikFinansirovanija);

		boolean isNew = istochnikFinansirovanija.isNew();

		Session session = null;

		try {
			session = openSession();

			if (istochnikFinansirovanija.isNew()) {
				session.save(istochnikFinansirovanija);

				istochnikFinansirovanija.setNew(false);
			}
			else {
				istochnikFinansirovanija = (IstochnikFinansirovanija)session.merge(istochnikFinansirovanija);
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

		entityCache.putResult(IstochnikFinansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
			IstochnikFinansirovanijaImpl.class,
			istochnikFinansirovanija.getPrimaryKey(), istochnikFinansirovanija,
			false);

		istochnikFinansirovanija.resetOriginalValues();

		return istochnikFinansirovanija;
	}

	protected IstochnikFinansirovanija toUnwrappedModel(
		IstochnikFinansirovanija istochnikFinansirovanija) {
		if (istochnikFinansirovanija instanceof IstochnikFinansirovanijaImpl) {
			return istochnikFinansirovanija;
		}

		IstochnikFinansirovanijaImpl istochnikFinansirovanijaImpl = new IstochnikFinansirovanijaImpl();

		istochnikFinansirovanijaImpl.setNew(istochnikFinansirovanija.isNew());
		istochnikFinansirovanijaImpl.setPrimaryKey(istochnikFinansirovanija.getPrimaryKey());

		istochnikFinansirovanijaImpl.setIstochnik_finansirovanija_id(istochnikFinansirovanija.getIstochnik_finansirovanija_id());
		istochnikFinansirovanijaImpl.setNaimenovanie(istochnikFinansirovanija.getNaimenovanie());

		return istochnikFinansirovanijaImpl;
	}

	/**
	 * Returns the istochnik finansirovanija with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the istochnik finansirovanija
	 * @return the istochnik finansirovanija
	 * @throws NoSuchIstochnikFinansirovanijaException if a istochnik finansirovanija with the primary key could not be found
	 */
	@Override
	public IstochnikFinansirovanija findByPrimaryKey(Serializable primaryKey)
		throws NoSuchIstochnikFinansirovanijaException {
		IstochnikFinansirovanija istochnikFinansirovanija = fetchByPrimaryKey(primaryKey);

		if (istochnikFinansirovanija == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchIstochnikFinansirovanijaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return istochnikFinansirovanija;
	}

	/**
	 * Returns the istochnik finansirovanija with the primary key or throws a {@link NoSuchIstochnikFinansirovanijaException} if it could not be found.
	 *
	 * @param istochnik_finansirovanija_id the primary key of the istochnik finansirovanija
	 * @return the istochnik finansirovanija
	 * @throws NoSuchIstochnikFinansirovanijaException if a istochnik finansirovanija with the primary key could not be found
	 */
	@Override
	public IstochnikFinansirovanija findByPrimaryKey(
		long istochnik_finansirovanija_id)
		throws NoSuchIstochnikFinansirovanijaException {
		return findByPrimaryKey((Serializable)istochnik_finansirovanija_id);
	}

	/**
	 * Returns the istochnik finansirovanija with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the istochnik finansirovanija
	 * @return the istochnik finansirovanija, or <code>null</code> if a istochnik finansirovanija with the primary key could not be found
	 */
	@Override
	public IstochnikFinansirovanija fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(IstochnikFinansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
				IstochnikFinansirovanijaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		IstochnikFinansirovanija istochnikFinansirovanija = (IstochnikFinansirovanija)serializable;

		if (istochnikFinansirovanija == null) {
			Session session = null;

			try {
				session = openSession();

				istochnikFinansirovanija = (IstochnikFinansirovanija)session.get(IstochnikFinansirovanijaImpl.class,
						primaryKey);

				if (istochnikFinansirovanija != null) {
					cacheResult(istochnikFinansirovanija);
				}
				else {
					entityCache.putResult(IstochnikFinansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
						IstochnikFinansirovanijaImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(IstochnikFinansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
					IstochnikFinansirovanijaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return istochnikFinansirovanija;
	}

	/**
	 * Returns the istochnik finansirovanija with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param istochnik_finansirovanija_id the primary key of the istochnik finansirovanija
	 * @return the istochnik finansirovanija, or <code>null</code> if a istochnik finansirovanija with the primary key could not be found
	 */
	@Override
	public IstochnikFinansirovanija fetchByPrimaryKey(
		long istochnik_finansirovanija_id) {
		return fetchByPrimaryKey((Serializable)istochnik_finansirovanija_id);
	}

	@Override
	public Map<Serializable, IstochnikFinansirovanija> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, IstochnikFinansirovanija> map = new HashMap<Serializable, IstochnikFinansirovanija>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			IstochnikFinansirovanija istochnikFinansirovanija = fetchByPrimaryKey(primaryKey);

			if (istochnikFinansirovanija != null) {
				map.put(primaryKey, istochnikFinansirovanija);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(IstochnikFinansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
					IstochnikFinansirovanijaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (IstochnikFinansirovanija)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ISTOCHNIKFINANSIROVANIJA_WHERE_PKS_IN);

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

			for (IstochnikFinansirovanija istochnikFinansirovanija : (List<IstochnikFinansirovanija>)q.list()) {
				map.put(istochnikFinansirovanija.getPrimaryKeyObj(),
					istochnikFinansirovanija);

				cacheResult(istochnikFinansirovanija);

				uncachedPrimaryKeys.remove(istochnikFinansirovanija.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(IstochnikFinansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
					IstochnikFinansirovanijaImpl.class, primaryKey, nullModel);
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
	 * Returns all the istochnik finansirovanijas.
	 *
	 * @return the istochnik finansirovanijas
	 */
	@Override
	public List<IstochnikFinansirovanija> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the istochnik finansirovanijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IstochnikFinansirovanijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of istochnik finansirovanijas
	 * @param end the upper bound of the range of istochnik finansirovanijas (not inclusive)
	 * @return the range of istochnik finansirovanijas
	 */
	@Override
	public List<IstochnikFinansirovanija> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the istochnik finansirovanijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IstochnikFinansirovanijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of istochnik finansirovanijas
	 * @param end the upper bound of the range of istochnik finansirovanijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of istochnik finansirovanijas
	 */
	@Override
	public List<IstochnikFinansirovanija> findAll(int start, int end,
		OrderByComparator<IstochnikFinansirovanija> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the istochnik finansirovanijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IstochnikFinansirovanijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of istochnik finansirovanijas
	 * @param end the upper bound of the range of istochnik finansirovanijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of istochnik finansirovanijas
	 */
	@Override
	public List<IstochnikFinansirovanija> findAll(int start, int end,
		OrderByComparator<IstochnikFinansirovanija> orderByComparator,
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

		List<IstochnikFinansirovanija> list = null;

		if (retrieveFromCache) {
			list = (List<IstochnikFinansirovanija>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ISTOCHNIKFINANSIROVANIJA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ISTOCHNIKFINANSIROVANIJA;

				if (pagination) {
					sql = sql.concat(IstochnikFinansirovanijaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<IstochnikFinansirovanija>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<IstochnikFinansirovanija>)QueryUtil.list(q,
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
	 * Removes all the istochnik finansirovanijas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (IstochnikFinansirovanija istochnikFinansirovanija : findAll()) {
			remove(istochnikFinansirovanija);
		}
	}

	/**
	 * Returns the number of istochnik finansirovanijas.
	 *
	 * @return the number of istochnik finansirovanijas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ISTOCHNIKFINANSIROVANIJA);

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
		return IstochnikFinansirovanijaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the istochnik finansirovanija persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(IstochnikFinansirovanijaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ISTOCHNIKFINANSIROVANIJA = "SELECT istochnikFinansirovanija FROM IstochnikFinansirovanija istochnikFinansirovanija";
	private static final String _SQL_SELECT_ISTOCHNIKFINANSIROVANIJA_WHERE_PKS_IN =
		"SELECT istochnikFinansirovanija FROM IstochnikFinansirovanija istochnikFinansirovanija WHERE istochnik_finansirovanija_id IN (";
	private static final String _SQL_COUNT_ISTOCHNIKFINANSIROVANIJA = "SELECT COUNT(istochnikFinansirovanija) FROM IstochnikFinansirovanija istochnikFinansirovanija";
	private static final String _ORDER_BY_ENTITY_ALIAS = "istochnikFinansirovanija.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No IstochnikFinansirovanija exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(IstochnikFinansirovanijaPersistenceImpl.class);
}