<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form action="" method="post">
			<table border="1px solid">
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
					<td><input type="number" name="mobile"></td>
				</tr>
				<tr>
					<td>Work</td>
					<td><input type="number" name="work"></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td rowspan="3"><input type="radio" name="gender" value="MALE">
						<input type="radio" name="gender" value="FEMALE"> <input
						type="radio" name="gender" value="OTHERS"></td>
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
			<input type="submit" value="ADD">
		</form>
	</div>
</body>
</html>