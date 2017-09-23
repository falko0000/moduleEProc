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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.protocol.contracts.exception.NoSuchProtocolEvaluateException;
import tj.protocol.contracts.model.ProtocolEvaluate;

/**
 * The persistence interface for the protocol evaluate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.protocol.contracts.service.persistence.impl.ProtocolEvaluatePersistenceImpl
 * @see ProtocolEvaluateUtil
 * @generated
 */
@ProviderType
public interface ProtocolEvaluatePersistence extends BasePersistence<ProtocolEvaluate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProtocolEvaluateUtil} to access the protocol evaluate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the protocol evaluate where izvewenie_id = &#63; or throws a {@link NoSuchProtocolEvaluateException} if it could not be found.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching protocol evaluate
	* @throws NoSuchProtocolEvaluateException if a matching protocol evaluate could not be found
	*/
	public ProtocolEvaluate findByIzvewenieId(long izvewenie_id)
		throws NoSuchProtocolEvaluateException;

	/**
	* Returns the protocol evaluate where izvewenie_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching protocol evaluate, or <code>null</code> if a matching protocol evaluate could not be found
	*/
	public ProtocolEvaluate fetchByIzvewenieId(long izvewenie_id);

	/**
	* Returns the protocol evaluate where izvewenie_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param izvewenie_id the izvewenie_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching protocol evaluate, or <code>null</code> if a matching protocol evaluate could not be found
	*/
	public ProtocolEvaluate fetchByIzvewenieId(long izvewenie_id,
		boolean retrieveFromCache);

	/**
	* Removes the protocol evaluate where izvewenie_id = &#63; from the database.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the protocol evaluate that was removed
	*/
	public ProtocolEvaluate removeByIzvewenieId(long izvewenie_id)
		throws NoSuchProtocolEvaluateException;

	/**
	* Returns the number of protocol evaluates where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the number of matching protocol evaluates
	*/
	public int countByIzvewenieId(long izvewenie_id);

	/**
	* Caches the protocol evaluate in the entity cache if it is enabled.
	*
	* @param protocolEvaluate the protocol evaluate
	*/
	public void cacheResult(ProtocolEvaluate protocolEvaluate);

	/**
	* Caches the protocol evaluates in the entity cache if it is enabled.
	*
	* @param protocolEvaluates the protocol evaluates
	*/
	public void cacheResult(java.util.List<ProtocolEvaluate> protocolEvaluates);

	/**
	* Creates a new protocol evaluate with the primary key. Does not add the protocol evaluate to the database.
	*
	* @param protocol_evaluate_id the primary key for the new protocol evaluate
	* @return the new protocol evaluate
	*/
	public ProtocolEvaluate create(long protocol_evaluate_id);

	/**
	* Removes the protocol evaluate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param protocol_evaluate_id the primary key of the protocol evaluate
	* @return the protocol evaluate that was removed
	* @throws NoSuchProtocolEvaluateException if a protocol evaluate with the primary key could not be found
	*/
	public ProtocolEvaluate remove(long protocol_evaluate_id)
		throws NoSuchProtocolEvaluateException;

	public ProtocolEvaluate updateImpl(ProtocolEvaluate protocolEvaluate);

	/**
	* Returns the protocol evaluate with the primary key or throws a {@link NoSuchProtocolEvaluateException} if it could not be found.
	*
	* @param protocol_evaluate_id the primary key of the protocol evaluate
	* @return the protocol evaluate
	* @throws NoSuchProtocolEvaluateException if a protocol evaluate with the primary key could not be found
	*/
	public ProtocolEvaluate findByPrimaryKey(long protocol_evaluate_id)
		throws NoSuchProtocolEvaluateException;

	/**
	* Returns the protocol evaluate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param protocol_evaluate_id the primary key of the protocol evaluate
	* @return the protocol evaluate, or <code>null</code> if a protocol evaluate with the primary key could not be found
	*/
	public ProtocolEvaluate fetchByPrimaryKey(long protocol_evaluate_id);

	@Override
	public java.util.Map<java.io.Serializable, ProtocolEvaluate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the protocol evaluates.
	*
	* @return the protocol evaluates
	*/
	public java.util.List<ProtocolEvaluate> findAll();

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
	public java.util.List<ProtocolEvaluate> findAll(int start, int end);

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
	public java.util.List<ProtocolEvaluate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProtocolEvaluate> orderByComparator);

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
	public java.util.List<ProtocolEvaluate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProtocolEvaluate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the protocol evaluates from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of protocol evaluates.
	*
	* @return the number of protocol evaluates
	*/
	public int countAll();
}