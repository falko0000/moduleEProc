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

package tj.spisoklotov.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import tj.spisoklotov.model.Spisoklotov;

import tj.spisoklotov.service.SpisoklotovLocalService;
import tj.spisoklotov.service.persistence.SpisoklotovPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the spisoklotov local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link tj.spisoklotov.service.impl.SpisoklotovLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.spisoklotov.service.impl.SpisoklotovLocalServiceImpl
 * @see tj.spisoklotov.service.SpisoklotovLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class SpisoklotovLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements SpisoklotovLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link tj.spisoklotov.service.SpisoklotovLocalServiceUtil} to access the spisoklotov local service.
	 */

	/**
	 * Adds the spisoklotov to the database. Also notifies the appropriate model listeners.
	 *
	 * @param spisoklotov the spisoklotov
	 * @return the spisoklotov that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Spisoklotov addSpisoklotov(Spisoklotov spisoklotov) {
		spisoklotov.setNew(true);

		return spisoklotovPersistence.update(spisoklotov);
	}

	/**
	 * Creates a new spisoklotov with the primary key. Does not add the spisoklotov to the database.
	 *
	 * @param spisok_lotov_id the primary key for the new spisoklotov
	 * @return the new spisoklotov
	 */
	@Override
	public Spisoklotov createSpisoklotov(long spisok_lotov_id) {
		return spisoklotovPersistence.create(spisok_lotov_id);
	}

	/**
	 * Deletes the spisoklotov with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param spisok_lotov_id the primary key of the spisoklotov
	 * @return the spisoklotov that was removed
	 * @throws PortalException if a spisoklotov with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Spisoklotov deleteSpisoklotov(long spisok_lotov_id)
		throws PortalException {
		return spisoklotovPersistence.remove(spisok_lotov_id);
	}

	/**
	 * Deletes the spisoklotov from the database. Also notifies the appropriate model listeners.
	 *
	 * @param spisoklotov the spisoklotov
	 * @return the spisoklotov that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Spisoklotov deleteSpisoklotov(Spisoklotov spisoklotov) {
		return spisoklotovPersistence.remove(spisoklotov);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Spisoklotov.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return spisoklotovPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.spisoklotov.model.impl.SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return spisoklotovPersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.spisoklotov.model.impl.SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return spisoklotovPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return spisoklotovPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return spisoklotovPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public Spisoklotov fetchSpisoklotov(long spisok_lotov_id) {
		return spisoklotovPersistence.fetchByPrimaryKey(spisok_lotov_id);
	}

	/**
	 * Returns the spisoklotov with the primary key.
	 *
	 * @param spisok_lotov_id the primary key of the spisoklotov
	 * @return the spisoklotov
	 * @throws PortalException if a spisoklotov with the primary key could not be found
	 */
	@Override
	public Spisoklotov getSpisoklotov(long spisok_lotov_id)
		throws PortalException {
		return spisoklotovPersistence.findByPrimaryKey(spisok_lotov_id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(spisoklotovLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Spisoklotov.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("spisok_lotov_id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(spisoklotovLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Spisoklotov.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"spisok_lotov_id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(spisoklotovLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Spisoklotov.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("spisok_lotov_id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return spisoklotovLocalService.deleteSpisoklotov((Spisoklotov)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return spisoklotovPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the spisoklotovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.spisoklotov.model.impl.SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of spisoklotovs
	 * @param end the upper bound of the range of spisoklotovs (not inclusive)
	 * @return the range of spisoklotovs
	 */
	@Override
	public List<Spisoklotov> getSpisoklotovs(int start, int end) {
		return spisoklotovPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of spisoklotovs.
	 *
	 * @return the number of spisoklotovs
	 */
	@Override
	public int getSpisoklotovsCount() {
		return spisoklotovPersistence.countAll();
	}

	/**
	 * Updates the spisoklotov in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param spisoklotov the spisoklotov
	 * @return the spisoklotov that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Spisoklotov updateSpisoklotov(Spisoklotov spisoklotov) {
		return spisoklotovPersistence.update(spisoklotov);
	}

	/**
	 * Returns the spisoklotov local service.
	 *
	 * @return the spisoklotov local service
	 */
	public SpisoklotovLocalService getSpisoklotovLocalService() {
		return spisoklotovLocalService;
	}

	/**
	 * Sets the spisoklotov local service.
	 *
	 * @param spisoklotovLocalService the spisoklotov local service
	 */
	public void setSpisoklotovLocalService(
		SpisoklotovLocalService spisoklotovLocalService) {
		this.spisoklotovLocalService = spisoklotovLocalService;
	}

	/**
	 * Returns the spisoklotov persistence.
	 *
	 * @return the spisoklotov persistence
	 */
	public SpisoklotovPersistence getSpisoklotovPersistence() {
		return spisoklotovPersistence;
	}

	/**
	 * Sets the spisoklotov persistence.
	 *
	 * @param spisoklotovPersistence the spisoklotov persistence
	 */
	public void setSpisoklotovPersistence(
		SpisoklotovPersistence spisoklotovPersistence) {
		this.spisoklotovPersistence = spisoklotovPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("tj.spisoklotov.model.Spisoklotov",
			spisoklotovLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"tj.spisoklotov.model.Spisoklotov");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return SpisoklotovLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Spisoklotov.class;
	}

	protected String getModelClassName() {
		return Spisoklotov.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = spisoklotovPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = SpisoklotovLocalService.class)
	protected SpisoklotovLocalService spisoklotovLocalService;
	@BeanReference(type = SpisoklotovPersistence.class)
	protected SpisoklotovPersistence spisoklotovPersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}