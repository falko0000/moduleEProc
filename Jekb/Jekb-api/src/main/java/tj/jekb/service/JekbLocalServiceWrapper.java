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

package tj.jekb.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JekbLocalService}.
 *
 * @author falko
 * @see JekbLocalService
 * @generated
 */
@ProviderType
public class JekbLocalServiceWrapper implements JekbLocalService,
	ServiceWrapper<JekbLocalService> {
	public JekbLocalServiceWrapper(JekbLocalService jekbLocalService) {
		_jekbLocalService = jekbLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _jekbLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jekbLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _jekbLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jekbLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jekbLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of jekbs.
	*
	* @return the number of jekbs
	*/
	@Override
	public int getJekbsCount() {
		return _jekbLocalService.getJekbsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _jekbLocalService.getOSGiServiceIdentifier();
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
		return _jekbLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.jekb.model.impl.JekbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _jekbLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.jekb.model.impl.JekbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _jekbLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the jekbs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.jekb.model.impl.JekbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jekbs
	* @param end the upper bound of the range of jekbs (not inclusive)
	* @return the range of jekbs
	*/
	@Override
	public java.util.List<tj.jekb.model.Jekb> getJekbs(int start, int end) {
		return _jekbLocalService.getJekbs(start, end);
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
		return _jekbLocalService.dynamicQueryCount(dynamicQuery);
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
		return _jekbLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the jekb to the database. Also notifies the appropriate model listeners.
	*
	* @param jekb the jekb
	* @return the jekb that was added
	*/
	@Override
	public tj.jekb.model.Jekb addJekb(tj.jekb.model.Jekb jekb) {
		return _jekbLocalService.addJekb(jekb);
	}

	/**
	* Creates a new jekb with the primary key. Does not add the jekb to the database.
	*
	* @param jekb_id the primary key for the new jekb
	* @return the new jekb
	*/
	@Override
	public tj.jekb.model.Jekb createJekb(long jekb_id) {
		return _jekbLocalService.createJekb(jekb_id);
	}

	/**
	* Deletes the jekb with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jekb_id the primary key of the jekb
	* @return the jekb that was removed
	* @throws PortalException if a jekb with the primary key could not be found
	*/
	@Override
	public tj.jekb.model.Jekb deleteJekb(long jekb_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jekbLocalService.deleteJekb(jekb_id);
	}

	/**
	* Deletes the jekb from the database. Also notifies the appropriate model listeners.
	*
	* @param jekb the jekb
	* @return the jekb that was removed
	*/
	@Override
	public tj.jekb.model.Jekb deleteJekb(tj.jekb.model.Jekb jekb) {
		return _jekbLocalService.deleteJekb(jekb);
	}

	@Override
	public tj.jekb.model.Jekb fetchJekb(long jekb_id) {
		return _jekbLocalService.fetchJekb(jekb_id);
	}

	/**
	* Returns the jekb with the primary key.
	*
	* @param jekb_id the primary key of the jekb
	* @return the jekb
	* @throws PortalException if a jekb with the primary key could not be found
	*/
	@Override
	public tj.jekb.model.Jekb getJekb(long jekb_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jekbLocalService.getJekb(jekb_id);
	}

	/**
	* Updates the jekb in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param jekb the jekb
	* @return the jekb that was updated
	*/
	@Override
	public tj.jekb.model.Jekb updateJekb(tj.jekb.model.Jekb jekb) {
		return _jekbLocalService.updateJekb(jekb);
	}

	@Override
	public JekbLocalService getWrappedService() {
		return _jekbLocalService;
	}

	@Override
	public void setWrappedService(JekbLocalService jekbLocalService) {
		_jekbLocalService = jekbLocalService;
	}

	private JekbLocalService _jekbLocalService;
}