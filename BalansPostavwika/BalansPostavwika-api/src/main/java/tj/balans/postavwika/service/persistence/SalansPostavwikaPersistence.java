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

package tj.balans.postavwika.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.balans.postavwika.exception.NoSuchSalansPostavwikaException;
import tj.balans.postavwika.model.SalansPostavwika;

/**
 * The persistence interface for the salans postavwika service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.balans.postavwika.service.persistence.impl.SalansPostavwikaPersistenceImpl
 * @see SalansPostavwikaUtil
 * @generated
 */
@ProviderType
public interface SalansPostavwikaPersistence extends BasePersistence<SalansPostavwika> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SalansPostavwikaUtil} to access the salans postavwika persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the salans postavwika in the entity cache if it is enabled.
	*
	* @param salansPostavwika the salans postavwika
	*/
	public void cacheResult(SalansPostavwika salansPostavwika);

	/**
	* Caches the salans postavwikas in the entity cache if it is enabled.
	*
	* @param salansPostavwikas the salans postavwikas
	*/
	public void cacheResult(java.util.List<SalansPostavwika> salansPostavwikas);

	/**
	* Creates a new salans postavwika with the primary key. Does not add the salans postavwika to the database.
	*
	* @param balans_postavwika_id the primary key for the new salans postavwika
	* @return the new salans postavwika
	*/
	public SalansPostavwika create(long balans_postavwika_id);

	/**
	* Removes the salans postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param balans_postavwika_id the primary key of the salans postavwika
	* @return the salans postavwika that was removed
	* @throws NoSuchSalansPostavwikaException if a salans postavwika with the primary key could not be found
	*/
	public SalansPostavwika remove(long balans_postavwika_id)
		throws NoSuchSalansPostavwikaException;

	public SalansPostavwika updateImpl(SalansPostavwika salansPostavwika);

	/**
	* Returns the salans postavwika with the primary key or throws a {@link NoSuchSalansPostavwikaException} if it could not be found.
	*
	* @param balans_postavwika_id the primary key of the salans postavwika
	* @return the salans postavwika
	* @throws NoSuchSalansPostavwikaException if a salans postavwika with the primary key could not be found
	*/
	public SalansPostavwika findByPrimaryKey(long balans_postavwika_id)
		throws NoSuchSalansPostavwikaException;

	/**
	* Returns the salans postavwika with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param balans_postavwika_id the primary key of the salans postavwika
	* @return the salans postavwika, or <code>null</code> if a salans postavwika with the primary key could not be found
	*/
	public SalansPostavwika fetchByPrimaryKey(long balans_postavwika_id);

	@Override
	public java.util.Map<java.io.Serializable, SalansPostavwika> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the salans postavwikas.
	*
	* @return the salans postavwikas
	*/
	public java.util.List<SalansPostavwika> findAll();

	/**
	* Returns a range of all the salans postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of salans postavwikas
	* @param end the upper bound of the range of salans postavwikas (not inclusive)
	* @return the range of salans postavwikas
	*/
	public java.util.List<SalansPostavwika> findAll(int start, int end);

	/**
	* Returns an ordered range of all the salans postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of salans postavwikas
	* @param end the upper bound of the range of salans postavwikas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of salans postavwikas
	*/
	public java.util.List<SalansPostavwika> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SalansPostavwika> orderByComparator);

	/**
	* Returns an ordered range of all the salans postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of salans postavwikas
	* @param end the upper bound of the range of salans postavwikas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of salans postavwikas
	*/
	public java.util.List<SalansPostavwika> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SalansPostavwika> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the salans postavwikas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of salans postavwikas.
	*
	* @return the number of salans postavwikas
	*/
	public int countAll();
}