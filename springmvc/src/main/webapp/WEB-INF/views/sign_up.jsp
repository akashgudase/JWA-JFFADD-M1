<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add user page</title>
<style>
/* General Styles */
body {
	font-family: 'Arial', sans-serif;
	margin: 0;
	padding: 0;
	background-color: #f9f9f9;
	color: #333;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

/* Form Container Styles */
.form-container {
	background: #ffffff;
	border-radius: 10px;
	box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
	padding: 30px;
	width: 600px;
	text-align: center;
}

.form-container h2 {
	color: #004d99;
	margin-bottom: 20px;
	font-size: 1.8em;
}

/* Table Styles */
table {
	width: 100%;
	border-spacing: 10px;
	font-size: 1em;
	color: #555;
}

table td {
	vertical-align: middle;
}

tr td:first-child {
	width: 30%;
	font-weight: bold;
	color: #333;
	text-align: left;
}

tr td:last-child {
	width: 70%;
}

/* Input Styles */
input[type="text"], input[type="email"], input[type="number"], input[type="submit"]
	{
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
	font-size: 1em;
	margin-top: 5px;
	box-sizing: border-box;
}

input[type="radio"] {
	width: auto;
	margin-right: 5px;
}

tr td:last-child {
	display: flex;
	align-items: center;
	gap: 15px;
}

label {
	font-size: 1em;
	color: #555;
}

input[type="submit"] {
	background-color: #004d99;
	color: #fff;
	border: none;
	cursor: pointer;
	transition: background-color 0.3s, transform 0.3s;
	font-weight: bold;
}

input[type="submit"]:hover {
	background-color: #003366;
	transform: scale(1.05);
}

/* Responsive Design */
@media ( max-width : 768px) {
	.form-container {
		width: 90%;
		padding: 20px;
	}
	.form-container h2 {
		font-size: 1.5em;
	}
	table td {
		font-size: 0.9em;
	}
}

@media ( max-width : 480px) {
	.form-container h2 {
		font-size: 1.3em;
	}
	input[type="text"], input[type="email"], input[type="number"], input[type="radio"],
		input[type="submit"] {
		font-size: 0.9em;
	}
}
/* Password Input Styles */
input[type="password"] {
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
	font-size: 1em;
	margin-top: 5px;
	box-sizing: border-box;
	transition: border-color 0.3s, box-shadow 0.3s;
}

input[type="password"]:focus {
	border-color: #004d99;
	box-shadow: 0 0 5px rgba(0, 77, 153, 0.5);
	outline: none;
}

input[type="password"]:hover {
	border-color: #0066cc;
}

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
</style>
</head>
<body>
	<div class="form-container">
		<h2>User Details</h2>
		<form action="./add-user" method="post">
			<table>
				<tr>
					<td>Username</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>Mobile</td>
					<td><input type="text" name="mobile"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"></td>
				</tr>
			</table>
			<div>
				<input type="submit" value="Signup">
			</div>
		</form>
		<%
		String message = (String) request.getAttribute("message");
		if (message != null) {
		%>
		<h1><%=message%>
		</h1>
		<%
		}
		%>
		<h4>
			Already have an account then?<a href="./login-page">login</a>
		</h4>
	</div>
</body>
</html>