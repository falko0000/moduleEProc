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

package tj.criterias.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.criterias.model.CriteriaTemplate;

import java.util.List;

/**
 * The persistence utility for the criteria template service. This utility wraps {@link tj.criterias.service.persistence.impl.CriteriaTemplatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaTemplatePersistence
 * @see tj.criterias.service.persistence.impl.CriteriaTemplatePersistenceImpl
 * @generated
 */
@ProviderType
public class CriteriaTemplateUtil {
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
	public static void clearCache(CriteriaTemplate criteriaTemplate) {
		getPersistence().clearCache(criteriaTemplate);
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
	public static List<CriteriaTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CriteriaTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CriteriaTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CriteriaTemplate> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CriteriaTemplate update(CriteriaTemplate criteriaTemplate) {
		return getPersistence().update(criteriaTemplate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CriteriaTemplate update(CriteriaTemplate criteriaTemplate,
		ServiceContext serviceContext) {
		return getPersistence().update(criteriaTemplate, serviceContext);
	}

	/**
	* Returns all the criteria templates where criteria_category_id = &#63;.
	*
	* @param criteria_category_id the criteria_category_id
	* @return the matching criteria templates
	*/
	public static List<CriteriaTemplate> findByCriteriaCategoryId(
		int criteria_category_id) {
		return getPersistence().findByCriteriaCategoryId(criteria_category_id);
	}

	/**
	* Returns a range of all the criteria templates where criteria_category_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param criteria_category_id the criteria_category_id
	* @param start the lower bound of the range of criteria templates
	* @param end the upper bound of the range of criteria templates (not inclusive)
	* @return the range of matching criteria templates
	*/
	public static List<CriteriaTemplate> findByCriteriaCategoryId(
		int criteria_category_id, int start, int end) {
		return getPersistence()
				   .findByCriteriaCategoryId(criteria_category_id, start, end);
	}

	/**
	* Returns an ordered range of all the criteria templates where criteria_category_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param criteria_category_id the criteria_category_id
	* @param start the lower bound of the range of criteria templates
	* @param end the upper bound of the range of criteria templates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching criteria templates
	*/
	public static List<CriteriaTemplate> findByCriteriaCategoryId(
		int criteria_category_id, int start, int end,
		OrderByComparator<CriteriaTemplate> orderByComparator) {
		return getPersistence()
				   .findByCriteriaCategoryId(criteria_category_id, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the criteria templates where criteria_category_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param criteria_category_id the criteria_category_id
	* @param start the lower bound of the range of criteria templates
	* @param end the upper bound of the range of criteria templates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching criteria templates
	*/
	public static List<CriteriaTemplate> findByCriteriaCategoryId(
		int criteria_category_id, int start, int end,
		OrderByComparator<CriteriaTemplate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCriteriaCategoryId(criteria_category_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first criteria template in the ordered set where criteria_category_id = &#63;.
	*
	* @param criteria_category_id the criteria_category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria template
	* @throws NoSuchCriteriaTemplateException if a matching criteria template could not be found
	*/
	public static CriteriaTemplate findByCriteriaCategoryId_First(
		int criteria_category_id,
		OrderByComparator<CriteriaTemplate> orderByComparator)
		throws tj.criterias.exception.NoSuchCriteriaTemplateException {
		return getPersistence()
				   .findByCriteriaCategoryId_First(criteria_category_id,
			orderByComparator);
	}

	/**
	* Returns the first criteria template in the ordered set where criteria_category_id = &#63;.
	*
	* @param criteria_category_id the criteria_category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria template, or <code>null</code> if a matching criteria template could not be found
	*/
	public static CriteriaTemplate fetchByCriteriaCategoryId_First(
		int criteria_category_id,
		OrderByComparator<CriteriaTemplate> orderByComparator) {
		return getPersistence()
				   .fetchByCriteriaCategoryId_First(criteria_category_id,
			orderByComparator);
	}

	/**
	* Returns the last criteria template in the ordered set where criteria_category_id = &#63;.
	*
	* @param criteria_category_id the criteria_category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria template
	* @throws NoSuchCriteriaTemplateException if a matching criteria template could not be found
	*/
	public static CriteriaTemplate findByCriteriaCategoryId_Last(
		int criteria_category_id,
		OrderByComparator<CriteriaTemplate> orderByComparator)
		throws tj.criterias.exception.NoSuchCriteriaTemplateException {
		return getPersistence()
				   .findByCriteriaCategoryId_Last(criteria_category_id,
			orderByComparator);
	}

	/**
	* Returns the last criteria template in the ordered set where criteria_category_id = &#63;.
	*
	* @param criteria_category_id the criteria_category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria template, or <code>null</code> if a matching criteria template could not be found
	*/
	public static CriteriaTemplate fetchByCriteriaCategoryId_Last(
		int criteria_category_id,
		OrderByComparator<CriteriaTemplate> orderByComparator) {
		return getPersistence()
				   .fetchByCriteriaCategoryId_Last(criteria_category_id,
			orderByComparator);
	}

	/**
	* Returns the criteria templates before and after the current criteria template in the ordered set where criteria_category_id = &#63;.
	*
	* @param criteria_template_id the primary key of the current criteria template
	* @param criteria_category_id the criteria_category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next criteria template
	* @throws NoSuchCriteriaTemplateException if a criteria template with the primary key could not be found
	*/
	public static CriteriaTemplate[] findByCriteriaCategoryId_PrevAndNext(
		long criteria_template_id, int criteria_category_id,
		OrderByComparator<CriteriaTemplate> orderByComparator)
		throws tj.criterias.exception.NoSuchCriteriaTemplateException {
		return getPersistence()
				   .findByCriteriaCategoryId_PrevAndNext(criteria_template_id,
			criteria_category_id, orderByComparator);
	}

	/**
	* Removes all the criteria templates where criteria_category_id = &#63; from the database.
	*
	* @param criteria_category_id the criteria_category_id
	*/
	public static void removeByCriteriaCategoryId(int criteria_category_id) {
		getPersistence().removeByCriteriaCategoryId(criteria_category_id);
	}

	/**
	* Returns the number of criteria templates where criteria_category_id = &#63;.
	*
	* @param criteria_category_id the criteria_category_id
	* @return the number of matching criteria templates
	*/
	public static int countByCriteriaCategoryId(int criteria_category_id) {
		return getPersistence().countByCriteriaCategoryId(criteria_category_id);
	}

	/**
	* Returns the criteria template where criteria_category_id = &#63; and criteria_type_id = &#63; or throws a {@link NoSuchCriteriaTemplateException} if it could not be found.
	*
	* @param criteria_category_id the criteria_category_id
	* @param criteria_type_id the criteria_type_id
	* @return the matching criteria template
	* @throws NoSuchCriteriaTemplateException if a matching criteria template could not be found
	*/
	public static CriteriaTemplate findBycategoryIdAndTypeId(
		int criteria_category_id, int criteria_type_id)
		throws tj.criterias.exception.NoSuchCriteriaTemplateException {
		return getPersistence()
				   .findBycategoryIdAndTypeId(criteria_category_id,
			criteria_type_id);
	}

	/**
	* Returns the criteria template where criteria_category_id = &#63; and criteria_type_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param criteria_category_id the criteria_category_id
	* @param criteria_type_id the criteria_type_id
	* @return the matching criteria template, or <code>null</code> if a matching criteria template could not be found
	*/
	public static CriteriaTemplate fetchBycategoryIdAndTypeId(
		int criteria_category_id, int criteria_type_id) {
		return getPersistence()
				   .fetchBycategoryIdAndTypeId(criteria_category_id,
			criteria_type_id);
	}

	/**
	* Returns the criteria template where criteria_category_id = &#63; and criteria_type_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param criteria_category_id the criteria_category_id
	* @param criteria_type_id the criteria_type_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching criteria template, or <code>null</code> if a matching criteria template could not be found
	*/
	public static CriteriaTemplate fetchBycategoryIdAndTypeId(
		int criteria_category_id, int criteria_type_id,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchBycategoryIdAndTypeId(criteria_category_id,
			criteria_type_id, retrieveFromCache);
	}

	/**
	* Removes the criteria template where criteria_category_id = &#63; and criteria_type_id = &#63; from the database.
	*
	* @param criteria_category_id the criteria_category_id
	* @param criteria_type_id the criteria_type_id
	* @return the criteria template that was removed
	*/
	public static CriteriaTemplate removeBycategoryIdAndTypeId(
		int criteria_category_id, int criteria_type_id)
		throws tj.criterias.exception.NoSuchCriteriaTemplateException {
		return getPersistence()
				   .removeBycategoryIdAndTypeId(criteria_category_id,
			criteria_type_id);
	}

	/**
	* Returns the number of criteria templates where criteria_category_id = &#63; and criteria_type_id = &#63;.
	*
	* @param criteria_category_id the criteria_category_id
	* @param criteria_type_id the criteria_type_id
	* @return the number of matching criteria templates
	*/
	public static int countBycategoryIdAndTypeId(int criteria_category_id,
		int criteria_type_id) {
		return getPersistence()
				   .countBycategoryIdAndTypeId(criteria_category_id,
			criteria_type_id);
	}

	/**
	* Returns all the criteria templates where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @return the matching criteria templates
	*/
	public static List<CriteriaTemplate> findBytypeId(int criteria_type_id) {
		return getPersistence().findBytypeId(criteria_type_id);
	}

	/**
	* Returns a range of all the criteria templates where criteria_type_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param criteria_type_id the criteria_type_id
	* @param start the lower bound of the range of criteria templates
	* @param end the upper bound of the range of criteria templates (not inclusive)
	* @return the range of matching criteria templates
	*/
	public static List<CriteriaTemplate> findBytypeId(int criteria_type_id,
		int start, int end) {
		return getPersistence().findBytypeId(criteria_type_id, start, end);
	}

	/**
	* Returns an ordered range of all the criteria templates where criteria_type_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param criteria_type_id the criteria_type_id
	* @param start the lower bound of the range of criteria templates
	* @param end the upper bound of the range of criteria templates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching criteria templates
	*/
	public static List<CriteriaTemplate> findBytypeId(int criteria_type_id,
		int start, int end,
		OrderByComparator<CriteriaTemplate> orderByComparator) {
		return getPersistence()
				   .findBytypeId(criteria_type_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the criteria templates where criteria_type_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param criteria_type_id the criteria_type_id
	* @param start the lower bound of the range of criteria templates
	* @param end the upper bound of the range of criteria templates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching criteria templates
	*/
	public static List<CriteriaTemplate> findBytypeId(int criteria_type_id,
		int start, int end,
		OrderByComparator<CriteriaTemplate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBytypeId(criteria_type_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first criteria template in the ordered set where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria template
	* @throws NoSuchCriteriaTemplateException if a matching criteria template could not be found
	*/
	public static CriteriaTemplate findBytypeId_First(int criteria_type_id,
		OrderByComparator<CriteriaTemplate> orderByComparator)
		throws tj.criterias.exception.NoSuchCriteriaTemplateException {
		return getPersistence()
				   .findBytypeId_First(criteria_type_id, orderByComparator);
	}

	/**
	* Returns the first criteria template in the ordered set where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria template, or <code>null</code> if a matching criteria template could not be found
	*/
	public static CriteriaTemplate fetchBytypeId_First(int criteria_type_id,
		OrderByComparator<CriteriaTemplate> orderByComparator) {
		return getPersistence()
				   .fetchBytypeId_First(criteria_type_id, orderByComparator);
	}

	/**
	* Returns the last criteria template in the ordered set where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria template
	* @throws NoSuchCriteriaTemplateException if a matching criteria template could not be found
	*/
	public static CriteriaTemplate findBytypeId_Last(int criteria_type_id,
		OrderByComparator<CriteriaTemplate> orderByComparator)
		throws tj.criterias.exception.NoSuchCriteriaTemplateException {
		return getPersistence()
				   .findBytypeId_Last(criteria_type_id, orderByComparator);
	}

	/**
	* Returns the last criteria template in the ordered set where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria template, or <code>null</code> if a matching criteria template could not be found
	*/
	public static CriteriaTemplate fetchBytypeId_Last(int criteria_type_id,
		OrderByComparator<CriteriaTemplate> orderByComparator) {
		return getPersistence()
				   .fetchBytypeId_Last(criteria_type_id, orderByComparator);
	}

	/**
	* Returns the criteria templates before and after the current criteria template in the ordered set where criteria_type_id = &#63;.
	*
	* @param criteria_template_id the primary key of the current criteria template
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next criteria template
	* @throws NoSuchCriteriaTemplateException if a criteria template with the primary key could not be found
	*/
	public static CriteriaTemplate[] findBytypeId_PrevAndNext(
		long criteria_template_id, int criteria_type_id,
		OrderByComparator<CriteriaTemplate> orderByComparator)
		throws tj.criterias.exception.NoSuchCriteriaTemplateException {
		return getPersistence()
				   .findBytypeId_PrevAndNext(criteria_template_id,
			criteria_type_id, orderByComparator);
	}

	/**
	* Removes all the criteria templates where criteria_type_id = &#63; from the database.
	*
	* @param criteria_type_id the criteria_type_id
	*/
	public static void removeBytypeId(int criteria_type_id) {
		getPersistence().removeBytypeId(criteria_type_id);
	}

	/**
	* Returns the number of criteria templates where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @return the number of matching criteria templates
	*/
	public static int countBytypeId(int criteria_type_id) {
		return getPersistence().countBytypeId(criteria_type_id);
	}

	/**
	* Caches the criteria template in the entity cache if it is enabled.
	*
	* @param criteriaTemplate the criteria template
	*/
	public static void cacheResult(CriteriaTemplate criteriaTemplate) {
		getPersistence().cacheResult(criteriaTemplate);
	}

	/**
	* Caches the criteria templates in the entity cache if it is enabled.
	*
	* @param criteriaTemplates the criteria templates
	*/
	public static void cacheResult(List<CriteriaTemplate> criteriaTemplates) {
		getPersistence().cacheResult(criteriaTemplates);
	}

	/**
	* Creates a new criteria template with the primary key. Does not add the criteria template to the database.
	*
	* @param criteria_template_id the primary key for the new criteria template
	* @return the new criteria template
	*/
	public static CriteriaTemplate create(long criteria_template_id) {
		return getPersistence().create(criteria_template_id);
	}

	/**
	* Removes the criteria template with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param criteria_template_id the primary key of the criteria template
	* @return the criteria template that was removed
	* @throws NoSuchCriteriaTemplateException if a criteria template with the primary key could not be found
	*/
	public static CriteriaTemplate remove(long criteria_template_id)
		throws tj.criterias.exception.NoSuchCriteriaTemplateException {
		return getPersistence().remove(criteria_template_id);
	}

	public static CriteriaTemplate updateImpl(CriteriaTemplate criteriaTemplate) {
		return getPersistence().updateImpl(criteriaTemplate);
	}

	/**
	* Returns the criteria template with the primary key or throws a {@link NoSuchCriteriaTemplateException} if it could not be found.
	*
	* @param criteria_template_id the primary key of the criteria template
	* @return the criteria template
	* @throws NoSuchCriteriaTemplateException if a criteria template with the primary key could not be found
	*/
	public static CriteriaTemplate findByPrimaryKey(long criteria_template_id)
		throws tj.criterias.exception.NoSuchCriteriaTemplateException {
		return getPersistence().findByPrimaryKey(criteria_template_id);
	}

	/**
	* Returns the criteria template with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param criteria_template_id the primary key of the criteria template
	* @return the criteria template, or <code>null</code> if a criteria template with the primary key could not be found
	*/
	public static CriteriaTemplate fetchByPrimaryKey(long criteria_template_id) {
		return getPersistence().fetchByPrimaryKey(criteria_template_id);
	}

	public static java.util.Map<java.io.Serializable, CriteriaTemplate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the criteria templates.
	*
	* @return the criteria templates
	*/
	public static List<CriteriaTemplate> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the criteria templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of criteria templates
	* @param end the upper bound of the range of criteria templates (not inclusive)
	* @return the range of criteria templates
	*/
	public static List<CriteriaTemplate> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the criteria templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of criteria templates
	* @param end the upper bound of the range of criteria templates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of criteria templates
	*/
	public static List<CriteriaTemplate> findAll(int start, int end,
		OrderByComparator<CriteriaTemplate> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the criteria templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of criteria templates
	* @param end the upper bound of the range of criteria templates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of criteria templates
	*/
	public static List<CriteriaTemplate> findAll(int start, int end,
		OrderByComparator<CriteriaTemplate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the criteria templates from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of criteria templates.
	*
	* @return the number of criteria templates
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CriteriaTemplatePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CriteriaTemplatePersistence, CriteriaTemplatePersistence> _serviceTracker =
		ServiceTrackerFactory.open(CriteriaTemplatePersistence.class);
}