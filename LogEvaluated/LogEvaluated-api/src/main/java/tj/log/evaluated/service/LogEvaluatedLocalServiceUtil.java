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

package tj.log.evaluated.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for LogEvaluated. This utility wraps
 * {@link tj.log.evaluated.service.impl.LogEvaluatedLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see LogEvaluatedLocalService
 * @see tj.log.evaluated.service.base.LogEvaluatedLocalServiceBaseImpl
 * @see tj.log.evaluated.service.impl.LogEvaluatedLocalServiceImpl
 * @generated
 */
@ProviderType
public class LogEvaluatedLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.log.evaluated.service.impl.LogEvaluatedLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of log evaluateds.
	*
	* @return the number of log evaluateds
	*/
	public static int getLogEvaluatedsCount() {
		return getService().getLogEvaluatedsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.log.evaluated.model.impl.LogEvaluatedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.log.evaluated.model.impl.LogEvaluatedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the log evaluateds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.log.evaluated.model.impl.LogEvaluatedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of log evaluateds
	* @param end the upper bound of the range of log evaluateds (not inclusive)
	* @return the range of log evaluateds
	*/
	public static java.util.List<tj.log.evaluated.model.LogEvaluated> getLogEvaluateds(
		int start, int end) {
		return getService().getLogEvaluateds(start, end);
	}

	public static java.util.List<tj.log.evaluated.model.LogEvaluated> getLogEvaluation(
		long spisok_lotov_id) {
		return getService().getLogEvaluation(spisok_lotov_id);
	}

	public static java.util.List<tj.log.evaluated.model.LogEvaluated> getLogEvaluation(
		long spisok_lotov_id, long userid) {
		return getService().getLogEvaluation(spisok_lotov_id, userid);
	}

	public static java.util.List<tj.log.evaluated.model.LogEvaluated> getLogOpeningEvaluation(
		long userid, long result_opening_id) {
		return getService().getLogOpeningEvaluation(userid, result_opening_id);
	}

	public static java.util.List<tj.log.evaluated.model.LogEvaluated> getLogOpeningEvaluationBySpIdOrgId(
		long spisok_lotov_id, long organization_id) {
		return getService()
				   .getLogOpeningEvaluationBySpIdOrgId(spisok_lotov_id,
			organization_id);
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
	* Adds the log evaluated to the database. Also notifies the appropriate model listeners.
	*
	* @param logEvaluated the log evaluated
	* @return the log evaluated that was added
	*/
	public static tj.log.evaluated.model.LogEvaluated addLogEvaluated(
		tj.log.evaluated.model.LogEvaluated logEvaluated) {
		return getService().addLogEvaluated(logEvaluated);
	}

	/**
	* Creates a new log evaluated with the primary key. Does not add the log evaluated to the database.
	*
	* @param log_evaluated_id the primary key for the new log evaluated
	* @return the new log evaluated
	*/
	public static tj.log.evaluated.model.LogEvaluated createLogEvaluated(
		long log_evaluated_id) {
		return getService().createLogEvaluated(log_evaluated_id);
	}

	/**
	* Deletes the log evaluated with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param log_evaluated_id the primary key of the log evaluated
	* @return the log evaluated that was removed
	* @throws PortalException if a log evaluated with the primary key could not be found
	*/
	public static tj.log.evaluated.model.LogEvaluated deleteLogEvaluated(
		long log_evaluated_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteLogEvaluated(log_evaluated_id);
	}

	/**
	* Deletes the log evaluated from the database. Also notifies the appropriate model listeners.
	*
	* @param logEvaluated the log evaluated
	* @return the log evaluated that was removed
	*/
	public static tj.log.evaluated.model.LogEvaluated deleteLogEvaluated(
		tj.log.evaluated.model.LogEvaluated logEvaluated) {
		return getService().deleteLogEvaluated(logEvaluated);
	}

	public static tj.log.evaluated.model.LogEvaluated fetchLogEvaluated(
		long log_evaluated_id) {
		return getService().fetchLogEvaluated(log_evaluated_id);
	}

	/**
	* Returns the log evaluated with the primary key.
	*
	* @param log_evaluated_id the primary key of the log evaluated
	* @return the log evaluated
	* @throws PortalException if a log evaluated with the primary key could not be found
	*/
	public static tj.log.evaluated.model.LogEvaluated getLogEvaluated(
		long log_evaluated_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getLogEvaluated(log_evaluated_id);
	}

	public static tj.log.evaluated.model.LogEvaluated getLogEvaluated(
		long spisok_lotov_id, long organization_id, long userid) {
		return getService()
				   .getLogEvaluated(spisok_lotov_id, organization_id, userid);
	}

	/**
	* Updates the log evaluated in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param logEvaluated the log evaluated
	* @return the log evaluated that was updated
	*/
	public static tj.log.evaluated.model.LogEvaluated updateLogEvaluated(
		tj.log.evaluated.model.LogEvaluated logEvaluated) {
		return getService().updateLogEvaluated(logEvaluated);
	}

	public static LogEvaluatedLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LogEvaluatedLocalService, LogEvaluatedLocalService> _serviceTracker =
		ServiceTrackerFactory.open(LogEvaluatedLocalService.class);
}