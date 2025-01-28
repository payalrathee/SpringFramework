<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link href="<c:url value='/resources/css/home.css' />" rel="stylesheet" />

</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">My Site</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">

				<li class="nav-item active"><a class="nav-link"
					href="<c:url value='/home' />">Home <span class="sr-only">(current)</span></a>
				</li>

				<li class="nav-item"><a class="nav-link"
					href="<c:url value='/page' />">My page</a></li>
			</ul>
		</div>
		
		<c:choose>
			<c:when test="${not empty sessionScope.user }">
				<div class="profile_img"><a class="nav-link"
					href="<c:url value='/logout' />"><img
						src="https://play-lh.googleusercontent.com/jInS55DYPnTZq8GpylyLmK2L2cDmUoahVacfN_Js_TsOkBEoizKmAl5-p8iFeLiNjtE=w526-h296-rw" /></a>
				</div>
			</c:when>
			<c:otherwise>
				<div class="profile_img"><a class="nav-link"
					href="<c:url value='/' />">Sign Up</a>
				</div>
			</c:otherwise>
		</c:choose>
	</nav>

</body>
</html>