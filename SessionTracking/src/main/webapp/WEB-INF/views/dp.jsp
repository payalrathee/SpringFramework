<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#dp
{
	position:absolute;
	top:10px;
	right:10px;
	height:50px;
	width:50px;
	border-radius:25px;
}
</style>
</head>
<body>
<img id="dp" src="<c:url value="${dp }"/>"/>
</body>
</html>