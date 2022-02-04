<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>

	<table>
		<thead>
			<tr>
				<td>ID</td>
				<td>First Name</td>
				<td>Last Name</td>
				<td>Email</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${customers}" var="item">
				<tr>
					<td>${item.getId()}</td>
					<td>${item.getFirstName()}</td>
					<td>${item.getLastName()}</td>
					<td>${item.getEmail()}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>