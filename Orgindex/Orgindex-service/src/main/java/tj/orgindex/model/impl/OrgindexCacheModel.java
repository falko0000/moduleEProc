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

package tj.orgindex.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.orgindex.model.Orgindex;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Orgindex in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Orgindex
 * @generated
 */
@ProviderType
public class OrgindexCacheModel implements CacheModel<Orgindex>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OrgindexCacheModel)) {
			return false;
		}

		OrgindexCacheModel orgindexCacheModel = (OrgindexCacheModel)obj;

		if (orgindex_id == orgindexCacheModel.orgindex_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, orgindex_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{orgindex_id=");
		sb.append(orgindex_id);
		sb.append(", organization_id=");
		sb.append(organization_id);
		sb.append(", subdivision_index=");
		sb.append(subdivision_index);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append(", izmenil=");
		sb.append(izmenil);
		sb.append(", data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", data_izmenenija=");
		sb.append(data_izmenenija);
		sb.append(", name=");
		sb.append(name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Orgindex toEntityModel() {
		OrgindexImpl orgindexImpl = new OrgindexImpl();

		orgindexImpl.setOrgindex_id(orgindex_id);
		orgindexImpl.setOrganization_id(organization_id);
		orgindexImpl.setSubdivision_index(subdivision_index);
		orgindexImpl.setSozdal(sozdal);
		orgindexImpl.setIzmenil(izmenil);

		if (data_sozdanija == Long.MIN_VALUE) {
			orgindexImpl.setData_sozdanija(null);
		}
		else {
			orgindexImpl.setData_sozdanija(new Date(data_sozdanija));
		}

		if (data_izmenenija == Long.MIN_VALUE) {
			orgindexImpl.setData_izmenenija(null);
		}
		else {
			orgindexImpl.setData_izmenenija(new Date(data_izmenenija));
		}

		if (name == null) {
			orgindexImpl.setName(StringPool.BLANK);
		}
		else {
			orgindexImpl.setName(name);
		}

		orgindexImpl.resetOriginalValues();

		return orgindexImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		orgindex_id = objectInput.readLong();

		organization_id = objectInput.readLong();

		subdivision_index = objectInput.readInt();

		sozdal = objectInput.readLong();

		izmenil = objectInput.readLong();
		data_sozdanija = objectInput.readLong();
		data_izmenenija = objectInput.readLong();
		name = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(orgindex_id);

		objectOutput.writeLong(organization_id);

		objectOutput.writeInt(subdivision_index);

		objectOutput.writeLong(sozdal);

		objectOutput.writeLong(izmenil);
		objectOutput.writeLong(data_sozdanija);
		objectOutput.writeLong(data_izmenenija);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}
	}

	public long orgindex_id;
	public long organization_id;
	public int subdivision_index;
	public long sozdal;
	public long izmenil;
	public long data_sozdanija;
	public long data_izmenenija;
	public String name;
}