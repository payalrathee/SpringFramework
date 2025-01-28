<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error</title>

<style>
	body {
		margin-top: 20vh;
	    height: 100vh;
	    background: black;
	    display: flex;
	    flex-direction:column;
	    gap:15px;
	    color: white;
	    text-align: center;
	    
	}
	a {
		text-decoration: none;
		color: white;
	}
	.error_head {
		font-size: 30px;
		color: red;
	}
	.home_btn {
	    background: brown;
	    width: 10%;
	    align-self: center;
	    color: white;
	    padding: 10px;
	    border-radius: 10px;

	}
	.home_btn:hover {
	    background: #a05151;
	}
</style>
</head>
<body>


	<div class="error_head">500<br>Oops! Something went wrong</div>
	<div>Please try again later</div>
	<div class="home_btn"><a href="<c:url value='/' />">Home page</a></div>


</body>
</html>