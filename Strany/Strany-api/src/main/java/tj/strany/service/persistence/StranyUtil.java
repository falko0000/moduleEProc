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

package tj.strany.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.strany.model.Strany;

import java.util.List;

/**
 * The persistence utility for the strany service. This utility wraps {@link tj.strany.service.persistence.impl.StranyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StranyPersistence
 * @see tj.strany.service.persistence.impl.StranyPersistenceImpl
 * @generated
 */
@ProviderType
public class StranyUtil {
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
	public static void clearCache(Strany strany) {
		getPersistence().clearCache(strany);
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
	public static List<Strany> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Strany> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Strany> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Strany> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Strany update(Strany strany) {
		return getPersistence().update(strany);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Strany update(Strany strany, ServiceContext serviceContext) {
		return getPersistence().update(strany, serviceContext);
	}

	/**
	* Caches the strany in the entity cache if it is enabled.
	*
	* @param strany the strany
	*/
	public static void cacheResult(Strany strany) {
		getPersistence().cacheResult(strany);
	}

	/**
	* Caches the stranies in the entity cache if it is enabled.
	*
	* @param stranies the stranies
	*/
	public static void cacheResult(List<Strany> stranies) {
		getPersistence().cacheResult(stranies);
	}

	/**
	* Creates a new strany with the primary key. Does not add the strany to the database.
	*
	* @param strany_id the primary key for the new strany
	* @return the new strany
	*/
	public static Strany create(long strany_id) {
		return getPersistence().create(strany_id);
	}

	/**
	* Removes the strany with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param strany_id the primary key of the strany
	* @return the strany that was removed
	* @throws NoSuchStranyException if a strany with the primary key could not be found
	*/
	public static Strany remove(long strany_id)
		throws tj.strany.exception.NoSuchStranyException {
		return getPersistence().remove(strany_id);
	}

	public static Strany updateImpl(Strany strany) {
		return getPersistence().updateImpl(strany);
	}

	/**
	* Returns the strany with the primary key or throws a {@link NoSuchStranyException} if it could not be found.
	*
	* @param strany_id the primary key of the strany
	* @return the strany
	* @throws NoSuchStranyException if a strany with the primary key could not be found
	*/
	public static Strany findByPrimaryKey(long strany_id)
		throws tj.strany.exception.NoSuchStranyException {
		return getPersistence().findByPrimaryKey(strany_id);
	}

	/**
	* Returns the strany with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param strany_id the primary key of the strany
	* @return the strany, or <code>null</code> if a strany with the primary key could not be found
	*/
	public static Strany fetchByPrimaryKey(long strany_id) {
		return getPersistence().fetchByPrimaryKey(strany_id);
	}

	public static java.util.Map<java.io.Serializable, Strany> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the stranies.
	*
	* @return the stranies
	*/
	public static List<Strany> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the stranies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StranyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of stranies
	* @param end the upper bound of the range of stranies (not inclusive)
	* @return the range of stranies
	*/
	public static List<Strany> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the stranies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StranyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of stranies
	* @param end the upper bound of the range of stranies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of stranies
	*/
	public static List<Strany> findAll(int start, int end,
		OrderByComparator<Strany> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the stranies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StranyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of stranies
	* @param end the upper bound of the range of stranies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of stranies
	*/
	public static List<Strany> findAll(int start, int end,
		OrderByComparator<Strany> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the stranies from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of stranies.
	*
	* @return the number of stranies
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static StranyPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<StranyPersistence, StranyPersistence> _serviceTracker =
		ServiceTrackerFactory.open(StranyPersistence.class);
}