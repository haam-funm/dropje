package com.am.shipment.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.am.shipment.model.Shipment;
import com.codahale.metrics.annotation.Timed;


@Api(value = "Shipment resource operations",
    produces = MediaType.APPLICATION_JSON + "; charset=utf-8")
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface ShipmentResource {

  @Timed
  @POST
  @Path("/shipment")
  @ApiOperation(value = "Creates shipment", httpMethod = "POST", code = 204)
  @ApiResponses(value = {@ApiResponse(code = 204, message = "The shipment is created")})
  void createShipment(Shipment shipment);

  @Timed
  @PUT
  @Path("/shipment/{id}")
  @ApiOperation(value = "Updated shipment", httpMethod = "PUT", code = 204)
  @ApiResponses(value = {@ApiResponse(code = 204, message = "The shipment is updated")})
  void updateShipment(Shipment shipment, @ApiParam(value = "Id of shipment to be updated",
      required = true) @PathParam("id") String id);



}
