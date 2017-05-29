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

package tj.prochaja.informacija.dlja.zajavki.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class ProchajaInformacijaDljaZajavkiSoap implements Serializable {
	public static ProchajaInformacijaDljaZajavkiSoap toSoapModel(
		ProchajaInformacijaDljaZajavki model) {
		ProchajaInformacijaDljaZajavkiSoap soapModel = new ProchajaInformacijaDljaZajavkiSoap();

		soapModel.setCena_postavki(model.getCena_postavki());
		soapModel.setCena_postavki_soglasno_zakazchiku(model.getCena_postavki_soglasno_zakazchiku());
		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setLot_id(model.getLot_id());
		soapModel.setMesto_postavki(model.getMesto_postavki());
		soapModel.setMesto_postavki_soglasno_zakazchiku(model.getMesto_postavki_soglasno_zakazchiku());
		soapModel.setOplata(model.getOplata());
		soapModel.setOplata_soglasno_zakazchiku(model.getOplata_soglasno_zakazchiku());
		soapModel.setPostavwik_id(model.getPostavwik_id());
		soapModel.setProchaja_informacija_dlja_zajavki_id(model.getProchaja_informacija_dlja_zajavki_id());
		soapModel.setSoputstvujuwie_uslovija(model.getSoputstvujuwie_uslovija());
		soapModel.setSoputstvujuwie_uslovija_soglasno_zakazchiku(model.getSoputstvujuwie_uslovija_soglasno_zakazchiku());
		soapModel.setSozdal(model.getSozdal());
		soapModel.setSrok_dejstvija(model.getSrok_dejstvija());
		soapModel.setSrok_dejstvija_soglasno_zakazchiku(model.getSrok_dejstvija_soglasno_zakazchiku());
		soapModel.setSrok_ispolnenija_zajavki(model.getSrok_ispolnenija_zajavki());
		soapModel.setSrok_ispolnenija_zajavki_soglasno_zakazchiku(model.getSrok_ispolnenija_zajavki_soglasno_zakazchiku());
		soapModel.setSrok_obespechenija_zajavki(model.getSrok_obespechenija_zajavki());
		soapModel.setSrok_obespechenija_zajavki_soglasno_zakazchiku(model.getSrok_obespechenija_zajavki_soglasno_zakazchiku());
		soapModel.setSrok_postavki(model.getSrok_postavki());
		soapModel.setSrok_postavki_soglasno_zakazchiku(model.getSrok_postavki_soglasno_zakazchiku());

		return soapModel;
	}

	public static ProchajaInformacijaDljaZajavkiSoap[] toSoapModels(
		ProchajaInformacijaDljaZajavki[] models) {
		ProchajaInformacijaDljaZajavkiSoap[] soapModels = new ProchajaInformacijaDljaZajavkiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProchajaInformacijaDljaZajavkiSoap[][] toSoapModels(
		ProchajaInformacijaDljaZajavki[][] models) {
		ProchajaInformacijaDljaZajavkiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ProchajaInformacijaDljaZajavkiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProchajaInformacijaDljaZajavkiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProchajaInformacijaDljaZajavkiSoap[] toSoapModels(
		List<ProchajaInformacijaDljaZajavki> models) {
		List<ProchajaInformacijaDljaZajavkiSoap> soapModels = new ArrayList<ProchajaInformacijaDljaZajavkiSoap>(models.size());

		for (ProchajaInformacijaDljaZajavki model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProchajaInformacijaDljaZajavkiSoap[soapModels.size()]);
	}

	public ProchajaInformacijaDljaZajavkiSoap() {
	}

	public long getPrimaryKey() {
		return _prochaja_informacija_dlja_zajavki_id;
	}

	public void setPrimaryKey(long pk) {
		setProchaja_informacija_dlja_zajavki_id(pk);
	}

	public String getCena_postavki() {
		return _cena_postavki;
	}

	public void setCena_postavki(String cena_postavki) {
		_cena_postavki = cena_postavki;
	}

	public int getCena_postavki_soglasno_zakazchiku() {
		return _cena_postavki_soglasno_zakazchiku;
	}

	public void setCena_postavki_soglasno_zakazchiku(
		int cena_postavki_soglasno_zakazchiku) {
		_cena_postavki_soglasno_zakazchiku = cena_postavki_soglasno_zakazchiku;
	}

	public Date getData_sozdanija() {
		return _data_sozdanija;
	}

	public void setData_sozdanija(Date data_sozdanija) {
		_data_sozdanija = data_sozdanija;
	}

	public long getIzvewenie_id() {
		return _izvewenie_id;
	}

	public void setIzvewenie_id(long izvewenie_id) {
		_izvewenie_id = izvewenie_id;
	}

	public long getLot_id() {
		return _lot_id;
	}

	public void setLot_id(long lot_id) {
		_lot_id = lot_id;
	}

	public String getMesto_postavki() {
		return _mesto_postavki;
	}

	public void setMesto_postavki(String mesto_postavki) {
		_mesto_postavki = mesto_postavki;
	}

	public int getMesto_postavki_soglasno_zakazchiku() {
		return _mesto_postavki_soglasno_zakazchiku;
	}

	public void setMesto_postavki_soglasno_zakazchiku(
		int mesto_postavki_soglasno_zakazchiku) {
		_mesto_postavki_soglasno_zakazchiku = mesto_postavki_soglasno_zakazchiku;
	}

	public String getOplata() {
		return _oplata;
	}

	public void setOplata(String oplata) {
		_oplata = oplata;
	}

	public int getOplata_soglasno_zakazchiku() {
		return _oplata_soglasno_zakazchiku;
	}

	public void setOplata_soglasno_zakazchiku(int oplata_soglasno_zakazchiku) {
		_oplata_soglasno_zakazchiku = oplata_soglasno_zakazchiku;
	}

	public long getPostavwik_id() {
		return _postavwik_id;
	}

	public void setPostavwik_id(long postavwik_id) {
		_postavwik_id = postavwik_id;
	}

	public long getProchaja_informacija_dlja_zajavki_id() {
		return _prochaja_informacija_dlja_zajavki_id;
	}

	public void setProchaja_informacija_dlja_zajavki_id(
		long prochaja_informacija_dlja_zajavki_id) {
		_prochaja_informacija_dlja_zajavki_id = prochaja_informacija_dlja_zajavki_id;
	}

	public String getSoputstvujuwie_uslovija() {
		return _soputstvujuwie_uslovija;
	}

	public void setSoputstvujuwie_uslovija(String soputstvujuwie_uslovija) {
		_soputstvujuwie_uslovija = soputstvujuwie_uslovija;
	}

	public int getSoputstvujuwie_uslovija_soglasno_zakazchiku() {
		return _soputstvujuwie_uslovija_soglasno_zakazchiku;
	}

	public void setSoputstvujuwie_uslovija_soglasno_zakazchiku(
		int soputstvujuwie_uslovija_soglasno_zakazchiku) {
		_soputstvujuwie_uslovija_soglasno_zakazchiku = soputstvujuwie_uslovija_soglasno_zakazchiku;
	}

	public long getSozdal() {
		return _sozdal;
	}

	public void setSozdal(long sozdal) {
		_sozdal = sozdal;
	}

	public String getSrok_dejstvija() {
		return _srok_dejstvija;
	}

	public void setSrok_dejstvija(String srok_dejstvija) {
		_srok_dejstvija = srok_dejstvija;
	}

	public int getSrok_dejstvija_soglasno_zakazchiku() {
		return _srok_dejstvija_soglasno_zakazchiku;
	}

	public void setSrok_dejstvija_soglasno_zakazchiku(
		int srok_dejstvija_soglasno_zakazchiku) {
		_srok_dejstvija_soglasno_zakazchiku = srok_dejstvija_soglasno_zakazchiku;
	}

	public String getSrok_ispolnenija_zajavki() {
		return _srok_ispolnenija_zajavki;
	}

	public void setSrok_ispolnenija_zajavki(String srok_ispolnenija_zajavki) {
		_srok_ispolnenija_zajavki = srok_ispolnenija_zajavki;
	}

	public int getSrok_ispolnenija_zajavki_soglasno_zakazchiku() {
		return _srok_ispolnenija_zajavki_soglasno_zakazchiku;
	}

	public void setSrok_ispolnenija_zajavki_soglasno_zakazchiku(
		int srok_ispolnenija_zajavki_soglasno_zakazchiku) {
		_srok_ispolnenija_zajavki_soglasno_zakazchiku = srok_ispolnenija_zajavki_soglasno_zakazchiku;
	}

	public String getSrok_obespechenija_zajavki() {
		return _srok_obespechenija_zajavki;
	}

	public void setSrok_obespechenija_zajavki(String srok_obespechenija_zajavki) {
		_srok_obespechenija_zajavki = srok_obespechenija_zajavki;
	}

	public int getSrok_obespechenija_zajavki_soglasno_zakazchiku() {
		return _srok_obespechenija_zajavki_soglasno_zakazchiku;
	}

	public void setSrok_obespechenija_zajavki_soglasno_zakazchiku(
		int srok_obespechenija_zajavki_soglasno_zakazchiku) {
		_srok_obespechenija_zajavki_soglasno_zakazchiku = srok_obespechenija_zajavki_soglasno_zakazchiku;
	}

	public String getSrok_postavki() {
		return _srok_postavki;
	}

	public void setSrok_postavki(String srok_postavki) {
		_srok_postavki = srok_postavki;
	}

	public int getSrok_postavki_soglasno_zakazchiku() {
		return _srok_postavki_soglasno_zakazchiku;
	}

	public void setSrok_postavki_soglasno_zakazchiku(
		int srok_postavki_soglasno_zakazchiku) {
		_srok_postavki_soglasno_zakazchiku = srok_postavki_soglasno_zakazchiku;
	}

	private String _cena_postavki;
	private int _cena_postavki_soglasno_zakazchiku;
	private Date _data_sozdanija;
	private long _izvewenie_id;
	private long _lot_id;
	private String _mesto_postavki;
	private int _mesto_postavki_soglasno_zakazchiku;
	private String _oplata;
	private int _oplata_soglasno_zakazchiku;
	private long _postavwik_id;
	private long _prochaja_informacija_dlja_zajavki_id;
	private String _soputstvujuwie_uslovija;
	private int _soputstvujuwie_uslovija_soglasno_zakazchiku;
	private long _sozdal;
	private String _srok_dejstvija;
	private int _srok_dejstvija_soglasno_zakazchiku;
	private String _srok_ispolnenija_zajavki;
	private int _srok_ispolnenija_zajavki_soglasno_zakazchiku;
	private String _srok_obespechenija_zajavki;
	private int _srok_obespechenija_zajavki_soglasno_zakazchiku;
	private String _srok_postavki;
	private int _srok_postavki_soglasno_zakazchiku;
}