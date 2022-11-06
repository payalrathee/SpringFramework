<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<title>Form</title>
</head>

<body>
${filename }
<img src="<c:url value="/resources/images/${filename }"/>"/>
	<form class="container mt-5" method="post" action="uploadHandler" enctype="multipart/form-data">
		<div class="form-group">
			<input type="file" name="file">
		</div>
		<div class="form-group">
			<input type="submit" value="submit" class="btn-outline-primary" />
		</div>
	</form>
</body>