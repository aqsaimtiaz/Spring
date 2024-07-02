<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List" %>
<%@page import="Model.Product" %>

<!DOCTYPE html>
<html>
<head>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<form >
		  
		  <div class="container">
			  	<table class="table">
					  <thead>
					    <tr>
					      <th scope="col">Id</th>
					      <th scope="col">Name</th>
					      <th scope="col">Description</th>
					      <th scope="col">Price</th>
					    </tr>
					  </thead>
					  <tbody>
					    
					    
					    <%
					    List<Product> products	= (List<Product>) request.getAttribute("products");
					    for(Product p : products) {
					    	String id = p.getProductId();
					    	String pname = p.getProductName();
					    	String desc = p.getProductDescripton();
					    	String price = p.getProductPrice();
					    %>
					    <tr>
					      <td><%=id%></td>
					      <td><%=pname %></td>
					      <td><%=desc %></td>
					      <td><%=price %></td>
					      <td> <a href="deleteProduct/<%=id%>"><i class="material-icons">delete</i><a/></td>
					      <td> <a href="updateProduct/<%=id%>"><i class="material-icons">Update</i><a/></td>
					      
					      </tr>
					   <%   }
					    
					    %>
					     
					  </tbody>
					</table>
		  </div>
		</form>


	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>