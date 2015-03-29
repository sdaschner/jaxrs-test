package com.sebastian_daschner;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.container.ResourceContext;
import javax.ws.rs.core.Context;

/**
 * @author Sebastian Daschner
 */
@Stateless
@Path("/")
public class RootResource {

    @Context
    ResourceContext resourceContext;

    @GET
    public String getRoot() {
        return "root";
    }

    @Path("models")
    public ModelsResource models() {
        return resourceContext.getResource(ModelsResource.class);
    }

}
