package fr.yelhouakmi;

import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fr.yelhouakmi.model.Complex;

@Path("/complex")
public class ComplexResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response complex() {
        String[] description = {"human", "animal"};
        return Response.ok(new Complex(1, "test", description, Map.of("one", "test", "two", "test2"))).build();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response complex(Complex complex) {
        return Response.ok(String.format("Received object with id %s and name %s", complex.getId(), complex.getName())).build();
    }
}
