<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student form</title>
</head>
<body>
<b>Please enter the student details in the  below and submit for validation</b>
<hr>

<hr>

<form:form action="studentValidate" modelAttribute="student"> 

first name : <form:input path="firstname"/> 
<br>
last  name : <form:input path="lastname"/>
<br>
location name : <form:input path="location"/>

<input type="submit" value="submit">
</form:form>



</body>
</html>