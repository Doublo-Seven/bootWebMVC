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
		<form action="checkCred" method="post">
			UserName: <input type="text" name="userName"><br><br>
			Password: <input type="password" name="password"><br><br>
			<input type="submit" value= Login>
		</form><br>
	<a href = "/register">I want to sign up for booking flight</a><br><br>
	<a href = "/searchFlight">I just want to search flights</a>
	</div>
</body>
</html>