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
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import tj.izvewenija.exception.NoSuchIzvewenijaException;

import tj.izvewenija.model.Izvewenija;
import tj.izvewenija.model.impl.IzvewenijaImpl;
import tj.izvewenija.model.impl.IzvewenijaModelImpl;

import tj.izvewenija.service.persistence.IzvewenijaPersistence;

import java.io.Serializable;

import java.util.Collections;
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
	}

	@Override
	public void clearCache(List<Izvewenija> izvewenijas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Izvewenija izvewenija : izvewenijas) {
			entityCache.removeResult(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
				IzvewenijaImpl.class, izvewenija.getPrimaryKey());
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

		if (isNew) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			IzvewenijaImpl.class, izvewenija.getPrimaryKey(), izvewenija, false);

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

		izvewenijaImpl.setData_izmenenija(izvewenija.getData_izmenenija());
		izvewenijaImpl.setData_sozdanija(izvewenija.getData_sozdanija());
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

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_IZVEWENIJA = "SELECT izvewenija FROM Izvewenija izvewenija";
	private static final String _SQL_SELECT_IZVEWENIJA_WHERE_PKS_IN = "SELECT izvewenija FROM Izvewenija izvewenija WHERE izvewenija_id IN (";
	private static final String _SQL_COUNT_IZVEWENIJA = "SELECT COUNT(izvewenija) FROM Izvewenija izvewenija";
	private static final String _ORDER_BY_ENTITY_ALIAS = "izvewenija.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Izvewenija exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(IzvewenijaPersistenceImpl.class);
}