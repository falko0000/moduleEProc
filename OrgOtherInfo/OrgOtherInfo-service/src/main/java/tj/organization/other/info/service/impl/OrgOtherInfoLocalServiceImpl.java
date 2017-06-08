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

package tj.organization.other.info.service.impl;

import aQute.bnd.annotation.ProviderType;
import tj.organization.other.info.exception.NoSuchOrgOtherInfoException;
import tj.organization.other.info.model.OrgOtherInfo;
import tj.organization.other.info.service.base.OrgOtherInfoLocalServiceBaseImpl;

/**
 * The implementation of the org other info local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.organization.other.info.service.OrgOtherInfoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OrgOtherInfoLocalServiceBaseImpl
 * @see tj.organization.other.info.service.OrgOtherInfoLocalServiceUtil
 */
@ProviderType
public class OrgOtherInfoLocalServiceImpl
	extends OrgOtherInfoLocalServiceBaseImpl {

	 public OrgOtherInfo getOrgOtherInfo(String inn) throws NoSuchOrgOtherInfoException {
		 
		 
		return orgOtherInfoPersistence.findByinn(inn);
	}
	 
	 public OrgOtherInfo getOrgOtherInfoByKey(long organization_id)  {
		 
		 OrgOtherInfo orgOtherInfo = null;
		 
		 try {
			orgOtherInfo =  orgOtherInfoPersistence.findByPrimaryKey(organization_id);
		} catch (NoSuchOrgOtherInfoException e) {
			
		}
		 
			return orgOtherInfo;
		}
	 	public OrgOtherInfo getOrgOtherInfoById(long organization_id)  {
		 
		 OrgOtherInfo orgOtherInfo = null;
		 
		 try {
			orgOtherInfo =  orgOtherInfoPersistence.findByOrgOtherInfoId(organization_id);
		} catch (NoSuchOrgOtherInfoException e) {
			
		}
		 
			return orgOtherInfo;
		}
}