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

package tj.prochaja.informacija.dlja.zajavki.service.impl;

import java.util.List;

import aQute.bnd.annotation.ProviderType;
import tj.prochaja.informacija.dlja.zajavki.exception.NoSuchProchajaInformacijaDljaZajavkiException;
import tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki;
import tj.prochaja.informacija.dlja.zajavki.service.base.ProchajaInformacijaDljaZajavkiLocalServiceBaseImpl;

/**
 * The implementation of the prochaja informacija dlja zajavki local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.prochaja.informacija.dlja.zajavki.service.ProchajaInformacijaDljaZajavkiLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProchajaInformacijaDljaZajavkiLocalServiceBaseImpl
 * @see tj.prochaja.informacija.dlja.zajavki.service.ProchajaInformacijaDljaZajavkiLocalServiceUtil
 */
@ProviderType
public class ProchajaInformacijaDljaZajavkiLocalServiceImpl
	extends ProchajaInformacijaDljaZajavkiLocalServiceBaseImpl {
	
	public ProchajaInformacijaDljaZajavki getProchajaInformacijaDljaZajavki(long lot_id, long postavwik_id) {
		
		ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki = null;
		
		
		try {
			prochajaInformacijaDljaZajavki = prochajaInformacijaDljaZajavkiPersistence.findByLotIdPostaveikId(lot_id, postavwik_id);
		} catch (NoSuchProchajaInformacijaDljaZajavkiException e) {
			
		}
	return prochajaInformacijaDljaZajavki;	
	}
	
	public List<ProchajaInformacijaDljaZajavki> getProchajaInformacijaDljaZajavkis(long izvewenie_id)
	{
		return prochajaInformacijaDljaZajavkiPersistence.findByIzvewenieId(izvewenie_id);
	}
}