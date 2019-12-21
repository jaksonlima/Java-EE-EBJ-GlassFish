package com.soft.link.med.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Jakson
 */
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface PessoaResource {
    
    public static String PATH = "/teste";

    @GET
    @Path("/GET")
    public String getJson();

    @PUT
    @Path("/PUT")
    public void putJson(String content);
}
