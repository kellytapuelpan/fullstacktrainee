<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Chessboard</title>
<link href="css/style.css" type="text/css" rel="stylesheet"/>
</head>

<body>
	<% String w = request.getParameter("width"); %>
	<% String h = request.getParameter("height"); %>
	<% Integer width = Integer.valueOf(w); %>
    <% Integer height = Integer.valueOf(h); %>
    
    <h1>Chessboard:</h1>
    <h2><%= width %>w X <%= height %>h </h2>
    
    <% for(int i = 0; i < height; i++) {%>
   		<div class="content">
   		
	   		<% for(int j = 0; j< width; j++){%>
	   		 	
	   		 	<% String currentClass = "";%>
	   		 	
	   		 	<% if (j % 2 == 0 && i % 2 == 0 ) {%>
	   		 		<% currentClass = "purple";%>
	   		 	<%} else if (j % 2 == 0 && i % 2 != 0 ) { %>
	   		 		<% currentClass = "blue";%>
	   		 	<%} else if (j % 2 != 0 && i % 2 == 0 ) { %>
	   		 		<% currentClass = "blue";%>
	   		 	<%} else {%>
	   		 		<% currentClass = "purple";%>
	   		 		
	   		 	<%} %>
	   		 	<div class="<%= currentClass %> size innercontent no-margin">
	   		 	</div>
	   		<% }%>
   		 
   		</div>
    <%} %>
</body>
</html>