<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="design.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ViewUsers</title>
</head>
<body>
Welcome <%= session.getAttribute("email" ) %><br>
<form action="viewCourse" method="get" class="formContainer">
<input type="submit" name="show"> 
</form>
</body>
</html>