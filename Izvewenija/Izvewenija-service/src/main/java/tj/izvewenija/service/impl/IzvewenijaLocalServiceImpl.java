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

package tj.izvewenija.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.PortalUtil;

import aQute.bnd.annotation.ProviderType;

import tj.izvewenija.service.base.IzvewenijaLocalServiceBaseImpl;
import tj.izvewenija.model.Izvewenija;
import tj.izvewenija.model.impl.IzvewenijaImpl;
import tj.izvewenija.service.persistence.IzvewenijaPersistence;
/**
 * The implementation of the izvewenija local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.izvewenija.service.IzvewenijaLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IzvewenijaLocalServiceBaseImpl
 * @see tj.izvewenija.service.IzvewenijaLocalServiceUtil
 */
@ProviderType
public class IzvewenijaLocalServiceImpl extends IzvewenijaLocalServiceBaseImpl {

	public Izvewenija insertIzvewenija( long sostojanie_id, long status_id, long tip_izvewenija_id, 
			                            long organizacija_id, String naimenovanie, ServiceContext serviceContext )
	{
		Izvewenija izvewenija = new IzvewenijaImpl();
		
		izvewenija.setSostojanie_id(sostojanie_id);
		izvewenija.setStatus_id(status_id);
		izvewenija.setTip_izvewenija_id(tip_izvewenija_id);
		izvewenija.setOrganizacija_id(organizacija_id);
		izvewenija.setNaimenovanie(naimenovanie);
		
		izvewenija.setCreateDate(new Date());
		izvewenija.setModifiedDate(new Date());
		
		izvewenija.setSozdal(serviceContext.getUserId());
		izvewenija.setIzmenil(serviceContext.getUserId());
		
		izvewenija.setCompanyId(serviceContext.getCompanyId());
		izvewenija.setGroupId(serviceContext.getScopeGroupId());
		izvewenija.setUserId(serviceContext.getUserId());
		izvewenija.setUserName(PortalUtil.getUserName(serviceContext.getUserId(), "Valiqul"));
	    
		izvewenija = addIzvewenija(izvewenija);
		
		System.out.println(izvewenija);
		try {
			resourceLocalService.addModelResources(izvewenija, serviceContext);
			} catch (PortalException e) {
			e.printStackTrace();
			} catch (SystemException e) {
			e.printStackTrace();
			}
		
		return izvewenija;
	}
	
	public List<Izvewenija> getIzvewenija( long companyId, long groupId) 
			throws SystemException {
		
		return izvewenijaPersistence.findByCompanyId_GroupId(companyId, groupId);
	}
	
	public int getCountIzvewenija(long companyId, long groupId)
	{
		
		return izvewenijaPersistence.countByCompanyId_GroupId(companyId, groupId);
	}
	
}