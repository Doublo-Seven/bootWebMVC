<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
    
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
	<h3 align = "center">Hi Dinesh</h3>
	<br>
	<div align="center">
		<form action="searchSpecific" method="post">
			Date of Flight: <input type="date" name="flightDate" >
			Origin: <input type="text" name="origin" >
			Destination: <input type="text" name="destination" >
			<input type="submit" value= Search>
		</form><br>
	<a href = "/Login">I want to sign in for booking flight</a><br><br>
	<a href = "/searchFlight">I just want to search flights</a>
	</div><br>
<h4 align="center">Search Results (in 24H format)</h4>
<table border="1" align="center">
	
		<c:forEach items="${flights1}" var="flight">

			<tr>

				<td>${flight.flightNumber}</td>
				<td>${flight.origin}</td>
				<td>${flight.destination}</td>
				<td>${flight.flightDate}</td>
				<td>${flight.flightTime}</td>
				<td><button style="background-color: #005599; color: white">Book</button></td>

			</tr>

		</c:forEach>

	</table>
	<br><br>
</body>
</html>