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

package tj.istochnik.finansirovanija.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.istochnik.finansirovanija.model.IstochnikFinansirovanija;

import java.util.List;

/**
 * The persistence utility for the istochnik finansirovanija service. This utility wraps {@link tj.istochnik.finansirovanija.service.persistence.impl.IstochnikFinansirovanijaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IstochnikFinansirovanijaPersistence
 * @see tj.istochnik.finansirovanija.service.persistence.impl.IstochnikFinansirovanijaPersistenceImpl
 * @generated
 */
@ProviderType
public class IstochnikFinansirovanijaUtil {
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
	public static void clearCache(
		IstochnikFinansirovanija istochnikFinansirovanija) {
		getPersistence().clearCache(istochnikFinansirovanija);
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
	public static List<IstochnikFinansirovanija> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<IstochnikFinansirovanija> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<IstochnikFinansirovanija> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<IstochnikFinansirovanija> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static IstochnikFinansirovanija update(
		IstochnikFinansirovanija istochnikFinansirovanija) {
		return getPersistence().update(istochnikFinansirovanija);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static IstochnikFinansirovanija update(
		IstochnikFinansirovanija istochnikFinansirovanija,
		ServiceContext serviceContext) {
		return getPersistence().update(istochnikFinansirovanija, serviceContext);
	}

	/**
	* Caches the istochnik finansirovanija in the entity cache if it is enabled.
	*
	* @param istochnikFinansirovanija the istochnik finansirovanija
	*/
	public static void cacheResult(
		IstochnikFinansirovanija istochnikFinansirovanija) {
		getPersistence().cacheResult(istochnikFinansirovanija);
	}

	/**
	* Caches the istochnik finansirovanijas in the entity cache if it is enabled.
	*
	* @param istochnikFinansirovanijas the istochnik finansirovanijas
	*/
	public static void cacheResult(
		List<IstochnikFinansirovanija> istochnikFinansirovanijas) {
		getPersistence().cacheResult(istochnikFinansirovanijas);
	}

	/**
	* Creates a new istochnik finansirovanija with the primary key. Does not add the istochnik finansirovanija to the database.
	*
	* @param istochnik_finansirovanija_id the primary key for the new istochnik finansirovanija
	* @return the new istochnik finansirovanija
	*/
	public static IstochnikFinansirovanija create(
		long istochnik_finansirovanija_id) {
		return getPersistence().create(istochnik_finansirovanija_id);
	}

	/**
	* Removes the istochnik finansirovanija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param istochnik_finansirovanija_id the primary key of the istochnik finansirovanija
	* @return the istochnik finansirovanija that was removed
	* @throws NoSuchIstochnikFinansirovanijaException if a istochnik finansirovanija with the primary key could not be found
	*/
	public static IstochnikFinansirovanija remove(
		long istochnik_finansirovanija_id)
		throws tj.istochnik.finansirovanija.exception.NoSuchIstochnikFinansirovanijaException {
		return getPersistence().remove(istochnik_finansirovanija_id);
	}

	public static IstochnikFinansirovanija updateImpl(
		IstochnikFinansirovanija istochnikFinansirovanija) {
		return getPersistence().updateImpl(istochnikFinansirovanija);
	}

	/**
	* Returns the istochnik finansirovanija with the primary key or throws a {@link NoSuchIstochnikFinansirovanijaException} if it could not be found.
	*
	* @param istochnik_finansirovanija_id the primary key of the istochnik finansirovanija
	* @return the istochnik finansirovanija
	* @throws NoSuchIstochnikFinansirovanijaException if a istochnik finansirovanija with the primary key could not be found
	*/
	public static IstochnikFinansirovanija findByPrimaryKey(
		long istochnik_finansirovanija_id)
		throws tj.istochnik.finansirovanija.exception.NoSuchIstochnikFinansirovanijaException {
		return getPersistence().findByPrimaryKey(istochnik_finansirovanija_id);
	}

	/**
	* Returns the istochnik finansirovanija with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param istochnik_finansirovanija_id the primary key of the istochnik finansirovanija
	* @return the istochnik finansirovanija, or <code>null</code> if a istochnik finansirovanija with the primary key could not be found
	*/
	public static IstochnikFinansirovanija fetchByPrimaryKey(
		long istochnik_finansirovanija_id) {
		return getPersistence().fetchByPrimaryKey(istochnik_finansirovanija_id);
	}

	public static java.util.Map<java.io.Serializable, IstochnikFinansirovanija> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the istochnik finansirovanijas.
	*
	* @return the istochnik finansirovanijas
	*/
	public static List<IstochnikFinansirovanija> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the istochnik finansirovanijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IstochnikFinansirovanijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istochnik finansirovanijas
	* @param end the upper bound of the range of istochnik finansirovanijas (not inclusive)
	* @return the range of istochnik finansirovanijas
	*/
	public static List<IstochnikFinansirovanija> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the istochnik finansirovanijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IstochnikFinansirovanijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istochnik finansirovanijas
	* @param end the upper bound of the range of istochnik finansirovanijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of istochnik finansirovanijas
	*/
	public static List<IstochnikFinansirovanija> findAll(int start, int end,
		OrderByComparator<IstochnikFinansirovanija> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the istochnik finansirovanijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IstochnikFinansirovanijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istochnik finansirovanijas
	* @param end the upper bound of the range of istochnik finansirovanijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of istochnik finansirovanijas
	*/
	public static List<IstochnikFinansirovanija> findAll(int start, int end,
		OrderByComparator<IstochnikFinansirovanija> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the istochnik finansirovanijas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of istochnik finansirovanijas.
	*
	* @return the number of istochnik finansirovanijas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static IstochnikFinansirovanijaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<IstochnikFinansirovanijaPersistence, IstochnikFinansirovanijaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(IstochnikFinansirovanijaPersistence.class);
}