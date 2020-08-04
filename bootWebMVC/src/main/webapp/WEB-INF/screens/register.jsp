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
		<form action="registerUser" method="post">
			First Name: <input type="text" name="firstName" required="required"><br><br>
			Last Name: <input type="text" name="lastName" required="required"><br><br>
			Mobile Number: <input type="number" name="mobileNumber" required="required"><br><br>
			Gender: <input type="radio" name="gender" value="Male" required="required">Male      <input type="radio" name="gender" value="Female" required="required">Female<br><br>
			UserName: <input type="text" name="userName" required="required"><br><br>
			Password: <input type="password" name="password" required="required"><br><br>
			<input type="submit" value= Register>
		</form><br>
	<a href = "/Login">I want to sign in for booking flight</a><br><br>
	<a href = "/searchFlight">I just want to search flights</a>
	</div>
</body>
</html>