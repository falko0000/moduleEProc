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

package tj.criterias.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CriteriaValueLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaValueLocalService
 * @generated
 */
@ProviderType
public class CriteriaValueLocalServiceWrapper
	implements CriteriaValueLocalService,
		ServiceWrapper<CriteriaValueLocalService> {
	public CriteriaValueLocalServiceWrapper(
		CriteriaValueLocalService criteriaValueLocalService) {
		_criteriaValueLocalService = criteriaValueLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _criteriaValueLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _criteriaValueLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _criteriaValueLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _criteriaValueLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _criteriaValueLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of criteria values.
	*
	* @return the number of criteria values
	*/
	@Override
	public int getCriteriaValuesCount() {
		return _criteriaValueLocalService.getCriteriaValuesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _criteriaValueLocalService.getOSGiServiceIdentifier();
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
		return _criteriaValueLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.criterias.model.impl.CriteriaValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _criteriaValueLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.criterias.model.impl.CriteriaValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _criteriaValueLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<tj.criterias.model.CriteriaValue> getCriteriaValue(
		long criteria_id, long userid) {
		return _criteriaValueLocalService.getCriteriaValue(criteria_id, userid);
	}

	/**
	* Returns a range of all the criteria values.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.criterias.model.impl.CriteriaValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of criteria values
	* @param end the upper bound of the range of criteria values (not inclusive)
	* @return the range of criteria values
	*/
	@Override
	public java.util.List<tj.criterias.model.CriteriaValue> getCriteriaValues(
		int start, int end) {
		return _criteriaValueLocalService.getCriteriaValues(start, end);
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
		return _criteriaValueLocalService.dynamicQueryCount(dynamicQuery);
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
		return _criteriaValueLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the criteria value to the database. Also notifies the appropriate model listeners.
	*
	* @param criteriaValue the criteria value
	* @return the criteria value that was added
	*/
	@Override
	public tj.criterias.model.CriteriaValue addCriteriaValue(
		tj.criterias.model.CriteriaValue criteriaValue) {
		return _criteriaValueLocalService.addCriteriaValue(criteriaValue);
	}

	/**
	* Creates a new criteria value with the primary key. Does not add the criteria value to the database.
	*
	* @param criteria_value_id the primary key for the new criteria value
	* @return the new criteria value
	*/
	@Override
	public tj.criterias.model.CriteriaValue createCriteriaValue(
		long criteria_value_id) {
		return _criteriaValueLocalService.createCriteriaValue(criteria_value_id);
	}

	/**
	* Deletes the criteria value with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param criteria_value_id the primary key of the criteria value
	* @return the criteria value that was removed
	* @throws PortalException if a criteria value with the primary key could not be found
	*/
	@Override
	public tj.criterias.model.CriteriaValue deleteCriteriaValue(
		long criteria_value_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _criteriaValueLocalService.deleteCriteriaValue(criteria_value_id);
	}

	/**
	* Deletes the criteria value from the database. Also notifies the appropriate model listeners.
	*
	* @param criteriaValue the criteria value
	* @return the criteria value that was removed
	*/
	@Override
	public tj.criterias.model.CriteriaValue deleteCriteriaValue(
		tj.criterias.model.CriteriaValue criteriaValue) {
		return _criteriaValueLocalService.deleteCriteriaValue(criteriaValue);
	}

	@Override
	public tj.criterias.model.CriteriaValue fetchCriteriaValue(
		long criteria_value_id) {
		return _criteriaValueLocalService.fetchCriteriaValue(criteria_value_id);
	}

	/**
	* Returns the criteria value with the primary key.
	*
	* @param criteria_value_id the primary key of the criteria value
	* @return the criteria value
	* @throws PortalException if a criteria value with the primary key could not be found
	*/
	@Override
	public tj.criterias.model.CriteriaValue getCriteriaValue(
		long criteria_value_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _criteriaValueLocalService.getCriteriaValue(criteria_value_id);
	}

	/**
	* Updates the criteria value in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param criteriaValue the criteria value
	* @return the criteria value that was updated
	*/
	@Override
	public tj.criterias.model.CriteriaValue updateCriteriaValue(
		tj.criterias.model.CriteriaValue criteriaValue) {
		return _criteriaValueLocalService.updateCriteriaValue(criteriaValue);
	}

	@Override
	public CriteriaValueLocalService getWrappedService() {
		return _criteriaValueLocalService;
	}

	@Override
	public void setWrappedService(
		CriteriaValueLocalService criteriaValueLocalService) {
		_criteriaValueLocalService = criteriaValueLocalService;
	}

	private CriteriaValueLocalService _criteriaValueLocalService;
}