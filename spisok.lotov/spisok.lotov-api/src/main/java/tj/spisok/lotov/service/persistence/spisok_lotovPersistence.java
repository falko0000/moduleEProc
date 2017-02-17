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

package tj.spisok.lotov.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.spisok.lotov.exception.NoSuchspisok_lotovException;
import tj.spisok.lotov.model.spisok_lotov;

/**
 * The persistence interface for the spisok_lotov service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.spisok.lotov.service.persistence.impl.spisok_lotovPersistenceImpl
 * @see spisok_lotovUtil
 * @generated
 */
@ProviderType
public interface spisok_lotovPersistence extends BasePersistence<spisok_lotov> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link spisok_lotovUtil} to access the spisok_lotov persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the spisok_lotov in the entity cache if it is enabled.
	*
	* @param spisok_lotov the spisok_lotov
	*/
	public void cacheResult(spisok_lotov spisok_lotov);

	/**
	* Caches the spisok_lotovs in the entity cache if it is enabled.
	*
	* @param spisok_lotovs the spisok_lotovs
	*/
	public void cacheResult(java.util.List<spisok_lotov> spisok_lotovs);

	/**
	* Creates a new spisok_lotov with the primary key. Does not add the spisok_lotov to the database.
	*
	* @param spisok_lotov_id the primary key for the new spisok_lotov
	* @return the new spisok_lotov
	*/
	public spisok_lotov create(long spisok_lotov_id);

	/**
	* Removes the spisok_lotov with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param spisok_lotov_id the primary key of the spisok_lotov
	* @return the spisok_lotov that was removed
	* @throws NoSuchspisok_lotovException if a spisok_lotov with the primary key could not be found
	*/
	public spisok_lotov remove(long spisok_lotov_id)
		throws NoSuchspisok_lotovException;

	public spisok_lotov updateImpl(spisok_lotov spisok_lotov);

	/**
	* Returns the spisok_lotov with the primary key or throws a {@link NoSuchspisok_lotovException} if it could not be found.
	*
	* @param spisok_lotov_id the primary key of the spisok_lotov
	* @return the spisok_lotov
	* @throws NoSuchspisok_lotovException if a spisok_lotov with the primary key could not be found
	*/
	public spisok_lotov findByPrimaryKey(long spisok_lotov_id)
		throws NoSuchspisok_lotovException;

	/**
	* Returns the spisok_lotov with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param spisok_lotov_id the primary key of the spisok_lotov
	* @return the spisok_lotov, or <code>null</code> if a spisok_lotov with the primary key could not be found
	*/
	public spisok_lotov fetchByPrimaryKey(long spisok_lotov_id);

	@Override
	public java.util.Map<java.io.Serializable, spisok_lotov> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the spisok_lotovs.
	*
	* @return the spisok_lotovs
	*/
	public java.util.List<spisok_lotov> findAll();

	/**
	* Returns a range of all the spisok_lotovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link spisok_lotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisok_lotovs
	* @param end the upper bound of the range of spisok_lotovs (not inclusive)
	* @return the range of spisok_lotovs
	*/
	public java.util.List<spisok_lotov> findAll(int start, int end);

	/**
	* Returns an ordered range of all the spisok_lotovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link spisok_lotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisok_lotovs
	* @param end the upper bound of the range of spisok_lotovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of spisok_lotovs
	*/
	public java.util.List<spisok_lotov> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<spisok_lotov> orderByComparator);

	/**
	* Returns an ordered range of all the spisok_lotovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link spisok_lotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisok_lotovs
	* @param end the upper bound of the range of spisok_lotovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of spisok_lotovs
	*/
	public java.util.List<spisok_lotov> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<spisok_lotov> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the spisok_lotovs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of spisok_lotovs.
	*
	* @return the number of spisok_lotovs
	*/
	public int countAll();
}