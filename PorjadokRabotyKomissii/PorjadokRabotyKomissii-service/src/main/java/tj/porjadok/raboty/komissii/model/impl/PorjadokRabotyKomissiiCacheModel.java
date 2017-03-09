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

package tj.porjadok.raboty.komissii.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PorjadokRabotyKomissii in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see PorjadokRabotyKomissii
 * @generated
 */
@ProviderType
public class PorjadokRabotyKomissiiCacheModel implements CacheModel<PorjadokRabotyKomissii>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PorjadokRabotyKomissiiCacheModel)) {
			return false;
		}

		PorjadokRabotyKomissiiCacheModel porjadokRabotyKomissiiCacheModel = (PorjadokRabotyKomissiiCacheModel)obj;

		if (porjadok_raboty_komissii_id == porjadokRabotyKomissiiCacheModel.porjadok_raboty_komissii_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, porjadok_raboty_komissii_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{data_izmenenija=");
		sb.append(data_izmenenija);
		sb.append(", data_podvedenija_itogov=");
		sb.append(data_podvedenija_itogov);
		sb.append(", data_publikacii=");
		sb.append(data_publikacii);
		sb.append(", data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", izmenil=");
		sb.append(izmenil);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", po_istecheniju_dnej=");
		sb.append(po_istecheniju_dnej);
		sb.append(", porjadok_raboty_komissii_id=");
		sb.append(porjadok_raboty_komissii_id);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PorjadokRabotyKomissii toEntityModel() {
		PorjadokRabotyKomissiiImpl porjadokRabotyKomissiiImpl = new PorjadokRabotyKomissiiImpl();

		if (data_izmenenija == Long.MIN_VALUE) {
			porjadokRabotyKomissiiImpl.setData_izmenenija(null);
		}
		else {
			porjadokRabotyKomissiiImpl.setData_izmenenija(new Date(
					data_izmenenija));
		}

		if (data_podvedenija_itogov == Long.MIN_VALUE) {
			porjadokRabotyKomissiiImpl.setData_podvedenija_itogov(null);
		}
		else {
			porjadokRabotyKomissiiImpl.setData_podvedenija_itogov(new Date(
					data_podvedenija_itogov));
		}

		if (data_publikacii == Long.MIN_VALUE) {
			porjadokRabotyKomissiiImpl.setData_publikacii(null);
		}
		else {
			porjadokRabotyKomissiiImpl.setData_publikacii(new Date(
					data_publikacii));
		}

		if (data_sozdanija == Long.MIN_VALUE) {
			porjadokRabotyKomissiiImpl.setData_sozdanija(null);
		}
		else {
			porjadokRabotyKomissiiImpl.setData_sozdanija(new Date(
					data_sozdanija));
		}

		porjadokRabotyKomissiiImpl.setIzmenil(izmenil);
		porjadokRabotyKomissiiImpl.setIzvewenie_id(izvewenie_id);
		porjadokRabotyKomissiiImpl.setPo_istecheniju_dnej(po_istecheniju_dnej);
		porjadokRabotyKomissiiImpl.setPorjadok_raboty_komissii_id(porjadok_raboty_komissii_id);
		porjadokRabotyKomissiiImpl.setSozdal(sozdal);

		porjadokRabotyKomissiiImpl.resetOriginalValues();

		return porjadokRabotyKomissiiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_izmenenija = objectInput.readLong();
		data_podvedenija_itogov = objectInput.readLong();
		data_publikacii = objectInput.readLong();
		data_sozdanija = objectInput.readLong();

		izmenil = objectInput.readLong();

		izvewenie_id = objectInput.readLong();

		po_istecheniju_dnej = objectInput.readLong();

		porjadok_raboty_komissii_id = objectInput.readLong();

		sozdal = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_izmenenija);
		objectOutput.writeLong(data_podvedenija_itogov);
		objectOutput.writeLong(data_publikacii);
		objectOutput.writeLong(data_sozdanija);

		objectOutput.writeLong(izmenil);

		objectOutput.writeLong(izvewenie_id);

		objectOutput.writeLong(po_istecheniju_dnej);

		objectOutput.writeLong(porjadok_raboty_komissii_id);

		objectOutput.writeLong(sozdal);
	}

	public long data_izmenenija;
	public long data_podvedenija_itogov;
	public long data_publikacii;
	public long data_sozdanija;
	public long izmenil;
	public long izvewenie_id;
	public long po_istecheniju_dnej;
	public long porjadok_raboty_komissii_id;
	public long sozdal;
}