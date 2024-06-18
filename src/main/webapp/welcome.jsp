<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lace India</title>
<link rel="stylesheet" href="welcome.css">
</head>
<body>
<%
//getting session object
  HttpSession hs=request.getSession();
//checking is session object is empty or it has no values
   if(hs !=null && hs.getAttribute("username") !=null){
  String username =(String)hs.getAttribute("username");
  %>
<div class=container>
<h1>Welcome, <%= username %>!</h1>
<p>We are delighted to have you on our platform. 🌟</p>
<h3>Explore, learn, and connect with our vibrant community! 🚀</h3>
<p>Feel free to stay as long as you like, and when you're ready,</p>
<p>you can <a href=logout.jsp>LOGOUT</a> securly.</p> 

</div>
<%
}else{
	response.sendRedirect("login.jsp");
}
   %>
</body>
</html>