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

package tj.tariff.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.tariff.model.Tariff;

import java.util.List;

/**
 * The persistence utility for the tariff service. This utility wraps {@link tj.tariff.service.persistence.impl.TariffPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TariffPersistence
 * @see tj.tariff.service.persistence.impl.TariffPersistenceImpl
 * @generated
 */
@ProviderType
public class TariffUtil {
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
	public static void clearCache(Tariff tariff) {
		getPersistence().clearCache(tariff);
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
	public static List<Tariff> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Tariff> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Tariff> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Tariff> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Tariff update(Tariff tariff) {
		return getPersistence().update(tariff);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Tariff update(Tariff tariff, ServiceContext serviceContext) {
		return getPersistence().update(tariff, serviceContext);
	}

	/**
	* Returns the tariff where region_id = &#63; and type_tariff = &#63; or throws a {@link NoSuchTariffException} if it could not be found.
	*
	* @param region_id the region_id
	* @param type_tariff the type_tariff
	* @return the matching tariff
	* @throws NoSuchTariffException if a matching tariff could not be found
	*/
	public static Tariff findByregionIdTypeTariff(long region_id,
		int type_tariff) throws tj.tariff.exception.NoSuchTariffException {
		return getPersistence().findByregionIdTypeTariff(region_id, type_tariff);
	}

	/**
	* Returns the tariff where region_id = &#63; and type_tariff = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param region_id the region_id
	* @param type_tariff the type_tariff
	* @return the matching tariff, or <code>null</code> if a matching tariff could not be found
	*/
	public static Tariff fetchByregionIdTypeTariff(long region_id,
		int type_tariff) {
		return getPersistence().fetchByregionIdTypeTariff(region_id, type_tariff);
	}

	/**
	* Returns the tariff where region_id = &#63; and type_tariff = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param region_id the region_id
	* @param type_tariff the type_tariff
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching tariff, or <code>null</code> if a matching tariff could not be found
	*/
	public static Tariff fetchByregionIdTypeTariff(long region_id,
		int type_tariff, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByregionIdTypeTariff(region_id, type_tariff,
			retrieveFromCache);
	}

	/**
	* Removes the tariff where region_id = &#63; and type_tariff = &#63; from the database.
	*
	* @param region_id the region_id
	* @param type_tariff the type_tariff
	* @return the tariff that was removed
	*/
	public static Tariff removeByregionIdTypeTariff(long region_id,
		int type_tariff) throws tj.tariff.exception.NoSuchTariffException {
		return getPersistence()
				   .removeByregionIdTypeTariff(region_id, type_tariff);
	}

	/**
	* Returns the number of tariffs where region_id = &#63; and type_tariff = &#63;.
	*
	* @param region_id the region_id
	* @param type_tariff the type_tariff
	* @return the number of matching tariffs
	*/
	public static int countByregionIdTypeTariff(long region_id, int type_tariff) {
		return getPersistence().countByregionIdTypeTariff(region_id, type_tariff);
	}

	/**
	* Caches the tariff in the entity cache if it is enabled.
	*
	* @param tariff the tariff
	*/
	public static void cacheResult(Tariff tariff) {
		getPersistence().cacheResult(tariff);
	}

	/**
	* Caches the tariffs in the entity cache if it is enabled.
	*
	* @param tariffs the tariffs
	*/
	public static void cacheResult(List<Tariff> tariffs) {
		getPersistence().cacheResult(tariffs);
	}

	/**
	* Creates a new tariff with the primary key. Does not add the tariff to the database.
	*
	* @param tariff_id the primary key for the new tariff
	* @return the new tariff
	*/
	public static Tariff create(long tariff_id) {
		return getPersistence().create(tariff_id);
	}

	/**
	* Removes the tariff with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tariff_id the primary key of the tariff
	* @return the tariff that was removed
	* @throws NoSuchTariffException if a tariff with the primary key could not be found
	*/
	public static Tariff remove(long tariff_id)
		throws tj.tariff.exception.NoSuchTariffException {
		return getPersistence().remove(tariff_id);
	}

	public static Tariff updateImpl(Tariff tariff) {
		return getPersistence().updateImpl(tariff);
	}

	/**
	* Returns the tariff with the primary key or throws a {@link NoSuchTariffException} if it could not be found.
	*
	* @param tariff_id the primary key of the tariff
	* @return the tariff
	* @throws NoSuchTariffException if a tariff with the primary key could not be found
	*/
	public static Tariff findByPrimaryKey(long tariff_id)
		throws tj.tariff.exception.NoSuchTariffException {
		return getPersistence().findByPrimaryKey(tariff_id);
	}

	/**
	* Returns the tariff with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tariff_id the primary key of the tariff
	* @return the tariff, or <code>null</code> if a tariff with the primary key could not be found
	*/
	public static Tariff fetchByPrimaryKey(long tariff_id) {
		return getPersistence().fetchByPrimaryKey(tariff_id);
	}

	public static java.util.Map<java.io.Serializable, Tariff> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the tariffs.
	*
	* @return the tariffs
	*/
	public static List<Tariff> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tariffs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TariffModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tariffs
	* @param end the upper bound of the range of tariffs (not inclusive)
	* @return the range of tariffs
	*/
	public static List<Tariff> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tariffs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TariffModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tariffs
	* @param end the upper bound of the range of tariffs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tariffs
	*/
	public static List<Tariff> findAll(int start, int end,
		OrderByComparator<Tariff> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the tariffs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TariffModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tariffs
	* @param end the upper bound of the range of tariffs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of tariffs
	*/
	public static List<Tariff> findAll(int start, int end,
		OrderByComparator<Tariff> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the tariffs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tariffs.
	*
	* @return the number of tariffs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TariffPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TariffPersistence, TariffPersistence> _serviceTracker =
		ServiceTrackerFactory.open(TariffPersistence.class);
}