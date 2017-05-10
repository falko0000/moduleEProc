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
import tj.zajavki.ot.postavwikov.service.base.ZajavkiOtPostavwikovLocalServiceBaseImpl;

/**
 * The implementation of the zajavki ot postavwikov local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.zajavki.ot.postavwikov.service.ZajavkiOtPostavwikovLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ZajavkiOtPostavwikovLocalServiceBaseImpl
 * @see tj.zajavki.ot.postavwikov.service.ZajavkiOtPostavwikovLocalServiceUtil
 */
@ProviderType
public class ZajavkiOtPostavwikovLocalServiceImpl
	extends ZajavkiOtPostavwikovLocalServiceBaseImpl {
	
	public List<ZajavkiOtPostavwikov> getZajavkiOtPostavwikovs(long tovar_id) 
	{
		return zajavkiOtPostavwikovPersistence.findByTovarId(tovar_id);
	}
	
	public List<ZajavkiOtPostavwikov> getZajavkiOtPostavwikovs(long tovar_id, long postavwik_id) 
	{
		return zajavkiOtPostavwikovPersistence.findByTavarIdPostavwikId(tovar_id, postavwik_id);
	}
	
	public Map<Long, ZajavkiOtPostavwikov> getMapZajavkiOtPostavwikovs(long tovar_id, long postavwik_id) 
	{
		Map<Long, ZajavkiOtPostavwikov> zajavka = new HashMap<Long, ZajavkiOtPostavwikov>();
		
		for(ZajavkiOtPostavwikov otPostavwikov : getZajavkiOtPostavwikovs(tovar_id,postavwik_id ))
		
			zajavka.put(otPostavwikov.getZajavki_ot_postavwikov_id(), otPostavwikov);
			
			return zajavka;
	}
	
	public int getCountZajavkiOtPostavwikovs(long tovar_id, long postavwik_id)
	{
		return zajavkiOtPostavwikovPersistence.countByTavarIdPostavwikId(tovar_id, postavwik_id);
	}
	
	public int getCountLotId(long lot_id)
	{
		return zajavkiOtPostavwikovPersistence.countByLotId(lot_id);
	}
	
}