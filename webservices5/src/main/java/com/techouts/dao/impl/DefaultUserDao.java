package com.techouts.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techouts.dao.UserDao;
import com.techouts.pojo.User;

public class DefaultUserDao {

	final String QUERY="insert into User values(?,?,?)";
	public List<User> getAllUsers()
	{
		List<User> list=new ArrayList<User>();

		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/jdbc","root","root");  

			Statement stmt=con.createStatement();  

			ResultSet rs=stmt.executeQuery("select * from User");  
			while(rs.next())  	
				list.add(new User(rs.getString(1), rs.getInt(3),rs.getInt(2) ));
			con.close();  
		}catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		return list;
	}  

	public void createUser(User user) 
	{
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/jdbc","root","root");  

			PreparedStatement stmt=con.prepareStatement(QUERY);
			stmt.setString(1, user.getName());
			stmt.setInt(2, user.getAge());
			stmt.setInt(3,user.getId());

			System.out.println(stmt.executeUpdate(QUERY));
			ResultSet rs=stmt.executeQuery("select * from User");  
			while(rs.next())  	
				System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3));  
			con.close();  
		}catch(Exception e)
		{ System.out.println(e);
		} 


	}
}






