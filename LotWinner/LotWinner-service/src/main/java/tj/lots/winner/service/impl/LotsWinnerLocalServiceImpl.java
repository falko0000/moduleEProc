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

package tj.lots.winner.service.impl;

import java.util.List;

import aQute.bnd.annotation.ProviderType;
import tj.lots.winner.exception.NoSuchLotsWinnerException;
import tj.lots.winner.model.LotsWinner;
import tj.lots.winner.service.base.LotsWinnerLocalServiceBaseImpl;

/**
 * The implementation of the lots winner local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.lots.winner.service.LotsWinnerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LotsWinnerLocalServiceBaseImpl
 * @see tj.lots.winner.service.LotsWinnerLocalServiceUtil
 */
@ProviderType
public class LotsWinnerLocalServiceImpl extends LotsWinnerLocalServiceBaseImpl {
     
	 public List<LotsWinner> getSerialWinners(long spisok_lotov_id)
	 {
		 return lotsWinnerPersistence.findBySpisokLotovId(spisok_lotov_id);
	 }
	 
	 public LotsWinner getSerialWinner(long spisok_lotov_id, int serial_number)
	 { 
		 LotsWinner lotsWinner = null;
		 
		 try {
			lotsWinner = lotsWinnerPersistence.findByLotovIdNumber(spisok_lotov_id, serial_number);
		} catch (NoSuchLotsWinnerException e) {
			
		}
		 return lotsWinner;
	 }
	 
	 public LotsWinner getAttributeWinner(long spisok_lotov_id, String attribute)
	 { 
		 LotsWinner lotsWinner = null;
		 
		 try {
			lotsWinner = lotsWinnerPersistence.findByWinnerAttribute(spisok_lotov_id, attribute);
		} catch (NoSuchLotsWinnerException e) {
			
		}
		 return lotsWinner;
	 }
}