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

import tj.balans.postavwika.exception.NoSuchBalansPostavwikaException;
import tj.balans.postavwika.model.BalansPostavwika;

/**
 * The persistence interface for the balans postavwika service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.balans.postavwika.service.persistence.impl.BalansPostavwikaPersistenceImpl
 * @see BalansPostavwikaUtil
 * @generated
 */
@ProviderType
public interface BalansPostavwikaPersistence extends BasePersistence<BalansPostavwika> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BalansPostavwikaUtil} to access the balans postavwika persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the balans postavwika where postavwik_id = &#63; or throws a {@link NoSuchBalansPostavwikaException} if it could not be found.
	*
	* @param postavwik_id the postavwik_id
	* @return the matching balans postavwika
	* @throws NoSuchBalansPostavwikaException if a matching balans postavwika could not be found
	*/
	public BalansPostavwika findBypostavwikId(long postavwik_id)
		throws NoSuchBalansPostavwikaException;

	/**
	* Returns the balans postavwika where postavwik_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param postavwik_id the postavwik_id
	* @return the matching balans postavwika, or <code>null</code> if a matching balans postavwika could not be found
	*/
	public BalansPostavwika fetchBypostavwikId(long postavwik_id);

	/**
	* Returns the balans postavwika where postavwik_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param postavwik_id the postavwik_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching balans postavwika, or <code>null</code> if a matching balans postavwika could not be found
	*/
	public BalansPostavwika fetchBypostavwikId(long postavwik_id,
		boolean retrieveFromCache);

	/**
	* Removes the balans postavwika where postavwik_id = &#63; from the database.
	*
	* @param postavwik_id the postavwik_id
	* @return the balans postavwika that was removed
	*/
	public BalansPostavwika removeBypostavwikId(long postavwik_id)
		throws NoSuchBalansPostavwikaException;

	/**
	* Returns the number of balans postavwikas where postavwik_id = &#63;.
	*
	* @param postavwik_id the postavwik_id
	* @return the number of matching balans postavwikas
	*/
	public int countBypostavwikId(long postavwik_id);

	/**
	* Caches the balans postavwika in the entity cache if it is enabled.
	*
	* @param balansPostavwika the balans postavwika
	*/
	public void cacheResult(BalansPostavwika balansPostavwika);

	/**
	* Caches the balans postavwikas in the entity cache if it is enabled.
	*
	* @param balansPostavwikas the balans postavwikas
	*/
	public void cacheResult(java.util.List<BalansPostavwika> balansPostavwikas);

	/**
	* Creates a new balans postavwika with the primary key. Does not add the balans postavwika to the database.
	*
	* @param balans_postavwika_id the primary key for the new balans postavwika
	* @return the new balans postavwika
	*/
	public BalansPostavwika create(long balans_postavwika_id);

	/**
	* Removes the balans postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param balans_postavwika_id the primary key of the balans postavwika
	* @return the balans postavwika that was removed
	* @throws NoSuchBalansPostavwikaException if a balans postavwika with the primary key could not be found
	*/
	public BalansPostavwika remove(long balans_postavwika_id)
		throws NoSuchBalansPostavwikaException;

	public BalansPostavwika updateImpl(BalansPostavwika balansPostavwika);

	/**
	* Returns the balans postavwika with the primary key or throws a {@link NoSuchBalansPostavwikaException} if it could not be found.
	*
	* @param balans_postavwika_id the primary key of the balans postavwika
	* @return the balans postavwika
	* @throws NoSuchBalansPostavwikaException if a balans postavwika with the primary key could not be found
	*/
	public BalansPostavwika findByPrimaryKey(long balans_postavwika_id)
		throws NoSuchBalansPostavwikaException;

	/**
	* Returns the balans postavwika with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param balans_postavwika_id the primary key of the balans postavwika
	* @return the balans postavwika, or <code>null</code> if a balans postavwika with the primary key could not be found
	*/
	public BalansPostavwika fetchByPrimaryKey(long balans_postavwika_id);

	@Override
	public java.util.Map<java.io.Serializable, BalansPostavwika> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the balans postavwikas.
	*
	* @return the balans postavwikas
	*/
	public java.util.List<BalansPostavwika> findAll();

	/**
	* Returns a range of all the balans postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of balans postavwikas
	* @param end the upper bound of the range of balans postavwikas (not inclusive)
	* @return the range of balans postavwikas
	*/
	public java.util.List<BalansPostavwika> findAll(int start, int end);

	/**
	* Returns an ordered range of all the balans postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of balans postavwikas
	* @param end the upper bound of the range of balans postavwikas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of balans postavwikas
	*/
	public java.util.List<BalansPostavwika> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BalansPostavwika> orderByComparator);

	/**
	* Returns an ordered range of all the balans postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of balans postavwikas
	* @param end the upper bound of the range of balans postavwikas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of balans postavwikas
	*/
	public java.util.List<BalansPostavwika> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BalansPostavwika> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the balans postavwikas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of balans postavwikas.
	*
	* @return the number of balans postavwikas
	*/
	public int countAll();
}