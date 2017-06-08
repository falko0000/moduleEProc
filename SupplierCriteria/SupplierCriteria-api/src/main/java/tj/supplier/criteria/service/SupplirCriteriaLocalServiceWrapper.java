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

package tj.supplier.criteria.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SupplirCriteriaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SupplirCriteriaLocalService
 * @generated
 */
@ProviderType
public class SupplirCriteriaLocalServiceWrapper
	implements SupplirCriteriaLocalService,
		ServiceWrapper<SupplirCriteriaLocalService> {
	public SupplirCriteriaLocalServiceWrapper(
		SupplirCriteriaLocalService supplirCriteriaLocalService) {
		_supplirCriteriaLocalService = supplirCriteriaLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _supplirCriteriaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _supplirCriteriaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _supplirCriteriaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _supplirCriteriaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _supplirCriteriaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of supplir criterias.
	*
	* @return the number of supplir criterias
	*/
	@Override
	public int getSupplirCriteriasCount() {
		return _supplirCriteriaLocalService.getSupplirCriteriasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _supplirCriteriaLocalService.getOSGiServiceIdentifier();
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
		return _supplirCriteriaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.supplier.criteria.model.impl.SupplirCriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _supplirCriteriaLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.supplier.criteria.model.impl.SupplirCriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _supplirCriteriaLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the supplir criterias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.supplier.criteria.model.impl.SupplirCriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of supplir criterias
	* @param end the upper bound of the range of supplir criterias (not inclusive)
	* @return the range of supplir criterias
	*/
	@Override
	public java.util.List<tj.supplier.criteria.model.SupplirCriteria> getSupplirCriterias(
		int start, int end) {
		return _supplirCriteriaLocalService.getSupplirCriterias(start, end);
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
		return _supplirCriteriaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _supplirCriteriaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the supplir criteria to the database. Also notifies the appropriate model listeners.
	*
	* @param supplirCriteria the supplir criteria
	* @return the supplir criteria that was added
	*/
	@Override
	public tj.supplier.criteria.model.SupplirCriteria addSupplirCriteria(
		tj.supplier.criteria.model.SupplirCriteria supplirCriteria) {
		return _supplirCriteriaLocalService.addSupplirCriteria(supplirCriteria);
	}

	/**
	* Creates a new supplir criteria with the primary key. Does not add the supplir criteria to the database.
	*
	* @param supplier_criteria_id the primary key for the new supplir criteria
	* @return the new supplir criteria
	*/
	@Override
	public tj.supplier.criteria.model.SupplirCriteria createSupplirCriteria(
		long supplier_criteria_id) {
		return _supplirCriteriaLocalService.createSupplirCriteria(supplier_criteria_id);
	}

	/**
	* Deletes the supplir criteria with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param supplier_criteria_id the primary key of the supplir criteria
	* @return the supplir criteria that was removed
	* @throws PortalException if a supplir criteria with the primary key could not be found
	*/
	@Override
	public tj.supplier.criteria.model.SupplirCriteria deleteSupplirCriteria(
		long supplier_criteria_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _supplirCriteriaLocalService.deleteSupplirCriteria(supplier_criteria_id);
	}

	/**
	* Deletes the supplir criteria from the database. Also notifies the appropriate model listeners.
	*
	* @param supplirCriteria the supplir criteria
	* @return the supplir criteria that was removed
	*/
	@Override
	public tj.supplier.criteria.model.SupplirCriteria deleteSupplirCriteria(
		tj.supplier.criteria.model.SupplirCriteria supplirCriteria) {
		return _supplirCriteriaLocalService.deleteSupplirCriteria(supplirCriteria);
	}

	@Override
	public tj.supplier.criteria.model.SupplirCriteria fetchSupplirCriteria(
		long supplier_criteria_id) {
		return _supplirCriteriaLocalService.fetchSupplirCriteria(supplier_criteria_id);
	}

	@Override
	public tj.supplier.criteria.model.SupplirCriteria getSupplierCriteria(
		long criteria_id, long organization_id) {
		return _supplirCriteriaLocalService.getSupplierCriteria(criteria_id,
			organization_id);
	}

	/**
	* Returns the supplir criteria with the primary key.
	*
	* @param supplier_criteria_id the primary key of the supplir criteria
	* @return the supplir criteria
	* @throws PortalException if a supplir criteria with the primary key could not be found
	*/
	@Override
	public tj.supplier.criteria.model.SupplirCriteria getSupplirCriteria(
		long supplier_criteria_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _supplirCriteriaLocalService.getSupplirCriteria(supplier_criteria_id);
	}

	/**
	* Updates the supplir criteria in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param supplirCriteria the supplir criteria
	* @return the supplir criteria that was updated
	*/
	@Override
	public tj.supplier.criteria.model.SupplirCriteria updateSupplirCriteria(
		tj.supplier.criteria.model.SupplirCriteria supplirCriteria) {
		return _supplirCriteriaLocalService.updateSupplirCriteria(supplirCriteria);
	}

	@Override
	public SupplirCriteriaLocalService getWrappedService() {
		return _supplirCriteriaLocalService;
	}

	@Override
	public void setWrappedService(
		SupplirCriteriaLocalService supplirCriteriaLocalService) {
		_supplirCriteriaLocalService = supplirCriteriaLocalService;
	}

	private SupplirCriteriaLocalService _supplirCriteriaLocalService;
}