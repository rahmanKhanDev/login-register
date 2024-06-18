<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lace India</title>
</head>
<body>

<%
//getting session object
  HttpSession hs=request.getSession();
  if(hs!=null)
//invalidating session
   hs.invalidate();
//redirecting to home page
  response.sendRedirect("index.html"); 
   
%>
</body>
</html>