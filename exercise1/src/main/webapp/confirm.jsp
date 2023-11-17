<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
<%@ page import="com.java.be.User" %>

<div class="container pt-5">
    <div class="mt-2 p-5 bg-secondary text-white rounded">
        

        <h1>Confirmation</h1>
        <p>Hello Mr.${user.lastName}</p>
        <p>${user.firstName}</p>
        <p>${user.doB}</p>
        <p>${user.poB}</p>
        <p>${user.sex}</p>
        <p>

        </p>
        <div>
        	<input type="button" class="btn btn-light" value="edit" onclick="location.href='edit.jsp'">
        </div>
        
    </div>
</div>

</body>
</html>