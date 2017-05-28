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

package tj.system.config.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.system.config.exception.NoSuchSystemConfigException;
import tj.system.config.model.SystemConfig;

/**
 * The persistence interface for the system config service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.system.config.service.persistence.impl.SystemConfigPersistenceImpl
 * @see SystemConfigUtil
 * @generated
 */
@ProviderType
public interface SystemConfigPersistence extends BasePersistence<SystemConfig> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SystemConfigUtil} to access the system config persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the system config where key = &#63; or throws a {@link NoSuchSystemConfigException} if it could not be found.
	*
	* @param key the key
	* @return the matching system config
	* @throws NoSuchSystemConfigException if a matching system config could not be found
	*/
	public SystemConfig findByKey(java.lang.String key)
		throws NoSuchSystemConfigException;

	/**
	* Returns the system config where key = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param key the key
	* @return the matching system config, or <code>null</code> if a matching system config could not be found
	*/
	public SystemConfig fetchByKey(java.lang.String key);

	/**
	* Returns the system config where key = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param key the key
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching system config, or <code>null</code> if a matching system config could not be found
	*/
	public SystemConfig fetchByKey(java.lang.String key,
		boolean retrieveFromCache);

	/**
	* Removes the system config where key = &#63; from the database.
	*
	* @param key the key
	* @return the system config that was removed
	*/
	public SystemConfig removeByKey(java.lang.String key)
		throws NoSuchSystemConfigException;

	/**
	* Returns the number of system configs where key = &#63;.
	*
	* @param key the key
	* @return the number of matching system configs
	*/
	public int countByKey(java.lang.String key);

	/**
	* Caches the system config in the entity cache if it is enabled.
	*
	* @param systemConfig the system config
	*/
	public void cacheResult(SystemConfig systemConfig);

	/**
	* Caches the system configs in the entity cache if it is enabled.
	*
	* @param systemConfigs the system configs
	*/
	public void cacheResult(java.util.List<SystemConfig> systemConfigs);

	/**
	* Creates a new system config with the primary key. Does not add the system config to the database.
	*
	* @param system_config_id_ the primary key for the new system config
	* @return the new system config
	*/
	public SystemConfig create(long system_config_id_);

	/**
	* Removes the system config with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param system_config_id_ the primary key of the system config
	* @return the system config that was removed
	* @throws NoSuchSystemConfigException if a system config with the primary key could not be found
	*/
	public SystemConfig remove(long system_config_id_)
		throws NoSuchSystemConfigException;

	public SystemConfig updateImpl(SystemConfig systemConfig);

	/**
	* Returns the system config with the primary key or throws a {@link NoSuchSystemConfigException} if it could not be found.
	*
	* @param system_config_id_ the primary key of the system config
	* @return the system config
	* @throws NoSuchSystemConfigException if a system config with the primary key could not be found
	*/
	public SystemConfig findByPrimaryKey(long system_config_id_)
		throws NoSuchSystemConfigException;

	/**
	* Returns the system config with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param system_config_id_ the primary key of the system config
	* @return the system config, or <code>null</code> if a system config with the primary key could not be found
	*/
	public SystemConfig fetchByPrimaryKey(long system_config_id_);

	@Override
	public java.util.Map<java.io.Serializable, SystemConfig> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the system configs.
	*
	* @return the system configs
	*/
	public java.util.List<SystemConfig> findAll();

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
	public java.util.List<SystemConfig> findAll(int start, int end);

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
	public java.util.List<SystemConfig> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SystemConfig> orderByComparator);

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
	public java.util.List<SystemConfig> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SystemConfig> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the system configs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of system configs.
	*
	* @return the number of system configs
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}