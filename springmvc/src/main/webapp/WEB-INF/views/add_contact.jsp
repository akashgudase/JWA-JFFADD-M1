<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add contact page</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f9f9f9;
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.form-container {
	background: #ffffff;
	border-radius: 8px;
	box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
	padding: 20px 30px;
	width: 400px;
}

.form-container h2 {
	text-align: center;
	margin-bottom: 20px;
	color: #333333;
}

table {
	width: 100%;
	border-spacing: 10px;
}

td {
	color: #555555;
	font-size: 14px;
	vertical-align: middle;
}

input[type="text"], input[type="email"], input[type="number"], input[type="radio"],
	input[type="submit"] {
	width: 100%;
	padding: 8px;
	border: 1px solid #cccccc;
	border-radius: 4px;
	font-size: 14px;
	margin-top: 5px;
	box-sizing: border-box;
}

input[type="radio"] {
	width: auto;
}

label {
	margin-left: 5px;
	font-size: 14px;
	vertical-align: middle;
}

input[type="submit"] {
	background-color: #007BFF;
	color: white;
	border: none;
	cursor: pointer;
	transition: background-color 0.3s;
}

input[type="submit"]:hover {
	background-color: #0056b3;
}

tr td:first-child {
	width: 30%;
	font-weight: bold;
	vertical-align: middle;
}

tr td:last-child {
	width: 70%;
}

.form-container div {
	text-align: center;
	margin-top: 20px;
}
</style>
</head>
<body>
	<div class="form-container">
		<h2>Contact Details</h2>
		<form action="./add-contact" method="post">
			<table>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="first_name"></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="last_name"></td>
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
					<td>Work</td>
					<td><input type="text" name="work"></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><input type="radio" name="gender" value="MALE"><label>MALE</label>
						<input type="radio" name="gender" value="FEMALE"><label>FEMALE</label>
						<input type="radio" name="gender" value="OTHERS"><label>OTHERS</label>
					</td>
				</tr>
				<tr>
					<td>DOB</td>
					<td><input type="text" name="dob"></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td>Website</td>
					<td><input type="text" name="website"></td>
				</tr>
			</table>
			<div>
				<input type="submit" value="ADD">
			</div>
		</form>
	</div>
</body>
</html>