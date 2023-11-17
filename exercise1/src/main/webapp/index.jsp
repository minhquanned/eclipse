<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Buổi 5</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container">
		
	</div>

	<div class="container">
        <div class="mt-2 mx-auto p-5 bg-secondary text-white rounded">

            <div class="page-header">
                <h1>Register</h1>
            </div>

            <form action="userConfirm" method="post">
                <div>
                	<label>First Name:</label>
	                <input type="text" class="form-control" name="firstName" placeholder="Enter your First Name" required><br>
	            </div>
	            
	            <div>
	                <label>Last Name:</label>
	                <input type="text" class="form-control" name="lastName" placeholder="Enter your Last Name" required><br>
	            </div>
	            
	            <div>
	                <label>Date of Birth:</label>
	                <input type="date" class="form-control" name="DoB" required><br>
	            </div>
	                
	            <div>
	                <label>Place of Birth:</label>
	                <select class="form-select" name="PoB" id="PoB" required>
	                    <option value="DN">Đà Nẵng</option>
	                    <option value="QN">Quảng Nam</option>
	                    <option value="QT">Quảng Trị</option>
	                    <option value="H">Huế</option>
	                    <option value="HP">Hải Phòng</option>
	                </select><br>
	            </div>
	                
	            <div>
	                <label>Sex:</label>
	                    <input type="radio" id="Male" name="Sex" value="Male" checked="checked">
	                    <label for="Male">Male</label>
	                    <input type="radio" id="Female" name="Sex" value="Female">
	                    <label for="Female">Female</label>
	                    <input type="radio" id="Other" name="Sex" value="Other">
	                    <label for="Other">Other</label><br>
	            </div>
	                
	            <div>
	                <label>Free day:</label><br>
	                    <input type="checkbox" id="monday" name="freeDay" value="Monday">
	                    <label for="monday"> Monday</label><br>
	                    <input type="checkbox" id="tuesday" name="freeDay" value="Tuesday">
	                    <label for="tuesday"> Tuesday</label><br>
	                    <input type="checkbox" id="wednesday" name="freeDay" value="Wednesday">
	                    <label for="wednesday"> Wednesday</label><br>
	                    <input type="checkbox" id="thursday" name="freeDay" value="Thursday">
	                    <label for="thursday"> Thursday</label><br>
	                    <input type="checkbox" id="friday" name="freeDay" value="Friday">
	                    <label for="friday"> Friday</label><br>
	                    <input type="checkbox" id="saturday" name="freeDay" value="Saturday">
	                    <label for="saturday"> Saturday</label><br>
	                    <input type="checkbox" id="sunday" name="freeDay" value="Sunday">
	                    <label for="sunday"> Sunday</label><br>
	            </div>
	                      
	            <div class="pt-3">
	                <input type="submit" class="btn btn-light" value="submit">
	                <input type="button" class="btn btn-light" value="Login" onclick="location.href='Login.jsp'">
                </div>
                 
            </form>
        </div>
    </div>
    
    
</body>
</html>