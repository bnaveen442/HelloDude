package com.techouts.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.techouts.pojo.User;

public class UserDao {
	static HashMap<Integer, User> usersMap = new HashMap<Integer, User>();

	public UserDao() {
		User user1 = new User();
		user1.setId(1);
		user1.setAge(20);
		user1.setName("raj");

		User user2 = new User();
		user2.setId(2);
		user2.setAge(21);
		user2.setName("ram");

		usersMap.put(1, user1);
		usersMap.put(2, user2);
	}

	public List<User> getAllUsers() 
	{

		List<User> userList = new ArrayList<User>(usersMap.values());
		return userList;
	}

	public void createUser(User user) 
	{
		usersMap.put(user.getId(), user);
	}

	public void updateUser(User user) 
	{
		usersMap.put(user.getId(), user);	
	}

	public void deleteUser(User user) {
		usersMap.remove(user.getId());

	}

	public void createusers(List<User> users) {
		for (User user : users) {
			usersMap.put(user.getId(), user);
		}

	}

}
