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

package tj.organization.other.info.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.organization.other.info.model.OrgOtherInfo;

import java.util.List;

/**
 * The persistence utility for the org other info service. This utility wraps {@link tj.organization.other.info.service.persistence.impl.OrgOtherInfoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OrgOtherInfoPersistence
 * @see tj.organization.other.info.service.persistence.impl.OrgOtherInfoPersistenceImpl
 * @generated
 */
@ProviderType
public class OrgOtherInfoUtil {
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
	public static void clearCache(OrgOtherInfo orgOtherInfo) {
		getPersistence().clearCache(orgOtherInfo);
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
	public static List<OrgOtherInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OrgOtherInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OrgOtherInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OrgOtherInfo> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OrgOtherInfo update(OrgOtherInfo orgOtherInfo) {
		return getPersistence().update(orgOtherInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OrgOtherInfo update(OrgOtherInfo orgOtherInfo,
		ServiceContext serviceContext) {
		return getPersistence().update(orgOtherInfo, serviceContext);
	}

	/**
	* Returns the org other info where inn = &#63; or throws a {@link NoSuchOrgOtherInfoException} if it could not be found.
	*
	* @param inn the inn
	* @return the matching org other info
	* @throws NoSuchOrgOtherInfoException if a matching org other info could not be found
	*/
	public static OrgOtherInfo findByinn(java.lang.String inn)
		throws tj.organization.other.info.exception.NoSuchOrgOtherInfoException {
		return getPersistence().findByinn(inn);
	}

	/**
	* Returns the org other info where inn = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param inn the inn
	* @return the matching org other info, or <code>null</code> if a matching org other info could not be found
	*/
	public static OrgOtherInfo fetchByinn(java.lang.String inn) {
		return getPersistence().fetchByinn(inn);
	}

	/**
	* Returns the org other info where inn = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param inn the inn
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching org other info, or <code>null</code> if a matching org other info could not be found
	*/
	public static OrgOtherInfo fetchByinn(java.lang.String inn,
		boolean retrieveFromCache) {
		return getPersistence().fetchByinn(inn, retrieveFromCache);
	}

	/**
	* Removes the org other info where inn = &#63; from the database.
	*
	* @param inn the inn
	* @return the org other info that was removed
	*/
	public static OrgOtherInfo removeByinn(java.lang.String inn)
		throws tj.organization.other.info.exception.NoSuchOrgOtherInfoException {
		return getPersistence().removeByinn(inn);
	}

	/**
	* Returns the number of org other infos where inn = &#63;.
	*
	* @param inn the inn
	* @return the number of matching org other infos
	*/
	public static int countByinn(java.lang.String inn) {
		return getPersistence().countByinn(inn);
	}

	/**
	* Returns the org other info where organization_id = &#63; or throws a {@link NoSuchOrgOtherInfoException} if it could not be found.
	*
	* @param organization_id the organization_id
	* @return the matching org other info
	* @throws NoSuchOrgOtherInfoException if a matching org other info could not be found
	*/
	public static OrgOtherInfo findByOrgOtherInfoId(long organization_id)
		throws tj.organization.other.info.exception.NoSuchOrgOtherInfoException {
		return getPersistence().findByOrgOtherInfoId(organization_id);
	}

	/**
	* Returns the org other info where organization_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param organization_id the organization_id
	* @return the matching org other info, or <code>null</code> if a matching org other info could not be found
	*/
	public static OrgOtherInfo fetchByOrgOtherInfoId(long organization_id) {
		return getPersistence().fetchByOrgOtherInfoId(organization_id);
	}

	/**
	* Returns the org other info where organization_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param organization_id the organization_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching org other info, or <code>null</code> if a matching org other info could not be found
	*/
	public static OrgOtherInfo fetchByOrgOtherInfoId(long organization_id,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByOrgOtherInfoId(organization_id, retrieveFromCache);
	}

	/**
	* Removes the org other info where organization_id = &#63; from the database.
	*
	* @param organization_id the organization_id
	* @return the org other info that was removed
	*/
	public static OrgOtherInfo removeByOrgOtherInfoId(long organization_id)
		throws tj.organization.other.info.exception.NoSuchOrgOtherInfoException {
		return getPersistence().removeByOrgOtherInfoId(organization_id);
	}

	/**
	* Returns the number of org other infos where organization_id = &#63;.
	*
	* @param organization_id the organization_id
	* @return the number of matching org other infos
	*/
	public static int countByOrgOtherInfoId(long organization_id) {
		return getPersistence().countByOrgOtherInfoId(organization_id);
	}

	/**
	* Caches the org other info in the entity cache if it is enabled.
	*
	* @param orgOtherInfo the org other info
	*/
	public static void cacheResult(OrgOtherInfo orgOtherInfo) {
		getPersistence().cacheResult(orgOtherInfo);
	}

	/**
	* Caches the org other infos in the entity cache if it is enabled.
	*
	* @param orgOtherInfos the org other infos
	*/
	public static void cacheResult(List<OrgOtherInfo> orgOtherInfos) {
		getPersistence().cacheResult(orgOtherInfos);
	}

	/**
	* Creates a new org other info with the primary key. Does not add the org other info to the database.
	*
	* @param organization_id the primary key for the new org other info
	* @return the new org other info
	*/
	public static OrgOtherInfo create(long organization_id) {
		return getPersistence().create(organization_id);
	}

	/**
	* Removes the org other info with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param organization_id the primary key of the org other info
	* @return the org other info that was removed
	* @throws NoSuchOrgOtherInfoException if a org other info with the primary key could not be found
	*/
	public static OrgOtherInfo remove(long organization_id)
		throws tj.organization.other.info.exception.NoSuchOrgOtherInfoException {
		return getPersistence().remove(organization_id);
	}

	public static OrgOtherInfo updateImpl(OrgOtherInfo orgOtherInfo) {
		return getPersistence().updateImpl(orgOtherInfo);
	}

	/**
	* Returns the org other info with the primary key or throws a {@link NoSuchOrgOtherInfoException} if it could not be found.
	*
	* @param organization_id the primary key of the org other info
	* @return the org other info
	* @throws NoSuchOrgOtherInfoException if a org other info with the primary key could not be found
	*/
	public static OrgOtherInfo findByPrimaryKey(long organization_id)
		throws tj.organization.other.info.exception.NoSuchOrgOtherInfoException {
		return getPersistence().findByPrimaryKey(organization_id);
	}

	/**
	* Returns the org other info with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param organization_id the primary key of the org other info
	* @return the org other info, or <code>null</code> if a org other info with the primary key could not be found
	*/
	public static OrgOtherInfo fetchByPrimaryKey(long organization_id) {
		return getPersistence().fetchByPrimaryKey(organization_id);
	}

	public static java.util.Map<java.io.Serializable, OrgOtherInfo> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the org other infos.
	*
	* @return the org other infos
	*/
	public static List<OrgOtherInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the org other infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgOtherInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of org other infos
	* @param end the upper bound of the range of org other infos (not inclusive)
	* @return the range of org other infos
	*/
	public static List<OrgOtherInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the org other infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgOtherInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of org other infos
	* @param end the upper bound of the range of org other infos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of org other infos
	*/
	public static List<OrgOtherInfo> findAll(int start, int end,
		OrderByComparator<OrgOtherInfo> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the org other infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgOtherInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of org other infos
	* @param end the upper bound of the range of org other infos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of org other infos
	*/
	public static List<OrgOtherInfo> findAll(int start, int end,
		OrderByComparator<OrgOtherInfo> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the org other infos from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of org other infos.
	*
	* @return the number of org other infos
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OrgOtherInfoPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<OrgOtherInfoPersistence, OrgOtherInfoPersistence> _serviceTracker =
		ServiceTrackerFactory.open(OrgOtherInfoPersistence.class);
}