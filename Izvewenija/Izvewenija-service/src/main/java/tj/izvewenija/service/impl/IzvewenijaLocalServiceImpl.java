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

import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.AuditedModel;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.LayoutPrototype;
import com.liferay.portal.kernel.model.LayoutTypePortletConstants;
import com.liferay.portal.kernel.model.UserGroup;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.service.LayoutPrototypeLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserGroupLocalServiceUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.sites.kernel.util.SitesUtil;

import aQute.bnd.annotation.ProviderType;
import tj.izvewenija.service.IzvewenijaLocalServiceUtil;
import tj.izvewenija.service.base.IzvewenijaLocalServiceBaseImpl;
import tj.izvewenija.exception.NoSuchIzvewenijaException;
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
		
		long  izvewenija_id = CounterLocalServiceUtil.increment(Izvewenija.class.toString());
		Izvewenija izvewenija = IzvewenijaLocalServiceUtil.createIzvewenija(izvewenija_id);  
		
		      String description = description = "This group for member commission bid number "+String.valueOf(izvewenija.getIzvewenija_id());;
		      String groupName = "bid number " + String.valueOf(izvewenija.getIzvewenija_id());
		
		  UserGroup userGroup = null;
		  Group userGroupGroup = null;
		try {
			userGroup = UserGroupLocalServiceUtil.addUserGroup(serviceContext.getUserId(), serviceContext.getCompanyId(),
					groupName,description, serviceContext);
			    
			userGroupGroup = userGroup.getGroup();
			
	
			System.out.println(userGroup.toString());
			
		} catch (PortalException e1) {
			
		
		}
		
		
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
		izvewenija.setUserName(PortalUtil.getUserName(serviceContext.getUserId(), "--"));
	    
		izvewenija.setUserGroupId(userGroup.getUserGroupId());
		
		izvewenija = IzvewenijaLocalServiceUtil.addIzvewenija(izvewenija);
		
		
		try {
			resourceLocalService.addModelResources(izvewenija, serviceContext);
			
			} catch (PortalException e) {
			e.printStackTrace();
			} catch (SystemException e) {
			e.printStackTrace();
			}
		
		if(Validator.isNotNull(userGroup) && Validator.isNotNull(userGroupGroup))
		{
			 description = "This group for member commission bid number "+String.valueOf(izvewenija.getIzvewenija_id());
		     groupName = "bid number " + String.valueOf(izvewenija.getIzvewenija_id());
		     
		     
		     long layoutPrototypeId = 341821;
		     LayoutPrototype pageTemplate = null;
			try {
				pageTemplate = LayoutPrototypeLocalServiceUtil.getLayoutPrototype(layoutPrototypeId);
			} catch (PortalException e) {
				
			}
		     String templateUuid = pageTemplate.getUuid();
		     ServiceContext tserviceContext = new ServiceContext();
		     serviceContext.setAttribute("layoutPrototypeUuid", templateUuid);
		     serviceContext.setAttribute("layoutPrototypeLinkedEnabled", true);
				
		     try {
				LayoutLocalServiceUtil.addLayout(serviceContext.getUserId(), userGroupGroup.getGroupId(),
						                         false, 0, "BID NUMBER "+ String.valueOf(izvewenija.getIzvewenija_id()),
						                         "BID NUMBER "+ String.valueOf(izvewenija.getIzvewenija_id()),
						                         "BID NUMBER "+ String.valueOf(izvewenija.getIzvewenija_id()),
			
						                         "portlet", false, "/group-"+String.valueOf(userGroup.getUserGroupId()), tserviceContext);
				userGroup.setDescription(description);
				userGroup.setName(groupName);
				
				UserGroupLocalServiceUtil.updateUserGroup(userGroup);
		     } catch (PortalException e) {
			System.out.println("layout don't created");
			}
		  
		}
		return izvewenija;
	}
	 
	public Izvewenija updateIzvewenija( long izvewenija_id, long sostojanie_id, long status_id, long tip_izvewenija_id, 
            long organizacija_id, String naimenovanie, ServiceContext serviceContext ) throws PortalException
	{
		Izvewenija izvewenija = IzvewenijaLocalServiceUtil.getIzvewenija(izvewenija_id);

		izvewenija.setSostojanie_id(sostojanie_id);
		izvewenija.setStatus_id(status_id);
		izvewenija.setTip_izvewenija_id(tip_izvewenija_id);
		izvewenija.setOrganizacija_id(organizacija_id);
		izvewenija.setNaimenovanie(naimenovanie);

	
		izvewenija.setModifiedDate(new Date());

		
		izvewenija.setIzmenil(serviceContext.getUserId());

		
		
	

		izvewenija = updateIzvewenija(izvewenija);


	

return izvewenija;
}
	
	public List<Izvewenija> getIzvewenija( long companyId, long groupId) 
			throws SystemException {
		
		return izvewenijaPersistence.filterFindByCompanyId_GroupId(companyId, groupId);
	}
	
	public int getCountIzvewenija(long companyId, long groupId)
	{
		
		return izvewenijaPersistence.countByCompanyId_GroupId(companyId, groupId);
	}
	
	public List<Izvewenija> getIzvewenija( long companyId, long groupId, long sostojanie_ids[], long status_ids[]) 
			throws SystemException {
		
		return izvewenijaPersistence.filterFindByCompanyIdGroupIdSostojanieIdStatusId(companyId, groupId, sostojanie_ids, status_ids);
	}
	
	public Izvewenija getIzvewenijaByUserGroupId(long UserGroupId) {
		
	try {
		return izvewenijaPersistence.findByUserGroupId(UserGroupId);
	} catch (NoSuchIzvewenijaException e) {
		
	}
	return null;
	}
}