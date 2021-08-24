<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="design.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin</title>
</head>
<body>
Welcome <%= session.getAttribute("email" ) %><br>
You can do...<br>
<form action="viewuser" method="get" class="formContainer">
<p><a href="course.jsp">Add Course</a><br>
<a href="viewUsers.jsp">View Users</a><br>
<a href="viewcontact.jsp">View Contacts</a><br>
<a href="deleteUser.jsp">Delete User</a><br>
<a href="updateCourse.jsp">Update Course</a><br>
<form  action="logout.jsp">
    <a href="logout.jsp">LogOut</a>
</form>
</form>
</body>
</html>