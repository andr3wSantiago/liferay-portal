/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

/**
 * The interface for the organization local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OrganizationLocalServiceUtil
 * @see com.liferay.portal.service.base.OrganizationLocalServiceBaseImpl
 * @see com.liferay.portal.service.impl.OrganizationLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface OrganizationLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OrganizationLocalServiceUtil} to access the organization local service. Add custom service methods to {@link com.liferay.portal.service.impl.OrganizationLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the organization to the database. Also notifies the appropriate model listeners.
	*
	* @param organization the organization
	* @return the organization that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.Organization addOrganization(
		com.liferay.portal.model.Organization organization)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new organization with the primary key. Does not add the organization to the database.
	*
	* @param organizationId the primary key for the new organization
	* @return the new organization
	*/
	public com.liferay.portal.model.Organization createOrganization(
		long organizationId);

	/**
	* Deletes the organization with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param organizationId the primary key of the organization
	* @return the organization that was removed
	* @throws PortalException if a organization with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.Organization deleteOrganization(
		long organizationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the organization from the database. Also notifies the appropriate model listeners.
	*
	* @param organization the organization
	* @return the organization that was removed
	* @throws PortalException
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.Organization deleteOrganization(
		com.liferay.portal.model.Organization organization)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.Organization fetchOrganization(
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the organization with the primary key.
	*
	* @param organizationId the primary key of the organization
	* @return the organization
	* @throws PortalException if a organization with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.Organization getOrganization(
		long organizationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the organizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of organizations
	* @param end the upper bound of the range of organizations (not inclusive)
	* @return the range of organizations
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.Organization> getOrganizations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of organizations.
	*
	* @return the number of organizations
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getOrganizationsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the organization in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param organization the organization
	* @return the organization that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.Organization updateOrganization(
		com.liferay.portal.model.Organization organization)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the organization in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param organization the organization
	* @param merge whether to merge the organization with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the organization that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.Organization updateOrganization(
		com.liferay.portal.model.Organization organization, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	/**
	* Adds the organizations to the group.
	*
	* @param groupId the primary key of the group
	* @param organizationIds the primary keys of the organizations
	* @throws PortalException if a group or organization with the primary key
	could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void addGroupOrganizations(long groupId, long[] organizationIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an organization.
	*
	* <p>
	* This method handles the creation and bookkeeping of the organization
	* including its resources, metadata, and internal data structures. It is
	* not necessary to make a subsequent call to {@link
	* #addOrganizationResources(long, Organization)}.
	* </p>
	*
	* @param userId the primary key of the creator/owner of the organization
	* @param parentOrganizationId the primary key of the organization's parent
	organization
	* @param name the organization's name
	* @param type the organization's type
	* @param recursable whether the permissions of the organization are to be
	inherited by its sub-organizations
	* @param regionId the primary key of the organization's region
	* @param countryId the primary key of the organization's country
	* @param statusId the organization's workflow status
	* @param comments the comments about the organization
	* @param site whether the organization is to be associated with a main
	site
	* @param serviceContext the organization's service context (optionally
	<code>null</code>). Can set asset category IDs, asset tag names,
	and expando bridge attributes for the organization.
	* @return the organization
	* @throws PortalException if a creator or parent organization with the
	primary key could not be found or if the organization's
	information was invalid
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.Organization addOrganization(long userId,
		long parentOrganizationId, java.lang.String name,
		java.lang.String type, boolean recursable, long regionId,
		long countryId, int statusId, java.lang.String comments, boolean site,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds a resource for each type of permission available on the
	* organization.
	*
	* @param userId the primary key of the creator/owner of the organization
	* @param organization the organization
	* @throws PortalException if a portal exception occurred
	* @throws SystemException if a system exception occurred
	*/
	public void addOrganizationResources(long userId,
		com.liferay.portal.model.Organization organization)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Assigns the password policy to the organizations, removing any other
	* currently assigned password policies.
	*
	* @param passwordPolicyId the primary key of the password policy
	* @param organizationIds the primary keys of the organizations
	* @throws SystemException if a system exception occurred
	*/
	public void addPasswordPolicyOrganizations(long passwordPolicyId,
		long[] organizationIds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the logo of the organization.
	*
	* @param organizationId the primary key of the organization
	* @throws PortalException if an organization or parent organization with
	the primary key could not be found or if the organization's logo
	could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteLogo(long organizationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the organizations belonging to the group.
	*
	* @param groupId the primary key of the group
	* @return the organizations belonging to the group
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.Organization> getGroupOrganizations(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the organization with the name.
	*
	* @param companyId the primary key of the organization's company
	* @param name the organization's name
	* @return the organization with the name
	* @throws PortalException if the organization with the name could not be
	found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.Organization getOrganization(
		long companyId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the primary key of the organization with the name.
	*
	* @param companyId the primary key of the organization's company
	* @param name the organization's name
	* @return the primary key of the organization with the name, or
	<code>0</code> if the organization could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long getOrganizationId(long companyId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the organizations belonging to the parent organization.
	*
	* @param companyId the primary key of the organization's company
	* @param parentOrganizationId the primary key of the organization's parent
	organization
	* @return the organizations belonging to the parent organization
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.Organization> getOrganizations(
		long companyId, long parentOrganizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the organizations belonging to the parent
	* organization.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end -
	* start</code> instances. <code>start</code> and <code>end</code> are not
	* primary keys, they are indexes in the result set. Thus, <code>0</code>
	* refers to the first result in the set. Setting both <code>start</code>
	* and <code>end</code> to {@link
	* com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full
	* result set.
	* </p>
	*
	* @param companyId the primary key of the organization's company
	* @param parentOrganizationId the primary key of the organization's parent
	organization
	* @param start the lower bound of the range of organizations to return
	* @param end the upper bound of the range of organizations to return (not
	inclusive)
	* @return the range of organizations belonging to the parent organization
	* @throws SystemException if a system exception occurred
	* @see com.liferay.portal.service.persistence.OrganizationPersistence#findByC_P(
	long, long, int, int)
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.Organization> getOrganizations(
		long companyId, long parentOrganizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the organizations with the primary keys.
	*
	* @param organizationIds the primary keys of the organizations
	* @return the organizations with the primary keys
	* @throws PortalException if any one of the organizations could not be
	found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.Organization> getOrganizations(
		long[] organizationIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of organizations belonging to the parent organization.
	*
	* @param companyId the primary key of the organization's company
	* @param parentOrganizationId the primary key of the organization's parent
	organization
	* @return the number of organizations belonging to the parent organization
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getOrganizationsCount(long companyId, long parentOrganizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the parent organizations in order by closest ancestor. The list
	* starts with the organization itself.
	*
	* @param organizationId the primary key of the organization
	* @return the parent organizations in order by closest ancestor
	* @throws PortalException if an organization with the primary key could not
	be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.Organization> getParentOrganizations(
		long organizationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sub-organizations of the organizations.
	*
	* @param organizations the organizations from which to get
	sub-organizations
	* @return the sub-organizations of the organizations
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.Organization> getSuborganizations(
		java.util.List<com.liferay.portal.model.Organization> organizations)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the intersection of <code>allOrganizations</code> and
	* <code>availableOrganizations</code>.
	*
	* @param allOrganizations the organizations to check for availability
	* @param availableOrganizations the available organizations
	* @return the intersection of <code>allOrganizations</code> and
	<code>availableOrganizations</code>
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.Organization> getSubsetOrganizations(
		java.util.List<com.liferay.portal.model.Organization> allOrganizations,
		java.util.List<com.liferay.portal.model.Organization> availableOrganizations);

	/**
	* Returns all the organizations associated with the user.
	*
	* @param userId the primary key of the user
	* @return the organizations associated with the user
	* @throws PortalException if a user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.Organization> getUserOrganizations(
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the organizations associated with the user. If includeNonUser
	* is <code>true</code>, the result includes those organizations that are
	* not directly associated to the user but he is an owner or an
	* administrator of the organization.
	*
	* @param userId the primary key of the user
	* @param includeIndirectlyAssociated whether to includes organizations
	that are indirectly associated to the user because he is an owner
	or an administrator of the organization
	* @return the organizations associated with the user
	* @throws PortalException if a user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.Organization> getUserOrganizations(
		long userId, boolean includeIndirectlyAssociated)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the organizations associated with the user.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end -
	* start</code> instances. <code>start</code> and <code>end</code> are not
	* primary keys, they are indexes in the result set. Thus, <code>0</code>
	* refers to the first result in the set. Setting both <code>start</code>
	* and <code>end</code> to {@link
	* com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full
	* result set.
	* </p>
	*
	* @param userId the primary key of the user
	* @param start the lower bound of the range of organizations to return
	* @param end the upper bound of the range of organizations to return (not
	inclusive)
	* @return the range organizations associated with the user
	* @throws PortalException if a user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.Organization> getUserOrganizations(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of organizations associated with the user.
	*
	* @param userId the primary key of the user
	* @return the number of organizations associated with the user
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getUserOrganizationsCount(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the organization belongs to the group.
	*
	* @param groupId the primary key of the group
	* @param organizationId the primary key of the organization
	* @return <code>true</code> if the organization belongs to the group;
	<code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasGroupOrganization(long groupId, long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the password policy has been assigned to the
	* organization.
	*
	* @param passwordPolicyId the primary key of the password policy
	* @param organizationId the primary key of the organization
	* @return <code>true</code> if the password policy has been assigned to the
	organization; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasPasswordPolicyOrganization(long passwordPolicyId,
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the user is a member of the organization.
	* This method is usually called to determine if the user has view access to
	* a resource belonging to the organization.
	*
	* @param userId the primary key of the user
	* @param organizationId the primary key of the organization
	* @return <code>true</code> if the user has access to the organization;
	<code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasUserOrganization(long userId, long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the user is a member of the organization,
	* optionally focusing on sub-organizations or the specified organization.
	* This method is usually called to determine if the user has view access to
	* a resource belonging to the organization.
	*
	* <p>
	*
	* <ol>
	* <li>
	* If <code>inheritSuborganizations=<code>false</code></code>:
	* the method checks whether the user belongs to the organization specified
	* by <code>organizationId</code>. The parameter
	* <code>includeSpecifiedOrganization</code> is ignored.
	* </li>
	* <li>
	* The parameter <code>includeSpecifiedOrganization</code> is
	* ignored unless <code>inheritSuborganizations</code> is also
	* <code>true</code>.
	* </li>
	* <li>
	* If <code>inheritSuborganizations=<code>true</code></code> and
	* <code>includeSpecifiedOrganization=<code>false</code></code>: the method
	* checks
	* whether the user belongs to one of the child organizations of the one
	* specified by <code>organizationId</code>.
	* </li>
	* <li>
	* If <code>inheritSuborganizations=<code>true</code></code> and
	* <code>includeSpecifiedOrganization=<code>true</code></code>: the method
	* checks whether
	* the user belongs to the organization specified by
	* <code>organizationId</code> or any of
	* its child organizations.
	* </li>
	* </ol>
	*
	* <p>
	*
	* @param userId the primary key of the organization's user
	* @param organizationId the primary key of the organization
	* @param inheritSuborganizations if <code>true</code> sub-organizations
	are considered in the determination
	* @param includeSpecifiedOrganization if <code>true</code> the
	organization specified by <code>organizationId</code> is
	considered in the determination
	* @return <code>true</code> if the user has access to the organization;
	<code>false</code> otherwise
	* @throws PortalException if an organization with the primary key could not
	be found
	* @throws SystemException if a system exception occurred
	* @see com.liferay.portal.service.persistence.OrganizationFinder
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasUserOrganization(long userId, long organizationId,
		boolean inheritSuborganizations, boolean includeSpecifiedOrganization)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Rebuilds the organizations tree.
	*
	* <p>
	* Only call this method if the tree has become stale through operations
	* other than normal CRUD. Under normal circumstances the tree is
	* automatically rebuilt whenever necessary.
	* </p>
	*
	* @param companyId the primary key of the organization's company
	* @throws PortalException if an organization with the primary key could not
	be found
	* @throws SystemException if a system exception occurred
	* @see com.liferay.portal.service.persistence.OrganizationPersistence#rebuildTree(
	long, boolean)
	*/
	public void rebuildTree(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the organizations of the company.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end -
	* start</code> instances. <code>start</code> and <code>end</code> are not
	* primary keys, they are indexes in the result set. Thus, <code>0</code>
	* refers to the first result in the set. Setting both <code>start</code>
	* and <code>end</code> to {@link
	* com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full
	* result set.
	* </p>
	*
	* @param companyId the primary key of the company
	* @param params the finder parameters (optionally <code>null</code>). For
	more information see {@link
	com.liferay.portlet.enterpriseadmin.util.OrganizationIndexer}
	* @param start the lower bound of the range of organizations to return
	* @param end the upper bound of the range of organizations to return (not
	inclusive)
	* @return the range of all the organizations of the company
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.Organization> search(
		long companyId,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the organizations that match the
	* keywords, using the indexer. It is preferable to use this method instead
	* of the non-indexed version whenever possible for performance reasons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end -
	* start</code> instances. <code>start</code> and <code>end</code> are not
	* primary keys, they are indexes in the result set. Thus, <code>0</code>
	* refers to the first result in the set. Setting both <code>start</code>
	* and <code>end</code> to {@link
	* com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full
	* result set.
	* </p>
	*
	* @param companyId the primary key of the organization's company
	* @param parentOrganizationId the primary key of the organization's parent
	organization
	* @param keywords the keywords (space separated), which may occur in the
	organization's name, street, city, zipcode, type, region or
	country (optionally <code>null</code>)
	* @param params the finder parameters (optionally <code>null</code>). For
	more information see {@link
	com.liferay.portlet.enterpriseadmin.util.OrganizationIndexer}
	* @param start the lower bound of the range of organizations to return
	* @param end the upper bound of the range of organizations to return (not
	inclusive)
	* @param sort the field and direction by which to sort (optionally
	<code>null</code>)
	* @return the matching organizations ordered by name
	* @throws SystemException if a system exception occurred
	* @see com.liferay.portlet.enterpriseadmin.util.OrganizationIndexer
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.kernel.search.Hits search(long companyId,
		long parentOrganizationId, java.lang.String keywords,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		int start, int end, com.liferay.portal.kernel.search.Sort sort)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a name ordered range of all the organizations that match the
	* keywords, type, region, and country, without using the indexer. It is
	* preferable to use the indexed version {@link #search(long, long, String,
	* LinkedHashMap, int, int, Sort)} instead of this method wherever possible
	* for performance reasons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end -
	* start</code> instances. <code>start</code> and <code>end</code> are not
	* primary keys, they are indexes in the result set. Thus, <code>0</code>
	* refers to the first result in the set. Setting both <code>start</code>
	* and <code>end</code> to {@link
	* com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full
	* result set.
	* </p>
	*
	* @param companyId the primary key of the organization's company
	* @param parentOrganizationId the primary key of the organization's parent
	organization
	* @param keywords the keywords (space separated), which may occur in the
	organization's name, street, city, or zipcode (optionally
	<code>null</code>)
	* @param type the organization's type (optionally <code>null</code>)
	* @param regionId the primary key of the organization's region (optionally
	<code>null</code>)
	* @param countryId the primary key of the organization's country
	(optionally <code>null</code>)
	* @param params the finder params. For more information see {@link
	com.liferay.portal.service.persistence.OrganizationFinder}
	* @param start the lower bound of the range of organizations to return
	* @param end the upper bound of the range of organizations to return (not
	inclusive)
	* @return the matching organizations ordered by name
	* @throws SystemException if a system exception occurred
	* @see com.liferay.portal.service.persistence.OrganizationFinder
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.Organization> search(
		long companyId, long parentOrganizationId, java.lang.String keywords,
		java.lang.String type, java.lang.Long regionId,
		java.lang.Long countryId,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the organizations that match the
	* keywords, type, region, and country, without using the indexer. It is
	* preferable to use the indexed version {@link #search(long, long, String,
	* String, String, String, String, String, String, LinkedHashMap, boolean,
	* int, int, Sort)} instead of this method wherever possible for performance
	* reasons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end -
	* start</code> instances. <code>start</code> and <code>end</code> are not
	* primary keys, they are indexes in the result set. Thus, <code>0</code>
	* refers to the first result in the set. Setting both <code>start</code>
	* and <code>end</code> to {@link
	* com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full
	* result set.
	* </p>
	*
	* @param companyId the primary key of the organization's company
	* @param parentOrganizationId the primary key of the organization's parent
	organization
	* @param keywords the keywords (space separated), which may occur in the
	organization's name, street, city, or zipcode (optionally
	<code>null</code>)
	* @param type the organization's type (optionally <code>null</code>)
	* @param regionId the primary key of the organization's region (optionally
	<code>null</code>)
	* @param countryId the primary key of the organization's country
	(optionally <code>null</code>)
	* @param params the finder params. For more information see {@link
	com.liferay.portal.service.persistence.OrganizationFinder}
	* @param start the lower bound of the range of organizations to return
	* @param end the upper bound of the range of organizations to return (not
	inclusive)
	* @param obc the comparator to order the organizations (optionally
	<code>null</code>)
	* @return the matching organizations ordered by comparator <code>obc</code>
	* @throws SystemException if a system exception occurred
	* @see com.liferay.portal.service.persistence.OrganizationFinder
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.Organization> search(
		long companyId, long parentOrganizationId, java.lang.String keywords,
		java.lang.String type, java.lang.Long regionId,
		java.lang.Long countryId,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a name ordered range of all the organizations with the type,
	* region, and country, and whose name, street, city, and zipcode match the
	* keywords specified for them, without using the indexer. It is preferable
	* to use the indexed version {@link #search(long, long, String, String,
	* String, String, String, String, String, LinkedHashMap, boolean, int, int,
	* Sort)} instead of this method wherever possible for performance reasons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end -
	* start</code> instances. <code>start</code> and <code>end</code> are not
	* primary keys, they are indexes in the result set. Thus, <code>0</code>
	* refers to the first result in the set. Setting both <code>start</code>
	* and <code>end</code> to {@link
	* com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full
	* result set.
	* </p>
	*
	* @param companyId the primary key of the organization's company
	* @param parentOrganizationId the primary key of the organization's parent
	* @param name the name keywords (space separated, optionally
	<code>null</code>)
	* @param type the organization's type (optionally <code>null</code>)
	* @param street the street keywords (optionally <code>null</code>)
	* @param city the city keywords (optionally <code>null</code>)
	* @param zip the zipcode keywords (optionally <code>null</code>)
	* @param regionId the primary key of the organization's region (optionally
	<code>null</code>)
	* @param countryId the primary key of the organization's country
	(optionally <code>null</code>)
	* @param params the finder parameters (optionally <code>null</code>). For
	more information see {@link
	com.liferay.portal.service.persistence.OrganizationFinder}
	* @param andOperator whether every field must match its keywords, or just
	one field. For example, &quot;organizations with the name
	'Employees' and city 'Chicago'&quot; vs &quot;organizations with
	the name 'Employees' or the city 'Chicago'&quot;.
	* @param start the lower bound of the range of organizations to return
	* @param end the upper bound of the range of organizations to return (not
	inclusive)
	* @return the matching organizations ordered by name
	* @throws SystemException if a system exception occurred
	* @see com.liferay.portal.service.persistence.OrganizationFinder
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.Organization> search(
		long companyId, long parentOrganizationId, java.lang.String name,
		java.lang.String type, java.lang.String street, java.lang.String city,
		java.lang.String zip, java.lang.Long regionId,
		java.lang.Long countryId,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		boolean andOperator, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the organizations with the type, region,
	* and country, and whose name, street, city, and zipcode match the keywords
	* specified for them, without using the indexer. It is preferable to use
	* the indexed version {@link #search(long, long, String, String, String,
	* String, String, String, String, LinkedHashMap, boolean, int, int, Sort)}
	* instead of this method wherever possible for performance reasons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end -
	* start</code> instances. <code>start</code> and <code>end</code> are not
	* primary keys, they are indexes in the result set. Thus, <code>0</code>
	* refers to the first result in the set. Setting both <code>start</code>
	* and <code>end</code> to {@link
	* com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full
	* result set.
	* </p>
	*
	* @param companyId the primary key of the organization's company
	* @param parentOrganizationId the primary key of the organization's parent
	organization
	* @param name the name keywords (space separated, optionally
	<code>null</code>)
	* @param type the organization's type (optionally <code>null</code>)
	* @param street the street keywords (optionally <code>null</code>)
	* @param city the city keywords (optionally <code>null</code>)
	* @param zip the zipcode keywords (optionally <code>null</code>)
	* @param regionId the primary key of the organization's region (optionally
	<code>null</code>)
	* @param countryId the primary key of the organization's country
	(optionally <code>null</code>)
	* @param params the finder parameters (optionally <code>null</code>). For
	more information see {@link
	com.liferay.portal.service.persistence.OrganizationFinder}
	* @param andOperator whether every field must match its keywords, or just
	one field. For example, &quot;organizations with the name
	'Employees' and city 'Chicago'&quot; vs &quot;organizations with
	the name 'Employees' or the city 'Chicago'&quot;.
	* @param start the lower bound of the range of organizations to return
	* @param end the upper bound of the range of organizations to return (not
	inclusive)
	* @param obc the comparator to order the organizations (optionally
	<code>null</code>)
	* @return the matching organizations ordered by comparator <code>obc</code>
	* @throws SystemException if a system exception occurred
	* @see com.liferay.portal.service.persistence.OrganizationFinder
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.Organization> search(
		long companyId, long parentOrganizationId, java.lang.String name,
		java.lang.String type, java.lang.String street, java.lang.String city,
		java.lang.String zip, java.lang.Long regionId,
		java.lang.Long countryId,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the organizations whose name, type, or
	* location fields match the keywords specified for them, using the indexer.
	* It is preferable to use this method instead of the non-indexed version
	* whenever possible for performance reasons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end -
	* start</code> instances. <code>start</code> and <code>end</code> are not
	* primary keys, they are indexes in the result set. Thus, <code>0</code>
	* refers to the first result in the set. Setting both <code>start</code>
	* and <code>end</code> to {@link
	* com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full
	* result set.
	* </p>
	*
	* @param companyId the primary key of the organization's company
	* @param parentOrganizationId the primary key of the organization's parent
	organization
	* @param name the name keywords (space separated, optionally
	<code>null</code>)
	* @param type the type keywords (optionally <code>null</code>)
	* @param street the street keywords (optionally <code>null</code>)
	* @param city the city keywords (optionally <code>null</code>)
	* @param zip the zipcode keywords (optionally <code>null</code>)
	* @param region the region keywords (optionally <code>null</code>)
	* @param country the country keywords (optionally <code>null</code>)
	* @param params the finder parameters (optionally <code>null</code>). For
	more information see {@link
	com.liferay.portlet.enterpriseadmin.util.OrganizationIndexer}.
	* @param andSearch whether every field must match its keywords or just one
	field
	* @param start the lower bound of the range of organizations to return
	* @param end the upper bound of the range of organizations to return (not
	inclusive)
	* @param sort the field and direction by which to sort (optionally
	<code>null</code>)
	* @return the matching organizations ordered by <code>sort</code>
	* @throws SystemException if a system exception occurred
	* @see com.liferay.portlet.enterpriseadmin.util.OrganizationIndexer
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.kernel.search.Hits search(long companyId,
		long parentOrganizationId, java.lang.String name,
		java.lang.String type, java.lang.String street, java.lang.String city,
		java.lang.String zip, java.lang.String region,
		java.lang.String country,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		boolean andSearch, int start, int end,
		com.liferay.portal.kernel.search.Sort sort)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of organizations that match the keywords, type,
	* region, and country.
	*
	* @param companyId the primary key of the organization's company
	* @param parentOrganizationId the primary key of the organization's parent
	organization
	* @param keywords the keywords (space separated), which may occur in the
	organization's name, street, city, or zipcode (optionally
	<code>null</code>)
	* @param type the organization's type (optionally <code>null</code>)
	* @param regionId the primary key of the organization's region (optionally
	<code>null</code>)
	* @param countryId the primary key of the organization's country
	(optionally <code>null</code>)
	* @param params the finder parameters (optionally <code>null</code>). For
	more information see {@link
	com.liferay.portal.service.persistence.OrganizationFinder}
	* @return the number of matching organizations
	* @throws SystemException if a system exception occurred
	* @see com.liferay.portal.service.persistence.OrganizationFinder
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int searchCount(long companyId, long parentOrganizationId,
		java.lang.String keywords, java.lang.String type,
		java.lang.Long regionId, java.lang.Long countryId,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of organizations with the type, region, and country,
	* and whose name, street, city, and zipcode match the keywords specified
	* for them.
	*
	* @param companyId the primary key of the organization's company
	* @param parentOrganizationId the primary key of the organization's parent
	organization
	* @param name the name keywords (space separated, optionally
	<code>null</code>)
	* @param type the organization's type (optionally <code>null</code>)
	* @param street the street keywords (optionally <code>null</code>)
	* @param city the city keywords (optionally <code>null</code>)
	* @param zip the zipcode keywords (optionally <code>null</code>)
	* @param regionId the primary key of the organization's region (optionally
	<code>null</code>)
	* @param countryId the primary key of the organization's country
	(optionally <code>null</code>)
	* @param params the finder parameters (optionally <code>null</code>). For
	more information see {@link
	com.liferay.portal.service.persistence.OrganizationFinder}
	* @param andOperator whether every field must match its keywords, or just
	one field. For example, &quot;organizations with the name
	'Employees' and city 'Chicago'&quot; vs &quot;organizations with
	the name 'Employees' or the city 'Chicago'&quot;.
	* @return the number of matching organizations
	* @throws SystemException if a system exception occurred
	* @see com.liferay.portal.service.persistence.OrganizationFinder
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int searchCount(long companyId, long parentOrganizationId,
		java.lang.String name, java.lang.String type, java.lang.String street,
		java.lang.String city, java.lang.String zip, java.lang.Long regionId,
		java.lang.Long countryId,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		boolean andOperator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the organizations in the group, removing and adding organizations to
	* the group as necessary.
	*
	* @param groupId the primary key of the group
	* @param organizationIds the primary keys of the organizations
	* @throws PortalException if a portal exception occurred
	* @throws SystemException if a system exception occurred
	*/
	public void setGroupOrganizations(long groupId, long[] organizationIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the organizations from the group.
	*
	* @param groupId the primary key of the group
	* @param organizationIds the primary keys of the organizations
	* @throws PortalException if a portal exception occurred
	* @throws SystemException if a system exception occurred
	*/
	public void unsetGroupOrganizations(long groupId, long[] organizationIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the organizations from the password policy.
	*
	* @param passwordPolicyId the primary key of the password policy
	* @param organizationIds the primary keys of the organizations
	* @throws SystemException if a system exception occurred
	*/
	public void unsetPasswordPolicyOrganizations(long passwordPolicyId,
		long[] organizationIds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the organization's asset with the new asset categories and tag
	* names, removing and adding asset categories and tag names as necessary.
	*
	* @param userId the primary key of the user
	* @param organization the organization
	* @param assetCategoryIds the primary keys of the asset categories
	* @param assetTagNames the asset tag names
	* @throws PortalException if a user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void updateAsset(long userId,
		com.liferay.portal.model.Organization organization,
		long[] assetCategoryIds, java.lang.String[] assetTagNames)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the organization.
	*
	* @param companyId the primary key of the organization's company
	* @param organizationId the primary key of the organization
	* @param parentOrganizationId the primary key of organization's parent
	organization
	* @param name the organization's name
	* @param type the organization's type
	* @param recursable whether permissions of the organization are to be
	inherited by its sub-organizations
	* @param regionId the primary key of the organization's region
	* @param countryId the primary key of the organization's country
	* @param statusId the organization's workflow status
	* @param comments the comments about the organization
	* @param site whether the organization is to be associated with a main
	site
	* @param serviceContext the organization's service context (optionally
	<code>null</code>). Can set asset category IDs and asset tag
	names for the organization, and merge expando bridge attributes
	for the organization.
	* @return the organization
	* @throws PortalException if an organization or parent organization with
	the primary key could not be found or if the new information was
	invalid
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.Organization updateOrganization(
		long companyId, long organizationId, long parentOrganizationId,
		java.lang.String name, java.lang.String type, boolean recursable,
		long regionId, long countryId, int statusId, java.lang.String comments,
		boolean site, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}