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

package tj.module.access.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.module.access.model.AccessModule;

import java.util.List;

/**
 * The persistence utility for the access module service. This utility wraps {@link tj.module.access.service.persistence.impl.AccessModulePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccessModulePersistence
 * @see tj.module.access.service.persistence.impl.AccessModulePersistenceImpl
 * @generated
 */
@ProviderType
public class AccessModuleUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(AccessModule accessModule) {
		getPersistence().clearCache(accessModule);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AccessModule> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AccessModule> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AccessModule> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AccessModule> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AccessModule update(AccessModule accessModule) {
		return getPersistence().update(accessModule);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AccessModule update(AccessModule accessModule,
		ServiceContext serviceContext) {
		return getPersistence().update(accessModule, serviceContext);
	}

	/**
	* Returns all the access modules where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching access modules
	*/
	public static List<AccessModule> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the access modules where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AccessModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of access modules
	* @param end the upper bound of the range of access modules (not inclusive)
	* @return the range of matching access modules
	*/
	public static List<AccessModule> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the access modules where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AccessModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of access modules
	* @param end the upper bound of the range of access modules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching access modules
	*/
	public static List<AccessModule> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<AccessModule> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the access modules where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AccessModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of access modules
	* @param end the upper bound of the range of access modules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching access modules
	*/
	public static List<AccessModule> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<AccessModule> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first access module in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access module
	* @throws NoSuchAccessModuleException if a matching access module could not be found
	*/
	public static AccessModule findByUuid_First(java.lang.String uuid,
		OrderByComparator<AccessModule> orderByComparator)
		throws tj.module.access.exception.NoSuchAccessModuleException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first access module in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access module, or <code>null</code> if a matching access module could not be found
	*/
	public static AccessModule fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<AccessModule> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last access module in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access module
	* @throws NoSuchAccessModuleException if a matching access module could not be found
	*/
	public static AccessModule findByUuid_Last(java.lang.String uuid,
		OrderByComparator<AccessModule> orderByComparator)
		throws tj.module.access.exception.NoSuchAccessModuleException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last access module in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access module, or <code>null</code> if a matching access module could not be found
	*/
	public static AccessModule fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<AccessModule> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the access modules before and after the current access module in the ordered set where uuid = &#63;.
	*
	* @param dostup_id the primary key of the current access module
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next access module
	* @throws NoSuchAccessModuleException if a access module with the primary key could not be found
	*/
	public static AccessModule[] findByUuid_PrevAndNext(long dostup_id,
		java.lang.String uuid, OrderByComparator<AccessModule> orderByComparator)
		throws tj.module.access.exception.NoSuchAccessModuleException {
		return getPersistence()
				   .findByUuid_PrevAndNext(dostup_id, uuid, orderByComparator);
	}

	/**
	* Removes all the access modules where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of access modules where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching access modules
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Caches the access module in the entity cache if it is enabled.
	*
	* @param accessModule the access module
	*/
	public static void cacheResult(AccessModule accessModule) {
		getPersistence().cacheResult(accessModule);
	}

	/**
	* Caches the access modules in the entity cache if it is enabled.
	*
	* @param accessModules the access modules
	*/
	public static void cacheResult(List<AccessModule> accessModules) {
		getPersistence().cacheResult(accessModules);
	}

	/**
	* Creates a new access module with the primary key. Does not add the access module to the database.
	*
	* @param dostup_id the primary key for the new access module
	* @return the new access module
	*/
	public static AccessModule create(long dostup_id) {
		return getPersistence().create(dostup_id);
	}

	/**
	* Removes the access module with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dostup_id the primary key of the access module
	* @return the access module that was removed
	* @throws NoSuchAccessModuleException if a access module with the primary key could not be found
	*/
	public static AccessModule remove(long dostup_id)
		throws tj.module.access.exception.NoSuchAccessModuleException {
		return getPersistence().remove(dostup_id);
	}

	public static AccessModule updateImpl(AccessModule accessModule) {
		return getPersistence().updateImpl(accessModule);
	}

	/**
	* Returns the access module with the primary key or throws a {@link NoSuchAccessModuleException} if it could not be found.
	*
	* @param dostup_id the primary key of the access module
	* @return the access module
	* @throws NoSuchAccessModuleException if a access module with the primary key could not be found
	*/
	public static AccessModule findByPrimaryKey(long dostup_id)
		throws tj.module.access.exception.NoSuchAccessModuleException {
		return getPersistence().findByPrimaryKey(dostup_id);
	}

	/**
	* Returns the access module with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dostup_id the primary key of the access module
	* @return the access module, or <code>null</code> if a access module with the primary key could not be found
	*/
	public static AccessModule fetchByPrimaryKey(long dostup_id) {
		return getPersistence().fetchByPrimaryKey(dostup_id);
	}

	public static java.util.Map<java.io.Serializable, AccessModule> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the access modules.
	*
	* @return the access modules
	*/
	public static List<AccessModule> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the access modules.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AccessModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of access modules
	* @param end the upper bound of the range of access modules (not inclusive)
	* @return the range of access modules
	*/
	public static List<AccessModule> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the access modules.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AccessModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of access modules
	* @param end the upper bound of the range of access modules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of access modules
	*/
	public static List<AccessModule> findAll(int start, int end,
		OrderByComparator<AccessModule> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the access modules.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AccessModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of access modules
	* @param end the upper bound of the range of access modules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of access modules
	*/
	public static List<AccessModule> findAll(int start, int end,
		OrderByComparator<AccessModule> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the access modules from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of access modules.
	*
	* @return the number of access modules
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static AccessModulePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AccessModulePersistence, AccessModulePersistence> _serviceTracker =
		ServiceTrackerFactory.open(AccessModulePersistence.class);
}