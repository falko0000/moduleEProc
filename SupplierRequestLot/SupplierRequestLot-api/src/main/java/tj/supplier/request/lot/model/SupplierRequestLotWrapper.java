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

package tj.supplier.request.lot.model;

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
 * This class is a wrapper for {@link SupplierRequestLot}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SupplierRequestLot
 * @generated
 */
@ProviderType
public class SupplierRequestLotWrapper implements SupplierRequestLot,
	ModelWrapper<SupplierRequestLot> {
	public SupplierRequestLotWrapper(SupplierRequestLot supplierRequestLot) {
		_supplierRequestLot = supplierRequestLot;
	}

	@Override
	public Class<?> getModelClass() {
		return SupplierRequestLot.class;
	}

	@Override
	public String getModelClassName() {
		return SupplierRequestLot.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("supplier_request_lot_id", getSupplier_request_lot_id());
		attributes.put("organization_id", getOrganization_id());
		attributes.put("spisok_lotov_id", getSpisok_lotov_id());
		attributes.put("sub_application", getSub_application());
		attributes.put("withdrawn", getWithdrawn());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long supplier_request_lot_id = (Long)attributes.get(
				"supplier_request_lot_id");

		if (supplier_request_lot_id != null) {
			setSupplier_request_lot_id(supplier_request_lot_id);
		}

		Long organization_id = (Long)attributes.get("organization_id");

		if (organization_id != null) {
			setOrganization_id(organization_id);
		}

		Long spisok_lotov_id = (Long)attributes.get("spisok_lotov_id");

		if (spisok_lotov_id != null) {
			setSpisok_lotov_id(spisok_lotov_id);
		}

		Boolean sub_application = (Boolean)attributes.get("sub_application");

		if (sub_application != null) {
			setSub_application(sub_application);
		}

		Integer withdrawn = (Integer)attributes.get("withdrawn");

		if (withdrawn != null) {
			setWithdrawn(withdrawn);
		}
	}

	/**
	* Returns the sub_application of this supplier request lot.
	*
	* @return the sub_application of this supplier request lot
	*/
	@Override
	public boolean getSub_application() {
		return _supplierRequestLot.getSub_application();
	}

	@Override
	public boolean isCachedModel() {
		return _supplierRequestLot.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _supplierRequestLot.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _supplierRequestLot.isNew();
	}

	/**
	* Returns <code>true</code> if this supplier request lot is sub_application.
	*
	* @return <code>true</code> if this supplier request lot is sub_application; <code>false</code> otherwise
	*/
	@Override
	public boolean isSub_application() {
		return _supplierRequestLot.isSub_application();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _supplierRequestLot.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.supplier.request.lot.model.SupplierRequestLot> toCacheModel() {
		return _supplierRequestLot.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.supplier.request.lot.model.SupplierRequestLot supplierRequestLot) {
		return _supplierRequestLot.compareTo(supplierRequestLot);
	}

	/**
	* Returns the withdrawn of this supplier request lot.
	*
	* @return the withdrawn of this supplier request lot
	*/
	@Override
	public int getWithdrawn() {
		return _supplierRequestLot.getWithdrawn();
	}

	@Override
	public int hashCode() {
		return _supplierRequestLot.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _supplierRequestLot.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new SupplierRequestLotWrapper((SupplierRequestLot)_supplierRequestLot.clone());
	}

	@Override
	public java.lang.String toString() {
		return _supplierRequestLot.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _supplierRequestLot.toXmlString();
	}

	/**
	* Returns the organization_id of this supplier request lot.
	*
	* @return the organization_id of this supplier request lot
	*/
	@Override
	public long getOrganization_id() {
		return _supplierRequestLot.getOrganization_id();
	}

	/**
	* Returns the primary key of this supplier request lot.
	*
	* @return the primary key of this supplier request lot
	*/
	@Override
	public long getPrimaryKey() {
		return _supplierRequestLot.getPrimaryKey();
	}

	/**
	* Returns the spisok_lotov_id of this supplier request lot.
	*
	* @return the spisok_lotov_id of this supplier request lot
	*/
	@Override
	public long getSpisok_lotov_id() {
		return _supplierRequestLot.getSpisok_lotov_id();
	}

	/**
	* Returns the supplier_request_lot_id of this supplier request lot.
	*
	* @return the supplier_request_lot_id of this supplier request lot
	*/
	@Override
	public long getSupplier_request_lot_id() {
		return _supplierRequestLot.getSupplier_request_lot_id();
	}

	@Override
	public tj.supplier.request.lot.model.SupplierRequestLot toEscapedModel() {
		return new SupplierRequestLotWrapper(_supplierRequestLot.toEscapedModel());
	}

	@Override
	public tj.supplier.request.lot.model.SupplierRequestLot toUnescapedModel() {
		return new SupplierRequestLotWrapper(_supplierRequestLot.toUnescapedModel());
	}

	@Override
	public void persist() {
		_supplierRequestLot.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_supplierRequestLot.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_supplierRequestLot.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_supplierRequestLot.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_supplierRequestLot.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_supplierRequestLot.setNew(n);
	}

	/**
	* Sets the organization_id of this supplier request lot.
	*
	* @param organization_id the organization_id of this supplier request lot
	*/
	@Override
	public void setOrganization_id(long organization_id) {
		_supplierRequestLot.setOrganization_id(organization_id);
	}

	/**
	* Sets the primary key of this supplier request lot.
	*
	* @param primaryKey the primary key of this supplier request lot
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_supplierRequestLot.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_supplierRequestLot.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the spisok_lotov_id of this supplier request lot.
	*
	* @param spisok_lotov_id the spisok_lotov_id of this supplier request lot
	*/
	@Override
	public void setSpisok_lotov_id(long spisok_lotov_id) {
		_supplierRequestLot.setSpisok_lotov_id(spisok_lotov_id);
	}

	/**
	* Sets whether this supplier request lot is sub_application.
	*
	* @param sub_application the sub_application of this supplier request lot
	*/
	@Override
	public void setSub_application(boolean sub_application) {
		_supplierRequestLot.setSub_application(sub_application);
	}

	/**
	* Sets the supplier_request_lot_id of this supplier request lot.
	*
	* @param supplier_request_lot_id the supplier_request_lot_id of this supplier request lot
	*/
	@Override
	public void setSupplier_request_lot_id(long supplier_request_lot_id) {
		_supplierRequestLot.setSupplier_request_lot_id(supplier_request_lot_id);
	}

	/**
	* Sets the withdrawn of this supplier request lot.
	*
	* @param withdrawn the withdrawn of this supplier request lot
	*/
	@Override
	public void setWithdrawn(int withdrawn) {
		_supplierRequestLot.setWithdrawn(withdrawn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SupplierRequestLotWrapper)) {
			return false;
		}

		SupplierRequestLotWrapper supplierRequestLotWrapper = (SupplierRequestLotWrapper)obj;

		if (Objects.equals(_supplierRequestLot,
					supplierRequestLotWrapper._supplierRequestLot)) {
			return true;
		}

		return false;
	}

	@Override
	public SupplierRequestLot getWrappedModel() {
		return _supplierRequestLot;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _supplierRequestLot.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _supplierRequestLot.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_supplierRequestLot.resetOriginalValues();
	}

	private final SupplierRequestLot _supplierRequestLot;
}