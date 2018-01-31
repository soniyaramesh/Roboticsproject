<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Robotics login page</title>

</head>
<body>
<h1> Robotics Project</h1>
<h2>Data streaming</h2> 
<form action="LoginServlet" method="post">
Email_id:<input type="email" name="email"><br><br>
Password:<input type="password" name="password"><br><br>
<input type="submit" value="Login">

</form>
</body>
</html>