<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="html">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=0.5">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://kit.fontawesome.com/yourcode.js"></script>
<script src="taskscript.js"></script>
<title>Check Availiablity</title>
</head>
<body>

	<h2 id="product_title" class="text-center text-primary text-decoration-underline mb-4"></h2>
	<div class="container mt-4 ms-5 me-0">
		<div class="d-flex ">
			<div id="product_img"></div>
			<div class="ms-4">
				<span class="h3 p-3 mb-3 text-info">Availability:</span><span id="product_availability" class="h3 p-3 text-danger"></span><br>
				<span class="h3 p-3 mb-3 text-info">Product Price:</span><span id="product_price" class="h3 p-1"></span><span id="product_delcharge" class="h5 text-success"></span><br>
				<span class="h3 p-3 text-info">Description:</span><p id="product_desc" class="h5 ps-3"></p>
		</div>
		</div>
		
	</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>