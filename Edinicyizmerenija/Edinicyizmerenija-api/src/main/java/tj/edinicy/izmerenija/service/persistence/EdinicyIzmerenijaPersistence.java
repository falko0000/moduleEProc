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

package tj.edinicy.izmerenija.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.edinicy.izmerenija.exception.NoSuchEdinicyIzmerenijaException;
import tj.edinicy.izmerenija.model.EdinicyIzmerenija;

/**
 * The persistence interface for the edinicy izmerenija service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.edinicy.izmerenija.service.persistence.impl.EdinicyIzmerenijaPersistenceImpl
 * @see EdinicyIzmerenijaUtil
 * @generated
 */
@ProviderType
public interface EdinicyIzmerenijaPersistence extends BasePersistence<EdinicyIzmerenija> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EdinicyIzmerenijaUtil} to access the edinicy izmerenija persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the edinicy izmerenija in the entity cache if it is enabled.
	*
	* @param edinicyIzmerenija the edinicy izmerenija
	*/
	public void cacheResult(EdinicyIzmerenija edinicyIzmerenija);

	/**
	* Caches the edinicy izmerenijas in the entity cache if it is enabled.
	*
	* @param edinicyIzmerenijas the edinicy izmerenijas
	*/
	public void cacheResult(
		java.util.List<EdinicyIzmerenija> edinicyIzmerenijas);

	/**
	* Creates a new edinicy izmerenija with the primary key. Does not add the edinicy izmerenija to the database.
	*
	* @param edinicy_izmerenija_id the primary key for the new edinicy izmerenija
	* @return the new edinicy izmerenija
	*/
	public EdinicyIzmerenija create(long edinicy_izmerenija_id);

	/**
	* Removes the edinicy izmerenija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param edinicy_izmerenija_id the primary key of the edinicy izmerenija
	* @return the edinicy izmerenija that was removed
	* @throws NoSuchEdinicyIzmerenijaException if a edinicy izmerenija with the primary key could not be found
	*/
	public EdinicyIzmerenija remove(long edinicy_izmerenija_id)
		throws NoSuchEdinicyIzmerenijaException;

	public EdinicyIzmerenija updateImpl(EdinicyIzmerenija edinicyIzmerenija);

	/**
	* Returns the edinicy izmerenija with the primary key or throws a {@link NoSuchEdinicyIzmerenijaException} if it could not be found.
	*
	* @param edinicy_izmerenija_id the primary key of the edinicy izmerenija
	* @return the edinicy izmerenija
	* @throws NoSuchEdinicyIzmerenijaException if a edinicy izmerenija with the primary key could not be found
	*/
	public EdinicyIzmerenija findByPrimaryKey(long edinicy_izmerenija_id)
		throws NoSuchEdinicyIzmerenijaException;

	/**
	* Returns the edinicy izmerenija with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param edinicy_izmerenija_id the primary key of the edinicy izmerenija
	* @return the edinicy izmerenija, or <code>null</code> if a edinicy izmerenija with the primary key could not be found
	*/
	public EdinicyIzmerenija fetchByPrimaryKey(long edinicy_izmerenija_id);

	@Override
	public java.util.Map<java.io.Serializable, EdinicyIzmerenija> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the edinicy izmerenijas.
	*
	* @return the edinicy izmerenijas
	*/
	public java.util.List<EdinicyIzmerenija> findAll();

	/**
	* Returns a range of all the edinicy izmerenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EdinicyIzmerenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of edinicy izmerenijas
	* @param end the upper bound of the range of edinicy izmerenijas (not inclusive)
	* @return the range of edinicy izmerenijas
	*/
	public java.util.List<EdinicyIzmerenija> findAll(int start, int end);

	/**
	* Returns an ordered range of all the edinicy izmerenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EdinicyIzmerenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of edinicy izmerenijas
	* @param end the upper bound of the range of edinicy izmerenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of edinicy izmerenijas
	*/
	public java.util.List<EdinicyIzmerenija> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdinicyIzmerenija> orderByComparator);

	/**
	* Returns an ordered range of all the edinicy izmerenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EdinicyIzmerenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of edinicy izmerenijas
	* @param end the upper bound of the range of edinicy izmerenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of edinicy izmerenijas
	*/
	public java.util.List<EdinicyIzmerenija> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdinicyIzmerenija> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the edinicy izmerenijas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of edinicy izmerenijas.
	*
	* @return the number of edinicy izmerenijas
	*/
	public int countAll();
}