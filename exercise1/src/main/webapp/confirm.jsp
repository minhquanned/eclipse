<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.java.be.User" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Confirm</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container pt-5">
    <div class="mt-2 p-5 bg-secondary text-white rounded">

        <h1>Confirmation</h1>
        
		<%
		User user = (User) session.getAttribute("user"); 
		%>
		
		<%if(user.getSex() == "Male") { %>
			<p>Hello Mr.${user.lastName} ${user.firstName}</p> <%; %>
		<%} else if(user.getSex() == "Female") { %>
			<p>Hello Mrs.${user.lastName} ${user.firstName}</p> <%; %>
		<%} else { %>
			<p>Hello Mr/Mrs.${user.lastName} ${user.firstName}</p> <%; %>
        <%} %>
        
        <p>${user.doB}</p>
        <p>${user.poB}</p>
        <p>${user.sex}</p>
        <p>Your id: ${idUser}</p>
        
        
        <div>
        	<input type="button" class="btn btn-light" value="Edit" onclick="location.href='edit.jsp'">
        </div>
        
    </div>
</div>

</body>
</html>