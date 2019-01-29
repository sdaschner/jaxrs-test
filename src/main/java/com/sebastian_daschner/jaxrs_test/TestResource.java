package com.sebastian_daschner.jaxrs_test;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

@Path("test")
public class TestResource {

    @Context
    HttpServletRequest request;

    @Context
    UriInfo uriInfo;

    @Inject
    TestClient testClient;

    @GET
    public String get() {
        String content = "uriInfo.baseUri: " + uriInfo.getBaseUriBuilder().build() + "\n";

        testClient.invokeRequest();

        return content + "uriInfo.baseUri, 2nd time: " + uriInfo.getBaseUriBuilder().build() + "\n";
    }

}
