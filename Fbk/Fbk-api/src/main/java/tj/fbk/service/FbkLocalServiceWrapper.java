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

package tj.fbk.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FbkLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FbkLocalService
 * @generated
 */
@ProviderType
public class FbkLocalServiceWrapper implements FbkLocalService,
	ServiceWrapper<FbkLocalService> {
	public FbkLocalServiceWrapper(FbkLocalService fbkLocalService) {
		_fbkLocalService = fbkLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _fbkLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fbkLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _fbkLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _fbkLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _fbkLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of fbks.
	*
	* @return the number of fbks
	*/
	@Override
	public int getFbksCount() {
		return _fbkLocalService.getFbksCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _fbkLocalService.getOSGiServiceIdentifier();
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
		return _fbkLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.fbk.model.impl.FbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _fbkLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.fbk.model.impl.FbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _fbkLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the fbks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.fbk.model.impl.FbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fbks
	* @param end the upper bound of the range of fbks (not inclusive)
	* @return the range of fbks
	*/
	@Override
	public java.util.List<tj.fbk.model.Fbk> getFbks(int start, int end) {
		return _fbkLocalService.getFbks(start, end);
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
		return _fbkLocalService.dynamicQueryCount(dynamicQuery);
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
		return _fbkLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the fbk to the database. Also notifies the appropriate model listeners.
	*
	* @param fbk the fbk
	* @return the fbk that was added
	*/
	@Override
	public tj.fbk.model.Fbk addFbk(tj.fbk.model.Fbk fbk) {
		return _fbkLocalService.addFbk(fbk);
	}

	/**
	* Creates a new fbk with the primary key. Does not add the fbk to the database.
	*
	* @param fbk_id the primary key for the new fbk
	* @return the new fbk
	*/
	@Override
	public tj.fbk.model.Fbk createFbk(long fbk_id) {
		return _fbkLocalService.createFbk(fbk_id);
	}

	/**
	* Deletes the fbk with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fbk_id the primary key of the fbk
	* @return the fbk that was removed
	* @throws PortalException if a fbk with the primary key could not be found
	*/
	@Override
	public tj.fbk.model.Fbk deleteFbk(long fbk_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _fbkLocalService.deleteFbk(fbk_id);
	}

	/**
	* Deletes the fbk from the database. Also notifies the appropriate model listeners.
	*
	* @param fbk the fbk
	* @return the fbk that was removed
	*/
	@Override
	public tj.fbk.model.Fbk deleteFbk(tj.fbk.model.Fbk fbk) {
		return _fbkLocalService.deleteFbk(fbk);
	}

	@Override
	public tj.fbk.model.Fbk fetchFbk(long fbk_id) {
		return _fbkLocalService.fetchFbk(fbk_id);
	}

	/**
	* Returns the fbk with the primary key.
	*
	* @param fbk_id the primary key of the fbk
	* @return the fbk
	* @throws PortalException if a fbk with the primary key could not be found
	*/
	@Override
	public tj.fbk.model.Fbk getFbk(long fbk_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _fbkLocalService.getFbk(fbk_id);
	}

	/**
	* Updates the fbk in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param fbk the fbk
	* @return the fbk that was updated
	*/
	@Override
	public tj.fbk.model.Fbk updateFbk(tj.fbk.model.Fbk fbk) {
		return _fbkLocalService.updateFbk(fbk);
	}

	@Override
	public FbkLocalService getWrappedService() {
		return _fbkLocalService;
	}

	@Override
	public void setWrappedService(FbkLocalService fbkLocalService) {
		_fbkLocalService = fbkLocalService;
	}

	private FbkLocalService _fbkLocalService;
}