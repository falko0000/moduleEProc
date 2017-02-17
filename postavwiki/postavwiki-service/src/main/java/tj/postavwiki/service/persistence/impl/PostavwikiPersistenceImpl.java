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

package tj.postavwiki.service.persistence.impl;

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

import tj.postavwiki.exception.NoSuchPostavwikiException;

import tj.postavwiki.model.Postavwiki;
import tj.postavwiki.model.impl.PostavwikiImpl;
import tj.postavwiki.model.impl.PostavwikiModelImpl;

import tj.postavwiki.service.persistence.PostavwikiPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the postavwiki service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PostavwikiPersistence
 * @see tj.postavwiki.service.persistence.PostavwikiUtil
 * @generated
 */
@ProviderType
public class PostavwikiPersistenceImpl extends BasePersistenceImpl<Postavwiki>
	implements PostavwikiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PostavwikiUtil} to access the postavwiki persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PostavwikiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PostavwikiModelImpl.ENTITY_CACHE_ENABLED,
			PostavwikiModelImpl.FINDER_CACHE_ENABLED, PostavwikiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PostavwikiModelImpl.ENTITY_CACHE_ENABLED,
			PostavwikiModelImpl.FINDER_CACHE_ENABLED, PostavwikiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PostavwikiModelImpl.ENTITY_CACHE_ENABLED,
			PostavwikiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PostavwikiPersistenceImpl() {
		setModelClass(Postavwiki.class);
	}

	/**
	 * Caches the postavwiki in the entity cache if it is enabled.
	 *
	 * @param postavwiki the postavwiki
	 */
	@Override
	public void cacheResult(Postavwiki postavwiki) {
		entityCache.putResult(PostavwikiModelImpl.ENTITY_CACHE_ENABLED,
			PostavwikiImpl.class, postavwiki.getPrimaryKey(), postavwiki);

		postavwiki.resetOriginalValues();
	}

	/**
	 * Caches the postavwikis in the entity cache if it is enabled.
	 *
	 * @param postavwikis the postavwikis
	 */
	@Override
	public void cacheResult(List<Postavwiki> postavwikis) {
		for (Postavwiki postavwiki : postavwikis) {
			if (entityCache.getResult(
						PostavwikiModelImpl.ENTITY_CACHE_ENABLED,
						PostavwikiImpl.class, postavwiki.getPrimaryKey()) == null) {
				cacheResult(postavwiki);
			}
			else {
				postavwiki.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all postavwikis.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PostavwikiImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the postavwiki.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Postavwiki postavwiki) {
		entityCache.removeResult(PostavwikiModelImpl.ENTITY_CACHE_ENABLED,
			PostavwikiImpl.class, postavwiki.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Postavwiki> postavwikis) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Postavwiki postavwiki : postavwikis) {
			entityCache.removeResult(PostavwikiModelImpl.ENTITY_CACHE_ENABLED,
				PostavwikiImpl.class, postavwiki.getPrimaryKey());
		}
	}

	/**
	 * Creates a new postavwiki with the primary key. Does not add the postavwiki to the database.
	 *
	 * @param postavwiki_id the primary key for the new postavwiki
	 * @return the new postavwiki
	 */
	@Override
	public Postavwiki create(long postavwiki_id) {
		Postavwiki postavwiki = new PostavwikiImpl();

		postavwiki.setNew(true);
		postavwiki.setPrimaryKey(postavwiki_id);

		return postavwiki;
	}

	/**
	 * Removes the postavwiki with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param postavwiki_id the primary key of the postavwiki
	 * @return the postavwiki that was removed
	 * @throws NoSuchPostavwikiException if a postavwiki with the primary key could not be found
	 */
	@Override
	public Postavwiki remove(long postavwiki_id)
		throws NoSuchPostavwikiException {
		return remove((Serializable)postavwiki_id);
	}

	/**
	 * Removes the postavwiki with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the postavwiki
	 * @return the postavwiki that was removed
	 * @throws NoSuchPostavwikiException if a postavwiki with the primary key could not be found
	 */
	@Override
	public Postavwiki remove(Serializable primaryKey)
		throws NoSuchPostavwikiException {
		Session session = null;

		try {
			session = openSession();

			Postavwiki postavwiki = (Postavwiki)session.get(PostavwikiImpl.class,
					primaryKey);

			if (postavwiki == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPostavwikiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(postavwiki);
		}
		catch (NoSuchPostavwikiException nsee) {
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
	protected Postavwiki removeImpl(Postavwiki postavwiki) {
		postavwiki = toUnwrappedModel(postavwiki);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(postavwiki)) {
				postavwiki = (Postavwiki)session.get(PostavwikiImpl.class,
						postavwiki.getPrimaryKeyObj());
			}

			if (postavwiki != null) {
				session.delete(postavwiki);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (postavwiki != null) {
			clearCache(postavwiki);
		}

		return postavwiki;
	}

	@Override
	public Postavwiki updateImpl(Postavwiki postavwiki) {
		postavwiki = toUnwrappedModel(postavwiki);

		boolean isNew = postavwiki.isNew();

		Session session = null;

		try {
			session = openSession();

			if (postavwiki.isNew()) {
				session.save(postavwiki);

				postavwiki.setNew(false);
			}
			else {
				postavwiki = (Postavwiki)session.merge(postavwiki);
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

		entityCache.putResult(PostavwikiModelImpl.ENTITY_CACHE_ENABLED,
			PostavwikiImpl.class, postavwiki.getPrimaryKey(), postavwiki, false);

		postavwiki.resetOriginalValues();

		return postavwiki;
	}

	protected Postavwiki toUnwrappedModel(Postavwiki postavwiki) {
		if (postavwiki instanceof PostavwikiImpl) {
			return postavwiki;
		}

		PostavwikiImpl postavwikiImpl = new PostavwikiImpl();

		postavwikiImpl.setNew(postavwiki.isNew());
		postavwikiImpl.setPrimaryKey(postavwiki.getPrimaryKey());

		postavwikiImpl.setAdres(postavwiki.getAdres());
		postavwikiImpl.setData_gosudarstvennoj_registracii(postavwiki.getData_gosudarstvennoj_registracii());
		postavwikiImpl.setData_izmenenija(postavwiki.getData_izmenenija());
		postavwikiImpl.setData_sozdanija(postavwiki.getData_sozdanija());
		postavwikiImpl.setEin(postavwiki.getEin());
		postavwikiImpl.setGorod(postavwiki.getGorod());
		postavwikiImpl.setInn(postavwiki.getInn());
		postavwikiImpl.setIzmenil(postavwiki.getIzmenil());
		postavwikiImpl.setKratkoe_naimenovanie(postavwiki.getKratkoe_naimenovanie());
		postavwikiImpl.setMesto_registracii(postavwiki.getMesto_registracii());
		postavwikiImpl.setOblast_id(postavwiki.getOblast_id());
		postavwikiImpl.setPolnoe_naimenovanie(postavwiki.getPolnoe_naimenovanie());
		postavwikiImpl.setPostavwiki_id(postavwiki.getPostavwiki_id());
		postavwikiImpl.setRajon_id(postavwiki.getRajon_id());
		postavwikiImpl.setSin(postavwiki.getSin());
		postavwikiImpl.setSozdal(postavwiki.getSozdal());

		return postavwikiImpl;
	}

	/**
	 * Returns the postavwiki with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the postavwiki
	 * @return the postavwiki
	 * @throws NoSuchPostavwikiException if a postavwiki with the primary key could not be found
	 */
	@Override
	public Postavwiki findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPostavwikiException {
		Postavwiki postavwiki = fetchByPrimaryKey(primaryKey);

		if (postavwiki == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPostavwikiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return postavwiki;
	}

	/**
	 * Returns the postavwiki with the primary key or throws a {@link NoSuchPostavwikiException} if it could not be found.
	 *
	 * @param postavwiki_id the primary key of the postavwiki
	 * @return the postavwiki
	 * @throws NoSuchPostavwikiException if a postavwiki with the primary key could not be found
	 */
	@Override
	public Postavwiki findByPrimaryKey(long postavwiki_id)
		throws NoSuchPostavwikiException {
		return findByPrimaryKey((Serializable)postavwiki_id);
	}

	/**
	 * Returns the postavwiki with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the postavwiki
	 * @return the postavwiki, or <code>null</code> if a postavwiki with the primary key could not be found
	 */
	@Override
	public Postavwiki fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(PostavwikiModelImpl.ENTITY_CACHE_ENABLED,
				PostavwikiImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Postavwiki postavwiki = (Postavwiki)serializable;

		if (postavwiki == null) {
			Session session = null;

			try {
				session = openSession();

				postavwiki = (Postavwiki)session.get(PostavwikiImpl.class,
						primaryKey);

				if (postavwiki != null) {
					cacheResult(postavwiki);
				}
				else {
					entityCache.putResult(PostavwikiModelImpl.ENTITY_CACHE_ENABLED,
						PostavwikiImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(PostavwikiModelImpl.ENTITY_CACHE_ENABLED,
					PostavwikiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return postavwiki;
	}

	/**
	 * Returns the postavwiki with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param postavwiki_id the primary key of the postavwiki
	 * @return the postavwiki, or <code>null</code> if a postavwiki with the primary key could not be found
	 */
	@Override
	public Postavwiki fetchByPrimaryKey(long postavwiki_id) {
		return fetchByPrimaryKey((Serializable)postavwiki_id);
	}

	@Override
	public Map<Serializable, Postavwiki> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Postavwiki> map = new HashMap<Serializable, Postavwiki>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Postavwiki postavwiki = fetchByPrimaryKey(primaryKey);

			if (postavwiki != null) {
				map.put(primaryKey, postavwiki);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(PostavwikiModelImpl.ENTITY_CACHE_ENABLED,
					PostavwikiImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Postavwiki)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_POSTAVWIKI_WHERE_PKS_IN);

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

			for (Postavwiki postavwiki : (List<Postavwiki>)q.list()) {
				map.put(postavwiki.getPrimaryKeyObj(), postavwiki);

				cacheResult(postavwiki);

				uncachedPrimaryKeys.remove(postavwiki.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(PostavwikiModelImpl.ENTITY_CACHE_ENABLED,
					PostavwikiImpl.class, primaryKey, nullModel);
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
	 * Returns all the postavwikis.
	 *
	 * @return the postavwikis
	 */
	@Override
	public List<Postavwiki> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the postavwikis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PostavwikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of postavwikis
	 * @param end the upper bound of the range of postavwikis (not inclusive)
	 * @return the range of postavwikis
	 */
	@Override
	public List<Postavwiki> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the postavwikis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PostavwikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of postavwikis
	 * @param end the upper bound of the range of postavwikis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of postavwikis
	 */
	@Override
	public List<Postavwiki> findAll(int start, int end,
		OrderByComparator<Postavwiki> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the postavwikis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PostavwikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of postavwikis
	 * @param end the upper bound of the range of postavwikis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of postavwikis
	 */
	@Override
	public List<Postavwiki> findAll(int start, int end,
		OrderByComparator<Postavwiki> orderByComparator,
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

		List<Postavwiki> list = null;

		if (retrieveFromCache) {
			list = (List<Postavwiki>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_POSTAVWIKI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_POSTAVWIKI;

				if (pagination) {
					sql = sql.concat(PostavwikiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Postavwiki>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Postavwiki>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the postavwikis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Postavwiki postavwiki : findAll()) {
			remove(postavwiki);
		}
	}

	/**
	 * Returns the number of postavwikis.
	 *
	 * @return the number of postavwikis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_POSTAVWIKI);

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
		return PostavwikiModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the postavwiki persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(PostavwikiImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_POSTAVWIKI = "SELECT postavwiki FROM Postavwiki postavwiki";
	private static final String _SQL_SELECT_POSTAVWIKI_WHERE_PKS_IN = "SELECT postavwiki FROM Postavwiki postavwiki WHERE postavwiki_id IN (";
	private static final String _SQL_COUNT_POSTAVWIKI = "SELECT COUNT(postavwiki) FROM Postavwiki postavwiki";
	private static final String _ORDER_BY_ENTITY_ALIAS = "postavwiki.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Postavwiki exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(PostavwikiPersistenceImpl.class);
}