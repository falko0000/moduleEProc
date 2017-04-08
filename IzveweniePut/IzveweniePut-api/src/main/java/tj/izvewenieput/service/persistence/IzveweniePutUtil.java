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

package tj.izvewenieput.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.izvewenieput.model.IzveweniePut;

import java.util.List;

/**
 * The persistence utility for the izvewenie put service. This utility wraps {@link tj.izvewenieput.service.persistence.impl.IzveweniePutPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IzveweniePutPersistence
 * @see tj.izvewenieput.service.persistence.impl.IzveweniePutPersistenceImpl
 * @generated
 */
@ProviderType
public class IzveweniePutUtil {
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
	public static void clearCache(IzveweniePut izveweniePut) {
		getPersistence().clearCache(izveweniePut);
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
	public static List<IzveweniePut> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<IzveweniePut> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<IzveweniePut> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<IzveweniePut> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static IzveweniePut update(IzveweniePut izveweniePut) {
		return getPersistence().update(izveweniePut);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static IzveweniePut update(IzveweniePut izveweniePut,
		ServiceContext serviceContext) {
		return getPersistence().update(izveweniePut, serviceContext);
	}

	/**
	* Returns the izvewenie put where izvewenie_id = &#63; or throws a {@link NoSuchIzveweniePutException} if it could not be found.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching izvewenie put
	* @throws NoSuchIzveweniePutException if a matching izvewenie put could not be found
	*/
	public static IzveweniePut findByIzvewenieId(long izvewenie_id)
		throws tj.izvewenieput.exception.NoSuchIzveweniePutException {
		return getPersistence().findByIzvewenieId(izvewenie_id);
	}

	/**
	* Returns the izvewenie put where izvewenie_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching izvewenie put, or <code>null</code> if a matching izvewenie put could not be found
	*/
	public static IzveweniePut fetchByIzvewenieId(long izvewenie_id) {
		return getPersistence().fetchByIzvewenieId(izvewenie_id);
	}

	/**
	* Returns the izvewenie put where izvewenie_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param izvewenie_id the izvewenie_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching izvewenie put, or <code>null</code> if a matching izvewenie put could not be found
	*/
	public static IzveweniePut fetchByIzvewenieId(long izvewenie_id,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByIzvewenieId(izvewenie_id, retrieveFromCache);
	}

	/**
	* Removes the izvewenie put where izvewenie_id = &#63; from the database.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the izvewenie put that was removed
	*/
	public static IzveweniePut removeByIzvewenieId(long izvewenie_id)
		throws tj.izvewenieput.exception.NoSuchIzveweniePutException {
		return getPersistence().removeByIzvewenieId(izvewenie_id);
	}

	/**
	* Returns the number of izvewenie puts where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the number of matching izvewenie puts
	*/
	public static int countByIzvewenieId(long izvewenie_id) {
		return getPersistence().countByIzvewenieId(izvewenie_id);
	}

	/**
	* Caches the izvewenie put in the entity cache if it is enabled.
	*
	* @param izveweniePut the izvewenie put
	*/
	public static void cacheResult(IzveweniePut izveweniePut) {
		getPersistence().cacheResult(izveweniePut);
	}

	/**
	* Caches the izvewenie puts in the entity cache if it is enabled.
	*
	* @param izveweniePuts the izvewenie puts
	*/
	public static void cacheResult(List<IzveweniePut> izveweniePuts) {
		getPersistence().cacheResult(izveweniePuts);
	}

	/**
	* Creates a new izvewenie put with the primary key. Does not add the izvewenie put to the database.
	*
	* @param izvewenie_put_id the primary key for the new izvewenie put
	* @return the new izvewenie put
	*/
	public static IzveweniePut create(long izvewenie_put_id) {
		return getPersistence().create(izvewenie_put_id);
	}

	/**
	* Removes the izvewenie put with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param izvewenie_put_id the primary key of the izvewenie put
	* @return the izvewenie put that was removed
	* @throws NoSuchIzveweniePutException if a izvewenie put with the primary key could not be found
	*/
	public static IzveweniePut remove(long izvewenie_put_id)
		throws tj.izvewenieput.exception.NoSuchIzveweniePutException {
		return getPersistence().remove(izvewenie_put_id);
	}

	public static IzveweniePut updateImpl(IzveweniePut izveweniePut) {
		return getPersistence().updateImpl(izveweniePut);
	}

	/**
	* Returns the izvewenie put with the primary key or throws a {@link NoSuchIzveweniePutException} if it could not be found.
	*
	* @param izvewenie_put_id the primary key of the izvewenie put
	* @return the izvewenie put
	* @throws NoSuchIzveweniePutException if a izvewenie put with the primary key could not be found
	*/
	public static IzveweniePut findByPrimaryKey(long izvewenie_put_id)
		throws tj.izvewenieput.exception.NoSuchIzveweniePutException {
		return getPersistence().findByPrimaryKey(izvewenie_put_id);
	}

	/**
	* Returns the izvewenie put with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param izvewenie_put_id the primary key of the izvewenie put
	* @return the izvewenie put, or <code>null</code> if a izvewenie put with the primary key could not be found
	*/
	public static IzveweniePut fetchByPrimaryKey(long izvewenie_put_id) {
		return getPersistence().fetchByPrimaryKey(izvewenie_put_id);
	}

	public static java.util.Map<java.io.Serializable, IzveweniePut> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the izvewenie puts.
	*
	* @return the izvewenie puts
	*/
	public static List<IzveweniePut> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the izvewenie puts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzveweniePutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenie puts
	* @param end the upper bound of the range of izvewenie puts (not inclusive)
	* @return the range of izvewenie puts
	*/
	public static List<IzveweniePut> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the izvewenie puts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzveweniePutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenie puts
	* @param end the upper bound of the range of izvewenie puts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of izvewenie puts
	*/
	public static List<IzveweniePut> findAll(int start, int end,
		OrderByComparator<IzveweniePut> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the izvewenie puts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzveweniePutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenie puts
	* @param end the upper bound of the range of izvewenie puts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of izvewenie puts
	*/
	public static List<IzveweniePut> findAll(int start, int end,
		OrderByComparator<IzveweniePut> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the izvewenie puts from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of izvewenie puts.
	*
	* @return the number of izvewenie puts
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static IzveweniePutPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<IzveweniePutPersistence, IzveweniePutPersistence> _serviceTracker =
		ServiceTrackerFactory.open(IzveweniePutPersistence.class);
}