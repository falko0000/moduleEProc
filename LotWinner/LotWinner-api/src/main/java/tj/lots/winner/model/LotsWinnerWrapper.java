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

package tj.lots.winner.model;

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
 * This class is a wrapper for {@link LotsWinner}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LotsWinner
 * @generated
 */
@ProviderType
public class LotsWinnerWrapper implements LotsWinner, ModelWrapper<LotsWinner> {
	public LotsWinnerWrapper(LotsWinner lotsWinner) {
		_lotsWinner = lotsWinner;
	}

	@Override
	public Class<?> getModelClass() {
		return LotsWinner.class;
	}

	@Override
	public String getModelClassName() {
		return LotsWinner.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("lot_winner_id", getLot_winner_id());
		attributes.put("spisok_lotov_id", getSpisok_lotov_id());
		attributes.put("organization_id", getOrganization_id());
		attributes.put("total_price", getTotal_price());
		attributes.put("attribute", getAttribute());
		attributes.put("serial_number", getSerial_number());
		attributes.put("point", getPoint());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long lot_winner_id = (Long)attributes.get("lot_winner_id");

		if (lot_winner_id != null) {
			setLot_winner_id(lot_winner_id);
		}

		Long spisok_lotov_id = (Long)attributes.get("spisok_lotov_id");

		if (spisok_lotov_id != null) {
			setSpisok_lotov_id(spisok_lotov_id);
		}

		Long organization_id = (Long)attributes.get("organization_id");

		if (organization_id != null) {
			setOrganization_id(organization_id);
		}

		Double total_price = (Double)attributes.get("total_price");

		if (total_price != null) {
			setTotal_price(total_price);
		}

		String attribute = (String)attributes.get("attribute");

		if (attribute != null) {
			setAttribute(attribute);
		}

		Integer serial_number = (Integer)attributes.get("serial_number");

		if (serial_number != null) {
			setSerial_number(serial_number);
		}

		Double point = (Double)attributes.get("point");

		if (point != null) {
			setPoint(point);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _lotsWinner.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _lotsWinner.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _lotsWinner.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _lotsWinner.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.lots.winner.model.LotsWinner> toCacheModel() {
		return _lotsWinner.toCacheModel();
	}

	/**
	* Returns the point of this lots winner.
	*
	* @return the point of this lots winner
	*/
	@Override
	public double getPoint() {
		return _lotsWinner.getPoint();
	}

	/**
	* Returns the total_price of this lots winner.
	*
	* @return the total_price of this lots winner
	*/
	@Override
	public double getTotal_price() {
		return _lotsWinner.getTotal_price();
	}

	@Override
	public int compareTo(tj.lots.winner.model.LotsWinner lotsWinner) {
		return _lotsWinner.compareTo(lotsWinner);
	}

	/**
	* Returns the serial_number of this lots winner.
	*
	* @return the serial_number of this lots winner
	*/
	@Override
	public int getSerial_number() {
		return _lotsWinner.getSerial_number();
	}

	@Override
	public int hashCode() {
		return _lotsWinner.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _lotsWinner.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new LotsWinnerWrapper((LotsWinner)_lotsWinner.clone());
	}

	/**
	* Returns the attribute of this lots winner.
	*
	* @return the attribute of this lots winner
	*/
	@Override
	public java.lang.String getAttribute() {
		return _lotsWinner.getAttribute();
	}

	@Override
	public java.lang.String toString() {
		return _lotsWinner.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _lotsWinner.toXmlString();
	}

	/**
	* Returns the lot_winner_id of this lots winner.
	*
	* @return the lot_winner_id of this lots winner
	*/
	@Override
	public long getLot_winner_id() {
		return _lotsWinner.getLot_winner_id();
	}

	/**
	* Returns the organization_id of this lots winner.
	*
	* @return the organization_id of this lots winner
	*/
	@Override
	public long getOrganization_id() {
		return _lotsWinner.getOrganization_id();
	}

	/**
	* Returns the primary key of this lots winner.
	*
	* @return the primary key of this lots winner
	*/
	@Override
	public long getPrimaryKey() {
		return _lotsWinner.getPrimaryKey();
	}

	/**
	* Returns the spisok_lotov_id of this lots winner.
	*
	* @return the spisok_lotov_id of this lots winner
	*/
	@Override
	public long getSpisok_lotov_id() {
		return _lotsWinner.getSpisok_lotov_id();
	}

	@Override
	public tj.lots.winner.model.LotsWinner toEscapedModel() {
		return new LotsWinnerWrapper(_lotsWinner.toEscapedModel());
	}

	@Override
	public tj.lots.winner.model.LotsWinner toUnescapedModel() {
		return new LotsWinnerWrapper(_lotsWinner.toUnescapedModel());
	}

	@Override
	public void persist() {
		_lotsWinner.persist();
	}

	/**
	* Sets the attribute of this lots winner.
	*
	* @param attribute the attribute of this lots winner
	*/
	@Override
	public void setAttribute(java.lang.String attribute) {
		_lotsWinner.setAttribute(attribute);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_lotsWinner.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_lotsWinner.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_lotsWinner.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_lotsWinner.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the lot_winner_id of this lots winner.
	*
	* @param lot_winner_id the lot_winner_id of this lots winner
	*/
	@Override
	public void setLot_winner_id(long lot_winner_id) {
		_lotsWinner.setLot_winner_id(lot_winner_id);
	}

	@Override
	public void setNew(boolean n) {
		_lotsWinner.setNew(n);
	}

	/**
	* Sets the organization_id of this lots winner.
	*
	* @param organization_id the organization_id of this lots winner
	*/
	@Override
	public void setOrganization_id(long organization_id) {
		_lotsWinner.setOrganization_id(organization_id);
	}

	/**
	* Sets the point of this lots winner.
	*
	* @param point the point of this lots winner
	*/
	@Override
	public void setPoint(double point) {
		_lotsWinner.setPoint(point);
	}

	/**
	* Sets the primary key of this lots winner.
	*
	* @param primaryKey the primary key of this lots winner
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_lotsWinner.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_lotsWinner.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the serial_number of this lots winner.
	*
	* @param serial_number the serial_number of this lots winner
	*/
	@Override
	public void setSerial_number(int serial_number) {
		_lotsWinner.setSerial_number(serial_number);
	}

	/**
	* Sets the spisok_lotov_id of this lots winner.
	*
	* @param spisok_lotov_id the spisok_lotov_id of this lots winner
	*/
	@Override
	public void setSpisok_lotov_id(long spisok_lotov_id) {
		_lotsWinner.setSpisok_lotov_id(spisok_lotov_id);
	}

	/**
	* Sets the total_price of this lots winner.
	*
	* @param total_price the total_price of this lots winner
	*/
	@Override
	public void setTotal_price(double total_price) {
		_lotsWinner.setTotal_price(total_price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LotsWinnerWrapper)) {
			return false;
		}

		LotsWinnerWrapper lotsWinnerWrapper = (LotsWinnerWrapper)obj;

		if (Objects.equals(_lotsWinner, lotsWinnerWrapper._lotsWinner)) {
			return true;
		}

		return false;
	}

	@Override
	public LotsWinner getWrappedModel() {
		return _lotsWinner;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _lotsWinner.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _lotsWinner.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_lotsWinner.resetOriginalValues();
	}

	private final LotsWinner _lotsWinner;
}