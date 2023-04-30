<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>	
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Contact Page</title>
</head>
<body>

	<div class="container mt-5" style="box-shadow: 2px 2px 10px grey; padding: 20px 20px 10px 10px; max-width:400px; border-radius: 10px; flex-wrap: wrap;">
		<h2 class="text-center">${Header}</h2>	
		<p class="text-center">${Desc}</p>
		<form action="processform" method="post">
		
		 	<div class="form-group">
				<label for="exampleInputEmail1">Email Address</label> <input
					type="email" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter email" name="email"> 
			</div> 
			
			<div class="form-group">
				<label for="username">Name</label> <input
					type="text" class="form-control" id="username"
					aria-describedby="emailHelp" placeholder="Enter name" name="username">
			</div>
			
			<div class="form-group">
				<label for="userpassword">Password</label><input
					type="password" class="form-control" id="userpassword"
					placeholder="Enter password" name="password">
			</div>
		
			<div class="container text-center">	
				<button type="submit" class="btn btn-success">SignUp</button>
			</div>
		</form>
	</div>



	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudfare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>