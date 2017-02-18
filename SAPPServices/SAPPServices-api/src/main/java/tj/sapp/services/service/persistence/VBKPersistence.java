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

package tj.sapp.services.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.sapp.services.exception.NoSuchVBKException;
import tj.sapp.services.model.VBK;

/**
 * The persistence interface for the vbk service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.sapp.services.service.persistence.impl.VBKPersistenceImpl
 * @see VBKUtil
 * @generated
 */
@ProviderType
public interface VBKPersistence extends BasePersistence<VBK> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VBKUtil} to access the vbk persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vbk in the entity cache if it is enabled.
	*
	* @param vbk the vbk
	*/
	public void cacheResult(VBK vbk);

	/**
	* Caches the vbks in the entity cache if it is enabled.
	*
	* @param vbks the vbks
	*/
	public void cacheResult(java.util.List<VBK> vbks);

	/**
	* Creates a new vbk with the primary key. Does not add the vbk to the database.
	*
	* @param id_ the primary key for the new vbk
	* @return the new vbk
	*/
	public VBK create(long id_);

	/**
	* Removes the vbk with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_ the primary key of the vbk
	* @return the vbk that was removed
	* @throws NoSuchVBKException if a vbk with the primary key could not be found
	*/
	public VBK remove(long id_) throws NoSuchVBKException;

	public VBK updateImpl(VBK vbk);

	/**
	* Returns the vbk with the primary key or throws a {@link NoSuchVBKException} if it could not be found.
	*
	* @param id_ the primary key of the vbk
	* @return the vbk
	* @throws NoSuchVBKException if a vbk with the primary key could not be found
	*/
	public VBK findByPrimaryKey(long id_) throws NoSuchVBKException;

	/**
	* Returns the vbk with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id_ the primary key of the vbk
	* @return the vbk, or <code>null</code> if a vbk with the primary key could not be found
	*/
	public VBK fetchByPrimaryKey(long id_);

	@Override
	public java.util.Map<java.io.Serializable, VBK> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vbks.
	*
	* @return the vbks
	*/
	public java.util.List<VBK> findAll();

	/**
	* Returns a range of all the vbks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VBKModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vbks
	* @param end the upper bound of the range of vbks (not inclusive)
	* @return the range of vbks
	*/
	public java.util.List<VBK> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vbks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VBKModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vbks
	* @param end the upper bound of the range of vbks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vbks
	*/
	public java.util.List<VBK> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VBK> orderByComparator);

	/**
	* Returns an ordered range of all the vbks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VBKModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vbks
	* @param end the upper bound of the range of vbks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vbks
	*/
	public java.util.List<VBK> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VBK> orderByComparator,
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