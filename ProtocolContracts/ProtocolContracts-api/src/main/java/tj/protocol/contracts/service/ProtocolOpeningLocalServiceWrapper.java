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

package tj.protocol.contracts.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProtocolOpeningLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProtocolOpeningLocalService
 * @generated
 */
@ProviderType
public class ProtocolOpeningLocalServiceWrapper
	implements ProtocolOpeningLocalService,
		ServiceWrapper<ProtocolOpeningLocalService> {
	public ProtocolOpeningLocalServiceWrapper(
		ProtocolOpeningLocalService protocolOpeningLocalService) {
		_protocolOpeningLocalService = protocolOpeningLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _protocolOpeningLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _protocolOpeningLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _protocolOpeningLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _protocolOpeningLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _protocolOpeningLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of protocol openings.
	*
	* @return the number of protocol openings
	*/
	@Override
	public int getProtocolOpeningsCount() {
		return _protocolOpeningLocalService.getProtocolOpeningsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _protocolOpeningLocalService.getOSGiServiceIdentifier();
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
		return _protocolOpeningLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protocol.contracts.model.impl.ProtocolOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _protocolOpeningLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protocol.contracts.model.impl.ProtocolOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _protocolOpeningLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the protocol openings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protocol.contracts.model.impl.ProtocolOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protocol openings
	* @param end the upper bound of the range of protocol openings (not inclusive)
	* @return the range of protocol openings
	*/
	@Override
	public java.util.List<tj.protocol.contracts.model.ProtocolOpening> getProtocolOpenings(
		int start, int end) {
		return _protocolOpeningLocalService.getProtocolOpenings(start, end);
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
		return _protocolOpeningLocalService.dynamicQueryCount(dynamicQuery);
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
		return _protocolOpeningLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the protocol opening to the database. Also notifies the appropriate model listeners.
	*
	* @param protocolOpening the protocol opening
	* @return the protocol opening that was added
	*/
	@Override
	public tj.protocol.contracts.model.ProtocolOpening addProtocolOpening(
		tj.protocol.contracts.model.ProtocolOpening protocolOpening) {
		return _protocolOpeningLocalService.addProtocolOpening(protocolOpening);
	}

	/**
	* Creates a new protocol opening with the primary key. Does not add the protocol opening to the database.
	*
	* @param protocol_opening_id the primary key for the new protocol opening
	* @return the new protocol opening
	*/
	@Override
	public tj.protocol.contracts.model.ProtocolOpening createProtocolOpening(
		long protocol_opening_id) {
		return _protocolOpeningLocalService.createProtocolOpening(protocol_opening_id);
	}

	/**
	* Deletes the protocol opening with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param protocol_opening_id the primary key of the protocol opening
	* @return the protocol opening that was removed
	* @throws PortalException if a protocol opening with the primary key could not be found
	*/
	@Override
	public tj.protocol.contracts.model.ProtocolOpening deleteProtocolOpening(
		long protocol_opening_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _protocolOpeningLocalService.deleteProtocolOpening(protocol_opening_id);
	}

	/**
	* Deletes the protocol opening from the database. Also notifies the appropriate model listeners.
	*
	* @param protocolOpening the protocol opening
	* @return the protocol opening that was removed
	*/
	@Override
	public tj.protocol.contracts.model.ProtocolOpening deleteProtocolOpening(
		tj.protocol.contracts.model.ProtocolOpening protocolOpening) {
		return _protocolOpeningLocalService.deleteProtocolOpening(protocolOpening);
	}

	@Override
	public tj.protocol.contracts.model.ProtocolOpening fetchProtocolOpening(
		long protocol_opening_id) {
		return _protocolOpeningLocalService.fetchProtocolOpening(protocol_opening_id);
	}

	/**
	* Returns the protocol opening with the primary key.
	*
	* @param protocol_opening_id the primary key of the protocol opening
	* @return the protocol opening
	* @throws PortalException if a protocol opening with the primary key could not be found
	*/
	@Override
	public tj.protocol.contracts.model.ProtocolOpening getProtocolOpening(
		long protocol_opening_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _protocolOpeningLocalService.getProtocolOpening(protocol_opening_id);
	}

	@Override
	public tj.protocol.contracts.model.ProtocolOpening getProtocolOpeningByBid(
		long izvewenie_id) {
		return _protocolOpeningLocalService.getProtocolOpeningByBid(izvewenie_id);
	}

	/**
	* Updates the protocol opening in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param protocolOpening the protocol opening
	* @return the protocol opening that was updated
	*/
	@Override
	public tj.protocol.contracts.model.ProtocolOpening updateProtocolOpening(
		tj.protocol.contracts.model.ProtocolOpening protocolOpening) {
		return _protocolOpeningLocalService.updateProtocolOpening(protocolOpening);
	}

	@Override
	public ProtocolOpeningLocalService getWrappedService() {
		return _protocolOpeningLocalService;
	}

	@Override
	public void setWrappedService(
		ProtocolOpeningLocalService protocolOpeningLocalService) {
		_protocolOpeningLocalService = protocolOpeningLocalService;
	}

	private ProtocolOpeningLocalService _protocolOpeningLocalService;
}