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

package tj.commission.positions.service.impl;

import java.util.List;

import tj.commission.positions.exception.NoSuchCommissionPositionException;
import tj.commission.positions.model.CommissionPosition;
import tj.commission.positions.service.base.CommissionPositionLocalServiceBaseImpl;

/**
 * The implementation of the commission position local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.commission.positions.service.CommissionPositionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CommissionPositionLocalServiceBaseImpl
 * @see tj.commission.positions.service.CommissionPositionLocalServiceUtil
 */
public class CommissionPositionLocalServiceImpl
	extends CommissionPositionLocalServiceBaseImpl {
	
	public CommissionPosition getCommissionPosition( long usergroupId, long userId) {
	
		CommissionPosition commissionPosition = null;
		
		try {
			commissionPosition = commissionPositionPersistence.findByUserIdAndUserGroupId(usergroupId, userId);
		} catch (NoSuchCommissionPositionException e) {
		   System.out.println("User "+userId+ " has no posts");
		}
		
		return commissionPosition;
	}
	
	public List<CommissionPosition> getCommissionPositionByUserGroupId(long usergroupId)
	{
		return commissionPositionPersistence.findByUserGroupId(usergroupId);
	}
}