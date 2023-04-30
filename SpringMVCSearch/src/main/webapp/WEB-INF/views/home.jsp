<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
			<!-- Required meta tags -->
			<meta charset="utf-8">
			<meta name="viewport" content="width=device-width, initial-scale=1">
			
			<!-- Bootstrap CSS -->
			<link
				href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
				rel="stylesheet"
				integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
				crossorigin="anonymous">
			
			<title>Home Page</title>
	</head>
	<body>
		
		<div class="container">
		
			<div class="card mx-auto mt-5 bg-background" style="width: 50%; background: #212121 !important;">
				<div class="card-body py-3">
				
					<h3 class="text-center text-white" style="text-transform: uppercase;">My Search</h3>
					<form action="search" method="get" class="mt-5">
					
						<div class="form-group">
							<input type="text" name="querybox" class="form-control" placeholder="Enter your keyword">
						</div>
					
						<div class="container text-center mt-4">
							<button class="btn btn-outline-light">Search</button>
						</div>		
							
					</form>
				
				</div>
			
			</div>
		
		</div>
		
	
		<!-- Optional JavaScript; choose one of the two! -->
	
		<!-- Option 1: Bootstrap Bundle with Popper -->
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
			crossorigin="anonymous"></script>

	</body>
</html>