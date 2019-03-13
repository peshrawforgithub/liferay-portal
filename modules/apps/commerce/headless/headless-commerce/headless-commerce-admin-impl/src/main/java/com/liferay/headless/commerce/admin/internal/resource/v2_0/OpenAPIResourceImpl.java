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

package com.liferay.headless.commerce.admin.internal.resource.v2_0;

import com.liferay.portal.vulcan.resource.OpenAPIResource;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Generated;

import javax.servlet.ServletConfig;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Igor Beslic
 * @generated
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v2_0/openapi.properties",
	service = OpenAPIResourceImpl.class
)
@Generated("")
@OpenAPIDefinition(
	info = @Info(description = "Liferay Commerce Admin API", title = "Liferay Commerce Admin API", version = "v2.0")
)
@Path("/v2.0")
public class OpenAPIResourceImpl {

	@GET
	@Path("/openapi.{type:json|yaml}")
	@Produces({MediaType.APPLICATION_JSON, "application/yaml"})
	public Response getOpenAPI(
			@Context HttpHeaders httpHeaders, @Context UriInfo uriInfo,
			@PathParam("type") String type)
		throws Exception {

		return _openAPIResource.getOpenAPI(
			_application, httpHeaders, _resourceClasses, _servletConfig, type,
			uriInfo);
	}

	@Context
	private Application _application;

	@Reference
	private OpenAPIResource _openAPIResource;

	private final Set<Class<?>> _resourceClasses = new HashSet<Class<?>>() {
		{
			add(AccountResourceImpl.class);

			add(CountryResourceImpl.class);

			add(CurrencyResourceImpl.class);

			add(InventoryResourceImpl.class);

			add(OrderResourceImpl.class);

			add(PriceEntryResourceImpl.class);

			add(PriceListResourceImpl.class);

			add(ProductResourceImpl.class);

			add(ProductOptionResourceImpl.class);

			add(ProductOptionValueResourceImpl.class);

			add(RegionResourceImpl.class);

			add(SkuResourceImpl.class);

			add(UserResourceImpl.class);

			add(WebSiteResourceImpl.class);

			add(OpenAPIResourceImpl.class);
		}
	};

	@Context
	private ServletConfig _servletConfig;

}