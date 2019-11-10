package com.sabbir.restws;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
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
	public String receiveTicketInfo(@PathParam("ticket_type") String ticket_type, @PathParam("date") String date,
			@PathParam("time") String time, @PathParam("name") String name, @PathParam("location") String location,
			@PathParam("price") String price) {

		System.out.println(ticket_type + "\t" + date + "\t" + time + "\t" + name + "\t" + location + "\t" + price);

		return "Success!";
	}

	@GET
	@Path("/query")
	@Produces(MediaType.APPLICATION_XML)
	public String inssertQuery(@QueryParam("ticket_type") String ticket_type, @QueryParam("date") String date,
			@QueryParam("time") String time, @QueryParam("name") String name, @QueryParam("location") String location,
			@QueryParam("price") String price) {

		System.out.println(ticket_type + "\t" + date + "\t" + time + "\t" + name + "\t" + location + "\t" + price);

		return "<xml>Success!</xml>";
	}

	@GET
	@Path("/matrix")
	@Produces(MediaType.APPLICATION_JSON)
	public String insertMatrix(@MatrixParam("ticket_type") String ticket_type, @MatrixParam("date") String date,
			@MatrixParam("time") String time, @MatrixParam("name") String name,
			@MatrixParam("location") String location, @MatrixParam("price") String price) {

		System.out.println(ticket_type + "\t" + date + "\t" + time + "\t" + name + "\t" + location + "\t" + price);

		return "{\"status\":\"success!\"}";
	}

}
