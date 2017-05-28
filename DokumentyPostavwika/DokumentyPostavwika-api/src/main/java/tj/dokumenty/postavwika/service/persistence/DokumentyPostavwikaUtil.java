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

package tj.dokumenty.postavwika.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.dokumenty.postavwika.model.DokumentyPostavwika;

import java.util.List;

/**
 * The persistence utility for the dokumenty postavwika service. This utility wraps {@link tj.dokumenty.postavwika.service.persistence.impl.DokumentyPostavwikaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DokumentyPostavwikaPersistence
 * @see tj.dokumenty.postavwika.service.persistence.impl.DokumentyPostavwikaPersistenceImpl
 * @generated
 */
@ProviderType
public class DokumentyPostavwikaUtil {
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
	public static void clearCache(DokumentyPostavwika dokumentyPostavwika) {
		getPersistence().clearCache(dokumentyPostavwika);
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
	public static List<DokumentyPostavwika> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DokumentyPostavwika> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DokumentyPostavwika> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DokumentyPostavwika> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DokumentyPostavwika update(
		DokumentyPostavwika dokumentyPostavwika) {
		return getPersistence().update(dokumentyPostavwika);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DokumentyPostavwika update(
		DokumentyPostavwika dokumentyPostavwika, ServiceContext serviceContext) {
		return getPersistence().update(dokumentyPostavwika, serviceContext);
	}

	/**
	* Returns the dokumenty postavwika where postavwik_id = &#63; or throws a {@link NoSuchDokumentyPostavwikaException} if it could not be found.
	*
	* @param postavwik_id the postavwik_id
	* @return the matching dokumenty postavwika
	* @throws NoSuchDokumentyPostavwikaException if a matching dokumenty postavwika could not be found
	*/
	public static DokumentyPostavwika findByPostavwik_id(long postavwik_id)
		throws tj.dokumenty.postavwika.exception.NoSuchDokumentyPostavwikaException {
		return getPersistence().findByPostavwik_id(postavwik_id);
	}

	/**
	* Returns the dokumenty postavwika where postavwik_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param postavwik_id the postavwik_id
	* @return the matching dokumenty postavwika, or <code>null</code> if a matching dokumenty postavwika could not be found
	*/
	public static DokumentyPostavwika fetchByPostavwik_id(long postavwik_id) {
		return getPersistence().fetchByPostavwik_id(postavwik_id);
	}

	/**
	* Returns the dokumenty postavwika where postavwik_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param postavwik_id the postavwik_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dokumenty postavwika, or <code>null</code> if a matching dokumenty postavwika could not be found
	*/
	public static DokumentyPostavwika fetchByPostavwik_id(long postavwik_id,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByPostavwik_id(postavwik_id, retrieveFromCache);
	}

	/**
	* Removes the dokumenty postavwika where postavwik_id = &#63; from the database.
	*
	* @param postavwik_id the postavwik_id
	* @return the dokumenty postavwika that was removed
	*/
	public static DokumentyPostavwika removeByPostavwik_id(long postavwik_id)
		throws tj.dokumenty.postavwika.exception.NoSuchDokumentyPostavwikaException {
		return getPersistence().removeByPostavwik_id(postavwik_id);
	}

	/**
	* Returns the number of dokumenty postavwikas where postavwik_id = &#63;.
	*
	* @param postavwik_id the postavwik_id
	* @return the number of matching dokumenty postavwikas
	*/
	public static int countByPostavwik_id(long postavwik_id) {
		return getPersistence().countByPostavwik_id(postavwik_id);
	}

	/**
	* Caches the dokumenty postavwika in the entity cache if it is enabled.
	*
	* @param dokumentyPostavwika the dokumenty postavwika
	*/
	public static void cacheResult(DokumentyPostavwika dokumentyPostavwika) {
		getPersistence().cacheResult(dokumentyPostavwika);
	}

	/**
	* Caches the dokumenty postavwikas in the entity cache if it is enabled.
	*
	* @param dokumentyPostavwikas the dokumenty postavwikas
	*/
	public static void cacheResult(
		List<DokumentyPostavwika> dokumentyPostavwikas) {
		getPersistence().cacheResult(dokumentyPostavwikas);
	}

	/**
	* Creates a new dokumenty postavwika with the primary key. Does not add the dokumenty postavwika to the database.
	*
	* @param dokumenty_postavwika_id the primary key for the new dokumenty postavwika
	* @return the new dokumenty postavwika
	*/
	public static DokumentyPostavwika create(long dokumenty_postavwika_id) {
		return getPersistence().create(dokumenty_postavwika_id);
	}

	/**
	* Removes the dokumenty postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dokumenty_postavwika_id the primary key of the dokumenty postavwika
	* @return the dokumenty postavwika that was removed
	* @throws NoSuchDokumentyPostavwikaException if a dokumenty postavwika with the primary key could not be found
	*/
	public static DokumentyPostavwika remove(long dokumenty_postavwika_id)
		throws tj.dokumenty.postavwika.exception.NoSuchDokumentyPostavwikaException {
		return getPersistence().remove(dokumenty_postavwika_id);
	}

	public static DokumentyPostavwika updateImpl(
		DokumentyPostavwika dokumentyPostavwika) {
		return getPersistence().updateImpl(dokumentyPostavwika);
	}

	/**
	* Returns the dokumenty postavwika with the primary key or throws a {@link NoSuchDokumentyPostavwikaException} if it could not be found.
	*
	* @param dokumenty_postavwika_id the primary key of the dokumenty postavwika
	* @return the dokumenty postavwika
	* @throws NoSuchDokumentyPostavwikaException if a dokumenty postavwika with the primary key could not be found
	*/
	public static DokumentyPostavwika findByPrimaryKey(
		long dokumenty_postavwika_id)
		throws tj.dokumenty.postavwika.exception.NoSuchDokumentyPostavwikaException {
		return getPersistence().findByPrimaryKey(dokumenty_postavwika_id);
	}

	/**
	* Returns the dokumenty postavwika with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dokumenty_postavwika_id the primary key of the dokumenty postavwika
	* @return the dokumenty postavwika, or <code>null</code> if a dokumenty postavwika with the primary key could not be found
	*/
	public static DokumentyPostavwika fetchByPrimaryKey(
		long dokumenty_postavwika_id) {
		return getPersistence().fetchByPrimaryKey(dokumenty_postavwika_id);
	}

	public static java.util.Map<java.io.Serializable, DokumentyPostavwika> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the dokumenty postavwikas.
	*
	* @return the dokumenty postavwikas
	*/
	public static List<DokumentyPostavwika> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dokumenty postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DokumentyPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dokumenty postavwikas
	* @param end the upper bound of the range of dokumenty postavwikas (not inclusive)
	* @return the range of dokumenty postavwikas
	*/
	public static List<DokumentyPostavwika> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dokumenty postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DokumentyPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dokumenty postavwikas
	* @param end the upper bound of the range of dokumenty postavwikas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dokumenty postavwikas
	*/
	public static List<DokumentyPostavwika> findAll(int start, int end,
		OrderByComparator<DokumentyPostavwika> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the dokumenty postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DokumentyPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dokumenty postavwikas
	* @param end the upper bound of the range of dokumenty postavwikas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of dokumenty postavwikas
	*/
	public static List<DokumentyPostavwika> findAll(int start, int end,
		OrderByComparator<DokumentyPostavwika> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the dokumenty postavwikas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dokumenty postavwikas.
	*
	* @return the number of dokumenty postavwikas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DokumentyPostavwikaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DokumentyPostavwikaPersistence, DokumentyPostavwikaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(DokumentyPostavwikaPersistence.class);
}