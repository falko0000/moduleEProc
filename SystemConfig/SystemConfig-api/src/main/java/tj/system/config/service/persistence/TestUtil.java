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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.system.config.model.Test;

import java.util.List;

/**
 * The persistence utility for the test service. This utility wraps {@link tj.system.config.service.persistence.impl.TestPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestPersistence
 * @see tj.system.config.service.persistence.impl.TestPersistenceImpl
 * @generated
 */
@ProviderType
public class TestUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Test test) {
		getPersistence().clearCache(test);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Test> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Test> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Test> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Test> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Test update(Test test) {
		return getPersistence().update(test);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Test update(Test test, ServiceContext serviceContext) {
		return getPersistence().update(test, serviceContext);
	}

	/**
	* Returns the test where key = &#63; or throws a {@link NoSuchTestException} if it could not be found.
	*
	* @param key the key
	* @return the matching test
	* @throws NoSuchTestException if a matching test could not be found
	*/
	public static Test findByKey(java.lang.String key)
		throws tj.system.config.exception.NoSuchTestException {
		return getPersistence().findByKey(key);
	}

	/**
	* Returns the test where key = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param key the key
	* @return the matching test, or <code>null</code> if a matching test could not be found
	*/
	public static Test fetchByKey(java.lang.String key) {
		return getPersistence().fetchByKey(key);
	}

	/**
	* Returns the test where key = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param key the key
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching test, or <code>null</code> if a matching test could not be found
	*/
	public static Test fetchByKey(java.lang.String key,
		boolean retrieveFromCache) {
		return getPersistence().fetchByKey(key, retrieveFromCache);
	}

	/**
	* Removes the test where key = &#63; from the database.
	*
	* @param key the key
	* @return the test that was removed
	*/
	public static Test removeByKey(java.lang.String key)
		throws tj.system.config.exception.NoSuchTestException {
		return getPersistence().removeByKey(key);
	}

	/**
	* Returns the number of tests where key = &#63;.
	*
	* @param key the key
	* @return the number of matching tests
	*/
	public static int countByKey(java.lang.String key) {
		return getPersistence().countByKey(key);
	}

	/**
	* Caches the test in the entity cache if it is enabled.
	*
	* @param test the test
	*/
	public static void cacheResult(Test test) {
		getPersistence().cacheResult(test);
	}

	/**
	* Caches the tests in the entity cache if it is enabled.
	*
	* @param tests the tests
	*/
	public static void cacheResult(List<Test> tests) {
		getPersistence().cacheResult(tests);
	}

	/**
	* Creates a new test with the primary key. Does not add the test to the database.
	*
	* @param system_config_id_ the primary key for the new test
	* @return the new test
	*/
	public static Test create(long system_config_id_) {
		return getPersistence().create(system_config_id_);
	}

	/**
	* Removes the test with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param system_config_id_ the primary key of the test
	* @return the test that was removed
	* @throws NoSuchTestException if a test with the primary key could not be found
	*/
	public static Test remove(long system_config_id_)
		throws tj.system.config.exception.NoSuchTestException {
		return getPersistence().remove(system_config_id_);
	}

	public static Test updateImpl(Test test) {
		return getPersistence().updateImpl(test);
	}

	/**
	* Returns the test with the primary key or throws a {@link NoSuchTestException} if it could not be found.
	*
	* @param system_config_id_ the primary key of the test
	* @return the test
	* @throws NoSuchTestException if a test with the primary key could not be found
	*/
	public static Test findByPrimaryKey(long system_config_id_)
		throws tj.system.config.exception.NoSuchTestException {
		return getPersistence().findByPrimaryKey(system_config_id_);
	}

	/**
	* Returns the test with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param system_config_id_ the primary key of the test
	* @return the test, or <code>null</code> if a test with the primary key could not be found
	*/
	public static Test fetchByPrimaryKey(long system_config_id_) {
		return getPersistence().fetchByPrimaryKey(system_config_id_);
	}

	public static java.util.Map<java.io.Serializable, Test> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the tests.
	*
	* @return the tests
	*/
	public static List<Test> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Test> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Test> findAll(int start, int end,
		OrderByComparator<Test> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<Test> findAll(int start, int end,
		OrderByComparator<Test> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the tests from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tests.
	*
	* @return the number of tests
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static TestPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TestPersistence, TestPersistence> _serviceTracker =
		ServiceTrackerFactory.open(TestPersistence.class);
}