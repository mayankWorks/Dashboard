/**
 * 
 */
package com.mayank.dashboard.resources;

import java.util.ArrayList;
import java.util.List;

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
	@Path("/graphonelist")
	@Produces(MediaType.APPLICATION_JSON)
	public List<GraphOneDTO> graphOneList() {
		List<GraphOneDTO> list = new ArrayList<>();
		GraphOneDTO obj = new GraphOneDTO();
		obj.setXaxis(10);
		obj.setYaxis(20);
		list.add(obj);
		GraphOneDTO obj2 = new GraphOneDTO();
		obj2.setXaxis(30);
		obj2.setYaxis(40);
		list.add(obj2);
		return list;
	}

	@GET
	@Path("/testapi")
	@Produces(MediaType.APPLICATION_JSON)
	public String testapi() {
		return "if you are seeing this message, then your api is working";
	}

	
}
