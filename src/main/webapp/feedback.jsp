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
Welcome <%= session.getAttribute("email" ) %><br>
<h1>Give us your feedback..</h1>
<p></p>
<form action="feedback" method="post" class="formContainer">
User Id:<input type="number" name="user_id"><br>
Name:<input type="text" name="name"><br>
Email:<input type="text" name="email"><br>
Feedback id:<input type="number" name="f_id"><br>
Feedback:<input type="text" name="feedback"><br>
<input type="submit" name="sign up"> 
</form>
</body>
</html>