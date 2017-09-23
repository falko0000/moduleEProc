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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LogEvaluatedLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LogEvaluatedLocalService
 * @generated
 */
@ProviderType
public class LogEvaluatedLocalServiceWrapper implements LogEvaluatedLocalService,
	ServiceWrapper<LogEvaluatedLocalService> {
	public LogEvaluatedLocalServiceWrapper(
		LogEvaluatedLocalService logEvaluatedLocalService) {
		_logEvaluatedLocalService = logEvaluatedLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _logEvaluatedLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _logEvaluatedLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _logEvaluatedLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _logEvaluatedLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _logEvaluatedLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of log evaluateds.
	*
	* @return the number of log evaluateds
	*/
	@Override
	public int getLogEvaluatedsCount() {
		return _logEvaluatedLocalService.getLogEvaluatedsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _logEvaluatedLocalService.getOSGiServiceIdentifier();
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
		return _logEvaluatedLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _logEvaluatedLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _logEvaluatedLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
	@Override
	public java.util.List<tj.log.evaluated.model.LogEvaluated> getLogEvaluateds(
		int start, int end) {
		return _logEvaluatedLocalService.getLogEvaluateds(start, end);
	}

	@Override
	public java.util.List<tj.log.evaluated.model.LogEvaluated> getLogEvaluation(
		long spisok_lotov_id) {
		return _logEvaluatedLocalService.getLogEvaluation(spisok_lotov_id);
	}

	@Override
	public java.util.List<tj.log.evaluated.model.LogEvaluated> getLogEvaluation(
		long spisok_lotov_id, long userid) {
		return _logEvaluatedLocalService.getLogEvaluation(spisok_lotov_id,
			userid);
	}

	@Override
	public java.util.List<tj.log.evaluated.model.LogEvaluated> getLogOpeningEvaluation(
		long userid, long result_opening_id) {
		return _logEvaluatedLocalService.getLogOpeningEvaluation(userid,
			result_opening_id);
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
		return _logEvaluatedLocalService.dynamicQueryCount(dynamicQuery);
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
		return _logEvaluatedLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the log evaluated to the database. Also notifies the appropriate model listeners.
	*
	* @param logEvaluated the log evaluated
	* @return the log evaluated that was added
	*/
	@Override
	public tj.log.evaluated.model.LogEvaluated addLogEvaluated(
		tj.log.evaluated.model.LogEvaluated logEvaluated) {
		return _logEvaluatedLocalService.addLogEvaluated(logEvaluated);
	}

	/**
	* Creates a new log evaluated with the primary key. Does not add the log evaluated to the database.
	*
	* @param log_evaluated_id the primary key for the new log evaluated
	* @return the new log evaluated
	*/
	@Override
	public tj.log.evaluated.model.LogEvaluated createLogEvaluated(
		long log_evaluated_id) {
		return _logEvaluatedLocalService.createLogEvaluated(log_evaluated_id);
	}

	/**
	* Deletes the log evaluated with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param log_evaluated_id the primary key of the log evaluated
	* @return the log evaluated that was removed
	* @throws PortalException if a log evaluated with the primary key could not be found
	*/
	@Override
	public tj.log.evaluated.model.LogEvaluated deleteLogEvaluated(
		long log_evaluated_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _logEvaluatedLocalService.deleteLogEvaluated(log_evaluated_id);
	}

	/**
	* Deletes the log evaluated from the database. Also notifies the appropriate model listeners.
	*
	* @param logEvaluated the log evaluated
	* @return the log evaluated that was removed
	*/
	@Override
	public tj.log.evaluated.model.LogEvaluated deleteLogEvaluated(
		tj.log.evaluated.model.LogEvaluated logEvaluated) {
		return _logEvaluatedLocalService.deleteLogEvaluated(logEvaluated);
	}

	@Override
	public tj.log.evaluated.model.LogEvaluated fetchLogEvaluated(
		long log_evaluated_id) {
		return _logEvaluatedLocalService.fetchLogEvaluated(log_evaluated_id);
	}

	/**
	* Returns the log evaluated with the primary key.
	*
	* @param log_evaluated_id the primary key of the log evaluated
	* @return the log evaluated
	* @throws PortalException if a log evaluated with the primary key could not be found
	*/
	@Override
	public tj.log.evaluated.model.LogEvaluated getLogEvaluated(
		long log_evaluated_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _logEvaluatedLocalService.getLogEvaluated(log_evaluated_id);
	}

	@Override
	public tj.log.evaluated.model.LogEvaluated getLogEvaluated(
		long spisok_lotov_id, long organization_id, long userid) {
		return _logEvaluatedLocalService.getLogEvaluated(spisok_lotov_id,
			organization_id, userid);
	}

	/**
	* Updates the log evaluated in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param logEvaluated the log evaluated
	* @return the log evaluated that was updated
	*/
	@Override
	public tj.log.evaluated.model.LogEvaluated updateLogEvaluated(
		tj.log.evaluated.model.LogEvaluated logEvaluated) {
		return _logEvaluatedLocalService.updateLogEvaluated(logEvaluated);
	}

	@Override
	public LogEvaluatedLocalService getWrappedService() {
		return _logEvaluatedLocalService;
	}

	@Override
	public void setWrappedService(
		LogEvaluatedLocalService logEvaluatedLocalService) {
		_logEvaluatedLocalService = logEvaluatedLocalService;
	}

	private LogEvaluatedLocalService _logEvaluatedLocalService;
}