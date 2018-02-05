package com.techouts.test;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techouts.pojo.User;
import com.techouts.service.UserService;
import com.techouts.service.impl.DefaultUserService;
@RestController
public class UserResource{



	UserService userService = new DefaultUserService();



	@RequestMapping(value = "/user", method = RequestMethod.GET,headers = "Accept=application/json")
	public List<User>   getAllUsers( ) {


		return  userService.getAllUsers();
	}


	@RequestMapping(value="/user/create" , method=RequestMethod.POST, headers="Accept=application/json")
	public String  postUser(User user)
	{
		System.out.println("created "+ user.getAge()+" "+user.getId()+" "+user.getName());
		userService.createUser(user);
		return  user.toString();
	}

	@RequestMapping(value="/user/create" , method=RequestMethod.PUT, headers="Accept=application/json")
	public User updateUser(User user)
	{

		System.out.println("update put "+ user.getAge()+" "+user.getId()+" "+user.getName());
		userService.createUser(user);
		return user;
	}
	@RequestMapping(value="/user/delete" , method=RequestMethod.DELETE, headers="Accept=application/json")
	public String deleteUser(User user)
	{
		System.out.println("dleted  "+ user.getAge()+" "+user.getId()+" "+user.getName());
		userService.deleteUser(user);
		return user.toString();
	}

	@RequestMapping(value="/user/delete/{id}" , method=RequestMethod.DELETE, headers="Accept=application/json")
	public String deleteUser(User user, @PathVariable("id") int id)
	{
		System.out.println("deleted  based on path varibale "+ user.getAge()+" "+user.getId()+" "+user.getName());
		System.out.println(id);
		userService.deleteUser(user);
		return user.toString();
	}


}
