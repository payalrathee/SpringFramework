<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
        integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <title>Search</title>
</head>

<body>
    <div class="card container mt-5 p-5 shadow p-3 mb-5 bg-body rounded">
    	<form class="container " method="post" action="searchHandler">
        <div class="form-group">
            <label for="exampleFormControlInput0">Search</label>
            <input type="text" class="form-control" id="exampleFormControlInput0" placeholder="search here" name="query">
        </div>
     	<div class="form-group">
     		<input type="submit" value="Search" class="btn-success"/>
     	</div>
    </form>
    </div>
</body>

</html>