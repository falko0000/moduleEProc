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

package tj.log.evaluated.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the LogEvaluated service. Represents a row in the &quot;sapp.log_evaluated&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see LogEvaluatedModel
 * @see tj.log.evaluated.model.impl.LogEvaluatedImpl
 * @see tj.log.evaluated.model.impl.LogEvaluatedModelImpl
 * @generated
 */
@ImplementationClassName("tj.log.evaluated.model.impl.LogEvaluatedImpl")
@ProviderType
public interface LogEvaluated extends LogEvaluatedModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.log.evaluated.model.impl.LogEvaluatedImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<LogEvaluated, Long> LOG_EVALUATED_ID_ACCESSOR = new Accessor<LogEvaluated, Long>() {
			@Override
			public Long get(LogEvaluated logEvaluated) {
				return logEvaluated.getLog_evaluated_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<LogEvaluated> getTypeClass() {
				return LogEvaluated.class;
			}
		};
}