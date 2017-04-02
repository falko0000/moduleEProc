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

package tj.jekb.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.jekb.exception.NoSuchJekbException;

import tj.jekb.model.Jekb;

/**
 * The persistence interface for the jekb service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author falko
 * @see tj.jekb.service.persistence.impl.JekbPersistenceImpl
 * @see JekbUtil
 * @generated
 */
@ProviderType
public interface JekbPersistence extends BasePersistence<Jekb> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JekbUtil} to access the jekb persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the jekb in the entity cache if it is enabled.
	*
	* @param jekb the jekb
	*/
	public void cacheResult(Jekb jekb);

	/**
	* Caches the jekbs in the entity cache if it is enabled.
	*
	* @param jekbs the jekbs
	*/
	public void cacheResult(java.util.List<Jekb> jekbs);

	/**
	* Creates a new jekb with the primary key. Does not add the jekb to the database.
	*
	* @param jekb_id the primary key for the new jekb
	* @return the new jekb
	*/
	public Jekb create(long jekb_id);

	/**
	* Removes the jekb with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jekb_id the primary key of the jekb
	* @return the jekb that was removed
	* @throws NoSuchJekbException if a jekb with the primary key could not be found
	*/
	public Jekb remove(long jekb_id) throws NoSuchJekbException;

	public Jekb updateImpl(Jekb jekb);

	/**
	* Returns the jekb with the primary key or throws a {@link NoSuchJekbException} if it could not be found.
	*
	* @param jekb_id the primary key of the jekb
	* @return the jekb
	* @throws NoSuchJekbException if a jekb with the primary key could not be found
	*/
	public Jekb findByPrimaryKey(long jekb_id) throws NoSuchJekbException;

	/**
	* Returns the jekb with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jekb_id the primary key of the jekb
	* @return the jekb, or <code>null</code> if a jekb with the primary key could not be found
	*/
	public Jekb fetchByPrimaryKey(long jekb_id);

	@Override
	public java.util.Map<java.io.Serializable, Jekb> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the jekbs.
	*
	* @return the jekbs
	*/
	public java.util.List<Jekb> findAll();

	/**
	* Returns a range of all the jekbs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JekbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jekbs
	* @param end the upper bound of the range of jekbs (not inclusive)
	* @return the range of jekbs
	*/
	public java.util.List<Jekb> findAll(int start, int end);

	/**
	* Returns an ordered range of all the jekbs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JekbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jekbs
	* @param end the upper bound of the range of jekbs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of jekbs
	*/
	public java.util.List<Jekb> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Jekb> orderByComparator);

	/**
	* Returns an ordered range of all the jekbs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JekbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jekbs
	* @param end the upper bound of the range of jekbs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of jekbs
	*/
	public java.util.List<Jekb> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Jekb> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the jekbs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of jekbs.
	*
	* @return the number of jekbs
	*/
	public int countAll();
}