<%@page import="com.jspiders.springmvc.dto.ContactDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contacts page</title>
<style type="text/css">
/* General styling */
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
	background-color: #f4f4f9;
	color: #333;
}

h1 {
	color: #444;
	text-align: center;
	margin: 20px 0;
}

div {
	padding: 20px;
	margin: 0 auto;
	max-width: 1200px;
	background: #fff;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
	border-radius: 8px;
}

table {
	width: 100%;
	border-collapse: collapse;
	margin: 20px 0;
}

table th, table td {
	padding: 12px 15px;
	text-align: left;
	border: 1px solid #ddd;
}

table th {
	background-color: #007BFF;
	color: #fff;
	font-weight: bold;
	text-transform: uppercase;
}

table tr:nth-child(even) {
	background-color: #f9f9f9;
}

table tr:hover {
	background-color: #f1f1f1;
}

a {
	color: #007BFF;
	text-decoration: none;
	font-weight: bold;
}

a:hover {
	text-decoration: underline;
}

/* Responsive styling */
@media ( max-width : 768px) {
	table {
		font-size: 14px;
	}
	table th, table td {
		padding: 10px;
	}
}
</style>
</head>
<body>
	<%
	@SuppressWarnings("unchecked")
	List<ContactDTO> contacts = (List<ContactDTO>) request.getAttribute("contacts");
	if (contacts != null) {
	%>
	<div align="center">
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Mobile</th>
				<th>Work</th>
				<th>Gender</th>
				<th>DOB</th>
				<th>Address</th>
				<th>Website</th>
				<th colspan="2">Action</th>
			</tr>
			<%
			for (ContactDTO contact : contacts) {
			%>
			<tr>
				<td><%=contact.getFirstName()%></td>
				<td><%=contact.getLastName()%></td>
				<td><%=contact.getEmail()%></td>
				<td><%=contact.getMobile()%></td>
				<td><%=contact.getWork()%></td>
				<td><%=contact.getGender()%></td>
				<td><%=contact.getDob()%></td>
				<td><%=contact.getAddress()%></td>
				<td><%=contact.getWebsite()%></td>
				<td><a href="./edit-contact?id=<%=contact.getId()%>">Edit</a></td>
				<td><a href="./delete-contact?id=<%=contact.getId()%>">Delete</a></td>
			</tr>
			<%
			}
			%>
		</table>
	</div>
	<%
	}
	String message = (String) request.getAttribute("message");
	if (message != null) {
	%>
	<h1><%=message%>
	</h1>
	<%
	}
	%>
</body>
</html>