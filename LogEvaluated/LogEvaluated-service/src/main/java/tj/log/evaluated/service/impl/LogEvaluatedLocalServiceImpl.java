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

package tj.log.evaluated.service.impl;

import java.util.List;

import tj.log.evaluated.exception.NoSuchLogEvaluatedException;
import tj.log.evaluated.model.LogEvaluated;
import tj.log.evaluated.service.base.LogEvaluatedLocalServiceBaseImpl;

/**
 * The implementation of the log evaluated local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.log.evaluated.service.LogEvaluatedLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LogEvaluatedLocalServiceBaseImpl
 * @see tj.log.evaluated.service.LogEvaluatedLocalServiceUtil
 */
public class LogEvaluatedLocalServiceImpl
	extends LogEvaluatedLocalServiceBaseImpl {
	
	
	public LogEvaluated  getLogEvaluated(long spisok_lotov_id, long organization_id, long userid)
	{
		
		LogEvaluated evaluated = null;
		try {
			evaluated = logEvaluatedPersistence.findBySpIdOrgIdUserId(spisok_lotov_id, organization_id, userid);
		} catch (NoSuchLogEvaluatedException e) {
		
		}
		return evaluated;
	}
	
	public List<LogEvaluated>  getLogEvaluation(long spisok_lotov_id, long userid)
	{
		return logEvaluatedPersistence.findBySpIdUserId(spisok_lotov_id, userid);
	}
	
	public List<LogEvaluated>  getLogEvaluation(long spisok_lotov_id)
	{
		return logEvaluatedPersistence.findBySpId(spisok_lotov_id);
	}
	
	public List<LogEvaluated>  getLogOpeningEvaluation(long userid, long result_opening_id)
	{
		return logEvaluatedPersistence.findByUserIdROId(userid, result_opening_id);
	}
	
}