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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the LogEvaluated service. Represents a row in the &quot;sapp.log_evaluated&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.log.evaluated.model.impl.LogEvaluatedModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.log.evaluated.model.impl.LogEvaluatedImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LogEvaluated
 * @see tj.log.evaluated.model.impl.LogEvaluatedImpl
 * @see tj.log.evaluated.model.impl.LogEvaluatedModelImpl
 * @generated
 */
@ProviderType
public interface LogEvaluatedModel extends BaseModel<LogEvaluated> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a log evaluated model instance should use the {@link LogEvaluated} interface instead.
	 */

	/**
	 * Returns the primary key of this log evaluated.
	 *
	 * @return the primary key of this log evaluated
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this log evaluated.
	 *
	 * @param primaryKey the primary key of this log evaluated
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the log_evaluated_id of this log evaluated.
	 *
	 * @return the log_evaluated_id of this log evaluated
	 */
	public long getLog_evaluated_id();

	/**
	 * Sets the log_evaluated_id of this log evaluated.
	 *
	 * @param log_evaluated_id the log_evaluated_id of this log evaluated
	 */
	public void setLog_evaluated_id(long log_evaluated_id);

	/**
	 * Returns the spisok_lotov_id of this log evaluated.
	 *
	 * @return the spisok_lotov_id of this log evaluated
	 */
	public long getSpisok_lotov_id();

	/**
	 * Sets the spisok_lotov_id of this log evaluated.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id of this log evaluated
	 */
	public void setSpisok_lotov_id(long spisok_lotov_id);

	/**
	 * Returns the organization_id of this log evaluated.
	 *
	 * @return the organization_id of this log evaluated
	 */
	public long getOrganization_id();

	/**
	 * Sets the organization_id of this log evaluated.
	 *
	 * @param organization_id the organization_id of this log evaluated
	 */
	public void setOrganization_id(long organization_id);

	/**
	 * Returns the userid of this log evaluated.
	 *
	 * @return the userid of this log evaluated
	 */
	public long getUserid();

	/**
	 * Sets the userid of this log evaluated.
	 *
	 * @param userid the userid of this log evaluated
	 */
	public void setUserid(long userid);

	/**
	 * Returns the status of this log evaluated.
	 *
	 * @return the status of this log evaluated
	 */
	public int getStatus();

	/**
	 * Sets the status of this log evaluated.
	 *
	 * @param status the status of this log evaluated
	 */
	public void setStatus(int status);

	/**
	 * Returns the evaluated_des of this log evaluated.
	 *
	 * @return the evaluated_des of this log evaluated
	 */
	@AutoEscape
	public String getEvaluated_des();

	/**
	 * Sets the evaluated_des of this log evaluated.
	 *
	 * @param evaluated_des the evaluated_des of this log evaluated
	 */
	public void setEvaluated_des(String evaluated_des);

	/**
	 * Returns the opening_status of this log evaluated.
	 *
	 * @return the opening_status of this log evaluated
	 */
	public int getOpening_status();

	/**
	 * Sets the opening_status of this log evaluated.
	 *
	 * @param opening_status the opening_status of this log evaluated
	 */
	public void setOpening_status(int opening_status);

	/**
	 * Returns the opening_des of this log evaluated.
	 *
	 * @return the opening_des of this log evaluated
	 */
	@AutoEscape
	public String getOpening_des();

	/**
	 * Sets the opening_des of this log evaluated.
	 *
	 * @param opening_des the opening_des of this log evaluated
	 */
	public void setOpening_des(String opening_des);

	/**
	 * Returns the result_opening_id of this log evaluated.
	 *
	 * @return the result_opening_id of this log evaluated
	 */
	public long getResult_opening_id();

	/**
	 * Sets the result_opening_id of this log evaluated.
	 *
	 * @param result_opening_id the result_opening_id of this log evaluated
	 */
	public void setResult_opening_id(long result_opening_id);

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
	public int compareTo(tj.log.evaluated.model.LogEvaluated logEvaluated);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.log.evaluated.model.LogEvaluated> toCacheModel();

	@Override
	public tj.log.evaluated.model.LogEvaluated toEscapedModel();

	@Override
	public tj.log.evaluated.model.LogEvaluated toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}