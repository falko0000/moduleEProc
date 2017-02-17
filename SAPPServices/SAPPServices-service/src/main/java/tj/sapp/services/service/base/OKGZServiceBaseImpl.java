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

package tj.sapp.services.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import tj.sapp.services.model.OKGZ;
import tj.sapp.services.service.OKGZService;
import tj.sapp.services.service.persistence.OKGZPersistence;
import tj.sapp.services.service.persistence.RajonyPersistence;
import tj.sapp.services.service.persistence.VBKPersistence;
import tj.sapp.services.service.persistence.VW_IzvewenijaPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the o k g z remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link tj.sapp.services.service.impl.OKGZServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.sapp.services.service.impl.OKGZServiceImpl
 * @see tj.sapp.services.service.OKGZServiceUtil
 * @generated
 */
public abstract class OKGZServiceBaseImpl extends BaseServiceImpl
	implements OKGZService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link tj.sapp.services.service.OKGZServiceUtil} to access the o k g z remote service.
	 */

	/**
	 * Returns the o k g z local service.
	 *
	 * @return the o k g z local service
	 */
	public tj.sapp.services.service.OKGZLocalService getOKGZLocalService() {
		return okgzLocalService;
	}

	/**
	 * Sets the o k g z local service.
	 *
	 * @param okgzLocalService the o k g z local service
	 */
	public void setOKGZLocalService(
		tj.sapp.services.service.OKGZLocalService okgzLocalService) {
		this.okgzLocalService = okgzLocalService;
	}

	/**
	 * Returns the o k g z remote service.
	 *
	 * @return the o k g z remote service
	 */
	public OKGZService getOKGZService() {
		return okgzService;
	}

	/**
	 * Sets the o k g z remote service.
	 *
	 * @param okgzService the o k g z remote service
	 */
	public void setOKGZService(OKGZService okgzService) {
		this.okgzService = okgzService;
	}

	/**
	 * Returns the o k g z persistence.
	 *
	 * @return the o k g z persistence
	 */
	public OKGZPersistence getOKGZPersistence() {
		return okgzPersistence;
	}

	/**
	 * Sets the o k g z persistence.
	 *
	 * @param okgzPersistence the o k g z persistence
	 */
	public void setOKGZPersistence(OKGZPersistence okgzPersistence) {
		this.okgzPersistence = okgzPersistence;
	}

	/**
	 * Returns the Rajony local service.
	 *
	 * @return the Rajony local service
	 */
	public tj.sapp.services.service.RajonyLocalService getRajonyLocalService() {
		return rajonyLocalService;
	}

	/**
	 * Sets the Rajony local service.
	 *
	 * @param rajonyLocalService the Rajony local service
	 */
	public void setRajonyLocalService(
		tj.sapp.services.service.RajonyLocalService rajonyLocalService) {
		this.rajonyLocalService = rajonyLocalService;
	}

	/**
	 * Returns the Rajony remote service.
	 *
	 * @return the Rajony remote service
	 */
	public tj.sapp.services.service.RajonyService getRajonyService() {
		return rajonyService;
	}

	/**
	 * Sets the Rajony remote service.
	 *
	 * @param rajonyService the Rajony remote service
	 */
	public void setRajonyService(
		tj.sapp.services.service.RajonyService rajonyService) {
		this.rajonyService = rajonyService;
	}

	/**
	 * Returns the Rajony persistence.
	 *
	 * @return the Rajony persistence
	 */
	public RajonyPersistence getRajonyPersistence() {
		return rajonyPersistence;
	}

	/**
	 * Sets the Rajony persistence.
	 *
	 * @param rajonyPersistence the Rajony persistence
	 */
	public void setRajonyPersistence(RajonyPersistence rajonyPersistence) {
		this.rajonyPersistence = rajonyPersistence;
	}

	/**
	 * Returns the v b k local service.
	 *
	 * @return the v b k local service
	 */
	public tj.sapp.services.service.VBKLocalService getVBKLocalService() {
		return vbkLocalService;
	}

	/**
	 * Sets the v b k local service.
	 *
	 * @param vbkLocalService the v b k local service
	 */
	public void setVBKLocalService(
		tj.sapp.services.service.VBKLocalService vbkLocalService) {
		this.vbkLocalService = vbkLocalService;
	}

	/**
	 * Returns the v b k remote service.
	 *
	 * @return the v b k remote service
	 */
	public tj.sapp.services.service.VBKService getVBKService() {
		return vbkService;
	}

	/**
	 * Sets the v b k remote service.
	 *
	 * @param vbkService the v b k remote service
	 */
	public void setVBKService(tj.sapp.services.service.VBKService vbkService) {
		this.vbkService = vbkService;
	}

	/**
	 * Returns the v b k persistence.
	 *
	 * @return the v b k persistence
	 */
	public VBKPersistence getVBKPersistence() {
		return vbkPersistence;
	}

	/**
	 * Sets the v b k persistence.
	 *
	 * @param vbkPersistence the v b k persistence
	 */
	public void setVBKPersistence(VBKPersistence vbkPersistence) {
		this.vbkPersistence = vbkPersistence;
	}

	/**
	 * Returns the v w_ izvewenija local service.
	 *
	 * @return the v w_ izvewenija local service
	 */
	public tj.sapp.services.service.VW_IzvewenijaLocalService getVW_IzvewenijaLocalService() {
		return vw_IzvewenijaLocalService;
	}

	/**
	 * Sets the v w_ izvewenija local service.
	 *
	 * @param vw_IzvewenijaLocalService the v w_ izvewenija local service
	 */
	public void setVW_IzvewenijaLocalService(
		tj.sapp.services.service.VW_IzvewenijaLocalService vw_IzvewenijaLocalService) {
		this.vw_IzvewenijaLocalService = vw_IzvewenijaLocalService;
	}

	/**
	 * Returns the v w_ izvewenija remote service.
	 *
	 * @return the v w_ izvewenija remote service
	 */
	public tj.sapp.services.service.VW_IzvewenijaService getVW_IzvewenijaService() {
		return vw_IzvewenijaService;
	}

	/**
	 * Sets the v w_ izvewenija remote service.
	 *
	 * @param vw_IzvewenijaService the v w_ izvewenija remote service
	 */
	public void setVW_IzvewenijaService(
		tj.sapp.services.service.VW_IzvewenijaService vw_IzvewenijaService) {
		this.vw_IzvewenijaService = vw_IzvewenijaService;
	}

	/**
	 * Returns the v w_ izvewenija persistence.
	 *
	 * @return the v w_ izvewenija persistence
	 */
	public VW_IzvewenijaPersistence getVW_IzvewenijaPersistence() {
		return vw_IzvewenijaPersistence;
	}

	/**
	 * Sets the v w_ izvewenija persistence.
	 *
	 * @param vw_IzvewenijaPersistence the v w_ izvewenija persistence
	 */
	public void setVW_IzvewenijaPersistence(
		VW_IzvewenijaPersistence vw_IzvewenijaPersistence) {
		this.vw_IzvewenijaPersistence = vw_IzvewenijaPersistence;
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
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.kernel.service.ClassNameService getClassNameService() {
		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.kernel.service.ClassNameService classNameService) {
		this.classNameService = classNameService;
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
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.kernel.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.kernel.service.UserService userService) {
		this.userService = userService;
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
	}

	public void destroy() {
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return OKGZService.class.getName();
	}

	protected Class<?> getModelClass() {
		return OKGZ.class;
	}

	protected String getModelClassName() {
		return OKGZ.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = okgzPersistence.getDataSource();

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

	@BeanReference(type = tj.sapp.services.service.OKGZLocalService.class)
	protected tj.sapp.services.service.OKGZLocalService okgzLocalService;
	@BeanReference(type = OKGZService.class)
	protected OKGZService okgzService;
	@BeanReference(type = OKGZPersistence.class)
	protected OKGZPersistence okgzPersistence;
	@BeanReference(type = tj.sapp.services.service.RajonyLocalService.class)
	protected tj.sapp.services.service.RajonyLocalService rajonyLocalService;
	@BeanReference(type = tj.sapp.services.service.RajonyService.class)
	protected tj.sapp.services.service.RajonyService rajonyService;
	@BeanReference(type = RajonyPersistence.class)
	protected RajonyPersistence rajonyPersistence;
	@BeanReference(type = tj.sapp.services.service.VBKLocalService.class)
	protected tj.sapp.services.service.VBKLocalService vbkLocalService;
	@BeanReference(type = tj.sapp.services.service.VBKService.class)
	protected tj.sapp.services.service.VBKService vbkService;
	@BeanReference(type = VBKPersistence.class)
	protected VBKPersistence vbkPersistence;
	@BeanReference(type = tj.sapp.services.service.VW_IzvewenijaLocalService.class)
	protected tj.sapp.services.service.VW_IzvewenijaLocalService vw_IzvewenijaLocalService;
	@BeanReference(type = tj.sapp.services.service.VW_IzvewenijaService.class)
	protected tj.sapp.services.service.VW_IzvewenijaService vw_IzvewenijaService;
	@BeanReference(type = VW_IzvewenijaPersistence.class)
	protected VW_IzvewenijaPersistence vw_IzvewenijaPersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameService.class)
	protected com.liferay.portal.kernel.service.ClassNameService classNameService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserService.class)
	protected com.liferay.portal.kernel.service.UserService userService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
}