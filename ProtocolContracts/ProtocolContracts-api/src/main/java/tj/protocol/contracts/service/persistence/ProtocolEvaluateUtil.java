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

package tj.protocol.contracts.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.protocol.contracts.model.ProtocolEvaluate;

import java.util.List;

/**
 * The persistence utility for the protocol evaluate service. This utility wraps {@link tj.protocol.contracts.service.persistence.impl.ProtocolEvaluatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProtocolEvaluatePersistence
 * @see tj.protocol.contracts.service.persistence.impl.ProtocolEvaluatePersistenceImpl
 * @generated
 */
@ProviderType
public class ProtocolEvaluateUtil {
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
	public static void clearCache(ProtocolEvaluate protocolEvaluate) {
		getPersistence().clearCache(protocolEvaluate);
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
	public static List<ProtocolEvaluate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ProtocolEvaluate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ProtocolEvaluate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ProtocolEvaluate> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ProtocolEvaluate update(ProtocolEvaluate protocolEvaluate) {
		return getPersistence().update(protocolEvaluate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ProtocolEvaluate update(ProtocolEvaluate protocolEvaluate,
		ServiceContext serviceContext) {
		return getPersistence().update(protocolEvaluate, serviceContext);
	}

	/**
	* Returns the protocol evaluate where izvewenie_id = &#63; or throws a {@link NoSuchProtocolEvaluateException} if it could not be found.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching protocol evaluate
	* @throws NoSuchProtocolEvaluateException if a matching protocol evaluate could not be found
	*/
	public static ProtocolEvaluate findByIzvewenieId(long izvewenie_id)
		throws tj.protocol.contracts.exception.NoSuchProtocolEvaluateException {
		return getPersistence().findByIzvewenieId(izvewenie_id);
	}

	/**
	* Returns the protocol evaluate where izvewenie_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching protocol evaluate, or <code>null</code> if a matching protocol evaluate could not be found
	*/
	public static ProtocolEvaluate fetchByIzvewenieId(long izvewenie_id) {
		return getPersistence().fetchByIzvewenieId(izvewenie_id);
	}

	/**
	* Returns the protocol evaluate where izvewenie_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param izvewenie_id the izvewenie_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching protocol evaluate, or <code>null</code> if a matching protocol evaluate could not be found
	*/
	public static ProtocolEvaluate fetchByIzvewenieId(long izvewenie_id,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByIzvewenieId(izvewenie_id, retrieveFromCache);
	}

	/**
	* Removes the protocol evaluate where izvewenie_id = &#63; from the database.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the protocol evaluate that was removed
	*/
	public static ProtocolEvaluate removeByIzvewenieId(long izvewenie_id)
		throws tj.protocol.contracts.exception.NoSuchProtocolEvaluateException {
		return getPersistence().removeByIzvewenieId(izvewenie_id);
	}

	/**
	* Returns the number of protocol evaluates where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the number of matching protocol evaluates
	*/
	public static int countByIzvewenieId(long izvewenie_id) {
		return getPersistence().countByIzvewenieId(izvewenie_id);
	}

	/**
	* Caches the protocol evaluate in the entity cache if it is enabled.
	*
	* @param protocolEvaluate the protocol evaluate
	*/
	public static void cacheResult(ProtocolEvaluate protocolEvaluate) {
		getPersistence().cacheResult(protocolEvaluate);
	}

	/**
	* Caches the protocol evaluates in the entity cache if it is enabled.
	*
	* @param protocolEvaluates the protocol evaluates
	*/
	public static void cacheResult(List<ProtocolEvaluate> protocolEvaluates) {
		getPersistence().cacheResult(protocolEvaluates);
	}

	/**
	* Creates a new protocol evaluate with the primary key. Does not add the protocol evaluate to the database.
	*
	* @param protocol_evaluate_id the primary key for the new protocol evaluate
	* @return the new protocol evaluate
	*/
	public static ProtocolEvaluate create(long protocol_evaluate_id) {
		return getPersistence().create(protocol_evaluate_id);
	}

	/**
	* Removes the protocol evaluate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param protocol_evaluate_id the primary key of the protocol evaluate
	* @return the protocol evaluate that was removed
	* @throws NoSuchProtocolEvaluateException if a protocol evaluate with the primary key could not be found
	*/
	public static ProtocolEvaluate remove(long protocol_evaluate_id)
		throws tj.protocol.contracts.exception.NoSuchProtocolEvaluateException {
		return getPersistence().remove(protocol_evaluate_id);
	}

	public static ProtocolEvaluate updateImpl(ProtocolEvaluate protocolEvaluate) {
		return getPersistence().updateImpl(protocolEvaluate);
	}

	/**
	* Returns the protocol evaluate with the primary key or throws a {@link NoSuchProtocolEvaluateException} if it could not be found.
	*
	* @param protocol_evaluate_id the primary key of the protocol evaluate
	* @return the protocol evaluate
	* @throws NoSuchProtocolEvaluateException if a protocol evaluate with the primary key could not be found
	*/
	public static ProtocolEvaluate findByPrimaryKey(long protocol_evaluate_id)
		throws tj.protocol.contracts.exception.NoSuchProtocolEvaluateException {
		return getPersistence().findByPrimaryKey(protocol_evaluate_id);
	}

	/**
	* Returns the protocol evaluate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param protocol_evaluate_id the primary key of the protocol evaluate
	* @return the protocol evaluate, or <code>null</code> if a protocol evaluate with the primary key could not be found
	*/
	public static ProtocolEvaluate fetchByPrimaryKey(long protocol_evaluate_id) {
		return getPersistence().fetchByPrimaryKey(protocol_evaluate_id);
	}

	public static java.util.Map<java.io.Serializable, ProtocolEvaluate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the protocol evaluates.
	*
	* @return the protocol evaluates
	*/
	public static List<ProtocolEvaluate> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the protocol evaluates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProtocolEvaluateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protocol evaluates
	* @param end the upper bound of the range of protocol evaluates (not inclusive)
	* @return the range of protocol evaluates
	*/
	public static List<ProtocolEvaluate> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the protocol evaluates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProtocolEvaluateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protocol evaluates
	* @param end the upper bound of the range of protocol evaluates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of protocol evaluates
	*/
	public static List<ProtocolEvaluate> findAll(int start, int end,
		OrderByComparator<ProtocolEvaluate> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the protocol evaluates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProtocolEvaluateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protocol evaluates
	* @param end the upper bound of the range of protocol evaluates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of protocol evaluates
	*/
	public static List<ProtocolEvaluate> findAll(int start, int end,
		OrderByComparator<ProtocolEvaluate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the protocol evaluates from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of protocol evaluates.
	*
	* @return the number of protocol evaluates
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ProtocolEvaluatePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ProtocolEvaluatePersistence, ProtocolEvaluatePersistence> _serviceTracker =
		ServiceTrackerFactory.open(ProtocolEvaluatePersistence.class);
}