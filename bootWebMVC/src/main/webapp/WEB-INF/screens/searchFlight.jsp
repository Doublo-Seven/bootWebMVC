<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
		<form action="searchSpecific" method="post">
			Date of Flight: <input type="date" name="flightDate" required="required"><br><br>
			Origin: <input type="text" name="origin" required="required"><br><br>
			Destination: <input type="text" name="destination" required="required"><br><br>
			<input type="submit" value= Search>
		</form><br>
	<a href = "/Login">I want to sign in for booking flight</a><br><br>
	<a href = "/searchFlight">I just want to search flights</a>
	</div>
</body>
</html>