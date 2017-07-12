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
 * Provides a wrapper for {@link ProtocolContractsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProtocolContractsLocalService
 * @generated
 */
@ProviderType
public class ProtocolContractsLocalServiceWrapper
	implements ProtocolContractsLocalService,
		ServiceWrapper<ProtocolContractsLocalService> {
	public ProtocolContractsLocalServiceWrapper(
		ProtocolContractsLocalService protocolContractsLocalService) {
		_protocolContractsLocalService = protocolContractsLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _protocolContractsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _protocolContractsLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _protocolContractsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _protocolContractsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _protocolContractsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of protocol contractses.
	*
	* @return the number of protocol contractses
	*/
	@Override
	public int getProtocolContractsesCount() {
		return _protocolContractsLocalService.getProtocolContractsesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _protocolContractsLocalService.getOSGiServiceIdentifier();
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
		return _protocolContractsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protocol.contracts.model.impl.ProtocolContractsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _protocolContractsLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protocol.contracts.model.impl.ProtocolContractsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _protocolContractsLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the protocol contractses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protocol.contracts.model.impl.ProtocolContractsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protocol contractses
	* @param end the upper bound of the range of protocol contractses (not inclusive)
	* @return the range of protocol contractses
	*/
	@Override
	public java.util.List<tj.protocol.contracts.model.ProtocolContracts> getProtocolContractses(
		int start, int end) {
		return _protocolContractsLocalService.getProtocolContractses(start, end);
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
		return _protocolContractsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _protocolContractsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the protocol contracts to the database. Also notifies the appropriate model listeners.
	*
	* @param protocolContracts the protocol contracts
	* @return the protocol contracts that was added
	*/
	@Override
	public tj.protocol.contracts.model.ProtocolContracts addProtocolContracts(
		tj.protocol.contracts.model.ProtocolContracts protocolContracts) {
		return _protocolContractsLocalService.addProtocolContracts(protocolContracts);
	}

	/**
	* Creates a new protocol contracts with the primary key. Does not add the protocol contracts to the database.
	*
	* @param protocol_contracts_id the primary key for the new protocol contracts
	* @return the new protocol contracts
	*/
	@Override
	public tj.protocol.contracts.model.ProtocolContracts createProtocolContracts(
		long protocol_contracts_id) {
		return _protocolContractsLocalService.createProtocolContracts(protocol_contracts_id);
	}

	/**
	* Deletes the protocol contracts with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param protocol_contracts_id the primary key of the protocol contracts
	* @return the protocol contracts that was removed
	* @throws PortalException if a protocol contracts with the primary key could not be found
	*/
	@Override
	public tj.protocol.contracts.model.ProtocolContracts deleteProtocolContracts(
		long protocol_contracts_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _protocolContractsLocalService.deleteProtocolContracts(protocol_contracts_id);
	}

	/**
	* Deletes the protocol contracts from the database. Also notifies the appropriate model listeners.
	*
	* @param protocolContracts the protocol contracts
	* @return the protocol contracts that was removed
	*/
	@Override
	public tj.protocol.contracts.model.ProtocolContracts deleteProtocolContracts(
		tj.protocol.contracts.model.ProtocolContracts protocolContracts) {
		return _protocolContractsLocalService.deleteProtocolContracts(protocolContracts);
	}

	@Override
	public tj.protocol.contracts.model.ProtocolContracts fetchProtocolContracts(
		long protocol_contracts_id) {
		return _protocolContractsLocalService.fetchProtocolContracts(protocol_contracts_id);
	}

	/**
	* Returns the protocol contracts with the primary key.
	*
	* @param protocol_contracts_id the primary key of the protocol contracts
	* @return the protocol contracts
	* @throws PortalException if a protocol contracts with the primary key could not be found
	*/
	@Override
	public tj.protocol.contracts.model.ProtocolContracts getProtocolContracts(
		long protocol_contracts_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _protocolContractsLocalService.getProtocolContracts(protocol_contracts_id);
	}

	@Override
	public tj.protocol.contracts.model.ProtocolContracts getProtocolContractsByBid(
		long izvewenie_id) {
		return _protocolContractsLocalService.getProtocolContractsByBid(izvewenie_id);
	}

	/**
	* Updates the protocol contracts in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param protocolContracts the protocol contracts
	* @return the protocol contracts that was updated
	*/
	@Override
	public tj.protocol.contracts.model.ProtocolContracts updateProtocolContracts(
		tj.protocol.contracts.model.ProtocolContracts protocolContracts) {
		return _protocolContractsLocalService.updateProtocolContracts(protocolContracts);
	}

	@Override
	public ProtocolContractsLocalService getWrappedService() {
		return _protocolContractsLocalService;
	}

	@Override
	public void setWrappedService(
		ProtocolContractsLocalService protocolContractsLocalService) {
		_protocolContractsLocalService = protocolContractsLocalService;
	}

	private ProtocolContractsLocalService _protocolContractsLocalService;
}