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

package tj.zajavki.ot.postavwikov.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikov;

import java.io.Serializable;

import java.util.List;
import java.util.Map;

/**
 * Provides the local service interface for ZajavkiOtPostavwikov. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see ZajavkiOtPostavwikovLocalServiceUtil
 * @see tj.zajavki.ot.postavwikov.service.base.ZajavkiOtPostavwikovLocalServiceBaseImpl
 * @see tj.zajavki.ot.postavwikov.service.impl.ZajavkiOtPostavwikovLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ZajavkiOtPostavwikovLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ZajavkiOtPostavwikovLocalServiceUtil} to access the zajavki ot postavwikov local service. Add custom service methods to {@link tj.zajavki.ot.postavwikov.service.impl.ZajavkiOtPostavwikovLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public double getTotalPrice(long lot_id, long postavwik_id);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCountLotId(long lot_id);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCountZajavkiOtPostavwikovs(long lot_id, long postavwik_id);

	/**
	* Returns the number of zajavki ot postavwikovs.
	*
	* @return the number of zajavki ot postavwikovs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getZajavkiOtPostavwikovsCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.zajavki.ot.postavwikov.model.impl.ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.zajavki.ot.postavwikov.model.impl.ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	/**
	* Returns a range of all the zajavki ot postavwikovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.zajavki.ot.postavwikov.model.impl.ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of zajavki ot postavwikovs
	* @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	* @return the range of zajavki ot postavwikovs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ZajavkiOtPostavwikov> getZajavkiOtPostavwikovs(int start,
		int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ZajavkiOtPostavwikov> getZajavkiOtPostavwikovs(long lot_id,
		long postavwik_id);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ZajavkiOtPostavwikov> getZajavkiOtPostavwikovs(long tovar_id);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Map<java.lang.Long, ZajavkiOtPostavwikov> getMapZajavkiOtPostavwikovs(
		long lot_id, long postavwik_id);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	/**
	* Adds the zajavki ot postavwikov to the database. Also notifies the appropriate model listeners.
	*
	* @param zajavkiOtPostavwikov the zajavki ot postavwikov
	* @return the zajavki ot postavwikov that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public ZajavkiOtPostavwikov addZajavkiOtPostavwikov(
		ZajavkiOtPostavwikov zajavkiOtPostavwikov);

	/**
	* Creates a new zajavki ot postavwikov with the primary key. Does not add the zajavki ot postavwikov to the database.
	*
	* @param zajavki_ot_postavwikov_id the primary key for the new zajavki ot postavwikov
	* @return the new zajavki ot postavwikov
	*/
	public ZajavkiOtPostavwikov createZajavkiOtPostavwikov(
		long zajavki_ot_postavwikov_id);

	/**
	* Deletes the zajavki ot postavwikov with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param zajavki_ot_postavwikov_id the primary key of the zajavki ot postavwikov
	* @return the zajavki ot postavwikov that was removed
	* @throws PortalException if a zajavki ot postavwikov with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public ZajavkiOtPostavwikov deleteZajavkiOtPostavwikov(
		long zajavki_ot_postavwikov_id) throws PortalException;

	/**
	* Deletes the zajavki ot postavwikov from the database. Also notifies the appropriate model listeners.
	*
	* @param zajavkiOtPostavwikov the zajavki ot postavwikov
	* @return the zajavki ot postavwikov that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public ZajavkiOtPostavwikov deleteZajavkiOtPostavwikov(
		ZajavkiOtPostavwikov zajavkiOtPostavwikov);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ZajavkiOtPostavwikov fetchZajavkiOtPostavwikov(
		long zajavki_ot_postavwikov_id);

	/**
	* Returns the zajavki ot postavwikov with the primary key.
	*
	* @param zajavki_ot_postavwikov_id the primary key of the zajavki ot postavwikov
	* @return the zajavki ot postavwikov
	* @throws PortalException if a zajavki ot postavwikov with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ZajavkiOtPostavwikov getZajavkiOtPostavwikov(
		long zajavki_ot_postavwikov_id) throws PortalException;

	/**
	* Updates the zajavki ot postavwikov in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param zajavkiOtPostavwikov the zajavki ot postavwikov
	* @return the zajavki ot postavwikov that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public ZajavkiOtPostavwikov updateZajavkiOtPostavwikov(
		ZajavkiOtPostavwikov zajavkiOtPostavwikov);
}