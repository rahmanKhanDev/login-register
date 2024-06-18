<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lace India</title>
<link rel="stylesheet" href="reg.css">
</head>
<body>
<div class="container">
<h1>Register</h1>
<form action="reg" method=post><br>
<label for=username>Username</label><br>
<input type =text id=username name=uname><br>
<label for=password>Password</label><br>
<input type="password" id=password name=pword><br>
<label for=email>Email</label><br>
<input type="email" id=email name=email><br>
<label for=number>Number</label><br>
<input type=text id=number name=number><br>
<input type=submit class=submit value=Register><input type=reset class=submit><br>
<a href="index.html">Back to Home</a>

<%String error=request.getParameter("error");
		
	if(error!=null && error.equals("1"))
		{%>
		<p style="color:red">Registration unsuccsessfull,please try again</p>
		
		<% }%>

</form>
</div>
</body>
</html>