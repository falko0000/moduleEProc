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

package tj.porjadok.raboty.komissii.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PorjadokRabotyKomissiiLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PorjadokRabotyKomissiiLocalService
 * @generated
 */
@ProviderType
public class PorjadokRabotyKomissiiLocalServiceWrapper
	implements PorjadokRabotyKomissiiLocalService,
		ServiceWrapper<PorjadokRabotyKomissiiLocalService> {
	public PorjadokRabotyKomissiiLocalServiceWrapper(
		PorjadokRabotyKomissiiLocalService porjadokRabotyKomissiiLocalService) {
		_porjadokRabotyKomissiiLocalService = porjadokRabotyKomissiiLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _porjadokRabotyKomissiiLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _porjadokRabotyKomissiiLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _porjadokRabotyKomissiiLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _porjadokRabotyKomissiiLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _porjadokRabotyKomissiiLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of porjadok raboty komissiis.
	*
	* @return the number of porjadok raboty komissiis
	*/
	@Override
	public int getPorjadokRabotyKomissiisCount() {
		return _porjadokRabotyKomissiiLocalService.getPorjadokRabotyKomissiisCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _porjadokRabotyKomissiiLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _porjadokRabotyKomissiiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.porjadok.raboty.komissii.model.impl.PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _porjadokRabotyKomissiiLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.porjadok.raboty.komissii.model.impl.PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _porjadokRabotyKomissiiLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the porjadok raboty komissiis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.porjadok.raboty.komissii.model.impl.PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of porjadok raboty komissiis
	* @param end the upper bound of the range of porjadok raboty komissiis (not inclusive)
	* @return the range of porjadok raboty komissiis
	*/
	@Override
	public java.util.List<tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii> getPorjadokRabotyKomissiis(
		int start, int end) {
		return _porjadokRabotyKomissiiLocalService.getPorjadokRabotyKomissiis(start,
			end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _porjadokRabotyKomissiiLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _porjadokRabotyKomissiiLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the porjadok raboty komissii to the database. Also notifies the appropriate model listeners.
	*
	* @param porjadokRabotyKomissii the porjadok raboty komissii
	* @return the porjadok raboty komissii that was added
	*/
	@Override
	public tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii addPorjadokRabotyKomissii(
		tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii porjadokRabotyKomissii) {
		return _porjadokRabotyKomissiiLocalService.addPorjadokRabotyKomissii(porjadokRabotyKomissii);
	}

	/**
	* Creates a new porjadok raboty komissii with the primary key. Does not add the porjadok raboty komissii to the database.
	*
	* @param porjadok_raboty_komissii_id the primary key for the new porjadok raboty komissii
	* @return the new porjadok raboty komissii
	*/
	@Override
	public tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii createPorjadokRabotyKomissii(
		long porjadok_raboty_komissii_id) {
		return _porjadokRabotyKomissiiLocalService.createPorjadokRabotyKomissii(porjadok_raboty_komissii_id);
	}

	/**
	* Deletes the porjadok raboty komissii with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param porjadok_raboty_komissii_id the primary key of the porjadok raboty komissii
	* @return the porjadok raboty komissii that was removed
	* @throws PortalException if a porjadok raboty komissii with the primary key could not be found
	*/
	@Override
	public tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii deletePorjadokRabotyKomissii(
		long porjadok_raboty_komissii_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _porjadokRabotyKomissiiLocalService.deletePorjadokRabotyKomissii(porjadok_raboty_komissii_id);
	}

	/**
	* Deletes the porjadok raboty komissii from the database. Also notifies the appropriate model listeners.
	*
	* @param porjadokRabotyKomissii the porjadok raboty komissii
	* @return the porjadok raboty komissii that was removed
	*/
	@Override
	public tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii deletePorjadokRabotyKomissii(
		tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii porjadokRabotyKomissii) {
		return _porjadokRabotyKomissiiLocalService.deletePorjadokRabotyKomissii(porjadokRabotyKomissii);
	}

	@Override
	public tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii fetchPorjadokRabotyKomissii(
		long porjadok_raboty_komissii_id) {
		return _porjadokRabotyKomissiiLocalService.fetchPorjadokRabotyKomissii(porjadok_raboty_komissii_id);
	}

	@Override
	public tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii getPRKbyIzvewenieId(
		long IzvewenieId) {
		return _porjadokRabotyKomissiiLocalService.getPRKbyIzvewenieId(IzvewenieId);
	}

	/**
	* Returns the porjadok raboty komissii with the primary key.
	*
	* @param porjadok_raboty_komissii_id the primary key of the porjadok raboty komissii
	* @return the porjadok raboty komissii
	* @throws PortalException if a porjadok raboty komissii with the primary key could not be found
	*/
	@Override
	public tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii getPorjadokRabotyKomissii(
		long porjadok_raboty_komissii_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _porjadokRabotyKomissiiLocalService.getPorjadokRabotyKomissii(porjadok_raboty_komissii_id);
	}

	/**
	* Updates the porjadok raboty komissii in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param porjadokRabotyKomissii the porjadok raboty komissii
	* @return the porjadok raboty komissii that was updated
	*/
	@Override
	public tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii updatePorjadokRabotyKomissii(
		tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii porjadokRabotyKomissii) {
		return _porjadokRabotyKomissiiLocalService.updatePorjadokRabotyKomissii(porjadokRabotyKomissii);
	}

	@Override
	public PorjadokRabotyKomissiiLocalService getWrappedService() {
		return _porjadokRabotyKomissiiLocalService;
	}

	@Override
	public void setWrappedService(
		PorjadokRabotyKomissiiLocalService porjadokRabotyKomissiiLocalService) {
		_porjadokRabotyKomissiiLocalService = porjadokRabotyKomissiiLocalService;
	}

	private PorjadokRabotyKomissiiLocalService _porjadokRabotyKomissiiLocalService;
}