package br.unitins.mobile.carcatalog.resource;

import br.unitins.mobile.carcatalog.model.Brand;
import br.unitins.mobile.carcatalog.service.BrandService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/brands")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class BrandResource {

    @Inject
    BrandService brandService;

    @GET
    public Response getAll() {
        List<Brand> brands = brandService.getAll();
        return Response.ok(brands).build();
    }
}
