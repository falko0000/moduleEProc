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
 * This class is a wrapper for {@link ProtocolEvaluate}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProtocolEvaluate
 * @generated
 */
@ProviderType
public class ProtocolEvaluateWrapper implements ProtocolEvaluate,
	ModelWrapper<ProtocolEvaluate> {
	public ProtocolEvaluateWrapper(ProtocolEvaluate protocolEvaluate) {
		_protocolEvaluate = protocolEvaluate;
	}

	@Override
	public Class<?> getModelClass() {
		return ProtocolEvaluate.class;
	}

	@Override
	public String getModelClassName() {
		return ProtocolEvaluate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("protocol_evaluate_id", getProtocol_evaluate_id());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("created", getCreated());
		attributes.put("updated", getUpdated());
		attributes.put("userid", getUserid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long protocol_evaluate_id = (Long)attributes.get("protocol_evaluate_id");

		if (protocol_evaluate_id != null) {
			setProtocol_evaluate_id(protocol_evaluate_id);
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

		Long userid = (Long)attributes.get("userid");

		if (userid != null) {
			setUserid(userid);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _protocolEvaluate.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _protocolEvaluate.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _protocolEvaluate.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _protocolEvaluate.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.protocol.contracts.model.ProtocolEvaluate> toCacheModel() {
		return _protocolEvaluate.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.protocol.contracts.model.ProtocolEvaluate protocolEvaluate) {
		return _protocolEvaluate.compareTo(protocolEvaluate);
	}

	@Override
	public int hashCode() {
		return _protocolEvaluate.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _protocolEvaluate.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ProtocolEvaluateWrapper((ProtocolEvaluate)_protocolEvaluate.clone());
	}

	@Override
	public java.lang.String toString() {
		return _protocolEvaluate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _protocolEvaluate.toXmlString();
	}

	/**
	* Returns the created of this protocol evaluate.
	*
	* @return the created of this protocol evaluate
	*/
	@Override
	public Date getCreated() {
		return _protocolEvaluate.getCreated();
	}

	/**
	* Returns the updated of this protocol evaluate.
	*
	* @return the updated of this protocol evaluate
	*/
	@Override
	public Date getUpdated() {
		return _protocolEvaluate.getUpdated();
	}

	/**
	* Returns the izvewenie_id of this protocol evaluate.
	*
	* @return the izvewenie_id of this protocol evaluate
	*/
	@Override
	public long getIzvewenie_id() {
		return _protocolEvaluate.getIzvewenie_id();
	}

	/**
	* Returns the primary key of this protocol evaluate.
	*
	* @return the primary key of this protocol evaluate
	*/
	@Override
	public long getPrimaryKey() {
		return _protocolEvaluate.getPrimaryKey();
	}

	/**
	* Returns the protocol_evaluate_id of this protocol evaluate.
	*
	* @return the protocol_evaluate_id of this protocol evaluate
	*/
	@Override
	public long getProtocol_evaluate_id() {
		return _protocolEvaluate.getProtocol_evaluate_id();
	}

	/**
	* Returns the userid of this protocol evaluate.
	*
	* @return the userid of this protocol evaluate
	*/
	@Override
	public long getUserid() {
		return _protocolEvaluate.getUserid();
	}

	@Override
	public tj.protocol.contracts.model.ProtocolEvaluate toEscapedModel() {
		return new ProtocolEvaluateWrapper(_protocolEvaluate.toEscapedModel());
	}

	@Override
	public tj.protocol.contracts.model.ProtocolEvaluate toUnescapedModel() {
		return new ProtocolEvaluateWrapper(_protocolEvaluate.toUnescapedModel());
	}

	@Override
	public void persist() {
		_protocolEvaluate.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_protocolEvaluate.setCachedModel(cachedModel);
	}

	/**
	* Sets the created of this protocol evaluate.
	*
	* @param created the created of this protocol evaluate
	*/
	@Override
	public void setCreated(Date created) {
		_protocolEvaluate.setCreated(created);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_protocolEvaluate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_protocolEvaluate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_protocolEvaluate.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izvewenie_id of this protocol evaluate.
	*
	* @param izvewenie_id the izvewenie_id of this protocol evaluate
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_protocolEvaluate.setIzvewenie_id(izvewenie_id);
	}

	@Override
	public void setNew(boolean n) {
		_protocolEvaluate.setNew(n);
	}

	/**
	* Sets the primary key of this protocol evaluate.
	*
	* @param primaryKey the primary key of this protocol evaluate
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_protocolEvaluate.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_protocolEvaluate.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the protocol_evaluate_id of this protocol evaluate.
	*
	* @param protocol_evaluate_id the protocol_evaluate_id of this protocol evaluate
	*/
	@Override
	public void setProtocol_evaluate_id(long protocol_evaluate_id) {
		_protocolEvaluate.setProtocol_evaluate_id(protocol_evaluate_id);
	}

	/**
	* Sets the updated of this protocol evaluate.
	*
	* @param updated the updated of this protocol evaluate
	*/
	@Override
	public void setUpdated(Date updated) {
		_protocolEvaluate.setUpdated(updated);
	}

	/**
	* Sets the userid of this protocol evaluate.
	*
	* @param userid the userid of this protocol evaluate
	*/
	@Override
	public void setUserid(long userid) {
		_protocolEvaluate.setUserid(userid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProtocolEvaluateWrapper)) {
			return false;
		}

		ProtocolEvaluateWrapper protocolEvaluateWrapper = (ProtocolEvaluateWrapper)obj;

		if (Objects.equals(_protocolEvaluate,
					protocolEvaluateWrapper._protocolEvaluate)) {
			return true;
		}

		return false;
	}

	@Override
	public ProtocolEvaluate getWrappedModel() {
		return _protocolEvaluate;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _protocolEvaluate.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _protocolEvaluate.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_protocolEvaluate.resetOriginalValues();
	}

	private final ProtocolEvaluate _protocolEvaluate;
}