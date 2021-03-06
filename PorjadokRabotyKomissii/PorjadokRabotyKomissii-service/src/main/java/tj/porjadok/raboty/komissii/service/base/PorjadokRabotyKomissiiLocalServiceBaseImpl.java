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

package tj.porjadok.raboty.komissii.service.base;

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

import tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii;
import tj.porjadok.raboty.komissii.service.PorjadokRabotyKomissiiLocalService;
import tj.porjadok.raboty.komissii.service.persistence.PorjadokRabotyKomissiiPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the porjadok raboty komissii local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link tj.porjadok.raboty.komissii.service.impl.PorjadokRabotyKomissiiLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.porjadok.raboty.komissii.service.impl.PorjadokRabotyKomissiiLocalServiceImpl
 * @see tj.porjadok.raboty.komissii.service.PorjadokRabotyKomissiiLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class PorjadokRabotyKomissiiLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements PorjadokRabotyKomissiiLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link tj.porjadok.raboty.komissii.service.PorjadokRabotyKomissiiLocalServiceUtil} to access the porjadok raboty komissii local service.
	 */

	/**
	 * Adds the porjadok raboty komissii to the database. Also notifies the appropriate model listeners.
	 *
	 * @param porjadokRabotyKomissii the porjadok raboty komissii
	 * @return the porjadok raboty komissii that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PorjadokRabotyKomissii addPorjadokRabotyKomissii(
		PorjadokRabotyKomissii porjadokRabotyKomissii) {
		porjadokRabotyKomissii.setNew(true);

		return porjadokRabotyKomissiiPersistence.update(porjadokRabotyKomissii);
	}

	/**
	 * Creates a new porjadok raboty komissii with the primary key. Does not add the porjadok raboty komissii to the database.
	 *
	 * @param porjadok_raboty_komissii_id the primary key for the new porjadok raboty komissii
	 * @return the new porjadok raboty komissii
	 */
	@Override
	public PorjadokRabotyKomissii createPorjadokRabotyKomissii(
		long porjadok_raboty_komissii_id) {
		return porjadokRabotyKomissiiPersistence.create(porjadok_raboty_komissii_id);
	}

	/**
	 * Deletes the porjadok raboty komissii with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param porjadok_raboty_komissii_id the primary key of the porjadok raboty komissii
	 * @return the porjadok raboty komissii that was removed
	 * @throws PortalException if a porjadok raboty komissii with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public PorjadokRabotyKomissii deletePorjadokRabotyKomissii(
		long porjadok_raboty_komissii_id) throws PortalException {
		return porjadokRabotyKomissiiPersistence.remove(porjadok_raboty_komissii_id);
	}

	/**
	 * Deletes the porjadok raboty komissii from the database. Also notifies the appropriate model listeners.
	 *
	 * @param porjadokRabotyKomissii the porjadok raboty komissii
	 * @return the porjadok raboty komissii that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public PorjadokRabotyKomissii deletePorjadokRabotyKomissii(
		PorjadokRabotyKomissii porjadokRabotyKomissii) {
		return porjadokRabotyKomissiiPersistence.remove(porjadokRabotyKomissii);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(PorjadokRabotyKomissii.class,
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
		return porjadokRabotyKomissiiPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.porjadok.raboty.komissii.model.impl.PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return porjadokRabotyKomissiiPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.porjadok.raboty.komissii.model.impl.PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return porjadokRabotyKomissiiPersistence.findWithDynamicQuery(dynamicQuery,
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
		return porjadokRabotyKomissiiPersistence.countWithDynamicQuery(dynamicQuery);
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
		return porjadokRabotyKomissiiPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public PorjadokRabotyKomissii fetchPorjadokRabotyKomissii(
		long porjadok_raboty_komissii_id) {
		return porjadokRabotyKomissiiPersistence.fetchByPrimaryKey(porjadok_raboty_komissii_id);
	}

	/**
	 * Returns the porjadok raboty komissii with the primary key.
	 *
	 * @param porjadok_raboty_komissii_id the primary key of the porjadok raboty komissii
	 * @return the porjadok raboty komissii
	 * @throws PortalException if a porjadok raboty komissii with the primary key could not be found
	 */
	@Override
	public PorjadokRabotyKomissii getPorjadokRabotyKomissii(
		long porjadok_raboty_komissii_id) throws PortalException {
		return porjadokRabotyKomissiiPersistence.findByPrimaryKey(porjadok_raboty_komissii_id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(porjadokRabotyKomissiiLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(PorjadokRabotyKomissii.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"porjadok_raboty_komissii_id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(porjadokRabotyKomissiiLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(PorjadokRabotyKomissii.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"porjadok_raboty_komissii_id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(porjadokRabotyKomissiiLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(PorjadokRabotyKomissii.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"porjadok_raboty_komissii_id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return porjadokRabotyKomissiiLocalService.deletePorjadokRabotyKomissii((PorjadokRabotyKomissii)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return porjadokRabotyKomissiiPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the porjadok raboty komissiis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.porjadok.raboty.komissii.model.impl.PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of porjadok raboty komissiis
	 * @param end the upper bound of the range of porjadok raboty komissiis (not inclusive)
	 * @return the range of porjadok raboty komissiis
	 */
	@Override
	public List<PorjadokRabotyKomissii> getPorjadokRabotyKomissiis(int start,
		int end) {
		return porjadokRabotyKomissiiPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of porjadok raboty komissiis.
	 *
	 * @return the number of porjadok raboty komissiis
	 */
	@Override
	public int getPorjadokRabotyKomissiisCount() {
		return porjadokRabotyKomissiiPersistence.countAll();
	}

	/**
	 * Updates the porjadok raboty komissii in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param porjadokRabotyKomissii the porjadok raboty komissii
	 * @return the porjadok raboty komissii that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PorjadokRabotyKomissii updatePorjadokRabotyKomissii(
		PorjadokRabotyKomissii porjadokRabotyKomissii) {
		return porjadokRabotyKomissiiPersistence.update(porjadokRabotyKomissii);
	}

	/**
	 * Returns the porjadok raboty komissii local service.
	 *
	 * @return the porjadok raboty komissii local service
	 */
	public PorjadokRabotyKomissiiLocalService getPorjadokRabotyKomissiiLocalService() {
		return porjadokRabotyKomissiiLocalService;
	}

	/**
	 * Sets the porjadok raboty komissii local service.
	 *
	 * @param porjadokRabotyKomissiiLocalService the porjadok raboty komissii local service
	 */
	public void setPorjadokRabotyKomissiiLocalService(
		PorjadokRabotyKomissiiLocalService porjadokRabotyKomissiiLocalService) {
		this.porjadokRabotyKomissiiLocalService = porjadokRabotyKomissiiLocalService;
	}

	/**
	 * Returns the porjadok raboty komissii persistence.
	 *
	 * @return the porjadok raboty komissii persistence
	 */
	public PorjadokRabotyKomissiiPersistence getPorjadokRabotyKomissiiPersistence() {
		return porjadokRabotyKomissiiPersistence;
	}

	/**
	 * Sets the porjadok raboty komissii persistence.
	 *
	 * @param porjadokRabotyKomissiiPersistence the porjadok raboty komissii persistence
	 */
	public void setPorjadokRabotyKomissiiPersistence(
		PorjadokRabotyKomissiiPersistence porjadokRabotyKomissiiPersistence) {
		this.porjadokRabotyKomissiiPersistence = porjadokRabotyKomissiiPersistence;
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
		persistedModelLocalServiceRegistry.register("tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii",
			porjadokRabotyKomissiiLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return PorjadokRabotyKomissiiLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return PorjadokRabotyKomissii.class;
	}

	protected String getModelClassName() {
		return PorjadokRabotyKomissii.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = porjadokRabotyKomissiiPersistence.getDataSource();

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

	@BeanReference(type = PorjadokRabotyKomissiiLocalService.class)
	protected PorjadokRabotyKomissiiLocalService porjadokRabotyKomissiiLocalService;
	@BeanReference(type = PorjadokRabotyKomissiiPersistence.class)
	protected PorjadokRabotyKomissiiPersistence porjadokRabotyKomissiiPersistence;
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