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

package tj.protocol.contracts.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the ProtocolOpening service. Represents a row in the &quot;sapp.protocol_opening&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ProtocolOpeningModel
 * @see tj.protocol.contracts.model.impl.ProtocolOpeningImpl
 * @see tj.protocol.contracts.model.impl.ProtocolOpeningModelImpl
 * @generated
 */
@ImplementationClassName("tj.protocol.contracts.model.impl.ProtocolOpeningImpl")
@ProviderType
public interface ProtocolOpening extends ProtocolOpeningModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.protocol.contracts.model.impl.ProtocolOpeningImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ProtocolOpening, Long> PROTOCOL_OPENING_ID_ACCESSOR =
		new Accessor<ProtocolOpening, Long>() {
			@Override
			public Long get(ProtocolOpening protocolOpening) {
				return protocolOpening.getProtocol_opening_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<ProtocolOpening> getTypeClass() {
				return ProtocolOpening.class;
			}
		};
}