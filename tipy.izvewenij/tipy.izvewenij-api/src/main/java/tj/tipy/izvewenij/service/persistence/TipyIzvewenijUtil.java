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

package tj.tipy.izvewenij.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.tipy.izvewenij.model.TipyIzvewenij;

import java.util.List;

/**
 * The persistence utility for the tipy izvewenij service. This utility wraps {@link tj.tipy.izvewenij.service.persistence.impl.TipyIzvewenijPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TipyIzvewenijPersistence
 * @see tj.tipy.izvewenij.service.persistence.impl.TipyIzvewenijPersistenceImpl
 * @generated
 */
@ProviderType
public class TipyIzvewenijUtil {
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
	public static void clearCache(TipyIzvewenij tipyIzvewenij) {
		getPersistence().clearCache(tipyIzvewenij);
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
	public static List<TipyIzvewenij> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TipyIzvewenij> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TipyIzvewenij> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TipyIzvewenij> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TipyIzvewenij update(TipyIzvewenij tipyIzvewenij) {
		return getPersistence().update(tipyIzvewenij);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TipyIzvewenij update(TipyIzvewenij tipyIzvewenij,
		ServiceContext serviceContext) {
		return getPersistence().update(tipyIzvewenij, serviceContext);
	}

	/**
	* Caches the tipy izvewenij in the entity cache if it is enabled.
	*
	* @param tipyIzvewenij the tipy izvewenij
	*/
	public static void cacheResult(TipyIzvewenij tipyIzvewenij) {
		getPersistence().cacheResult(tipyIzvewenij);
	}

	/**
	* Caches the tipy izvewenijs in the entity cache if it is enabled.
	*
	* @param tipyIzvewenijs the tipy izvewenijs
	*/
	public static void cacheResult(List<TipyIzvewenij> tipyIzvewenijs) {
		getPersistence().cacheResult(tipyIzvewenijs);
	}

	/**
	* Creates a new tipy izvewenij with the primary key. Does not add the tipy izvewenij to the database.
	*
	* @param tipy_izvewenij_id the primary key for the new tipy izvewenij
	* @return the new tipy izvewenij
	*/
	public static TipyIzvewenij create(long tipy_izvewenij_id) {
		return getPersistence().create(tipy_izvewenij_id);
	}

	/**
	* Removes the tipy izvewenij with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tipy_izvewenij_id the primary key of the tipy izvewenij
	* @return the tipy izvewenij that was removed
	* @throws NoSuchTipyIzvewenijException if a tipy izvewenij with the primary key could not be found
	*/
	public static TipyIzvewenij remove(long tipy_izvewenij_id)
		throws tj.tipy.izvewenij.exception.NoSuchTipyIzvewenijException {
		return getPersistence().remove(tipy_izvewenij_id);
	}

	public static TipyIzvewenij updateImpl(TipyIzvewenij tipyIzvewenij) {
		return getPersistence().updateImpl(tipyIzvewenij);
	}

	/**
	* Returns the tipy izvewenij with the primary key or throws a {@link NoSuchTipyIzvewenijException} if it could not be found.
	*
	* @param tipy_izvewenij_id the primary key of the tipy izvewenij
	* @return the tipy izvewenij
	* @throws NoSuchTipyIzvewenijException if a tipy izvewenij with the primary key could not be found
	*/
	public static TipyIzvewenij findByPrimaryKey(long tipy_izvewenij_id)
		throws tj.tipy.izvewenij.exception.NoSuchTipyIzvewenijException {
		return getPersistence().findByPrimaryKey(tipy_izvewenij_id);
	}

	/**
	* Returns the tipy izvewenij with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tipy_izvewenij_id the primary key of the tipy izvewenij
	* @return the tipy izvewenij, or <code>null</code> if a tipy izvewenij with the primary key could not be found
	*/
	public static TipyIzvewenij fetchByPrimaryKey(long tipy_izvewenij_id) {
		return getPersistence().fetchByPrimaryKey(tipy_izvewenij_id);
	}

	public static java.util.Map<java.io.Serializable, TipyIzvewenij> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the tipy izvewenijs.
	*
	* @return the tipy izvewenijs
	*/
	public static List<TipyIzvewenij> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tipy izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipyIzvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy izvewenijs
	* @param end the upper bound of the range of tipy izvewenijs (not inclusive)
	* @return the range of tipy izvewenijs
	*/
	public static List<TipyIzvewenij> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tipy izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipyIzvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy izvewenijs
	* @param end the upper bound of the range of tipy izvewenijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tipy izvewenijs
	*/
	public static List<TipyIzvewenij> findAll(int start, int end,
		OrderByComparator<TipyIzvewenij> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the tipy izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipyIzvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy izvewenijs
	* @param end the upper bound of the range of tipy izvewenijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of tipy izvewenijs
	*/
	public static List<TipyIzvewenij> findAll(int start, int end,
		OrderByComparator<TipyIzvewenij> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the tipy izvewenijs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tipy izvewenijs.
	*
	* @return the number of tipy izvewenijs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TipyIzvewenijPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TipyIzvewenijPersistence, TipyIzvewenijPersistence> _serviceTracker =
		ServiceTrackerFactory.open(TipyIzvewenijPersistence.class);
}