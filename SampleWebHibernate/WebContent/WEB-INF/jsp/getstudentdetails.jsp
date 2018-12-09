<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>One Student Detail</title>
</head>
<body>


<h1> Student Information System</h1>

<h3>Here is the student details you requested</h3>

Student ID : ${studentDetails.id} <br/>
Student First Name : ${studentDetails.fname} <br/>
Student Last Name : ${studentDetails.lname} <br/>

<br/>
<br/>

<form action="studentslist.jsp" method="get">
	<input type = "submit" value = "go back to the students List ">
</form>


</body>
</html>