package com.my.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.my.UTIL.DBUtil;

//IuserDao implemention class
public class UserDaoImp implements IUserDAO {
     //getting dynamic value from db
	 String query="select * from USERINFO where USERNAME= ? and PASSWORD= ? ";
	 
	//ovarridng isValidUser() method,validating user info
	@Override
	public boolean isValidUser(String username, String password){
	try(Connection con=DBUtil.getConnetion();
			PreparedStatement pstmt=con.prepareStatement(query)	) {
		
		
		//Executing jdbc code
		pstmt.setString(1, username);
		pstmt.setString(2, password);
		
		ResultSet rs=pstmt.executeQuery();
		return rs.next(); // it will return true if username, password exist
	
	} catch (SQLException e) {
		
		e.printStackTrace();
		return false;
	}
		
	}

	
	//adding user to DB
	@Override
	public boolean addUser(User user) {
		String query="insert into USERINFO values(?,?,?,?)";
        try(Connection con=DBUtil.getConnetion();
        	PreparedStatement pstmt=con.prepareStatement(query)	) 
        {
        	//setting values into db table through user object which is holding data from regServlwt setters
        	pstmt.setString(1, user.getUsername());
        	pstmt.setString(2, user.getPassword());
        	pstmt.setString(3, user.getEmail());
        	pstmt.setString(4, user.getNumber());
        	
        	//will return 1 if added or 0
        	int row=pstmt.executeUpdate();
        	return row>0;
        } catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
		
	}


	

	 String query3="select * from USERINFO where USERNAME= ? ";
	@Override
	public boolean isValidUser(String username){
	try(Connection con=DBUtil.getConnetion();
			PreparedStatement pstmt=con.prepareStatement(query3)	) {
		
		
		//Executing jdbc code
		pstmt.setString(1, username);
		
		ResultSet rs=pstmt.executeQuery();
		return rs.next(); // it will return true if username, password exist
	
	} catch (SQLException e) {
		
		e.printStackTrace();
		return false;
	}
		
	}

}
