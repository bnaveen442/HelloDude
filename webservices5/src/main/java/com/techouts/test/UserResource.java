package com.techouts.test;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.techouts.service.UserService;
import com.techouts.service.impl.DefaultUserService;

@Controller

public class UserResource{

	UserService userService = new DefaultUserService();

	/*@POST
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Response createUser(User user) {
		userService.createUser(user);
		String result = "User created with " + "ID: "+user.getId();
		return Response.status(200).entity(result).build();

	}*/


	@RequestMapping(value = "/userDetails", method = RequestMethod.GET, produces = "application/xml")
	public  @ResponseBody Response getAllUsers( ) {

		return  Response.status(200).entity(userService.getAllUsers()).build();
	}
	/*
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public Response updateUser(User user)
	{
		userService.updateUser(user);
		return Response.status(200).entity("user successfully updated").build();
	}

	@DELETE
	@Consumes(MediaType.APPLICATION_XML)
	public Response deleteUser(User user)
	{

		userService.deleteUser(user);
		return Response.status(200).entity("user deleted").build();
	}*/
}
