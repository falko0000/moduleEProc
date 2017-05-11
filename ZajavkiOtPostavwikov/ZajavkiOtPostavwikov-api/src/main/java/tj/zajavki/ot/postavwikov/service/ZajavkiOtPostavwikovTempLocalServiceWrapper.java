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

package tj.zajavki.ot.postavwikov.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ZajavkiOtPostavwikovTempLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ZajavkiOtPostavwikovTempLocalService
 * @generated
 */
@ProviderType
public class ZajavkiOtPostavwikovTempLocalServiceWrapper
	implements ZajavkiOtPostavwikovTempLocalService,
		ServiceWrapper<ZajavkiOtPostavwikovTempLocalService> {
	public ZajavkiOtPostavwikovTempLocalServiceWrapper(
		ZajavkiOtPostavwikovTempLocalService zajavkiOtPostavwikovTempLocalService) {
		_zajavkiOtPostavwikovTempLocalService = zajavkiOtPostavwikovTempLocalService;
	}

	@Override
	public boolean compareTo(
		tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp otPostavwikovTemp,
		java.lang.String predlozhenie_postavwika,
		java.lang.String opisanie_tovara, long kod_strany_proizvoditelja,
		double summa_za_edinicu_tovara) {
		return _zajavkiOtPostavwikovTempLocalService.compareTo(otPostavwikovTemp,
			predlozhenie_postavwika, opisanie_tovara,
			kod_strany_proizvoditelja, summa_za_edinicu_tovara);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _zajavkiOtPostavwikovTempLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _zajavkiOtPostavwikovTempLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _zajavkiOtPostavwikovTempLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _zajavkiOtPostavwikovTempLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _zajavkiOtPostavwikovTempLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int getCountLotId(long lot_id) {
		return _zajavkiOtPostavwikovTempLocalService.getCountLotId(lot_id);
	}

	@Override
	public int getCountZajavkiOtPostavwikovs(long lot_id, long postavwik_id) {
		return _zajavkiOtPostavwikovTempLocalService.getCountZajavkiOtPostavwikovs(lot_id,
			postavwik_id);
	}

	/**
	* Returns the number of zajavki ot postavwikov temps.
	*
	* @return the number of zajavki ot postavwikov temps
	*/
	@Override
	public int getZajavkiOtPostavwikovTempsCount() {
		return _zajavkiOtPostavwikovTempLocalService.getZajavkiOtPostavwikovTempsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _zajavkiOtPostavwikovTempLocalService.getOSGiServiceIdentifier();
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
		return _zajavkiOtPostavwikovTempLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.zajavki.ot.postavwikov.model.impl.ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _zajavkiOtPostavwikovTempLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.zajavki.ot.postavwikov.model.impl.ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _zajavkiOtPostavwikovTempLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the zajavki ot postavwikov temps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.zajavki.ot.postavwikov.model.impl.ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of zajavki ot postavwikov temps
	* @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	* @return the range of zajavki ot postavwikov temps
	*/
	@Override
	public java.util.List<tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp> getZajavkiOtPostavwikovTemps(
		int start, int end) {
		return _zajavkiOtPostavwikovTempLocalService.getZajavkiOtPostavwikovTemps(start,
			end);
	}

	@Override
	public java.util.List<tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp> getZajavkiOtPostavwikovs(
		long lot_id, long postavwik_id) {
		return _zajavkiOtPostavwikovTempLocalService.getZajavkiOtPostavwikovs(lot_id,
			postavwik_id);
	}

	@Override
	public java.util.List<tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp> getZajavkiOtPostavwikovs(
		long tovar_id) {
		return _zajavkiOtPostavwikovTempLocalService.getZajavkiOtPostavwikovs(tovar_id);
	}

	@Override
	public java.util.Map<java.lang.Long, tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp> getMapZajavkiOtPostavwikovs(
		long lot_id, long postavwik_id) {
		return _zajavkiOtPostavwikovTempLocalService.getMapZajavkiOtPostavwikovs(lot_id,
			postavwik_id);
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
		return _zajavkiOtPostavwikovTempLocalService.dynamicQueryCount(dynamicQuery);
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
		return _zajavkiOtPostavwikovTempLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the zajavki ot postavwikov temp to the database. Also notifies the appropriate model listeners.
	*
	* @param zajavkiOtPostavwikovTemp the zajavki ot postavwikov temp
	* @return the zajavki ot postavwikov temp that was added
	*/
	@Override
	public tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp addZajavkiOtPostavwikovTemp(
		tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp) {
		return _zajavkiOtPostavwikovTempLocalService.addZajavkiOtPostavwikovTemp(zajavkiOtPostavwikovTemp);
	}

	/**
	* Creates a new zajavki ot postavwikov temp with the primary key. Does not add the zajavki ot postavwikov temp to the database.
	*
	* @param zajavki_ot_postavwikov_temp_id the primary key for the new zajavki ot postavwikov temp
	* @return the new zajavki ot postavwikov temp
	*/
	@Override
	public tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp createZajavkiOtPostavwikovTemp(
		long zajavki_ot_postavwikov_temp_id) {
		return _zajavkiOtPostavwikovTempLocalService.createZajavkiOtPostavwikovTemp(zajavki_ot_postavwikov_temp_id);
	}

	/**
	* Deletes the zajavki ot postavwikov temp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param zajavki_ot_postavwikov_temp_id the primary key of the zajavki ot postavwikov temp
	* @return the zajavki ot postavwikov temp that was removed
	* @throws PortalException if a zajavki ot postavwikov temp with the primary key could not be found
	*/
	@Override
	public tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp deleteZajavkiOtPostavwikovTemp(
		long zajavki_ot_postavwikov_temp_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _zajavkiOtPostavwikovTempLocalService.deleteZajavkiOtPostavwikovTemp(zajavki_ot_postavwikov_temp_id);
	}

	/**
	* Deletes the zajavki ot postavwikov temp from the database. Also notifies the appropriate model listeners.
	*
	* @param zajavkiOtPostavwikovTemp the zajavki ot postavwikov temp
	* @return the zajavki ot postavwikov temp that was removed
	*/
	@Override
	public tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp deleteZajavkiOtPostavwikovTemp(
		tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp) {
		return _zajavkiOtPostavwikovTempLocalService.deleteZajavkiOtPostavwikovTemp(zajavkiOtPostavwikovTemp);
	}

	@Override
	public tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp fetchZajavkiOtPostavwikovTemp(
		long zajavki_ot_postavwikov_temp_id) {
		return _zajavkiOtPostavwikovTempLocalService.fetchZajavkiOtPostavwikovTemp(zajavki_ot_postavwikov_temp_id);
	}

	/**
	* Returns the zajavki ot postavwikov temp with the primary key.
	*
	* @param zajavki_ot_postavwikov_temp_id the primary key of the zajavki ot postavwikov temp
	* @return the zajavki ot postavwikov temp
	* @throws PortalException if a zajavki ot postavwikov temp with the primary key could not be found
	*/
	@Override
	public tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp getZajavkiOtPostavwikovTemp(
		long zajavki_ot_postavwikov_temp_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _zajavkiOtPostavwikovTempLocalService.getZajavkiOtPostavwikovTemp(zajavki_ot_postavwikov_temp_id);
	}

	/**
	* Updates the zajavki ot postavwikov temp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param zajavkiOtPostavwikovTemp the zajavki ot postavwikov temp
	* @return the zajavki ot postavwikov temp that was updated
	*/
	@Override
	public tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp updateZajavkiOtPostavwikovTemp(
		tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp) {
		return _zajavkiOtPostavwikovTempLocalService.updateZajavkiOtPostavwikovTemp(zajavkiOtPostavwikovTemp);
	}

	@Override
	public ZajavkiOtPostavwikovTempLocalService getWrappedService() {
		return _zajavkiOtPostavwikovTempLocalService;
	}

	@Override
	public void setWrappedService(
		ZajavkiOtPostavwikovTempLocalService zajavkiOtPostavwikovTempLocalService) {
		_zajavkiOtPostavwikovTempLocalService = zajavkiOtPostavwikovTempLocalService;
	}

	private ZajavkiOtPostavwikovTempLocalService _zajavkiOtPostavwikovTempLocalService;
}