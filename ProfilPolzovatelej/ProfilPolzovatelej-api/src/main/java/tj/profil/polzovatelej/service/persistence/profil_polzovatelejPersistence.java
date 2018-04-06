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

package tj.profil.polzovatelej.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.profil.polzovatelej.exception.NoSuchprofil_polzovatelejException;
import tj.profil.polzovatelej.model.profil_polzovatelej;

/**
 * The persistence interface for the profil_polzovatelej service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.profil.polzovatelej.service.persistence.impl.profil_polzovatelejPersistenceImpl
 * @see profil_polzovatelejUtil
 * @generated
 */
@ProviderType
public interface profil_polzovatelejPersistence extends BasePersistence<profil_polzovatelej> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link profil_polzovatelejUtil} to access the profil_polzovatelej persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the profil_polzovatelej in the entity cache if it is enabled.
	*
	* @param profil_polzovatelej the profil_polzovatelej
	*/
	public void cacheResult(profil_polzovatelej profil_polzovatelej);

	/**
	* Caches the profil_polzovatelejs in the entity cache if it is enabled.
	*
	* @param profil_polzovatelejs the profil_polzovatelejs
	*/
	public void cacheResult(
		java.util.List<profil_polzovatelej> profil_polzovatelejs);

	/**
	* Creates a new profil_polzovatelej with the primary key. Does not add the profil_polzovatelej to the database.
	*
	* @param profil_polzovatelej_id the primary key for the new profil_polzovatelej
	* @return the new profil_polzovatelej
	*/
	public profil_polzovatelej create(long profil_polzovatelej_id);

	/**
	* Removes the profil_polzovatelej with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param profil_polzovatelej_id the primary key of the profil_polzovatelej
	* @return the profil_polzovatelej that was removed
	* @throws NoSuchprofil_polzovatelejException if a profil_polzovatelej with the primary key could not be found
	*/
	public profil_polzovatelej remove(long profil_polzovatelej_id)
		throws NoSuchprofil_polzovatelejException;

	public profil_polzovatelej updateImpl(
		profil_polzovatelej profil_polzovatelej);

	/**
	* Returns the profil_polzovatelej with the primary key or throws a {@link NoSuchprofil_polzovatelejException} if it could not be found.
	*
	* @param profil_polzovatelej_id the primary key of the profil_polzovatelej
	* @return the profil_polzovatelej
	* @throws NoSuchprofil_polzovatelejException if a profil_polzovatelej with the primary key could not be found
	*/
	public profil_polzovatelej findByPrimaryKey(long profil_polzovatelej_id)
		throws NoSuchprofil_polzovatelejException;

	/**
	* Returns the profil_polzovatelej with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param profil_polzovatelej_id the primary key of the profil_polzovatelej
	* @return the profil_polzovatelej, or <code>null</code> if a profil_polzovatelej with the primary key could not be found
	*/
	public profil_polzovatelej fetchByPrimaryKey(long profil_polzovatelej_id);

	@Override
	public java.util.Map<java.io.Serializable, profil_polzovatelej> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the profil_polzovatelejs.
	*
	* @return the profil_polzovatelejs
	*/
	public java.util.List<profil_polzovatelej> findAll();

	/**
	* Returns a range of all the profil_polzovatelejs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link profil_polzovatelejModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of profil_polzovatelejs
	* @param end the upper bound of the range of profil_polzovatelejs (not inclusive)
	* @return the range of profil_polzovatelejs
	*/
	public java.util.List<profil_polzovatelej> findAll(int start, int end);

	/**
	* Returns an ordered range of all the profil_polzovatelejs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link profil_polzovatelejModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of profil_polzovatelejs
	* @param end the upper bound of the range of profil_polzovatelejs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of profil_polzovatelejs
	*/
	public java.util.List<profil_polzovatelej> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<profil_polzovatelej> orderByComparator);

	/**
	* Returns an ordered range of all the profil_polzovatelejs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link profil_polzovatelejModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of profil_polzovatelejs
	* @param end the upper bound of the range of profil_polzovatelejs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of profil_polzovatelejs
	*/
	public java.util.List<profil_polzovatelej> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<profil_polzovatelej> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the profil_polzovatelejs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of profil_polzovatelejs.
	*
	* @return the number of profil_polzovatelejs
	*/
	public int countAll();
}