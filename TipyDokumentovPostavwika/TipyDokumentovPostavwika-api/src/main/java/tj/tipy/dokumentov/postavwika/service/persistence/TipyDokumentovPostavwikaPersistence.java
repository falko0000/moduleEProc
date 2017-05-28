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

package tj.tipy.dokumentov.postavwika.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.tipy.dokumentov.postavwika.exception.NoSuchTipyDokumentovPostavwikaException;
import tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika;

/**
 * The persistence interface for the tipy dokumentov postavwika service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.tipy.dokumentov.postavwika.service.persistence.impl.TipyDokumentovPostavwikaPersistenceImpl
 * @see TipyDokumentovPostavwikaUtil
 * @generated
 */
@ProviderType
public interface TipyDokumentovPostavwikaPersistence extends BasePersistence<TipyDokumentovPostavwika> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TipyDokumentovPostavwikaUtil} to access the tipy dokumentov postavwika persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the tipy dokumentov postavwika where tipy_dokumentov_postavwika_id = &#63; or throws a {@link NoSuchTipyDokumentovPostavwikaException} if it could not be found.
	*
	* @param tipy_dokumentov_postavwika_id the tipy_dokumentov_postavwika_id
	* @return the matching tipy dokumentov postavwika
	* @throws NoSuchTipyDokumentovPostavwikaException if a matching tipy dokumentov postavwika could not be found
	*/
	public TipyDokumentovPostavwika findBytipy_dokumentov_postavwika_id(
		int tipy_dokumentov_postavwika_id)
		throws NoSuchTipyDokumentovPostavwikaException;

	/**
	* Returns the tipy dokumentov postavwika where tipy_dokumentov_postavwika_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param tipy_dokumentov_postavwika_id the tipy_dokumentov_postavwika_id
	* @return the matching tipy dokumentov postavwika, or <code>null</code> if a matching tipy dokumentov postavwika could not be found
	*/
	public TipyDokumentovPostavwika fetchBytipy_dokumentov_postavwika_id(
		int tipy_dokumentov_postavwika_id);

	/**
	* Returns the tipy dokumentov postavwika where tipy_dokumentov_postavwika_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param tipy_dokumentov_postavwika_id the tipy_dokumentov_postavwika_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching tipy dokumentov postavwika, or <code>null</code> if a matching tipy dokumentov postavwika could not be found
	*/
	public TipyDokumentovPostavwika fetchBytipy_dokumentov_postavwika_id(
		int tipy_dokumentov_postavwika_id, boolean retrieveFromCache);

	/**
	* Removes the tipy dokumentov postavwika where tipy_dokumentov_postavwika_id = &#63; from the database.
	*
	* @param tipy_dokumentov_postavwika_id the tipy_dokumentov_postavwika_id
	* @return the tipy dokumentov postavwika that was removed
	*/
	public TipyDokumentovPostavwika removeBytipy_dokumentov_postavwika_id(
		int tipy_dokumentov_postavwika_id)
		throws NoSuchTipyDokumentovPostavwikaException;

	/**
	* Returns the number of tipy dokumentov postavwikas where tipy_dokumentov_postavwika_id = &#63;.
	*
	* @param tipy_dokumentov_postavwika_id the tipy_dokumentov_postavwika_id
	* @return the number of matching tipy dokumentov postavwikas
	*/
	public int countBytipy_dokumentov_postavwika_id(
		int tipy_dokumentov_postavwika_id);

	/**
	* Caches the tipy dokumentov postavwika in the entity cache if it is enabled.
	*
	* @param tipyDokumentovPostavwika the tipy dokumentov postavwika
	*/
	public void cacheResult(TipyDokumentovPostavwika tipyDokumentovPostavwika);

	/**
	* Caches the tipy dokumentov postavwikas in the entity cache if it is enabled.
	*
	* @param tipyDokumentovPostavwikas the tipy dokumentov postavwikas
	*/
	public void cacheResult(
		java.util.List<TipyDokumentovPostavwika> tipyDokumentovPostavwikas);

	/**
	* Creates a new tipy dokumentov postavwika with the primary key. Does not add the tipy dokumentov postavwika to the database.
	*
	* @param tipy_dokumentov_postavwika_id the primary key for the new tipy dokumentov postavwika
	* @return the new tipy dokumentov postavwika
	*/
	public TipyDokumentovPostavwika create(int tipy_dokumentov_postavwika_id);

	/**
	* Removes the tipy dokumentov postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tipy_dokumentov_postavwika_id the primary key of the tipy dokumentov postavwika
	* @return the tipy dokumentov postavwika that was removed
	* @throws NoSuchTipyDokumentovPostavwikaException if a tipy dokumentov postavwika with the primary key could not be found
	*/
	public TipyDokumentovPostavwika remove(int tipy_dokumentov_postavwika_id)
		throws NoSuchTipyDokumentovPostavwikaException;

	public TipyDokumentovPostavwika updateImpl(
		TipyDokumentovPostavwika tipyDokumentovPostavwika);

	/**
	* Returns the tipy dokumentov postavwika with the primary key or throws a {@link NoSuchTipyDokumentovPostavwikaException} if it could not be found.
	*
	* @param tipy_dokumentov_postavwika_id the primary key of the tipy dokumentov postavwika
	* @return the tipy dokumentov postavwika
	* @throws NoSuchTipyDokumentovPostavwikaException if a tipy dokumentov postavwika with the primary key could not be found
	*/
	public TipyDokumentovPostavwika findByPrimaryKey(
		int tipy_dokumentov_postavwika_id)
		throws NoSuchTipyDokumentovPostavwikaException;

	/**
	* Returns the tipy dokumentov postavwika with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tipy_dokumentov_postavwika_id the primary key of the tipy dokumentov postavwika
	* @return the tipy dokumentov postavwika, or <code>null</code> if a tipy dokumentov postavwika with the primary key could not be found
	*/
	public TipyDokumentovPostavwika fetchByPrimaryKey(
		int tipy_dokumentov_postavwika_id);

	@Override
	public java.util.Map<java.io.Serializable, TipyDokumentovPostavwika> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the tipy dokumentov postavwikas.
	*
	* @return the tipy dokumentov postavwikas
	*/
	public java.util.List<TipyDokumentovPostavwika> findAll();

	/**
	* Returns a range of all the tipy dokumentov postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipyDokumentovPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy dokumentov postavwikas
	* @param end the upper bound of the range of tipy dokumentov postavwikas (not inclusive)
	* @return the range of tipy dokumentov postavwikas
	*/
	public java.util.List<TipyDokumentovPostavwika> findAll(int start, int end);

	/**
	* Returns an ordered range of all the tipy dokumentov postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipyDokumentovPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy dokumentov postavwikas
	* @param end the upper bound of the range of tipy dokumentov postavwikas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tipy dokumentov postavwikas
	*/
	public java.util.List<TipyDokumentovPostavwika> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TipyDokumentovPostavwika> orderByComparator);

	/**
	* Returns an ordered range of all the tipy dokumentov postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipyDokumentovPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy dokumentov postavwikas
	* @param end the upper bound of the range of tipy dokumentov postavwikas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of tipy dokumentov postavwikas
	*/
	public java.util.List<TipyDokumentovPostavwika> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TipyDokumentovPostavwika> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the tipy dokumentov postavwikas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of tipy dokumentov postavwikas.
	*
	* @return the number of tipy dokumentov postavwikas
	*/
	public int countAll();
}