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
package tj.oplachennye.zakazy.exception;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author 
    Ashurov Shohin 
   
    falko000012@gmail.com
	
 */
@ProviderType
public class NoSuchOplachennyeZakazyException extends NoSuchModelException {

	public NoSuchOplachennyeZakazyException() {
	}

	public NoSuchOplachennyeZakazyException(String msg) {
		super(msg);
	}

	public NoSuchOplachennyeZakazyException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchOplachennyeZakazyException(Throwable cause) {
		super(cause);
	}

}