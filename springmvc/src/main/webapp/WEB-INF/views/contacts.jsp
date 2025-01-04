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
/* General Styles */
body {
	font-family: 'Arial', sans-serif;
	margin: 0;
	padding: 0;
	background-color: #f9f9f9;
	color: #333;
}

/* Header Styles */
h1 {
	color: #004d99;
	text-align: center;
	margin: 20px 0;
	font-size: 2.5em;
}

div {
	padding: 20px;
	margin: 50px auto;
	max-width: 90%;
	background: #fff;
	box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
	border-radius: 10px;
	text-align: center;
}

/* Table Styles */
table {
	width: 100%;
	border-collapse: collapse;
	margin: 20px 0;
	font-size: 1em;
	color: #555;
}

table th, table td {
	padding: 12px 15px;
	text-align: left;
	border: 1px solid #ddd;
}

table th {
	background-color: #004d99;
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

/* Link Styles */
a {
	color: #004d99;
	text-decoration: none;
	font-weight: bold;
	transition: color 0.3s, transform 0.3s;
}

a:hover {
	color: #ffcc00;
	text-decoration: underline;
	transform: scale(1.1);
}

/* Responsive Design */
@media ( max-width : 768px) {
	table {
		font-size: 14px;
	}
	table th, table td {
		padding: 10px;
	}
	h1 {
		font-size: 2em;
	}
	div {
		max-width: 95%;
	}
}

@media ( max-width : 480px) {
	h1 {
		font-size: 1.8em;
	}
	div {
		max-width: 100%;
		padding: 15px;
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
		<a href="./home">HOME</a>
	</div>
</body>
</html>