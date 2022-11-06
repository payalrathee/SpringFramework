<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
	<div class="container">
		<h1>${heading }</h1>
		<h4>${desc }</h4>
	</div>
<h3>You are successfully registered!</h3>
Email : ${user.email}<br>
Password : ${user.pwd}
</body>
</html>