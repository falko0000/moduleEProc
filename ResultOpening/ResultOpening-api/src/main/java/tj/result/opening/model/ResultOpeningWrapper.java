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

package tj.result.opening.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link ResultOpening}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ResultOpening
 * @generated
 */
@ProviderType
public class ResultOpeningWrapper implements ResultOpening,
	ModelWrapper<ResultOpening> {
	public ResultOpeningWrapper(ResultOpening resultOpening) {
		_resultOpening = resultOpening;
	}

	@Override
	public Class<?> getModelClass() {
		return ResultOpening.class;
	}

	@Override
	public String getModelClassName() {
		return ResultOpening.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("result_opening_id", getResult_opening_id());
		attributes.put("spisok_lotov_id", getSpisok_lotov_id());
		attributes.put("protocol_opening_id", getProtocol_opening_id());
		attributes.put("postavwik_id", getPostavwik_id());
		attributes.put("status", getStatus());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long result_opening_id = (Long)attributes.get("result_opening_id");

		if (result_opening_id != null) {
			setResult_opening_id(result_opening_id);
		}

		Long spisok_lotov_id = (Long)attributes.get("spisok_lotov_id");

		if (spisok_lotov_id != null) {
			setSpisok_lotov_id(spisok_lotov_id);
		}

		Long protocol_opening_id = (Long)attributes.get("protocol_opening_id");

		if (protocol_opening_id != null) {
			setProtocol_opening_id(protocol_opening_id);
		}

		Long postavwik_id = (Long)attributes.get("postavwik_id");

		if (postavwik_id != null) {
			setPostavwik_id(postavwik_id);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _resultOpening.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _resultOpening.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _resultOpening.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _resultOpening.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.result.opening.model.ResultOpening> toCacheModel() {
		return _resultOpening.toCacheModel();
	}

	@Override
	public int compareTo(tj.result.opening.model.ResultOpening resultOpening) {
		return _resultOpening.compareTo(resultOpening);
	}

	/**
	* Returns the status of this result opening.
	*
	* @return the status of this result opening
	*/
	@Override
	public int getStatus() {
		return _resultOpening.getStatus();
	}

	@Override
	public int hashCode() {
		return _resultOpening.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _resultOpening.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ResultOpeningWrapper((ResultOpening)_resultOpening.clone());
	}

	/**
	* Returns the description of this result opening.
	*
	* @return the description of this result opening
	*/
	@Override
	public java.lang.String getDescription() {
		return _resultOpening.getDescription();
	}

	@Override
	public java.lang.String toString() {
		return _resultOpening.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _resultOpening.toXmlString();
	}

	/**
	* Returns the postavwik_id of this result opening.
	*
	* @return the postavwik_id of this result opening
	*/
	@Override
	public long getPostavwik_id() {
		return _resultOpening.getPostavwik_id();
	}

	/**
	* Returns the primary key of this result opening.
	*
	* @return the primary key of this result opening
	*/
	@Override
	public long getPrimaryKey() {
		return _resultOpening.getPrimaryKey();
	}

	/**
	* Returns the protocol_opening_id of this result opening.
	*
	* @return the protocol_opening_id of this result opening
	*/
	@Override
	public long getProtocol_opening_id() {
		return _resultOpening.getProtocol_opening_id();
	}

	/**
	* Returns the result_opening_id of this result opening.
	*
	* @return the result_opening_id of this result opening
	*/
	@Override
	public long getResult_opening_id() {
		return _resultOpening.getResult_opening_id();
	}

	/**
	* Returns the spisok_lotov_id of this result opening.
	*
	* @return the spisok_lotov_id of this result opening
	*/
	@Override
	public long getSpisok_lotov_id() {
		return _resultOpening.getSpisok_lotov_id();
	}

	@Override
	public tj.result.opening.model.ResultOpening toEscapedModel() {
		return new ResultOpeningWrapper(_resultOpening.toEscapedModel());
	}

	@Override
	public tj.result.opening.model.ResultOpening toUnescapedModel() {
		return new ResultOpeningWrapper(_resultOpening.toUnescapedModel());
	}

	@Override
	public void persist() {
		_resultOpening.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_resultOpening.setCachedModel(cachedModel);
	}

	/**
	* Sets the description of this result opening.
	*
	* @param description the description of this result opening
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_resultOpening.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_resultOpening.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_resultOpening.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_resultOpening.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_resultOpening.setNew(n);
	}

	/**
	* Sets the postavwik_id of this result opening.
	*
	* @param postavwik_id the postavwik_id of this result opening
	*/
	@Override
	public void setPostavwik_id(long postavwik_id) {
		_resultOpening.setPostavwik_id(postavwik_id);
	}

	/**
	* Sets the primary key of this result opening.
	*
	* @param primaryKey the primary key of this result opening
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_resultOpening.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_resultOpening.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the protocol_opening_id of this result opening.
	*
	* @param protocol_opening_id the protocol_opening_id of this result opening
	*/
	@Override
	public void setProtocol_opening_id(long protocol_opening_id) {
		_resultOpening.setProtocol_opening_id(protocol_opening_id);
	}

	/**
	* Sets the result_opening_id of this result opening.
	*
	* @param result_opening_id the result_opening_id of this result opening
	*/
	@Override
	public void setResult_opening_id(long result_opening_id) {
		_resultOpening.setResult_opening_id(result_opening_id);
	}

	/**
	* Sets the spisok_lotov_id of this result opening.
	*
	* @param spisok_lotov_id the spisok_lotov_id of this result opening
	*/
	@Override
	public void setSpisok_lotov_id(long spisok_lotov_id) {
		_resultOpening.setSpisok_lotov_id(spisok_lotov_id);
	}

	/**
	* Sets the status of this result opening.
	*
	* @param status the status of this result opening
	*/
	@Override
	public void setStatus(int status) {
		_resultOpening.setStatus(status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ResultOpeningWrapper)) {
			return false;
		}

		ResultOpeningWrapper resultOpeningWrapper = (ResultOpeningWrapper)obj;

		if (Objects.equals(_resultOpening, resultOpeningWrapper._resultOpening)) {
			return true;
		}

		return false;
	}

	@Override
	public ResultOpening getWrappedModel() {
		return _resultOpening;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _resultOpening.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _resultOpening.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_resultOpening.resetOriginalValues();
	}

	private final ResultOpening _resultOpening;
}