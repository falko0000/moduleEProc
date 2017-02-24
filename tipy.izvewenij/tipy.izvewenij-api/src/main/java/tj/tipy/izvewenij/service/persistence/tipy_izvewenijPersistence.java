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

package tj.tipy.izvewenij.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.tipy.izvewenij.exception.NoSuchtipy_izvewenijException;
import tj.tipy.izvewenij.model.tipy_izvewenij;

/**
 * The persistence interface for the tipy_izvewenij service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.tipy.izvewenij.service.persistence.impl.tipy_izvewenijPersistenceImpl
 * @see tipy_izvewenijUtil
 * @generated
 */
@ProviderType
public interface tipy_izvewenijPersistence extends BasePersistence<tipy_izvewenij> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link tipy_izvewenijUtil} to access the tipy_izvewenij persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the tipy_izvewenij in the entity cache if it is enabled.
	*
	* @param tipy_izvewenij the tipy_izvewenij
	*/
	public void cacheResult(tipy_izvewenij tipy_izvewenij);

	/**
	* Caches the tipy_izvewenijs in the entity cache if it is enabled.
	*
	* @param tipy_izvewenijs the tipy_izvewenijs
	*/
	public void cacheResult(java.util.List<tipy_izvewenij> tipy_izvewenijs);

	/**
	* Creates a new tipy_izvewenij with the primary key. Does not add the tipy_izvewenij to the database.
	*
	* @param tipy_izvewenij_id the primary key for the new tipy_izvewenij
	* @return the new tipy_izvewenij
	*/
	public tipy_izvewenij create(long tipy_izvewenij_id);

	/**
	* Removes the tipy_izvewenij with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tipy_izvewenij_id the primary key of the tipy_izvewenij
	* @return the tipy_izvewenij that was removed
	* @throws NoSuchtipy_izvewenijException if a tipy_izvewenij with the primary key could not be found
	*/
	public tipy_izvewenij remove(long tipy_izvewenij_id)
		throws NoSuchtipy_izvewenijException;

	public tipy_izvewenij updateImpl(tipy_izvewenij tipy_izvewenij);

	/**
	* Returns the tipy_izvewenij with the primary key or throws a {@link NoSuchtipy_izvewenijException} if it could not be found.
	*
	* @param tipy_izvewenij_id the primary key of the tipy_izvewenij
	* @return the tipy_izvewenij
	* @throws NoSuchtipy_izvewenijException if a tipy_izvewenij with the primary key could not be found
	*/
	public tipy_izvewenij findByPrimaryKey(long tipy_izvewenij_id)
		throws NoSuchtipy_izvewenijException;

	/**
	* Returns the tipy_izvewenij with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tipy_izvewenij_id the primary key of the tipy_izvewenij
	* @return the tipy_izvewenij, or <code>null</code> if a tipy_izvewenij with the primary key could not be found
	*/
	public tipy_izvewenij fetchByPrimaryKey(long tipy_izvewenij_id);

	@Override
	public java.util.Map<java.io.Serializable, tipy_izvewenij> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the tipy_izvewenijs.
	*
	* @return the tipy_izvewenijs
	*/
	public java.util.List<tipy_izvewenij> findAll();

	/**
	* Returns a range of all the tipy_izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy_izvewenijs
	* @param end the upper bound of the range of tipy_izvewenijs (not inclusive)
	* @return the range of tipy_izvewenijs
	*/
	public java.util.List<tipy_izvewenij> findAll(int start, int end);

	/**
	* Returns an ordered range of all the tipy_izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy_izvewenijs
	* @param end the upper bound of the range of tipy_izvewenijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tipy_izvewenijs
	*/
	public java.util.List<tipy_izvewenij> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<tipy_izvewenij> orderByComparator);

	/**
	* Returns an ordered range of all the tipy_izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy_izvewenijs
	* @param end the upper bound of the range of tipy_izvewenijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of tipy_izvewenijs
	*/
	public java.util.List<tipy_izvewenij> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<tipy_izvewenij> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the tipy_izvewenijs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of tipy_izvewenijs.
	*
	* @return the number of tipy_izvewenijs
	*/
	public int countAll();
}