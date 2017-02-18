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

package tj.sapp.services.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OKGZLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OKGZLocalService
 * @generated
 */
@ProviderType
public class OKGZLocalServiceWrapper implements OKGZLocalService,
	ServiceWrapper<OKGZLocalService> {
	public OKGZLocalServiceWrapper(OKGZLocalService okgzLocalService) {
		_okgzLocalService = okgzLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _okgzLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _okgzLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _okgzLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _okgzLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _okgzLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of okgzs.
	*
	* @return the number of okgzs
	*/
	@Override
	public int getOKGZsCount() {
		return _okgzLocalService.getOKGZsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _okgzLocalService.getOSGiServiceIdentifier();
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
		return _okgzLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.sapp.services.model.impl.OKGZModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _okgzLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.sapp.services.model.impl.OKGZModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _okgzLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the okgzs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.sapp.services.model.impl.OKGZModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of okgzs
	* @param end the upper bound of the range of okgzs (not inclusive)
	* @return the range of okgzs
	*/
	@Override
	public java.util.List<tj.sapp.services.model.OKGZ> getOKGZs(int start,
		int end) {
		return _okgzLocalService.getOKGZs(start, end);
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
		return _okgzLocalService.dynamicQueryCount(dynamicQuery);
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
		return _okgzLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the okgz to the database. Also notifies the appropriate model listeners.
	*
	* @param okgz the okgz
	* @return the okgz that was added
	*/
	@Override
	public tj.sapp.services.model.OKGZ addOKGZ(tj.sapp.services.model.OKGZ okgz) {
		return _okgzLocalService.addOKGZ(okgz);
	}

	/**
	* Creates a new okgz with the primary key. Does not add the okgz to the database.
	*
	* @param okgz_id the primary key for the new okgz
	* @return the new okgz
	*/
	@Override
	public tj.sapp.services.model.OKGZ createOKGZ(long okgz_id) {
		return _okgzLocalService.createOKGZ(okgz_id);
	}

	/**
	* Deletes the okgz with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param okgz_id the primary key of the okgz
	* @return the okgz that was removed
	* @throws PortalException if a okgz with the primary key could not be found
	*/
	@Override
	public tj.sapp.services.model.OKGZ deleteOKGZ(long okgz_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _okgzLocalService.deleteOKGZ(okgz_id);
	}

	/**
	* Deletes the okgz from the database. Also notifies the appropriate model listeners.
	*
	* @param okgz the okgz
	* @return the okgz that was removed
	*/
	@Override
	public tj.sapp.services.model.OKGZ deleteOKGZ(
		tj.sapp.services.model.OKGZ okgz) {
		return _okgzLocalService.deleteOKGZ(okgz);
	}

	@Override
	public tj.sapp.services.model.OKGZ fetchOKGZ(long okgz_id) {
		return _okgzLocalService.fetchOKGZ(okgz_id);
	}

	/**
	* Returns the okgz with the primary key.
	*
	* @param okgz_id the primary key of the okgz
	* @return the okgz
	* @throws PortalException if a okgz with the primary key could not be found
	*/
	@Override
	public tj.sapp.services.model.OKGZ getOKGZ(long okgz_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _okgzLocalService.getOKGZ(okgz_id);
	}

	/**
	* Updates the okgz in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param okgz the okgz
	* @return the okgz that was updated
	*/
	@Override
	public tj.sapp.services.model.OKGZ updateOKGZ(
		tj.sapp.services.model.OKGZ okgz) {
		return _okgzLocalService.updateOKGZ(okgz);
	}

	@Override
	public OKGZLocalService getWrappedService() {
		return _okgzLocalService;
	}

	@Override
	public void setWrappedService(OKGZLocalService okgzLocalService) {
		_okgzLocalService = okgzLocalService;
	}

	private OKGZLocalService _okgzLocalService;
}