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
<form action="updateprofile" method="get" class="formContainer">
Welcome <%= session.getAttribute("email" ) %><br>
<p></p>
User id:<input type="number" name="id"><br>
What to update?<br>
Address:<input type="text" name="address"><br>
email:<input type="text" name="email"><br>
name:<input type="text" name="name"><br>
password:<input type="text" name="password"><br>
phone_no:<input type="number" name="phone_no"><br>
reg_date:<input type="text" name="reg_date"><br>
upload_photo:<input type="text" name="upload_photo"><br>
<input type="submit" name="Update">
</form>
</body>
</html>