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

package tj.protocol.contracts.service.impl;

import aQute.bnd.annotation.ProviderType;
import tj.protocol.contracts.exception.NoSuchProtocolContractsException;
import tj.protocol.contracts.model.ProtocolContracts;
import tj.protocol.contracts.service.base.ProtocolContractsLocalServiceBaseImpl;

/**
 * The implementation of the protocol contracts local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.protocol.contracts.service.ProtocolContractsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProtocolContractsLocalServiceBaseImpl
 * @see tj.protocol.contracts.service.ProtocolContractsLocalServiceUtil
 */
@ProviderType
public class ProtocolContractsLocalServiceImpl
	extends ProtocolContractsLocalServiceBaseImpl {
	
     public ProtocolContracts getProtocolContractsByBid(long izvewenie_id) {
		
    	 ProtocolContracts contracts = null;
    	 
    	 try {
			contracts = protocolContractsPersistence.findByIzvewenieId(izvewenie_id);
		} catch (NoSuchProtocolContractsException e) {
			
		}
    	 
    	 return contracts;
	}
}