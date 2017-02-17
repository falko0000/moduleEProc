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

package tj.sapp.services.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.sapp.services.model.Rajony;

import java.util.List;

/**
 * The persistence utility for the Rajony service. This utility wraps {@link tj.sapp.services.service.persistence.impl.RajonyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RajonyPersistence
 * @see tj.sapp.services.service.persistence.impl.RajonyPersistenceImpl
 * @generated
 */
@ProviderType
public class RajonyUtil {
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
	public static void clearCache(Rajony rajony) {
		getPersistence().clearCache(rajony);
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
	public static List<Rajony> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Rajony> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Rajony> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Rajony> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Rajony update(Rajony rajony) {
		return getPersistence().update(rajony);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Rajony update(Rajony rajony, ServiceContext serviceContext) {
		return getPersistence().update(rajony, serviceContext);
	}

	/**
	* Returns all the Rajonies where nazvanie = &#63;.
	*
	* @param nazvanie the nazvanie
	* @return the matching Rajonies
	*/
	public static List<Rajony> findByAll(java.lang.String nazvanie) {
		return getPersistence().findByAll(nazvanie);
	}

	/**
	* Returns a range of all the Rajonies where nazvanie = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nazvanie the nazvanie
	* @param start the lower bound of the range of Rajonies
	* @param end the upper bound of the range of Rajonies (not inclusive)
	* @return the range of matching Rajonies
	*/
	public static List<Rajony> findByAll(java.lang.String nazvanie, int start,
		int end) {
		return getPersistence().findByAll(nazvanie, start, end);
	}

	/**
	* Returns an ordered range of all the Rajonies where nazvanie = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nazvanie the nazvanie
	* @param start the lower bound of the range of Rajonies
	* @param end the upper bound of the range of Rajonies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Rajonies
	*/
	public static List<Rajony> findByAll(java.lang.String nazvanie, int start,
		int end, OrderByComparator<Rajony> orderByComparator) {
		return getPersistence()
				   .findByAll(nazvanie, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the Rajonies where nazvanie = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nazvanie the nazvanie
	* @param start the lower bound of the range of Rajonies
	* @param end the upper bound of the range of Rajonies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching Rajonies
	*/
	public static List<Rajony> findByAll(java.lang.String nazvanie, int start,
		int end, OrderByComparator<Rajony> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByAll(nazvanie, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first Rajony in the ordered set where nazvanie = &#63;.
	*
	* @param nazvanie the nazvanie
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Rajony
	* @throws NoSuchRajonyException if a matching Rajony could not be found
	*/
	public static Rajony findByAll_First(java.lang.String nazvanie,
		OrderByComparator<Rajony> orderByComparator)
		throws tj.sapp.services.exception.NoSuchRajonyException {
		return getPersistence().findByAll_First(nazvanie, orderByComparator);
	}

	/**
	* Returns the first Rajony in the ordered set where nazvanie = &#63;.
	*
	* @param nazvanie the nazvanie
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Rajony, or <code>null</code> if a matching Rajony could not be found
	*/
	public static Rajony fetchByAll_First(java.lang.String nazvanie,
		OrderByComparator<Rajony> orderByComparator) {
		return getPersistence().fetchByAll_First(nazvanie, orderByComparator);
	}

	/**
	* Returns the last Rajony in the ordered set where nazvanie = &#63;.
	*
	* @param nazvanie the nazvanie
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Rajony
	* @throws NoSuchRajonyException if a matching Rajony could not be found
	*/
	public static Rajony findByAll_Last(java.lang.String nazvanie,
		OrderByComparator<Rajony> orderByComparator)
		throws tj.sapp.services.exception.NoSuchRajonyException {
		return getPersistence().findByAll_Last(nazvanie, orderByComparator);
	}

	/**
	* Returns the last Rajony in the ordered set where nazvanie = &#63;.
	*
	* @param nazvanie the nazvanie
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Rajony, or <code>null</code> if a matching Rajony could not be found
	*/
	public static Rajony fetchByAll_Last(java.lang.String nazvanie,
		OrderByComparator<Rajony> orderByComparator) {
		return getPersistence().fetchByAll_Last(nazvanie, orderByComparator);
	}

	/**
	* Returns the Rajonies before and after the current Rajony in the ordered set where nazvanie = &#63;.
	*
	* @param rajony_id the primary key of the current Rajony
	* @param nazvanie the nazvanie
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Rajony
	* @throws NoSuchRajonyException if a Rajony with the primary key could not be found
	*/
	public static Rajony[] findByAll_PrevAndNext(long rajony_id,
		java.lang.String nazvanie, OrderByComparator<Rajony> orderByComparator)
		throws tj.sapp.services.exception.NoSuchRajonyException {
		return getPersistence()
				   .findByAll_PrevAndNext(rajony_id, nazvanie, orderByComparator);
	}

	/**
	* Removes all the Rajonies where nazvanie = &#63; from the database.
	*
	* @param nazvanie the nazvanie
	*/
	public static void removeByAll(java.lang.String nazvanie) {
		getPersistence().removeByAll(nazvanie);
	}

	/**
	* Returns the number of Rajonies where nazvanie = &#63;.
	*
	* @param nazvanie the nazvanie
	* @return the number of matching Rajonies
	*/
	public static int countByAll(java.lang.String nazvanie) {
		return getPersistence().countByAll(nazvanie);
	}

	/**
	* Caches the Rajony in the entity cache if it is enabled.
	*
	* @param rajony the Rajony
	*/
	public static void cacheResult(Rajony rajony) {
		getPersistence().cacheResult(rajony);
	}

	/**
	* Caches the Rajonies in the entity cache if it is enabled.
	*
	* @param rajonies the Rajonies
	*/
	public static void cacheResult(List<Rajony> rajonies) {
		getPersistence().cacheResult(rajonies);
	}

	/**
	* Creates a new Rajony with the primary key. Does not add the Rajony to the database.
	*
	* @param rajony_id the primary key for the new Rajony
	* @return the new Rajony
	*/
	public static Rajony create(long rajony_id) {
		return getPersistence().create(rajony_id);
	}

	/**
	* Removes the Rajony with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param rajony_id the primary key of the Rajony
	* @return the Rajony that was removed
	* @throws NoSuchRajonyException if a Rajony with the primary key could not be found
	*/
	public static Rajony remove(long rajony_id)
		throws tj.sapp.services.exception.NoSuchRajonyException {
		return getPersistence().remove(rajony_id);
	}

	public static Rajony updateImpl(Rajony rajony) {
		return getPersistence().updateImpl(rajony);
	}

	/**
	* Returns the Rajony with the primary key or throws a {@link NoSuchRajonyException} if it could not be found.
	*
	* @param rajony_id the primary key of the Rajony
	* @return the Rajony
	* @throws NoSuchRajonyException if a Rajony with the primary key could not be found
	*/
	public static Rajony findByPrimaryKey(long rajony_id)
		throws tj.sapp.services.exception.NoSuchRajonyException {
		return getPersistence().findByPrimaryKey(rajony_id);
	}

	/**
	* Returns the Rajony with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param rajony_id the primary key of the Rajony
	* @return the Rajony, or <code>null</code> if a Rajony with the primary key could not be found
	*/
	public static Rajony fetchByPrimaryKey(long rajony_id) {
		return getPersistence().fetchByPrimaryKey(rajony_id);
	}

	public static java.util.Map<java.io.Serializable, Rajony> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the Rajonies.
	*
	* @return the Rajonies
	*/
	public static List<Rajony> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the Rajonies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Rajonies
	* @param end the upper bound of the range of Rajonies (not inclusive)
	* @return the range of Rajonies
	*/
	public static List<Rajony> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the Rajonies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Rajonies
	* @param end the upper bound of the range of Rajonies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Rajonies
	*/
	public static List<Rajony> findAll(int start, int end,
		OrderByComparator<Rajony> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the Rajonies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Rajonies
	* @param end the upper bound of the range of Rajonies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Rajonies
	*/
	public static List<Rajony> findAll(int start, int end,
		OrderByComparator<Rajony> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the Rajonies from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of Rajonies.
	*
	* @return the number of Rajonies
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RajonyPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RajonyPersistence, RajonyPersistence> _serviceTracker =
		ServiceTrackerFactory.open(RajonyPersistence.class);
}