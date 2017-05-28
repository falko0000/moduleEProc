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

package tj.tipy.dokumentov.postavwika.model;

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
 * This class is a wrapper for {@link TipyDokumentovPostavwika}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TipyDokumentovPostavwika
 * @generated
 */
@ProviderType
public class TipyDokumentovPostavwikaWrapper implements TipyDokumentovPostavwika,
	ModelWrapper<TipyDokumentovPostavwika> {
	public TipyDokumentovPostavwikaWrapper(
		TipyDokumentovPostavwika tipyDokumentovPostavwika) {
		_tipyDokumentovPostavwika = tipyDokumentovPostavwika;
	}

	@Override
	public Class<?> getModelClass() {
		return TipyDokumentovPostavwika.class;
	}

	@Override
	public String getModelClassName() {
		return TipyDokumentovPostavwika.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tipy_dokumentov_postavwika_id",
			getTipy_dokumentov_postavwika_id());
		attributes.put("tip", getTip());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer tipy_dokumentov_postavwika_id = (Integer)attributes.get(
				"tipy_dokumentov_postavwika_id");

		if (tipy_dokumentov_postavwika_id != null) {
			setTipy_dokumentov_postavwika_id(tipy_dokumentov_postavwika_id);
		}

		String tip = (String)attributes.get("tip");

		if (tip != null) {
			setTip(tip);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _tipyDokumentovPostavwika.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _tipyDokumentovPostavwika.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _tipyDokumentovPostavwika.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _tipyDokumentovPostavwika.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika> toCacheModel() {
		return _tipyDokumentovPostavwika.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika tipyDokumentovPostavwika) {
		return _tipyDokumentovPostavwika.compareTo(tipyDokumentovPostavwika);
	}

	/**
	* Returns the primary key of this tipy dokumentov postavwika.
	*
	* @return the primary key of this tipy dokumentov postavwika
	*/
	@Override
	public int getPrimaryKey() {
		return _tipyDokumentovPostavwika.getPrimaryKey();
	}

	/**
	* Returns the tipy_dokumentov_postavwika_id of this tipy dokumentov postavwika.
	*
	* @return the tipy_dokumentov_postavwika_id of this tipy dokumentov postavwika
	*/
	@Override
	public int getTipy_dokumentov_postavwika_id() {
		return _tipyDokumentovPostavwika.getTipy_dokumentov_postavwika_id();
	}

	@Override
	public int hashCode() {
		return _tipyDokumentovPostavwika.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tipyDokumentovPostavwika.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new TipyDokumentovPostavwikaWrapper((TipyDokumentovPostavwika)_tipyDokumentovPostavwika.clone());
	}

	/**
	* Returns the tip of this tipy dokumentov postavwika.
	*
	* @return the tip of this tipy dokumentov postavwika
	*/
	@Override
	public java.lang.String getTip() {
		return _tipyDokumentovPostavwika.getTip();
	}

	@Override
	public java.lang.String toString() {
		return _tipyDokumentovPostavwika.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tipyDokumentovPostavwika.toXmlString();
	}

	@Override
	public tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika toEscapedModel() {
		return new TipyDokumentovPostavwikaWrapper(_tipyDokumentovPostavwika.toEscapedModel());
	}

	@Override
	public tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika toUnescapedModel() {
		return new TipyDokumentovPostavwikaWrapper(_tipyDokumentovPostavwika.toUnescapedModel());
	}

	@Override
	public void persist() {
		_tipyDokumentovPostavwika.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tipyDokumentovPostavwika.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_tipyDokumentovPostavwika.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_tipyDokumentovPostavwika.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_tipyDokumentovPostavwika.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_tipyDokumentovPostavwika.setNew(n);
	}

	/**
	* Sets the primary key of this tipy dokumentov postavwika.
	*
	* @param primaryKey the primary key of this tipy dokumentov postavwika
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_tipyDokumentovPostavwika.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_tipyDokumentovPostavwika.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the tip of this tipy dokumentov postavwika.
	*
	* @param tip the tip of this tipy dokumentov postavwika
	*/
	@Override
	public void setTip(java.lang.String tip) {
		_tipyDokumentovPostavwika.setTip(tip);
	}

	/**
	* Sets the tipy_dokumentov_postavwika_id of this tipy dokumentov postavwika.
	*
	* @param tipy_dokumentov_postavwika_id the tipy_dokumentov_postavwika_id of this tipy dokumentov postavwika
	*/
	@Override
	public void setTipy_dokumentov_postavwika_id(
		int tipy_dokumentov_postavwika_id) {
		_tipyDokumentovPostavwika.setTipy_dokumentov_postavwika_id(tipy_dokumentov_postavwika_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TipyDokumentovPostavwikaWrapper)) {
			return false;
		}

		TipyDokumentovPostavwikaWrapper tipyDokumentovPostavwikaWrapper = (TipyDokumentovPostavwikaWrapper)obj;

		if (Objects.equals(_tipyDokumentovPostavwika,
					tipyDokumentovPostavwikaWrapper._tipyDokumentovPostavwika)) {
			return true;
		}

		return false;
	}

	@Override
	public TipyDokumentovPostavwika getWrappedModel() {
		return _tipyDokumentovPostavwika;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _tipyDokumentovPostavwika.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _tipyDokumentovPostavwika.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_tipyDokumentovPostavwika.resetOriginalValues();
	}

	private final TipyDokumentovPostavwika _tipyDokumentovPostavwika;
}