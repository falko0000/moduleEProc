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

package tj.module.access.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.module.access.exception.NoSuchAccessModuleException;
import tj.module.access.model.AccessModule;

/**
 * The persistence interface for the access module service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.module.access.service.persistence.impl.AccessModulePersistenceImpl
 * @see AccessModuleUtil
 * @generated
 */
@ProviderType
public interface AccessModulePersistence extends BasePersistence<AccessModule> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccessModuleUtil} to access the access module persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the access modules where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching access modules
	*/
	public java.util.List<AccessModule> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the access modules where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AccessModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of access modules
	* @param end the upper bound of the range of access modules (not inclusive)
	* @return the range of matching access modules
	*/
	public java.util.List<AccessModule> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the access modules where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AccessModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of access modules
	* @param end the upper bound of the range of access modules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching access modules
	*/
	public java.util.List<AccessModule> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccessModule> orderByComparator);

	/**
	* Returns an ordered range of all the access modules where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AccessModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of access modules
	* @param end the upper bound of the range of access modules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching access modules
	*/
	public java.util.List<AccessModule> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccessModule> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first access module in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access module
	* @throws NoSuchAccessModuleException if a matching access module could not be found
	*/
	public AccessModule findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccessModule> orderByComparator)
		throws NoSuchAccessModuleException;

	/**
	* Returns the first access module in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching access module, or <code>null</code> if a matching access module could not be found
	*/
	public AccessModule fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccessModule> orderByComparator);

	/**
	* Returns the last access module in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access module
	* @throws NoSuchAccessModuleException if a matching access module could not be found
	*/
	public AccessModule findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccessModule> orderByComparator)
		throws NoSuchAccessModuleException;

	/**
	* Returns the last access module in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching access module, or <code>null</code> if a matching access module could not be found
	*/
	public AccessModule fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccessModule> orderByComparator);

	/**
	* Returns the access modules before and after the current access module in the ordered set where uuid = &#63;.
	*
	* @param dostup_id the primary key of the current access module
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next access module
	* @throws NoSuchAccessModuleException if a access module with the primary key could not be found
	*/
	public AccessModule[] findByUuid_PrevAndNext(long dostup_id,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccessModule> orderByComparator)
		throws NoSuchAccessModuleException;

	/**
	* Removes all the access modules where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of access modules where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching access modules
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Caches the access module in the entity cache if it is enabled.
	*
	* @param accessModule the access module
	*/
	public void cacheResult(AccessModule accessModule);

	/**
	* Caches the access modules in the entity cache if it is enabled.
	*
	* @param accessModules the access modules
	*/
	public void cacheResult(java.util.List<AccessModule> accessModules);

	/**
	* Creates a new access module with the primary key. Does not add the access module to the database.
	*
	* @param dostup_id the primary key for the new access module
	* @return the new access module
	*/
	public AccessModule create(long dostup_id);

	/**
	* Removes the access module with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dostup_id the primary key of the access module
	* @return the access module that was removed
	* @throws NoSuchAccessModuleException if a access module with the primary key could not be found
	*/
	public AccessModule remove(long dostup_id)
		throws NoSuchAccessModuleException;

	public AccessModule updateImpl(AccessModule accessModule);

	/**
	* Returns the access module with the primary key or throws a {@link NoSuchAccessModuleException} if it could not be found.
	*
	* @param dostup_id the primary key of the access module
	* @return the access module
	* @throws NoSuchAccessModuleException if a access module with the primary key could not be found
	*/
	public AccessModule findByPrimaryKey(long dostup_id)
		throws NoSuchAccessModuleException;

	/**
	* Returns the access module with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dostup_id the primary key of the access module
	* @return the access module, or <code>null</code> if a access module with the primary key could not be found
	*/
	public AccessModule fetchByPrimaryKey(long dostup_id);

	@Override
	public java.util.Map<java.io.Serializable, AccessModule> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the access modules.
	*
	* @return the access modules
	*/
	public java.util.List<AccessModule> findAll();

	/**
	* Returns a range of all the access modules.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AccessModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of access modules
	* @param end the upper bound of the range of access modules (not inclusive)
	* @return the range of access modules
	*/
	public java.util.List<AccessModule> findAll(int start, int end);

	/**
	* Returns an ordered range of all the access modules.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AccessModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of access modules
	* @param end the upper bound of the range of access modules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of access modules
	*/
	public java.util.List<AccessModule> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccessModule> orderByComparator);

	/**
	* Returns an ordered range of all the access modules.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AccessModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of access modules
	* @param end the upper bound of the range of access modules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of access modules
	*/
	public java.util.List<AccessModule> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccessModule> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the access modules from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of access modules.
	*
	* @return the number of access modules
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}