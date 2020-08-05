<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center">
<jsp:include page="header.jsp" />
	<hr />
	<jsp:include page="menu.jsp" />

<table border=1 align="center">
<tr>
<th>Origin</th>
<th>Destination</th>
<th>Date</th>
<th>Time</th>
<th>Fare</th>
</tr>
<tr>
	<td>DELHI</td>
	<td>CHENNAI</td>
	<td>2020-08-21</td>
	<td>10:15</td>
	<td>5000</td>
</tr>
</table><br><br>
No.of passengers: <input type="text" name="passengerCount"><br><br>
	<div align="center">
		<form action="bookFlight" method="post">
		<b>Passenger list</b><br><br>
			First Name: <input type="text" name="firtsName">
			Last Name: <input type="text" name="lastName">
			Mobile number: <input type="number" name="mobileNumber">
			E-mail: <input type="email" name="eMail"><br><br>
			First Name: <input type="text" name="firtsName">
			Last Name: <input type="text" name="lastName">
			Mobile number: <input type="number" name="mobileNumber">
			E-mail: <input type="email" name="eMail"><br><br>
			<input type="submit" value= "Book Flight" style="background-color: #005599;color: white">
		</form><br>
	</div>
	<!--h3 style="background-color: #47b44f"> Flight booked</h3>
	<br><br>
	<table border=1 align="center">
	<tr>
	<th>Origin</th>
	<th>Destination</th>
	<th>Date</th>
	<th>Time</th>
	<th>No.of Passenger</th>
	<th>Total fare</th>
	</tr>
	<tr>
		<td>DELHI</td>
		<td>CHENNAI</td>
		<td>2020-08-21</td>
		<td>10:15</td>
		<td>2</td>
		<td>10000</td>
	</tr>
	</table><br><br>
	<h3>Booking Info</h3>
	<table border=1 align="center">
	<tr>
	<th>Booking Id</th>
	<th>Origin</th>
	<th>Destination</th>
	<th>Date</th>
	<th>Time</th>
	<th>No.of Passenger</th>
	</tr>
	<tr>
		<td>103</td>
		<td>DELHI</td>
		<td>CHENNAI</td>
		<td>2020-08-21</td>
		<td>10:15</td>
		<td>2</td>
	</tr>
	</table><br><br-->
</body>
</html>