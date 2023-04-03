package br.unitins.mobile.carcatalog.resource;

import br.unitins.mobile.carcatalog.model.Category;
import br.unitins.mobile.carcatalog.service.CategoryService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/categories")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CategoryResource {

    @Inject
    CategoryService categoryService;

    @GET
    public Response getAll() {
        List<Category> Categorys = categoryService.getAll();
        return Response.ok(Categorys).build();
    }
}
