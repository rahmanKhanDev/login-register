<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lace India</title>
<link rel="stylesheet" href="login.css">
</head>
<body>
<div class="container">
<h1>Login</h1>


<form action="login" method="post"><br>
<label for=username>Username</label><br>
<input type =text id=username name=uname><br>
<label for=password>Password</label><br>
<input type="password" id=password name=pword><br>
<input type=submit class=submit value=Login>

<a href="index.html">Back to Home</a>

<% String error=request.getParameter("error"); 
   if(error!=null && error.equals("1")){%>
	<p style="color:red"> invalid username or password,please try again</p>   
   <% }%>

<%
String registration=request.getParameter("resgistration");
			if(registration!=null &&registration.equals("successfull")){	%>
			<p style ="color:red"> Registarion successfull,please login</p>
			<% }%>


<%
String user=request.getParameter("user");
			if(user!=null &&user.equals("true")){	%>
			<p style ="color:red"> User exist,please login</p>
			<% }%>


</form>
</div>
</body>
</html>