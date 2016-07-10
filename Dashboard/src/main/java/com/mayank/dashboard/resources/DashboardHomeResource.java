/**
 * 
 */
package com.mayank.dashboard.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mayank.dashboard.dto.GraphOneDTO;

/**
 * @author Maverick
 *
 */
@Path("/resources")
public class DashboardHomeResource {

	@GET
	@Path("/graphone")
	@Produces(MediaType.APPLICATION_JSON)
	public GraphOneDTO graphOne() {
		GraphOneDTO obj = new GraphOneDTO();
		obj.setXaxis(10);
		obj.setYaxis(10);
		return obj;
	}

	@GET
	@Path("/testapi")
	public String testapi() {
		return "if you are seeing this message, then your api is working";
	}

	
}
