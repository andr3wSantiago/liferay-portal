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

package com.liferay.portlet;

import com.liferay.portal.model.Layout;
import com.liferay.portal.model.User;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Brian Wing Shun Chan
 */
public class EventResponseFactory {

	public static EventResponseImpl create(
			EventRequestImpl eventRequestImpl, HttpServletResponse response,
			String portletName, User user, Layout layout)
		throws Exception {

		EventResponseImpl eventResponseImpl = new EventResponseImpl();

		eventResponseImpl.init(
			eventRequestImpl, response, portletName, user, layout);

		return eventResponseImpl;
	}

}