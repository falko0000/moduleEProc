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

import tj.sapp.services.model.VW_Izvewenija;

import java.util.List;

/**
 * The persistence utility for the v w_ izvewenija service. This utility wraps {@link tj.sapp.services.service.persistence.impl.VW_IzvewenijaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VW_IzvewenijaPersistence
 * @see tj.sapp.services.service.persistence.impl.VW_IzvewenijaPersistenceImpl
 * @generated
 */
@ProviderType
public class VW_IzvewenijaUtil {
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
	public static void clearCache(VW_Izvewenija vw_Izvewenija) {
		getPersistence().clearCache(vw_Izvewenija);
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
	public static List<VW_Izvewenija> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VW_Izvewenija> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VW_Izvewenija> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VW_Izvewenija> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VW_Izvewenija update(VW_Izvewenija vw_Izvewenija) {
		return getPersistence().update(vw_Izvewenija);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VW_Izvewenija update(VW_Izvewenija vw_Izvewenija,
		ServiceContext serviceContext) {
		return getPersistence().update(vw_Izvewenija, serviceContext);
	}

	/**
	* Caches the v w_ izvewenija in the entity cache if it is enabled.
	*
	* @param vw_Izvewenija the v w_ izvewenija
	*/
	public static void cacheResult(VW_Izvewenija vw_Izvewenija) {
		getPersistence().cacheResult(vw_Izvewenija);
	}

	/**
	* Caches the v w_ izvewenijas in the entity cache if it is enabled.
	*
	* @param vw_Izvewenijas the v w_ izvewenijas
	*/
	public static void cacheResult(List<VW_Izvewenija> vw_Izvewenijas) {
		getPersistence().cacheResult(vw_Izvewenijas);
	}

	/**
	* Creates a new v w_ izvewenija with the primary key. Does not add the v w_ izvewenija to the database.
	*
	* @param izvewenija_id the primary key for the new v w_ izvewenija
	* @return the new v w_ izvewenija
	*/
	public static VW_Izvewenija create(long izvewenija_id) {
		return getPersistence().create(izvewenija_id);
	}

	/**
	* Removes the v w_ izvewenija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param izvewenija_id the primary key of the v w_ izvewenija
	* @return the v w_ izvewenija that was removed
	* @throws NoSuchVW_IzvewenijaException if a v w_ izvewenija with the primary key could not be found
	*/
	public static VW_Izvewenija remove(long izvewenija_id)
		throws tj.sapp.services.exception.NoSuchVW_IzvewenijaException {
		return getPersistence().remove(izvewenija_id);
	}

	public static VW_Izvewenija updateImpl(VW_Izvewenija vw_Izvewenija) {
		return getPersistence().updateImpl(vw_Izvewenija);
	}

	/**
	* Returns the v w_ izvewenija with the primary key or throws a {@link NoSuchVW_IzvewenijaException} if it could not be found.
	*
	* @param izvewenija_id the primary key of the v w_ izvewenija
	* @return the v w_ izvewenija
	* @throws NoSuchVW_IzvewenijaException if a v w_ izvewenija with the primary key could not be found
	*/
	public static VW_Izvewenija findByPrimaryKey(long izvewenija_id)
		throws tj.sapp.services.exception.NoSuchVW_IzvewenijaException {
		return getPersistence().findByPrimaryKey(izvewenija_id);
	}

	/**
	* Returns the v w_ izvewenija with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param izvewenija_id the primary key of the v w_ izvewenija
	* @return the v w_ izvewenija, or <code>null</code> if a v w_ izvewenija with the primary key could not be found
	*/
	public static VW_Izvewenija fetchByPrimaryKey(long izvewenija_id) {
		return getPersistence().fetchByPrimaryKey(izvewenija_id);
	}

	public static java.util.Map<java.io.Serializable, VW_Izvewenija> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the v w_ izvewenijas.
	*
	* @return the v w_ izvewenijas
	*/
	public static List<VW_Izvewenija> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the v w_ izvewenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VW_IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v w_ izvewenijas
	* @param end the upper bound of the range of v w_ izvewenijas (not inclusive)
	* @return the range of v w_ izvewenijas
	*/
	public static List<VW_Izvewenija> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the v w_ izvewenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VW_IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v w_ izvewenijas
	* @param end the upper bound of the range of v w_ izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v w_ izvewenijas
	*/
	public static List<VW_Izvewenija> findAll(int start, int end,
		OrderByComparator<VW_Izvewenija> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v w_ izvewenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VW_IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v w_ izvewenijas
	* @param end the upper bound of the range of v w_ izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v w_ izvewenijas
	*/
	public static List<VW_Izvewenija> findAll(int start, int end,
		OrderByComparator<VW_Izvewenija> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the v w_ izvewenijas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of v w_ izvewenijas.
	*
	* @return the number of v w_ izvewenijas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VW_IzvewenijaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VW_IzvewenijaPersistence, VW_IzvewenijaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VW_IzvewenijaPersistence.class);
}