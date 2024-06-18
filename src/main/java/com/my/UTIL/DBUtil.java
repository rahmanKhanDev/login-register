package com.my.UTIL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//batabase utilizing class
public class DBUtil {
	//creating property of oracle db
  private static final String url="jdbc:oracle:thin:@localhost:1521:ORCL";
  private static final String username="SONU";
  private static final String password="KHAN";
  
  //loading the oracle driver very first time 
 static {
	 try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
 }
 
 //getting connection object
 public static Connection getConnetion() throws SQLException{

	return DriverManager.getConnection(url,username,password);
	 
 }
 
}
