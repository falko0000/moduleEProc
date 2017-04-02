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

package tj.edinicy.izmerenija.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.edinicy.izmerenija.model.EdinicyIzmerenija;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EdinicyIzmerenija in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EdinicyIzmerenija
 * @generated
 */
@ProviderType
public class EdinicyIzmerenijaCacheModel implements CacheModel<EdinicyIzmerenija>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EdinicyIzmerenijaCacheModel)) {
			return false;
		}

		EdinicyIzmerenijaCacheModel edinicyIzmerenijaCacheModel = (EdinicyIzmerenijaCacheModel)obj;

		if (edinicy_izmerenija_id == edinicyIzmerenijaCacheModel.edinicy_izmerenija_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, edinicy_izmerenija_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{edinicy_izmerenija_id=");
		sb.append(edinicy_izmerenija_id);
		sb.append(", nazvanie=");
		sb.append(nazvanie);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EdinicyIzmerenija toEntityModel() {
		EdinicyIzmerenijaImpl edinicyIzmerenijaImpl = new EdinicyIzmerenijaImpl();

		edinicyIzmerenijaImpl.setEdinicy_izmerenija_id(edinicy_izmerenija_id);

		if (nazvanie == null) {
			edinicyIzmerenijaImpl.setNazvanie(StringPool.BLANK);
		}
		else {
			edinicyIzmerenijaImpl.setNazvanie(nazvanie);
		}

		edinicyIzmerenijaImpl.resetOriginalValues();

		return edinicyIzmerenijaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		edinicy_izmerenija_id = objectInput.readLong();
		nazvanie = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(edinicy_izmerenija_id);

		if (nazvanie == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nazvanie);
		}
	}

	public long edinicy_izmerenija_id;
	public String nazvanie;
}