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

package tj.izvewenija.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.izvewenija.model.Izvewenija;

import java.util.List;

/**
 * The persistence utility for the izvewenija service. This utility wraps {@link tj.izvewenija.service.persistence.impl.IzvewenijaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IzvewenijaPersistence
 * @see tj.izvewenija.service.persistence.impl.IzvewenijaPersistenceImpl
 * @generated
 */
@ProviderType
public class IzvewenijaUtil {
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
	public static void clearCache(Izvewenija izvewenija) {
		getPersistence().clearCache(izvewenija);
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
	public static List<Izvewenija> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Izvewenija> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Izvewenija> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Izvewenija> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Izvewenija update(Izvewenija izvewenija) {
		return getPersistence().update(izvewenija);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Izvewenija update(Izvewenija izvewenija,
		ServiceContext serviceContext) {
		return getPersistence().update(izvewenija, serviceContext);
	}

	/**
	* Returns all the izvewenijas where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching izvewenijas
	*/
	public static List<Izvewenija> findByCompanyId_GroupId(long companyId,
		long groupId) {
		return getPersistence().findByCompanyId_GroupId(companyId, groupId);
	}

	/**
	* Returns a range of all the izvewenijas where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @return the range of matching izvewenijas
	*/
	public static List<Izvewenija> findByCompanyId_GroupId(long companyId,
		long groupId, int start, int end) {
		return getPersistence()
				   .findByCompanyId_GroupId(companyId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the izvewenijas where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching izvewenijas
	*/
	public static List<Izvewenija> findByCompanyId_GroupId(long companyId,
		long groupId, int start, int end,
		OrderByComparator<Izvewenija> orderByComparator) {
		return getPersistence()
				   .findByCompanyId_GroupId(companyId, groupId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the izvewenijas where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching izvewenijas
	*/
	public static List<Izvewenija> findByCompanyId_GroupId(long companyId,
		long groupId, int start, int end,
		OrderByComparator<Izvewenija> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCompanyId_GroupId(companyId, groupId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first izvewenija in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching izvewenija
	* @throws NoSuchIzvewenijaException if a matching izvewenija could not be found
	*/
	public static Izvewenija findByCompanyId_GroupId_First(long companyId,
		long groupId, OrderByComparator<Izvewenija> orderByComparator)
		throws tj.izvewenija.exception.NoSuchIzvewenijaException {
		return getPersistence()
				   .findByCompanyId_GroupId_First(companyId, groupId,
			orderByComparator);
	}

	/**
	* Returns the first izvewenija in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching izvewenija, or <code>null</code> if a matching izvewenija could not be found
	*/
	public static Izvewenija fetchByCompanyId_GroupId_First(long companyId,
		long groupId, OrderByComparator<Izvewenija> orderByComparator) {
		return getPersistence()
				   .fetchByCompanyId_GroupId_First(companyId, groupId,
			orderByComparator);
	}

	/**
	* Returns the last izvewenija in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching izvewenija
	* @throws NoSuchIzvewenijaException if a matching izvewenija could not be found
	*/
	public static Izvewenija findByCompanyId_GroupId_Last(long companyId,
		long groupId, OrderByComparator<Izvewenija> orderByComparator)
		throws tj.izvewenija.exception.NoSuchIzvewenijaException {
		return getPersistence()
				   .findByCompanyId_GroupId_Last(companyId, groupId,
			orderByComparator);
	}

	/**
	* Returns the last izvewenija in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching izvewenija, or <code>null</code> if a matching izvewenija could not be found
	*/
	public static Izvewenija fetchByCompanyId_GroupId_Last(long companyId,
		long groupId, OrderByComparator<Izvewenija> orderByComparator) {
		return getPersistence()
				   .fetchByCompanyId_GroupId_Last(companyId, groupId,
			orderByComparator);
	}

	/**
	* Returns the izvewenijas before and after the current izvewenija in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param izvewenija_id the primary key of the current izvewenija
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next izvewenija
	* @throws NoSuchIzvewenijaException if a izvewenija with the primary key could not be found
	*/
	public static Izvewenija[] findByCompanyId_GroupId_PrevAndNext(
		long izvewenija_id, long companyId, long groupId,
		OrderByComparator<Izvewenija> orderByComparator)
		throws tj.izvewenija.exception.NoSuchIzvewenijaException {
		return getPersistence()
				   .findByCompanyId_GroupId_PrevAndNext(izvewenija_id,
			companyId, groupId, orderByComparator);
	}

	/**
	* Returns all the izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching izvewenijas that the user has permission to view
	*/
	public static List<Izvewenija> filterFindByCompanyId_GroupId(
		long companyId, long groupId) {
		return getPersistence().filterFindByCompanyId_GroupId(companyId, groupId);
	}

	/**
	* Returns a range of all the izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @return the range of matching izvewenijas that the user has permission to view
	*/
	public static List<Izvewenija> filterFindByCompanyId_GroupId(
		long companyId, long groupId, int start, int end) {
		return getPersistence()
				   .filterFindByCompanyId_GroupId(companyId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the izvewenijas that the user has permissions to view where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching izvewenijas that the user has permission to view
	*/
	public static List<Izvewenija> filterFindByCompanyId_GroupId(
		long companyId, long groupId, int start, int end,
		OrderByComparator<Izvewenija> orderByComparator) {
		return getPersistence()
				   .filterFindByCompanyId_GroupId(companyId, groupId, start,
			end, orderByComparator);
	}

	/**
	* Returns the izvewenijas before and after the current izvewenija in the ordered set of izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63;.
	*
	* @param izvewenija_id the primary key of the current izvewenija
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next izvewenija
	* @throws NoSuchIzvewenijaException if a izvewenija with the primary key could not be found
	*/
	public static Izvewenija[] filterFindByCompanyId_GroupId_PrevAndNext(
		long izvewenija_id, long companyId, long groupId,
		OrderByComparator<Izvewenija> orderByComparator)
		throws tj.izvewenija.exception.NoSuchIzvewenijaException {
		return getPersistence()
				   .filterFindByCompanyId_GroupId_PrevAndNext(izvewenija_id,
			companyId, groupId, orderByComparator);
	}

	/**
	* Removes all the izvewenijas where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	*/
	public static void removeByCompanyId_GroupId(long companyId, long groupId) {
		getPersistence().removeByCompanyId_GroupId(companyId, groupId);
	}

	/**
	* Returns the number of izvewenijas where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching izvewenijas
	*/
	public static int countByCompanyId_GroupId(long companyId, long groupId) {
		return getPersistence().countByCompanyId_GroupId(companyId, groupId);
	}

	/**
	* Returns the number of izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching izvewenijas that the user has permission to view
	*/
	public static int filterCountByCompanyId_GroupId(long companyId,
		long groupId) {
		return getPersistence()
				   .filterCountByCompanyId_GroupId(companyId, groupId);
	}

	/**
	* Returns all the izvewenijas where izvewenija_id = &#63; and sozdal = &#63;.
	*
	* @param izvewenija_id the izvewenija_id
	* @param sozdal the sozdal
	* @return the matching izvewenijas
	*/
	public static List<Izvewenija> findByIzvewenijaId(long izvewenija_id,
		long sozdal) {
		return getPersistence().findByIzvewenijaId(izvewenija_id, sozdal);
	}

	/**
	* Returns a range of all the izvewenijas where izvewenija_id = &#63; and sozdal = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenija_id the izvewenija_id
	* @param sozdal the sozdal
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @return the range of matching izvewenijas
	*/
	public static List<Izvewenija> findByIzvewenijaId(long izvewenija_id,
		long sozdal, int start, int end) {
		return getPersistence()
				   .findByIzvewenijaId(izvewenija_id, sozdal, start, end);
	}

	/**
	* Returns an ordered range of all the izvewenijas where izvewenija_id = &#63; and sozdal = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenija_id the izvewenija_id
	* @param sozdal the sozdal
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching izvewenijas
	*/
	public static List<Izvewenija> findByIzvewenijaId(long izvewenija_id,
		long sozdal, int start, int end,
		OrderByComparator<Izvewenija> orderByComparator) {
		return getPersistence()
				   .findByIzvewenijaId(izvewenija_id, sozdal, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the izvewenijas where izvewenija_id = &#63; and sozdal = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenija_id the izvewenija_id
	* @param sozdal the sozdal
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching izvewenijas
	*/
	public static List<Izvewenija> findByIzvewenijaId(long izvewenija_id,
		long sozdal, int start, int end,
		OrderByComparator<Izvewenija> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByIzvewenijaId(izvewenija_id, sozdal, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first izvewenija in the ordered set where izvewenija_id = &#63; and sozdal = &#63;.
	*
	* @param izvewenija_id the izvewenija_id
	* @param sozdal the sozdal
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching izvewenija
	* @throws NoSuchIzvewenijaException if a matching izvewenija could not be found
	*/
	public static Izvewenija findByIzvewenijaId_First(long izvewenija_id,
		long sozdal, OrderByComparator<Izvewenija> orderByComparator)
		throws tj.izvewenija.exception.NoSuchIzvewenijaException {
		return getPersistence()
				   .findByIzvewenijaId_First(izvewenija_id, sozdal,
			orderByComparator);
	}

	/**
	* Returns the first izvewenija in the ordered set where izvewenija_id = &#63; and sozdal = &#63;.
	*
	* @param izvewenija_id the izvewenija_id
	* @param sozdal the sozdal
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching izvewenija, or <code>null</code> if a matching izvewenija could not be found
	*/
	public static Izvewenija fetchByIzvewenijaId_First(long izvewenija_id,
		long sozdal, OrderByComparator<Izvewenija> orderByComparator) {
		return getPersistence()
				   .fetchByIzvewenijaId_First(izvewenija_id, sozdal,
			orderByComparator);
	}

	/**
	* Returns the last izvewenija in the ordered set where izvewenija_id = &#63; and sozdal = &#63;.
	*
	* @param izvewenija_id the izvewenija_id
	* @param sozdal the sozdal
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching izvewenija
	* @throws NoSuchIzvewenijaException if a matching izvewenija could not be found
	*/
	public static Izvewenija findByIzvewenijaId_Last(long izvewenija_id,
		long sozdal, OrderByComparator<Izvewenija> orderByComparator)
		throws tj.izvewenija.exception.NoSuchIzvewenijaException {
		return getPersistence()
				   .findByIzvewenijaId_Last(izvewenija_id, sozdal,
			orderByComparator);
	}

	/**
	* Returns the last izvewenija in the ordered set where izvewenija_id = &#63; and sozdal = &#63;.
	*
	* @param izvewenija_id the izvewenija_id
	* @param sozdal the sozdal
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching izvewenija, or <code>null</code> if a matching izvewenija could not be found
	*/
	public static Izvewenija fetchByIzvewenijaId_Last(long izvewenija_id,
		long sozdal, OrderByComparator<Izvewenija> orderByComparator) {
		return getPersistence()
				   .fetchByIzvewenijaId_Last(izvewenija_id, sozdal,
			orderByComparator);
	}

	/**
	* Removes all the izvewenijas where izvewenija_id = &#63; and sozdal = &#63; from the database.
	*
	* @param izvewenija_id the izvewenija_id
	* @param sozdal the sozdal
	*/
	public static void removeByIzvewenijaId(long izvewenija_id, long sozdal) {
		getPersistence().removeByIzvewenijaId(izvewenija_id, sozdal);
	}

	/**
	* Returns the number of izvewenijas where izvewenija_id = &#63; and sozdal = &#63;.
	*
	* @param izvewenija_id the izvewenija_id
	* @param sozdal the sozdal
	* @return the number of matching izvewenijas
	*/
	public static int countByIzvewenijaId(long izvewenija_id, long sozdal) {
		return getPersistence().countByIzvewenijaId(izvewenija_id, sozdal);
	}

	/**
	* Returns all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @return the matching izvewenijas
	*/
	public static List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id) {
		return getPersistence()
				   .findByCompanyIdGroupIdSostojanieIdStatusId(companyId,
			groupId, sostojanie_id, status_id);
	}

	/**
	* Returns a range of all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @return the range of matching izvewenijas
	*/
	public static List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id,
		int start, int end) {
		return getPersistence()
				   .findByCompanyIdGroupIdSostojanieIdStatusId(companyId,
			groupId, sostojanie_id, status_id, start, end);
	}

	/**
	* Returns an ordered range of all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching izvewenijas
	*/
	public static List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id,
		int start, int end, OrderByComparator<Izvewenija> orderByComparator) {
		return getPersistence()
				   .findByCompanyIdGroupIdSostojanieIdStatusId(companyId,
			groupId, sostojanie_id, status_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching izvewenijas
	*/
	public static List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id,
		int start, int end, OrderByComparator<Izvewenija> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCompanyIdGroupIdSostojanieIdStatusId(companyId,
			groupId, sostojanie_id, status_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first izvewenija in the ordered set where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching izvewenija
	* @throws NoSuchIzvewenijaException if a matching izvewenija could not be found
	*/
	public static Izvewenija findByCompanyIdGroupIdSostojanieIdStatusId_First(
		long companyId, long groupId, long sostojanie_id, long status_id,
		OrderByComparator<Izvewenija> orderByComparator)
		throws tj.izvewenija.exception.NoSuchIzvewenijaException {
		return getPersistence()
				   .findByCompanyIdGroupIdSostojanieIdStatusId_First(companyId,
			groupId, sostojanie_id, status_id, orderByComparator);
	}

	/**
	* Returns the first izvewenija in the ordered set where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching izvewenija, or <code>null</code> if a matching izvewenija could not be found
	*/
	public static Izvewenija fetchByCompanyIdGroupIdSostojanieIdStatusId_First(
		long companyId, long groupId, long sostojanie_id, long status_id,
		OrderByComparator<Izvewenija> orderByComparator) {
		return getPersistence()
				   .fetchByCompanyIdGroupIdSostojanieIdStatusId_First(companyId,
			groupId, sostojanie_id, status_id, orderByComparator);
	}

	/**
	* Returns the last izvewenija in the ordered set where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching izvewenija
	* @throws NoSuchIzvewenijaException if a matching izvewenija could not be found
	*/
	public static Izvewenija findByCompanyIdGroupIdSostojanieIdStatusId_Last(
		long companyId, long groupId, long sostojanie_id, long status_id,
		OrderByComparator<Izvewenija> orderByComparator)
		throws tj.izvewenija.exception.NoSuchIzvewenijaException {
		return getPersistence()
				   .findByCompanyIdGroupIdSostojanieIdStatusId_Last(companyId,
			groupId, sostojanie_id, status_id, orderByComparator);
	}

	/**
	* Returns the last izvewenija in the ordered set where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching izvewenija, or <code>null</code> if a matching izvewenija could not be found
	*/
	public static Izvewenija fetchByCompanyIdGroupIdSostojanieIdStatusId_Last(
		long companyId, long groupId, long sostojanie_id, long status_id,
		OrderByComparator<Izvewenija> orderByComparator) {
		return getPersistence()
				   .fetchByCompanyIdGroupIdSostojanieIdStatusId_Last(companyId,
			groupId, sostojanie_id, status_id, orderByComparator);
	}

	/**
	* Returns the izvewenijas before and after the current izvewenija in the ordered set where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* @param izvewenija_id the primary key of the current izvewenija
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next izvewenija
	* @throws NoSuchIzvewenijaException if a izvewenija with the primary key could not be found
	*/
	public static Izvewenija[] findByCompanyIdGroupIdSostojanieIdStatusId_PrevAndNext(
		long izvewenija_id, long companyId, long groupId, long sostojanie_id,
		long status_id, OrderByComparator<Izvewenija> orderByComparator)
		throws tj.izvewenija.exception.NoSuchIzvewenijaException {
		return getPersistence()
				   .findByCompanyIdGroupIdSostojanieIdStatusId_PrevAndNext(izvewenija_id,
			companyId, groupId, sostojanie_id, status_id, orderByComparator);
	}

	/**
	* Returns all the izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @return the matching izvewenijas that the user has permission to view
	*/
	public static List<Izvewenija> filterFindByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id) {
		return getPersistence()
				   .filterFindByCompanyIdGroupIdSostojanieIdStatusId(companyId,
			groupId, sostojanie_id, status_id);
	}

	/**
	* Returns a range of all the izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @return the range of matching izvewenijas that the user has permission to view
	*/
	public static List<Izvewenija> filterFindByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id,
		int start, int end) {
		return getPersistence()
				   .filterFindByCompanyIdGroupIdSostojanieIdStatusId(companyId,
			groupId, sostojanie_id, status_id, start, end);
	}

	/**
	* Returns an ordered range of all the izvewenijas that the user has permissions to view where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching izvewenijas that the user has permission to view
	*/
	public static List<Izvewenija> filterFindByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id,
		int start, int end, OrderByComparator<Izvewenija> orderByComparator) {
		return getPersistence()
				   .filterFindByCompanyIdGroupIdSostojanieIdStatusId(companyId,
			groupId, sostojanie_id, status_id, start, end, orderByComparator);
	}

	/**
	* Returns the izvewenijas before and after the current izvewenija in the ordered set of izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* @param izvewenija_id the primary key of the current izvewenija
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next izvewenija
	* @throws NoSuchIzvewenijaException if a izvewenija with the primary key could not be found
	*/
	public static Izvewenija[] filterFindByCompanyIdGroupIdSostojanieIdStatusId_PrevAndNext(
		long izvewenija_id, long companyId, long groupId, long sostojanie_id,
		long status_id, OrderByComparator<Izvewenija> orderByComparator)
		throws tj.izvewenija.exception.NoSuchIzvewenijaException {
		return getPersistence()
				   .filterFindByCompanyIdGroupIdSostojanieIdStatusId_PrevAndNext(izvewenija_id,
			companyId, groupId, sostojanie_id, status_id, orderByComparator);
	}

	/**
	* Returns all the izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_ids the sostojanie_ids
	* @param status_ids the status_ids
	* @return the matching izvewenijas that the user has permission to view
	*/
	public static List<Izvewenija> filterFindByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids) {
		return getPersistence()
				   .filterFindByCompanyIdGroupIdSostojanieIdStatusId(companyId,
			groupId, sostojanie_ids, status_ids);
	}

	/**
	* Returns a range of all the izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_ids the sostojanie_ids
	* @param status_ids the status_ids
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @return the range of matching izvewenijas that the user has permission to view
	*/
	public static List<Izvewenija> filterFindByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids,
		int start, int end) {
		return getPersistence()
				   .filterFindByCompanyIdGroupIdSostojanieIdStatusId(companyId,
			groupId, sostojanie_ids, status_ids, start, end);
	}

	/**
	* Returns an ordered range of all the izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_ids the sostojanie_ids
	* @param status_ids the status_ids
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching izvewenijas that the user has permission to view
	*/
	public static List<Izvewenija> filterFindByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids,
		int start, int end, OrderByComparator<Izvewenija> orderByComparator) {
		return getPersistence()
				   .filterFindByCompanyIdGroupIdSostojanieIdStatusId(companyId,
			groupId, sostojanie_ids, status_ids, start, end, orderByComparator);
	}

	/**
	* Returns all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_ids the sostojanie_ids
	* @param status_ids the status_ids
	* @return the matching izvewenijas
	*/
	public static List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids) {
		return getPersistence()
				   .findByCompanyIdGroupIdSostojanieIdStatusId(companyId,
			groupId, sostojanie_ids, status_ids);
	}

	/**
	* Returns a range of all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_ids the sostojanie_ids
	* @param status_ids the status_ids
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @return the range of matching izvewenijas
	*/
	public static List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids,
		int start, int end) {
		return getPersistence()
				   .findByCompanyIdGroupIdSostojanieIdStatusId(companyId,
			groupId, sostojanie_ids, status_ids, start, end);
	}

	/**
	* Returns an ordered range of all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_ids the sostojanie_ids
	* @param status_ids the status_ids
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching izvewenijas
	*/
	public static List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids,
		int start, int end, OrderByComparator<Izvewenija> orderByComparator) {
		return getPersistence()
				   .findByCompanyIdGroupIdSostojanieIdStatusId(companyId,
			groupId, sostojanie_ids, status_ids, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching izvewenijas
	*/
	public static List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids,
		int start, int end, OrderByComparator<Izvewenija> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCompanyIdGroupIdSostojanieIdStatusId(companyId,
			groupId, sostojanie_ids, status_ids, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Removes all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	*/
	public static void removeByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id) {
		getPersistence()
			.removeByCompanyIdGroupIdSostojanieIdStatusId(companyId, groupId,
			sostojanie_id, status_id);
	}

	/**
	* Returns the number of izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @return the number of matching izvewenijas
	*/
	public static int countByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id) {
		return getPersistence()
				   .countByCompanyIdGroupIdSostojanieIdStatusId(companyId,
			groupId, sostojanie_id, status_id);
	}

	/**
	* Returns the number of izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_ids the sostojanie_ids
	* @param status_ids the status_ids
	* @return the number of matching izvewenijas
	*/
	public static int countByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids) {
		return getPersistence()
				   .countByCompanyIdGroupIdSostojanieIdStatusId(companyId,
			groupId, sostojanie_ids, status_ids);
	}

	/**
	* Returns the number of izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @return the number of matching izvewenijas that the user has permission to view
	*/
	public static int filterCountByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id) {
		return getPersistence()
				   .filterCountByCompanyIdGroupIdSostojanieIdStatusId(companyId,
			groupId, sostojanie_id, status_id);
	}

	/**
	* Returns the number of izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_ids the sostojanie_ids
	* @param status_ids the status_ids
	* @return the number of matching izvewenijas that the user has permission to view
	*/
	public static int filterCountByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids) {
		return getPersistence()
				   .filterCountByCompanyIdGroupIdSostojanieIdStatusId(companyId,
			groupId, sostojanie_ids, status_ids);
	}

	/**
	* Returns the izvewenija where UserGroupId = &#63; or throws a {@link NoSuchIzvewenijaException} if it could not be found.
	*
	* @param UserGroupId the user group ID
	* @return the matching izvewenija
	* @throws NoSuchIzvewenijaException if a matching izvewenija could not be found
	*/
	public static Izvewenija findByUserGroupId(long UserGroupId)
		throws tj.izvewenija.exception.NoSuchIzvewenijaException {
		return getPersistence().findByUserGroupId(UserGroupId);
	}

	/**
	* Returns the izvewenija where UserGroupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param UserGroupId the user group ID
	* @return the matching izvewenija, or <code>null</code> if a matching izvewenija could not be found
	*/
	public static Izvewenija fetchByUserGroupId(long UserGroupId) {
		return getPersistence().fetchByUserGroupId(UserGroupId);
	}

	/**
	* Returns the izvewenija where UserGroupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param UserGroupId the user group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching izvewenija, or <code>null</code> if a matching izvewenija could not be found
	*/
	public static Izvewenija fetchByUserGroupId(long UserGroupId,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByUserGroupId(UserGroupId, retrieveFromCache);
	}

	/**
	* Removes the izvewenija where UserGroupId = &#63; from the database.
	*
	* @param UserGroupId the user group ID
	* @return the izvewenija that was removed
	*/
	public static Izvewenija removeByUserGroupId(long UserGroupId)
		throws tj.izvewenija.exception.NoSuchIzvewenijaException {
		return getPersistence().removeByUserGroupId(UserGroupId);
	}

	/**
	* Returns the number of izvewenijas where UserGroupId = &#63;.
	*
	* @param UserGroupId the user group ID
	* @return the number of matching izvewenijas
	*/
	public static int countByUserGroupId(long UserGroupId) {
		return getPersistence().countByUserGroupId(UserGroupId);
	}

	/**
	* Caches the izvewenija in the entity cache if it is enabled.
	*
	* @param izvewenija the izvewenija
	*/
	public static void cacheResult(Izvewenija izvewenija) {
		getPersistence().cacheResult(izvewenija);
	}

	/**
	* Caches the izvewenijas in the entity cache if it is enabled.
	*
	* @param izvewenijas the izvewenijas
	*/
	public static void cacheResult(List<Izvewenija> izvewenijas) {
		getPersistence().cacheResult(izvewenijas);
	}

	/**
	* Creates a new izvewenija with the primary key. Does not add the izvewenija to the database.
	*
	* @param izvewenija_id the primary key for the new izvewenija
	* @return the new izvewenija
	*/
	public static Izvewenija create(long izvewenija_id) {
		return getPersistence().create(izvewenija_id);
	}

	/**
	* Removes the izvewenija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param izvewenija_id the primary key of the izvewenija
	* @return the izvewenija that was removed
	* @throws NoSuchIzvewenijaException if a izvewenija with the primary key could not be found
	*/
	public static Izvewenija remove(long izvewenija_id)
		throws tj.izvewenija.exception.NoSuchIzvewenijaException {
		return getPersistence().remove(izvewenija_id);
	}

	public static Izvewenija updateImpl(Izvewenija izvewenija) {
		return getPersistence().updateImpl(izvewenija);
	}

	/**
	* Returns the izvewenija with the primary key or throws a {@link NoSuchIzvewenijaException} if it could not be found.
	*
	* @param izvewenija_id the primary key of the izvewenija
	* @return the izvewenija
	* @throws NoSuchIzvewenijaException if a izvewenija with the primary key could not be found
	*/
	public static Izvewenija findByPrimaryKey(long izvewenija_id)
		throws tj.izvewenija.exception.NoSuchIzvewenijaException {
		return getPersistence().findByPrimaryKey(izvewenija_id);
	}

	/**
	* Returns the izvewenija with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param izvewenija_id the primary key of the izvewenija
	* @return the izvewenija, or <code>null</code> if a izvewenija with the primary key could not be found
	*/
	public static Izvewenija fetchByPrimaryKey(long izvewenija_id) {
		return getPersistence().fetchByPrimaryKey(izvewenija_id);
	}

	public static java.util.Map<java.io.Serializable, Izvewenija> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the izvewenijas.
	*
	* @return the izvewenijas
	*/
	public static List<Izvewenija> findAll() {
		return getPersistence().findAll();
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
	public static List<Izvewenija> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<Izvewenija> findAll(int start, int end,
		OrderByComparator<Izvewenija> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<Izvewenija> findAll(int start, int end,
		OrderByComparator<Izvewenija> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the izvewenijas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of izvewenijas.
	*
	* @return the number of izvewenijas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static IzvewenijaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<IzvewenijaPersistence, IzvewenijaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(IzvewenijaPersistence.class);
}