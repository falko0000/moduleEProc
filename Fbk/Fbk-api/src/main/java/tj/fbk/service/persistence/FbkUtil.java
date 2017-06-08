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

package tj.fbk.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.fbk.model.Fbk;

import java.util.List;

/**
 * The persistence utility for the fbk service. This utility wraps {@link tj.fbk.service.persistence.impl.FbkPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FbkPersistence
 * @see tj.fbk.service.persistence.impl.FbkPersistenceImpl
 * @generated
 */
@ProviderType
public class FbkUtil {
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
	public static void clearCache(Fbk fbk) {
		getPersistence().clearCache(fbk);
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
	public static List<Fbk> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Fbk> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Fbk> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Fbk> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Fbk update(Fbk fbk) {
		return getPersistence().update(fbk);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Fbk update(Fbk fbk, ServiceContext serviceContext) {
		return getPersistence().update(fbk, serviceContext);
	}

	/**
	* Returns the fbk where kod = &#63; or throws a {@link NoSuchFbkException} if it could not be found.
	*
	* @param kod the kod
	* @return the matching fbk
	* @throws NoSuchFbkException if a matching fbk could not be found
	*/
	public static Fbk findByKod(java.lang.String kod)
		throws tj.fbk.exception.NoSuchFbkException {
		return getPersistence().findByKod(kod);
	}

	/**
	* Returns the fbk where kod = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param kod the kod
	* @return the matching fbk, or <code>null</code> if a matching fbk could not be found
	*/
	public static Fbk fetchByKod(java.lang.String kod) {
		return getPersistence().fetchByKod(kod);
	}

	/**
	* Returns the fbk where kod = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param kod the kod
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching fbk, or <code>null</code> if a matching fbk could not be found
	*/
	public static Fbk fetchByKod(java.lang.String kod, boolean retrieveFromCache) {
		return getPersistence().fetchByKod(kod, retrieveFromCache);
	}

	/**
	* Removes the fbk where kod = &#63; from the database.
	*
	* @param kod the kod
	* @return the fbk that was removed
	*/
	public static Fbk removeByKod(java.lang.String kod)
		throws tj.fbk.exception.NoSuchFbkException {
		return getPersistence().removeByKod(kod);
	}

	/**
	* Returns the number of fbks where kod = &#63;.
	*
	* @param kod the kod
	* @return the number of matching fbks
	*/
	public static int countByKod(java.lang.String kod) {
		return getPersistence().countByKod(kod);
	}

	/**
	* Returns all the fbks where pid = &#63;.
	*
	* @param pid the pid
	* @return the matching fbks
	*/
	public static List<Fbk> findByPid(int pid) {
		return getPersistence().findByPid(pid);
	}

	/**
	* Returns a range of all the fbks where pid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pid the pid
	* @param start the lower bound of the range of fbks
	* @param end the upper bound of the range of fbks (not inclusive)
	* @return the range of matching fbks
	*/
	public static List<Fbk> findByPid(int pid, int start, int end) {
		return getPersistence().findByPid(pid, start, end);
	}

	/**
	* Returns an ordered range of all the fbks where pid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pid the pid
	* @param start the lower bound of the range of fbks
	* @param end the upper bound of the range of fbks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching fbks
	*/
	public static List<Fbk> findByPid(int pid, int start, int end,
		OrderByComparator<Fbk> orderByComparator) {
		return getPersistence().findByPid(pid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the fbks where pid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pid the pid
	* @param start the lower bound of the range of fbks
	* @param end the upper bound of the range of fbks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching fbks
	*/
	public static List<Fbk> findByPid(int pid, int start, int end,
		OrderByComparator<Fbk> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByPid(pid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first fbk in the ordered set where pid = &#63;.
	*
	* @param pid the pid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fbk
	* @throws NoSuchFbkException if a matching fbk could not be found
	*/
	public static Fbk findByPid_First(int pid,
		OrderByComparator<Fbk> orderByComparator)
		throws tj.fbk.exception.NoSuchFbkException {
		return getPersistence().findByPid_First(pid, orderByComparator);
	}

	/**
	* Returns the first fbk in the ordered set where pid = &#63;.
	*
	* @param pid the pid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fbk, or <code>null</code> if a matching fbk could not be found
	*/
	public static Fbk fetchByPid_First(int pid,
		OrderByComparator<Fbk> orderByComparator) {
		return getPersistence().fetchByPid_First(pid, orderByComparator);
	}

	/**
	* Returns the last fbk in the ordered set where pid = &#63;.
	*
	* @param pid the pid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fbk
	* @throws NoSuchFbkException if a matching fbk could not be found
	*/
	public static Fbk findByPid_Last(int pid,
		OrderByComparator<Fbk> orderByComparator)
		throws tj.fbk.exception.NoSuchFbkException {
		return getPersistence().findByPid_Last(pid, orderByComparator);
	}

	/**
	* Returns the last fbk in the ordered set where pid = &#63;.
	*
	* @param pid the pid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fbk, or <code>null</code> if a matching fbk could not be found
	*/
	public static Fbk fetchByPid_Last(int pid,
		OrderByComparator<Fbk> orderByComparator) {
		return getPersistence().fetchByPid_Last(pid, orderByComparator);
	}

	/**
	* Returns the fbks before and after the current fbk in the ordered set where pid = &#63;.
	*
	* @param fbk_id the primary key of the current fbk
	* @param pid the pid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next fbk
	* @throws NoSuchFbkException if a fbk with the primary key could not be found
	*/
	public static Fbk[] findByPid_PrevAndNext(long fbk_id, int pid,
		OrderByComparator<Fbk> orderByComparator)
		throws tj.fbk.exception.NoSuchFbkException {
		return getPersistence()
				   .findByPid_PrevAndNext(fbk_id, pid, orderByComparator);
	}

	/**
	* Removes all the fbks where pid = &#63; from the database.
	*
	* @param pid the pid
	*/
	public static void removeByPid(int pid) {
		getPersistence().removeByPid(pid);
	}

	/**
	* Returns the number of fbks where pid = &#63;.
	*
	* @param pid the pid
	* @return the number of matching fbks
	*/
	public static int countByPid(int pid) {
		return getPersistence().countByPid(pid);
	}

	/**
	* Caches the fbk in the entity cache if it is enabled.
	*
	* @param fbk the fbk
	*/
	public static void cacheResult(Fbk fbk) {
		getPersistence().cacheResult(fbk);
	}

	/**
	* Caches the fbks in the entity cache if it is enabled.
	*
	* @param fbks the fbks
	*/
	public static void cacheResult(List<Fbk> fbks) {
		getPersistence().cacheResult(fbks);
	}

	/**
	* Creates a new fbk with the primary key. Does not add the fbk to the database.
	*
	* @param fbk_id the primary key for the new fbk
	* @return the new fbk
	*/
	public static Fbk create(long fbk_id) {
		return getPersistence().create(fbk_id);
	}

	/**
	* Removes the fbk with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fbk_id the primary key of the fbk
	* @return the fbk that was removed
	* @throws NoSuchFbkException if a fbk with the primary key could not be found
	*/
	public static Fbk remove(long fbk_id)
		throws tj.fbk.exception.NoSuchFbkException {
		return getPersistence().remove(fbk_id);
	}

	public static Fbk updateImpl(Fbk fbk) {
		return getPersistence().updateImpl(fbk);
	}

	/**
	* Returns the fbk with the primary key or throws a {@link NoSuchFbkException} if it could not be found.
	*
	* @param fbk_id the primary key of the fbk
	* @return the fbk
	* @throws NoSuchFbkException if a fbk with the primary key could not be found
	*/
	public static Fbk findByPrimaryKey(long fbk_id)
		throws tj.fbk.exception.NoSuchFbkException {
		return getPersistence().findByPrimaryKey(fbk_id);
	}

	/**
	* Returns the fbk with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fbk_id the primary key of the fbk
	* @return the fbk, or <code>null</code> if a fbk with the primary key could not be found
	*/
	public static Fbk fetchByPrimaryKey(long fbk_id) {
		return getPersistence().fetchByPrimaryKey(fbk_id);
	}

	public static java.util.Map<java.io.Serializable, Fbk> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the fbks.
	*
	* @return the fbks
	*/
	public static List<Fbk> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the fbks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fbks
	* @param end the upper bound of the range of fbks (not inclusive)
	* @return the range of fbks
	*/
	public static List<Fbk> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the fbks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fbks
	* @param end the upper bound of the range of fbks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of fbks
	*/
	public static List<Fbk> findAll(int start, int end,
		OrderByComparator<Fbk> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the fbks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fbks
	* @param end the upper bound of the range of fbks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of fbks
	*/
	public static List<Fbk> findAll(int start, int end,
		OrderByComparator<Fbk> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the fbks from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of fbks.
	*
	* @return the number of fbks
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FbkPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FbkPersistence, FbkPersistence> _serviceTracker =
		ServiceTrackerFactory.open(FbkPersistence.class);
}