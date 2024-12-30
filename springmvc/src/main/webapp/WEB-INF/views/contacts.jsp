<%@page import="com.jspiders.springmvc.dto.ContactDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contacts page</title>
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
				<td><a href="">Edit</a></td>
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