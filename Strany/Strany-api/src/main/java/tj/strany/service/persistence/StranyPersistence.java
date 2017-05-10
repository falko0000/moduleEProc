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

package tj.strany.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.strany.exception.NoSuchStranyException;

import tj.strany.model.Strany;

/**
 * The persistence interface for the strany service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.strany.service.persistence.impl.StranyPersistenceImpl
 * @see StranyUtil
 * @generated
 */
@ProviderType
public interface StranyPersistence extends BasePersistence<Strany> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StranyUtil} to access the strany persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the strany in the entity cache if it is enabled.
	*
	* @param strany the strany
	*/
	public void cacheResult(Strany strany);

	/**
	* Caches the stranies in the entity cache if it is enabled.
	*
	* @param stranies the stranies
	*/
	public void cacheResult(java.util.List<Strany> stranies);

	/**
	* Creates a new strany with the primary key. Does not add the strany to the database.
	*
	* @param strany_id the primary key for the new strany
	* @return the new strany
	*/
	public Strany create(long strany_id);

	/**
	* Removes the strany with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param strany_id the primary key of the strany
	* @return the strany that was removed
	* @throws NoSuchStranyException if a strany with the primary key could not be found
	*/
	public Strany remove(long strany_id) throws NoSuchStranyException;

	public Strany updateImpl(Strany strany);

	/**
	* Returns the strany with the primary key or throws a {@link NoSuchStranyException} if it could not be found.
	*
	* @param strany_id the primary key of the strany
	* @return the strany
	* @throws NoSuchStranyException if a strany with the primary key could not be found
	*/
	public Strany findByPrimaryKey(long strany_id) throws NoSuchStranyException;

	/**
	* Returns the strany with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param strany_id the primary key of the strany
	* @return the strany, or <code>null</code> if a strany with the primary key could not be found
	*/
	public Strany fetchByPrimaryKey(long strany_id);

	@Override
	public java.util.Map<java.io.Serializable, Strany> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the stranies.
	*
	* @return the stranies
	*/
	public java.util.List<Strany> findAll();

	/**
	* Returns a range of all the stranies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StranyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of stranies
	* @param end the upper bound of the range of stranies (not inclusive)
	* @return the range of stranies
	*/
	public java.util.List<Strany> findAll(int start, int end);

	/**
	* Returns an ordered range of all the stranies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StranyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of stranies
	* @param end the upper bound of the range of stranies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of stranies
	*/
	public java.util.List<Strany> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Strany> orderByComparator);

	/**
	* Returns an ordered range of all the stranies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StranyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of stranies
	* @param end the upper bound of the range of stranies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of stranies
	*/
	public java.util.List<Strany> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Strany> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the stranies from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of stranies.
	*
	* @return the number of stranies
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}