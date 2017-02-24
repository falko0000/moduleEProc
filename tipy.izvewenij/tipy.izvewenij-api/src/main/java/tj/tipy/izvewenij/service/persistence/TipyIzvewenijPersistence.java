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

import tj.tipy.izvewenij.exception.NoSuchTipyIzvewenijException;
import tj.tipy.izvewenij.model.TipyIzvewenij;

/**
 * The persistence interface for the tipy izvewenij service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.tipy.izvewenij.service.persistence.impl.TipyIzvewenijPersistenceImpl
 * @see TipyIzvewenijUtil
 * @generated
 */
@ProviderType
public interface TipyIzvewenijPersistence extends BasePersistence<TipyIzvewenij> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TipyIzvewenijUtil} to access the tipy izvewenij persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the tipy izvewenij in the entity cache if it is enabled.
	*
	* @param tipyIzvewenij the tipy izvewenij
	*/
	public void cacheResult(TipyIzvewenij tipyIzvewenij);

	/**
	* Caches the tipy izvewenijs in the entity cache if it is enabled.
	*
	* @param tipyIzvewenijs the tipy izvewenijs
	*/
	public void cacheResult(java.util.List<TipyIzvewenij> tipyIzvewenijs);

	/**
	* Creates a new tipy izvewenij with the primary key. Does not add the tipy izvewenij to the database.
	*
	* @param tipy_izvewenij_id the primary key for the new tipy izvewenij
	* @return the new tipy izvewenij
	*/
	public TipyIzvewenij create(long tipy_izvewenij_id);

	/**
	* Removes the tipy izvewenij with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tipy_izvewenij_id the primary key of the tipy izvewenij
	* @return the tipy izvewenij that was removed
	* @throws NoSuchTipyIzvewenijException if a tipy izvewenij with the primary key could not be found
	*/
	public TipyIzvewenij remove(long tipy_izvewenij_id)
		throws NoSuchTipyIzvewenijException;

	public TipyIzvewenij updateImpl(TipyIzvewenij tipyIzvewenij);

	/**
	* Returns the tipy izvewenij with the primary key or throws a {@link NoSuchTipyIzvewenijException} if it could not be found.
	*
	* @param tipy_izvewenij_id the primary key of the tipy izvewenij
	* @return the tipy izvewenij
	* @throws NoSuchTipyIzvewenijException if a tipy izvewenij with the primary key could not be found
	*/
	public TipyIzvewenij findByPrimaryKey(long tipy_izvewenij_id)
		throws NoSuchTipyIzvewenijException;

	/**
	* Returns the tipy izvewenij with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tipy_izvewenij_id the primary key of the tipy izvewenij
	* @return the tipy izvewenij, or <code>null</code> if a tipy izvewenij with the primary key could not be found
	*/
	public TipyIzvewenij fetchByPrimaryKey(long tipy_izvewenij_id);

	@Override
	public java.util.Map<java.io.Serializable, TipyIzvewenij> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the tipy izvewenijs.
	*
	* @return the tipy izvewenijs
	*/
	public java.util.List<TipyIzvewenij> findAll();

	/**
	* Returns a range of all the tipy izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipyIzvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy izvewenijs
	* @param end the upper bound of the range of tipy izvewenijs (not inclusive)
	* @return the range of tipy izvewenijs
	*/
	public java.util.List<TipyIzvewenij> findAll(int start, int end);

	/**
	* Returns an ordered range of all the tipy izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipyIzvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy izvewenijs
	* @param end the upper bound of the range of tipy izvewenijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tipy izvewenijs
	*/
	public java.util.List<TipyIzvewenij> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TipyIzvewenij> orderByComparator);

	/**
	* Returns an ordered range of all the tipy izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipyIzvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy izvewenijs
	* @param end the upper bound of the range of tipy izvewenijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of tipy izvewenijs
	*/
	public java.util.List<TipyIzvewenij> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TipyIzvewenij> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the tipy izvewenijs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of tipy izvewenijs.
	*
	* @return the number of tipy izvewenijs
	*/
	public int countAll();
}