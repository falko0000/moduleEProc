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

package tj.postavwiki.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PostavwikiLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PostavwikiLocalService
 * @generated
 */
@ProviderType
public class PostavwikiLocalServiceWrapper implements PostavwikiLocalService,
	ServiceWrapper<PostavwikiLocalService> {
	public PostavwikiLocalServiceWrapper(
		PostavwikiLocalService postavwikiLocalService) {
		_postavwikiLocalService = postavwikiLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _postavwikiLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _postavwikiLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _postavwikiLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _postavwikiLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _postavwikiLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of postavwikis.
	*
	* @return the number of postavwikis
	*/
	@Override
	public int getPostavwikisCount() {
		return _postavwikiLocalService.getPostavwikisCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _postavwikiLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _postavwikiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.postavwiki.model.impl.PostavwikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _postavwikiLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.postavwiki.model.impl.PostavwikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _postavwikiLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the postavwikis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.postavwiki.model.impl.PostavwikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of postavwikis
	* @param end the upper bound of the range of postavwikis (not inclusive)
	* @return the range of postavwikis
	*/
	@Override
	public java.util.List<tj.postavwiki.model.Postavwiki> getPostavwikis(
		int start, int end) {
		return _postavwikiLocalService.getPostavwikis(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _postavwikiLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _postavwikiLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the postavwiki to the database. Also notifies the appropriate model listeners.
	*
	* @param postavwiki the postavwiki
	* @return the postavwiki that was added
	*/
	@Override
	public tj.postavwiki.model.Postavwiki addPostavwiki(
		tj.postavwiki.model.Postavwiki postavwiki) {
		return _postavwikiLocalService.addPostavwiki(postavwiki);
	}

	/**
	* Creates a new postavwiki with the primary key. Does not add the postavwiki to the database.
	*
	* @param postavwiki_id the primary key for the new postavwiki
	* @return the new postavwiki
	*/
	@Override
	public tj.postavwiki.model.Postavwiki createPostavwiki(long postavwiki_id) {
		return _postavwikiLocalService.createPostavwiki(postavwiki_id);
	}

	/**
	* Deletes the postavwiki with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param postavwiki_id the primary key of the postavwiki
	* @return the postavwiki that was removed
	* @throws PortalException if a postavwiki with the primary key could not be found
	*/
	@Override
	public tj.postavwiki.model.Postavwiki deletePostavwiki(long postavwiki_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _postavwikiLocalService.deletePostavwiki(postavwiki_id);
	}

	/**
	* Deletes the postavwiki from the database. Also notifies the appropriate model listeners.
	*
	* @param postavwiki the postavwiki
	* @return the postavwiki that was removed
	*/
	@Override
	public tj.postavwiki.model.Postavwiki deletePostavwiki(
		tj.postavwiki.model.Postavwiki postavwiki) {
		return _postavwikiLocalService.deletePostavwiki(postavwiki);
	}

	@Override
	public tj.postavwiki.model.Postavwiki fetchPostavwiki(long postavwiki_id) {
		return _postavwikiLocalService.fetchPostavwiki(postavwiki_id);
	}

	/**
	* Returns the postavwiki with the primary key.
	*
	* @param postavwiki_id the primary key of the postavwiki
	* @return the postavwiki
	* @throws PortalException if a postavwiki with the primary key could not be found
	*/
	@Override
	public tj.postavwiki.model.Postavwiki getPostavwiki(long postavwiki_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _postavwikiLocalService.getPostavwiki(postavwiki_id);
	}

	@Override
	public tj.postavwiki.model.Postavwiki getPostavwiki(long postavwiki_id,
		long oblast_id)
		throws tj.postavwiki.exception.NoSuchPostavwikiException {
		return _postavwikiLocalService.getPostavwiki(postavwiki_id, oblast_id);
	}

	/**
	* Updates the postavwiki in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param postavwiki the postavwiki
	* @return the postavwiki that was updated
	*/
	@Override
	public tj.postavwiki.model.Postavwiki updatePostavwiki(
		tj.postavwiki.model.Postavwiki postavwiki) {
		return _postavwikiLocalService.updatePostavwiki(postavwiki);
	}

	@Override
	public PostavwikiLocalService getWrappedService() {
		return _postavwikiLocalService;
	}

	@Override
	public void setWrappedService(PostavwikiLocalService postavwikiLocalService) {
		_postavwikiLocalService = postavwikiLocalService;
	}

	private PostavwikiLocalService _postavwikiLocalService;
}