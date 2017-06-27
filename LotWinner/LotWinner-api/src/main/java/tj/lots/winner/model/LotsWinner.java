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

package tj.lots.winner.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the LotsWinner service. Represents a row in the &quot;sapp.lot_winner&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see LotsWinnerModel
 * @see tj.lots.winner.model.impl.LotsWinnerImpl
 * @see tj.lots.winner.model.impl.LotsWinnerModelImpl
 * @generated
 */
@ImplementationClassName("tj.lots.winner.model.impl.LotsWinnerImpl")
@ProviderType
public interface LotsWinner extends LotsWinnerModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.lots.winner.model.impl.LotsWinnerImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<LotsWinner, Long> LOT_WINNER_ID_ACCESSOR = new Accessor<LotsWinner, Long>() {
			@Override
			public Long get(LotsWinner lotsWinner) {
				return lotsWinner.getLot_winner_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<LotsWinner> getTypeClass() {
				return LotsWinner.class;
			}
		};
}