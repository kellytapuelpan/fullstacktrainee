<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Dog</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
		<link href="css/style.css" type="text/css" rel="stylesheet"/>
	</head>
	
	<body>
		<div class="container py-5">
			<div class="cont-result p-4 text-center">
				<h3>Dog's name: <c:out value="${dog.name}"/></h3>
				<h3>Breed: <c:out value="${dog.breed}"/></h3>
				<h3>Weight: <c:out value="${dog.getWeight()}"/></h3>
				
				<h2>You created a <c:out value="${dog.getBreed()}" />!</h2>
				<p><c:out value="${dog.showAffection()}"></c:out></p>
			</div>
		</div>
	</body>
</html>