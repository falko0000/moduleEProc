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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Criteria. This utility wraps
 * {@link tj.criterias.service.impl.CriteriaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaLocalService
 * @see tj.criterias.service.base.CriteriaLocalServiceBaseImpl
 * @see tj.criterias.service.impl.CriteriaLocalServiceImpl
 * @generated
 */
@ProviderType
public class CriteriaLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.criterias.service.impl.CriteriaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of criterias.
	*
	* @return the number of criterias
	*/
	public static int getCriteriasCount() {
		return getService().getCriteriasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.criterias.model.impl.CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.criterias.model.impl.CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the criterias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.criterias.model.impl.CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of criterias
	* @param end the upper bound of the range of criterias (not inclusive)
	* @return the range of criterias
	*/
	public static java.util.List<tj.criterias.model.Criteria> getCriterias(
		int start, int end) {
		return getService().getCriterias(start, end);
	}

	public static java.util.List<tj.criterias.model.Criteria> getLotAndCategory(
		long spisok_lotov_id, int criteria_category_id) {
		return getService()
				   .getLotAndCategory(spisok_lotov_id, criteria_category_id);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the criteria to the database. Also notifies the appropriate model listeners.
	*
	* @param criteria the criteria
	* @return the criteria that was added
	*/
	public static tj.criterias.model.Criteria addCriteria(
		tj.criterias.model.Criteria criteria) {
		return getService().addCriteria(criteria);
	}

	/**
	* Creates a new criteria with the primary key. Does not add the criteria to the database.
	*
	* @param criteria_id the primary key for the new criteria
	* @return the new criteria
	*/
	public static tj.criterias.model.Criteria createCriteria(long criteria_id) {
		return getService().createCriteria(criteria_id);
	}

	/**
	* Deletes the criteria with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param criteria_id the primary key of the criteria
	* @return the criteria that was removed
	* @throws PortalException if a criteria with the primary key could not be found
	*/
	public static tj.criterias.model.Criteria deleteCriteria(long criteria_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCriteria(criteria_id);
	}

	/**
	* Deletes the criteria from the database. Also notifies the appropriate model listeners.
	*
	* @param criteria the criteria
	* @return the criteria that was removed
	*/
	public static tj.criterias.model.Criteria deleteCriteria(
		tj.criterias.model.Criteria criteria) {
		return getService().deleteCriteria(criteria);
	}

	public static tj.criterias.model.Criteria fetchCriteria(long criteria_id) {
		return getService().fetchCriteria(criteria_id);
	}

	/**
	* Returns the criteria with the primary key.
	*
	* @param criteria_id the primary key of the criteria
	* @return the criteria
	* @throws PortalException if a criteria with the primary key could not be found
	*/
	public static tj.criterias.model.Criteria getCriteria(long criteria_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCriteria(criteria_id);
	}

	/**
	* Updates the criteria in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param criteria the criteria
	* @return the criteria that was updated
	*/
	public static tj.criterias.model.Criteria updateCriteria(
		tj.criterias.model.Criteria criteria) {
		return getService().updateCriteria(criteria);
	}

	public static CriteriaLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CriteriaLocalService, CriteriaLocalService> _serviceTracker =
		ServiceTrackerFactory.open(CriteriaLocalService.class);
}