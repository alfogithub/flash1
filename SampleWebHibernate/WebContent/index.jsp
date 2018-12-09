<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> Great ! I have created first Java Server Pages ....</h1>

	<%= new java.util.Date() %>
	
	<form action="studentDetails" method="POST">
		Please Enter your Student ID: <br/>
		<input type="text" name="studentID" size="50">
		
		<br/><br/>
		
		<input type="submit" value="Get Student Details">
		
	</form>
	
</body>
</html>