<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
<style type="text/css">
/* General Styles */
body {
	font-family: 'Arial', sans-serif;
	margin: 0;
	padding: 0;
	background-color: #f9f9f9;
	color: #333;
}

/* Navigation Styles */
nav {
	background-color: #004d99;
	padding: 10px 20px;
	display: flex;
	justify-content: center;
	box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);
}

nav a {
	color: #fff;
	text-decoration: none;
	margin: 0 15px;
	font-size: 16px;
	font-weight: bold;
	transition: color 0.3s, transform 0.3s;
}

nav a:hover {
	color: #ffcc00;
	transform: scale(1.1);
}

/* Header Styles */
div[align="center"] {
	margin: 50px auto;
	padding: 20px;
	text-align: center;
	max-width: 800px;
	background-color: #fff;
	border-radius: 10px;
	box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
}

h1 {
	color: #004d99;
	font-size: 2.5em;
	margin-bottom: 20px;
}

p {
	font-size: 1.2em;
	line-height: 1.6;
	color: #555;
}

/* Responsive Design */
@media ( max-width : 768px) {
	nav {
		flex-direction: column;
		align-items: center;
	}
	nav a {
		margin: 10px 0;
		font-size: 14px;
	}
	h1 {
		font-size: 2em;
	}
	p {
		font-size: 1em;
	}
}

@media ( max-width : 480px) {
	h1 {
		font-size: 1.8em;
	}
	p {
		font-size: 0.9em;
	}
}
</style>
</head>
<body>
	<nav>
		<a href="./add-contact-page">ADD CONTACT</a> <a href="./contacts">ALL
			CONTACTS</a> <a href="">EDIT USER</a> <a href="">DELETE USER</a><a
			href="">LOG OUT</a>
	</nav>
	<div align="center">
		<h1>WELCOME TO CONTACT MANAGER</h1>
		<p>Contact Manager is a user-friendly platform that allows you to
			create and manage your own contacts effortlessly. With customizable
			templates and an intuitive interface. Developed by JWA-JFFADD-M1
			group of developers with a vision to empower every user in every part
			of India to benefit from digital India and make in India revolution.</p>
	</div>
</body>
</html>