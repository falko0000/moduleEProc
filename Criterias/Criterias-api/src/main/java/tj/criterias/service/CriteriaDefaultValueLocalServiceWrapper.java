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
 * Provides a wrapper for {@link CriteriaDefaultValueLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaDefaultValueLocalService
 * @generated
 */
@ProviderType
public class CriteriaDefaultValueLocalServiceWrapper
	implements CriteriaDefaultValueLocalService,
		ServiceWrapper<CriteriaDefaultValueLocalService> {
	public CriteriaDefaultValueLocalServiceWrapper(
		CriteriaDefaultValueLocalService criteriaDefaultValueLocalService) {
		_criteriaDefaultValueLocalService = criteriaDefaultValueLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _criteriaDefaultValueLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _criteriaDefaultValueLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _criteriaDefaultValueLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _criteriaDefaultValueLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _criteriaDefaultValueLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of criteria default values.
	*
	* @return the number of criteria default values
	*/
	@Override
	public int getCriteriaDefaultValuesCount() {
		return _criteriaDefaultValueLocalService.getCriteriaDefaultValuesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _criteriaDefaultValueLocalService.getOSGiServiceIdentifier();
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
		return _criteriaDefaultValueLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.criterias.model.impl.CriteriaDefaultValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _criteriaDefaultValueLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.criterias.model.impl.CriteriaDefaultValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _criteriaDefaultValueLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<tj.criterias.model.CriteriaDefaultValue> getCriteriaDefaultValues(
		int criteria_type_id) {
		return _criteriaDefaultValueLocalService.getCriteriaDefaultValues(criteria_type_id);
	}

	/**
	* Returns a range of all the criteria default values.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.criterias.model.impl.CriteriaDefaultValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of criteria default values
	* @param end the upper bound of the range of criteria default values (not inclusive)
	* @return the range of criteria default values
	*/
	@Override
	public java.util.List<tj.criterias.model.CriteriaDefaultValue> getCriteriaDefaultValues(
		int start, int end) {
		return _criteriaDefaultValueLocalService.getCriteriaDefaultValues(start,
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
		return _criteriaDefaultValueLocalService.dynamicQueryCount(dynamicQuery);
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
		return _criteriaDefaultValueLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the criteria default value to the database. Also notifies the appropriate model listeners.
	*
	* @param criteriaDefaultValue the criteria default value
	* @return the criteria default value that was added
	*/
	@Override
	public tj.criterias.model.CriteriaDefaultValue addCriteriaDefaultValue(
		tj.criterias.model.CriteriaDefaultValue criteriaDefaultValue) {
		return _criteriaDefaultValueLocalService.addCriteriaDefaultValue(criteriaDefaultValue);
	}

	/**
	* Creates a new criteria default value with the primary key. Does not add the criteria default value to the database.
	*
	* @param criteria_default_value_id the primary key for the new criteria default value
	* @return the new criteria default value
	*/
	@Override
	public tj.criterias.model.CriteriaDefaultValue createCriteriaDefaultValue(
		long criteria_default_value_id) {
		return _criteriaDefaultValueLocalService.createCriteriaDefaultValue(criteria_default_value_id);
	}

	/**
	* Deletes the criteria default value with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param criteria_default_value_id the primary key of the criteria default value
	* @return the criteria default value that was removed
	* @throws PortalException if a criteria default value with the primary key could not be found
	*/
	@Override
	public tj.criterias.model.CriteriaDefaultValue deleteCriteriaDefaultValue(
		long criteria_default_value_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _criteriaDefaultValueLocalService.deleteCriteriaDefaultValue(criteria_default_value_id);
	}

	/**
	* Deletes the criteria default value from the database. Also notifies the appropriate model listeners.
	*
	* @param criteriaDefaultValue the criteria default value
	* @return the criteria default value that was removed
	*/
	@Override
	public tj.criterias.model.CriteriaDefaultValue deleteCriteriaDefaultValue(
		tj.criterias.model.CriteriaDefaultValue criteriaDefaultValue) {
		return _criteriaDefaultValueLocalService.deleteCriteriaDefaultValue(criteriaDefaultValue);
	}

	@Override
	public tj.criterias.model.CriteriaDefaultValue fetchCriteriaDefaultValue(
		long criteria_default_value_id) {
		return _criteriaDefaultValueLocalService.fetchCriteriaDefaultValue(criteria_default_value_id);
	}

	/**
	* Returns the criteria default value with the primary key.
	*
	* @param criteria_default_value_id the primary key of the criteria default value
	* @return the criteria default value
	* @throws PortalException if a criteria default value with the primary key could not be found
	*/
	@Override
	public tj.criterias.model.CriteriaDefaultValue getCriteriaDefaultValue(
		long criteria_default_value_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _criteriaDefaultValueLocalService.getCriteriaDefaultValue(criteria_default_value_id);
	}

	/**
	* Updates the criteria default value in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param criteriaDefaultValue the criteria default value
	* @return the criteria default value that was updated
	*/
	@Override
	public tj.criterias.model.CriteriaDefaultValue updateCriteriaDefaultValue(
		tj.criterias.model.CriteriaDefaultValue criteriaDefaultValue) {
		return _criteriaDefaultValueLocalService.updateCriteriaDefaultValue(criteriaDefaultValue);
	}

	@Override
	public CriteriaDefaultValueLocalService getWrappedService() {
		return _criteriaDefaultValueLocalService;
	}

	@Override
	public void setWrappedService(
		CriteriaDefaultValueLocalService criteriaDefaultValueLocalService) {
		_criteriaDefaultValueLocalService = criteriaDefaultValueLocalService;
	}

	private CriteriaDefaultValueLocalService _criteriaDefaultValueLocalService;
}