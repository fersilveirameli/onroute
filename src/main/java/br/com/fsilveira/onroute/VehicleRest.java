package br.com.fsilveira.onroute;

import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import br.com.fsilveira.onroute.dao.VehicleDAO;
import br.com.fsilveira.onroute.model.Vehicle;
import br.com.fsilveira.onroute.model.Vehicles;

@Path("/v1/vehicle")
public class VehicleRest implements RestInterface<Vehicle> {

    private final String PARAM_FIRST = "offset";
    private final String PARAM_LIMIT = "limit";

    public Response list(@QueryParam("filter") @DefaultValue("") String filter, @QueryParam(PARAM_FIRST) @DefaultValue("0") Integer inicio,
	    @QueryParam(PARAM_LIMIT) @DefaultValue("20") Integer tamanhoPagina, @Context UriInfo uriInfo) {

	List<Vehicle> list = new VehicleDAO().getVehicles();

	return Response.ok(new Vehicles(list)).build();
    }

    public Response find(@PathParam("id") Integer id) {
	// ProcessoDTO processo = processoBusiness.get(id);
	// if (processo == null) {
	// return Response.status(Status.NOT_FOUND).build();
	// }
	// return Response.ok(processo).build();

	return Response.ok().build();
    }

    public Response save(Vehicle vehicle) {
	// processoBusiness.saveOrUpdate(processoDTO);
	// return Response.status(Status.CREATED).build();

	return Response.ok().build();
    }

    public Response update(Vehicle vehicle) {
	// processoBusiness.saveOrUpdate(processoDTO);
	// return Response.ok().build();

	return Response.ok().build();
    }

    public Response remove(@PathParam("id") Integer id) {
	//
	// ProcessoDTO processo = processoBusiness.get(id);
	// if (processo == null) {
	// return Response.status(Status.NOT_FOUND).build();
	// } else {
	// processoBusiness.remove(id);
	// return Response.noContent().build();
	// }

	return Response.ok().build();
    }

}
