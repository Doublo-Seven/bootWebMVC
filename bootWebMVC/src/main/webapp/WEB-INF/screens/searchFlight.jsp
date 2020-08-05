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
		Origin: <input type="text" name="origin" required="required">
		Destination: <input type="text" name="destination" required="required">
		<input type="submit" value= Search>
	</form><br>
	<a href = "/Login">I want to sign in for booking flight</a><br><br>
	<a href = "/searchFlight">I just want to search flights</a>
	</div>
<h4 align="center">List of flights (in 24H clock)</h4>
<table border="1" align="center">

		<tr>

			<th>Flight Number</th>
			<th>Origin</th>
			<th>Destination</th>
			<th>Flight Date</th>
			<th>Flight Time</th>
		</tr>

		<c:forEach items="${flights}" var="flight">

			<tr>

				<td>${flight.flightNumber}</td>
				<td>${flight.origin}</td>
				<td>${flight.destination}</td>
				<td>${flight.flightDate}</td>
				<td>${flight.flightTime}</td>
				<td><button style="background-color: #005599;color: white">Book</button></td>

			</tr>

		</c:forEach>


	</table>
	<br><br>

</body>
</html>