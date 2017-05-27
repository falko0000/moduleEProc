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

package tj.postavwiki.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.postavwiki.model.Postavwiki;

import java.util.List;

/**
 * The persistence utility for the postavwiki service. This utility wraps {@link tj.postavwiki.service.persistence.impl.PostavwikiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PostavwikiPersistence
 * @see tj.postavwiki.service.persistence.impl.PostavwikiPersistenceImpl
 * @generated
 */
@ProviderType
public class PostavwikiUtil {
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
	public static void clearCache(Postavwiki postavwiki) {
		getPersistence().clearCache(postavwiki);
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
	public static List<Postavwiki> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Postavwiki> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Postavwiki> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Postavwiki> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Postavwiki update(Postavwiki postavwiki) {
		return getPersistence().update(postavwiki);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Postavwiki update(Postavwiki postavwiki,
		ServiceContext serviceContext) {
		return getPersistence().update(postavwiki, serviceContext);
	}

	/**
	* Returns the postavwiki where postavwiki_id = &#63; and oblast_id = &#63; or throws a {@link NoSuchPostavwikiException} if it could not be found.
	*
	* @param postavwiki_id the postavwiki_id
	* @param oblast_id the oblast_id
	* @return the matching postavwiki
	* @throws NoSuchPostavwikiException if a matching postavwiki could not be found
	*/
	public static Postavwiki findBypostavwikiIdOblastId(long postavwiki_id,
		long oblast_id)
		throws tj.postavwiki.exception.NoSuchPostavwikiException {
		return getPersistence()
				   .findBypostavwikiIdOblastId(postavwiki_id, oblast_id);
	}

	/**
	* Returns the postavwiki where postavwiki_id = &#63; and oblast_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param postavwiki_id the postavwiki_id
	* @param oblast_id the oblast_id
	* @return the matching postavwiki, or <code>null</code> if a matching postavwiki could not be found
	*/
	public static Postavwiki fetchBypostavwikiIdOblastId(long postavwiki_id,
		long oblast_id) {
		return getPersistence()
				   .fetchBypostavwikiIdOblastId(postavwiki_id, oblast_id);
	}

	/**
	* Returns the postavwiki where postavwiki_id = &#63; and oblast_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param postavwiki_id the postavwiki_id
	* @param oblast_id the oblast_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching postavwiki, or <code>null</code> if a matching postavwiki could not be found
	*/
	public static Postavwiki fetchBypostavwikiIdOblastId(long postavwiki_id,
		long oblast_id, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchBypostavwikiIdOblastId(postavwiki_id, oblast_id,
			retrieveFromCache);
	}

	/**
	* Removes the postavwiki where postavwiki_id = &#63; and oblast_id = &#63; from the database.
	*
	* @param postavwiki_id the postavwiki_id
	* @param oblast_id the oblast_id
	* @return the postavwiki that was removed
	*/
	public static Postavwiki removeBypostavwikiIdOblastId(long postavwiki_id,
		long oblast_id)
		throws tj.postavwiki.exception.NoSuchPostavwikiException {
		return getPersistence()
				   .removeBypostavwikiIdOblastId(postavwiki_id, oblast_id);
	}

	/**
	* Returns the number of postavwikis where postavwiki_id = &#63; and oblast_id = &#63;.
	*
	* @param postavwiki_id the postavwiki_id
	* @param oblast_id the oblast_id
	* @return the number of matching postavwikis
	*/
	public static int countBypostavwikiIdOblastId(long postavwiki_id,
		long oblast_id) {
		return getPersistence()
				   .countBypostavwikiIdOblastId(postavwiki_id, oblast_id);
	}

	/**
	* Caches the postavwiki in the entity cache if it is enabled.
	*
	* @param postavwiki the postavwiki
	*/
	public static void cacheResult(Postavwiki postavwiki) {
		getPersistence().cacheResult(postavwiki);
	}

	/**
	* Caches the postavwikis in the entity cache if it is enabled.
	*
	* @param postavwikis the postavwikis
	*/
	public static void cacheResult(List<Postavwiki> postavwikis) {
		getPersistence().cacheResult(postavwikis);
	}

	/**
	* Creates a new postavwiki with the primary key. Does not add the postavwiki to the database.
	*
	* @param postavwiki_id the primary key for the new postavwiki
	* @return the new postavwiki
	*/
	public static Postavwiki create(long postavwiki_id) {
		return getPersistence().create(postavwiki_id);
	}

	/**
	* Removes the postavwiki with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param postavwiki_id the primary key of the postavwiki
	* @return the postavwiki that was removed
	* @throws NoSuchPostavwikiException if a postavwiki with the primary key could not be found
	*/
	public static Postavwiki remove(long postavwiki_id)
		throws tj.postavwiki.exception.NoSuchPostavwikiException {
		return getPersistence().remove(postavwiki_id);
	}

	public static Postavwiki updateImpl(Postavwiki postavwiki) {
		return getPersistence().updateImpl(postavwiki);
	}

	/**
	* Returns the postavwiki with the primary key or throws a {@link NoSuchPostavwikiException} if it could not be found.
	*
	* @param postavwiki_id the primary key of the postavwiki
	* @return the postavwiki
	* @throws NoSuchPostavwikiException if a postavwiki with the primary key could not be found
	*/
	public static Postavwiki findByPrimaryKey(long postavwiki_id)
		throws tj.postavwiki.exception.NoSuchPostavwikiException {
		return getPersistence().findByPrimaryKey(postavwiki_id);
	}

	/**
	* Returns the postavwiki with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param postavwiki_id the primary key of the postavwiki
	* @return the postavwiki, or <code>null</code> if a postavwiki with the primary key could not be found
	*/
	public static Postavwiki fetchByPrimaryKey(long postavwiki_id) {
		return getPersistence().fetchByPrimaryKey(postavwiki_id);
	}

	public static java.util.Map<java.io.Serializable, Postavwiki> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the postavwikis.
	*
	* @return the postavwikis
	*/
	public static List<Postavwiki> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the postavwikis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PostavwikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of postavwikis
	* @param end the upper bound of the range of postavwikis (not inclusive)
	* @return the range of postavwikis
	*/
	public static List<Postavwiki> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the postavwikis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PostavwikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of postavwikis
	* @param end the upper bound of the range of postavwikis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of postavwikis
	*/
	public static List<Postavwiki> findAll(int start, int end,
		OrderByComparator<Postavwiki> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the postavwikis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PostavwikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of postavwikis
	* @param end the upper bound of the range of postavwikis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of postavwikis
	*/
	public static List<Postavwiki> findAll(int start, int end,
		OrderByComparator<Postavwiki> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the postavwikis from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of postavwikis.
	*
	* @return the number of postavwikis
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PostavwikiPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PostavwikiPersistence, PostavwikiPersistence> _serviceTracker =
		ServiceTrackerFactory.open(PostavwikiPersistence.class);
}