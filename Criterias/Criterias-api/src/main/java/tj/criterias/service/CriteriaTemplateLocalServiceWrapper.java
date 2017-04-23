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
 * Provides a wrapper for {@link CriteriaTemplateLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaTemplateLocalService
 * @generated
 */
@ProviderType
public class CriteriaTemplateLocalServiceWrapper
	implements CriteriaTemplateLocalService,
		ServiceWrapper<CriteriaTemplateLocalService> {
	public CriteriaTemplateLocalServiceWrapper(
		CriteriaTemplateLocalService criteriaTemplateLocalService) {
		_criteriaTemplateLocalService = criteriaTemplateLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _criteriaTemplateLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _criteriaTemplateLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _criteriaTemplateLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _criteriaTemplateLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _criteriaTemplateLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of criteria templates.
	*
	* @return the number of criteria templates
	*/
	@Override
	public int getCriteriaTemplatesCount() {
		return _criteriaTemplateLocalService.getCriteriaTemplatesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _criteriaTemplateLocalService.getOSGiServiceIdentifier();
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
		return _criteriaTemplateLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.criterias.model.impl.CriteriaTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _criteriaTemplateLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.criterias.model.impl.CriteriaTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _criteriaTemplateLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<tj.criterias.model.CriteriaTemplate> getCriteriaTemplate(
		int criteria_category_id) {
		return _criteriaTemplateLocalService.getCriteriaTemplate(criteria_category_id);
	}

	/**
	* Returns a range of all the criteria templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.criterias.model.impl.CriteriaTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of criteria templates
	* @param end the upper bound of the range of criteria templates (not inclusive)
	* @return the range of criteria templates
	*/
	@Override
	public java.util.List<tj.criterias.model.CriteriaTemplate> getCriteriaTemplates(
		int start, int end) {
		return _criteriaTemplateLocalService.getCriteriaTemplates(start, end);
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
		return _criteriaTemplateLocalService.dynamicQueryCount(dynamicQuery);
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
		return _criteriaTemplateLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the criteria template to the database. Also notifies the appropriate model listeners.
	*
	* @param criteriaTemplate the criteria template
	* @return the criteria template that was added
	*/
	@Override
	public tj.criterias.model.CriteriaTemplate addCriteriaTemplate(
		tj.criterias.model.CriteriaTemplate criteriaTemplate) {
		return _criteriaTemplateLocalService.addCriteriaTemplate(criteriaTemplate);
	}

	/**
	* Creates a new criteria template with the primary key. Does not add the criteria template to the database.
	*
	* @param criteria_template_id the primary key for the new criteria template
	* @return the new criteria template
	*/
	@Override
	public tj.criterias.model.CriteriaTemplate createCriteriaTemplate(
		long criteria_template_id) {
		return _criteriaTemplateLocalService.createCriteriaTemplate(criteria_template_id);
	}

	/**
	* Deletes the criteria template with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param criteria_template_id the primary key of the criteria template
	* @return the criteria template that was removed
	* @throws PortalException if a criteria template with the primary key could not be found
	*/
	@Override
	public tj.criterias.model.CriteriaTemplate deleteCriteriaTemplate(
		long criteria_template_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _criteriaTemplateLocalService.deleteCriteriaTemplate(criteria_template_id);
	}

	/**
	* Deletes the criteria template from the database. Also notifies the appropriate model listeners.
	*
	* @param criteriaTemplate the criteria template
	* @return the criteria template that was removed
	*/
	@Override
	public tj.criterias.model.CriteriaTemplate deleteCriteriaTemplate(
		tj.criterias.model.CriteriaTemplate criteriaTemplate) {
		return _criteriaTemplateLocalService.deleteCriteriaTemplate(criteriaTemplate);
	}

	@Override
	public tj.criterias.model.CriteriaTemplate fetchCriteriaTemplate(
		long criteria_template_id) {
		return _criteriaTemplateLocalService.fetchCriteriaTemplate(criteria_template_id);
	}

	/**
	* Returns the criteria template with the primary key.
	*
	* @param criteria_template_id the primary key of the criteria template
	* @return the criteria template
	* @throws PortalException if a criteria template with the primary key could not be found
	*/
	@Override
	public tj.criterias.model.CriteriaTemplate getCriteriaTemplate(
		long criteria_template_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _criteriaTemplateLocalService.getCriteriaTemplate(criteria_template_id);
	}

	/**
	* Updates the criteria template in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param criteriaTemplate the criteria template
	* @return the criteria template that was updated
	*/
	@Override
	public tj.criterias.model.CriteriaTemplate updateCriteriaTemplate(
		tj.criterias.model.CriteriaTemplate criteriaTemplate) {
		return _criteriaTemplateLocalService.updateCriteriaTemplate(criteriaTemplate);
	}

	@Override
	public CriteriaTemplateLocalService getWrappedService() {
		return _criteriaTemplateLocalService;
	}

	@Override
	public void setWrappedService(
		CriteriaTemplateLocalService criteriaTemplateLocalService) {
		_criteriaTemplateLocalService = criteriaTemplateLocalService;
	}

	private CriteriaTemplateLocalService _criteriaTemplateLocalService;
}