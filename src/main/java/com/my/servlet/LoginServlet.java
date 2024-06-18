package com.my.servlet;

import java.io.IOException;

import com.my.DAO.IUserDAO;
import com.my.DAO.UserDaoImp;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static IUserDAO userDao=new UserDaoImp();
   
	//post method for login page
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//getting request parameter 
		String username=request.getParameter("uname");
		String password=request.getParameter("pword");
		
		//validating user and creating session
		if(userDao.isValidUser(username, password)) {
      
			HttpSession hs=request.getSession();	
			hs.setAttribute("username",username);
			response.sendRedirect("welcome.jsp");
		}
		
		else
		{
			response.sendRedirect("login.jsp?error=1");
			
		}
	}

}
