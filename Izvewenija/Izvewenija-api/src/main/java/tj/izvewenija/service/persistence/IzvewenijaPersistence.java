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

package tj.izvewenija.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.izvewenija.exception.NoSuchIzvewenijaException;

import tj.izvewenija.model.Izvewenija;

/**
 * The persistence interface for the izvewenija service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.izvewenija.service.persistence.impl.IzvewenijaPersistenceImpl
 * @see IzvewenijaUtil
 * @generated
 */
@ProviderType
public interface IzvewenijaPersistence extends BasePersistence<Izvewenija> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link IzvewenijaUtil} to access the izvewenija persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the izvewenijas where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching izvewenijas
	*/
	public java.util.List<Izvewenija> findByCompanyId_GroupId(long companyId,
		long groupId);

	/**
	* Returns a range of all the izvewenijas where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @return the range of matching izvewenijas
	*/
	public java.util.List<Izvewenija> findByCompanyId_GroupId(long companyId,
		long groupId, int start, int end);

	/**
	* Returns an ordered range of all the izvewenijas where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching izvewenijas
	*/
	public java.util.List<Izvewenija> findByCompanyId_GroupId(long companyId,
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator);

	/**
	* Returns an ordered range of all the izvewenijas where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching izvewenijas
	*/
	public java.util.List<Izvewenija> findByCompanyId_GroupId(long companyId,
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first izvewenija in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching izvewenija
	* @throws NoSuchIzvewenijaException if a matching izvewenija could not be found
	*/
	public Izvewenija findByCompanyId_GroupId_First(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator)
		throws NoSuchIzvewenijaException;

	/**
	* Returns the first izvewenija in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching izvewenija, or <code>null</code> if a matching izvewenija could not be found
	*/
	public Izvewenija fetchByCompanyId_GroupId_First(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator);

	/**
	* Returns the last izvewenija in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching izvewenija
	* @throws NoSuchIzvewenijaException if a matching izvewenija could not be found
	*/
	public Izvewenija findByCompanyId_GroupId_Last(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator)
		throws NoSuchIzvewenijaException;

	/**
	* Returns the last izvewenija in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching izvewenija, or <code>null</code> if a matching izvewenija could not be found
	*/
	public Izvewenija fetchByCompanyId_GroupId_Last(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator);

	/**
	* Returns the izvewenijas before and after the current izvewenija in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param izvewenija_id the primary key of the current izvewenija
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next izvewenija
	* @throws NoSuchIzvewenijaException if a izvewenija with the primary key could not be found
	*/
	public Izvewenija[] findByCompanyId_GroupId_PrevAndNext(
		long izvewenija_id, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator)
		throws NoSuchIzvewenijaException;

	/**
	* Returns all the izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching izvewenijas that the user has permission to view
	*/
	public java.util.List<Izvewenija> filterFindByCompanyId_GroupId(
		long companyId, long groupId);

	/**
	* Returns a range of all the izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @return the range of matching izvewenijas that the user has permission to view
	*/
	public java.util.List<Izvewenija> filterFindByCompanyId_GroupId(
		long companyId, long groupId, int start, int end);

	/**
	* Returns an ordered range of all the izvewenijas that the user has permissions to view where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching izvewenijas that the user has permission to view
	*/
	public java.util.List<Izvewenija> filterFindByCompanyId_GroupId(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator);

	/**
	* Returns the izvewenijas before and after the current izvewenija in the ordered set of izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63;.
	*
	* @param izvewenija_id the primary key of the current izvewenija
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next izvewenija
	* @throws NoSuchIzvewenijaException if a izvewenija with the primary key could not be found
	*/
	public Izvewenija[] filterFindByCompanyId_GroupId_PrevAndNext(
		long izvewenija_id, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator)
		throws NoSuchIzvewenijaException;

	/**
	* Removes all the izvewenijas where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	*/
	public void removeByCompanyId_GroupId(long companyId, long groupId);

	/**
	* Returns the number of izvewenijas where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching izvewenijas
	*/
	public int countByCompanyId_GroupId(long companyId, long groupId);

	/**
	* Returns the number of izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching izvewenijas that the user has permission to view
	*/
	public int filterCountByCompanyId_GroupId(long companyId, long groupId);

	/**
	* Returns all the izvewenijas where izvewenija_id = &#63; and sozdal = &#63;.
	*
	* @param izvewenija_id the izvewenija_id
	* @param sozdal the sozdal
	* @return the matching izvewenijas
	*/
	public java.util.List<Izvewenija> findByIzvewenijaId(long izvewenija_id,
		long sozdal);

	/**
	* Returns a range of all the izvewenijas where izvewenija_id = &#63; and sozdal = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenija_id the izvewenija_id
	* @param sozdal the sozdal
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @return the range of matching izvewenijas
	*/
	public java.util.List<Izvewenija> findByIzvewenijaId(long izvewenija_id,
		long sozdal, int start, int end);

	/**
	* Returns an ordered range of all the izvewenijas where izvewenija_id = &#63; and sozdal = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenija_id the izvewenija_id
	* @param sozdal the sozdal
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching izvewenijas
	*/
	public java.util.List<Izvewenija> findByIzvewenijaId(long izvewenija_id,
		long sozdal, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator);

	/**
	* Returns an ordered range of all the izvewenijas where izvewenija_id = &#63; and sozdal = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenija_id the izvewenija_id
	* @param sozdal the sozdal
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching izvewenijas
	*/
	public java.util.List<Izvewenija> findByIzvewenijaId(long izvewenija_id,
		long sozdal, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first izvewenija in the ordered set where izvewenija_id = &#63; and sozdal = &#63;.
	*
	* @param izvewenija_id the izvewenija_id
	* @param sozdal the sozdal
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching izvewenija
	* @throws NoSuchIzvewenijaException if a matching izvewenija could not be found
	*/
	public Izvewenija findByIzvewenijaId_First(long izvewenija_id, long sozdal,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator)
		throws NoSuchIzvewenijaException;

	/**
	* Returns the first izvewenija in the ordered set where izvewenija_id = &#63; and sozdal = &#63;.
	*
	* @param izvewenija_id the izvewenija_id
	* @param sozdal the sozdal
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching izvewenija, or <code>null</code> if a matching izvewenija could not be found
	*/
	public Izvewenija fetchByIzvewenijaId_First(long izvewenija_id,
		long sozdal,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator);

	/**
	* Returns the last izvewenija in the ordered set where izvewenija_id = &#63; and sozdal = &#63;.
	*
	* @param izvewenija_id the izvewenija_id
	* @param sozdal the sozdal
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching izvewenija
	* @throws NoSuchIzvewenijaException if a matching izvewenija could not be found
	*/
	public Izvewenija findByIzvewenijaId_Last(long izvewenija_id, long sozdal,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator)
		throws NoSuchIzvewenijaException;

	/**
	* Returns the last izvewenija in the ordered set where izvewenija_id = &#63; and sozdal = &#63;.
	*
	* @param izvewenija_id the izvewenija_id
	* @param sozdal the sozdal
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching izvewenija, or <code>null</code> if a matching izvewenija could not be found
	*/
	public Izvewenija fetchByIzvewenijaId_Last(long izvewenija_id, long sozdal,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator);

	/**
	* Removes all the izvewenijas where izvewenija_id = &#63; and sozdal = &#63; from the database.
	*
	* @param izvewenija_id the izvewenija_id
	* @param sozdal the sozdal
	*/
	public void removeByIzvewenijaId(long izvewenija_id, long sozdal);

	/**
	* Returns the number of izvewenijas where izvewenija_id = &#63; and sozdal = &#63;.
	*
	* @param izvewenija_id the izvewenija_id
	* @param sozdal the sozdal
	* @return the number of matching izvewenijas
	*/
	public int countByIzvewenijaId(long izvewenija_id, long sozdal);

	/**
	* Returns all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @return the matching izvewenijas
	*/
	public java.util.List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id);

	/**
	* Returns a range of all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @return the range of matching izvewenijas
	*/
	public java.util.List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id,
		int start, int end);

	/**
	* Returns an ordered range of all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching izvewenijas
	*/
	public java.util.List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator);

	/**
	* Returns an ordered range of all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching izvewenijas
	*/
	public java.util.List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first izvewenija in the ordered set where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching izvewenija
	* @throws NoSuchIzvewenijaException if a matching izvewenija could not be found
	*/
	public Izvewenija findByCompanyIdGroupIdSostojanieIdStatusId_First(
		long companyId, long groupId, long sostojanie_id, long status_id,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator)
		throws NoSuchIzvewenijaException;

	/**
	* Returns the first izvewenija in the ordered set where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching izvewenija, or <code>null</code> if a matching izvewenija could not be found
	*/
	public Izvewenija fetchByCompanyIdGroupIdSostojanieIdStatusId_First(
		long companyId, long groupId, long sostojanie_id, long status_id,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator);

	/**
	* Returns the last izvewenija in the ordered set where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching izvewenija
	* @throws NoSuchIzvewenijaException if a matching izvewenija could not be found
	*/
	public Izvewenija findByCompanyIdGroupIdSostojanieIdStatusId_Last(
		long companyId, long groupId, long sostojanie_id, long status_id,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator)
		throws NoSuchIzvewenijaException;

	/**
	* Returns the last izvewenija in the ordered set where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching izvewenija, or <code>null</code> if a matching izvewenija could not be found
	*/
	public Izvewenija fetchByCompanyIdGroupIdSostojanieIdStatusId_Last(
		long companyId, long groupId, long sostojanie_id, long status_id,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator);

	/**
	* Returns the izvewenijas before and after the current izvewenija in the ordered set where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* @param izvewenija_id the primary key of the current izvewenija
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next izvewenija
	* @throws NoSuchIzvewenijaException if a izvewenija with the primary key could not be found
	*/
	public Izvewenija[] findByCompanyIdGroupIdSostojanieIdStatusId_PrevAndNext(
		long izvewenija_id, long companyId, long groupId, long sostojanie_id,
		long status_id,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator)
		throws NoSuchIzvewenijaException;

	/**
	* Returns all the izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @return the matching izvewenijas that the user has permission to view
	*/
	public java.util.List<Izvewenija> filterFindByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id);

	/**
	* Returns a range of all the izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @return the range of matching izvewenijas that the user has permission to view
	*/
	public java.util.List<Izvewenija> filterFindByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id,
		int start, int end);

	/**
	* Returns an ordered range of all the izvewenijas that the user has permissions to view where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching izvewenijas that the user has permission to view
	*/
	public java.util.List<Izvewenija> filterFindByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator);

	/**
	* Returns the izvewenijas before and after the current izvewenija in the ordered set of izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* @param izvewenija_id the primary key of the current izvewenija
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next izvewenija
	* @throws NoSuchIzvewenijaException if a izvewenija with the primary key could not be found
	*/
	public Izvewenija[] filterFindByCompanyIdGroupIdSostojanieIdStatusId_PrevAndNext(
		long izvewenija_id, long companyId, long groupId, long sostojanie_id,
		long status_id,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator)
		throws NoSuchIzvewenijaException;

	/**
	* Returns all the izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_ids the sostojanie_ids
	* @param status_ids the status_ids
	* @return the matching izvewenijas that the user has permission to view
	*/
	public java.util.List<Izvewenija> filterFindByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids);

	/**
	* Returns a range of all the izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_ids the sostojanie_ids
	* @param status_ids the status_ids
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @return the range of matching izvewenijas that the user has permission to view
	*/
	public java.util.List<Izvewenija> filterFindByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids,
		int start, int end);

	/**
	* Returns an ordered range of all the izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_ids the sostojanie_ids
	* @param status_ids the status_ids
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching izvewenijas that the user has permission to view
	*/
	public java.util.List<Izvewenija> filterFindByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator);

	/**
	* Returns all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_ids the sostojanie_ids
	* @param status_ids the status_ids
	* @return the matching izvewenijas
	*/
	public java.util.List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids);

	/**
	* Returns a range of all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_ids the sostojanie_ids
	* @param status_ids the status_ids
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @return the range of matching izvewenijas
	*/
	public java.util.List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids,
		int start, int end);

	/**
	* Returns an ordered range of all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_ids the sostojanie_ids
	* @param status_ids the status_ids
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching izvewenijas
	*/
	public java.util.List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator);

	/**
	* Returns an ordered range of all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching izvewenijas
	*/
	public java.util.List<Izvewenija> findByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	*/
	public void removeByCompanyIdGroupIdSostojanieIdStatusId(long companyId,
		long groupId, long sostojanie_id, long status_id);

	/**
	* Returns the number of izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @return the number of matching izvewenijas
	*/
	public int countByCompanyIdGroupIdSostojanieIdStatusId(long companyId,
		long groupId, long sostojanie_id, long status_id);

	/**
	* Returns the number of izvewenijas where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_ids the sostojanie_ids
	* @param status_ids the status_ids
	* @return the number of matching izvewenijas
	*/
	public int countByCompanyIdGroupIdSostojanieIdStatusId(long companyId,
		long groupId, long[] sostojanie_ids, long[] status_ids);

	/**
	* Returns the number of izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = &#63; and status_id = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_id the sostojanie_id
	* @param status_id the status_id
	* @return the number of matching izvewenijas that the user has permission to view
	*/
	public int filterCountByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long sostojanie_id, long status_id);

	/**
	* Returns the number of izvewenijas that the user has permission to view where companyId = &#63; and groupId = &#63; and sostojanie_id = any &#63; and status_id = any &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param sostojanie_ids the sostojanie_ids
	* @param status_ids the status_ids
	* @return the number of matching izvewenijas that the user has permission to view
	*/
	public int filterCountByCompanyIdGroupIdSostojanieIdStatusId(
		long companyId, long groupId, long[] sostojanie_ids, long[] status_ids);

	/**
	* Caches the izvewenija in the entity cache if it is enabled.
	*
	* @param izvewenija the izvewenija
	*/
	public void cacheResult(Izvewenija izvewenija);

	/**
	* Caches the izvewenijas in the entity cache if it is enabled.
	*
	* @param izvewenijas the izvewenijas
	*/
	public void cacheResult(java.util.List<Izvewenija> izvewenijas);

	/**
	* Creates a new izvewenija with the primary key. Does not add the izvewenija to the database.
	*
	* @param izvewenija_id the primary key for the new izvewenija
	* @return the new izvewenija
	*/
	public Izvewenija create(long izvewenija_id);

	/**
	* Removes the izvewenija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param izvewenija_id the primary key of the izvewenija
	* @return the izvewenija that was removed
	* @throws NoSuchIzvewenijaException if a izvewenija with the primary key could not be found
	*/
	public Izvewenija remove(long izvewenija_id)
		throws NoSuchIzvewenijaException;

	public Izvewenija updateImpl(Izvewenija izvewenija);

	/**
	* Returns the izvewenija with the primary key or throws a {@link NoSuchIzvewenijaException} if it could not be found.
	*
	* @param izvewenija_id the primary key of the izvewenija
	* @return the izvewenija
	* @throws NoSuchIzvewenijaException if a izvewenija with the primary key could not be found
	*/
	public Izvewenija findByPrimaryKey(long izvewenija_id)
		throws NoSuchIzvewenijaException;

	/**
	* Returns the izvewenija with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param izvewenija_id the primary key of the izvewenija
	* @return the izvewenija, or <code>null</code> if a izvewenija with the primary key could not be found
	*/
	public Izvewenija fetchByPrimaryKey(long izvewenija_id);

	@Override
	public java.util.Map<java.io.Serializable, Izvewenija> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the izvewenijas.
	*
	* @return the izvewenijas
	*/
	public java.util.List<Izvewenija> findAll();

	/**
	* Returns a range of all the izvewenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @return the range of izvewenijas
	*/
	public java.util.List<Izvewenija> findAll(int start, int end);

	/**
	* Returns an ordered range of all the izvewenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of izvewenijas
	*/
	public java.util.List<Izvewenija> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator);

	/**
	* Returns an ordered range of all the izvewenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of izvewenijas
	*/
	public java.util.List<Izvewenija> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Izvewenija> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the izvewenijas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of izvewenijas.
	*
	* @return the number of izvewenijas
	*/
	public int countAll();
}