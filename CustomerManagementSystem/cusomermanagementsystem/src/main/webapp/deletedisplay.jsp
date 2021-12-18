<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Removed Customer Details</title>
<link rel="stylesheet" href="index.css">
<style>
table {
	box-sizing: border-box;
	border-collapse: collapse;
	width: 100%;
}

th {
	color: white;
	background: #007474;
}

th, td {
	text-align: left;
	padding: 3px;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}
</style>
</head>
<body>

	<div class="header">
		<header>
			<h2>Data From Remove Page</h2>
		</header>
	</div>
	<div class="topnav">
		<a class="active" href="home">Home</a> <a href="save">Add Customer</a>
		<a href="search">Search Customer</a> <a href="delete">Delete
			Customer</a> <a href="update">Update Customer</a>


	</div>

	<div style="margin-top: 40px; overflow-x: scroll;">
			<table>
				<tr>
					<th>Customer Id</th>

				</tr>

				<tr>
					<td>${customer.customerId}</td>

				</tr>
			</table>
	</div>

	<br>
	<center><h2>Customer with the above id is deleted from Database</h2></center>
	<br>
</body>
</html>