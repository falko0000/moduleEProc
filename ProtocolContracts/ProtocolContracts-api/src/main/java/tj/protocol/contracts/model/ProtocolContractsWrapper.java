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

package tj.protocol.contracts.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link ProtocolContracts}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProtocolContracts
 * @generated
 */
@ProviderType
public class ProtocolContractsWrapper implements ProtocolContracts,
	ModelWrapper<ProtocolContracts> {
	public ProtocolContractsWrapper(ProtocolContracts protocolContracts) {
		_protocolContracts = protocolContracts;
	}

	@Override
	public Class<?> getModelClass() {
		return ProtocolContracts.class;
	}

	@Override
	public String getModelClassName() {
		return ProtocolContracts.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("protocol_contracts_id", getProtocol_contracts_id());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("created", getCreated());
		attributes.put("updated", getUpdated());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long protocol_contracts_id = (Long)attributes.get(
				"protocol_contracts_id");

		if (protocol_contracts_id != null) {
			setProtocol_contracts_id(protocol_contracts_id);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		Date created = (Date)attributes.get("created");

		if (created != null) {
			setCreated(created);
		}

		Date updated = (Date)attributes.get("updated");

		if (updated != null) {
			setUpdated(updated);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _protocolContracts.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _protocolContracts.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _protocolContracts.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _protocolContracts.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.protocol.contracts.model.ProtocolContracts> toCacheModel() {
		return _protocolContracts.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.protocol.contracts.model.ProtocolContracts protocolContracts) {
		return _protocolContracts.compareTo(protocolContracts);
	}

	@Override
	public int hashCode() {
		return _protocolContracts.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _protocolContracts.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ProtocolContractsWrapper((ProtocolContracts)_protocolContracts.clone());
	}

	@Override
	public java.lang.String toString() {
		return _protocolContracts.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _protocolContracts.toXmlString();
	}

	/**
	* Returns the created of this protocol contracts.
	*
	* @return the created of this protocol contracts
	*/
	@Override
	public Date getCreated() {
		return _protocolContracts.getCreated();
	}

	/**
	* Returns the updated of this protocol contracts.
	*
	* @return the updated of this protocol contracts
	*/
	@Override
	public Date getUpdated() {
		return _protocolContracts.getUpdated();
	}

	/**
	* Returns the izvewenie_id of this protocol contracts.
	*
	* @return the izvewenie_id of this protocol contracts
	*/
	@Override
	public long getIzvewenie_id() {
		return _protocolContracts.getIzvewenie_id();
	}

	/**
	* Returns the primary key of this protocol contracts.
	*
	* @return the primary key of this protocol contracts
	*/
	@Override
	public long getPrimaryKey() {
		return _protocolContracts.getPrimaryKey();
	}

	/**
	* Returns the protocol_contracts_id of this protocol contracts.
	*
	* @return the protocol_contracts_id of this protocol contracts
	*/
	@Override
	public long getProtocol_contracts_id() {
		return _protocolContracts.getProtocol_contracts_id();
	}

	@Override
	public tj.protocol.contracts.model.ProtocolContracts toEscapedModel() {
		return new ProtocolContractsWrapper(_protocolContracts.toEscapedModel());
	}

	@Override
	public tj.protocol.contracts.model.ProtocolContracts toUnescapedModel() {
		return new ProtocolContractsWrapper(_protocolContracts.toUnescapedModel());
	}

	@Override
	public void persist() {
		_protocolContracts.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_protocolContracts.setCachedModel(cachedModel);
	}

	/**
	* Sets the created of this protocol contracts.
	*
	* @param created the created of this protocol contracts
	*/
	@Override
	public void setCreated(Date created) {
		_protocolContracts.setCreated(created);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_protocolContracts.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_protocolContracts.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_protocolContracts.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izvewenie_id of this protocol contracts.
	*
	* @param izvewenie_id the izvewenie_id of this protocol contracts
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_protocolContracts.setIzvewenie_id(izvewenie_id);
	}

	@Override
	public void setNew(boolean n) {
		_protocolContracts.setNew(n);
	}

	/**
	* Sets the primary key of this protocol contracts.
	*
	* @param primaryKey the primary key of this protocol contracts
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_protocolContracts.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_protocolContracts.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the protocol_contracts_id of this protocol contracts.
	*
	* @param protocol_contracts_id the protocol_contracts_id of this protocol contracts
	*/
	@Override
	public void setProtocol_contracts_id(long protocol_contracts_id) {
		_protocolContracts.setProtocol_contracts_id(protocol_contracts_id);
	}

	/**
	* Sets the updated of this protocol contracts.
	*
	* @param updated the updated of this protocol contracts
	*/
	@Override
	public void setUpdated(Date updated) {
		_protocolContracts.setUpdated(updated);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProtocolContractsWrapper)) {
			return false;
		}

		ProtocolContractsWrapper protocolContractsWrapper = (ProtocolContractsWrapper)obj;

		if (Objects.equals(_protocolContracts,
					protocolContractsWrapper._protocolContracts)) {
			return true;
		}

		return false;
	}

	@Override
	public ProtocolContracts getWrappedModel() {
		return _protocolContracts;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _protocolContracts.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _protocolContracts.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_protocolContracts.resetOriginalValues();
	}

	private final ProtocolContracts _protocolContracts;
}