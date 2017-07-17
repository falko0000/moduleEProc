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

import tj.protocol.contracts.exception.NoSuchProtocolOpeningException;
import tj.protocol.contracts.model.ProtocolOpening;

/**
 * The persistence interface for the protocol opening service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.protocol.contracts.service.persistence.impl.ProtocolOpeningPersistenceImpl
 * @see ProtocolOpeningUtil
 * @generated
 */
@ProviderType
public interface ProtocolOpeningPersistence extends BasePersistence<ProtocolOpening> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProtocolOpeningUtil} to access the protocol opening persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the protocol opening where izvewenie_id = &#63; or throws a {@link NoSuchProtocolOpeningException} if it could not be found.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching protocol opening
	* @throws NoSuchProtocolOpeningException if a matching protocol opening could not be found
	*/
	public ProtocolOpening findByIzvewenieId(long izvewenie_id)
		throws NoSuchProtocolOpeningException;

	/**
	* Returns the protocol opening where izvewenie_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching protocol opening, or <code>null</code> if a matching protocol opening could not be found
	*/
	public ProtocolOpening fetchByIzvewenieId(long izvewenie_id);

	/**
	* Returns the protocol opening where izvewenie_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param izvewenie_id the izvewenie_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching protocol opening, or <code>null</code> if a matching protocol opening could not be found
	*/
	public ProtocolOpening fetchByIzvewenieId(long izvewenie_id,
		boolean retrieveFromCache);

	/**
	* Removes the protocol opening where izvewenie_id = &#63; from the database.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the protocol opening that was removed
	*/
	public ProtocolOpening removeByIzvewenieId(long izvewenie_id)
		throws NoSuchProtocolOpeningException;

	/**
	* Returns the number of protocol openings where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the number of matching protocol openings
	*/
	public int countByIzvewenieId(long izvewenie_id);

	/**
	* Caches the protocol opening in the entity cache if it is enabled.
	*
	* @param protocolOpening the protocol opening
	*/
	public void cacheResult(ProtocolOpening protocolOpening);

	/**
	* Caches the protocol openings in the entity cache if it is enabled.
	*
	* @param protocolOpenings the protocol openings
	*/
	public void cacheResult(java.util.List<ProtocolOpening> protocolOpenings);

	/**
	* Creates a new protocol opening with the primary key. Does not add the protocol opening to the database.
	*
	* @param protocol_opening_id the primary key for the new protocol opening
	* @return the new protocol opening
	*/
	public ProtocolOpening create(long protocol_opening_id);

	/**
	* Removes the protocol opening with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param protocol_opening_id the primary key of the protocol opening
	* @return the protocol opening that was removed
	* @throws NoSuchProtocolOpeningException if a protocol opening with the primary key could not be found
	*/
	public ProtocolOpening remove(long protocol_opening_id)
		throws NoSuchProtocolOpeningException;

	public ProtocolOpening updateImpl(ProtocolOpening protocolOpening);

	/**
	* Returns the protocol opening with the primary key or throws a {@link NoSuchProtocolOpeningException} if it could not be found.
	*
	* @param protocol_opening_id the primary key of the protocol opening
	* @return the protocol opening
	* @throws NoSuchProtocolOpeningException if a protocol opening with the primary key could not be found
	*/
	public ProtocolOpening findByPrimaryKey(long protocol_opening_id)
		throws NoSuchProtocolOpeningException;

	/**
	* Returns the protocol opening with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param protocol_opening_id the primary key of the protocol opening
	* @return the protocol opening, or <code>null</code> if a protocol opening with the primary key could not be found
	*/
	public ProtocolOpening fetchByPrimaryKey(long protocol_opening_id);

	@Override
	public java.util.Map<java.io.Serializable, ProtocolOpening> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the protocol openings.
	*
	* @return the protocol openings
	*/
	public java.util.List<ProtocolOpening> findAll();

	/**
	* Returns a range of all the protocol openings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProtocolOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protocol openings
	* @param end the upper bound of the range of protocol openings (not inclusive)
	* @return the range of protocol openings
	*/
	public java.util.List<ProtocolOpening> findAll(int start, int end);

	/**
	* Returns an ordered range of all the protocol openings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProtocolOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protocol openings
	* @param end the upper bound of the range of protocol openings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of protocol openings
	*/
	public java.util.List<ProtocolOpening> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProtocolOpening> orderByComparator);

	/**
	* Returns an ordered range of all the protocol openings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProtocolOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protocol openings
	* @param end the upper bound of the range of protocol openings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of protocol openings
	*/
	public java.util.List<ProtocolOpening> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProtocolOpening> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the protocol openings from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of protocol openings.
	*
	* @return the number of protocol openings
	*/
	public int countAll();
}