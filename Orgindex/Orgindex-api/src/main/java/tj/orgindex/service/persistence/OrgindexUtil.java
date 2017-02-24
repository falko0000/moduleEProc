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

package tj.orgindex.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.orgindex.model.Orgindex;

import java.util.List;

/**
 * The persistence utility for the orgindex service. This utility wraps {@link tj.orgindex.service.persistence.impl.OrgindexPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OrgindexPersistence
 * @see tj.orgindex.service.persistence.impl.OrgindexPersistenceImpl
 * @generated
 */
@ProviderType
public class OrgindexUtil {
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
	public static void clearCache(Orgindex orgindex) {
		getPersistence().clearCache(orgindex);
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
	public static List<Orgindex> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Orgindex> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Orgindex> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Orgindex> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Orgindex update(Orgindex orgindex) {
		return getPersistence().update(orgindex);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Orgindex update(Orgindex orgindex,
		ServiceContext serviceContext) {
		return getPersistence().update(orgindex, serviceContext);
	}

	/**
	* Returns all the orgindexs where organization_id = &#63;.
	*
	* @param organization_id the organization_id
	* @return the matching orgindexs
	*/
	public static List<Orgindex> findByFindByOrgID(long organization_id) {
		return getPersistence().findByFindByOrgID(organization_id);
	}

	/**
	* Returns a range of all the orgindexs where organization_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgindexModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organization_id the organization_id
	* @param start the lower bound of the range of orgindexs
	* @param end the upper bound of the range of orgindexs (not inclusive)
	* @return the range of matching orgindexs
	*/
	public static List<Orgindex> findByFindByOrgID(long organization_id,
		int start, int end) {
		return getPersistence().findByFindByOrgID(organization_id, start, end);
	}

	/**
	* Returns an ordered range of all the orgindexs where organization_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgindexModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organization_id the organization_id
	* @param start the lower bound of the range of orgindexs
	* @param end the upper bound of the range of orgindexs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching orgindexs
	*/
	public static List<Orgindex> findByFindByOrgID(long organization_id,
		int start, int end, OrderByComparator<Orgindex> orderByComparator) {
		return getPersistence()
				   .findByFindByOrgID(organization_id, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the orgindexs where organization_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgindexModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organization_id the organization_id
	* @param start the lower bound of the range of orgindexs
	* @param end the upper bound of the range of orgindexs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching orgindexs
	*/
	public static List<Orgindex> findByFindByOrgID(long organization_id,
		int start, int end, OrderByComparator<Orgindex> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByFindByOrgID(organization_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first orgindex in the ordered set where organization_id = &#63;.
	*
	* @param organization_id the organization_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching orgindex
	* @throws NoSuchOrgindexException if a matching orgindex could not be found
	*/
	public static Orgindex findByFindByOrgID_First(long organization_id,
		OrderByComparator<Orgindex> orderByComparator)
		throws tj.orgindex.exception.NoSuchOrgindexException {
		return getPersistence()
				   .findByFindByOrgID_First(organization_id, orderByComparator);
	}

	/**
	* Returns the first orgindex in the ordered set where organization_id = &#63;.
	*
	* @param organization_id the organization_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching orgindex, or <code>null</code> if a matching orgindex could not be found
	*/
	public static Orgindex fetchByFindByOrgID_First(long organization_id,
		OrderByComparator<Orgindex> orderByComparator) {
		return getPersistence()
				   .fetchByFindByOrgID_First(organization_id, orderByComparator);
	}

	/**
	* Returns the last orgindex in the ordered set where organization_id = &#63;.
	*
	* @param organization_id the organization_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching orgindex
	* @throws NoSuchOrgindexException if a matching orgindex could not be found
	*/
	public static Orgindex findByFindByOrgID_Last(long organization_id,
		OrderByComparator<Orgindex> orderByComparator)
		throws tj.orgindex.exception.NoSuchOrgindexException {
		return getPersistence()
				   .findByFindByOrgID_Last(organization_id, orderByComparator);
	}

	/**
	* Returns the last orgindex in the ordered set where organization_id = &#63;.
	*
	* @param organization_id the organization_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching orgindex, or <code>null</code> if a matching orgindex could not be found
	*/
	public static Orgindex fetchByFindByOrgID_Last(long organization_id,
		OrderByComparator<Orgindex> orderByComparator) {
		return getPersistence()
				   .fetchByFindByOrgID_Last(organization_id, orderByComparator);
	}

	/**
	* Returns the orgindexs before and after the current orgindex in the ordered set where organization_id = &#63;.
	*
	* @param orgindex_id the primary key of the current orgindex
	* @param organization_id the organization_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next orgindex
	* @throws NoSuchOrgindexException if a orgindex with the primary key could not be found
	*/
	public static Orgindex[] findByFindByOrgID_PrevAndNext(long orgindex_id,
		long organization_id, OrderByComparator<Orgindex> orderByComparator)
		throws tj.orgindex.exception.NoSuchOrgindexException {
		return getPersistence()
				   .findByFindByOrgID_PrevAndNext(orgindex_id, organization_id,
			orderByComparator);
	}

	/**
	* Removes all the orgindexs where organization_id = &#63; from the database.
	*
	* @param organization_id the organization_id
	*/
	public static void removeByFindByOrgID(long organization_id) {
		getPersistence().removeByFindByOrgID(organization_id);
	}

	/**
	* Returns the number of orgindexs where organization_id = &#63;.
	*
	* @param organization_id the organization_id
	* @return the number of matching orgindexs
	*/
	public static int countByFindByOrgID(long organization_id) {
		return getPersistence().countByFindByOrgID(organization_id);
	}

	/**
	* Caches the orgindex in the entity cache if it is enabled.
	*
	* @param orgindex the orgindex
	*/
	public static void cacheResult(Orgindex orgindex) {
		getPersistence().cacheResult(orgindex);
	}

	/**
	* Caches the orgindexs in the entity cache if it is enabled.
	*
	* @param orgindexs the orgindexs
	*/
	public static void cacheResult(List<Orgindex> orgindexs) {
		getPersistence().cacheResult(orgindexs);
	}

	/**
	* Creates a new orgindex with the primary key. Does not add the orgindex to the database.
	*
	* @param orgindex_id the primary key for the new orgindex
	* @return the new orgindex
	*/
	public static Orgindex create(long orgindex_id) {
		return getPersistence().create(orgindex_id);
	}

	/**
	* Removes the orgindex with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orgindex_id the primary key of the orgindex
	* @return the orgindex that was removed
	* @throws NoSuchOrgindexException if a orgindex with the primary key could not be found
	*/
	public static Orgindex remove(long orgindex_id)
		throws tj.orgindex.exception.NoSuchOrgindexException {
		return getPersistence().remove(orgindex_id);
	}

	public static Orgindex updateImpl(Orgindex orgindex) {
		return getPersistence().updateImpl(orgindex);
	}

	/**
	* Returns the orgindex with the primary key or throws a {@link NoSuchOrgindexException} if it could not be found.
	*
	* @param orgindex_id the primary key of the orgindex
	* @return the orgindex
	* @throws NoSuchOrgindexException if a orgindex with the primary key could not be found
	*/
	public static Orgindex findByPrimaryKey(long orgindex_id)
		throws tj.orgindex.exception.NoSuchOrgindexException {
		return getPersistence().findByPrimaryKey(orgindex_id);
	}

	/**
	* Returns the orgindex with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param orgindex_id the primary key of the orgindex
	* @return the orgindex, or <code>null</code> if a orgindex with the primary key could not be found
	*/
	public static Orgindex fetchByPrimaryKey(long orgindex_id) {
		return getPersistence().fetchByPrimaryKey(orgindex_id);
	}

	public static java.util.Map<java.io.Serializable, Orgindex> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the orgindexs.
	*
	* @return the orgindexs
	*/
	public static List<Orgindex> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the orgindexs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgindexModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of orgindexs
	* @param end the upper bound of the range of orgindexs (not inclusive)
	* @return the range of orgindexs
	*/
	public static List<Orgindex> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the orgindexs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgindexModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of orgindexs
	* @param end the upper bound of the range of orgindexs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of orgindexs
	*/
	public static List<Orgindex> findAll(int start, int end,
		OrderByComparator<Orgindex> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the orgindexs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgindexModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of orgindexs
	* @param end the upper bound of the range of orgindexs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of orgindexs
	*/
	public static List<Orgindex> findAll(int start, int end,
		OrderByComparator<Orgindex> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the orgindexs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of orgindexs.
	*
	* @return the number of orgindexs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OrgindexPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<OrgindexPersistence, OrgindexPersistence> _serviceTracker =
		ServiceTrackerFactory.open(OrgindexPersistence.class);
}