<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="design.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome <%= session.getAttribute("email" ) %>
<h1>You can do..</h1>
<p></p>
<form class="formContainer">
<a href="feedback.jsp">Feedback</a><br>
<a href="contact.jsp">Contact</a><br>
<a href="viewCourse.jsp">View Course List</a><br>
<a href="enrollCourse.jsp">Course Enroll</a><br>
<a href="updateProfile.jsp">Update Profile</a><br>
</form>
<form  action="logout.jsp">
    <a href="logout.jsp">LogOut</a>
</form>
</body>
</html>