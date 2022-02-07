<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="${ pageContext.request.contextPath }/resources/css/style.css">
<link rel="stylesheet"
	href="${ pageContext.request.contextPath }/resources/css/add-customer-style.css">

<title>Insert title here</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	<div id="container">
		<h3>Save Customer</h3>
		<form:form action="saveCustomer" method="POST"
			modelAttribute="customer">
			<table>
				<tbody>
					<tr>
						<td><label>First Name: </label></td>
						<td><form:input path="firstName" /></td>
					</tr>
					<tr>
						<td><label>Last Name: </label></td>
						<td><form:input path="lastName" /></td>
					</tr>
					<tr>
						<td><label>Email: </label></td>
						<td><form:input path="email" /></td>
					</tr>
					<tr>
						<td><label> </label></td>
						<td><input class="save" type="submit" value="Save" /></td>
					</tr>

				</tbody>
			</table>
		</form:form>
		
		<div style="clear; both;"></div>
		<p>
		<a href="${ pageContext.request.contextPath }/customer/list">Back to Customer List</a>
		 </p>
		
	</div>
</body>
</html>




