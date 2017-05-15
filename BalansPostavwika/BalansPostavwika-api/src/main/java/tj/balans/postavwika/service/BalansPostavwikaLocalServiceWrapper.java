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

package tj.balans.postavwika.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BalansPostavwikaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BalansPostavwikaLocalService
 * @generated
 */
@ProviderType
public class BalansPostavwikaLocalServiceWrapper
	implements BalansPostavwikaLocalService,
		ServiceWrapper<BalansPostavwikaLocalService> {
	public BalansPostavwikaLocalServiceWrapper(
		BalansPostavwikaLocalService balansPostavwikaLocalService) {
		_balansPostavwikaLocalService = balansPostavwikaLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _balansPostavwikaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _balansPostavwikaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _balansPostavwikaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _balansPostavwikaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _balansPostavwikaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of balans postavwikas.
	*
	* @return the number of balans postavwikas
	*/
	@Override
	public int getBalansPostavwikasCount() {
		return _balansPostavwikaLocalService.getBalansPostavwikasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _balansPostavwikaLocalService.getOSGiServiceIdentifier();
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
		return _balansPostavwikaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.balans.postavwika.model.impl.BalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _balansPostavwikaLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.balans.postavwika.model.impl.BalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _balansPostavwikaLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the balans postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.balans.postavwika.model.impl.BalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of balans postavwikas
	* @param end the upper bound of the range of balans postavwikas (not inclusive)
	* @return the range of balans postavwikas
	*/
	@Override
	public java.util.List<tj.balans.postavwika.model.BalansPostavwika> getBalansPostavwikas(
		int start, int end) {
		return _balansPostavwikaLocalService.getBalansPostavwikas(start, end);
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
		return _balansPostavwikaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _balansPostavwikaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the balans postavwika to the database. Also notifies the appropriate model listeners.
	*
	* @param balansPostavwika the balans postavwika
	* @return the balans postavwika that was added
	*/
	@Override
	public tj.balans.postavwika.model.BalansPostavwika addBalansPostavwika(
		tj.balans.postavwika.model.BalansPostavwika balansPostavwika) {
		return _balansPostavwikaLocalService.addBalansPostavwika(balansPostavwika);
	}

	/**
	* Creates a new balans postavwika with the primary key. Does not add the balans postavwika to the database.
	*
	* @param balans_postavwika_id the primary key for the new balans postavwika
	* @return the new balans postavwika
	*/
	@Override
	public tj.balans.postavwika.model.BalansPostavwika createBalansPostavwika(
		long balans_postavwika_id) {
		return _balansPostavwikaLocalService.createBalansPostavwika(balans_postavwika_id);
	}

	/**
	* Deletes the balans postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param balans_postavwika_id the primary key of the balans postavwika
	* @return the balans postavwika that was removed
	* @throws PortalException if a balans postavwika with the primary key could not be found
	*/
	@Override
	public tj.balans.postavwika.model.BalansPostavwika deleteBalansPostavwika(
		long balans_postavwika_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _balansPostavwikaLocalService.deleteBalansPostavwika(balans_postavwika_id);
	}

	/**
	* Deletes the balans postavwika from the database. Also notifies the appropriate model listeners.
	*
	* @param balansPostavwika the balans postavwika
	* @return the balans postavwika that was removed
	*/
	@Override
	public tj.balans.postavwika.model.BalansPostavwika deleteBalansPostavwika(
		tj.balans.postavwika.model.BalansPostavwika balansPostavwika) {
		return _balansPostavwikaLocalService.deleteBalansPostavwika(balansPostavwika);
	}

	@Override
	public tj.balans.postavwika.model.BalansPostavwika fetchBalansPostavwika(
		long balans_postavwika_id) {
		return _balansPostavwikaLocalService.fetchBalansPostavwika(balans_postavwika_id);
	}

	@Override
	public tj.balans.postavwika.model.BalansPostavwika getBalansPostavwik(
		long postavwik_id)
		throws tj.balans.postavwika.exception.NoSuchBalansPostavwikaException {
		return _balansPostavwikaLocalService.getBalansPostavwik(postavwik_id);
	}

	/**
	* Returns the balans postavwika with the primary key.
	*
	* @param balans_postavwika_id the primary key of the balans postavwika
	* @return the balans postavwika
	* @throws PortalException if a balans postavwika with the primary key could not be found
	*/
	@Override
	public tj.balans.postavwika.model.BalansPostavwika getBalansPostavwika(
		long balans_postavwika_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _balansPostavwikaLocalService.getBalansPostavwika(balans_postavwika_id);
	}

	/**
	* Updates the balans postavwika in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param balansPostavwika the balans postavwika
	* @return the balans postavwika that was updated
	*/
	@Override
	public tj.balans.postavwika.model.BalansPostavwika updateBalansPostavwika(
		tj.balans.postavwika.model.BalansPostavwika balansPostavwika) {
		return _balansPostavwikaLocalService.updateBalansPostavwika(balansPostavwika);
	}

	@Override
	public BalansPostavwikaLocalService getWrappedService() {
		return _balansPostavwikaLocalService;
	}

	@Override
	public void setWrappedService(
		BalansPostavwikaLocalService balansPostavwikaLocalService) {
		_balansPostavwikaLocalService = balansPostavwikaLocalService;
	}

	private BalansPostavwikaLocalService _balansPostavwikaLocalService;
}