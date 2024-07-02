<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">

    <title>Registration</title>
  </head>
  <body>
    
    <div class="container">
      <form action="processComplexform" method="post">
	 	
	   <div class="container">
	   
	   	    <label for="exampleInputText">Enter Name</label>
			    <input type="text" 
			    class="form-control" 
			    id="name" 
			    name="name">

	   		 <div class="form-group">
			  	<label for="courses">Select courses</label>
			  	<select name="courses">
			  		<option>Java</option>
			  		<option>Python</option>
			  		<option>C++</option>
			  	</select>
			  </div>
	  
					   <div class="form-check">
				  <input class="form-check-input" type="radio"  id="male" name="gender" value="male">
				  <label class="form-check-label" for="flexRadioDefault1">
				   Male
				  </label>
				</div>
		<div class="form-check">
		  <input class="form-check-input" type="radio"  id="female" name="gender" value="female">
		  <label class="form-check-label" for="flexRadioDefault2">
		    Female
		  </label>
		</div>
	  
	  <div class="form-check">
		  <input class="form-check-input" type="checkbox" value="old" id="old" name="type"  >
		  <label class="form-check-label" for="flexCheckDefault">
		    old student
		  </label>
		</div>
		<div class="form-check">
		  <input class="form-check-input" type="checkbox" value="new" id="new" name="type">
		  <label class="form-check-label" for="flexCheckChecked">
		    new student
		  </label>
		</div>
		
		 <div class="form-group">
			  	<label for="city">City:</label>
			  	 <input type="text" 
			    class="form-control" 
			    id="city" 
			    name="address.city">
		 </div>
	  
	   <div class="form-group">
			  	<label for="street">Street:</label>
			  	 <input type="text" 
			    class="form-control" 
			    id="street" 
			    name="address.street">
		</div>
			  <button type="submit" class="btn btn-primary">Submit</button>
			   </div>
			 
	</form>
	
    </div>
    
 

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
    -->
  </body>
</html>