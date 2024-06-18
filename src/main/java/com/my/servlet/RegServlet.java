package com.my.servlet;

import java.io.IOException;

import com.my.DAO.IUserDAO;
import com.my.DAO.User;
import com.my.DAO.UserDaoImp;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegServlet
 */
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
   //creating object of User class to access setters
	  User user=new User();
	  IUserDAO userdao=new UserDaoImp();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("uname");
		String password=request.getParameter("pword");
		String email=request.getParameter("email");
		String number=request.getParameter("number");
		
		//checking if user already exsit or not if exist send login page 
		if( userdao.isValidUser(username)) {
			response.sendRedirect("login.jsp?user=true");
		}
		
		//if not exist register user
		else {
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		user.setNumber(number);
		
		if(userdao.addUser(user)) {
			response.sendRedirect("login.jsp?resgistration=successfull");
		}
		else {
			response.sendRedirect("reg.jsp?error=1");
		}
		}
	}

}
