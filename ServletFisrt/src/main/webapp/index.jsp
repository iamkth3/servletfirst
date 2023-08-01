<%@page import="java.util.Date"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello world</h1>
	<p>This is home page and loading for u </p>
	
	<%= new Date().toLocaleString() %>
	<br>
	
	<a href="login">Login Servlet</a>
</body>
</html>