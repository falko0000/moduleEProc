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

package tj.strany.service.persistence.impl;

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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import tj.strany.exception.NoSuchStranyException;

import tj.strany.model.Strany;
import tj.strany.model.impl.StranyImpl;
import tj.strany.model.impl.StranyModelImpl;

import tj.strany.service.persistence.StranyPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the strany service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StranyPersistence
 * @see tj.strany.service.persistence.StranyUtil
 * @generated
 */
@ProviderType
public class StranyPersistenceImpl extends BasePersistenceImpl<Strany>
	implements StranyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link StranyUtil} to access the strany persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = StranyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StranyModelImpl.ENTITY_CACHE_ENABLED,
			StranyModelImpl.FINDER_CACHE_ENABLED, StranyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StranyModelImpl.ENTITY_CACHE_ENABLED,
			StranyModelImpl.FINDER_CACHE_ENABLED, StranyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StranyModelImpl.ENTITY_CACHE_ENABLED,
			StranyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public StranyPersistenceImpl() {
		setModelClass(Strany.class);
	}

	/**
	 * Caches the strany in the entity cache if it is enabled.
	 *
	 * @param strany the strany
	 */
	@Override
	public void cacheResult(Strany strany) {
		entityCache.putResult(StranyModelImpl.ENTITY_CACHE_ENABLED,
			StranyImpl.class, strany.getPrimaryKey(), strany);

		strany.resetOriginalValues();
	}

	/**
	 * Caches the stranies in the entity cache if it is enabled.
	 *
	 * @param stranies the stranies
	 */
	@Override
	public void cacheResult(List<Strany> stranies) {
		for (Strany strany : stranies) {
			if (entityCache.getResult(StranyModelImpl.ENTITY_CACHE_ENABLED,
						StranyImpl.class, strany.getPrimaryKey()) == null) {
				cacheResult(strany);
			}
			else {
				strany.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all stranies.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(StranyImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the strany.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Strany strany) {
		entityCache.removeResult(StranyModelImpl.ENTITY_CACHE_ENABLED,
			StranyImpl.class, strany.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Strany> stranies) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Strany strany : stranies) {
			entityCache.removeResult(StranyModelImpl.ENTITY_CACHE_ENABLED,
				StranyImpl.class, strany.getPrimaryKey());
		}
	}

	/**
	 * Creates a new strany with the primary key. Does not add the strany to the database.
	 *
	 * @param strany_id the primary key for the new strany
	 * @return the new strany
	 */
	@Override
	public Strany create(long strany_id) {
		Strany strany = new StranyImpl();

		strany.setNew(true);
		strany.setPrimaryKey(strany_id);

		return strany;
	}

	/**
	 * Removes the strany with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param strany_id the primary key of the strany
	 * @return the strany that was removed
	 * @throws NoSuchStranyException if a strany with the primary key could not be found
	 */
	@Override
	public Strany remove(long strany_id) throws NoSuchStranyException {
		return remove((Serializable)strany_id);
	}

	/**
	 * Removes the strany with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the strany
	 * @return the strany that was removed
	 * @throws NoSuchStranyException if a strany with the primary key could not be found
	 */
	@Override
	public Strany remove(Serializable primaryKey) throws NoSuchStranyException {
		Session session = null;

		try {
			session = openSession();

			Strany strany = (Strany)session.get(StranyImpl.class, primaryKey);

			if (strany == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStranyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(strany);
		}
		catch (NoSuchStranyException nsee) {
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
	protected Strany removeImpl(Strany strany) {
		strany = toUnwrappedModel(strany);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(strany)) {
				strany = (Strany)session.get(StranyImpl.class,
						strany.getPrimaryKeyObj());
			}

			if (strany != null) {
				session.delete(strany);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (strany != null) {
			clearCache(strany);
		}

		return strany;
	}

	@Override
	public Strany updateImpl(Strany strany) {
		strany = toUnwrappedModel(strany);

		boolean isNew = strany.isNew();

		Session session = null;

		try {
			session = openSession();

			if (strany.isNew()) {
				session.save(strany);

				strany.setNew(false);
			}
			else {
				strany = (Strany)session.merge(strany);
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

		entityCache.putResult(StranyModelImpl.ENTITY_CACHE_ENABLED,
			StranyImpl.class, strany.getPrimaryKey(), strany, false);

		strany.resetOriginalValues();

		return strany;
	}

	protected Strany toUnwrappedModel(Strany strany) {
		if (strany instanceof StranyImpl) {
			return strany;
		}

		StranyImpl stranyImpl = new StranyImpl();

		stranyImpl.setNew(strany.isNew());
		stranyImpl.setPrimaryKey(strany.getPrimaryKey());

		stranyImpl.setNazvanie(strany.getNazvanie());
		stranyImpl.setNazvanie_tj(strany.getNazvanie_tj());
		stranyImpl.setStrany_id(strany.getStrany_id());
		stranyImpl.setKey(strany.getKey());

		return stranyImpl;
	}

	/**
	 * Returns the strany with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the strany
	 * @return the strany
	 * @throws NoSuchStranyException if a strany with the primary key could not be found
	 */
	@Override
	public Strany findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStranyException {
		Strany strany = fetchByPrimaryKey(primaryKey);

		if (strany == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStranyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return strany;
	}

	/**
	 * Returns the strany with the primary key or throws a {@link NoSuchStranyException} if it could not be found.
	 *
	 * @param strany_id the primary key of the strany
	 * @return the strany
	 * @throws NoSuchStranyException if a strany with the primary key could not be found
	 */
	@Override
	public Strany findByPrimaryKey(long strany_id) throws NoSuchStranyException {
		return findByPrimaryKey((Serializable)strany_id);
	}

	/**
	 * Returns the strany with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the strany
	 * @return the strany, or <code>null</code> if a strany with the primary key could not be found
	 */
	@Override
	public Strany fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(StranyModelImpl.ENTITY_CACHE_ENABLED,
				StranyImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Strany strany = (Strany)serializable;

		if (strany == null) {
			Session session = null;

			try {
				session = openSession();

				strany = (Strany)session.get(StranyImpl.class, primaryKey);

				if (strany != null) {
					cacheResult(strany);
				}
				else {
					entityCache.putResult(StranyModelImpl.ENTITY_CACHE_ENABLED,
						StranyImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(StranyModelImpl.ENTITY_CACHE_ENABLED,
					StranyImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return strany;
	}

	/**
	 * Returns the strany with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param strany_id the primary key of the strany
	 * @return the strany, or <code>null</code> if a strany with the primary key could not be found
	 */
	@Override
	public Strany fetchByPrimaryKey(long strany_id) {
		return fetchByPrimaryKey((Serializable)strany_id);
	}

	@Override
	public Map<Serializable, Strany> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Strany> map = new HashMap<Serializable, Strany>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Strany strany = fetchByPrimaryKey(primaryKey);

			if (strany != null) {
				map.put(primaryKey, strany);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(StranyModelImpl.ENTITY_CACHE_ENABLED,
					StranyImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Strany)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_STRANY_WHERE_PKS_IN);

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

			for (Strany strany : (List<Strany>)q.list()) {
				map.put(strany.getPrimaryKeyObj(), strany);

				cacheResult(strany);

				uncachedPrimaryKeys.remove(strany.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(StranyModelImpl.ENTITY_CACHE_ENABLED,
					StranyImpl.class, primaryKey, nullModel);
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
	 * Returns all the stranies.
	 *
	 * @return the stranies
	 */
	@Override
	public List<Strany> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the stranies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StranyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of stranies
	 * @param end the upper bound of the range of stranies (not inclusive)
	 * @return the range of stranies
	 */
	@Override
	public List<Strany> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the stranies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StranyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of stranies
	 * @param end the upper bound of the range of stranies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of stranies
	 */
	@Override
	public List<Strany> findAll(int start, int end,
		OrderByComparator<Strany> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the stranies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StranyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of stranies
	 * @param end the upper bound of the range of stranies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of stranies
	 */
	@Override
	public List<Strany> findAll(int start, int end,
		OrderByComparator<Strany> orderByComparator, boolean retrieveFromCache) {
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

		List<Strany> list = null;

		if (retrieveFromCache) {
			list = (List<Strany>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_STRANY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STRANY;

				if (pagination) {
					sql = sql.concat(StranyModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Strany>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Strany>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the stranies from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Strany strany : findAll()) {
			remove(strany);
		}
	}

	/**
	 * Returns the number of stranies.
	 *
	 * @return the number of stranies
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_STRANY);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return StranyModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the strany persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(StranyImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_STRANY = "SELECT strany FROM Strany strany";
	private static final String _SQL_SELECT_STRANY_WHERE_PKS_IN = "SELECT strany FROM Strany strany WHERE strany_id IN (";
	private static final String _SQL_COUNT_STRANY = "SELECT COUNT(strany) FROM Strany strany";
	private static final String _ORDER_BY_ENTITY_ALIAS = "strany.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Strany exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(StranyPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"key"
			});
}