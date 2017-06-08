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

package tj.fbk.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.fbk.exception.NoSuchFbkException;

import tj.fbk.model.Fbk;

/**
 * The persistence interface for the fbk service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.fbk.service.persistence.impl.FbkPersistenceImpl
 * @see FbkUtil
 * @generated
 */
@ProviderType
public interface FbkPersistence extends BasePersistence<Fbk> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FbkUtil} to access the fbk persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the fbk where kod = &#63; or throws a {@link NoSuchFbkException} if it could not be found.
	*
	* @param kod the kod
	* @return the matching fbk
	* @throws NoSuchFbkException if a matching fbk could not be found
	*/
	public Fbk findByKod(java.lang.String kod) throws NoSuchFbkException;

	/**
	* Returns the fbk where kod = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param kod the kod
	* @return the matching fbk, or <code>null</code> if a matching fbk could not be found
	*/
	public Fbk fetchByKod(java.lang.String kod);

	/**
	* Returns the fbk where kod = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param kod the kod
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching fbk, or <code>null</code> if a matching fbk could not be found
	*/
	public Fbk fetchByKod(java.lang.String kod, boolean retrieveFromCache);

	/**
	* Removes the fbk where kod = &#63; from the database.
	*
	* @param kod the kod
	* @return the fbk that was removed
	*/
	public Fbk removeByKod(java.lang.String kod) throws NoSuchFbkException;

	/**
	* Returns the number of fbks where kod = &#63;.
	*
	* @param kod the kod
	* @return the number of matching fbks
	*/
	public int countByKod(java.lang.String kod);

	/**
	* Returns all the fbks where pid = &#63;.
	*
	* @param pid the pid
	* @return the matching fbks
	*/
	public java.util.List<Fbk> findByPid(int pid);

	/**
	* Returns a range of all the fbks where pid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pid the pid
	* @param start the lower bound of the range of fbks
	* @param end the upper bound of the range of fbks (not inclusive)
	* @return the range of matching fbks
	*/
	public java.util.List<Fbk> findByPid(int pid, int start, int end);

	/**
	* Returns an ordered range of all the fbks where pid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pid the pid
	* @param start the lower bound of the range of fbks
	* @param end the upper bound of the range of fbks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching fbks
	*/
	public java.util.List<Fbk> findByPid(int pid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Fbk> orderByComparator);

	/**
	* Returns an ordered range of all the fbks where pid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pid the pid
	* @param start the lower bound of the range of fbks
	* @param end the upper bound of the range of fbks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching fbks
	*/
	public java.util.List<Fbk> findByPid(int pid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Fbk> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first fbk in the ordered set where pid = &#63;.
	*
	* @param pid the pid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fbk
	* @throws NoSuchFbkException if a matching fbk could not be found
	*/
	public Fbk findByPid_First(int pid,
		com.liferay.portal.kernel.util.OrderByComparator<Fbk> orderByComparator)
		throws NoSuchFbkException;

	/**
	* Returns the first fbk in the ordered set where pid = &#63;.
	*
	* @param pid the pid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fbk, or <code>null</code> if a matching fbk could not be found
	*/
	public Fbk fetchByPid_First(int pid,
		com.liferay.portal.kernel.util.OrderByComparator<Fbk> orderByComparator);

	/**
	* Returns the last fbk in the ordered set where pid = &#63;.
	*
	* @param pid the pid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fbk
	* @throws NoSuchFbkException if a matching fbk could not be found
	*/
	public Fbk findByPid_Last(int pid,
		com.liferay.portal.kernel.util.OrderByComparator<Fbk> orderByComparator)
		throws NoSuchFbkException;

	/**
	* Returns the last fbk in the ordered set where pid = &#63;.
	*
	* @param pid the pid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fbk, or <code>null</code> if a matching fbk could not be found
	*/
	public Fbk fetchByPid_Last(int pid,
		com.liferay.portal.kernel.util.OrderByComparator<Fbk> orderByComparator);

	/**
	* Returns the fbks before and after the current fbk in the ordered set where pid = &#63;.
	*
	* @param fbk_id the primary key of the current fbk
	* @param pid the pid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next fbk
	* @throws NoSuchFbkException if a fbk with the primary key could not be found
	*/
	public Fbk[] findByPid_PrevAndNext(long fbk_id, int pid,
		com.liferay.portal.kernel.util.OrderByComparator<Fbk> orderByComparator)
		throws NoSuchFbkException;

	/**
	* Removes all the fbks where pid = &#63; from the database.
	*
	* @param pid the pid
	*/
	public void removeByPid(int pid);

	/**
	* Returns the number of fbks where pid = &#63;.
	*
	* @param pid the pid
	* @return the number of matching fbks
	*/
	public int countByPid(int pid);

	/**
	* Caches the fbk in the entity cache if it is enabled.
	*
	* @param fbk the fbk
	*/
	public void cacheResult(Fbk fbk);

	/**
	* Caches the fbks in the entity cache if it is enabled.
	*
	* @param fbks the fbks
	*/
	public void cacheResult(java.util.List<Fbk> fbks);

	/**
	* Creates a new fbk with the primary key. Does not add the fbk to the database.
	*
	* @param fbk_id the primary key for the new fbk
	* @return the new fbk
	*/
	public Fbk create(long fbk_id);

	/**
	* Removes the fbk with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fbk_id the primary key of the fbk
	* @return the fbk that was removed
	* @throws NoSuchFbkException if a fbk with the primary key could not be found
	*/
	public Fbk remove(long fbk_id) throws NoSuchFbkException;

	public Fbk updateImpl(Fbk fbk);

	/**
	* Returns the fbk with the primary key or throws a {@link NoSuchFbkException} if it could not be found.
	*
	* @param fbk_id the primary key of the fbk
	* @return the fbk
	* @throws NoSuchFbkException if a fbk with the primary key could not be found
	*/
	public Fbk findByPrimaryKey(long fbk_id) throws NoSuchFbkException;

	/**
	* Returns the fbk with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fbk_id the primary key of the fbk
	* @return the fbk, or <code>null</code> if a fbk with the primary key could not be found
	*/
	public Fbk fetchByPrimaryKey(long fbk_id);

	@Override
	public java.util.Map<java.io.Serializable, Fbk> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the fbks.
	*
	* @return the fbks
	*/
	public java.util.List<Fbk> findAll();

	/**
	* Returns a range of all the fbks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fbks
	* @param end the upper bound of the range of fbks (not inclusive)
	* @return the range of fbks
	*/
	public java.util.List<Fbk> findAll(int start, int end);

	/**
	* Returns an ordered range of all the fbks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fbks
	* @param end the upper bound of the range of fbks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of fbks
	*/
	public java.util.List<Fbk> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Fbk> orderByComparator);

	/**
	* Returns an ordered range of all the fbks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fbks
	* @param end the upper bound of the range of fbks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of fbks
	*/
	public java.util.List<Fbk> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Fbk> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the fbks from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of fbks.
	*
	* @return the number of fbks
	*/
	public int countAll();
}