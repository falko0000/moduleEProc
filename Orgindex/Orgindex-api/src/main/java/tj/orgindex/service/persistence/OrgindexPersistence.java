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

package tj.orgindex.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.orgindex.exception.NoSuchOrgindexException;

import tj.orgindex.model.Orgindex;

/**
 * The persistence interface for the orgindex service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.orgindex.service.persistence.impl.OrgindexPersistenceImpl
 * @see OrgindexUtil
 * @generated
 */
@ProviderType
public interface OrgindexPersistence extends BasePersistence<Orgindex> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OrgindexUtil} to access the orgindex persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the orgindexs where organization_id = &#63;.
	*
	* @param organization_id the organization_id
	* @return the matching orgindexs
	*/
	public java.util.List<Orgindex> findByFindByOrgID(long organization_id);

	/**
	* Returns a range of all the orgindexs where organization_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgindexModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organization_id the organization_id
	* @param start the lower bound of the range of orgindexs
	* @param end the upper bound of the range of orgindexs (not inclusive)
	* @return the range of matching orgindexs
	*/
	public java.util.List<Orgindex> findByFindByOrgID(long organization_id,
		int start, int end);

	/**
	* Returns an ordered range of all the orgindexs where organization_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgindexModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organization_id the organization_id
	* @param start the lower bound of the range of orgindexs
	* @param end the upper bound of the range of orgindexs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching orgindexs
	*/
	public java.util.List<Orgindex> findByFindByOrgID(long organization_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Orgindex> orderByComparator);

	/**
	* Returns an ordered range of all the orgindexs where organization_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgindexModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organization_id the organization_id
	* @param start the lower bound of the range of orgindexs
	* @param end the upper bound of the range of orgindexs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching orgindexs
	*/
	public java.util.List<Orgindex> findByFindByOrgID(long organization_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Orgindex> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first orgindex in the ordered set where organization_id = &#63;.
	*
	* @param organization_id the organization_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching orgindex
	* @throws NoSuchOrgindexException if a matching orgindex could not be found
	*/
	public Orgindex findByFindByOrgID_First(long organization_id,
		com.liferay.portal.kernel.util.OrderByComparator<Orgindex> orderByComparator)
		throws NoSuchOrgindexException;

	/**
	* Returns the first orgindex in the ordered set where organization_id = &#63;.
	*
	* @param organization_id the organization_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching orgindex, or <code>null</code> if a matching orgindex could not be found
	*/
	public Orgindex fetchByFindByOrgID_First(long organization_id,
		com.liferay.portal.kernel.util.OrderByComparator<Orgindex> orderByComparator);

	/**
	* Returns the last orgindex in the ordered set where organization_id = &#63;.
	*
	* @param organization_id the organization_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching orgindex
	* @throws NoSuchOrgindexException if a matching orgindex could not be found
	*/
	public Orgindex findByFindByOrgID_Last(long organization_id,
		com.liferay.portal.kernel.util.OrderByComparator<Orgindex> orderByComparator)
		throws NoSuchOrgindexException;

	/**
	* Returns the last orgindex in the ordered set where organization_id = &#63;.
	*
	* @param organization_id the organization_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching orgindex, or <code>null</code> if a matching orgindex could not be found
	*/
	public Orgindex fetchByFindByOrgID_Last(long organization_id,
		com.liferay.portal.kernel.util.OrderByComparator<Orgindex> orderByComparator);

	/**
	* Returns the orgindexs before and after the current orgindex in the ordered set where organization_id = &#63;.
	*
	* @param orgindex_id the primary key of the current orgindex
	* @param organization_id the organization_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next orgindex
	* @throws NoSuchOrgindexException if a orgindex with the primary key could not be found
	*/
	public Orgindex[] findByFindByOrgID_PrevAndNext(long orgindex_id,
		long organization_id,
		com.liferay.portal.kernel.util.OrderByComparator<Orgindex> orderByComparator)
		throws NoSuchOrgindexException;

	/**
	* Removes all the orgindexs where organization_id = &#63; from the database.
	*
	* @param organization_id the organization_id
	*/
	public void removeByFindByOrgID(long organization_id);

	/**
	* Returns the number of orgindexs where organization_id = &#63;.
	*
	* @param organization_id the organization_id
	* @return the number of matching orgindexs
	*/
	public int countByFindByOrgID(long organization_id);

	/**
	* Caches the orgindex in the entity cache if it is enabled.
	*
	* @param orgindex the orgindex
	*/
	public void cacheResult(Orgindex orgindex);

	/**
	* Caches the orgindexs in the entity cache if it is enabled.
	*
	* @param orgindexs the orgindexs
	*/
	public void cacheResult(java.util.List<Orgindex> orgindexs);

	/**
	* Creates a new orgindex with the primary key. Does not add the orgindex to the database.
	*
	* @param orgindex_id the primary key for the new orgindex
	* @return the new orgindex
	*/
	public Orgindex create(long orgindex_id);

	/**
	* Removes the orgindex with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orgindex_id the primary key of the orgindex
	* @return the orgindex that was removed
	* @throws NoSuchOrgindexException if a orgindex with the primary key could not be found
	*/
	public Orgindex remove(long orgindex_id) throws NoSuchOrgindexException;

	public Orgindex updateImpl(Orgindex orgindex);

	/**
	* Returns the orgindex with the primary key or throws a {@link NoSuchOrgindexException} if it could not be found.
	*
	* @param orgindex_id the primary key of the orgindex
	* @return the orgindex
	* @throws NoSuchOrgindexException if a orgindex with the primary key could not be found
	*/
	public Orgindex findByPrimaryKey(long orgindex_id)
		throws NoSuchOrgindexException;

	/**
	* Returns the orgindex with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param orgindex_id the primary key of the orgindex
	* @return the orgindex, or <code>null</code> if a orgindex with the primary key could not be found
	*/
	public Orgindex fetchByPrimaryKey(long orgindex_id);

	@Override
	public java.util.Map<java.io.Serializable, Orgindex> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the orgindexs.
	*
	* @return the orgindexs
	*/
	public java.util.List<Orgindex> findAll();

	/**
	* Returns a range of all the orgindexs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgindexModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of orgindexs
	* @param end the upper bound of the range of orgindexs (not inclusive)
	* @return the range of orgindexs
	*/
	public java.util.List<Orgindex> findAll(int start, int end);

	/**
	* Returns an ordered range of all the orgindexs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgindexModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of orgindexs
	* @param end the upper bound of the range of orgindexs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of orgindexs
	*/
	public java.util.List<Orgindex> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Orgindex> orderByComparator);

	/**
	* Returns an ordered range of all the orgindexs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrgindexModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of orgindexs
	* @param end the upper bound of the range of orgindexs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of orgindexs
	*/
	public java.util.List<Orgindex> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Orgindex> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the orgindexs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of orgindexs.
	*
	* @return the number of orgindexs
	*/
	public int countAll();
}