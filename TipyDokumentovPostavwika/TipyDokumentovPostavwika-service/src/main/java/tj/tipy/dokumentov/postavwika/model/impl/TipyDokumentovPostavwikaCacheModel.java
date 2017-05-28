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

package tj.tipy.dokumentov.postavwika.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TipyDokumentovPostavwika in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see TipyDokumentovPostavwika
 * @generated
 */
@ProviderType
public class TipyDokumentovPostavwikaCacheModel implements CacheModel<TipyDokumentovPostavwika>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TipyDokumentovPostavwikaCacheModel)) {
			return false;
		}

		TipyDokumentovPostavwikaCacheModel tipyDokumentovPostavwikaCacheModel = (TipyDokumentovPostavwikaCacheModel)obj;

		if (tipy_dokumentov_postavwika_id == tipyDokumentovPostavwikaCacheModel.tipy_dokumentov_postavwika_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tipy_dokumentov_postavwika_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{tipy_dokumentov_postavwika_id=");
		sb.append(tipy_dokumentov_postavwika_id);
		sb.append(", tip=");
		sb.append(tip);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TipyDokumentovPostavwika toEntityModel() {
		TipyDokumentovPostavwikaImpl tipyDokumentovPostavwikaImpl = new TipyDokumentovPostavwikaImpl();

		tipyDokumentovPostavwikaImpl.setTipy_dokumentov_postavwika_id(tipy_dokumentov_postavwika_id);

		if (tip == null) {
			tipyDokumentovPostavwikaImpl.setTip(StringPool.BLANK);
		}
		else {
			tipyDokumentovPostavwikaImpl.setTip(tip);
		}

		tipyDokumentovPostavwikaImpl.resetOriginalValues();

		return tipyDokumentovPostavwikaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tipy_dokumentov_postavwika_id = objectInput.readInt();
		tip = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(tipy_dokumentov_postavwika_id);

		if (tip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tip);
		}
	}

	public int tipy_dokumentov_postavwika_id;
	public String tip;
}