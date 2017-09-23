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

package tj.log.evaluated.model;

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
 * This class is a wrapper for {@link LogEvaluated}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LogEvaluated
 * @generated
 */
@ProviderType
public class LogEvaluatedWrapper implements LogEvaluated,
	ModelWrapper<LogEvaluated> {
	public LogEvaluatedWrapper(LogEvaluated logEvaluated) {
		_logEvaluated = logEvaluated;
	}

	@Override
	public Class<?> getModelClass() {
		return LogEvaluated.class;
	}

	@Override
	public String getModelClassName() {
		return LogEvaluated.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("log_evaluated_id", getLog_evaluated_id());
		attributes.put("spisok_lotov_id", getSpisok_lotov_id());
		attributes.put("organization_id", getOrganization_id());
		attributes.put("userid", getUserid());
		attributes.put("status", getStatus());
		attributes.put("evaluated_des", getEvaluated_des());
		attributes.put("opening_status", getOpening_status());
		attributes.put("opening_des", getOpening_des());
		attributes.put("result_opening_id", getResult_opening_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long log_evaluated_id = (Long)attributes.get("log_evaluated_id");

		if (log_evaluated_id != null) {
			setLog_evaluated_id(log_evaluated_id);
		}

		Long spisok_lotov_id = (Long)attributes.get("spisok_lotov_id");

		if (spisok_lotov_id != null) {
			setSpisok_lotov_id(spisok_lotov_id);
		}

		Long organization_id = (Long)attributes.get("organization_id");

		if (organization_id != null) {
			setOrganization_id(organization_id);
		}

		Long userid = (Long)attributes.get("userid");

		if (userid != null) {
			setUserid(userid);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String evaluated_des = (String)attributes.get("evaluated_des");

		if (evaluated_des != null) {
			setEvaluated_des(evaluated_des);
		}

		Integer opening_status = (Integer)attributes.get("opening_status");

		if (opening_status != null) {
			setOpening_status(opening_status);
		}

		String opening_des = (String)attributes.get("opening_des");

		if (opening_des != null) {
			setOpening_des(opening_des);
		}

		Long result_opening_id = (Long)attributes.get("result_opening_id");

		if (result_opening_id != null) {
			setResult_opening_id(result_opening_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _logEvaluated.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _logEvaluated.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _logEvaluated.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _logEvaluated.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.log.evaluated.model.LogEvaluated> toCacheModel() {
		return _logEvaluated.toCacheModel();
	}

	@Override
	public int compareTo(tj.log.evaluated.model.LogEvaluated logEvaluated) {
		return _logEvaluated.compareTo(logEvaluated);
	}

	/**
	* Returns the opening_status of this log evaluated.
	*
	* @return the opening_status of this log evaluated
	*/
	@Override
	public int getOpening_status() {
		return _logEvaluated.getOpening_status();
	}

	/**
	* Returns the status of this log evaluated.
	*
	* @return the status of this log evaluated
	*/
	@Override
	public int getStatus() {
		return _logEvaluated.getStatus();
	}

	@Override
	public int hashCode() {
		return _logEvaluated.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _logEvaluated.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new LogEvaluatedWrapper((LogEvaluated)_logEvaluated.clone());
	}

	/**
	* Returns the evaluated_des of this log evaluated.
	*
	* @return the evaluated_des of this log evaluated
	*/
	@Override
	public java.lang.String getEvaluated_des() {
		return _logEvaluated.getEvaluated_des();
	}

	/**
	* Returns the opening_des of this log evaluated.
	*
	* @return the opening_des of this log evaluated
	*/
	@Override
	public java.lang.String getOpening_des() {
		return _logEvaluated.getOpening_des();
	}

	@Override
	public java.lang.String toString() {
		return _logEvaluated.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _logEvaluated.toXmlString();
	}

	/**
	* Returns the log_evaluated_id of this log evaluated.
	*
	* @return the log_evaluated_id of this log evaluated
	*/
	@Override
	public long getLog_evaluated_id() {
		return _logEvaluated.getLog_evaluated_id();
	}

	/**
	* Returns the organization_id of this log evaluated.
	*
	* @return the organization_id of this log evaluated
	*/
	@Override
	public long getOrganization_id() {
		return _logEvaluated.getOrganization_id();
	}

	/**
	* Returns the primary key of this log evaluated.
	*
	* @return the primary key of this log evaluated
	*/
	@Override
	public long getPrimaryKey() {
		return _logEvaluated.getPrimaryKey();
	}

	/**
	* Returns the result_opening_id of this log evaluated.
	*
	* @return the result_opening_id of this log evaluated
	*/
	@Override
	public long getResult_opening_id() {
		return _logEvaluated.getResult_opening_id();
	}

	/**
	* Returns the spisok_lotov_id of this log evaluated.
	*
	* @return the spisok_lotov_id of this log evaluated
	*/
	@Override
	public long getSpisok_lotov_id() {
		return _logEvaluated.getSpisok_lotov_id();
	}

	/**
	* Returns the userid of this log evaluated.
	*
	* @return the userid of this log evaluated
	*/
	@Override
	public long getUserid() {
		return _logEvaluated.getUserid();
	}

	@Override
	public tj.log.evaluated.model.LogEvaluated toEscapedModel() {
		return new LogEvaluatedWrapper(_logEvaluated.toEscapedModel());
	}

	@Override
	public tj.log.evaluated.model.LogEvaluated toUnescapedModel() {
		return new LogEvaluatedWrapper(_logEvaluated.toUnescapedModel());
	}

	@Override
	public void persist() {
		_logEvaluated.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_logEvaluated.setCachedModel(cachedModel);
	}

	/**
	* Sets the evaluated_des of this log evaluated.
	*
	* @param evaluated_des the evaluated_des of this log evaluated
	*/
	@Override
	public void setEvaluated_des(java.lang.String evaluated_des) {
		_logEvaluated.setEvaluated_des(evaluated_des);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_logEvaluated.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_logEvaluated.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_logEvaluated.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the log_evaluated_id of this log evaluated.
	*
	* @param log_evaluated_id the log_evaluated_id of this log evaluated
	*/
	@Override
	public void setLog_evaluated_id(long log_evaluated_id) {
		_logEvaluated.setLog_evaluated_id(log_evaluated_id);
	}

	@Override
	public void setNew(boolean n) {
		_logEvaluated.setNew(n);
	}

	/**
	* Sets the opening_des of this log evaluated.
	*
	* @param opening_des the opening_des of this log evaluated
	*/
	@Override
	public void setOpening_des(java.lang.String opening_des) {
		_logEvaluated.setOpening_des(opening_des);
	}

	/**
	* Sets the opening_status of this log evaluated.
	*
	* @param opening_status the opening_status of this log evaluated
	*/
	@Override
	public void setOpening_status(int opening_status) {
		_logEvaluated.setOpening_status(opening_status);
	}

	/**
	* Sets the organization_id of this log evaluated.
	*
	* @param organization_id the organization_id of this log evaluated
	*/
	@Override
	public void setOrganization_id(long organization_id) {
		_logEvaluated.setOrganization_id(organization_id);
	}

	/**
	* Sets the primary key of this log evaluated.
	*
	* @param primaryKey the primary key of this log evaluated
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_logEvaluated.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_logEvaluated.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the result_opening_id of this log evaluated.
	*
	* @param result_opening_id the result_opening_id of this log evaluated
	*/
	@Override
	public void setResult_opening_id(long result_opening_id) {
		_logEvaluated.setResult_opening_id(result_opening_id);
	}

	/**
	* Sets the spisok_lotov_id of this log evaluated.
	*
	* @param spisok_lotov_id the spisok_lotov_id of this log evaluated
	*/
	@Override
	public void setSpisok_lotov_id(long spisok_lotov_id) {
		_logEvaluated.setSpisok_lotov_id(spisok_lotov_id);
	}

	/**
	* Sets the status of this log evaluated.
	*
	* @param status the status of this log evaluated
	*/
	@Override
	public void setStatus(int status) {
		_logEvaluated.setStatus(status);
	}

	/**
	* Sets the userid of this log evaluated.
	*
	* @param userid the userid of this log evaluated
	*/
	@Override
	public void setUserid(long userid) {
		_logEvaluated.setUserid(userid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LogEvaluatedWrapper)) {
			return false;
		}

		LogEvaluatedWrapper logEvaluatedWrapper = (LogEvaluatedWrapper)obj;

		if (Objects.equals(_logEvaluated, logEvaluatedWrapper._logEvaluated)) {
			return true;
		}

		return false;
	}

	@Override
	public LogEvaluated getWrappedModel() {
		return _logEvaluated;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _logEvaluated.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _logEvaluated.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_logEvaluated.resetOriginalValues();
	}

	private final LogEvaluated _logEvaluated;
}