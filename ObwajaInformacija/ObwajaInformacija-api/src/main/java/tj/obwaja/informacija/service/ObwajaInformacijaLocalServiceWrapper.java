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

package tj.obwaja.informacija.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ObwajaInformacijaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ObwajaInformacijaLocalService
 * @generated
 */
@ProviderType
public class ObwajaInformacijaLocalServiceWrapper
	implements ObwajaInformacijaLocalService,
		ServiceWrapper<ObwajaInformacijaLocalService> {
	public ObwajaInformacijaLocalServiceWrapper(
		ObwajaInformacijaLocalService obwajaInformacijaLocalService) {
		_obwajaInformacijaLocalService = obwajaInformacijaLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _obwajaInformacijaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _obwajaInformacijaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _obwajaInformacijaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _obwajaInformacijaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _obwajaInformacijaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of obwaja informacijas.
	*
	* @return the number of obwaja informacijas
	*/
	@Override
	public int getObwajaInformacijasCount() {
		return _obwajaInformacijaLocalService.getObwajaInformacijasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _obwajaInformacijaLocalService.getOSGiServiceIdentifier();
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
		return _obwajaInformacijaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.obwaja.informacija.model.impl.ObwajaInformacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _obwajaInformacijaLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.obwaja.informacija.model.impl.ObwajaInformacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _obwajaInformacijaLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the obwaja informacijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.obwaja.informacija.model.impl.ObwajaInformacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of obwaja informacijas
	* @param end the upper bound of the range of obwaja informacijas (not inclusive)
	* @return the range of obwaja informacijas
	*/
	@Override
	public java.util.List<tj.obwaja.informacija.model.ObwajaInformacija> getObwajaInformacijas(
		int start, int end) {
		return _obwajaInformacijaLocalService.getObwajaInformacijas(start, end);
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
		return _obwajaInformacijaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _obwajaInformacijaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the obwaja informacija to the database. Also notifies the appropriate model listeners.
	*
	* @param obwajaInformacija the obwaja informacija
	* @return the obwaja informacija that was added
	*/
	@Override
	public tj.obwaja.informacija.model.ObwajaInformacija addObwajaInformacija(
		tj.obwaja.informacija.model.ObwajaInformacija obwajaInformacija) {
		return _obwajaInformacijaLocalService.addObwajaInformacija(obwajaInformacija);
	}

	/**
	* Creates a new obwaja informacija with the primary key. Does not add the obwaja informacija to the database.
	*
	* @param obwaja_informacija_id the primary key for the new obwaja informacija
	* @return the new obwaja informacija
	*/
	@Override
	public tj.obwaja.informacija.model.ObwajaInformacija createObwajaInformacija(
		long obwaja_informacija_id) {
		return _obwajaInformacijaLocalService.createObwajaInformacija(obwaja_informacija_id);
	}

	/**
	* Deletes the obwaja informacija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param obwaja_informacija_id the primary key of the obwaja informacija
	* @return the obwaja informacija that was removed
	* @throws PortalException if a obwaja informacija with the primary key could not be found
	*/
	@Override
	public tj.obwaja.informacija.model.ObwajaInformacija deleteObwajaInformacija(
		long obwaja_informacija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _obwajaInformacijaLocalService.deleteObwajaInformacija(obwaja_informacija_id);
	}

	/**
	* Deletes the obwaja informacija from the database. Also notifies the appropriate model listeners.
	*
	* @param obwajaInformacija the obwaja informacija
	* @return the obwaja informacija that was removed
	*/
	@Override
	public tj.obwaja.informacija.model.ObwajaInformacija deleteObwajaInformacija(
		tj.obwaja.informacija.model.ObwajaInformacija obwajaInformacija) {
		return _obwajaInformacijaLocalService.deleteObwajaInformacija(obwajaInformacija);
	}

	@Override
	public tj.obwaja.informacija.model.ObwajaInformacija fetchObwajaInformacija(
		long obwaja_informacija_id) {
		return _obwajaInformacijaLocalService.fetchObwajaInformacija(obwaja_informacija_id);
	}

	@Override
	public tj.obwaja.informacija.model.ObwajaInformacija getObInfoByIzvewenieId(
		long IzvewenijaID, long userId) {
		return _obwajaInformacijaLocalService.getObInfoByIzvewenieId(IzvewenijaID,
			userId);
	}

	@Override
	public tj.obwaja.informacija.model.ObwajaInformacija getObInfoByIzvewenieId(
		long izvewenie_id)
		throws tj.obwaja.informacija.exception.NoSuchObwajaInformacijaException {
		return _obwajaInformacijaLocalService.getObInfoByIzvewenieId(izvewenie_id);
	}

	/**
	* Returns the obwaja informacija with the primary key.
	*
	* @param obwaja_informacija_id the primary key of the obwaja informacija
	* @return the obwaja informacija
	* @throws PortalException if a obwaja informacija with the primary key could not be found
	*/
	@Override
	public tj.obwaja.informacija.model.ObwajaInformacija getObwajaInformacija(
		long obwaja_informacija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _obwajaInformacijaLocalService.getObwajaInformacija(obwaja_informacija_id);
	}

	/**
	* Updates the obwaja informacija in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param obwajaInformacija the obwaja informacija
	* @return the obwaja informacija that was updated
	*/
	@Override
	public tj.obwaja.informacija.model.ObwajaInformacija updateObwajaInformacija(
		tj.obwaja.informacija.model.ObwajaInformacija obwajaInformacija) {
		return _obwajaInformacijaLocalService.updateObwajaInformacija(obwajaInformacija);
	}

	@Override
	public ObwajaInformacijaLocalService getWrappedService() {
		return _obwajaInformacijaLocalService;
	}

	@Override
	public void setWrappedService(
		ObwajaInformacijaLocalService obwajaInformacijaLocalService) {
		_obwajaInformacijaLocalService = obwajaInformacijaLocalService;
	}

	private ObwajaInformacijaLocalService _obwajaInformacijaLocalService;
}