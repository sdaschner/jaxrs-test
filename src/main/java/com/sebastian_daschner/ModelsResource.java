package com.sebastian_daschner;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * @author Sebastian Daschner
 */
public class ModelsResource {

    @GET
    public String getAll() {
        return "all";
    }

    @GET
    @Path("{id}")
    public String get(@PathParam("id") final String id) {
        return "model_" + id;
    }

}
