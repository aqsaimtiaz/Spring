<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Update Product</title>
</head>
<body>

		
		  
		<form action="${pageContext.request.contextPath}/save" method="post">
		  
		  
		  <div class="container">
		  <div >
			    <label for="productId">Product Id</label>
			    <input class="form-control" id="productId" name="productId" value="${product.productId}"></input>
			  </div>

			  	<div >
			    <label for="productName">Product Name</label>
			    <input class="form-control" id="productName" name="productName" value="${product.productName}"></input>
			  </div>
			  
			  <div>
			    <label for="productDescription">Description</label>
			    <input  class="form-control" id="productDescripton" name="productDescripton" value="${product.productDescripton}"></input>
			  </div>
			  
			   <div >
			    <label for="producPrice">Price</label>
			    <input  class="form-control" id="productPrice" name="productPrice" value="${product.productPrice}"></input>
			  </div>		  
			
			
					 <button type="submit" class="btn btn-primary">Update Product</button>
			  
		  </div>
		 
 
		</form>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>