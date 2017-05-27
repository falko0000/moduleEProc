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

package tj.system.config.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.system.config.exception.NoSuchTestException;
import tj.system.config.model.Test;

/**
 * The persistence interface for the test service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.system.config.service.persistence.impl.TestPersistenceImpl
 * @see TestUtil
 * @generated
 */
@ProviderType
public interface TestPersistence extends BasePersistence<Test> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TestUtil} to access the test persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the test where key = &#63; or throws a {@link NoSuchTestException} if it could not be found.
	*
	* @param key the key
	* @return the matching test
	* @throws NoSuchTestException if a matching test could not be found
	*/
	public Test findByKey(java.lang.String key) throws NoSuchTestException;

	/**
	* Returns the test where key = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param key the key
	* @return the matching test, or <code>null</code> if a matching test could not be found
	*/
	public Test fetchByKey(java.lang.String key);

	/**
	* Returns the test where key = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param key the key
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching test, or <code>null</code> if a matching test could not be found
	*/
	public Test fetchByKey(java.lang.String key, boolean retrieveFromCache);

	/**
	* Removes the test where key = &#63; from the database.
	*
	* @param key the key
	* @return the test that was removed
	*/
	public Test removeByKey(java.lang.String key) throws NoSuchTestException;

	/**
	* Returns the number of tests where key = &#63;.
	*
	* @param key the key
	* @return the number of matching tests
	*/
	public int countByKey(java.lang.String key);

	/**
	* Caches the test in the entity cache if it is enabled.
	*
	* @param test the test
	*/
	public void cacheResult(Test test);

	/**
	* Caches the tests in the entity cache if it is enabled.
	*
	* @param tests the tests
	*/
	public void cacheResult(java.util.List<Test> tests);

	/**
	* Creates a new test with the primary key. Does not add the test to the database.
	*
	* @param system_config_id_ the primary key for the new test
	* @return the new test
	*/
	public Test create(long system_config_id_);

	/**
	* Removes the test with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param system_config_id_ the primary key of the test
	* @return the test that was removed
	* @throws NoSuchTestException if a test with the primary key could not be found
	*/
	public Test remove(long system_config_id_) throws NoSuchTestException;

	public Test updateImpl(Test test);

	/**
	* Returns the test with the primary key or throws a {@link NoSuchTestException} if it could not be found.
	*
	* @param system_config_id_ the primary key of the test
	* @return the test
	* @throws NoSuchTestException if a test with the primary key could not be found
	*/
	public Test findByPrimaryKey(long system_config_id_)
		throws NoSuchTestException;

	/**
	* Returns the test with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param system_config_id_ the primary key of the test
	* @return the test, or <code>null</code> if a test with the primary key could not be found
	*/
	public Test fetchByPrimaryKey(long system_config_id_);

	@Override
	public java.util.Map<java.io.Serializable, Test> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the tests.
	*
	* @return the tests
	*/
	public java.util.List<Test> findAll();

	/**
	* Returns a range of all the tests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tests
	* @param end the upper bound of the range of tests (not inclusive)
	* @return the range of tests
	*/
	public java.util.List<Test> findAll(int start, int end);

	/**
	* Returns an ordered range of all the tests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tests
	* @param end the upper bound of the range of tests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tests
	*/
	public java.util.List<Test> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Test> orderByComparator);

	/**
	* Returns an ordered range of all the tests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tests
	* @param end the upper bound of the range of tests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of tests
	*/
	public java.util.List<Test> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Test> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the tests from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of tests.
	*
	* @return the number of tests
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}