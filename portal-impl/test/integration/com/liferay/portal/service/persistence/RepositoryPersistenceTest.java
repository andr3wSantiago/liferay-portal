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

package com.liferay.portal.service.persistence;

import com.liferay.portal.NoSuchRepositoryException;
import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.Repository;
import com.liferay.portal.model.impl.RepositoryModelImpl;
import com.liferay.portal.service.ServiceTestUtil;
import com.liferay.portal.service.persistence.PersistenceExecutionTestListener;
import com.liferay.portal.test.ExecutionTestListeners;
import com.liferay.portal.test.LiferayIntegrationJUnitTestRunner;
import com.liferay.portal.util.PropsValues;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@ExecutionTestListeners(listeners =  {
	PersistenceExecutionTestListener.class})
@RunWith(LiferayIntegrationJUnitTestRunner.class)
public class RepositoryPersistenceTest {
	@Before
	public void setUp() throws Exception {
		_persistence = (RepositoryPersistence)PortalBeanLocatorUtil.locate(RepositoryPersistence.class.getName());
	}

	@Test
	public void testCreate() throws Exception {
		long pk = ServiceTestUtil.nextLong();

		Repository repository = _persistence.create(pk);

		Assert.assertNotNull(repository);

		Assert.assertEquals(repository.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Repository newRepository = addRepository();

		_persistence.remove(newRepository);

		Repository existingRepository = _persistence.fetchByPrimaryKey(newRepository.getPrimaryKey());

		Assert.assertNull(existingRepository);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addRepository();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = ServiceTestUtil.nextLong();

		Repository newRepository = _persistence.create(pk);

		newRepository.setUuid(ServiceTestUtil.randomString());

		newRepository.setGroupId(ServiceTestUtil.nextLong());

		newRepository.setCompanyId(ServiceTestUtil.nextLong());

		newRepository.setUserId(ServiceTestUtil.nextLong());

		newRepository.setUserName(ServiceTestUtil.randomString());

		newRepository.setCreateDate(ServiceTestUtil.nextDate());

		newRepository.setModifiedDate(ServiceTestUtil.nextDate());

		newRepository.setClassNameId(ServiceTestUtil.nextLong());

		newRepository.setName(ServiceTestUtil.randomString());

		newRepository.setDescription(ServiceTestUtil.randomString());

		newRepository.setPortletId(ServiceTestUtil.randomString());

		newRepository.setTypeSettings(ServiceTestUtil.randomString());

		newRepository.setDlFolderId(ServiceTestUtil.nextLong());

		_persistence.update(newRepository, false);

		Repository existingRepository = _persistence.findByPrimaryKey(newRepository.getPrimaryKey());

		Assert.assertEquals(existingRepository.getUuid(),
			newRepository.getUuid());
		Assert.assertEquals(existingRepository.getRepositoryId(),
			newRepository.getRepositoryId());
		Assert.assertEquals(existingRepository.getGroupId(),
			newRepository.getGroupId());
		Assert.assertEquals(existingRepository.getCompanyId(),
			newRepository.getCompanyId());
		Assert.assertEquals(existingRepository.getUserId(),
			newRepository.getUserId());
		Assert.assertEquals(existingRepository.getUserName(),
			newRepository.getUserName());
		Assert.assertEquals(Time.getShortTimestamp(
				existingRepository.getCreateDate()),
			Time.getShortTimestamp(newRepository.getCreateDate()));
		Assert.assertEquals(Time.getShortTimestamp(
				existingRepository.getModifiedDate()),
			Time.getShortTimestamp(newRepository.getModifiedDate()));
		Assert.assertEquals(existingRepository.getClassNameId(),
			newRepository.getClassNameId());
		Assert.assertEquals(existingRepository.getName(),
			newRepository.getName());
		Assert.assertEquals(existingRepository.getDescription(),
			newRepository.getDescription());
		Assert.assertEquals(existingRepository.getPortletId(),
			newRepository.getPortletId());
		Assert.assertEquals(existingRepository.getTypeSettings(),
			newRepository.getTypeSettings());
		Assert.assertEquals(existingRepository.getDlFolderId(),
			newRepository.getDlFolderId());
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Repository newRepository = addRepository();

		Repository existingRepository = _persistence.findByPrimaryKey(newRepository.getPrimaryKey());

		Assert.assertEquals(existingRepository, newRepository);
	}

	@Test
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = ServiceTestUtil.nextLong();

		try {
			_persistence.findByPrimaryKey(pk);

			Assert.fail(
				"Missing entity did not throw NoSuchRepositoryException");
		}
		catch (NoSuchRepositoryException nsee) {
		}
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Repository newRepository = addRepository();

		Repository existingRepository = _persistence.fetchByPrimaryKey(newRepository.getPrimaryKey());

		Assert.assertEquals(existingRepository, newRepository);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = ServiceTestUtil.nextLong();

		Repository missingRepository = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingRepository);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting()
		throws Exception {
		Repository newRepository = addRepository();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Repository.class,
				Repository.class.getClassLoader());

