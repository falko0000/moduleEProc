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

package tj.zajavki.ot.postavwikov.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import aQute.bnd.annotation.ProviderType;
import tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikov;
import tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp;
import tj.zajavki.ot.postavwikov.service.base.ZajavkiOtPostavwikovTempLocalServiceBaseImpl;

/**
 * The implementation of the zajavki ot postavwikov temp local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.zajavki.ot.postavwikov.service.ZajavkiOtPostavwikovTempLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ZajavkiOtPostavwikovTempLocalServiceBaseImpl
 * @see tj.zajavki.ot.postavwikov.service.ZajavkiOtPostavwikovTempLocalServiceUtil
 */
@ProviderType
public class ZajavkiOtPostavwikovTempLocalServiceImpl
	extends ZajavkiOtPostavwikovTempLocalServiceBaseImpl {

	public List<ZajavkiOtPostavwikovTemp> getZajavkiOtPostavwikovs(long tovar_id) 
	{
		return zajavkiOtPostavwikovTempPersistence.findByTovarId(tovar_id);
	}
	
	public List<ZajavkiOtPostavwikovTemp> getZajavkiOtPostavwikovs(long lot_id, long postavwik_id) 
	{
		return zajavkiOtPostavwikovTempPersistence.findByLotIdPostavwikId(lot_id, postavwik_id);
	}
	
	public Map<Long, ZajavkiOtPostavwikovTemp> getMapZajavkiOtPostavwikovs(long lot_id, long postavwik_id) 
	{
		Map<Long, ZajavkiOtPostavwikovTemp> zajavka = new HashMap<Long, ZajavkiOtPostavwikovTemp>();
		
		List<ZajavkiOtPostavwikovTemp> zajavkiOtPostavwikovs =  getZajavkiOtPostavwikovs(lot_id,postavwik_id );
		
		for(ZajavkiOtPostavwikovTemp otPostavwikov : zajavkiOtPostavwikovs)
		
			zajavka.put(otPostavwikov.getTovar_id(), otPostavwikov);
			
			return zajavka;
	}
	
	public int getCountZajavkiOtPostavwikovs(long lot_id, long postavwik_id)
	{
		return zajavkiOtPostavwikovTempPersistence.countByLotIdPostavwikId(lot_id, postavwik_id);
	}
	
	public int getCountLotId(long lot_id)
	{
		return zajavkiOtPostavwikovTempPersistence.countByLotId(lot_id);
	}
	
	public boolean compareTo(ZajavkiOtPostavwikovTemp otPostavwikovTemp,
			                 String predlozhenie_postavwika, String opisanie_tovara,
			                 long kod_strany_proizvoditelja, double summa_za_edinicu_tovara)
	{
	   boolean result = true;	
		if(!otPostavwikovTemp.getPredlozhenie_postavwika().equals(predlozhenie_postavwika)
				   || !otPostavwikovTemp.getOpisanie_tovara().equals(opisanie_tovara)
				   || otPostavwikovTemp.getKod_strany_proizvoditelja()!=kod_strany_proizvoditelja
				   || otPostavwikovTemp.getSumma_za_edinicu_tovara()!= summa_za_edinicu_tovara)
	               	result = false;
		return result;
	}
}