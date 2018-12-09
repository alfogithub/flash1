<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>New Spring Student</h3>
<form:form action="addspringstudent.jsp" method="GET" modelAttribute="student">
	<form:hidden path="id"/>
	Student First Name : <form:input path="fname"/><br/>
	Student Last Name : <form:input path="lname"/><br/>
	Phone: <form:input path="phone"/><br/>
	Address1 : <form:input path="address1"/> <br/>
	Address2 : <form:input path="address2"/> <br/>
	City : <form:input path="city"/> <br/>
	Zip : <form:input path="zip"/> <br/>
	State : <form:input path="state"/> <br/>
	Country : <form:input path="country"/><br/>
	<input type="submit" value="Save"/>
</form:form>

</body>
</html>