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

package tj.jekb.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.jekb.model.Jekb;

import java.util.List;

/**
 * The persistence utility for the jekb service. This utility wraps {@link tj.jekb.service.persistence.impl.JekbPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author falko
 * @see JekbPersistence
 * @see tj.jekb.service.persistence.impl.JekbPersistenceImpl
 * @generated
 */
@ProviderType
public class JekbUtil {
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
	public static void clearCache(Jekb jekb) {
		getPersistence().clearCache(jekb);
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
	public static List<Jekb> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Jekb> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Jekb> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Jekb> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Jekb update(Jekb jekb) {
		return getPersistence().update(jekb);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Jekb update(Jekb jekb, ServiceContext serviceContext) {
		return getPersistence().update(jekb, serviceContext);
	}

	/**
	* Caches the jekb in the entity cache if it is enabled.
	*
	* @param jekb the jekb
	*/
	public static void cacheResult(Jekb jekb) {
		getPersistence().cacheResult(jekb);
	}

	/**
	* Caches the jekbs in the entity cache if it is enabled.
	*
	* @param jekbs the jekbs
	*/
	public static void cacheResult(List<Jekb> jekbs) {
		getPersistence().cacheResult(jekbs);
	}

	/**
	* Creates a new jekb with the primary key. Does not add the jekb to the database.
	*
	* @param jekb_id the primary key for the new jekb
	* @return the new jekb
	*/
	public static Jekb create(long jekb_id) {
		return getPersistence().create(jekb_id);
	}

	/**
	* Removes the jekb with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jekb_id the primary key of the jekb
	* @return the jekb that was removed
	* @throws NoSuchJekbException if a jekb with the primary key could not be found
	*/
	public static Jekb remove(long jekb_id)
		throws tj.jekb.exception.NoSuchJekbException {
		return getPersistence().remove(jekb_id);
	}

	public static Jekb updateImpl(Jekb jekb) {
		return getPersistence().updateImpl(jekb);
	}

	/**
	* Returns the jekb with the primary key or throws a {@link NoSuchJekbException} if it could not be found.
	*
	* @param jekb_id the primary key of the jekb
	* @return the jekb
	* @throws NoSuchJekbException if a jekb with the primary key could not be found
	*/
	public static Jekb findByPrimaryKey(long jekb_id)
		throws tj.jekb.exception.NoSuchJekbException {
		return getPersistence().findByPrimaryKey(jekb_id);
	}

	/**
	* Returns the jekb with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jekb_id the primary key of the jekb
	* @return the jekb, or <code>null</code> if a jekb with the primary key could not be found
	*/
	public static Jekb fetchByPrimaryKey(long jekb_id) {
		return getPersistence().fetchByPrimaryKey(jekb_id);
	}

	public static java.util.Map<java.io.Serializable, Jekb> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the jekbs.
	*
	* @return the jekbs
	*/
	public static List<Jekb> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the jekbs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JekbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jekbs
	* @param end the upper bound of the range of jekbs (not inclusive)
	* @return the range of jekbs
	*/
	public static List<Jekb> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the jekbs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JekbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jekbs
	* @param end the upper bound of the range of jekbs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of jekbs
	*/
	public static List<Jekb> findAll(int start, int end,
		OrderByComparator<Jekb> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the jekbs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JekbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jekbs
	* @param end the upper bound of the range of jekbs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of jekbs
	*/
	public static List<Jekb> findAll(int start, int end,
		OrderByComparator<Jekb> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the jekbs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of jekbs.
	*
	* @return the number of jekbs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JekbPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<JekbPersistence, JekbPersistence> _serviceTracker =
		ServiceTrackerFactory.open(JekbPersistence.class);
}