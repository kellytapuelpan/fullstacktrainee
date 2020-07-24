<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css" integrity="sha384-r4NyP46KrjDleawBgD5tp8Y7UzmLA05oM1iAEQ17CSuDqnUK2+k9luXQOfXJCJ4I" crossorigin="anonymous">	
		<link rel="stylesheet" href="./css/style.css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.0.0/animate.min.css"/>
	    <title>Generate Random Word</title>
	</head>
	
	<body>
	  	<div class="container text-center mt-5 cont-text">
		  	<div class="col-12 col-md-10 offset-md-1">
		  		<div class="mx-5 mt-5">
		  			<h2>So far you have generated a new word</br><span class="animate__animated animate__bounce"><c:out value="${ count }"></c:out></span> times</h2>
		  			<h3 class="p-3 mt-3 animate__animated animate__swing"><c:out value="${ password }"></c:out></h3>
		  		</div>
	  		</div>
	  	</div>
	  	
	  	<div class="container text-center mt-4 mb-5">
		  	<div class="col-12 col-md-10 offset-md-1 cont-button pb-5">
		  	   	<a type="button" href="/RandomWord/RandomWord" class="btn btn-primary">Generate a new one!!</button></a>
		  	</div>
	  	</div>
	  	
	  	<div class="container text-center cont-text">
		  	<div class="col-12 col-md-10 offset-md-1">
		  		<div class="cont-border">
			  		<h2>The last time you generated a word was:</h2>
			  		<div class="mx-5 mt-3 p-3 animate__animated animate__swing animate__fadeIn animate__delay-1s cont-date">
			  			<p><c:out value="${ date }"></c:out></p>
			  		</div>
			  	</div>
			</div>
	  	</div>  	
	</body>
</html>