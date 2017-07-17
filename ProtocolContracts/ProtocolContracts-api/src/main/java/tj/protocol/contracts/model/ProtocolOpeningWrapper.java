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
 * This class is a wrapper for {@link ProtocolOpening}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProtocolOpening
 * @generated
 */
@ProviderType
public class ProtocolOpeningWrapper implements ProtocolOpening,
	ModelWrapper<ProtocolOpening> {
	public ProtocolOpeningWrapper(ProtocolOpening protocolOpening) {
		_protocolOpening = protocolOpening;
	}

	@Override
	public Class<?> getModelClass() {
		return ProtocolOpening.class;
	}

	@Override
	public String getModelClassName() {
		return ProtocolOpening.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("protocol_opening_id", getProtocol_opening_id());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("created", getCreated());
		attributes.put("updated", getUpdated());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long protocol_opening_id = (Long)attributes.get("protocol_opening_id");

		if (protocol_opening_id != null) {
			setProtocol_opening_id(protocol_opening_id);
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
		return _protocolOpening.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _protocolOpening.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _protocolOpening.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _protocolOpening.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.protocol.contracts.model.ProtocolOpening> toCacheModel() {
		return _protocolOpening.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.protocol.contracts.model.ProtocolOpening protocolOpening) {
		return _protocolOpening.compareTo(protocolOpening);
	}

	@Override
	public int hashCode() {
		return _protocolOpening.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _protocolOpening.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ProtocolOpeningWrapper((ProtocolOpening)_protocolOpening.clone());
	}

	@Override
	public java.lang.String toString() {
		return _protocolOpening.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _protocolOpening.toXmlString();
	}

	/**
	* Returns the created of this protocol opening.
	*
	* @return the created of this protocol opening
	*/
	@Override
	public Date getCreated() {
		return _protocolOpening.getCreated();
	}

	/**
	* Returns the updated of this protocol opening.
	*
	* @return the updated of this protocol opening
	*/
	@Override
	public Date getUpdated() {
		return _protocolOpening.getUpdated();
	}

	/**
	* Returns the izvewenie_id of this protocol opening.
	*
	* @return the izvewenie_id of this protocol opening
	*/
	@Override
	public long getIzvewenie_id() {
		return _protocolOpening.getIzvewenie_id();
	}

	/**
	* Returns the primary key of this protocol opening.
	*
	* @return the primary key of this protocol opening
	*/
	@Override
	public long getPrimaryKey() {
		return _protocolOpening.getPrimaryKey();
	}

	/**
	* Returns the protocol_opening_id of this protocol opening.
	*
	* @return the protocol_opening_id of this protocol opening
	*/
	@Override
	public long getProtocol_opening_id() {
		return _protocolOpening.getProtocol_opening_id();
	}

	@Override
	public tj.protocol.contracts.model.ProtocolOpening toEscapedModel() {
		return new ProtocolOpeningWrapper(_protocolOpening.toEscapedModel());
	}

	@Override
	public tj.protocol.contracts.model.ProtocolOpening toUnescapedModel() {
		return new ProtocolOpeningWrapper(_protocolOpening.toUnescapedModel());
	}

	@Override
	public void persist() {
		_protocolOpening.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_protocolOpening.setCachedModel(cachedModel);
	}

	/**
	* Sets the created of this protocol opening.
	*
	* @param created the created of this protocol opening
	*/
	@Override
	public void setCreated(Date created) {
		_protocolOpening.setCreated(created);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_protocolOpening.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_protocolOpening.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_protocolOpening.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izvewenie_id of this protocol opening.
	*
	* @param izvewenie_id the izvewenie_id of this protocol opening
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_protocolOpening.setIzvewenie_id(izvewenie_id);
	}

	@Override
	public void setNew(boolean n) {
		_protocolOpening.setNew(n);
	}

	/**
	* Sets the primary key of this protocol opening.
	*
	* @param primaryKey the primary key of this protocol opening
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_protocolOpening.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_protocolOpening.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the protocol_opening_id of this protocol opening.
	*
	* @param protocol_opening_id the protocol_opening_id of this protocol opening
	*/
	@Override
	public void setProtocol_opening_id(long protocol_opening_id) {
		_protocolOpening.setProtocol_opening_id(protocol_opening_id);
	}

	/**
	* Sets the updated of this protocol opening.
	*
	* @param updated the updated of this protocol opening
	*/
	@Override
	public void setUpdated(Date updated) {
		_protocolOpening.setUpdated(updated);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProtocolOpeningWrapper)) {
			return false;
		}

		ProtocolOpeningWrapper protocolOpeningWrapper = (ProtocolOpeningWrapper)obj;

		if (Objects.equals(_protocolOpening,
					protocolOpeningWrapper._protocolOpening)) {
			return true;
		}

		return false;
	}

	@Override
	public ProtocolOpening getWrappedModel() {
		return _protocolOpening;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _protocolOpening.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _protocolOpening.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_protocolOpening.resetOriginalValues();
	}

	private final ProtocolOpening _protocolOpening;
}