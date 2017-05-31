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

package tj.supplier.request.lot.service.base;

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

import tj.supplier.request.lot.model.SupplierRequestLot;
import tj.supplier.request.lot.service.SupplierRequestLotLocalService;
import tj.supplier.request.lot.service.persistence.SupplierRequestLotPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the supplier request lot local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link tj.supplier.request.lot.service.impl.SupplierRequestLotLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.supplier.request.lot.service.impl.SupplierRequestLotLocalServiceImpl
 * @see tj.supplier.request.lot.service.SupplierRequestLotLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class SupplierRequestLotLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements SupplierRequestLotLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link tj.supplier.request.lot.service.SupplierRequestLotLocalServiceUtil} to access the supplier request lot local service.
	 */

	/**
	 * Adds the supplier request lot to the database. Also notifies the appropriate model listeners.
	 *
	 * @param supplierRequestLot the supplier request lot
	 * @return the supplier request lot that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public SupplierRequestLot addSupplierRequestLot(
		SupplierRequestLot supplierRequestLot) {
		supplierRequestLot.setNew(true);

		return supplierRequestLotPersistence.update(supplierRequestLot);
	}

	/**
	 * Creates a new supplier request lot with the primary key. Does not add the supplier request lot to the database.
	 *
	 * @param supplier_request_lot_id the primary key for the new supplier request lot
	 * @return the new supplier request lot
	 */
	@Override
	public SupplierRequestLot createSupplierRequestLot(
		long supplier_request_lot_id) {
		return supplierRequestLotPersistence.create(supplier_request_lot_id);
	}

	/**
	 * Deletes the supplier request lot with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param supplier_request_lot_id the primary key of the supplier request lot
	 * @return the supplier request lot that was removed
	 * @throws PortalException if a supplier request lot with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public SupplierRequestLot deleteSupplierRequestLot(
		long supplier_request_lot_id) throws PortalException {
		return supplierRequestLotPersistence.remove(supplier_request_lot_id);
	}

	/**
	 * Deletes the supplier request lot from the database. Also notifies the appropriate model listeners.
	 *
	 * @param supplierRequestLot the supplier request lot
	 * @return the supplier request lot that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public SupplierRequestLot deleteSupplierRequestLot(
		SupplierRequestLot supplierRequestLot) {
		return supplierRequestLotPersistence.remove(supplierRequestLot);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(SupplierRequestLot.class,
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
		return supplierRequestLotPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.supplier.request.lot.model.impl.SupplierRequestLotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return supplierRequestLotPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.supplier.request.lot.model.impl.SupplierRequestLotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return supplierRequestLotPersistence.findWithDynamicQuery(dynamicQuery,
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
		return supplierRequestLotPersistence.countWithDynamicQuery(dynamicQuery);
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
		return supplierRequestLotPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public SupplierRequestLot fetchSupplierRequestLot(
		long supplier_request_lot_id) {
		return supplierRequestLotPersistence.fetchByPrimaryKey(supplier_request_lot_id);
	}

	/**
	 * Returns the supplier request lot with the primary key.
	 *
	 * @param supplier_request_lot_id the primary key of the supplier request lot
	 * @return the supplier request lot
	 * @throws PortalException if a supplier request lot with the primary key could not be found
	 */
	@Override
	public SupplierRequestLot getSupplierRequestLot(
		long supplier_request_lot_id) throws PortalException {
		return supplierRequestLotPersistence.findByPrimaryKey(supplier_request_lot_id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(supplierRequestLotLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(SupplierRequestLot.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"supplier_request_lot_id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(supplierRequestLotLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(SupplierRequestLot.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"supplier_request_lot_id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(supplierRequestLotLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(SupplierRequestLot.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"supplier_request_lot_id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return supplierRequestLotLocalService.deleteSupplierRequestLot((SupplierRequestLot)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return supplierRequestLotPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the supplier request lots.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.supplier.request.lot.model.impl.SupplierRequestLotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of supplier request lots
	 * @param end the upper bound of the range of supplier request lots (not inclusive)
	 * @return the range of supplier request lots
	 */
	@Override
	public List<SupplierRequestLot> getSupplierRequestLots(int start, int end) {
		return supplierRequestLotPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of supplier request lots.
	 *
	 * @return the number of supplier request lots
	 */
	@Override
	public int getSupplierRequestLotsCount() {
		return supplierRequestLotPersistence.countAll();
	}

	/**
	 * Updates the supplier request lot in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param supplierRequestLot the supplier request lot
	 * @return the supplier request lot that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public SupplierRequestLot updateSupplierRequestLot(
		SupplierRequestLot supplierRequestLot) {
		return supplierRequestLotPersistence.update(supplierRequestLot);
	}

	/**
	 * Returns the supplier request lot local service.
	 *
	 * @return the supplier request lot local service
	 */
	public SupplierRequestLotLocalService getSupplierRequestLotLocalService() {
		return supplierRequestLotLocalService;
	}

	/**
	 * Sets the supplier request lot local service.
	 *
	 * @param supplierRequestLotLocalService the supplier request lot local service
	 */
	public void setSupplierRequestLotLocalService(
		SupplierRequestLotLocalService supplierRequestLotLocalService) {
		this.supplierRequestLotLocalService = supplierRequestLotLocalService;
	}

	/**
	 * Returns the supplier request lot persistence.
	 *
	 * @return the supplier request lot persistence
	 */
	public SupplierRequestLotPersistence getSupplierRequestLotPersistence() {
		return supplierRequestLotPersistence;
	}

	/**
	 * Sets the supplier request lot persistence.
	 *
	 * @param supplierRequestLotPersistence the supplier request lot persistence
	 */
	public void setSupplierRequestLotPersistence(
		SupplierRequestLotPersistence supplierRequestLotPersistence) {
		this.supplierRequestLotPersistence = supplierRequestLotPersistence;
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
		persistedModelLocalServiceRegistry.register("tj.supplier.request.lot.model.SupplierRequestLot",
			supplierRequestLotLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"tj.supplier.request.lot.model.SupplierRequestLot");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return SupplierRequestLotLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return SupplierRequestLot.class;
	}

	protected String getModelClassName() {
		return SupplierRequestLot.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = supplierRequestLotPersistence.getDataSource();

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

	@BeanReference(type = SupplierRequestLotLocalService.class)
	protected SupplierRequestLotLocalService supplierRequestLotLocalService;
	@BeanReference(type = SupplierRequestLotPersistence.class)
	protected SupplierRequestLotPersistence supplierRequestLotPersistence;
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