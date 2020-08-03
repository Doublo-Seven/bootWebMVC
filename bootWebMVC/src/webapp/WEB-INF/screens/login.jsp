<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp" />
	<hr />
	<jsp:include page="menu.jsp" />


	<div align="center">
		<form:form>
			<form:input path="userName" />
			<br />
			<form:password path="password"/>
			<br />
			<input type="submit" value="Login">
		</form:form>
	<a href = "/register">I want to sign up for booking flight</a>
	<a href = "/searchFlights">I just want to search flights</a>
	</div>
</body>
</html>