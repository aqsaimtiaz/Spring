<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<form action="addProductData" method="post">
		  
		  <div class="container">
			  	<div class="form-group">
			    <label for="productName">Product Name</label>
			    <input type="text" class="form-control" id="productName" name="productName" aria-describedby="emailHelp" placeholder="Enter Product name">
			  </div>
			  
			  <div class="form-group">
			    <label for="productDescription">Description</label>
			    <input type="text" class="form-control" id="productDescripton" name="productDescripton" placeholder="Product Description">
			  </div>
			  
			   <div class="form-group">
			    <label for="producPrice">Price</label>
			    <input type="text" class="form-control" id="productPrice" name="productPrice" placeholder="Product Price">
			  </div>		  
			
			  <button type="submit" class="btn btn-primary">Add Product</button>
			  
		  </div>
		</form>


	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>