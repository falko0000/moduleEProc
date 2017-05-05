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

package tj.tariff.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.tariff.exception.NoSuchTariffException;

import tj.tariff.model.Tariff;

/**
 * The persistence interface for the tariff service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.tariff.service.persistence.impl.TariffPersistenceImpl
 * @see TariffUtil
 * @generated
 */
@ProviderType
public interface TariffPersistence extends BasePersistence<Tariff> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TariffUtil} to access the tariff persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the tariff where region_id = &#63; and type_tariff = &#63; or throws a {@link NoSuchTariffException} if it could not be found.
	*
	* @param region_id the region_id
	* @param type_tariff the type_tariff
	* @return the matching tariff
	* @throws NoSuchTariffException if a matching tariff could not be found
	*/
	public Tariff findByregionIdTypeTariff(long region_id, int type_tariff)
		throws NoSuchTariffException;

	/**
	* Returns the tariff where region_id = &#63; and type_tariff = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param region_id the region_id
	* @param type_tariff the type_tariff
	* @return the matching tariff, or <code>null</code> if a matching tariff could not be found
	*/
	public Tariff fetchByregionIdTypeTariff(long region_id, int type_tariff);

	/**
	* Returns the tariff where region_id = &#63; and type_tariff = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param region_id the region_id
	* @param type_tariff the type_tariff
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching tariff, or <code>null</code> if a matching tariff could not be found
	*/
	public Tariff fetchByregionIdTypeTariff(long region_id, int type_tariff,
		boolean retrieveFromCache);

	/**
	* Removes the tariff where region_id = &#63; and type_tariff = &#63; from the database.
	*
	* @param region_id the region_id
	* @param type_tariff the type_tariff
	* @return the tariff that was removed
	*/
	public Tariff removeByregionIdTypeTariff(long region_id, int type_tariff)
		throws NoSuchTariffException;

	/**
	* Returns the number of tariffs where region_id = &#63; and type_tariff = &#63;.
	*
	* @param region_id the region_id
	* @param type_tariff the type_tariff
	* @return the number of matching tariffs
	*/
	public int countByregionIdTypeTariff(long region_id, int type_tariff);

	/**
	* Caches the tariff in the entity cache if it is enabled.
	*
	* @param tariff the tariff
	*/
	public void cacheResult(Tariff tariff);

	/**
	* Caches the tariffs in the entity cache if it is enabled.
	*
	* @param tariffs the tariffs
	*/
	public void cacheResult(java.util.List<Tariff> tariffs);

	/**
	* Creates a new tariff with the primary key. Does not add the tariff to the database.
	*
	* @param tariff_id the primary key for the new tariff
	* @return the new tariff
	*/
	public Tariff create(long tariff_id);

	/**
	* Removes the tariff with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tariff_id the primary key of the tariff
	* @return the tariff that was removed
	* @throws NoSuchTariffException if a tariff with the primary key could not be found
	*/
	public Tariff remove(long tariff_id) throws NoSuchTariffException;

	public Tariff updateImpl(Tariff tariff);

	/**
	* Returns the tariff with the primary key or throws a {@link NoSuchTariffException} if it could not be found.
	*
	* @param tariff_id the primary key of the tariff
	* @return the tariff
	* @throws NoSuchTariffException if a tariff with the primary key could not be found
	*/
	public Tariff findByPrimaryKey(long tariff_id) throws NoSuchTariffException;

	/**
	* Returns the tariff with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tariff_id the primary key of the tariff
	* @return the tariff, or <code>null</code> if a tariff with the primary key could not be found
	*/
	public Tariff fetchByPrimaryKey(long tariff_id);

	@Override
	public java.util.Map<java.io.Serializable, Tariff> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the tariffs.
	*
	* @return the tariffs
	*/
	public java.util.List<Tariff> findAll();

	/**
	* Returns a range of all the tariffs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TariffModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tariffs
	* @param end the upper bound of the range of tariffs (not inclusive)
	* @return the range of tariffs
	*/
	public java.util.List<Tariff> findAll(int start, int end);

	/**
	* Returns an ordered range of all the tariffs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TariffModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tariffs
	* @param end the upper bound of the range of tariffs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tariffs
	*/
	public java.util.List<Tariff> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tariff> orderByComparator);

	/**
	* Returns an ordered range of all the tariffs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TariffModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tariffs
	* @param end the upper bound of the range of tariffs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of tariffs
	*/
	public java.util.List<Tariff> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tariff> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the tariffs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of tariffs.
	*
	* @return the number of tariffs
	*/
	public int countAll();
}