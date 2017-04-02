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

package tj.vbk.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.vbk.model.Vbk;

import java.util.List;

/**
 * The persistence utility for the vbk service. This utility wraps {@link tj.vbk.service.persistence.impl.VbkPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VbkPersistence
 * @see tj.vbk.service.persistence.impl.VbkPersistenceImpl
 * @generated
 */
@ProviderType
public class VbkUtil {
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
	public static void clearCache(Vbk vbk) {
		getPersistence().clearCache(vbk);
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
	public static List<Vbk> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Vbk> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Vbk> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Vbk> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Vbk update(Vbk vbk) {
		return getPersistence().update(vbk);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Vbk update(Vbk vbk, ServiceContext serviceContext) {
		return getPersistence().update(vbk, serviceContext);
	}

	/**
	* Caches the vbk in the entity cache if it is enabled.
	*
	* @param vbk the vbk
	*/
	public static void cacheResult(Vbk vbk) {
		getPersistence().cacheResult(vbk);
	}

	/**
	* Caches the vbks in the entity cache if it is enabled.
	*
	* @param vbks the vbks
	*/
	public static void cacheResult(List<Vbk> vbks) {
		getPersistence().cacheResult(vbks);
	}

	/**
	* Creates a new vbk with the primary key. Does not add the vbk to the database.
	*
	* @param vbk_id the primary key for the new vbk
	* @return the new vbk
	*/
	public static Vbk create(long vbk_id) {
		return getPersistence().create(vbk_id);
	}

	/**
	* Removes the vbk with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vbk_id the primary key of the vbk
	* @return the vbk that was removed
	* @throws NoSuchVbkException if a vbk with the primary key could not be found
	*/
	public static Vbk remove(long vbk_id)
		throws tj.vbk.exception.NoSuchVbkException {
		return getPersistence().remove(vbk_id);
	}

	public static Vbk updateImpl(Vbk vbk) {
		return getPersistence().updateImpl(vbk);
	}

	/**
	* Returns the vbk with the primary key or throws a {@link NoSuchVbkException} if it could not be found.
	*
	* @param vbk_id the primary key of the vbk
	* @return the vbk
	* @throws NoSuchVbkException if a vbk with the primary key could not be found
	*/
	public static Vbk findByPrimaryKey(long vbk_id)
		throws tj.vbk.exception.NoSuchVbkException {
		return getPersistence().findByPrimaryKey(vbk_id);
	}

	/**
	* Returns the vbk with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vbk_id the primary key of the vbk
	* @return the vbk, or <code>null</code> if a vbk with the primary key could not be found
	*/
	public static Vbk fetchByPrimaryKey(long vbk_id) {
		return getPersistence().fetchByPrimaryKey(vbk_id);
	}

	public static java.util.Map<java.io.Serializable, Vbk> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vbks.
	*
	* @return the vbks
	*/
	public static List<Vbk> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vbks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vbks
	* @param end the upper bound of the range of vbks (not inclusive)
	* @return the range of vbks
	*/
	public static List<Vbk> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vbks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vbks
	* @param end the upper bound of the range of vbks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vbks
	*/
	public static List<Vbk> findAll(int start, int end,
		OrderByComparator<Vbk> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vbks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vbks
	* @param end the upper bound of the range of vbks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vbks
	*/
	public static List<Vbk> findAll(int start, int end,
		OrderByComparator<Vbk> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vbks from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vbks.
	*
	* @return the number of vbks
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VbkPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VbkPersistence, VbkPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VbkPersistence.class);
}