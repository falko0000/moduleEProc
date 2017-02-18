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

package tj.sapp.services.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import tj.sapp.services.exception.NoSuchVW_IzvewenijaException;
import tj.sapp.services.model.VW_Izvewenija;
import tj.sapp.services.model.impl.VW_IzvewenijaImpl;
import tj.sapp.services.model.impl.VW_IzvewenijaModelImpl;
import tj.sapp.services.service.persistence.VW_IzvewenijaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the vw_ izvewenija service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VW_IzvewenijaPersistence
 * @see tj.sapp.services.service.persistence.VW_IzvewenijaUtil
 * @generated
 */
@ProviderType
public class VW_IzvewenijaPersistenceImpl extends BasePersistenceImpl<VW_Izvewenija>
	implements VW_IzvewenijaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VW_IzvewenijaUtil} to access the vw_ izvewenija persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VW_IzvewenijaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VW_IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			VW_IzvewenijaModelImpl.FINDER_CACHE_ENABLED,
			VW_IzvewenijaImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VW_IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			VW_IzvewenijaModelImpl.FINDER_CACHE_ENABLED,
			VW_IzvewenijaImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VW_IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			VW_IzvewenijaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public VW_IzvewenijaPersistenceImpl() {
		setModelClass(VW_Izvewenija.class);
	}

	/**
	 * Caches the vw_ izvewenija in the entity cache if it is enabled.
	 *
	 * @param vw_Izvewenija the vw_ izvewenija
	 */
	@Override
	public void cacheResult(VW_Izvewenija vw_Izvewenija) {
		entityCache.putResult(VW_IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			VW_IzvewenijaImpl.class, vw_Izvewenija.getPrimaryKey(),
			vw_Izvewenija);

		vw_Izvewenija.resetOriginalValues();
	}

	/**
	 * Caches the vw_ izvewenijas in the entity cache if it is enabled.
	 *
	 * @param vw_Izvewenijas the vw_ izvewenijas
	 */
	@Override
	public void cacheResult(List<VW_Izvewenija> vw_Izvewenijas) {
		for (VW_Izvewenija vw_Izvewenija : vw_Izvewenijas) {
			if (entityCache.getResult(
						VW_IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
						VW_IzvewenijaImpl.class, vw_Izvewenija.getPrimaryKey()) == null) {
				cacheResult(vw_Izvewenija);
			}
			else {
				vw_Izvewenija.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vw_ izvewenijas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VW_IzvewenijaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vw_ izvewenija.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VW_Izvewenija vw_Izvewenija) {
		entityCache.removeResult(VW_IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			VW_IzvewenijaImpl.class, vw_Izvewenija.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VW_Izvewenija> vw_Izvewenijas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VW_Izvewenija vw_Izvewenija : vw_Izvewenijas) {
			entityCache.removeResult(VW_IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
				VW_IzvewenijaImpl.class, vw_Izvewenija.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vw_ izvewenija with the primary key. Does not add the vw_ izvewenija to the database.
	 *
	 * @param izvewenija_id the primary key for the new vw_ izvewenija
	 * @return the new vw_ izvewenija
	 */
	@Override
	public VW_Izvewenija create(long izvewenija_id) {
		VW_Izvewenija vw_Izvewenija = new VW_IzvewenijaImpl();

		vw_Izvewenija.setNew(true);
		vw_Izvewenija.setPrimaryKey(izvewenija_id);

		return vw_Izvewenija;
	}

	/**
	 * Removes the vw_ izvewenija with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param izvewenija_id the primary key of the vw_ izvewenija
	 * @return the vw_ izvewenija that was removed
	 * @throws NoSuchVW_IzvewenijaException if a vw_ izvewenija with the primary key could not be found
	 */
	@Override
	public VW_Izvewenija remove(long izvewenija_id)
		throws NoSuchVW_IzvewenijaException {
		return remove((Serializable)izvewenija_id);
	}

	/**
	 * Removes the vw_ izvewenija with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vw_ izvewenija
	 * @return the vw_ izvewenija that was removed
	 * @throws NoSuchVW_IzvewenijaException if a vw_ izvewenija with the primary key could not be found
	 */
	@Override
	public VW_Izvewenija remove(Serializable primaryKey)
		throws NoSuchVW_IzvewenijaException {
		Session session = null;

		try {
			session = openSession();

			VW_Izvewenija vw_Izvewenija = (VW_Izvewenija)session.get(VW_IzvewenijaImpl.class,
					primaryKey);

			if (vw_Izvewenija == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVW_IzvewenijaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vw_Izvewenija);
		}
		catch (NoSuchVW_IzvewenijaException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected VW_Izvewenija removeImpl(VW_Izvewenija vw_Izvewenija) {
		vw_Izvewenija = toUnwrappedModel(vw_Izvewenija);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vw_Izvewenija)) {
				vw_Izvewenija = (VW_Izvewenija)session.get(VW_IzvewenijaImpl.class,
						vw_Izvewenija.getPrimaryKeyObj());
			}

			if (vw_Izvewenija != null) {
				session.delete(vw_Izvewenija);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vw_Izvewenija != null) {
			clearCache(vw_Izvewenija);
		}

		return vw_Izvewenija;
	}

	@Override
	public VW_Izvewenija updateImpl(VW_Izvewenija vw_Izvewenija) {
		vw_Izvewenija = toUnwrappedModel(vw_Izvewenija);

		boolean isNew = vw_Izvewenija.isNew();

		Session session = null;

		try {
			session = openSession();

			if (vw_Izvewenija.isNew()) {
				session.save(vw_Izvewenija);

				vw_Izvewenija.setNew(false);
			}
			else {
				vw_Izvewenija = (VW_Izvewenija)session.merge(vw_Izvewenija);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(VW_IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
			VW_IzvewenijaImpl.class, vw_Izvewenija.getPrimaryKey(),
			vw_Izvewenija, false);

		vw_Izvewenija.resetOriginalValues();

		return vw_Izvewenija;
	}

	protected VW_Izvewenija toUnwrappedModel(VW_Izvewenija vw_Izvewenija) {
		if (vw_Izvewenija instanceof VW_IzvewenijaImpl) {
			return vw_Izvewenija;
		}

		VW_IzvewenijaImpl vw_IzvewenijaImpl = new VW_IzvewenijaImpl();

		vw_IzvewenijaImpl.setNew(vw_Izvewenija.isNew());
		vw_IzvewenijaImpl.setPrimaryKey(vw_Izvewenija.getPrimaryKey());

		vw_IzvewenijaImpl.setIzvewenija_id(vw_Izvewenija.getIzvewenija_id());
		vw_IzvewenijaImpl.setSostojanie_id(vw_Izvewenija.getSostojanie_id());
		vw_IzvewenijaImpl.setStatus_id(vw_Izvewenija.getStatus_id());
		vw_IzvewenijaImpl.setTip_izvewenija_id(vw_Izvewenija.getTip_izvewenija_id());
		vw_IzvewenijaImpl.setOrganizacija_id(vw_Izvewenija.getOrganizacija_id());
		vw_IzvewenijaImpl.setVyshestojawaja_organizacija_id(vw_Izvewenija.getVyshestojawaja_organizacija_id());
		vw_IzvewenijaImpl.setNaimenovanie(vw_Izvewenija.getNaimenovanie());
		vw_IzvewenijaImpl.setSozdal(vw_Izvewenija.getSozdal());
		vw_IzvewenijaImpl.setIzmenil(vw_Izvewenija.getIzmenil());
		vw_IzvewenijaImpl.setData_sozdanija(vw_Izvewenija.getData_sozdanija());
		vw_IzvewenijaImpl.setData_izmenenija(vw_Izvewenija.getData_izmenenija());
		vw_IzvewenijaImpl.setKod_id(vw_Izvewenija.getKod_id());
		vw_IzvewenijaImpl.setPut_a(vw_Izvewenija.getPut_a());
		vw_IzvewenijaImpl.setPut_b(vw_Izvewenija.getPut_b());
		vw_IzvewenijaImpl.setPut_c(vw_Izvewenija.getPut_c());
		vw_IzvewenijaImpl.setKontaktnoe_lico(vw_Izvewenija.getKontaktnoe_lico());
		vw_IzvewenijaImpl.setJe_pochta(vw_Izvewenija.getJe_pochta());
		vw_IzvewenijaImpl.setKontaktnyj_telefon(vw_Izvewenija.getKontaktnyj_telefon());
		vw_IzvewenijaImpl.setData_publikacii(vw_Izvewenija.getData_publikacii());
		vw_IzvewenijaImpl.setData_podvedenija_itogov(vw_Izvewenija.getData_podvedenija_itogov());
		vw_IzvewenijaImpl.setPo_istecheniju_dnej(vw_Izvewenija.getPo_istecheniju_dnej());

		return vw_IzvewenijaImpl;
	}

	/**
	 * Returns the vw_ izvewenija with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vw_ izvewenija
	 * @return the vw_ izvewenija
	 * @throws NoSuchVW_IzvewenijaException if a vw_ izvewenija with the primary key could not be found
	 */
	@Override
	public VW_Izvewenija findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVW_IzvewenijaException {
		VW_Izvewenija vw_Izvewenija = fetchByPrimaryKey(primaryKey);

		if (vw_Izvewenija == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVW_IzvewenijaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vw_Izvewenija;
	}

	/**
	 * Returns the vw_ izvewenija with the primary key or throws a {@link NoSuchVW_IzvewenijaException} if it could not be found.
	 *
	 * @param izvewenija_id the primary key of the vw_ izvewenija
	 * @return the vw_ izvewenija
	 * @throws NoSuchVW_IzvewenijaException if a vw_ izvewenija with the primary key could not be found
	 */
	@Override
	public VW_Izvewenija findByPrimaryKey(long izvewenija_id)
		throws NoSuchVW_IzvewenijaException {
		return findByPrimaryKey((Serializable)izvewenija_id);
	}

	/**
	 * Returns the vw_ izvewenija with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vw_ izvewenija
	 * @return the vw_ izvewenija, or <code>null</code> if a vw_ izvewenija with the primary key could not be found
	 */
	@Override
	public VW_Izvewenija fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VW_IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
				VW_IzvewenijaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VW_Izvewenija vw_Izvewenija = (VW_Izvewenija)serializable;

		if (vw_Izvewenija == null) {
			Session session = null;

			try {
				session = openSession();

				vw_Izvewenija = (VW_Izvewenija)session.get(VW_IzvewenijaImpl.class,
						primaryKey);

				if (vw_Izvewenija != null) {
					cacheResult(vw_Izvewenija);
				}
				else {
					entityCache.putResult(VW_IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
						VW_IzvewenijaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VW_IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
					VW_IzvewenijaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vw_Izvewenija;
	}

	/**
	 * Returns the vw_ izvewenija with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param izvewenija_id the primary key of the vw_ izvewenija
	 * @return the vw_ izvewenija, or <code>null</code> if a vw_ izvewenija with the primary key could not be found
	 */
	@Override
	public VW_Izvewenija fetchByPrimaryKey(long izvewenija_id) {
		return fetchByPrimaryKey((Serializable)izvewenija_id);
	}

	@Override
	public Map<Serializable, VW_Izvewenija> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VW_Izvewenija> map = new HashMap<Serializable, VW_Izvewenija>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VW_Izvewenija vw_Izvewenija = fetchByPrimaryKey(primaryKey);

			if (vw_Izvewenija != null) {
				map.put(primaryKey, vw_Izvewenija);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VW_IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
					VW_IzvewenijaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VW_Izvewenija)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VW_IZVEWENIJA_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (VW_Izvewenija vw_Izvewenija : (List<VW_Izvewenija>)q.list()) {
				map.put(vw_Izvewenija.getPrimaryKeyObj(), vw_Izvewenija);

				cacheResult(vw_Izvewenija);

				uncachedPrimaryKeys.remove(vw_Izvewenija.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VW_IzvewenijaModelImpl.ENTITY_CACHE_ENABLED,
					VW_IzvewenijaImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the vw_ izvewenijas.
	 *
	 * @return the vw_ izvewenijas
	 */
	@Override
	public List<VW_Izvewenija> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vw_ izvewenijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VW_IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vw_ izvewenijas
	 * @param end the upper bound of the range of vw_ izvewenijas (not inclusive)
	 * @return the range of vw_ izvewenijas
	 */
	@Override
	public List<VW_Izvewenija> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vw_ izvewenijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VW_IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vw_ izvewenijas
	 * @param end the upper bound of the range of vw_ izvewenijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vw_ izvewenijas
	 */
	@Override
	public List<VW_Izvewenija> findAll(int start, int end,
		OrderByComparator<VW_Izvewenija> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vw_ izvewenijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VW_IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vw_ izvewenijas
	 * @param end the upper bound of the range of vw_ izvewenijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vw_ izvewenijas
	 */
	@Override
	public List<VW_Izvewenija> findAll(int start, int end,
		OrderByComparator<VW_Izvewenija> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<VW_Izvewenija> list = null;

		if (retrieveFromCache) {
			list = (List<VW_Izvewenija>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VW_IZVEWENIJA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VW_IZVEWENIJA;

				if (pagination) {
					sql = sql.concat(VW_IzvewenijaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VW_Izvewenija>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VW_Izvewenija>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the vw_ izvewenijas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VW_Izvewenija vw_Izvewenija : findAll()) {
			remove(vw_Izvewenija);
		}
	}

	/**
	 * Returns the number of vw_ izvewenijas.
	 *
	 * @return the number of vw_ izvewenijas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VW_IZVEWENIJA);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return VW_IzvewenijaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vw_ izvewenija persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VW_IzvewenijaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VW_IZVEWENIJA = "SELECT vw_Izvewenija FROM VW_Izvewenija vw_Izvewenija";
	private static final String _SQL_SELECT_VW_IZVEWENIJA_WHERE_PKS_IN = "SELECT vw_Izvewenija FROM VW_Izvewenija vw_Izvewenija WHERE izvewenija_id IN (";
	private static final String _SQL_COUNT_VW_IZVEWENIJA = "SELECT COUNT(vw_Izvewenija) FROM VW_Izvewenija vw_Izvewenija";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vw_Izvewenija.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VW_Izvewenija exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(VW_IzvewenijaPersistenceImpl.class);
}