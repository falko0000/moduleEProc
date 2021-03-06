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

package tj.informacija.razmewenii.service.base;

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

import tj.informacija.razmewenii.model.InformacijaORazmewenii;
import tj.informacija.razmewenii.service.InformacijaORazmeweniiLocalService;
import tj.informacija.razmewenii.service.persistence.InformacijaORazmeweniiPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the informacija o razmewenii local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link tj.informacija.razmewenii.service.impl.InformacijaORazmeweniiLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.informacija.razmewenii.service.impl.InformacijaORazmeweniiLocalServiceImpl
 * @see tj.informacija.razmewenii.service.InformacijaORazmeweniiLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class InformacijaORazmeweniiLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements InformacijaORazmeweniiLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link tj.informacija.razmewenii.service.InformacijaORazmeweniiLocalServiceUtil} to access the informacija o razmewenii local service.
	 */

	/**
	 * Adds the informacija o razmewenii to the database. Also notifies the appropriate model listeners.
	 *
	 * @param informacijaORazmewenii the informacija o razmewenii
	 * @return the informacija o razmewenii that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public InformacijaORazmewenii addInformacijaORazmewenii(
		InformacijaORazmewenii informacijaORazmewenii) {
		informacijaORazmewenii.setNew(true);

		return informacijaORazmeweniiPersistence.update(informacijaORazmewenii);
	}

	/**
	 * Creates a new informacija o razmewenii with the primary key. Does not add the informacija o razmewenii to the database.
	 *
	 * @param informacija_o_razmewenii_id the primary key for the new informacija o razmewenii
	 * @return the new informacija o razmewenii
	 */
	@Override
	public InformacijaORazmewenii createInformacijaORazmewenii(
		long informacija_o_razmewenii_id) {
		return informacijaORazmeweniiPersistence.create(informacija_o_razmewenii_id);
	}

	/**
	 * Deletes the informacija o razmewenii with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param informacija_o_razmewenii_id the primary key of the informacija o razmewenii
	 * @return the informacija o razmewenii that was removed
	 * @throws PortalException if a informacija o razmewenii with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public InformacijaORazmewenii deleteInformacijaORazmewenii(
		long informacija_o_razmewenii_id) throws PortalException {
		return informacijaORazmeweniiPersistence.remove(informacija_o_razmewenii_id);
	}

	/**
	 * Deletes the informacija o razmewenii from the database. Also notifies the appropriate model listeners.
	 *
	 * @param informacijaORazmewenii the informacija o razmewenii
	 * @return the informacija o razmewenii that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public InformacijaORazmewenii deleteInformacijaORazmewenii(
		InformacijaORazmewenii informacijaORazmewenii) {
		return informacijaORazmeweniiPersistence.remove(informacijaORazmewenii);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(InformacijaORazmewenii.class,
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
		return informacijaORazmeweniiPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.informacija.razmewenii.model.impl.InformacijaORazmeweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return informacijaORazmeweniiPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.informacija.razmewenii.model.impl.InformacijaORazmeweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return informacijaORazmeweniiPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return informacijaORazmeweniiPersistence.countWithDynamicQuery(dynamicQuery);
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
		return informacijaORazmeweniiPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public InformacijaORazmewenii fetchInformacijaORazmewenii(
		long informacija_o_razmewenii_id) {
		return informacijaORazmeweniiPersistence.fetchByPrimaryKey(informacija_o_razmewenii_id);
	}

	/**
	 * Returns the informacija o razmewenii with the primary key.
	 *
	 * @param informacija_o_razmewenii_id the primary key of the informacija o razmewenii
	 * @return the informacija o razmewenii
	 * @throws PortalException if a informacija o razmewenii with the primary key could not be found
	 */
	@Override
	public InformacijaORazmewenii getInformacijaORazmewenii(
		long informacija_o_razmewenii_id) throws PortalException {
		return informacijaORazmeweniiPersistence.findByPrimaryKey(informacija_o_razmewenii_id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(informacijaORazmeweniiLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(InformacijaORazmewenii.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"informacija_o_razmewenii_id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(informacijaORazmeweniiLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(InformacijaORazmewenii.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"informacija_o_razmewenii_id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(informacijaORazmeweniiLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(InformacijaORazmewenii.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"informacija_o_razmewenii_id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return informacijaORazmeweniiLocalService.deleteInformacijaORazmewenii((InformacijaORazmewenii)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return informacijaORazmeweniiPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the informacija o razmeweniis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.informacija.razmewenii.model.impl.InformacijaORazmeweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of informacija o razmeweniis
	 * @param end the upper bound of the range of informacija o razmeweniis (not inclusive)
	 * @return the range of informacija o razmeweniis
	 */
	@Override
	public List<InformacijaORazmewenii> getInformacijaORazmeweniis(int start,
		int end) {
		return informacijaORazmeweniiPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of informacija o razmeweniis.
	 *
	 * @return the number of informacija o razmeweniis
	 */
	@Override
	public int getInformacijaORazmeweniisCount() {
		return informacijaORazmeweniiPersistence.countAll();
	}

	/**
	 * Updates the informacija o razmewenii in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param informacijaORazmewenii the informacija o razmewenii
	 * @return the informacija o razmewenii that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public InformacijaORazmewenii updateInformacijaORazmewenii(
		InformacijaORazmewenii informacijaORazmewenii) {
		return informacijaORazmeweniiPersistence.update(informacijaORazmewenii);
	}

	/**
	 * Returns the informacija o razmewenii local service.
	 *
	 * @return the informacija o razmewenii local service
	 */
	public InformacijaORazmeweniiLocalService getInformacijaORazmeweniiLocalService() {
		return informacijaORazmeweniiLocalService;
	}

	/**
	 * Sets the informacija o razmewenii local service.
	 *
	 * @param informacijaORazmeweniiLocalService the informacija o razmewenii local service
	 */
	public void setInformacijaORazmeweniiLocalService(
		InformacijaORazmeweniiLocalService informacijaORazmeweniiLocalService) {
		this.informacijaORazmeweniiLocalService = informacijaORazmeweniiLocalService;
	}

	/**
	 * Returns the informacija o razmewenii persistence.
	 *
	 * @return the informacija o razmewenii persistence
	 */
	public InformacijaORazmeweniiPersistence getInformacijaORazmeweniiPersistence() {
		return informacijaORazmeweniiPersistence;
	}

	/**
	 * Sets the informacija o razmewenii persistence.
	 *
	 * @param informacijaORazmeweniiPersistence the informacija o razmewenii persistence
	 */
	public void setInformacijaORazmeweniiPersistence(
		InformacijaORazmeweniiPersistence informacijaORazmeweniiPersistence) {
		this.informacijaORazmeweniiPersistence = informacijaORazmeweniiPersistence;
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
		persistedModelLocalServiceRegistry.register("tj.informacija.razmewenii.model.InformacijaORazmewenii",
			informacijaORazmeweniiLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"tj.informacija.razmewenii.model.InformacijaORazmewenii");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return InformacijaORazmeweniiLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return InformacijaORazmewenii.class;
	}

	protected String getModelClassName() {
		return InformacijaORazmewenii.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = informacijaORazmeweniiPersistence.getDataSource();

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

	@BeanReference(type = InformacijaORazmeweniiLocalService.class)
	protected InformacijaORazmeweniiLocalService informacijaORazmeweniiLocalService;
	@BeanReference(type = InformacijaORazmeweniiPersistence.class)
	protected InformacijaORazmeweniiPersistence informacijaORazmeweniiPersistence;
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