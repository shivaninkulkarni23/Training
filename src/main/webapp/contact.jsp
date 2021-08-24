<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="design.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>contact</title>
</head>
<body>Welcome <%= session.getAttribute("email" ) %>
<h1>Add your contact..
</h1>
<form action="contact" method="post" class="formContainer">
<p></p>
user id:<input type="number" name="user_id"><br>
Name:<input type="name=" name="name"><br>
Email:<input type="text" name="email"><br>
phone no:<input type="text" name="phone_no"><br>
Message:<input type="text" name="message"><br>
contact id:<input type="number" name="contact_id"><br>
<input type="submit" value="sign up"><br>
<input type="reset" value="reset"><br>
</form>
</body>
</html>