package com.newtonica.cucu.entity;

public class User {

	String userId;
	String name;
	String mobile;
	String country;

	public User(String userId, String name, String mobile, String country) {
		super();
		this.userId = userId;
		this.name = name;
		this.mobile = mobile;
		this.country = country;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", mobile=" + mobile + ", country=" + country + "]";
	}
	
	

}
