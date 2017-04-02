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

package tj.strany.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StranyLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see StranyLocalService
 * @generated
 */
@ProviderType
public class StranyLocalServiceWrapper implements StranyLocalService,
	ServiceWrapper<StranyLocalService> {
	public StranyLocalServiceWrapper(StranyLocalService stranyLocalService) {
		_stranyLocalService = stranyLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _stranyLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _stranyLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _stranyLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _stranyLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _stranyLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of stranies.
	*
	* @return the number of stranies
	*/
	@Override
	public int getStraniesCount() {
		return _stranyLocalService.getStraniesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _stranyLocalService.getOSGiServiceIdentifier();
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
		return _stranyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.strany.model.impl.StranyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _stranyLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.strany.model.impl.StranyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _stranyLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the stranies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.strany.model.impl.StranyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of stranies
	* @param end the upper bound of the range of stranies (not inclusive)
	* @return the range of stranies
	*/
	@Override
	public java.util.List<tj.strany.model.Strany> getStranies(int start, int end) {
		return _stranyLocalService.getStranies(start, end);
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
		return _stranyLocalService.dynamicQueryCount(dynamicQuery);
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
		return _stranyLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the strany to the database. Also notifies the appropriate model listeners.
	*
	* @param strany the strany
	* @return the strany that was added
	*/
	@Override
	public tj.strany.model.Strany addStrany(tj.strany.model.Strany strany) {
		return _stranyLocalService.addStrany(strany);
	}

	/**
	* Creates a new strany with the primary key. Does not add the strany to the database.
	*
	* @param strany_id the primary key for the new strany
	* @return the new strany
	*/
	@Override
	public tj.strany.model.Strany createStrany(long strany_id) {
		return _stranyLocalService.createStrany(strany_id);
	}

	/**
	* Deletes the strany with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param strany_id the primary key of the strany
	* @return the strany that was removed
	* @throws PortalException if a strany with the primary key could not be found
	*/
	@Override
	public tj.strany.model.Strany deleteStrany(long strany_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _stranyLocalService.deleteStrany(strany_id);
	}

	/**
	* Deletes the strany from the database. Also notifies the appropriate model listeners.
	*
	* @param strany the strany
	* @return the strany that was removed
	*/
	@Override
	public tj.strany.model.Strany deleteStrany(tj.strany.model.Strany strany) {
		return _stranyLocalService.deleteStrany(strany);
	}

	@Override
	public tj.strany.model.Strany fetchStrany(long strany_id) {
		return _stranyLocalService.fetchStrany(strany_id);
	}

	/**
	* Returns the strany with the primary key.
	*
	* @param strany_id the primary key of the strany
	* @return the strany
	* @throws PortalException if a strany with the primary key could not be found
	*/
	@Override
	public tj.strany.model.Strany getStrany(long strany_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _stranyLocalService.getStrany(strany_id);
	}

	/**
	* Updates the strany in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param strany the strany
	* @return the strany that was updated
	*/
	@Override
	public tj.strany.model.Strany updateStrany(tj.strany.model.Strany strany) {
		return _stranyLocalService.updateStrany(strany);
	}

	@Override
	public StranyLocalService getWrappedService() {
		return _stranyLocalService;
	}

	@Override
	public void setWrappedService(StranyLocalService stranyLocalService) {
		_stranyLocalService = stranyLocalService;
	}

	private StranyLocalService _stranyLocalService;
}