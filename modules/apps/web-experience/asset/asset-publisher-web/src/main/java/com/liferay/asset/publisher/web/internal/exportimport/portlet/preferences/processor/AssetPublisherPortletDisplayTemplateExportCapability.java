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

package com.liferay.asset.publisher.web.internal.exportimport.portlet.preferences.processor;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.portlet.preferences.processor.Capability;
import com.liferay.portlet.display.template.exportimport.portlet.preferences.processor.PortletDisplayTemplateExportCapability;

import javax.portlet.PortletPreferences;

import org.osgi.service.component.annotations.Component;

/**
 * Provides implementation of export capability
 * {@link AssetPublisherPortletDisplayTemplateExportCapability} for Asset
 * Publisher portlet to be able to provide specific display style and display
 * style group ID based on existence of template handler.
 *
 * @author Mate Thurzo
 */
@Component(
	immediate = true,
	service = {
		Capability.class,
		AssetPublisherPortletDisplayTemplateExportCapability.class
	}
)
public class AssetPublisherPortletDisplayTemplateExportCapability
	extends PortletDisplayTemplateExportCapability {

	@Override
	protected String getDisplayStyle(
		PortletDataContext portletDataContext, String portletId,
		PortletPreferences portletPreferences) {

		return AssetPublisherExportImportPortletPreferencesProcessorUtil.
			getDisplayStyle(portletPreferences);
	}

	@Override
	protected long getDisplayStyleGroupId(
		PortletDataContext portletDataContext, String portletId,
		PortletPreferences portletPreferences) {

		return AssetPublisherExportImportPortletPreferencesProcessorUtil.
			getDisplayStyleGroupId(portletPreferences);
	}

}