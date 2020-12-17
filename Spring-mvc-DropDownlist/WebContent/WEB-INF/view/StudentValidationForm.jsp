<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>Student Submission form</head>
<body>
<b> This is a simple submission form for the student</b>

<br>


<!-- This is the object needed to be created in the student class 
1. class need to created "Student"
2. class needed to validate the Student Form - StudentValidation
 -->
 
 <form:form action="ProcessStudentform" modelAttribute="Student">
 <br>
 First Name :<form:input path="firstName"/><br>
 Last Name  :<form:input path="lastName"/><br>
 Location   :<form:input path= "location"/><br>

 Radio button : 
<%--  java <form:radiobutton path="language" value="Java"/> --%>
 
 <br>			
 New Country Format:

	    <form:select path="country"> 
	     <form:options items="${countrylkp}" />
	    </form:select>

 	  
 copied radio button code.
 
 <form:radiobuttons path="Language" items="${programminglkp}"  />
 
 <br>
Check boxes  :

 Linux :<form:checkbox path="operatingSystems"  value="Linux"/>
 Windows :<form:checkbox path="operatingSystems"  value="WINDOWS"/>
 Mac :<form:checkbox path="operatingSystems"  value="MAC"/>
 
 <br>
 check boxes using java: 
 
 <ul>
 	<c:forEach var="temp" items="${Student.javaOperatingSystems }">
 		<li>  <form:checkbox path="javaOperatingSystems" value ="${temp} "/> ${temp}</li>
 		
 	</c:forEach>
 </ul>
 	

 	  
 <input type="Submit" value = "submit">
</form:form>

</body>
</html>