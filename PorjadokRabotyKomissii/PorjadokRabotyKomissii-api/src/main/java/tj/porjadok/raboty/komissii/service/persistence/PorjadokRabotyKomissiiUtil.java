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

package tj.porjadok.raboty.komissii.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii;

import java.util.List;

/**
 * The persistence utility for the porjadok raboty komissii service. This utility wraps {@link tj.porjadok.raboty.komissii.service.persistence.impl.PorjadokRabotyKomissiiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PorjadokRabotyKomissiiPersistence
 * @see tj.porjadok.raboty.komissii.service.persistence.impl.PorjadokRabotyKomissiiPersistenceImpl
 * @generated
 */
@ProviderType
public class PorjadokRabotyKomissiiUtil {
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
	public static void clearCache(PorjadokRabotyKomissii porjadokRabotyKomissii) {
		getPersistence().clearCache(porjadokRabotyKomissii);
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
	public static List<PorjadokRabotyKomissii> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PorjadokRabotyKomissii> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PorjadokRabotyKomissii> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PorjadokRabotyKomissii> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PorjadokRabotyKomissii update(
		PorjadokRabotyKomissii porjadokRabotyKomissii) {
		return getPersistence().update(porjadokRabotyKomissii);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PorjadokRabotyKomissii update(
		PorjadokRabotyKomissii porjadokRabotyKomissii,
		ServiceContext serviceContext) {
		return getPersistence().update(porjadokRabotyKomissii, serviceContext);
	}

	/**
	* Returns all the porjadok raboty komissiis where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching porjadok raboty komissiis
	*/
	public static List<PorjadokRabotyKomissii> findByIzvewenieId(
		long izvewenie_id) {
		return getPersistence().findByIzvewenieId(izvewenie_id);
	}

	/**
	* Returns a range of all the porjadok raboty komissiis where izvewenie_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenie_id the izvewenie_id
	* @param start the lower bound of the range of porjadok raboty komissiis
	* @param end the upper bound of the range of porjadok raboty komissiis (not inclusive)
	* @return the range of matching porjadok raboty komissiis
	*/
	public static List<PorjadokRabotyKomissii> findByIzvewenieId(
		long izvewenie_id, int start, int end) {
		return getPersistence().findByIzvewenieId(izvewenie_id, start, end);
	}

	/**
	* Returns an ordered range of all the porjadok raboty komissiis where izvewenie_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenie_id the izvewenie_id
	* @param start the lower bound of the range of porjadok raboty komissiis
	* @param end the upper bound of the range of porjadok raboty komissiis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching porjadok raboty komissiis
	*/
	public static List<PorjadokRabotyKomissii> findByIzvewenieId(
		long izvewenie_id, int start, int end,
		OrderByComparator<PorjadokRabotyKomissii> orderByComparator) {
		return getPersistence()
				   .findByIzvewenieId(izvewenie_id, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the porjadok raboty komissiis where izvewenie_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenie_id the izvewenie_id
	* @param start the lower bound of the range of porjadok raboty komissiis
	* @param end the upper bound of the range of porjadok raboty komissiis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching porjadok raboty komissiis
	*/
	public static List<PorjadokRabotyKomissii> findByIzvewenieId(
		long izvewenie_id, int start, int end,
		OrderByComparator<PorjadokRabotyKomissii> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByIzvewenieId(izvewenie_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first porjadok raboty komissii in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching porjadok raboty komissii
	* @throws NoSuchPorjadokRabotyKomissiiException if a matching porjadok raboty komissii could not be found
	*/
	public static PorjadokRabotyKomissii findByIzvewenieId_First(
		long izvewenie_id,
		OrderByComparator<PorjadokRabotyKomissii> orderByComparator)
		throws tj.porjadok.raboty.komissii.exception.NoSuchPorjadokRabotyKomissiiException {
		return getPersistence()
				   .findByIzvewenieId_First(izvewenie_id, orderByComparator);
	}

	/**
	* Returns the first porjadok raboty komissii in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching porjadok raboty komissii, or <code>null</code> if a matching porjadok raboty komissii could not be found
	*/
	public static PorjadokRabotyKomissii fetchByIzvewenieId_First(
		long izvewenie_id,
		OrderByComparator<PorjadokRabotyKomissii> orderByComparator) {
		return getPersistence()
				   .fetchByIzvewenieId_First(izvewenie_id, orderByComparator);
	}

	/**
	* Returns the last porjadok raboty komissii in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching porjadok raboty komissii
	* @throws NoSuchPorjadokRabotyKomissiiException if a matching porjadok raboty komissii could not be found
	*/
	public static PorjadokRabotyKomissii findByIzvewenieId_Last(
		long izvewenie_id,
		OrderByComparator<PorjadokRabotyKomissii> orderByComparator)
		throws tj.porjadok.raboty.komissii.exception.NoSuchPorjadokRabotyKomissiiException {
		return getPersistence()
				   .findByIzvewenieId_Last(izvewenie_id, orderByComparator);
	}

	/**
	* Returns the last porjadok raboty komissii in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching porjadok raboty komissii, or <code>null</code> if a matching porjadok raboty komissii could not be found
	*/
	public static PorjadokRabotyKomissii fetchByIzvewenieId_Last(
		long izvewenie_id,
		OrderByComparator<PorjadokRabotyKomissii> orderByComparator) {
		return getPersistence()
				   .fetchByIzvewenieId_Last(izvewenie_id, orderByComparator);
	}

	/**
	* Returns the porjadok raboty komissiis before and after the current porjadok raboty komissii in the ordered set where izvewenie_id = &#63;.
	*
	* @param porjadok_raboty_komissii_id the primary key of the current porjadok raboty komissii
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next porjadok raboty komissii
	* @throws NoSuchPorjadokRabotyKomissiiException if a porjadok raboty komissii with the primary key could not be found
	*/
	public static PorjadokRabotyKomissii[] findByIzvewenieId_PrevAndNext(
		long porjadok_raboty_komissii_id, long izvewenie_id,
		OrderByComparator<PorjadokRabotyKomissii> orderByComparator)
		throws tj.porjadok.raboty.komissii.exception.NoSuchPorjadokRabotyKomissiiException {
		return getPersistence()
				   .findByIzvewenieId_PrevAndNext(porjadok_raboty_komissii_id,
			izvewenie_id, orderByComparator);
	}

	/**
	* Removes all the porjadok raboty komissiis where izvewenie_id = &#63; from the database.
	*
	* @param izvewenie_id the izvewenie_id
	*/
	public static void removeByIzvewenieId(long izvewenie_id) {
		getPersistence().removeByIzvewenieId(izvewenie_id);
	}

	/**
	* Returns the number of porjadok raboty komissiis where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the number of matching porjadok raboty komissiis
	*/
	public static int countByIzvewenieId(long izvewenie_id) {
		return getPersistence().countByIzvewenieId(izvewenie_id);
	}

	/**
	* Caches the porjadok raboty komissii in the entity cache if it is enabled.
	*
	* @param porjadokRabotyKomissii the porjadok raboty komissii
	*/
	public static void cacheResult(
		PorjadokRabotyKomissii porjadokRabotyKomissii) {
		getPersistence().cacheResult(porjadokRabotyKomissii);
	}

	/**
	* Caches the porjadok raboty komissiis in the entity cache if it is enabled.
	*
	* @param porjadokRabotyKomissiis the porjadok raboty komissiis
	*/
	public static void cacheResult(
		List<PorjadokRabotyKomissii> porjadokRabotyKomissiis) {
		getPersistence().cacheResult(porjadokRabotyKomissiis);
	}

	/**
	* Creates a new porjadok raboty komissii with the primary key. Does not add the porjadok raboty komissii to the database.
	*
	* @param porjadok_raboty_komissii_id the primary key for the new porjadok raboty komissii
	* @return the new porjadok raboty komissii
	*/
	public static PorjadokRabotyKomissii create(
		long porjadok_raboty_komissii_id) {
		return getPersistence().create(porjadok_raboty_komissii_id);
	}

	/**
	* Removes the porjadok raboty komissii with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param porjadok_raboty_komissii_id the primary key of the porjadok raboty komissii
	* @return the porjadok raboty komissii that was removed
	* @throws NoSuchPorjadokRabotyKomissiiException if a porjadok raboty komissii with the primary key could not be found
	*/
	public static PorjadokRabotyKomissii remove(
		long porjadok_raboty_komissii_id)
		throws tj.porjadok.raboty.komissii.exception.NoSuchPorjadokRabotyKomissiiException {
		return getPersistence().remove(porjadok_raboty_komissii_id);
	}

	public static PorjadokRabotyKomissii updateImpl(
		PorjadokRabotyKomissii porjadokRabotyKomissii) {
		return getPersistence().updateImpl(porjadokRabotyKomissii);
	}

	/**
	* Returns the porjadok raboty komissii with the primary key or throws a {@link NoSuchPorjadokRabotyKomissiiException} if it could not be found.
	*
	* @param porjadok_raboty_komissii_id the primary key of the porjadok raboty komissii
	* @return the porjadok raboty komissii
	* @throws NoSuchPorjadokRabotyKomissiiException if a porjadok raboty komissii with the primary key could not be found
	*/
	public static PorjadokRabotyKomissii findByPrimaryKey(
		long porjadok_raboty_komissii_id)
		throws tj.porjadok.raboty.komissii.exception.NoSuchPorjadokRabotyKomissiiException {
		return getPersistence().findByPrimaryKey(porjadok_raboty_komissii_id);
	}

	/**
	* Returns the porjadok raboty komissii with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param porjadok_raboty_komissii_id the primary key of the porjadok raboty komissii
	* @return the porjadok raboty komissii, or <code>null</code> if a porjadok raboty komissii with the primary key could not be found
	*/
	public static PorjadokRabotyKomissii fetchByPrimaryKey(
		long porjadok_raboty_komissii_id) {
		return getPersistence().fetchByPrimaryKey(porjadok_raboty_komissii_id);
	}

	public static java.util.Map<java.io.Serializable, PorjadokRabotyKomissii> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the porjadok raboty komissiis.
	*
	* @return the porjadok raboty komissiis
	*/
	public static List<PorjadokRabotyKomissii> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the porjadok raboty komissiis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of porjadok raboty komissiis
	* @param end the upper bound of the range of porjadok raboty komissiis (not inclusive)
	* @return the range of porjadok raboty komissiis
	*/
	public static List<PorjadokRabotyKomissii> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the porjadok raboty komissiis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of porjadok raboty komissiis
	* @param end the upper bound of the range of porjadok raboty komissiis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of porjadok raboty komissiis
	*/
	public static List<PorjadokRabotyKomissii> findAll(int start, int end,
		OrderByComparator<PorjadokRabotyKomissii> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the porjadok raboty komissiis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of porjadok raboty komissiis
	* @param end the upper bound of the range of porjadok raboty komissiis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of porjadok raboty komissiis
	*/
	public static List<PorjadokRabotyKomissii> findAll(int start, int end,
		OrderByComparator<PorjadokRabotyKomissii> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the porjadok raboty komissiis from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of porjadok raboty komissiis.
	*
	* @return the number of porjadok raboty komissiis
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PorjadokRabotyKomissiiPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PorjadokRabotyKomissiiPersistence, PorjadokRabotyKomissiiPersistence> _serviceTracker =
		ServiceTrackerFactory.open(PorjadokRabotyKomissiiPersistence.class);
}