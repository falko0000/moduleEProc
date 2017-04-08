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

package tj.istochnik.finansirovanija.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link IstochnikFinansirovanijaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see IstochnikFinansirovanijaLocalService
 * @generated
 */
@ProviderType
public class IstochnikFinansirovanijaLocalServiceWrapper
	implements IstochnikFinansirovanijaLocalService,
		ServiceWrapper<IstochnikFinansirovanijaLocalService> {
	public IstochnikFinansirovanijaLocalServiceWrapper(
		IstochnikFinansirovanijaLocalService istochnikFinansirovanijaLocalService) {
		_istochnikFinansirovanijaLocalService = istochnikFinansirovanijaLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _istochnikFinansirovanijaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _istochnikFinansirovanijaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _istochnikFinansirovanijaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _istochnikFinansirovanijaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _istochnikFinansirovanijaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of istochnik finansirovanijas.
	*
	* @return the number of istochnik finansirovanijas
	*/
	@Override
	public int getIstochnikFinansirovanijasCount() {
		return _istochnikFinansirovanijaLocalService.getIstochnikFinansirovanijasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _istochnikFinansirovanijaLocalService.getOSGiServiceIdentifier();
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
		return _istochnikFinansirovanijaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.istochnik.finansirovanija.model.impl.IstochnikFinansirovanijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _istochnikFinansirovanijaLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.istochnik.finansirovanija.model.impl.IstochnikFinansirovanijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _istochnikFinansirovanijaLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the istochnik finansirovanijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.istochnik.finansirovanija.model.impl.IstochnikFinansirovanijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istochnik finansirovanijas
	* @param end the upper bound of the range of istochnik finansirovanijas (not inclusive)
	* @return the range of istochnik finansirovanijas
	*/
	@Override
	public java.util.List<tj.istochnik.finansirovanija.model.IstochnikFinansirovanija> getIstochnikFinansirovanijas(
		int start, int end) {
		return _istochnikFinansirovanijaLocalService.getIstochnikFinansirovanijas(start,
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
		return _istochnikFinansirovanijaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _istochnikFinansirovanijaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the istochnik finansirovanija to the database. Also notifies the appropriate model listeners.
	*
	* @param istochnikFinansirovanija the istochnik finansirovanija
	* @return the istochnik finansirovanija that was added
	*/
	@Override
	public tj.istochnik.finansirovanija.model.IstochnikFinansirovanija addIstochnikFinansirovanija(
		tj.istochnik.finansirovanija.model.IstochnikFinansirovanija istochnikFinansirovanija) {
		return _istochnikFinansirovanijaLocalService.addIstochnikFinansirovanija(istochnikFinansirovanija);
	}

	/**
	* Creates a new istochnik finansirovanija with the primary key. Does not add the istochnik finansirovanija to the database.
	*
	* @param istochnik_finansirovanija_id the primary key for the new istochnik finansirovanija
	* @return the new istochnik finansirovanija
	*/
	@Override
	public tj.istochnik.finansirovanija.model.IstochnikFinansirovanija createIstochnikFinansirovanija(
		long istochnik_finansirovanija_id) {
		return _istochnikFinansirovanijaLocalService.createIstochnikFinansirovanija(istochnik_finansirovanija_id);
	}

	/**
	* Deletes the istochnik finansirovanija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param istochnik_finansirovanija_id the primary key of the istochnik finansirovanija
	* @return the istochnik finansirovanija that was removed
	* @throws PortalException if a istochnik finansirovanija with the primary key could not be found
	*/
	@Override
	public tj.istochnik.finansirovanija.model.IstochnikFinansirovanija deleteIstochnikFinansirovanija(
		long istochnik_finansirovanija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _istochnikFinansirovanijaLocalService.deleteIstochnikFinansirovanija(istochnik_finansirovanija_id);
	}

	/**
	* Deletes the istochnik finansirovanija from the database. Also notifies the appropriate model listeners.
	*
	* @param istochnikFinansirovanija the istochnik finansirovanija
	* @return the istochnik finansirovanija that was removed
	*/
	@Override
	public tj.istochnik.finansirovanija.model.IstochnikFinansirovanija deleteIstochnikFinansirovanija(
		tj.istochnik.finansirovanija.model.IstochnikFinansirovanija istochnikFinansirovanija) {
		return _istochnikFinansirovanijaLocalService.deleteIstochnikFinansirovanija(istochnikFinansirovanija);
	}

	@Override
	public tj.istochnik.finansirovanija.model.IstochnikFinansirovanija fetchIstochnikFinansirovanija(
		long istochnik_finansirovanija_id) {
		return _istochnikFinansirovanijaLocalService.fetchIstochnikFinansirovanija(istochnik_finansirovanija_id);
	}

	/**
	* Returns the istochnik finansirovanija with the primary key.
	*
	* @param istochnik_finansirovanija_id the primary key of the istochnik finansirovanija
	* @return the istochnik finansirovanija
	* @throws PortalException if a istochnik finansirovanija with the primary key could not be found
	*/
	@Override
	public tj.istochnik.finansirovanija.model.IstochnikFinansirovanija getIstochnikFinansirovanija(
		long istochnik_finansirovanija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _istochnikFinansirovanijaLocalService.getIstochnikFinansirovanija(istochnik_finansirovanija_id);
	}

	/**
	* Updates the istochnik finansirovanija in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param istochnikFinansirovanija the istochnik finansirovanija
	* @return the istochnik finansirovanija that was updated
	*/
	@Override
	public tj.istochnik.finansirovanija.model.IstochnikFinansirovanija updateIstochnikFinansirovanija(
		tj.istochnik.finansirovanija.model.IstochnikFinansirovanija istochnikFinansirovanija) {
		return _istochnikFinansirovanijaLocalService.updateIstochnikFinansirovanija(istochnikFinansirovanija);
	}

	@Override
	public IstochnikFinansirovanijaLocalService getWrappedService() {
		return _istochnikFinansirovanijaLocalService;
	}

	@Override
	public void setWrappedService(
		IstochnikFinansirovanijaLocalService istochnikFinansirovanijaLocalService) {
		_istochnikFinansirovanijaLocalService = istochnikFinansirovanijaLocalService;
	}

	private IstochnikFinansirovanijaLocalService _istochnikFinansirovanijaLocalService;
}