package com.techouts.service;

import java.util.List;

import com.techouts.pojo.User;

public interface UserService {



	public List<User> getAllUsers() ;	

	public void createUser(User user);

	public void updateUser(User user);

	public void deleteUser(User user);

}
