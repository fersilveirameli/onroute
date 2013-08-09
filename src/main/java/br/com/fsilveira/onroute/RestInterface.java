package br.com.fsilveira.onroute;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Produces({ MediaType.APPLICATION_JSON })
@Consumes(MediaType.APPLICATION_JSON)
public interface RestInterface<T> {

    final String PARAM_INICIO = "offset";

    final String PARAM_TAMANHO_PAGINA = "limit";

    @GET
    public Response list(@QueryParam("filter") @DefaultValue("") String filter, @QueryParam(PARAM_INICIO) @DefaultValue("0") Integer inicio,
	    @QueryParam(PARAM_TAMANHO_PAGINA) @DefaultValue("20") Integer tamanhoPagina, @Context UriInfo uriInfo);

    @GET
    @Path("/{id}")
    public Response find(@PathParam("id") Integer id);

    @POST
    public Response save(T t);

    @PUT
    public Response update(T t);

    @DELETE
    @Path("/{id}")
    public Response remove(@PathParam("id") Integer id);

}
