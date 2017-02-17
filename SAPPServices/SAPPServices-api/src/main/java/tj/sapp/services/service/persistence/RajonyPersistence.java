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

import tj.sapp.services.exception.NoSuchRajonyException;
import tj.sapp.services.model.Rajony;

/**
 * The persistence interface for the Rajony service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.sapp.services.service.persistence.impl.RajonyPersistenceImpl
 * @see RajonyUtil
 * @generated
 */
@ProviderType
public interface RajonyPersistence extends BasePersistence<Rajony> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RajonyUtil} to access the Rajony persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the Rajonies where nazvanie = &#63;.
	*
	* @param nazvanie the nazvanie
	* @return the matching Rajonies
	*/
	public java.util.List<Rajony> findByAll(java.lang.String nazvanie);

	/**
	* Returns a range of all the Rajonies where nazvanie = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nazvanie the nazvanie
	* @param start the lower bound of the range of Rajonies
	* @param end the upper bound of the range of Rajonies (not inclusive)
	* @return the range of matching Rajonies
	*/
	public java.util.List<Rajony> findByAll(java.lang.String nazvanie,
		int start, int end);

	/**
	* Returns an ordered range of all the Rajonies where nazvanie = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nazvanie the nazvanie
	* @param start the lower bound of the range of Rajonies
	* @param end the upper bound of the range of Rajonies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Rajonies
	*/
	public java.util.List<Rajony> findByAll(java.lang.String nazvanie,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Rajony> orderByComparator);

	/**
	* Returns an ordered range of all the Rajonies where nazvanie = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nazvanie the nazvanie
	* @param start the lower bound of the range of Rajonies
	* @param end the upper bound of the range of Rajonies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching Rajonies
	*/
	public java.util.List<Rajony> findByAll(java.lang.String nazvanie,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Rajony> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first Rajony in the ordered set where nazvanie = &#63;.
	*
	* @param nazvanie the nazvanie
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Rajony
	* @throws NoSuchRajonyException if a matching Rajony could not be found
	*/
	public Rajony findByAll_First(java.lang.String nazvanie,
		com.liferay.portal.kernel.util.OrderByComparator<Rajony> orderByComparator)
		throws NoSuchRajonyException;

	/**
	* Returns the first Rajony in the ordered set where nazvanie = &#63;.
	*
	* @param nazvanie the nazvanie
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Rajony, or <code>null</code> if a matching Rajony could not be found
	*/
	public Rajony fetchByAll_First(java.lang.String nazvanie,
		com.liferay.portal.kernel.util.OrderByComparator<Rajony> orderByComparator);

	/**
	* Returns the last Rajony in the ordered set where nazvanie = &#63;.
	*
	* @param nazvanie the nazvanie
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Rajony
	* @throws NoSuchRajonyException if a matching Rajony could not be found
	*/
	public Rajony findByAll_Last(java.lang.String nazvanie,
		com.liferay.portal.kernel.util.OrderByComparator<Rajony> orderByComparator)
		throws NoSuchRajonyException;

	/**
	* Returns the last Rajony in the ordered set where nazvanie = &#63;.
	*
	* @param nazvanie the nazvanie
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Rajony, or <code>null</code> if a matching Rajony could not be found
	*/
	public Rajony fetchByAll_Last(java.lang.String nazvanie,
		com.liferay.portal.kernel.util.OrderByComparator<Rajony> orderByComparator);

	/**
	* Returns the Rajonies before and after the current Rajony in the ordered set where nazvanie = &#63;.
	*
	* @param rajony_id the primary key of the current Rajony
	* @param nazvanie the nazvanie
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Rajony
	* @throws NoSuchRajonyException if a Rajony with the primary key could not be found
	*/
	public Rajony[] findByAll_PrevAndNext(long rajony_id,
		java.lang.String nazvanie,
		com.liferay.portal.kernel.util.OrderByComparator<Rajony> orderByComparator)
		throws NoSuchRajonyException;

	/**
	* Removes all the Rajonies where nazvanie = &#63; from the database.
	*
	* @param nazvanie the nazvanie
	*/
	public void removeByAll(java.lang.String nazvanie);

	/**
	* Returns the number of Rajonies where nazvanie = &#63;.
	*
	* @param nazvanie the nazvanie
	* @return the number of matching Rajonies
	*/
	public int countByAll(java.lang.String nazvanie);

	/**
	* Caches the Rajony in the entity cache if it is enabled.
	*
	* @param rajony the Rajony
	*/
	public void cacheResult(Rajony rajony);

	/**
	* Caches the Rajonies in the entity cache if it is enabled.
	*
	* @param rajonies the Rajonies
	*/
	public void cacheResult(java.util.List<Rajony> rajonies);

	/**
	* Creates a new Rajony with the primary key. Does not add the Rajony to the database.
	*
	* @param rajony_id the primary key for the new Rajony
	* @return the new Rajony
	*/
	public Rajony create(long rajony_id);

	/**
	* Removes the Rajony with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param rajony_id the primary key of the Rajony
	* @return the Rajony that was removed
	* @throws NoSuchRajonyException if a Rajony with the primary key could not be found
	*/
	public Rajony remove(long rajony_id) throws NoSuchRajonyException;

	public Rajony updateImpl(Rajony rajony);

	/**
	* Returns the Rajony with the primary key or throws a {@link NoSuchRajonyException} if it could not be found.
	*
	* @param rajony_id the primary key of the Rajony
	* @return the Rajony
	* @throws NoSuchRajonyException if a Rajony with the primary key could not be found
	*/
	public Rajony findByPrimaryKey(long rajony_id) throws NoSuchRajonyException;

	/**
	* Returns the Rajony with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param rajony_id the primary key of the Rajony
	* @return the Rajony, or <code>null</code> if a Rajony with the primary key could not be found
	*/
	public Rajony fetchByPrimaryKey(long rajony_id);

	@Override
	public java.util.Map<java.io.Serializable, Rajony> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the Rajonies.
	*
	* @return the Rajonies
	*/
	public java.util.List<Rajony> findAll();

	/**
	* Returns a range of all the Rajonies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Rajonies
	* @param end the upper bound of the range of Rajonies (not inclusive)
	* @return the range of Rajonies
	*/
	public java.util.List<Rajony> findAll(int start, int end);

	/**
	* Returns an ordered range of all the Rajonies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Rajonies
	* @param end the upper bound of the range of Rajonies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Rajonies
	*/
	public java.util.List<Rajony> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Rajony> orderByComparator);

	/**
	* Returns an ordered range of all the Rajonies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Rajonies
	* @param end the upper bound of the range of Rajonies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Rajonies
	*/
	public java.util.List<Rajony> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Rajony> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the Rajonies from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of Rajonies.
	*
	* @return the number of Rajonies
	*/
	public int countAll();
}