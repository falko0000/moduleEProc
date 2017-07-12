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

import tj.protocol.contracts.exception.NoSuchProtocolContractsException;
import tj.protocol.contracts.model.ProtocolContracts;

/**
 * The persistence interface for the protocol contracts service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.protocol.contracts.service.persistence.impl.ProtocolContractsPersistenceImpl
 * @see ProtocolContractsUtil
 * @generated
 */
@ProviderType
public interface ProtocolContractsPersistence extends BasePersistence<ProtocolContracts> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProtocolContractsUtil} to access the protocol contracts persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the protocol contracts where izvewenie_id = &#63; or throws a {@link NoSuchProtocolContractsException} if it could not be found.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching protocol contracts
	* @throws NoSuchProtocolContractsException if a matching protocol contracts could not be found
	*/
	public ProtocolContracts findByIzvewenieId(long izvewenie_id)
		throws NoSuchProtocolContractsException;

	/**
	* Returns the protocol contracts where izvewenie_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching protocol contracts, or <code>null</code> if a matching protocol contracts could not be found
	*/
	public ProtocolContracts fetchByIzvewenieId(long izvewenie_id);

	/**
	* Returns the protocol contracts where izvewenie_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param izvewenie_id the izvewenie_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching protocol contracts, or <code>null</code> if a matching protocol contracts could not be found
	*/
	public ProtocolContracts fetchByIzvewenieId(long izvewenie_id,
		boolean retrieveFromCache);

	/**
	* Removes the protocol contracts where izvewenie_id = &#63; from the database.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the protocol contracts that was removed
	*/
	public ProtocolContracts removeByIzvewenieId(long izvewenie_id)
		throws NoSuchProtocolContractsException;

	/**
	* Returns the number of protocol contractses where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the number of matching protocol contractses
	*/
	public int countByIzvewenieId(long izvewenie_id);

	/**
	* Caches the protocol contracts in the entity cache if it is enabled.
	*
	* @param protocolContracts the protocol contracts
	*/
	public void cacheResult(ProtocolContracts protocolContracts);

	/**
	* Caches the protocol contractses in the entity cache if it is enabled.
	*
	* @param protocolContractses the protocol contractses
	*/
	public void cacheResult(
		java.util.List<ProtocolContracts> protocolContractses);

	/**
	* Creates a new protocol contracts with the primary key. Does not add the protocol contracts to the database.
	*
	* @param protocol_contracts_id the primary key for the new protocol contracts
	* @return the new protocol contracts
	*/
	public ProtocolContracts create(long protocol_contracts_id);

	/**
	* Removes the protocol contracts with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param protocol_contracts_id the primary key of the protocol contracts
	* @return the protocol contracts that was removed
	* @throws NoSuchProtocolContractsException if a protocol contracts with the primary key could not be found
	*/
	public ProtocolContracts remove(long protocol_contracts_id)
		throws NoSuchProtocolContractsException;

	public ProtocolContracts updateImpl(ProtocolContracts protocolContracts);

	/**
	* Returns the protocol contracts with the primary key or throws a {@link NoSuchProtocolContractsException} if it could not be found.
	*
	* @param protocol_contracts_id the primary key of the protocol contracts
	* @return the protocol contracts
	* @throws NoSuchProtocolContractsException if a protocol contracts with the primary key could not be found
	*/
	public ProtocolContracts findByPrimaryKey(long protocol_contracts_id)
		throws NoSuchProtocolContractsException;

	/**
	* Returns the protocol contracts with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param protocol_contracts_id the primary key of the protocol contracts
	* @return the protocol contracts, or <code>null</code> if a protocol contracts with the primary key could not be found
	*/
	public ProtocolContracts fetchByPrimaryKey(long protocol_contracts_id);

	@Override
	public java.util.Map<java.io.Serializable, ProtocolContracts> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the protocol contractses.
	*
	* @return the protocol contractses
	*/
	public java.util.List<ProtocolContracts> findAll();

	/**
	* Returns a range of all the protocol contractses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProtocolContractsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protocol contractses
	* @param end the upper bound of the range of protocol contractses (not inclusive)
	* @return the range of protocol contractses
	*/
	public java.util.List<ProtocolContracts> findAll(int start, int end);

	/**
	* Returns an ordered range of all the protocol contractses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProtocolContractsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protocol contractses
	* @param end the upper bound of the range of protocol contractses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of protocol contractses
	*/
	public java.util.List<ProtocolContracts> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProtocolContracts> orderByComparator);

	/**
	* Returns an ordered range of all the protocol contractses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProtocolContractsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protocol contractses
	* @param end the upper bound of the range of protocol contractses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of protocol contractses
	*/
	public java.util.List<ProtocolContracts> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProtocolContracts> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the protocol contractses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of protocol contractses.
	*
	* @return the number of protocol contractses
	*/
	public int countAll();
}