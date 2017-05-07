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

package tj.balans.postavwika.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import tj.balans.postavwika.model.SalansPostavwika;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing SalansPostavwika in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see SalansPostavwika
 * @generated
 */
@ProviderType
public class SalansPostavwikaCacheModel implements CacheModel<SalansPostavwika>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SalansPostavwikaCacheModel)) {
			return false;
		}

		SalansPostavwikaCacheModel salansPostavwikaCacheModel = (SalansPostavwikaCacheModel)obj;

		if (balans_postavwika_id == salansPostavwikaCacheModel.balans_postavwika_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, balans_postavwika_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{balans_postavwika_id=");
		sb.append(balans_postavwika_id);
		sb.append(", postavwik_id=");
		sb.append(postavwik_id);
		sb.append(", balans=");
		sb.append(balans);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SalansPostavwika toEntityModel() {
		SalansPostavwikaImpl salansPostavwikaImpl = new SalansPostavwikaImpl();

		salansPostavwikaImpl.setBalans_postavwika_id(balans_postavwika_id);
		salansPostavwikaImpl.setPostavwik_id(postavwik_id);
		salansPostavwikaImpl.setBalans(balans);

		salansPostavwikaImpl.resetOriginalValues();

		return salansPostavwikaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		balans_postavwika_id = objectInput.readLong();

		postavwik_id = objectInput.readLong();

		balans = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(balans_postavwika_id);

		objectOutput.writeLong(postavwik_id);

		objectOutput.writeDouble(balans);
	}

	public long balans_postavwika_id;
	public long postavwik_id;
	public double balans;
}