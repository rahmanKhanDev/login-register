package com.my.DAO;


//User validating interface
public interface IUserDAO {

	//abstract method for user validation
	public boolean isValidUser(String username,String password);
	public boolean addUser(User user);
	public boolean isValidUser(String username);
}
