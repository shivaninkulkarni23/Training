<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="design.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Course</title>
</head>
<body>
Welcome <%= session.getAttribute("email" ) %><br>
<form action="updatecourse" method="post" class="formContainer"><br>
What to update?<br>
<p></p>
Course Id:<input type="number"  name="course_id"><br>
Course Name:<input type="text" name="c_name"><br>
Course Description:<input type="text" name="c_desp"><br>
Course Fees:<input type="text" name="c_fees"><br>
Course Resource:<input type="text" name="c_resource"><br>
<input type="submit" name="submit">
</form>
</body>
</html>