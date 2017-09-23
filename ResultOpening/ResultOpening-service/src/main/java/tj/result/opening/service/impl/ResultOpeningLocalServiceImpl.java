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

package tj.result.opening.service.impl;

import java.util.List;

import tj.result.opening.exception.NoSuchResultOpeningException;
import tj.result.opening.model.ResultOpening;
import tj.result.opening.service.base.ResultOpeningLocalServiceBaseImpl;

/**
 * The implementation of the result opening local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.result.opening.service.ResultOpeningLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ResultOpeningLocalServiceBaseImpl
 * @see tj.result.opening.service.ResultOpeningLocalServiceUtil
 */
public class ResultOpeningLocalServiceImpl
	extends ResultOpeningLocalServiceBaseImpl {
	
	public List<ResultOpening> getResultOpeningsByProtocolOpeningId(long protocol_opening_id) {
	
		return resultOpeningPersistence.findByProtocolOpeningId(protocol_opening_id);
	}
	
	public ResultOpening getResultOpening(long spisok_lotov_id, long postavwik_id) {
		
		try {
			return resultOpeningPersistence.findBySpisokLotovIdAndPostavwikId(spisok_lotov_id, postavwik_id);
		} catch (NoSuchResultOpeningException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
     public List<ResultOpening> getResultOpenings(long spisok_lotov_id, int status) {
		
		return resultOpeningPersistence.findBySpisokLotovIdAndStatus(spisok_lotov_id, status);
	}

     public List<ResultOpening> getResultOpeningsByLotId(long spisok_lotov_id) {
 		
 		return resultOpeningPersistence.findBySpisokLotovId(spisok_lotov_id);
 	}
	
	
	
	
}