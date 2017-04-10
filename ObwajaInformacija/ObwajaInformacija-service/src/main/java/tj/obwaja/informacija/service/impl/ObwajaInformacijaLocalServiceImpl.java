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

package tj.obwaja.informacija.service.impl;

import java.util.Collections;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Phone;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

import aQute.bnd.annotation.ProviderType;

import tj.obwaja.informacija.exception.NoSuchObwajaInformacijaException;
import tj.obwaja.informacija.model.ObwajaInformacija;
import tj.obwaja.informacija.model.impl.ObwajaInformacijaImpl;
import tj.obwaja.informacija.service.base.ObwajaInformacijaLocalServiceBaseImpl;

/**
 * The implementation of the obwaja informacija local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.obwaja.informacija.service.ObwajaInformacijaLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ObwajaInformacijaLocalServiceBaseImpl
 * @see tj.obwaja.informacija.service.ObwajaInformacijaLocalServiceUtil
 */
@ProviderType
public class ObwajaInformacijaLocalServiceImpl
	extends ObwajaInformacijaLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link tj.obwaja.informacija.service.ObwajaInformacijaLocalServiceUtil} to access the obwaja informacija local service.
	 */
	public ObwajaInformacija getObInfoByIzvewenieId(long izvewenie_id) throws NoSuchObwajaInformacijaException
	{
		return obwajaInformacijaPersistence.findByIzvewenieID(izvewenie_id);
	}
	
	
	public ObwajaInformacija getObInfoByIzvewenieId(long IzvewenijaID , long userId)  {
		
		ObwajaInformacija obwaja_informacija = new ObwajaInformacijaImpl();
		String phone = "";
		String email = "";
		String fullname = "";
		try {
			obwaja_informacija = obwajaInformacijaPersistence.findByIzvewenieID(IzvewenijaID);
		} catch (NoSuchObwajaInformacijaException e) {
			 List<Phone>   phones  = Collections.emptyList();
			 
			 try {
				User user = UserLocalServiceUtil.getUser(userId);
				phones  = user.getPhones();
				
				if(!phones.isEmpty())
					phone = phones.get(0).getNumber();
                
				email = user.getEmailAddress();
				fullname = user.getFullName(false, true);
				
				obwaja_informacija.setJe_pochta(email);
				obwaja_informacija.setKontaktnyj_telefon(phone);
				obwaja_informacija.setKontaktnoe_lico(fullname);
			 } catch (PortalException e1) {
				
				
			}
			 
		} 
	    
		
        		
	    return obwaja_informacija;
	}
}