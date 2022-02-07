<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${ pageContext.request.contextPath }/resources/css/style.css">
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">

		<div id="content">
			<input type="button" class="add-button" value="Add Customer"
				onclick="window.location.href='showFormForAdd'; return false;">
			<table>
				<tr>
					<th>ID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
				<c:forEach items="${customers}" var="item">
					<tr>
						<td>${item.getId()}</td>
						<td>${item.getFirstName()}</td>
						<td>${item.getLastName()}</td>
						<td>${item.getEmail()}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>