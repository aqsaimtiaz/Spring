<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage</title>
</head>
<body>

	<h1>Hello MVC from Aqsa</h1>
	
	
	<%
	String name = (String)	request.getAttribute("name");
		
	%>
	
	<h1>Getting from Controller <%=name%></h1>
</body>
</html>