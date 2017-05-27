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

package tj.dokumenty.postavwika.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.dokumenty.postavwika.exception.NoSuchDokumentyPostavwikaException;
import tj.dokumenty.postavwika.model.DokumentyPostavwika;

/**
 * The persistence interface for the dokumenty postavwika service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.dokumenty.postavwika.service.persistence.impl.DokumentyPostavwikaPersistenceImpl
 * @see DokumentyPostavwikaUtil
 * @generated
 */
@ProviderType
public interface DokumentyPostavwikaPersistence extends BasePersistence<DokumentyPostavwika> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DokumentyPostavwikaUtil} to access the dokumenty postavwika persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the dokumenty postavwika where postavwik_id = &#63; or throws a {@link NoSuchDokumentyPostavwikaException} if it could not be found.
	*
	* @param postavwik_id the postavwik_id
	* @return the matching dokumenty postavwika
	* @throws NoSuchDokumentyPostavwikaException if a matching dokumenty postavwika could not be found
	*/
	public DokumentyPostavwika findByPostavwik_id(long postavwik_id)
		throws NoSuchDokumentyPostavwikaException;

	/**
	* Returns the dokumenty postavwika where postavwik_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param postavwik_id the postavwik_id
	* @return the matching dokumenty postavwika, or <code>null</code> if a matching dokumenty postavwika could not be found
	*/
	public DokumentyPostavwika fetchByPostavwik_id(long postavwik_id);

	/**
	* Returns the dokumenty postavwika where postavwik_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param postavwik_id the postavwik_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dokumenty postavwika, or <code>null</code> if a matching dokumenty postavwika could not be found
	*/
	public DokumentyPostavwika fetchByPostavwik_id(long postavwik_id,
		boolean retrieveFromCache);

	/**
	* Removes the dokumenty postavwika where postavwik_id = &#63; from the database.
	*
	* @param postavwik_id the postavwik_id
	* @return the dokumenty postavwika that was removed
	*/
	public DokumentyPostavwika removeByPostavwik_id(long postavwik_id)
		throws NoSuchDokumentyPostavwikaException;

	/**
	* Returns the number of dokumenty postavwikas where postavwik_id = &#63;.
	*
	* @param postavwik_id the postavwik_id
	* @return the number of matching dokumenty postavwikas
	*/
	public int countByPostavwik_id(long postavwik_id);

	/**
	* Caches the dokumenty postavwika in the entity cache if it is enabled.
	*
	* @param dokumentyPostavwika the dokumenty postavwika
	*/
	public void cacheResult(DokumentyPostavwika dokumentyPostavwika);

	/**
	* Caches the dokumenty postavwikas in the entity cache if it is enabled.
	*
	* @param dokumentyPostavwikas the dokumenty postavwikas
	*/
	public void cacheResult(
		java.util.List<DokumentyPostavwika> dokumentyPostavwikas);

	/**
	* Creates a new dokumenty postavwika with the primary key. Does not add the dokumenty postavwika to the database.
	*
	* @param dokumenty_postavwika_id the primary key for the new dokumenty postavwika
	* @return the new dokumenty postavwika
	*/
	public DokumentyPostavwika create(long dokumenty_postavwika_id);

	/**
	* Removes the dokumenty postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dokumenty_postavwika_id the primary key of the dokumenty postavwika
	* @return the dokumenty postavwika that was removed
	* @throws NoSuchDokumentyPostavwikaException if a dokumenty postavwika with the primary key could not be found
	*/
	public DokumentyPostavwika remove(long dokumenty_postavwika_id)
		throws NoSuchDokumentyPostavwikaException;

	public DokumentyPostavwika updateImpl(
		DokumentyPostavwika dokumentyPostavwika);

	/**
	* Returns the dokumenty postavwika with the primary key or throws a {@link NoSuchDokumentyPostavwikaException} if it could not be found.
	*
	* @param dokumenty_postavwika_id the primary key of the dokumenty postavwika
	* @return the dokumenty postavwika
	* @throws NoSuchDokumentyPostavwikaException if a dokumenty postavwika with the primary key could not be found
	*/
	public DokumentyPostavwika findByPrimaryKey(long dokumenty_postavwika_id)
		throws NoSuchDokumentyPostavwikaException;

	/**
	* Returns the dokumenty postavwika with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dokumenty_postavwika_id the primary key of the dokumenty postavwika
	* @return the dokumenty postavwika, or <code>null</code> if a dokumenty postavwika with the primary key could not be found
	*/
	public DokumentyPostavwika fetchByPrimaryKey(long dokumenty_postavwika_id);

	@Override
	public java.util.Map<java.io.Serializable, DokumentyPostavwika> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the dokumenty postavwikas.
	*
	* @return the dokumenty postavwikas
	*/
	public java.util.List<DokumentyPostavwika> findAll();

	/**
	* Returns a range of all the dokumenty postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DokumentyPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dokumenty postavwikas
	* @param end the upper bound of the range of dokumenty postavwikas (not inclusive)
	* @return the range of dokumenty postavwikas
	*/
	public java.util.List<DokumentyPostavwika> findAll(int start, int end);

	/**
	* Returns an ordered range of all the dokumenty postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DokumentyPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dokumenty postavwikas
	* @param end the upper bound of the range of dokumenty postavwikas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dokumenty postavwikas
	*/
	public java.util.List<DokumentyPostavwika> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DokumentyPostavwika> orderByComparator);

	/**
	* Returns an ordered range of all the dokumenty postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DokumentyPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dokumenty postavwikas
	* @param end the upper bound of the range of dokumenty postavwikas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of dokumenty postavwikas
	*/
	public java.util.List<DokumentyPostavwika> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DokumentyPostavwika> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the dokumenty postavwikas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of dokumenty postavwikas.
	*
	* @return the number of dokumenty postavwikas
	*/
	public int countAll();
}