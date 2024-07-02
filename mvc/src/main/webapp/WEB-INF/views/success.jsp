<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Here is your data</title>
</head>
<body>

<% 
  Model.User  u = (Model.User) request.getAttribute("user");
	String email = u.getUserEmail();
	String username = u.getUserName();
	String password = u.getUserPassword();
	
// 	String email = (String) request.getAttribute("emaill");
// 	String username = (String) request.getAttribute("userName");
// 	String password = (String) request.getAttribute("userPassword");

%>
	<div>
		<h1>${myHeader}</h1>
		<h3><%=email%></h3>
		<h3><%=username %></h3>
		<h3><%=password %></h3>


	</div>

</body>
</html>