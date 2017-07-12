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
 * The extended model interface for the ProtocolContracts service. Represents a row in the &quot;sapp.protocol_contracts&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ProtocolContractsModel
 * @see tj.protocol.contracts.model.impl.ProtocolContractsImpl
 * @see tj.protocol.contracts.model.impl.ProtocolContractsModelImpl
 * @generated
 */
@ImplementationClassName("tj.protocol.contracts.model.impl.ProtocolContractsImpl")
@ProviderType
public interface ProtocolContracts extends ProtocolContractsModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.protocol.contracts.model.impl.ProtocolContractsImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ProtocolContracts, Long> PROTOCOL_CONTRACTS_ID_ACCESSOR =
		new Accessor<ProtocolContracts, Long>() {
			@Override
			public Long get(ProtocolContracts protocolContracts) {
				return protocolContracts.getProtocol_contracts_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<ProtocolContracts> getTypeClass() {
				return ProtocolContracts.class;
			}
		};
}