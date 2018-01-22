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

package com.liferay.site.navigation.service;

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
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.liferay.site.navigation.model.SiteNavigationMenu;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for SiteNavigationMenu. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see SiteNavigationMenuLocalServiceUtil
 * @see com.liferay.site.navigation.service.base.SiteNavigationMenuLocalServiceBaseImpl
 * @see com.liferay.site.navigation.service.impl.SiteNavigationMenuLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface SiteNavigationMenuLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SiteNavigationMenuLocalServiceUtil} to access the site navigation menu local service. Add custom service methods to {@link com.liferay.site.navigation.service.impl.SiteNavigationMenuLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public SiteNavigationMenu addSiteNavigationMenu(long userId, long groupId,
		java.lang.String name, int type, ServiceContext serviceContext)
		throws PortalException;

	public SiteNavigationMenu addSiteNavigationMenu(long userId, long groupId,
		java.lang.String name, ServiceContext serviceContext)
		throws PortalException;

	/**
	* Adds the site navigation menu to the database. Also notifies the appropriate model listeners.
	*
	* @param siteNavigationMenu the site navigation menu
	* @return the site navigation menu that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public SiteNavigationMenu addSiteNavigationMenu(
		SiteNavigationMenu siteNavigationMenu);

	/**
	* Creates a new site navigation menu with the primary key. Does not add the site navigation menu to the database.
	*
	* @param siteNavigationMenuId the primary key for the new site navigation menu
	* @return the new site navigation menu
	*/
	public SiteNavigationMenu createSiteNavigationMenu(
		long siteNavigationMenuId);

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	* Deletes the site navigation menu with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param siteNavigationMenuId the primary key of the site navigation menu
	* @return the site navigation menu that was removed
	* @throws PortalException if a site navigation menu with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public SiteNavigationMenu deleteSiteNavigationMenu(
		long siteNavigationMenuId) throws PortalException;

	/**
	* Deletes the site navigation menu from the database. Also notifies the appropriate model listeners.
	*
	* @param siteNavigationMenu the site navigation menu
	* @return the site navigation menu that was removed
	* @throws PortalException
	*/
	@Indexable(type = IndexableType.DELETE)
	public SiteNavigationMenu deleteSiteNavigationMenu(
		SiteNavigationMenu siteNavigationMenu) throws PortalException;

	public DynamicQuery dynamicQuery();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.site.navigation.model.impl.SiteNavigationMenuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.site.navigation.model.impl.SiteNavigationMenuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SiteNavigationMenu fetchPrimarySiteNavigationMenu(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SiteNavigationMenu fetchSiteNavigationMenu(long siteNavigationMenuId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Returns the site navigation menu with the primary key.
	*
	* @param siteNavigationMenuId the primary key of the site navigation menu
	* @return the site navigation menu
	* @throws PortalException if a site navigation menu with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SiteNavigationMenu getSiteNavigationMenu(long siteNavigationMenuId)
		throws PortalException;

	/**
	* Returns a range of all the site navigation menus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.site.navigation.model.impl.SiteNavigationMenuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of site navigation menus
	* @param end the upper bound of the range of site navigation menus (not inclusive)
	* @return the range of site navigation menus
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SiteNavigationMenu> getSiteNavigationMenus(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SiteNavigationMenu> getSiteNavigationMenus(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SiteNavigationMenu> getSiteNavigationMenus(long groupId,
		int start, int end, OrderByComparator orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SiteNavigationMenu> getSiteNavigationMenus(long groupId,
		java.lang.String keywords, int start, int end,
		OrderByComparator orderByComparator);

	/**
	* Returns the number of site navigation menus.
	*
	* @return the number of site navigation menus
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getSiteNavigationMenusCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getSiteNavigationMenusCount(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getSiteNavigationMenusCount(long groupId,
		java.lang.String keywords);

	public SiteNavigationMenu updateSiteNavigationMenu(long userId,
		long siteNavigationMenuId, int type, ServiceContext serviceContext)
		throws PortalException;

	public SiteNavigationMenu updateSiteNavigationMenu(long userId,
		long siteNavigationMenuId, java.lang.String name,
		ServiceContext serviceContext) throws PortalException;

	/**
	* Updates the site navigation menu in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param siteNavigationMenu the site navigation menu
	* @return the site navigation menu that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public SiteNavigationMenu updateSiteNavigationMenu(
		SiteNavigationMenu siteNavigationMenu);
}