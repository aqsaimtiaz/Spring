<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- To enable Expression languages write the below line -->
<%@page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage</title>
</head>
<body>

	<h1>Hello MVC from Aqsa</h1>
	
	
	<%
	// String name = (String)	request.getAttribute("name");
	
	// Easy way of fetching dynamic data using expression lang
	
	
	%>
	
<%-- 	<h1>Getting from Controller <%=name%></h1> --%>
		<h1>Hello from EL ${name}</h1>
		
		
</body>
</html>