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

package tj.log.evaluated.model.impl;

import aQute.bnd.annotation.ProviderType;

import tj.log.evaluated.model.LogEvaluated;
import tj.log.evaluated.service.LogEvaluatedLocalServiceUtil;

/**
 * The extended model base implementation for the LogEvaluated service. Represents a row in the &quot;sapp.log_evaluated&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LogEvaluatedImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LogEvaluatedImpl
 * @see LogEvaluated
 * @generated
 */
@ProviderType
public abstract class LogEvaluatedBaseImpl extends LogEvaluatedModelImpl
	implements LogEvaluated {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a log evaluated model instance should use the {@link LogEvaluated} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			LogEvaluatedLocalServiceUtil.addLogEvaluated(this);
		}
		else {
			LogEvaluatedLocalServiceUtil.updateLogEvaluated(this);
		}
	}
}