package br.unitins.mobile.carcatalog.resource;

import br.unitins.mobile.carcatalog.dto.AuthRequest;
import br.unitins.mobile.carcatalog.service.AuthService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/auth")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AuthResource {

    @Inject
    AuthService authService;

    @Path("/login")
    @GET
    public Response validCredentials(AuthRequest authRequest) {
        boolean authenticated = authService.validCredentials(authRequest.getLogin(), authRequest.getPassword());
        if (authenticated) {
            return Response.ok().build();
        }
        return Response.status(Response.Status.UNAUTHORIZED).build();
    }
}
