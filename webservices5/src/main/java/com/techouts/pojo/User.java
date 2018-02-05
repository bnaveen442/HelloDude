package com.techouts.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name="User")
public class User {
	private String name;
	private int id;
	private int age;
	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	@XmlElement
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	@XmlElement
	public void setAge(int age) {
		this.age = age;
	}
	public User(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



}
