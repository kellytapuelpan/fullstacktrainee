<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Button Counter</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
		<link href="css/style.css" type="text/css" rel="stylesheet"/>
	</head>
	
	<body>
		<div class="container py-5">
			<div class="col-md-8 offset-md-2 text-center">
				<div class="cont-back pt-5">
					<div class="pt-5">
						<a href="/Clicker/Counters"><button class="mb-5 btn">Click!</button></a>
						<h2>You have clicked the button</br><c:out value="${count}"></c:out> times</h2>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>