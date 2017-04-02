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

package tj.edinicy.izmerenija.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.edinicy.izmerenija.model.EdinicyIzmerenija;

import java.util.List;

/**
 * The persistence utility for the edinicy izmerenija service. This utility wraps {@link tj.edinicy.izmerenija.service.persistence.impl.EdinicyIzmerenijaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EdinicyIzmerenijaPersistence
 * @see tj.edinicy.izmerenija.service.persistence.impl.EdinicyIzmerenijaPersistenceImpl
 * @generated
 */
@ProviderType
public class EdinicyIzmerenijaUtil {
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
	public static void clearCache(EdinicyIzmerenija edinicyIzmerenija) {
		getPersistence().clearCache(edinicyIzmerenija);
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
	public static List<EdinicyIzmerenija> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EdinicyIzmerenija> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EdinicyIzmerenija> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<EdinicyIzmerenija> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static EdinicyIzmerenija update(EdinicyIzmerenija edinicyIzmerenija) {
		return getPersistence().update(edinicyIzmerenija);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static EdinicyIzmerenija update(
		EdinicyIzmerenija edinicyIzmerenija, ServiceContext serviceContext) {
		return getPersistence().update(edinicyIzmerenija, serviceContext);
	}

	/**
	* Caches the edinicy izmerenija in the entity cache if it is enabled.
	*
	* @param edinicyIzmerenija the edinicy izmerenija
	*/
	public static void cacheResult(EdinicyIzmerenija edinicyIzmerenija) {
		getPersistence().cacheResult(edinicyIzmerenija);
	}

	/**
	* Caches the edinicy izmerenijas in the entity cache if it is enabled.
	*
	* @param edinicyIzmerenijas the edinicy izmerenijas
	*/
	public static void cacheResult(List<EdinicyIzmerenija> edinicyIzmerenijas) {
		getPersistence().cacheResult(edinicyIzmerenijas);
	}

	/**
	* Creates a new edinicy izmerenija with the primary key. Does not add the edinicy izmerenija to the database.
	*
	* @param edinicy_izmerenija_id the primary key for the new edinicy izmerenija
	* @return the new edinicy izmerenija
	*/
	public static EdinicyIzmerenija create(long edinicy_izmerenija_id) {
		return getPersistence().create(edinicy_izmerenija_id);
	}

	/**
	* Removes the edinicy izmerenija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param edinicy_izmerenija_id the primary key of the edinicy izmerenija
	* @return the edinicy izmerenija that was removed
	* @throws NoSuchEdinicyIzmerenijaException if a edinicy izmerenija with the primary key could not be found
	*/
	public static EdinicyIzmerenija remove(long edinicy_izmerenija_id)
		throws tj.edinicy.izmerenija.exception.NoSuchEdinicyIzmerenijaException {
		return getPersistence().remove(edinicy_izmerenija_id);
	}

	public static EdinicyIzmerenija updateImpl(
		EdinicyIzmerenija edinicyIzmerenija) {
		return getPersistence().updateImpl(edinicyIzmerenija);
	}

	/**
	* Returns the edinicy izmerenija with the primary key or throws a {@link NoSuchEdinicyIzmerenijaException} if it could not be found.
	*
	* @param edinicy_izmerenija_id the primary key of the edinicy izmerenija
	* @return the edinicy izmerenija
	* @throws NoSuchEdinicyIzmerenijaException if a edinicy izmerenija with the primary key could not be found
	*/
	public static EdinicyIzmerenija findByPrimaryKey(long edinicy_izmerenija_id)
		throws tj.edinicy.izmerenija.exception.NoSuchEdinicyIzmerenijaException {
		return getPersistence().findByPrimaryKey(edinicy_izmerenija_id);
	}

	/**
	* Returns the edinicy izmerenija with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param edinicy_izmerenija_id the primary key of the edinicy izmerenija
	* @return the edinicy izmerenija, or <code>null</code> if a edinicy izmerenija with the primary key could not be found
	*/
	public static EdinicyIzmerenija fetchByPrimaryKey(
		long edinicy_izmerenija_id) {
		return getPersistence().fetchByPrimaryKey(edinicy_izmerenija_id);
	}

	public static java.util.Map<java.io.Serializable, EdinicyIzmerenija> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the edinicy izmerenijas.
	*
	* @return the edinicy izmerenijas
	*/
	public static List<EdinicyIzmerenija> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the edinicy izmerenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EdinicyIzmerenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of edinicy izmerenijas
	* @param end the upper bound of the range of edinicy izmerenijas (not inclusive)
	* @return the range of edinicy izmerenijas
	*/
	public static List<EdinicyIzmerenija> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the edinicy izmerenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EdinicyIzmerenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of edinicy izmerenijas
	* @param end the upper bound of the range of edinicy izmerenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of edinicy izmerenijas
	*/
	public static List<EdinicyIzmerenija> findAll(int start, int end,
		OrderByComparator<EdinicyIzmerenija> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the edinicy izmerenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EdinicyIzmerenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of edinicy izmerenijas
	* @param end the upper bound of the range of edinicy izmerenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of edinicy izmerenijas
	*/
	public static List<EdinicyIzmerenija> findAll(int start, int end,
		OrderByComparator<EdinicyIzmerenija> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the edinicy izmerenijas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of edinicy izmerenijas.
	*
	* @return the number of edinicy izmerenijas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EdinicyIzmerenijaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<EdinicyIzmerenijaPersistence, EdinicyIzmerenijaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(EdinicyIzmerenijaPersistence.class);
}