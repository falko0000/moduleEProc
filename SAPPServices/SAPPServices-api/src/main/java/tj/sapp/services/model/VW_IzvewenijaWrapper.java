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

package tj.sapp.services.model;

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
 * This class is a wrapper for {@link VW_Izvewenija}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VW_Izvewenija
 * @generated
 */
@ProviderType
public class VW_IzvewenijaWrapper implements VW_Izvewenija,
	ModelWrapper<VW_Izvewenija> {
	public VW_IzvewenijaWrapper(VW_Izvewenija vw_Izvewenija) {
		_vw_Izvewenija = vw_Izvewenija;
	}

	@Override
	public Class<?> getModelClass() {
		return VW_Izvewenija.class;
	}

	@Override
	public String getModelClassName() {
		return VW_Izvewenija.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("izvewenija_id", getIzvewenija_id());
		attributes.put("sostojanie_id", getSostojanie_id());
		attributes.put("status_id", getStatus_id());
		attributes.put("tip_izvewenija_id", getTip_izvewenija_id());
		attributes.put("organizacija_id", getOrganizacija_id());
		attributes.put("vyshestojawaja_organizacija_id",
			getVyshestojawaja_organizacija_id());
		attributes.put("naimenovanie", getNaimenovanie());
		attributes.put("sozdal", getSozdal());
		attributes.put("izmenil", getIzmenil());
		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("data_izmenenija", getData_izmenenija());
		attributes.put("kod_id", getKod_id());
		attributes.put("put_a", getPut_a());
		attributes.put("put_b", getPut_b());
		attributes.put("put_c", getPut_c());
		attributes.put("kontaktnoe_lico", getKontaktnoe_lico());
		attributes.put("je_pochta", getJe_pochta());
		attributes.put("kontaktnyj_telefon", getKontaktnyj_telefon());
		attributes.put("data_publikacii", getData_publikacii());
		attributes.put("data_podvedenija_itogov", getData_podvedenija_itogov());
		attributes.put("po_istecheniju_dnej", getPo_istecheniju_dnej());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long izvewenija_id = (Long)attributes.get("izvewenija_id");

		if (izvewenija_id != null) {
			setIzvewenija_id(izvewenija_id);
		}

		Long sostojanie_id = (Long)attributes.get("sostojanie_id");

		if (sostojanie_id != null) {
			setSostojanie_id(sostojanie_id);
		}

		Long status_id = (Long)attributes.get("status_id");

		if (status_id != null) {
			setStatus_id(status_id);
		}

		Long tip_izvewenija_id = (Long)attributes.get("tip_izvewenija_id");

		if (tip_izvewenija_id != null) {
			setTip_izvewenija_id(tip_izvewenija_id);
		}

		Long organizacija_id = (Long)attributes.get("organizacija_id");

		if (organizacija_id != null) {
			setOrganizacija_id(organizacija_id);
		}

		Long vyshestojawaja_organizacija_id = (Long)attributes.get(
				"vyshestojawaja_organizacija_id");

		if (vyshestojawaja_organizacija_id != null) {
			setVyshestojawaja_organizacija_id(vyshestojawaja_organizacija_id);
		}

		String naimenovanie = (String)attributes.get("naimenovanie");

		if (naimenovanie != null) {
			setNaimenovanie(naimenovanie);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}

		Long izmenil = (Long)attributes.get("izmenil");

		if (izmenil != null) {
			setIzmenil(izmenil);
		}

		Date data_sozdanija = (Date)attributes.get("data_sozdanija");

		if (data_sozdanija != null) {
			setData_sozdanija(data_sozdanija);
		}

		Date data_izmenenija = (Date)attributes.get("data_izmenenija");

		if (data_izmenenija != null) {
			setData_izmenenija(data_izmenenija);
		}

		Long kod_id = (Long)attributes.get("kod_id");

		if (kod_id != null) {
			setKod_id(kod_id);
		}

		Integer put_a = (Integer)attributes.get("put_a");

		if (put_a != null) {
			setPut_a(put_a);
		}

		Integer put_b = (Integer)attributes.get("put_b");

		if (put_b != null) {
			setPut_b(put_b);
		}

		String put_c = (String)attributes.get("put_c");

		if (put_c != null) {
			setPut_c(put_c);
		}

		String kontaktnoe_lico = (String)attributes.get("kontaktnoe_lico");

		if (kontaktnoe_lico != null) {
			setKontaktnoe_lico(kontaktnoe_lico);
		}

		String je_pochta = (String)attributes.get("je_pochta");

		if (je_pochta != null) {
			setJe_pochta(je_pochta);
		}

		String kontaktnyj_telefon = (String)attributes.get("kontaktnyj_telefon");

		if (kontaktnyj_telefon != null) {
			setKontaktnyj_telefon(kontaktnyj_telefon);
		}

		Date data_publikacii = (Date)attributes.get("data_publikacii");

		if (data_publikacii != null) {
			setData_publikacii(data_publikacii);
		}

		Date data_podvedenija_itogov = (Date)attributes.get(
				"data_podvedenija_itogov");

		if (data_podvedenija_itogov != null) {
			setData_podvedenija_itogov(data_podvedenija_itogov);
		}

		Integer po_istecheniju_dnej = (Integer)attributes.get(
				"po_istecheniju_dnej");

		if (po_istecheniju_dnej != null) {
			setPo_istecheniju_dnej(po_istecheniju_dnej);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _vw_Izvewenija.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vw_Izvewenija.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vw_Izvewenija.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vw_Izvewenija.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.sapp.services.model.VW_Izvewenija> toCacheModel() {
		return _vw_Izvewenija.toCacheModel();
	}

	@Override
	public int compareTo(tj.sapp.services.model.VW_Izvewenija vw_Izvewenija) {
		return _vw_Izvewenija.compareTo(vw_Izvewenija);
	}

	/**
	* Returns the po_istecheniju_dnej of this v w_ izvewenija.
	*
	* @return the po_istecheniju_dnej of this v w_ izvewenija
	*/
	@Override
	public int getPo_istecheniju_dnej() {
		return _vw_Izvewenija.getPo_istecheniju_dnej();
	}

	/**
	* Returns the put_a of this v w_ izvewenija.
	*
	* @return the put_a of this v w_ izvewenija
	*/
	@Override
	public int getPut_a() {
		return _vw_Izvewenija.getPut_a();
	}

	/**
	* Returns the put_b of this v w_ izvewenija.
	*
	* @return the put_b of this v w_ izvewenija
	*/
	@Override
	public int getPut_b() {
		return _vw_Izvewenija.getPut_b();
	}

	@Override
	public int hashCode() {
		return _vw_Izvewenija.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vw_Izvewenija.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VW_IzvewenijaWrapper((VW_Izvewenija)_vw_Izvewenija.clone());
	}

	/**
	* Returns the je_pochta of this v w_ izvewenija.
	*
	* @return the je_pochta of this v w_ izvewenija
	*/
	@Override
	public java.lang.String getJe_pochta() {
		return _vw_Izvewenija.getJe_pochta();
	}

	/**
	* Returns the kontaktnoe_lico of this v w_ izvewenija.
	*
	* @return the kontaktnoe_lico of this v w_ izvewenija
	*/
	@Override
	public java.lang.String getKontaktnoe_lico() {
		return _vw_Izvewenija.getKontaktnoe_lico();
	}

	/**
	* Returns the kontaktnyj_telefon of this v w_ izvewenija.
	*
	* @return the kontaktnyj_telefon of this v w_ izvewenija
	*/
	@Override
	public java.lang.String getKontaktnyj_telefon() {
		return _vw_Izvewenija.getKontaktnyj_telefon();
	}

	/**
	* Returns the naimenovanie of this v w_ izvewenija.
	*
	* @return the naimenovanie of this v w_ izvewenija
	*/
	@Override
	public java.lang.String getNaimenovanie() {
		return _vw_Izvewenija.getNaimenovanie();
	}

	/**
	* Returns the put_c of this v w_ izvewenija.
	*
	* @return the put_c of this v w_ izvewenija
	*/
	@Override
	public java.lang.String getPut_c() {
		return _vw_Izvewenija.getPut_c();
	}

	@Override
	public java.lang.String toString() {
		return _vw_Izvewenija.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vw_Izvewenija.toXmlString();
	}

	/**
	* Returns the data_izmenenija of this v w_ izvewenija.
	*
	* @return the data_izmenenija of this v w_ izvewenija
	*/
	@Override
	public Date getData_izmenenija() {
		return _vw_Izvewenija.getData_izmenenija();
	}

	/**
	* Returns the data_podvedenija_itogov of this v w_ izvewenija.
	*
	* @return the data_podvedenija_itogov of this v w_ izvewenija
	*/
	@Override
	public Date getData_podvedenija_itogov() {
		return _vw_Izvewenija.getData_podvedenija_itogov();
	}

	/**
	* Returns the data_publikacii of this v w_ izvewenija.
	*
	* @return the data_publikacii of this v w_ izvewenija
	*/
	@Override
	public Date getData_publikacii() {
		return _vw_Izvewenija.getData_publikacii();
	}

	/**
	* Returns the data_sozdanija of this v w_ izvewenija.
	*
	* @return the data_sozdanija of this v w_ izvewenija
	*/
	@Override
	public Date getData_sozdanija() {
		return _vw_Izvewenija.getData_sozdanija();
	}

	/**
	* Returns the izmenil of this v w_ izvewenija.
	*
	* @return the izmenil of this v w_ izvewenija
	*/
	@Override
	public long getIzmenil() {
		return _vw_Izvewenija.getIzmenil();
	}

	/**
	* Returns the izvewenija_id of this v w_ izvewenija.
	*
	* @return the izvewenija_id of this v w_ izvewenija
	*/
	@Override
	public long getIzvewenija_id() {
		return _vw_Izvewenija.getIzvewenija_id();
	}

	/**
	* Returns the kod_id of this v w_ izvewenija.
	*
	* @return the kod_id of this v w_ izvewenija
	*/
	@Override
	public long getKod_id() {
		return _vw_Izvewenija.getKod_id();
	}

	/**
	* Returns the organizacija_id of this v w_ izvewenija.
	*
	* @return the organizacija_id of this v w_ izvewenija
	*/
	@Override
	public long getOrganizacija_id() {
		return _vw_Izvewenija.getOrganizacija_id();
	}

	/**
	* Returns the primary key of this v w_ izvewenija.
	*
	* @return the primary key of this v w_ izvewenija
	*/
	@Override
	public long getPrimaryKey() {
		return _vw_Izvewenija.getPrimaryKey();
	}

	/**
	* Returns the sostojanie_id of this v w_ izvewenija.
	*
	* @return the sostojanie_id of this v w_ izvewenija
	*/
	@Override
	public long getSostojanie_id() {
		return _vw_Izvewenija.getSostojanie_id();
	}

	/**
	* Returns the sozdal of this v w_ izvewenija.
	*
	* @return the sozdal of this v w_ izvewenija
	*/
	@Override
	public long getSozdal() {
		return _vw_Izvewenija.getSozdal();
	}

	/**
	* Returns the status_id of this v w_ izvewenija.
	*
	* @return the status_id of this v w_ izvewenija
	*/
	@Override
	public long getStatus_id() {
		return _vw_Izvewenija.getStatus_id();
	}

	/**
	* Returns the tip_izvewenija_id of this v w_ izvewenija.
	*
	* @return the tip_izvewenija_id of this v w_ izvewenija
	*/
	@Override
	public long getTip_izvewenija_id() {
		return _vw_Izvewenija.getTip_izvewenija_id();
	}

	/**
	* Returns the vyshestojawaja_organizacija_id of this v w_ izvewenija.
	*
	* @return the vyshestojawaja_organizacija_id of this v w_ izvewenija
	*/
	@Override
	public long getVyshestojawaja_organizacija_id() {
		return _vw_Izvewenija.getVyshestojawaja_organizacija_id();
	}

	@Override
	public tj.sapp.services.model.VW_Izvewenija toEscapedModel() {
		return new VW_IzvewenijaWrapper(_vw_Izvewenija.toEscapedModel());
	}

	@Override
	public tj.sapp.services.model.VW_Izvewenija toUnescapedModel() {
		return new VW_IzvewenijaWrapper(_vw_Izvewenija.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vw_Izvewenija.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vw_Izvewenija.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_izmenenija of this v w_ izvewenija.
	*
	* @param data_izmenenija the data_izmenenija of this v w_ izvewenija
	*/
	@Override
	public void setData_izmenenija(Date data_izmenenija) {
		_vw_Izvewenija.setData_izmenenija(data_izmenenija);
	}

	/**
	* Sets the data_podvedenija_itogov of this v w_ izvewenija.
	*
	* @param data_podvedenija_itogov the data_podvedenija_itogov of this v w_ izvewenija
	*/
	@Override
	public void setData_podvedenija_itogov(Date data_podvedenija_itogov) {
		_vw_Izvewenija.setData_podvedenija_itogov(data_podvedenija_itogov);
	}

	/**
	* Sets the data_publikacii of this v w_ izvewenija.
	*
	* @param data_publikacii the data_publikacii of this v w_ izvewenija
	*/
	@Override
	public void setData_publikacii(Date data_publikacii) {
		_vw_Izvewenija.setData_publikacii(data_publikacii);
	}

	/**
	* Sets the data_sozdanija of this v w_ izvewenija.
	*
	* @param data_sozdanija the data_sozdanija of this v w_ izvewenija
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_vw_Izvewenija.setData_sozdanija(data_sozdanija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vw_Izvewenija.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vw_Izvewenija.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vw_Izvewenija.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izmenil of this v w_ izvewenija.
	*
	* @param izmenil the izmenil of this v w_ izvewenija
	*/
	@Override
	public void setIzmenil(long izmenil) {
		_vw_Izvewenija.setIzmenil(izmenil);
	}

	/**
	* Sets the izvewenija_id of this v w_ izvewenija.
	*
	* @param izvewenija_id the izvewenija_id of this v w_ izvewenija
	*/
	@Override
	public void setIzvewenija_id(long izvewenija_id) {
		_vw_Izvewenija.setIzvewenija_id(izvewenija_id);
	}

	/**
	* Sets the je_pochta of this v w_ izvewenija.
	*
	* @param je_pochta the je_pochta of this v w_ izvewenija
	*/
	@Override
	public void setJe_pochta(java.lang.String je_pochta) {
		_vw_Izvewenija.setJe_pochta(je_pochta);
	}

	/**
	* Sets the kod_id of this v w_ izvewenija.
	*
	* @param kod_id the kod_id of this v w_ izvewenija
	*/
	@Override
	public void setKod_id(long kod_id) {
		_vw_Izvewenija.setKod_id(kod_id);
	}

	/**
	* Sets the kontaktnoe_lico of this v w_ izvewenija.
	*
	* @param kontaktnoe_lico the kontaktnoe_lico of this v w_ izvewenija
	*/
	@Override
	public void setKontaktnoe_lico(java.lang.String kontaktnoe_lico) {
		_vw_Izvewenija.setKontaktnoe_lico(kontaktnoe_lico);
	}

	/**
	* Sets the kontaktnyj_telefon of this v w_ izvewenija.
	*
	* @param kontaktnyj_telefon the kontaktnyj_telefon of this v w_ izvewenija
	*/
	@Override
	public void setKontaktnyj_telefon(java.lang.String kontaktnyj_telefon) {
		_vw_Izvewenija.setKontaktnyj_telefon(kontaktnyj_telefon);
	}

	/**
	* Sets the naimenovanie of this v w_ izvewenija.
	*
	* @param naimenovanie the naimenovanie of this v w_ izvewenija
	*/
	@Override
	public void setNaimenovanie(java.lang.String naimenovanie) {
		_vw_Izvewenija.setNaimenovanie(naimenovanie);
	}

	@Override
	public void setNew(boolean n) {
		_vw_Izvewenija.setNew(n);
	}

	/**
	* Sets the organizacija_id of this v w_ izvewenija.
	*
	* @param organizacija_id the organizacija_id of this v w_ izvewenija
	*/
	@Override
	public void setOrganizacija_id(long organizacija_id) {
		_vw_Izvewenija.setOrganizacija_id(organizacija_id);
	}

	/**
	* Sets the po_istecheniju_dnej of this v w_ izvewenija.
	*
	* @param po_istecheniju_dnej the po_istecheniju_dnej of this v w_ izvewenija
	*/
	@Override
	public void setPo_istecheniju_dnej(int po_istecheniju_dnej) {
		_vw_Izvewenija.setPo_istecheniju_dnej(po_istecheniju_dnej);
	}

	/**
	* Sets the primary key of this v w_ izvewenija.
	*
	* @param primaryKey the primary key of this v w_ izvewenija
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vw_Izvewenija.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vw_Izvewenija.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the put_a of this v w_ izvewenija.
	*
	* @param put_a the put_a of this v w_ izvewenija
	*/
	@Override
	public void setPut_a(int put_a) {
		_vw_Izvewenija.setPut_a(put_a);
	}

	/**
	* Sets the put_b of this v w_ izvewenija.
	*
	* @param put_b the put_b of this v w_ izvewenija
	*/
	@Override
	public void setPut_b(int put_b) {
		_vw_Izvewenija.setPut_b(put_b);
	}

	/**
	* Sets the put_c of this v w_ izvewenija.
	*
	* @param put_c the put_c of this v w_ izvewenija
	*/
	@Override
	public void setPut_c(java.lang.String put_c) {
		_vw_Izvewenija.setPut_c(put_c);
	}

	/**
	* Sets the sostojanie_id of this v w_ izvewenija.
	*
	* @param sostojanie_id the sostojanie_id of this v w_ izvewenija
	*/
	@Override
	public void setSostojanie_id(long sostojanie_id) {
		_vw_Izvewenija.setSostojanie_id(sostojanie_id);
	}

	/**
	* Sets the sozdal of this v w_ izvewenija.
	*
	* @param sozdal the sozdal of this v w_ izvewenija
	*/
	@Override
	public void setSozdal(long sozdal) {
		_vw_Izvewenija.setSozdal(sozdal);
	}

	/**
	* Sets the status_id of this v w_ izvewenija.
	*
	* @param status_id the status_id of this v w_ izvewenija
	*/
	@Override
	public void setStatus_id(long status_id) {
		_vw_Izvewenija.setStatus_id(status_id);
	}

	/**
	* Sets the tip_izvewenija_id of this v w_ izvewenija.
	*
	* @param tip_izvewenija_id the tip_izvewenija_id of this v w_ izvewenija
	*/
	@Override
	public void setTip_izvewenija_id(long tip_izvewenija_id) {
		_vw_Izvewenija.setTip_izvewenija_id(tip_izvewenija_id);
	}

	/**
	* Sets the vyshestojawaja_organizacija_id of this v w_ izvewenija.
	*
	* @param vyshestojawaja_organizacija_id the vyshestojawaja_organizacija_id of this v w_ izvewenija
	*/
	@Override
	public void setVyshestojawaja_organizacija_id(
		long vyshestojawaja_organizacija_id) {
		_vw_Izvewenija.setVyshestojawaja_organizacija_id(vyshestojawaja_organizacija_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VW_IzvewenijaWrapper)) {
			return false;
		}

		VW_IzvewenijaWrapper vw_IzvewenijaWrapper = (VW_IzvewenijaWrapper)obj;

		if (Objects.equals(_vw_Izvewenija, vw_IzvewenijaWrapper._vw_Izvewenija)) {
			return true;
		}

		return false;
	}

	@Override
	public VW_Izvewenija getWrappedModel() {
		return _vw_Izvewenija;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vw_Izvewenija.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vw_Izvewenija.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vw_Izvewenija.resetOriginalValues();
	}

	private final VW_Izvewenija _vw_Izvewenija;
}