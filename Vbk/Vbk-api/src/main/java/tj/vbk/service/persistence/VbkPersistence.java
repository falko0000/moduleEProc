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

package tj.vbk.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.vbk.exception.NoSuchVbkException;

import tj.vbk.model.Vbk;

/**
 * The persistence interface for the vbk service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.vbk.service.persistence.impl.VbkPersistenceImpl
 * @see VbkUtil
 * @generated
 */
@ProviderType
public interface VbkPersistence extends BasePersistence<Vbk> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VbkUtil} to access the vbk persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vbk in the entity cache if it is enabled.
	*
	* @param vbk the vbk
	*/
	public void cacheResult(Vbk vbk);

	/**
	* Caches the vbks in the entity cache if it is enabled.
	*
	* @param vbks the vbks
	*/
	public void cacheResult(java.util.List<Vbk> vbks);

	/**
	* Creates a new vbk with the primary key. Does not add the vbk to the database.
	*
	* @param vbk_id the primary key for the new vbk
	* @return the new vbk
	*/
	public Vbk create(long vbk_id);

	/**
	* Removes the vbk with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vbk_id the primary key of the vbk
	* @return the vbk that was removed
	* @throws NoSuchVbkException if a vbk with the primary key could not be found
	*/
	public Vbk remove(long vbk_id) throws NoSuchVbkException;

	public Vbk updateImpl(Vbk vbk);

	/**
	* Returns the vbk with the primary key or throws a {@link NoSuchVbkException} if it could not be found.
	*
	* @param vbk_id the primary key of the vbk
	* @return the vbk
	* @throws NoSuchVbkException if a vbk with the primary key could not be found
	*/
	public Vbk findByPrimaryKey(long vbk_id) throws NoSuchVbkException;

	/**
	* Returns the vbk with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vbk_id the primary key of the vbk
	* @return the vbk, or <code>null</code> if a vbk with the primary key could not be found
	*/
	public Vbk fetchByPrimaryKey(long vbk_id);

	@Override
	public java.util.Map<java.io.Serializable, Vbk> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vbks.
	*
	* @return the vbks
	*/
	public java.util.List<Vbk> findAll();

	/**
	* Returns a range of all the vbks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vbks
	* @param end the upper bound of the range of vbks (not inclusive)
	* @return the range of vbks
	*/
	public java.util.List<Vbk> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vbks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vbks
	* @param end the upper bound of the range of vbks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vbks
	*/
	public java.util.List<Vbk> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vbk> orderByComparator);

	/**
	* Returns an ordered range of all the vbks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vbks
	* @param end the upper bound of the range of vbks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vbks
	*/
	public java.util.List<Vbk> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vbk> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vbks from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vbks.
	*
	* @return the number of vbks
	*/
	public int countAll();
}