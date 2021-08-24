<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="design.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ViewCourse</title>
</head>
<body>
<h1>Course Details</h1>
Welcome <%= session.getAttribute("email" ) %>
<form action="course" method="post" class="formContainer">
<p></p>
Course Id:<input type="number"  name="course_id"><br>
Course Name:<input type="text" name="c_name"><br>
Course Description:<input type="text" name="c_desp"><br>
Course Fees:<input type="text" name="c_fees"><br>
Course Resource:<input type="text" name="c_resource"><br>
<input type="submit" value="submit"><br>
<input type="reset" value="reset"><br>
</form>
</body>
</html>