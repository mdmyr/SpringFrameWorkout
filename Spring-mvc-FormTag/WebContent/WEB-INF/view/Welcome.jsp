<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello welcome to the main page.
Please click here to move to Student form submission. 

<a>
<form action="validateStudent" method="get">
<input type="submit" value="Submit a Student">
</form>


<form action="validateStudent" method="GET">
  <label for="fname">First name:</label>
  <input type="text" id="fname" name="fname"><br><br>
  <label for="lname">Last name:</label>
  <input type="text" id="lname" name="lname"><br><br>
  <input type="submit" value="Validate">
		
	</form>

</a>


</body>
</html>