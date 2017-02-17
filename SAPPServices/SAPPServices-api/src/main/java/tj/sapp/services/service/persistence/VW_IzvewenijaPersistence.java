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

import tj.sapp.services.exception.NoSuchVW_IzvewenijaException;
import tj.sapp.services.model.VW_Izvewenija;

/**
 * The persistence interface for the v w_ izvewenija service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.sapp.services.service.persistence.impl.VW_IzvewenijaPersistenceImpl
 * @see VW_IzvewenijaUtil
 * @generated
 */
@ProviderType
public interface VW_IzvewenijaPersistence extends BasePersistence<VW_Izvewenija> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VW_IzvewenijaUtil} to access the v w_ izvewenija persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the v w_ izvewenija in the entity cache if it is enabled.
	*
	* @param vw_Izvewenija the v w_ izvewenija
	*/
	public void cacheResult(VW_Izvewenija vw_Izvewenija);

	/**
	* Caches the v w_ izvewenijas in the entity cache if it is enabled.
	*
	* @param vw_Izvewenijas the v w_ izvewenijas
	*/
	public void cacheResult(java.util.List<VW_Izvewenija> vw_Izvewenijas);

	/**
	* Creates a new v w_ izvewenija with the primary key. Does not add the v w_ izvewenija to the database.
	*
	* @param izvewenija_id the primary key for the new v w_ izvewenija
	* @return the new v w_ izvewenija
	*/
	public VW_Izvewenija create(long izvewenija_id);

	/**
	* Removes the v w_ izvewenija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param izvewenija_id the primary key of the v w_ izvewenija
	* @return the v w_ izvewenija that was removed
	* @throws NoSuchVW_IzvewenijaException if a v w_ izvewenija with the primary key could not be found
	*/
	public VW_Izvewenija remove(long izvewenija_id)
		throws NoSuchVW_IzvewenijaException;

	public VW_Izvewenija updateImpl(VW_Izvewenija vw_Izvewenija);

	/**
	* Returns the v w_ izvewenija with the primary key or throws a {@link NoSuchVW_IzvewenijaException} if it could not be found.
	*
	* @param izvewenija_id the primary key of the v w_ izvewenija
	* @return the v w_ izvewenija
	* @throws NoSuchVW_IzvewenijaException if a v w_ izvewenija with the primary key could not be found
	*/
	public VW_Izvewenija findByPrimaryKey(long izvewenija_id)
		throws NoSuchVW_IzvewenijaException;

	/**
	* Returns the v w_ izvewenija with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param izvewenija_id the primary key of the v w_ izvewenija
	* @return the v w_ izvewenija, or <code>null</code> if a v w_ izvewenija with the primary key could not be found
	*/
	public VW_Izvewenija fetchByPrimaryKey(long izvewenija_id);

	@Override
	public java.util.Map<java.io.Serializable, VW_Izvewenija> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the v w_ izvewenijas.
	*
	* @return the v w_ izvewenijas
	*/
	public java.util.List<VW_Izvewenija> findAll();

	/**
	* Returns a range of all the v w_ izvewenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VW_IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v w_ izvewenijas
	* @param end the upper bound of the range of v w_ izvewenijas (not inclusive)
	* @return the range of v w_ izvewenijas
	*/
	public java.util.List<VW_Izvewenija> findAll(int start, int end);

	/**
	* Returns an ordered range of all the v w_ izvewenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VW_IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v w_ izvewenijas
	* @param end the upper bound of the range of v w_ izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v w_ izvewenijas
	*/
	public java.util.List<VW_Izvewenija> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VW_Izvewenija> orderByComparator);

	/**
	* Returns an ordered range of all the v w_ izvewenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VW_IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v w_ izvewenijas
	* @param end the upper bound of the range of v w_ izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v w_ izvewenijas
	*/
	public java.util.List<VW_Izvewenija> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VW_Izvewenija> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the v w_ izvewenijas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of v w_ izvewenijas.
	*
	* @return the number of v w_ izvewenijas
	*/
	public int countAll();
}