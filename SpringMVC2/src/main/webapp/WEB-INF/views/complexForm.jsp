<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!doctype html>
<html lang="en">

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
	<form class="container mt-5" method="post" action="formHandler">
		<c:if test="${errorResult.hasErrors() }">
			<div class="alert alert-danger" role="alert">
				<form:errors path="stdnt.*"/>
			</div>
		</c:if>
		<div class="form-group">
			<label for="exampleFormControlInput0">Name</label> <input type="text"
				class="form-control" id="exampleFormControlInput0"
				placeholder="name" name="name">
		</div>
		<div class="form-group">
			<label for="exampleFormControlInput1">Email address</label> <input
				type="email" class="form-control" id="exampleFormControlInput1"
				placeholder="name@example.com" name="email">
		</div>
		<div class="form-group">
			<label for="exampleFormControlInput2">Password</label> <input
				type="password" class="form-control" id="exampleFormControlInput2"
				placeholder="Password" name="password">
		</div>
		<div class="form-group">
			<label for="exampleFormControlInput2">Gender</label>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio1" name="gender" value="male"
					class="custom-control-input"> <label
					class="custom-control-label" for="customRadio1">Male</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio2" name="gender" value="female"
					class="custom-control-input"> <label
					class="custom-control-label" for="customRadio2">Female</label>
			</div>
		</div>
		<div class="form-group">
			<label for="exampleFormControlInput9">DOB</label> <input type="text"
				class="form-control" id="exampleFormControlInput9"
				placeholder="dd/mm/yyyy" name="dob">
		</div>
		<div class="form-group">
			<label for="exampleFormControlSelect1">Select Degree</label> <select
				class="form-control" id="exampleFormControlSelect1" name="degree">
				<option>BSc</option>
				<option>BTech</option>
				<option>BCom</option>
				<option>BA</option>
				<option>BEd</option>
			</select>
		</div>
		<div class="form-group">
			<label for="exampleFormControlSelect2">Skills</label> <select
				multiple class="form-control" id="exampleFormControlSelect2"
				name="skills">
				<option>Spring Boot</option>
				<option>Django</option>
				<option>MySQL</option>
				<option>ReactJS</option>
				<option>NodeJS</option>
			</select>
		</div>

		<div class="custom-control custom-checkbox form-group">
			<input type="checkbox" class="custom-control-input" id="customCheck1"
				name="type" value="new"> <label class="custom-control-label"
				for="customCheck1">New Student</label>
		</div>
		<div class="form-group">
			<label>Address</label><br> <label for="exampleFormControlInput3">City</label>
			<input type="text" class="form-control" id="exampleFormControlInput3"
				placeholder="City" name="address.city"> <label
				for="exampleFormControlInput4">State</label> <input type="text"
				class="form-control" id="exampleFormControlInput4"
				placeholder="State" name="address.state"> <label
				for="exampleFormControlInput5">Country</label> <input type="text"
				class="form-control" id="exampleFormControlInput5"
				placeholder="Country" name="address.country"> <label
				for="exampleFormControlInput6">Postal Code</label> <input
				type="text" class="form-control" id="exampleFormControlInput6"
				placeholder="Postal Code" name="address.pincode">
		</div>

		<div class="form-group">
			<label for="exampleFormControlTextarea2">Comments</label>
			<textarea class="form-control" id="exampleFormControlTextarea2"
				rows="3" name="comments"></textarea>
		</div>
		<div class="form-group">
			<input type="submit" value="submit" class="btn-outline-primary" />
		</div>
	</form>
</body>

</html>