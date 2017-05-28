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

package tj.system.config.service.persistence.impl;

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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import tj.system.config.exception.NoSuchSystemConfigException;
import tj.system.config.model.SystemConfig;
import tj.system.config.model.impl.SystemConfigImpl;
import tj.system.config.model.impl.SystemConfigModelImpl;
import tj.system.config.service.persistence.SystemConfigPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the system config service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SystemConfigPersistence
 * @see tj.system.config.service.persistence.SystemConfigUtil
 * @generated
 */
@ProviderType
public class SystemConfigPersistenceImpl extends BasePersistenceImpl<SystemConfig>
	implements SystemConfigPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SystemConfigUtil} to access the system config persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SystemConfigImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
			SystemConfigModelImpl.FINDER_CACHE_ENABLED, SystemConfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
			SystemConfigModelImpl.FINDER_CACHE_ENABLED, SystemConfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
			SystemConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_KEY = new FinderPath(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
			SystemConfigModelImpl.FINDER_CACHE_ENABLED, SystemConfigImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByKey",
			new String[] { String.class.getName() },
			SystemConfigModelImpl.KEY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_KEY = new FinderPath(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
			SystemConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByKey",
			new String[] { String.class.getName() });

	/**
	 * Returns the system config where key = &#63; or throws a {@link NoSuchSystemConfigException} if it could not be found.
	 *
	 * @param key the key
	 * @return the matching system config
	 * @throws NoSuchSystemConfigException if a matching system config could not be found
	 */
	@Override
	public SystemConfig findByKey(String key)
		throws NoSuchSystemConfigException {
		SystemConfig systemConfig = fetchByKey(key);

		if (systemConfig == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("key=");
			msg.append(key);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchSystemConfigException(msg.toString());
		}

		return systemConfig;
	}

	/**
	 * Returns the system config where key = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param key the key
	 * @return the matching system config, or <code>null</code> if a matching system config could not be found
	 */
	@Override
	public SystemConfig fetchByKey(String key) {
		return fetchByKey(key, true);
	}

	/**
	 * Returns the system config where key = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param key the key
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching system config, or <code>null</code> if a matching system config could not be found
	 */
	@Override
	public SystemConfig fetchByKey(String key, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { key };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_KEY,
					finderArgs, this);
		}

		if (result instanceof SystemConfig) {
			SystemConfig systemConfig = (SystemConfig)result;

			if (!Objects.equals(key, systemConfig.getKey())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_SYSTEMCONFIG_WHERE);

			boolean bindKey = false;

			if (key == null) {
				query.append(_FINDER_COLUMN_KEY_KEY_1);
			}
			else if (key.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_KEY_KEY_3);
			}
			else {
				bindKey = true;

				query.append(_FINDER_COLUMN_KEY_KEY_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindKey) {
					qPos.add(key);
				}

				List<SystemConfig> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_KEY, finderArgs,
						list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"SystemConfigPersistenceImpl.fetchByKey(String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SystemConfig systemConfig = list.get(0);

					result = systemConfig;

					cacheResult(systemConfig);

					if ((systemConfig.getKey() == null) ||
							!systemConfig.getKey().equals(key)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_KEY,
							finderArgs, systemConfig);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_KEY, finderArgs);

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
			return (SystemConfig)result;
		}
	}

	/**
	 * Removes the system config where key = &#63; from the database.
	 *
	 * @param key the key
	 * @return the system config that was removed
	 */
	@Override
	public SystemConfig removeByKey(String key)
		throws NoSuchSystemConfigException {
		SystemConfig systemConfig = findByKey(key);

		return remove(systemConfig);
	}

	/**
	 * Returns the number of system configs where key = &#63;.
	 *
	 * @param key the key
	 * @return the number of matching system configs
	 */
	@Override
	public int countByKey(String key) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_KEY;

		Object[] finderArgs = new Object[] { key };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SYSTEMCONFIG_WHERE);

			boolean bindKey = false;

			if (key == null) {
				query.append(_FINDER_COLUMN_KEY_KEY_1);
			}
			else if (key.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_KEY_KEY_3);
			}
			else {
				bindKey = true;

				query.append(_FINDER_COLUMN_KEY_KEY_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindKey) {
					qPos.add(key);
				}

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

	private static final String _FINDER_COLUMN_KEY_KEY_1 = "systemConfig.key IS NULL";
	private static final String _FINDER_COLUMN_KEY_KEY_2 = "systemConfig.key = ?";
	private static final String _FINDER_COLUMN_KEY_KEY_3 = "(systemConfig.key IS NULL OR systemConfig.key = '')";

	public SystemConfigPersistenceImpl() {
		setModelClass(SystemConfig.class);
	}

	/**
	 * Caches the system config in the entity cache if it is enabled.
	 *
	 * @param systemConfig the system config
	 */
	@Override
	public void cacheResult(SystemConfig systemConfig) {
		entityCache.putResult(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
			SystemConfigImpl.class, systemConfig.getPrimaryKey(), systemConfig);

		finderCache.putResult(FINDER_PATH_FETCH_BY_KEY,
			new Object[] { systemConfig.getKey() }, systemConfig);

		systemConfig.resetOriginalValues();
	}

	/**
	 * Caches the system configs in the entity cache if it is enabled.
	 *
	 * @param systemConfigs the system configs
	 */
	@Override
	public void cacheResult(List<SystemConfig> systemConfigs) {
		for (SystemConfig systemConfig : systemConfigs) {
			if (entityCache.getResult(
						SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
						SystemConfigImpl.class, systemConfig.getPrimaryKey()) == null) {
				cacheResult(systemConfig);
			}
			else {
				systemConfig.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all system configs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SystemConfigImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the system config.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SystemConfig systemConfig) {
		entityCache.removeResult(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
			SystemConfigImpl.class, systemConfig.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((SystemConfigModelImpl)systemConfig, true);
	}

	@Override
	public void clearCache(List<SystemConfig> systemConfigs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SystemConfig systemConfig : systemConfigs) {
			entityCache.removeResult(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
				SystemConfigImpl.class, systemConfig.getPrimaryKey());

			clearUniqueFindersCache((SystemConfigModelImpl)systemConfig, true);
		}
	}

	protected void cacheUniqueFindersCache(
		SystemConfigModelImpl systemConfigModelImpl) {
		Object[] args = new Object[] { systemConfigModelImpl.getKey() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_KEY, args, Long.valueOf(1),
			false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_KEY, args,
			systemConfigModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		SystemConfigModelImpl systemConfigModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] { systemConfigModelImpl.getKey() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_KEY, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_KEY, args);
		}

		if ((systemConfigModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_KEY.getColumnBitmask()) != 0) {
			Object[] args = new Object[] { systemConfigModelImpl.getOriginalKey() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_KEY, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_KEY, args);
		}
	}

	/**
	 * Creates a new system config with the primary key. Does not add the system config to the database.
	 *
	 * @param system_config_id_ the primary key for the new system config
	 * @return the new system config
	 */
	@Override
	public SystemConfig create(long system_config_id_) {
		SystemConfig systemConfig = new SystemConfigImpl();

		systemConfig.setNew(true);
		systemConfig.setPrimaryKey(system_config_id_);

		return systemConfig;
	}

	/**
	 * Removes the system config with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param system_config_id_ the primary key of the system config
	 * @return the system config that was removed
	 * @throws NoSuchSystemConfigException if a system config with the primary key could not be found
	 */
	@Override
	public SystemConfig remove(long system_config_id_)
		throws NoSuchSystemConfigException {
		return remove((Serializable)system_config_id_);
	}

	/**
	 * Removes the system config with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the system config
	 * @return the system config that was removed
	 * @throws NoSuchSystemConfigException if a system config with the primary key could not be found
	 */
	@Override
	public SystemConfig remove(Serializable primaryKey)
		throws NoSuchSystemConfigException {
		Session session = null;

		try {
			session = openSession();

			SystemConfig systemConfig = (SystemConfig)session.get(SystemConfigImpl.class,
					primaryKey);

			if (systemConfig == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSystemConfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(systemConfig);
		}
		catch (NoSuchSystemConfigException nsee) {
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
	protected SystemConfig removeImpl(SystemConfig systemConfig) {
		systemConfig = toUnwrappedModel(systemConfig);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(systemConfig)) {
				systemConfig = (SystemConfig)session.get(SystemConfigImpl.class,
						systemConfig.getPrimaryKeyObj());
			}

			if (systemConfig != null) {
				session.delete(systemConfig);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (systemConfig != null) {
			clearCache(systemConfig);
		}

		return systemConfig;
	}

	@Override
	public SystemConfig updateImpl(SystemConfig systemConfig) {
		systemConfig = toUnwrappedModel(systemConfig);

		boolean isNew = systemConfig.isNew();

		SystemConfigModelImpl systemConfigModelImpl = (SystemConfigModelImpl)systemConfig;

		Session session = null;

		try {
			session = openSession();

			if (systemConfig.isNew()) {
				session.save(systemConfig);

				systemConfig.setNew(false);
			}
			else {
				systemConfig = (SystemConfig)session.merge(systemConfig);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !SystemConfigModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
			SystemConfigImpl.class, systemConfig.getPrimaryKey(), systemConfig,
			false);

		clearUniqueFindersCache(systemConfigModelImpl, false);
		cacheUniqueFindersCache(systemConfigModelImpl);

		systemConfig.resetOriginalValues();

		return systemConfig;
	}

	protected SystemConfig toUnwrappedModel(SystemConfig systemConfig) {
		if (systemConfig instanceof SystemConfigImpl) {
			return systemConfig;
		}

		SystemConfigImpl systemConfigImpl = new SystemConfigImpl();

		systemConfigImpl.setNew(systemConfig.isNew());
		systemConfigImpl.setPrimaryKey(systemConfig.getPrimaryKey());

		systemConfigImpl.setSystem_config_id_(systemConfig.getSystem_config_id_());
		systemConfigImpl.setKey(systemConfig.getKey());
		systemConfigImpl.setDescription(systemConfig.getDescription());
		systemConfigImpl.setValue(systemConfig.getValue());
		systemConfigImpl.setType(systemConfig.getType());

		return systemConfigImpl;
	}

	/**
	 * Returns the system config with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the system config
	 * @return the system config
	 * @throws NoSuchSystemConfigException if a system config with the primary key could not be found
	 */
	@Override
	public SystemConfig findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSystemConfigException {
		SystemConfig systemConfig = fetchByPrimaryKey(primaryKey);

		if (systemConfig == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSystemConfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return systemConfig;
	}

	/**
	 * Returns the system config with the primary key or throws a {@link NoSuchSystemConfigException} if it could not be found.
	 *
	 * @param system_config_id_ the primary key of the system config
	 * @return the system config
	 * @throws NoSuchSystemConfigException if a system config with the primary key could not be found
	 */
	@Override
	public SystemConfig findByPrimaryKey(long system_config_id_)
		throws NoSuchSystemConfigException {
		return findByPrimaryKey((Serializable)system_config_id_);
	}

	/**
	 * Returns the system config with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the system config
	 * @return the system config, or <code>null</code> if a system config with the primary key could not be found
	 */
	@Override
	public SystemConfig fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
				SystemConfigImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		SystemConfig systemConfig = (SystemConfig)serializable;

		if (systemConfig == null) {
			Session session = null;

			try {
				session = openSession();

				systemConfig = (SystemConfig)session.get(SystemConfigImpl.class,
						primaryKey);

				if (systemConfig != null) {
					cacheResult(systemConfig);
				}
				else {
					entityCache.putResult(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
						SystemConfigImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
					SystemConfigImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return systemConfig;
	}

	/**
	 * Returns the system config with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param system_config_id_ the primary key of the system config
	 * @return the system config, or <code>null</code> if a system config with the primary key could not be found
	 */
	@Override
	public SystemConfig fetchByPrimaryKey(long system_config_id_) {
		return fetchByPrimaryKey((Serializable)system_config_id_);
	}

	@Override
	public Map<Serializable, SystemConfig> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, SystemConfig> map = new HashMap<Serializable, SystemConfig>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			SystemConfig systemConfig = fetchByPrimaryKey(primaryKey);

			if (systemConfig != null) {
				map.put(primaryKey, systemConfig);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
					SystemConfigImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (SystemConfig)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SYSTEMCONFIG_WHERE_PKS_IN);

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

			for (SystemConfig systemConfig : (List<SystemConfig>)q.list()) {
				map.put(systemConfig.getPrimaryKeyObj(), systemConfig);

				cacheResult(systemConfig);

				uncachedPrimaryKeys.remove(systemConfig.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
					SystemConfigImpl.class, primaryKey, nullModel);
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
	 * Returns all the system configs.
	 *
	 * @return the system configs
	 */
	@Override
	public List<SystemConfig> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the system configs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of system configs
	 * @param end the upper bound of the range of system configs (not inclusive)
	 * @return the range of system configs
	 */
	@Override
	public List<SystemConfig> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the system configs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of system configs
	 * @param end the upper bound of the range of system configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of system configs
	 */
	@Override
	public List<SystemConfig> findAll(int start, int end,
		OrderByComparator<SystemConfig> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the system configs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of system configs
	 * @param end the upper bound of the range of system configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of system configs
	 */
	@Override
	public List<SystemConfig> findAll(int start, int end,
		OrderByComparator<SystemConfig> orderByComparator,
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

		List<SystemConfig> list = null;

		if (retrieveFromCache) {
			list = (List<SystemConfig>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SYSTEMCONFIG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SYSTEMCONFIG;

				if (pagination) {
					sql = sql.concat(SystemConfigModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SystemConfig>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SystemConfig>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the system configs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SystemConfig systemConfig : findAll()) {
			remove(systemConfig);
		}
	}

	/**
	 * Returns the number of system configs.
	 *
	 * @return the number of system configs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SYSTEMCONFIG);

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
		return SystemConfigModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the system config persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(SystemConfigImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SYSTEMCONFIG = "SELECT systemConfig FROM SystemConfig systemConfig";
	private static final String _SQL_SELECT_SYSTEMCONFIG_WHERE_PKS_IN = "SELECT systemConfig FROM SystemConfig systemConfig WHERE system_config_id_ IN (";
	private static final String _SQL_SELECT_SYSTEMCONFIG_WHERE = "SELECT systemConfig FROM SystemConfig systemConfig WHERE ";
	private static final String _SQL_COUNT_SYSTEMCONFIG = "SELECT COUNT(systemConfig) FROM SystemConfig systemConfig";
	private static final String _SQL_COUNT_SYSTEMCONFIG_WHERE = "SELECT COUNT(systemConfig) FROM SystemConfig systemConfig WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "systemConfig.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SystemConfig exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SystemConfig exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(SystemConfigPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"key", "type"
			});
}