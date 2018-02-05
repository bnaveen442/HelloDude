package com.techouts.service.impl;

import java.util.List;

import com.techouts.dao.UserDao;
import com.techouts.pojo.User;
import com.techouts.service.UserService;

public class DefaultUserService  implements UserService{
	/*UserDao dao=new DefaultUserDao();

	public List<User> getAllUsers() {
		return dao.getAllUsers();
	}

	public void createUser(User user) {
		dao.createUser(user);

	}
	 */

	UserDao userDao = new UserDao();

	public List<User> getAllUsers() {
		List<User> userList = userDao.getAllUsers();
		return userList;
	}

	public void createUser(User user) {
		userDao.createUser(user);
	}

	public void updateUser(User user) {
		userDao.updateUser(user);
		
	}

	public void deleteUser(User user) {
		userDao.deleteUser(user);
		
	}

}  


