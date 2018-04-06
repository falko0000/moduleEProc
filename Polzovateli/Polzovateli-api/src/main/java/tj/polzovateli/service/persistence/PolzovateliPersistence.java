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

package tj.polzovateli.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.polzovateli.exception.NoSuchPolzovateliException;

import tj.polzovateli.model.Polzovateli;

/**
 * The persistence interface for the polzovateli service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.polzovateli.service.persistence.impl.PolzovateliPersistenceImpl
 * @see PolzovateliUtil
 * @generated
 */
@ProviderType
public interface PolzovateliPersistence extends BasePersistence<Polzovateli> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PolzovateliUtil} to access the polzovateli persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the polzovateli in the entity cache if it is enabled.
	*
	* @param polzovateli the polzovateli
	*/
	public void cacheResult(Polzovateli polzovateli);

	/**
	* Caches the polzovatelis in the entity cache if it is enabled.
	*
	* @param polzovatelis the polzovatelis
	*/
	public void cacheResult(java.util.List<Polzovateli> polzovatelis);

	/**
	* Creates a new polzovateli with the primary key. Does not add the polzovateli to the database.
	*
	* @param polzovateli_id the primary key for the new polzovateli
	* @return the new polzovateli
	*/
	public Polzovateli create(long polzovateli_id);

	/**
	* Removes the polzovateli with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param polzovateli_id the primary key of the polzovateli
	* @return the polzovateli that was removed
	* @throws NoSuchPolzovateliException if a polzovateli with the primary key could not be found
	*/
	public Polzovateli remove(long polzovateli_id)
		throws NoSuchPolzovateliException;

	public Polzovateli updateImpl(Polzovateli polzovateli);

	/**
	* Returns the polzovateli with the primary key or throws a {@link NoSuchPolzovateliException} if it could not be found.
	*
	* @param polzovateli_id the primary key of the polzovateli
	* @return the polzovateli
	* @throws NoSuchPolzovateliException if a polzovateli with the primary key could not be found
	*/
	public Polzovateli findByPrimaryKey(long polzovateli_id)
		throws NoSuchPolzovateliException;

	/**
	* Returns the polzovateli with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param polzovateli_id the primary key of the polzovateli
	* @return the polzovateli, or <code>null</code> if a polzovateli with the primary key could not be found
	*/
	public Polzovateli fetchByPrimaryKey(long polzovateli_id);

	@Override
	public java.util.Map<java.io.Serializable, Polzovateli> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the polzovatelis.
	*
	* @return the polzovatelis
	*/
	public java.util.List<Polzovateli> findAll();

	/**
	* Returns a range of all the polzovatelis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PolzovateliModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of polzovatelis
	* @param end the upper bound of the range of polzovatelis (not inclusive)
	* @return the range of polzovatelis
	*/
	public java.util.List<Polzovateli> findAll(int start, int end);

	/**
	* Returns an ordered range of all the polzovatelis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PolzovateliModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of polzovatelis
	* @param end the upper bound of the range of polzovatelis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of polzovatelis
	*/
	public java.util.List<Polzovateli> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Polzovateli> orderByComparator);

	/**
	* Returns an ordered range of all the polzovatelis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PolzovateliModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of polzovatelis
	* @param end the upper bound of the range of polzovatelis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of polzovatelis
	*/
	public java.util.List<Polzovateli> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Polzovateli> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the polzovatelis from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of polzovatelis.
	*
	* @return the number of polzovatelis
	*/
	public int countAll();
}