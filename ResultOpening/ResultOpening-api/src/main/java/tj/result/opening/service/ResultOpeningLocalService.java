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

package tj.result.opening.service;

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

import tj.result.opening.model.ResultOpening;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for ResultOpening. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see ResultOpeningLocalServiceUtil
 * @see tj.result.opening.service.base.ResultOpeningLocalServiceBaseImpl
 * @see tj.result.opening.service.impl.ResultOpeningLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ResultOpeningLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ResultOpeningLocalServiceUtil} to access the result opening local service. Add custom service methods to {@link tj.result.opening.service.impl.ResultOpeningLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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

	/**
	* Returns the number of result openings.
	*
	* @return the number of result openings
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getResultOpeningsCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.result.opening.model.impl.ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.result.opening.model.impl.ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the result openings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.result.opening.model.impl.ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of result openings
	* @param end the upper bound of the range of result openings (not inclusive)
	* @return the range of result openings
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ResultOpening> getResultOpenings(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ResultOpening> getResultOpenings(long spisok_lotov_id,
		int status);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ResultOpening> getResultOpeningsByLotId(long spisok_lotov_id);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ResultOpening> getResultOpeningsByProtocolOpeningId(
		long protocol_opening_id);

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
	* Adds the result opening to the database. Also notifies the appropriate model listeners.
	*
	* @param resultOpening the result opening
	* @return the result opening that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public ResultOpening addResultOpening(ResultOpening resultOpening);

	/**
	* Creates a new result opening with the primary key. Does not add the result opening to the database.
	*
	* @param result_opening_id the primary key for the new result opening
	* @return the new result opening
	*/
	public ResultOpening createResultOpening(long result_opening_id);

	/**
	* Deletes the result opening with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param result_opening_id the primary key of the result opening
	* @return the result opening that was removed
	* @throws PortalException if a result opening with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public ResultOpening deleteResultOpening(long result_opening_id)
		throws PortalException;

	/**
	* Deletes the result opening from the database. Also notifies the appropriate model listeners.
	*
	* @param resultOpening the result opening
	* @return the result opening that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public ResultOpening deleteResultOpening(ResultOpening resultOpening);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ResultOpening fetchResultOpening(long result_opening_id);

	/**
	* Returns the result opening with the primary key.
	*
	* @param result_opening_id the primary key of the result opening
	* @return the result opening
	* @throws PortalException if a result opening with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ResultOpening getResultOpening(long result_opening_id)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ResultOpening getResultOpening(long spisok_lotov_id,
		long postavwik_id);

	/**
	* Updates the result opening in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resultOpening the result opening
	* @return the result opening that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public ResultOpening updateResultOpening(ResultOpening resultOpening);
}