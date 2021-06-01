<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script>
function validate(evt) {
	  var theEvent = evt || window.event;

	  // Handle paste
	  if (theEvent.type === 'paste') {
	      key = event.clipboardData.getData('text/plain');
	  } else {
	  // Handle key press
	      var key = theEvent.keyCode || theEvent.which;
	      key = String.fromCharCode(key);
	  }
	  var regex = /[0-9]|\./;
	  if( !regex.test(key) ) {
	    theEvent.returnValue = false;
	    if(theEvent.preventDefault) theEvent.preventDefault();
	  }
	}
</script>
<link href="default.css" media="all" rel="stylesheet" />
<style>
    /* Define custom CSS by the user here */
    body{
        background-color: lightblue;
    }

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration page</title>
</style>
</head>
<body>
<div align ="center">
<h1 style="background-color:white;"><font color="Blue" face="courier" size="5"><b>USER REGISTRATION FORM</b></font></h1>
<form id="form1" name="form1" action="Register" method="post">
<table>
<tr><td>User Name: </td><td><input type="text" name="uname" required autocomplete="off"></td></tr>
<tr><td>Password: </td><td><input type="password" name="password" required></td></tr>
<tr><td>Email: </td><td><input type="email" name="email" required autocomplete="off"></td></tr>
<tr><td><label for="Phone">Phone: </label></td>
<td><input type="text" name="phone" id="phone" placeholder="10 Digit Phone Number" onkeypress='validate(event)' required autocomplete="off" /></td></tr>
<tr><td><br></td></tr>
<tr><td></td><td><input type="submit" value="REGISTER"/></td></tr>
</table>
</form>
</div>
</body>
</html>