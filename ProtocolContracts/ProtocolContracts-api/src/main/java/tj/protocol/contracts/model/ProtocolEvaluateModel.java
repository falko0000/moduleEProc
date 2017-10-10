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

import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ProtocolEvaluate service. Represents a row in the &quot;sapp.protocol_evaluate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.protocol.contracts.model.impl.ProtocolEvaluateModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.protocol.contracts.model.impl.ProtocolEvaluateImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProtocolEvaluate
 * @see tj.protocol.contracts.model.impl.ProtocolEvaluateImpl
 * @see tj.protocol.contracts.model.impl.ProtocolEvaluateModelImpl
 * @generated
 */
@ProviderType
public interface ProtocolEvaluateModel extends BaseModel<ProtocolEvaluate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a protocol evaluate model instance should use the {@link ProtocolEvaluate} interface instead.
	 */

	/**
	 * Returns the primary key of this protocol evaluate.
	 *
	 * @return the primary key of this protocol evaluate
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this protocol evaluate.
	 *
	 * @param primaryKey the primary key of this protocol evaluate
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the protocol_evaluate_id of this protocol evaluate.
	 *
	 * @return the protocol_evaluate_id of this protocol evaluate
	 */
	public long getProtocol_evaluate_id();

	/**
	 * Sets the protocol_evaluate_id of this protocol evaluate.
	 *
	 * @param protocol_evaluate_id the protocol_evaluate_id of this protocol evaluate
	 */
	public void setProtocol_evaluate_id(long protocol_evaluate_id);

	/**
	 * Returns the izvewenie_id of this protocol evaluate.
	 *
	 * @return the izvewenie_id of this protocol evaluate
	 */
	public long getIzvewenie_id();

	/**
	 * Sets the izvewenie_id of this protocol evaluate.
	 *
	 * @param izvewenie_id the izvewenie_id of this protocol evaluate
	 */
	public void setIzvewenie_id(long izvewenie_id);

	/**
	 * Returns the created of this protocol evaluate.
	 *
	 * @return the created of this protocol evaluate
	 */
	public Date getCreated();

	/**
	 * Sets the created of this protocol evaluate.
	 *
	 * @param created the created of this protocol evaluate
	 */
	public void setCreated(Date created);

	/**
	 * Returns the updated of this protocol evaluate.
	 *
	 * @return the updated of this protocol evaluate
	 */
	public Date getUpdated();

	/**
	 * Sets the updated of this protocol evaluate.
	 *
	 * @param updated the updated of this protocol evaluate
	 */
	public void setUpdated(Date updated);

	/**
	 * Returns the userid of this protocol evaluate.
	 *
	 * @return the userid of this protocol evaluate
	 */
	public long getUserid();

	/**
	 * Sets the userid of this protocol evaluate.
	 *
	 * @param userid the userid of this protocol evaluate
	 */
	public void setUserid(long userid);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		tj.protocol.contracts.model.ProtocolEvaluate protocolEvaluate);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.protocol.contracts.model.ProtocolEvaluate> toCacheModel();

	@Override
	public tj.protocol.contracts.model.ProtocolEvaluate toEscapedModel();

	@Override
	public tj.protocol.contracts.model.ProtocolEvaluate toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}