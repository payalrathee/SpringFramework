<%@ page language="java" 
		 contentType="text/html; charset=ISO-8859-1"
		 pageEncoding="ISO-8859-1" 
		 isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Home</title>
	<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet"/>
</head>
<body>
	<div class="main">
	
		<div class="error">${loginError }</div>
		<div class="error">${registerError }</div>
		
		<input type="checkbox" id="chk" aria-hidden="true">
		<div class="signup">
			<form:form action="${pageContext.request.contextPath}/user/register" modelAttribute="user">
			
				<label for="chk" aria-hidden="true">Sign up</label> 
				
				<form:input path="username" placeholder="User name" required="true"/>
				<div class="warning"><form:errors path="username"/></div>
				
				<form:input path="email" type="email" placeholder="Email" required="true"/>
				<div class="warning"><form:errors path="email"/></div>
				
				<form:password path="password" placeholder="Password" required="true" minLength="8" maxLength="8"/>
				<div class="warning"><form:errors path="password"/></div>
				
				<button>Sign up</button>
				
			</form:form>
		</div>

		<div class="login">
			<form:form action="${pageContext.request.contextPath}/user/login" modelAttribute="user">
			
				<label for="chk" aria-hidden="true">Login</label> 
				
				<form:input path="username" placeholder="Username or password" required="true"/>
				
				<form:password path="password" placeholder="Password" required="true" minLength="8" maxLength="8"/>
				
				<button>Login</button>
				
			</form:form>
		</div>
	</div>
</body>
</html>