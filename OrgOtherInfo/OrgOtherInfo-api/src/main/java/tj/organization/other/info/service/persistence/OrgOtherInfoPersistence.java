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

package tj.organization.other.info.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.organization.other.info.exception.NoSuchOrgOtherInfoException;
import tj.organization.other.info.model.OrgOtherInfo;

/**
 * The persistence interface for the org other info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.organization.other.info.service.persistence.impl.OrgOtherInfoPersistenceImpl
 * @see OrgOtherInfoUtil
 * @generated
 */
@ProviderType
public interface OrgOtherInfoPersistence extends BasePersistence<OrgOtherInfo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OrgOtherInfoUtil} to access the org other info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the org other info where inn = &#63; or throws a {@link NoSuchOrgOtherInfoException} if it could not be found.
	*
	* @param inn the inn
	* @return the matching org other info
	* @throws NoSuchOrgOtherInfoException if a matching org other info could not be found
	*/
	public OrgOtherInfo findByinn(java.lang.String inn)
		throws NoSuchOrgOtherInfoException;

	/**
	* Returns the org other info where inn = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param inn the inn
	* @return the matching org other info, or <code>null</code> if a matching org other info could not be found
	*/
	public OrgOtherInfo fetchByinn(java.lang.String inn);

	/**
	* Returns the org other info where inn = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param inn the inn
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching org other info, or <code>null</code> if a matching org other info could not be found
	*/
	public OrgOtherInfo fetchByinn(java.lang.String inn,
		boolean retrieveFromCache);

	/**
	* Removes the org other info where inn = &#63; from the database.
	*
	* @param inn the inn
	* @return the org other info that was removed
	*/
	public OrgOtherInfo removeByinn(java.lang.String inn)
		throws NoSuchOrgOtherInfoException;

	/**
	* Returns the number of org other infos where inn = &#63;.
	*
	* @param inn the inn
	* @return the number of matching org other infos
	*/
	public int countByinn(java.lang.String inn);

	/**
	* Returns the org other info where organization_id = &#63; or throws a {@link NoSuchOrgOtherInfoException} if it could not be found.
	*
	* @param organization_id the organization_id
	* @return the matching org other info
	* @throws NoSuchOrgOtherInfoException if a matching org other info could not be found
	*/
	public OrgOtherInfo findByOrgOtherInfoId(long organization_id)
		throws NoSuchOrgOtherInfoException;

	/**
	* Returns the org other info where organization_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param organization_id the organization_id
	* @return the matching org other info, or <code>null</code> if a matching org other info could not be found
	*/
	public OrgOtherInfo fetchByOrgOtherInfoId(long organization_id);

	/**
	* Returns the org other info where organization_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param organization_id the organization_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching org other info, or <code>null</code> if a matching org other info could not be found
	*/
	public OrgOtherInfo fetchByOrgOtherInfoId(long organization_id,
		boolean retrieveFromCache);

	/**
	* Removes the org other info where organization_id = &#63; from the database.
	*
	* @param organization_id the organization_id
	* @return the org other info that was removed
	*/
	public OrgOtherInfo removeByOrgOtherInfoId(long organization_id)
		throws NoSuchOrgOtherInfoException;

	/**
	* Returns the number of org other infos where organization_id = &#63;.
	*
	* @param organization_id the organization_id
	* @return the number of matching org other infos
	*/
	public int countByOrgOtherInfoId(long organization_id);

	/**
	* Caches the org other info in the entity cache if it is enabled.
	*
	* @param orgOtherInfo the org other info
	*/
	public void cacheResult(OrgOtherInfo orgOtherInfo);

	/**
	* Caches the org other infos in the entity cache if it is enabled.
	*
	* @param orgOtherInfos the org other infos
	*/
	public void cacheResult(java.util.List<OrgOtherInfo> orgOtherInfos);

	/**
	* Creates a new org other info with the primary key. Does not add the org other info to the database.
	*
	* @param organization_id the primary key for the new org other info
	* @return the new org other info
	*/
	public OrgOtherInfo create(long organization_id);

	/**
	* Removes the org other info with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param organization_id the primary key of the org other info
	* @return the org other info that was removed
	* @throws NoSuchOrgOtherInfoException if a org other info with the primary key could not be found
	*/
	public OrgOtherInfo remove(long organization_id)
		throws NoSuchOrgOtherInfoException;

	public OrgOtherInfo updateImpl(OrgOtherInfo orgOtherInfo);

	/**
	* Returns the org other info with the primary key or throws a {@link NoSuchOrgOtherInfoException} if it could not be found.
	*
	* @param organization_id the primary key of the org other info
	* @return the org other info
	* @throws NoSuchOrgOtherInfoException if a org other info with the primary key could not be found
	*/
	public OrgOtherInfo findByPrimaryKey(long organization_id)
		throws NoSuchOrgOtherInfoException;

	/**
	* Returns the org other info with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param organization_id the primary key of the org other info
	* @return the org other info, or <code>null</code> if a org other info with the primary key could not be found
	*/
	public OrgOtherInfo fetchByPrimaryKey(long organization_id);

	@Override
	public java.util.Map<java.io.Serializable, OrgOtherInfo> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the org other infos.
	*
	* @return the org other infos
	*/
	public java.util.List<OrgOtherInfo> findAll();

	/**
	* Returns a range of all the org other infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgOtherInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of org other infos
	* @param end the upper bound of the range of org other infos (not inclusive)
	* @return the range of org other infos
	*/
	public java.util.List<OrgOtherInfo> findAll(int start, int end);

	/**
	* Returns an ordered range of all the org other infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgOtherInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of org other infos
	* @param end the upper bound of the range of org other infos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of org other infos
	*/
	public java.util.List<OrgOtherInfo> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OrgOtherInfo> orderByComparator);

	/**
	* Returns an ordered range of all the org other infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgOtherInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of org other infos
	* @param end the upper bound of the range of org other infos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of org other infos
	*/
	public java.util.List<OrgOtherInfo> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OrgOtherInfo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the org other infos from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of org other infos.
	*
	* @return the number of org other infos
	*/
	public int countAll();
}