<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Index</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
		<link href="css/style.css" type="text/css" rel="stylesheet"/>
	</head>
	
	<body>
		<div class="container">
			<div class="row">
				<div class="col-6 pt-5">
					<div class="cont-form p-3">
						<h2>Create a Dog</h2>
						
						<form action="Dogs" method="post">
							<div class="form-group">
								<label>Name:</label>
								<input type="text" name="name" class="form-control">
							</div>
							<div class="form-group">
								<label>Breed:</label>
								<input type="text" name="breed" class="form-control">
							</div>
							<div class="form-group">
								<label>Weight:</label>
								<input type="number" name="weight" class="form-control">
							</div>
							<div class="form-group">
								<input type="submit" class="btn btn-primary" value="Create">
							</div>
						</form>
					</div>
				</div>
				<div class="col-6 pt-5">
					<div class="cont-form p-3">
						<h2>Create a Cat</h2>
						<form action="Cats" method="post">
							<div class="form-group">
								<label>Name:</label>
								<input type="text" name="name" class="form-control">
							</div>
							<div class="form-group">
								<label>Breed:</label>
								<input type="text" name="breed" class="form-control">
							</div>
							<div class="form-group">
								<label>Weight:</label>
								<input type="number" name="weight" class="form-control">
							</div>
							<div class="form-group">
								<input type="submit" class="btn btn-primary" value="Create">
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>