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

package tj.prochaja.informacija.dlja.zajavki.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProchajaInformacijaDljaZajavkiLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProchajaInformacijaDljaZajavkiLocalService
 * @generated
 */
@ProviderType
public class ProchajaInformacijaDljaZajavkiLocalServiceWrapper
	implements ProchajaInformacijaDljaZajavkiLocalService,
		ServiceWrapper<ProchajaInformacijaDljaZajavkiLocalService> {
	public ProchajaInformacijaDljaZajavkiLocalServiceWrapper(
		ProchajaInformacijaDljaZajavkiLocalService prochajaInformacijaDljaZajavkiLocalService) {
		_prochajaInformacijaDljaZajavkiLocalService = prochajaInformacijaDljaZajavkiLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _prochajaInformacijaDljaZajavkiLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _prochajaInformacijaDljaZajavkiLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _prochajaInformacijaDljaZajavkiLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _prochajaInformacijaDljaZajavkiLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _prochajaInformacijaDljaZajavkiLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of prochaja informacija dlja zajavkis.
	*
	* @return the number of prochaja informacija dlja zajavkis
	*/
	@Override
	public int getProchajaInformacijaDljaZajavkisCount() {
		return _prochajaInformacijaDljaZajavkiLocalService.getProchajaInformacijaDljaZajavkisCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _prochajaInformacijaDljaZajavkiLocalService.getOSGiServiceIdentifier();
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
		return _prochajaInformacijaDljaZajavkiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.prochaja.informacija.dlja.zajavki.model.impl.ProchajaInformacijaDljaZajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _prochajaInformacijaDljaZajavkiLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.prochaja.informacija.dlja.zajavki.model.impl.ProchajaInformacijaDljaZajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _prochajaInformacijaDljaZajavkiLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the prochaja informacija dlja zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.prochaja.informacija.dlja.zajavki.model.impl.ProchajaInformacijaDljaZajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prochaja informacija dlja zajavkis
	* @param end the upper bound of the range of prochaja informacija dlja zajavkis (not inclusive)
	* @return the range of prochaja informacija dlja zajavkis
	*/
	@Override
	public java.util.List<tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki> getProchajaInformacijaDljaZajavkis(
		int start, int end) {
		return _prochajaInformacijaDljaZajavkiLocalService.getProchajaInformacijaDljaZajavkis(start,
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
		return _prochajaInformacijaDljaZajavkiLocalService.dynamicQueryCount(dynamicQuery);
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
		return _prochajaInformacijaDljaZajavkiLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the prochaja informacija dlja zajavki to the database. Also notifies the appropriate model listeners.
	*
	* @param prochajaInformacijaDljaZajavki the prochaja informacija dlja zajavki
	* @return the prochaja informacija dlja zajavki that was added
	*/
	@Override
	public tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki addProchajaInformacijaDljaZajavki(
		tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki) {
		return _prochajaInformacijaDljaZajavkiLocalService.addProchajaInformacijaDljaZajavki(prochajaInformacijaDljaZajavki);
	}

	/**
	* Creates a new prochaja informacija dlja zajavki with the primary key. Does not add the prochaja informacija dlja zajavki to the database.
	*
	* @param prochaja_informacija_dlja_zajavki_id the primary key for the new prochaja informacija dlja zajavki
	* @return the new prochaja informacija dlja zajavki
	*/
	@Override
	public tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki createProchajaInformacijaDljaZajavki(
		long prochaja_informacija_dlja_zajavki_id) {
		return _prochajaInformacijaDljaZajavkiLocalService.createProchajaInformacijaDljaZajavki(prochaja_informacija_dlja_zajavki_id);
	}

	/**
	* Deletes the prochaja informacija dlja zajavki with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param prochaja_informacija_dlja_zajavki_id the primary key of the prochaja informacija dlja zajavki
	* @return the prochaja informacija dlja zajavki that was removed
	* @throws PortalException if a prochaja informacija dlja zajavki with the primary key could not be found
	*/
	@Override
	public tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki deleteProchajaInformacijaDljaZajavki(
		long prochaja_informacija_dlja_zajavki_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _prochajaInformacijaDljaZajavkiLocalService.deleteProchajaInformacijaDljaZajavki(prochaja_informacija_dlja_zajavki_id);
	}

	/**
	* Deletes the prochaja informacija dlja zajavki from the database. Also notifies the appropriate model listeners.
	*
	* @param prochajaInformacijaDljaZajavki the prochaja informacija dlja zajavki
	* @return the prochaja informacija dlja zajavki that was removed
	*/
	@Override
	public tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki deleteProchajaInformacijaDljaZajavki(
		tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki) {
		return _prochajaInformacijaDljaZajavkiLocalService.deleteProchajaInformacijaDljaZajavki(prochajaInformacijaDljaZajavki);
	}

	@Override
	public tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki fetchProchajaInformacijaDljaZajavki(
		long prochaja_informacija_dlja_zajavki_id) {
		return _prochajaInformacijaDljaZajavkiLocalService.fetchProchajaInformacijaDljaZajavki(prochaja_informacija_dlja_zajavki_id);
	}

	@Override
	public tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki getProchajaInformacijaDljaZajavki(
		long lot_id, long postavwik_id) {
		return _prochajaInformacijaDljaZajavkiLocalService.getProchajaInformacijaDljaZajavki(lot_id,
			postavwik_id);
	}

	/**
	* Returns the prochaja informacija dlja zajavki with the primary key.
	*
	* @param prochaja_informacija_dlja_zajavki_id the primary key of the prochaja informacija dlja zajavki
	* @return the prochaja informacija dlja zajavki
	* @throws PortalException if a prochaja informacija dlja zajavki with the primary key could not be found
	*/
	@Override
	public tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki getProchajaInformacijaDljaZajavki(
		long prochaja_informacija_dlja_zajavki_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _prochajaInformacijaDljaZajavkiLocalService.getProchajaInformacijaDljaZajavki(prochaja_informacija_dlja_zajavki_id);
	}

	/**
	* Updates the prochaja informacija dlja zajavki in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param prochajaInformacijaDljaZajavki the prochaja informacija dlja zajavki
	* @return the prochaja informacija dlja zajavki that was updated
	*/
	@Override
	public tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki updateProchajaInformacijaDljaZajavki(
		tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki) {
		return _prochajaInformacijaDljaZajavkiLocalService.updateProchajaInformacijaDljaZajavki(prochajaInformacijaDljaZajavki);
	}

	@Override
	public ProchajaInformacijaDljaZajavkiLocalService getWrappedService() {
		return _prochajaInformacijaDljaZajavkiLocalService;
	}

	@Override
	public void setWrappedService(
		ProchajaInformacijaDljaZajavkiLocalService prochajaInformacijaDljaZajavkiLocalService) {
		_prochajaInformacijaDljaZajavkiLocalService = prochajaInformacijaDljaZajavkiLocalService;
	}

	private ProchajaInformacijaDljaZajavkiLocalService _prochajaInformacijaDljaZajavkiLocalService;
}