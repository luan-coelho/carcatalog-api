package br.unitins.mobile.carcatalog.resource;

import br.unitins.mobile.carcatalog.model.Car;
import br.unitins.mobile.carcatalog.service.CarService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/cars")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class BrandResource {

    @Inject
    CarService carService;

    @GET
    public Response getAll() {
        List<Car> cars = carService.getAll();
        return Response.ok(cars).build();
    }

    @POST
    public Response create(Car car) {
        carService.create(car);
        return Response.status(Response.Status.CREATED).build();
    }
}