		dynamicQuery.add(RestrictionsFactoryUtil.eq("repositoryId",
				newRepository.getRepositoryId()));

		List<Repository> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Repository existingRepository = result.get(0);

		Assert.assertEquals(existingRepository, newRepository);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Repository.class,
				Repository.class.getClassLoader());

		dynamicQuery.add(RestrictionsFactoryUtil.eq("repositoryId",
				ServiceTestUtil.nextLong()));

		List<Repository> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting()
		throws Exception {
		Repository newRepository = addRepository();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Repository.class,
				Repository.class.getClassLoader());

		dynamicQuery.setProjection(ProjectionFactoryUtil.property(
				"repositoryId"));

		Object newRepositoryId = newRepository.getRepositoryId();

		dynamicQuery.add(RestrictionsFactoryUtil.in("repositoryId",
				new Object[] { newRepositoryId }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingRepositoryId = result.get(0);

		Assert.assertEquals(existingRepositoryId, newRepositoryId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Repository.class,
				Repository.class.getClassLoader());

		dynamicQuery.setProjection(ProjectionFactoryUtil.property(
				"repositoryId"));

		dynamicQuery.add(RestrictionsFactoryUtil.in("repositoryId",
				new Object[] { ServiceTestUtil.nextLong() }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		if (!PropsValues.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			return;
		}

		Repository newRepository = addRepository();

		_persistence.clearCache();

		RepositoryModelImpl existingRepositoryModelImpl = (RepositoryModelImpl)_persistence.findByPrimaryKey(newRepository.getPrimaryKey());

		Assert.assertTrue(Validator.equals(
				existingRepositoryModelImpl.getUuid(),
				existingRepositoryModelImpl.getOriginalUuid()));
		Assert.assertEquals(existingRepositoryModelImpl.getGroupId(),
			existingRepositoryModelImpl.getOriginalGroupId());
	}

	protected Repository addRepository() throws Exception {
		long pk = ServiceTestUtil.nextLong();

		Repository repository = _persistence.create(pk);

		repository.setUuid(ServiceTestUtil.randomString());

		repository.setGroupId(ServiceTestUtil.nextLong());

		repository.setCompanyId(ServiceTestUtil.nextLong());

		repository.setUserId(ServiceTestUtil.nextLong());

		repository.setUserName(ServiceTestUtil.randomString());

		repository.setCreateDate(ServiceTestUtil.nextDate());

		repository.setModifiedDate(ServiceTestUtil.nextDate());

		repository.setClassNameId(ServiceTestUtil.nextLong());

		repository.setName(ServiceTestUtil.randomString());

		repository.setDescription(ServiceTestUtil.randomString());

		repository.setPortletId(ServiceTestUtil.randomString());

		repository.setTypeSettings(ServiceTestUtil.randomString());

		repository.setDlFolderId(ServiceTestUtil.nextLong());

		_persistence.update(repository, false);

		return repository;
	}

	private RepositoryPersistence _persistence;
}