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

package tj.result.opening.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ResultOpeningLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ResultOpeningLocalService
 * @generated
 */
@ProviderType
public class ResultOpeningLocalServiceWrapper
	implements ResultOpeningLocalService,
		ServiceWrapper<ResultOpeningLocalService> {
	public ResultOpeningLocalServiceWrapper(
		ResultOpeningLocalService resultOpeningLocalService) {
		_resultOpeningLocalService = resultOpeningLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _resultOpeningLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _resultOpeningLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _resultOpeningLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _resultOpeningLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _resultOpeningLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of result openings.
	*
	* @return the number of result openings
	*/
	@Override
	public int getResultOpeningsCount() {
		return _resultOpeningLocalService.getResultOpeningsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _resultOpeningLocalService.getOSGiServiceIdentifier();
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
		return _resultOpeningLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.result.opening.model.impl.ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _resultOpeningLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.result.opening.model.impl.ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _resultOpeningLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the result openings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.result.opening.model.impl.ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of result openings
	* @param end the upper bound of the range of result openings (not inclusive)
	* @return the range of result openings
	*/
	@Override
	public java.util.List<tj.result.opening.model.ResultOpening> getResultOpenings(
		int start, int end) {
		return _resultOpeningLocalService.getResultOpenings(start, end);
	}

	@Override
	public java.util.List<tj.result.opening.model.ResultOpening> getResultOpenings(
		long spisok_lotov_id, int status) {
		return _resultOpeningLocalService.getResultOpenings(spisok_lotov_id,
			status);
	}

	@Override
	public java.util.List<tj.result.opening.model.ResultOpening> getResultOpeningsByLotId(
		long spisok_lotov_id) {
		return _resultOpeningLocalService.getResultOpeningsByLotId(spisok_lotov_id);
	}

	@Override
	public java.util.List<tj.result.opening.model.ResultOpening> getResultOpeningsByProtocolOpeningId(
		long protocol_opening_id) {
		return _resultOpeningLocalService.getResultOpeningsByProtocolOpeningId(protocol_opening_id);
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
		return _resultOpeningLocalService.dynamicQueryCount(dynamicQuery);
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
		return _resultOpeningLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the result opening to the database. Also notifies the appropriate model listeners.
	*
	* @param resultOpening the result opening
	* @return the result opening that was added
	*/
	@Override
	public tj.result.opening.model.ResultOpening addResultOpening(
		tj.result.opening.model.ResultOpening resultOpening) {
		return _resultOpeningLocalService.addResultOpening(resultOpening);
	}

	/**
	* Creates a new result opening with the primary key. Does not add the result opening to the database.
	*
	* @param result_opening_id the primary key for the new result opening
	* @return the new result opening
	*/
	@Override
	public tj.result.opening.model.ResultOpening createResultOpening(
		long result_opening_id) {
		return _resultOpeningLocalService.createResultOpening(result_opening_id);
	}

	/**
	* Deletes the result opening with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param result_opening_id the primary key of the result opening
	* @return the result opening that was removed
	* @throws PortalException if a result opening with the primary key could not be found
	*/
	@Override
	public tj.result.opening.model.ResultOpening deleteResultOpening(
		long result_opening_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _resultOpeningLocalService.deleteResultOpening(result_opening_id);
	}

	/**
	* Deletes the result opening from the database. Also notifies the appropriate model listeners.
	*
	* @param resultOpening the result opening
	* @return the result opening that was removed
	*/
	@Override
	public tj.result.opening.model.ResultOpening deleteResultOpening(
		tj.result.opening.model.ResultOpening resultOpening) {
		return _resultOpeningLocalService.deleteResultOpening(resultOpening);
	}

	@Override
	public tj.result.opening.model.ResultOpening fetchResultOpening(
		long result_opening_id) {
		return _resultOpeningLocalService.fetchResultOpening(result_opening_id);
	}

	/**
	* Returns the result opening with the primary key.
	*
	* @param result_opening_id the primary key of the result opening
	* @return the result opening
	* @throws PortalException if a result opening with the primary key could not be found
	*/
	@Override
	public tj.result.opening.model.ResultOpening getResultOpening(
		long result_opening_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _resultOpeningLocalService.getResultOpening(result_opening_id);
	}

	@Override
	public tj.result.opening.model.ResultOpening getResultOpening(
		long spisok_lotov_id, long postavwik_id) {
		return _resultOpeningLocalService.getResultOpening(spisok_lotov_id,
			postavwik_id);
	}

	/**
	* Updates the result opening in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resultOpening the result opening
	* @return the result opening that was updated
	*/
	@Override
	public tj.result.opening.model.ResultOpening updateResultOpening(
		tj.result.opening.model.ResultOpening resultOpening) {
		return _resultOpeningLocalService.updateResultOpening(resultOpening);
	}

	@Override
	public ResultOpeningLocalService getWrappedService() {
		return _resultOpeningLocalService;
	}

	@Override
	public void setWrappedService(
		ResultOpeningLocalService resultOpeningLocalService) {
		_resultOpeningLocalService = resultOpeningLocalService;
	}

	private ResultOpeningLocalService _resultOpeningLocalService;
}