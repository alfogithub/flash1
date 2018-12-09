<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Students List</title>
</head>
<body>
	<h1> Students List</h1>
	Id       |     First Name		|		Last Name | <br/>
	----------------------------------------------------<br/>
	
	<c:forEach var="student" items="${studentsList}">
		${student.id}	|	${student.fname}	|	${student.lname} </br>
	</c:forEach>
	
<br/>
Above should display the list of students in the system...

<form action="newspringstudent.jsp" method="get">
	<input type="submit" value="Add a new Spring Student">
</form>

</body>
</html>