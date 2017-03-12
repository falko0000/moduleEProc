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

package tj.status.izvewenij.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.status.izvewenij.exception.NoSuchStatusIzvewenijException;
import tj.status.izvewenij.model.StatusIzvewenij;

/**
 * The persistence interface for the status izvewenij service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author falko
 * @see tj.status.izvewenij.service.persistence.impl.StatusIzvewenijPersistenceImpl
 * @see StatusIzvewenijUtil
 * @generated
 */
@ProviderType
public interface StatusIzvewenijPersistence extends BasePersistence<StatusIzvewenij> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StatusIzvewenijUtil} to access the status izvewenij persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the status izvewenij in the entity cache if it is enabled.
	*
	* @param statusIzvewenij the status izvewenij
	*/
	public void cacheResult(StatusIzvewenij statusIzvewenij);

	/**
	* Caches the status izvewenijs in the entity cache if it is enabled.
	*
	* @param statusIzvewenijs the status izvewenijs
	*/
	public void cacheResult(java.util.List<StatusIzvewenij> statusIzvewenijs);

	/**
	* Creates a new status izvewenij with the primary key. Does not add the status izvewenij to the database.
	*
	* @param status_izvewenij_id the primary key for the new status izvewenij
	* @return the new status izvewenij
	*/
	public StatusIzvewenij create(long status_izvewenij_id);

	/**
	* Removes the status izvewenij with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param status_izvewenij_id the primary key of the status izvewenij
	* @return the status izvewenij that was removed
	* @throws NoSuchStatusIzvewenijException if a status izvewenij with the primary key could not be found
	*/
	public StatusIzvewenij remove(long status_izvewenij_id)
		throws NoSuchStatusIzvewenijException;

	public StatusIzvewenij updateImpl(StatusIzvewenij statusIzvewenij);

	/**
	* Returns the status izvewenij with the primary key or throws a {@link NoSuchStatusIzvewenijException} if it could not be found.
	*
	* @param status_izvewenij_id the primary key of the status izvewenij
	* @return the status izvewenij
	* @throws NoSuchStatusIzvewenijException if a status izvewenij with the primary key could not be found
	*/
	public StatusIzvewenij findByPrimaryKey(long status_izvewenij_id)
		throws NoSuchStatusIzvewenijException;

	/**
	* Returns the status izvewenij with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param status_izvewenij_id the primary key of the status izvewenij
	* @return the status izvewenij, or <code>null</code> if a status izvewenij with the primary key could not be found
	*/
	public StatusIzvewenij fetchByPrimaryKey(long status_izvewenij_id);

	@Override
	public java.util.Map<java.io.Serializable, StatusIzvewenij> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the status izvewenijs.
	*
	* @return the status izvewenijs
	*/
	public java.util.List<StatusIzvewenij> findAll();

	/**
	* Returns a range of all the status izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StatusIzvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of status izvewenijs
	* @param end the upper bound of the range of status izvewenijs (not inclusive)
	* @return the range of status izvewenijs
	*/
	public java.util.List<StatusIzvewenij> findAll(int start, int end);

	/**
	* Returns an ordered range of all the status izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StatusIzvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of status izvewenijs
	* @param end the upper bound of the range of status izvewenijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of status izvewenijs
	*/
	public java.util.List<StatusIzvewenij> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StatusIzvewenij> orderByComparator);

	/**
	* Returns an ordered range of all the status izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StatusIzvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of status izvewenijs
	* @param end the upper bound of the range of status izvewenijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of status izvewenijs
	*/
	public java.util.List<StatusIzvewenij> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StatusIzvewenij> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the status izvewenijs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of status izvewenijs.
	*
	* @return the number of status izvewenijs
	*/
	public int countAll();
}