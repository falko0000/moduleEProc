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

package tj.result.opening.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the ResultOpening service. Represents a row in the &quot;sapp.result_opening&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ResultOpeningModel
 * @see tj.result.opening.model.impl.ResultOpeningImpl
 * @see tj.result.opening.model.impl.ResultOpeningModelImpl
 * @generated
 */
@ImplementationClassName("tj.result.opening.model.impl.ResultOpeningImpl")
@ProviderType
public interface ResultOpening extends ResultOpeningModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.result.opening.model.impl.ResultOpeningImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ResultOpening, Long> RESULT_OPENING_ID_ACCESSOR =
		new Accessor<ResultOpening, Long>() {
			@Override
			public Long get(ResultOpening resultOpening) {
				return resultOpening.getResult_opening_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<ResultOpening> getTypeClass() {
				return ResultOpening.class;
			}
		};
}