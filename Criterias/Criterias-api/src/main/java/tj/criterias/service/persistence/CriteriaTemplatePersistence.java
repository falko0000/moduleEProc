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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.criterias.exception.NoSuchCriteriaTemplateException;

import tj.criterias.model.CriteriaTemplate;

/**
 * The persistence interface for the criteria template service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.criterias.service.persistence.impl.CriteriaTemplatePersistenceImpl
 * @see CriteriaTemplateUtil
 * @generated
 */
@ProviderType
public interface CriteriaTemplatePersistence extends BasePersistence<CriteriaTemplate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CriteriaTemplateUtil} to access the criteria template persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the criteria templates where criteria_category_id = &#63;.
	*
	* @param criteria_category_id the criteria_category_id
	* @return the matching criteria templates
	*/
	public java.util.List<CriteriaTemplate> findByCriteriaCategoryId(
		int criteria_category_id);

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
	public java.util.List<CriteriaTemplate> findByCriteriaCategoryId(
		int criteria_category_id, int start, int end);

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
	public java.util.List<CriteriaTemplate> findByCriteriaCategoryId(
		int criteria_category_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaTemplate> orderByComparator);

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
	public java.util.List<CriteriaTemplate> findByCriteriaCategoryId(
		int criteria_category_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaTemplate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first criteria template in the ordered set where criteria_category_id = &#63;.
	*
	* @param criteria_category_id the criteria_category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria template
	* @throws NoSuchCriteriaTemplateException if a matching criteria template could not be found
	*/
	public CriteriaTemplate findByCriteriaCategoryId_First(
		int criteria_category_id,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaTemplate> orderByComparator)
		throws NoSuchCriteriaTemplateException;

	/**
	* Returns the first criteria template in the ordered set where criteria_category_id = &#63;.
	*
	* @param criteria_category_id the criteria_category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria template, or <code>null</code> if a matching criteria template could not be found
	*/
	public CriteriaTemplate fetchByCriteriaCategoryId_First(
		int criteria_category_id,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaTemplate> orderByComparator);

	/**
	* Returns the last criteria template in the ordered set where criteria_category_id = &#63;.
	*
	* @param criteria_category_id the criteria_category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria template
	* @throws NoSuchCriteriaTemplateException if a matching criteria template could not be found
	*/
	public CriteriaTemplate findByCriteriaCategoryId_Last(
		int criteria_category_id,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaTemplate> orderByComparator)
		throws NoSuchCriteriaTemplateException;

	/**
	* Returns the last criteria template in the ordered set where criteria_category_id = &#63;.
	*
	* @param criteria_category_id the criteria_category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria template, or <code>null</code> if a matching criteria template could not be found
	*/
	public CriteriaTemplate fetchByCriteriaCategoryId_Last(
		int criteria_category_id,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaTemplate> orderByComparator);

	/**
	* Returns the criteria templates before and after the current criteria template in the ordered set where criteria_category_id = &#63;.
	*
	* @param criteria_template_id the primary key of the current criteria template
	* @param criteria_category_id the criteria_category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next criteria template
	* @throws NoSuchCriteriaTemplateException if a criteria template with the primary key could not be found
	*/
	public CriteriaTemplate[] findByCriteriaCategoryId_PrevAndNext(
		long criteria_template_id, int criteria_category_id,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaTemplate> orderByComparator)
		throws NoSuchCriteriaTemplateException;

	/**
	* Removes all the criteria templates where criteria_category_id = &#63; from the database.
	*
	* @param criteria_category_id the criteria_category_id
	*/
	public void removeByCriteriaCategoryId(int criteria_category_id);

	/**
	* Returns the number of criteria templates where criteria_category_id = &#63;.
	*
	* @param criteria_category_id the criteria_category_id
	* @return the number of matching criteria templates
	*/
	public int countByCriteriaCategoryId(int criteria_category_id);

	/**
	* Returns the criteria template where criteria_category_id = &#63; and criteria_type_id = &#63; or throws a {@link NoSuchCriteriaTemplateException} if it could not be found.
	*
	* @param criteria_category_id the criteria_category_id
	* @param criteria_type_id the criteria_type_id
	* @return the matching criteria template
	* @throws NoSuchCriteriaTemplateException if a matching criteria template could not be found
	*/
	public CriteriaTemplate findBycategoryIdAndTypeId(
		int criteria_category_id, int criteria_type_id)
		throws NoSuchCriteriaTemplateException;

	/**
	* Returns the criteria template where criteria_category_id = &#63; and criteria_type_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param criteria_category_id the criteria_category_id
	* @param criteria_type_id the criteria_type_id
	* @return the matching criteria template, or <code>null</code> if a matching criteria template could not be found
	*/
	public CriteriaTemplate fetchBycategoryIdAndTypeId(
		int criteria_category_id, int criteria_type_id);

	/**
	* Returns the criteria template where criteria_category_id = &#63; and criteria_type_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param criteria_category_id the criteria_category_id
	* @param criteria_type_id the criteria_type_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching criteria template, or <code>null</code> if a matching criteria template could not be found
	*/
	public CriteriaTemplate fetchBycategoryIdAndTypeId(
		int criteria_category_id, int criteria_type_id,
		boolean retrieveFromCache);

	/**
	* Removes the criteria template where criteria_category_id = &#63; and criteria_type_id = &#63; from the database.
	*
	* @param criteria_category_id the criteria_category_id
	* @param criteria_type_id the criteria_type_id
	* @return the criteria template that was removed
	*/
	public CriteriaTemplate removeBycategoryIdAndTypeId(
		int criteria_category_id, int criteria_type_id)
		throws NoSuchCriteriaTemplateException;

	/**
	* Returns the number of criteria templates where criteria_category_id = &#63; and criteria_type_id = &#63;.
	*
	* @param criteria_category_id the criteria_category_id
	* @param criteria_type_id the criteria_type_id
	* @return the number of matching criteria templates
	*/
	public int countBycategoryIdAndTypeId(int criteria_category_id,
		int criteria_type_id);

	/**
	* Returns all the criteria templates where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @return the matching criteria templates
	*/
	public java.util.List<CriteriaTemplate> findBytypeId(int criteria_type_id);

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
	public java.util.List<CriteriaTemplate> findBytypeId(int criteria_type_id,
		int start, int end);

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
	public java.util.List<CriteriaTemplate> findBytypeId(int criteria_type_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaTemplate> orderByComparator);

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
	public java.util.List<CriteriaTemplate> findBytypeId(int criteria_type_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaTemplate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first criteria template in the ordered set where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria template
	* @throws NoSuchCriteriaTemplateException if a matching criteria template could not be found
	*/
	public CriteriaTemplate findBytypeId_First(int criteria_type_id,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaTemplate> orderByComparator)
		throws NoSuchCriteriaTemplateException;

	/**
	* Returns the first criteria template in the ordered set where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria template, or <code>null</code> if a matching criteria template could not be found
	*/
	public CriteriaTemplate fetchBytypeId_First(int criteria_type_id,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaTemplate> orderByComparator);

	/**
	* Returns the last criteria template in the ordered set where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria template
	* @throws NoSuchCriteriaTemplateException if a matching criteria template could not be found
	*/
	public CriteriaTemplate findBytypeId_Last(int criteria_type_id,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaTemplate> orderByComparator)
		throws NoSuchCriteriaTemplateException;

	/**
	* Returns the last criteria template in the ordered set where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria template, or <code>null</code> if a matching criteria template could not be found
	*/
	public CriteriaTemplate fetchBytypeId_Last(int criteria_type_id,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaTemplate> orderByComparator);

	/**
	* Returns the criteria templates before and after the current criteria template in the ordered set where criteria_type_id = &#63;.
	*
	* @param criteria_template_id the primary key of the current criteria template
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next criteria template
	* @throws NoSuchCriteriaTemplateException if a criteria template with the primary key could not be found
	*/
	public CriteriaTemplate[] findBytypeId_PrevAndNext(
		long criteria_template_id, int criteria_type_id,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaTemplate> orderByComparator)
		throws NoSuchCriteriaTemplateException;

	/**
	* Removes all the criteria templates where criteria_type_id = &#63; from the database.
	*
	* @param criteria_type_id the criteria_type_id
	*/
	public void removeBytypeId(int criteria_type_id);

	/**
	* Returns the number of criteria templates where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @return the number of matching criteria templates
	*/
	public int countBytypeId(int criteria_type_id);

	/**
	* Caches the criteria template in the entity cache if it is enabled.
	*
	* @param criteriaTemplate the criteria template
	*/
	public void cacheResult(CriteriaTemplate criteriaTemplate);

	/**
	* Caches the criteria templates in the entity cache if it is enabled.
	*
	* @param criteriaTemplates the criteria templates
	*/
	public void cacheResult(java.util.List<CriteriaTemplate> criteriaTemplates);

	/**
	* Creates a new criteria template with the primary key. Does not add the criteria template to the database.
	*
	* @param criteria_template_id the primary key for the new criteria template
	* @return the new criteria template
	*/
	public CriteriaTemplate create(long criteria_template_id);

	/**
	* Removes the criteria template with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param criteria_template_id the primary key of the criteria template
	* @return the criteria template that was removed
	* @throws NoSuchCriteriaTemplateException if a criteria template with the primary key could not be found
	*/
	public CriteriaTemplate remove(long criteria_template_id)
		throws NoSuchCriteriaTemplateException;

	public CriteriaTemplate updateImpl(CriteriaTemplate criteriaTemplate);

	/**
	* Returns the criteria template with the primary key or throws a {@link NoSuchCriteriaTemplateException} if it could not be found.
	*
	* @param criteria_template_id the primary key of the criteria template
	* @return the criteria template
	* @throws NoSuchCriteriaTemplateException if a criteria template with the primary key could not be found
	*/
	public CriteriaTemplate findByPrimaryKey(long criteria_template_id)
		throws NoSuchCriteriaTemplateException;

	/**
	* Returns the criteria template with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param criteria_template_id the primary key of the criteria template
	* @return the criteria template, or <code>null</code> if a criteria template with the primary key could not be found
	*/
	public CriteriaTemplate fetchByPrimaryKey(long criteria_template_id);

	@Override
	public java.util.Map<java.io.Serializable, CriteriaTemplate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the criteria templates.
	*
	* @return the criteria templates
	*/
	public java.util.List<CriteriaTemplate> findAll();

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
	public java.util.List<CriteriaTemplate> findAll(int start, int end);

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
	public java.util.List<CriteriaTemplate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaTemplate> orderByComparator);

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
	public java.util.List<CriteriaTemplate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaTemplate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the criteria templates from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of criteria templates.
	*
	* @return the number of criteria templates
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}