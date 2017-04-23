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
 * Provides a wrapper for {@link CriteriasWeightLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CriteriasWeightLocalService
 * @generated
 */
@ProviderType
public class CriteriasWeightLocalServiceWrapper
	implements CriteriasWeightLocalService,
		ServiceWrapper<CriteriasWeightLocalService> {
	public CriteriasWeightLocalServiceWrapper(
		CriteriasWeightLocalService criteriasWeightLocalService) {
		_criteriasWeightLocalService = criteriasWeightLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _criteriasWeightLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _criteriasWeightLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _criteriasWeightLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _criteriasWeightLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _criteriasWeightLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of criterias weights.
	*
	* @return the number of criterias weights
	*/
	@Override
	public int getCriteriasWeightsCount() {
		return _criteriasWeightLocalService.getCriteriasWeightsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _criteriasWeightLocalService.getOSGiServiceIdentifier();
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
		return _criteriasWeightLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.criterias.model.impl.CriteriasWeightModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _criteriasWeightLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.criterias.model.impl.CriteriasWeightModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _criteriasWeightLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the criterias weights.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.criterias.model.impl.CriteriasWeightModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of criterias weights
	* @param end the upper bound of the range of criterias weights (not inclusive)
	* @return the range of criterias weights
	*/
	@Override
	public java.util.List<tj.criterias.model.CriteriasWeight> getCriteriasWeights(
		int start, int end) {
		return _criteriasWeightLocalService.getCriteriasWeights(start, end);
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
		return _criteriasWeightLocalService.dynamicQueryCount(dynamicQuery);
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
		return _criteriasWeightLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the criterias weight to the database. Also notifies the appropriate model listeners.
	*
	* @param criteriasWeight the criterias weight
	* @return the criterias weight that was added
	*/
	@Override
	public tj.criterias.model.CriteriasWeight addCriteriasWeight(
		tj.criterias.model.CriteriasWeight criteriasWeight) {
		return _criteriasWeightLocalService.addCriteriasWeight(criteriasWeight);
	}

	/**
	* Creates a new criterias weight with the primary key. Does not add the criterias weight to the database.
	*
	* @param criterias_weight_id the primary key for the new criterias weight
	* @return the new criterias weight
	*/
	@Override
	public tj.criterias.model.CriteriasWeight createCriteriasWeight(
		long criterias_weight_id) {
		return _criteriasWeightLocalService.createCriteriasWeight(criterias_weight_id);
	}

	/**
	* Deletes the criterias weight with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param criterias_weight_id the primary key of the criterias weight
	* @return the criterias weight that was removed
	* @throws PortalException if a criterias weight with the primary key could not be found
	*/
	@Override
	public tj.criterias.model.CriteriasWeight deleteCriteriasWeight(
		long criterias_weight_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _criteriasWeightLocalService.deleteCriteriasWeight(criterias_weight_id);
	}

	/**
	* Deletes the criterias weight from the database. Also notifies the appropriate model listeners.
	*
	* @param criteriasWeight the criterias weight
	* @return the criterias weight that was removed
	*/
	@Override
	public tj.criterias.model.CriteriasWeight deleteCriteriasWeight(
		tj.criterias.model.CriteriasWeight criteriasWeight) {
		return _criteriasWeightLocalService.deleteCriteriasWeight(criteriasWeight);
	}

	@Override
	public tj.criterias.model.CriteriasWeight fetchCriteriasWeight(
		long criterias_weight_id) {
		return _criteriasWeightLocalService.fetchCriteriasWeight(criterias_weight_id);
	}

	/**
	* Returns the criterias weight with the primary key.
	*
	* @param criterias_weight_id the primary key of the criterias weight
	* @return the criterias weight
	* @throws PortalException if a criterias weight with the primary key could not be found
	*/
	@Override
	public tj.criterias.model.CriteriasWeight getCriteriasWeight(
		long criterias_weight_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _criteriasWeightLocalService.getCriteriasWeight(criterias_weight_id);
	}

	@Override
	public tj.criterias.model.CriteriasWeight getCriteriasWeight(
		long spisok_lotov_id, int criteria_category_id) {
		return _criteriasWeightLocalService.getCriteriasWeight(spisok_lotov_id,
			criteria_category_id);
	}

	/**
	* Updates the criterias weight in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param criteriasWeight the criterias weight
	* @return the criterias weight that was updated
	*/
	@Override
	public tj.criterias.model.CriteriasWeight updateCriteriasWeight(
		tj.criterias.model.CriteriasWeight criteriasWeight) {
		return _criteriasWeightLocalService.updateCriteriasWeight(criteriasWeight);
	}

	@Override
	public CriteriasWeightLocalService getWrappedService() {
		return _criteriasWeightLocalService;
	}

	@Override
	public void setWrappedService(
		CriteriasWeightLocalService criteriasWeightLocalService) {
		_criteriasWeightLocalService = criteriasWeightLocalService;
	}

	private CriteriasWeightLocalService _criteriasWeightLocalService;
}