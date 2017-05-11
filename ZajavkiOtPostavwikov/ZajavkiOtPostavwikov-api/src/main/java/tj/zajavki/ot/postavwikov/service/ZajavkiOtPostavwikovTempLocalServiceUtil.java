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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for ZajavkiOtPostavwikovTemp. This utility wraps
 * {@link tj.zajavki.ot.postavwikov.service.impl.ZajavkiOtPostavwikovTempLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ZajavkiOtPostavwikovTempLocalService
 * @see tj.zajavki.ot.postavwikov.service.base.ZajavkiOtPostavwikovTempLocalServiceBaseImpl
 * @see tj.zajavki.ot.postavwikov.service.impl.ZajavkiOtPostavwikovTempLocalServiceImpl
 * @generated
 */
@ProviderType
public class ZajavkiOtPostavwikovTempLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.zajavki.ot.postavwikov.service.impl.ZajavkiOtPostavwikovTempLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static boolean compareTo(
		tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp otPostavwikovTemp,
		java.lang.String predlozhenie_postavwika,
		java.lang.String opisanie_tovara, long kod_strany_proizvoditelja,
		double summa_za_edinicu_tovara) {
		return getService()
				   .compareTo(otPostavwikovTemp, predlozhenie_postavwika,
			opisanie_tovara, kod_strany_proizvoditelja, summa_za_edinicu_tovara);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	public static int getCountLotId(long lot_id) {
		return getService().getCountLotId(lot_id);
	}

	public static int getCountZajavkiOtPostavwikovs(long lot_id,
		long postavwik_id) {
		return getService().getCountZajavkiOtPostavwikovs(lot_id, postavwik_id);
	}

	/**
	* Returns the number of zajavki ot postavwikov temps.
	*
	* @return the number of zajavki ot postavwikov temps
	*/
	public static int getZajavkiOtPostavwikovTempsCount() {
		return getService().getZajavkiOtPostavwikovTempsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.zajavki.ot.postavwikov.model.impl.ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.zajavki.ot.postavwikov.model.impl.ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the zajavki ot postavwikov temps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.zajavki.ot.postavwikov.model.impl.ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of zajavki ot postavwikov temps
	* @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	* @return the range of zajavki ot postavwikov temps
	*/
	public static java.util.List<tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp> getZajavkiOtPostavwikovTemps(
		int start, int end) {
		return getService().getZajavkiOtPostavwikovTemps(start, end);
	}

	public static java.util.List<tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp> getZajavkiOtPostavwikovs(
		long lot_id, long postavwik_id) {
		return getService().getZajavkiOtPostavwikovs(lot_id, postavwik_id);
	}

	public static java.util.List<tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp> getZajavkiOtPostavwikovs(
		long tovar_id) {
		return getService().getZajavkiOtPostavwikovs(tovar_id);
	}

	public static java.util.Map<java.lang.Long, tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp> getMapZajavkiOtPostavwikovs(
		long lot_id, long postavwik_id) {
		return getService().getMapZajavkiOtPostavwikovs(lot_id, postavwik_id);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the zajavki ot postavwikov temp to the database. Also notifies the appropriate model listeners.
	*
	* @param zajavkiOtPostavwikovTemp the zajavki ot postavwikov temp
	* @return the zajavki ot postavwikov temp that was added
	*/
	public static tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp addZajavkiOtPostavwikovTemp(
		tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp) {
		return getService().addZajavkiOtPostavwikovTemp(zajavkiOtPostavwikovTemp);
	}

	/**
	* Creates a new zajavki ot postavwikov temp with the primary key. Does not add the zajavki ot postavwikov temp to the database.
	*
	* @param zajavki_ot_postavwikov_temp_id the primary key for the new zajavki ot postavwikov temp
	* @return the new zajavki ot postavwikov temp
	*/
	public static tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp createZajavkiOtPostavwikovTemp(
		long zajavki_ot_postavwikov_temp_id) {
		return getService()
				   .createZajavkiOtPostavwikovTemp(zajavki_ot_postavwikov_temp_id);
	}

	/**
	* Deletes the zajavki ot postavwikov temp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param zajavki_ot_postavwikov_temp_id the primary key of the zajavki ot postavwikov temp
	* @return the zajavki ot postavwikov temp that was removed
	* @throws PortalException if a zajavki ot postavwikov temp with the primary key could not be found
	*/
	public static tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp deleteZajavkiOtPostavwikovTemp(
		long zajavki_ot_postavwikov_temp_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .deleteZajavkiOtPostavwikovTemp(zajavki_ot_postavwikov_temp_id);
	}

	/**
	* Deletes the zajavki ot postavwikov temp from the database. Also notifies the appropriate model listeners.
	*
	* @param zajavkiOtPostavwikovTemp the zajavki ot postavwikov temp
	* @return the zajavki ot postavwikov temp that was removed
	*/
	public static tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp deleteZajavkiOtPostavwikovTemp(
		tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp) {
		return getService()
				   .deleteZajavkiOtPostavwikovTemp(zajavkiOtPostavwikovTemp);
	}

	public static tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp fetchZajavkiOtPostavwikovTemp(
		long zajavki_ot_postavwikov_temp_id) {
		return getService()
				   .fetchZajavkiOtPostavwikovTemp(zajavki_ot_postavwikov_temp_id);
	}

	/**
	* Returns the zajavki ot postavwikov temp with the primary key.
	*
	* @param zajavki_ot_postavwikov_temp_id the primary key of the zajavki ot postavwikov temp
	* @return the zajavki ot postavwikov temp
	* @throws PortalException if a zajavki ot postavwikov temp with the primary key could not be found
	*/
	public static tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp getZajavkiOtPostavwikovTemp(
		long zajavki_ot_postavwikov_temp_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getZajavkiOtPostavwikovTemp(zajavki_ot_postavwikov_temp_id);
	}

	/**
	* Updates the zajavki ot postavwikov temp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param zajavkiOtPostavwikovTemp the zajavki ot postavwikov temp
	* @return the zajavki ot postavwikov temp that was updated
	*/
	public static tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp updateZajavkiOtPostavwikovTemp(
		tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp) {
		return getService()
				   .updateZajavkiOtPostavwikovTemp(zajavkiOtPostavwikovTemp);
	}

	public static ZajavkiOtPostavwikovTempLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ZajavkiOtPostavwikovTempLocalService, ZajavkiOtPostavwikovTempLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ZajavkiOtPostavwikovTempLocalService.class);
}