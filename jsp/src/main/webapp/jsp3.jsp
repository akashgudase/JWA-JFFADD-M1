<%@page import="com.jspiders.jsp.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	@SuppressWarnings("unchecked")
	List<User> users = (List<User>) request.getAttribute("users");
	%>
	<div align="center">
		<table border="1px solid">
			<tr>
				<th>Username</th>
				<th>Password</th>
			</tr>
			<%
			for (User user : users) {
			%>
			<tr>
				<td><%=user.getUsername()%></td>
				<td><%=user.getPassword()%></td>
			</tr>
			<%
			}
			%>
		</table>
	</div>
</body>
</html>