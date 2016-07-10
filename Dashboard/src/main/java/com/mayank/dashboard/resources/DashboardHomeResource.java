/**
 * 
 */
package com.mayank.dashboard.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Maverick
 *
 */
@Path("/resources")
public class DashboardHomeResource {

	@GET
	@Path("/testapi")
	public String testapi(){
	return "if you are seeing this message, then your api is working";	
	}

}
