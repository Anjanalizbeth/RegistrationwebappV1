<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
    /* Define custom CSS by the user here */
    body{
        background-color: lightblue;
    }
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</style>
</head>
<body>
<div align ="center">
<h1 style="background-color:white;"><font color="Blue" face="courier" size="5">USER LOGIN FORM</font></h1>
<form action ="login" method="post">
<table>
<tr><td>User Name: </td><td><input type="text" name="Uname" required></td></tr>
<tr><td>Password: </td><td><input type="password" name="password" required></td></tr>
<tr><td><br></td></tr>
<tr><td></td><td><input type="submit" value="Submit"></td></tr>
<tr><td><br></td></tr>
</table>
<font color="Blue" face="Arial" size="2"><i>Not a registered member? Click here to </i><a href="memberregistration.jsp"> REGISTER</a></font>
</form>
</div>
</body>
</html>