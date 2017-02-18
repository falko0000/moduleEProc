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

import tj.sapp.services.exception.NoSuchOKGZException;
import tj.sapp.services.model.OKGZ;

/**
 * The persistence interface for the okgz service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.sapp.services.service.persistence.impl.OKGZPersistenceImpl
 * @see OKGZUtil
 * @generated
 */
@ProviderType
public interface OKGZPersistence extends BasePersistence<OKGZ> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OKGZUtil} to access the okgz persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the okgz in the entity cache if it is enabled.
	*
	* @param okgz the okgz
	*/
	public void cacheResult(OKGZ okgz);

	/**
	* Caches the okgzs in the entity cache if it is enabled.
	*
	* @param okgzs the okgzs
	*/
	public void cacheResult(java.util.List<OKGZ> okgzs);

	/**
	* Creates a new okgz with the primary key. Does not add the okgz to the database.
	*
	* @param okgz_id the primary key for the new okgz
	* @return the new okgz
	*/
	public OKGZ create(long okgz_id);

	/**
	* Removes the okgz with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param okgz_id the primary key of the okgz
	* @return the okgz that was removed
	* @throws NoSuchOKGZException if a okgz with the primary key could not be found
	*/
	public OKGZ remove(long okgz_id) throws NoSuchOKGZException;

	public OKGZ updateImpl(OKGZ okgz);

	/**
	* Returns the okgz with the primary key or throws a {@link NoSuchOKGZException} if it could not be found.
	*
	* @param okgz_id the primary key of the okgz
	* @return the okgz
	* @throws NoSuchOKGZException if a okgz with the primary key could not be found
	*/
	public OKGZ findByPrimaryKey(long okgz_id) throws NoSuchOKGZException;

	/**
	* Returns the okgz with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param okgz_id the primary key of the okgz
	* @return the okgz, or <code>null</code> if a okgz with the primary key could not be found
	*/
	public OKGZ fetchByPrimaryKey(long okgz_id);

	@Override
	public java.util.Map<java.io.Serializable, OKGZ> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the okgzs.
	*
	* @return the okgzs
	*/
	public java.util.List<OKGZ> findAll();

	/**
	* Returns a range of all the okgzs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OKGZModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of okgzs
	* @param end the upper bound of the range of okgzs (not inclusive)
	* @return the range of okgzs
	*/
	public java.util.List<OKGZ> findAll(int start, int end);

	/**
	* Returns an ordered range of all the okgzs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OKGZModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of okgzs
	* @param end the upper bound of the range of okgzs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of okgzs
	*/
	public java.util.List<OKGZ> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OKGZ> orderByComparator);

	/**
	* Returns an ordered range of all the okgzs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OKGZModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of okgzs
	* @param end the upper bound of the range of okgzs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of okgzs
	*/
	public java.util.List<OKGZ> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OKGZ> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the okgzs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of okgzs.
	*
	* @return the number of okgzs
	*/
	public int countAll();
}