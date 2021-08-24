<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="design.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>Welcome <%= session.getAttribute("email" ) %>
<h1>To See Course list click</h1>
<form action="viewCourse" method="get" class="formContainer">

<input type="submit" name="Show courses"> 
</form>
<h1>To enroll course:<br></h1>
<form action="enroll" method="post" class="formContainer">
<p></p>
course_id<input type="number" name="course_id"><br>
<input type="submit" name="Enroll"><br>
</form>
</body>
</html>