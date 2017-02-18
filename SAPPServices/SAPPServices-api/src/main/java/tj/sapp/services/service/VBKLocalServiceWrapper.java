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
 * Provides a wrapper for {@link VBKLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VBKLocalService
 * @generated
 */
@ProviderType
public class VBKLocalServiceWrapper implements VBKLocalService,
	ServiceWrapper<VBKLocalService> {
	public VBKLocalServiceWrapper(VBKLocalService vbkLocalService) {
		_vbkLocalService = vbkLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vbkLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vbkLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vbkLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vbkLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vbkLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vbks.
	*
	* @return the number of vbks
	*/
	@Override
	public int getVBKsCount() {
		return _vbkLocalService.getVBKsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vbkLocalService.getOSGiServiceIdentifier();
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
		return _vbkLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.sapp.services.model.impl.VBKModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vbkLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.sapp.services.model.impl.VBKModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vbkLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the vbks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.sapp.services.model.impl.VBKModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vbks
	* @param end the upper bound of the range of vbks (not inclusive)
	* @return the range of vbks
	*/
	@Override
	public java.util.List<tj.sapp.services.model.VBK> getVBKs(int start, int end) {
		return _vbkLocalService.getVBKs(start, end);
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
		return _vbkLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vbkLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the vbk to the database. Also notifies the appropriate model listeners.
	*
	* @param vbk the vbk
	* @return the vbk that was added
	*/
	@Override
	public tj.sapp.services.model.VBK addVBK(tj.sapp.services.model.VBK vbk) {
		return _vbkLocalService.addVBK(vbk);
	}

	/**
	* Creates a new vbk with the primary key. Does not add the vbk to the database.
	*
	* @param id_ the primary key for the new vbk
	* @return the new vbk
	*/
	@Override
	public tj.sapp.services.model.VBK createVBK(long id_) {
		return _vbkLocalService.createVBK(id_);
	}

	/**
	* Deletes the vbk with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_ the primary key of the vbk
	* @return the vbk that was removed
	* @throws PortalException if a vbk with the primary key could not be found
	*/
	@Override
	public tj.sapp.services.model.VBK deleteVBK(long id_)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vbkLocalService.deleteVBK(id_);
	}

	/**
	* Deletes the vbk from the database. Also notifies the appropriate model listeners.
	*
	* @param vbk the vbk
	* @return the vbk that was removed
	*/
	@Override
	public tj.sapp.services.model.VBK deleteVBK(tj.sapp.services.model.VBK vbk) {
		return _vbkLocalService.deleteVBK(vbk);
	}

	@Override
	public tj.sapp.services.model.VBK fetchVBK(long id_) {
		return _vbkLocalService.fetchVBK(id_);
	}

	/**
	* Returns the vbk with the primary key.
	*
	* @param id_ the primary key of the vbk
	* @return the vbk
	* @throws PortalException if a vbk with the primary key could not be found
	*/
	@Override
	public tj.sapp.services.model.VBK getVBK(long id_)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vbkLocalService.getVBK(id_);
	}

	/**
	* Updates the vbk in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vbk the vbk
	* @return the vbk that was updated
	*/
	@Override
	public tj.sapp.services.model.VBK updateVBK(tj.sapp.services.model.VBK vbk) {
		return _vbkLocalService.updateVBK(vbk);
	}

	@Override
	public VBKLocalService getWrappedService() {
		return _vbkLocalService;
	}

	@Override
	public void setWrappedService(VBKLocalService vbkLocalService) {
		_vbkLocalService = vbkLocalService;
	}

	private VBKLocalService _vbkLocalService;
}