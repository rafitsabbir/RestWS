package com.sabbir.restws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/service")
public class MainService {

	@GET
	@Path("/hi")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHi() {
		return "hi rest ws!";
	}

	@GET
	@Path("/insert/{ticket_type}/{date}/{time}/{name}/{location}/{price}")
	@Produces(MediaType.TEXT_PLAIN)
	public String receiveTicketInfo(@PathParam("ticket_type") String ticket_type,
			@PathParam("date") String date,@PathParam("time") String time,
			@PathParam("name") String name,@PathParam("location") String location,
			@PathParam("price") String price) {
		
		System.out.println(ticket_type+"\t"+date+"\t"+time+"\t"+name+"\t"+location+"\t"+price);
		
		return "Success!";
	}

}
