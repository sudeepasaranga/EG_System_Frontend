
<%@page import="com.Complain"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

        
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complain Service Service</title>
<link rel="stylesheet" href="Views/bootstrap.min.css">
<link rel="stylesheet" href="Views/complains.css">
<script src="Components/jquery-3.2.1.js"></script>
<script src="Components/Complain.js"></script>

</head>
<body style="background-image:url(https://www.color-hex.com/palettes/37446.png)">

 <div class="container">
 <div class="row">
 <div class="col-6">

<h1><b>Complain Management</b></h1>
<form id="formComplains" name="formComplains" method="post" enctype="multipart/form-data">
    Customer Name:
	<input id="perName" name="perName" type="text" class="form-control form-control-sm">
	<br>  
	Customer Account Number:
	<input id="cAccNo" name="cAccNo" type="number" class="form-control form-control-sm">
	<br> 
	Complain Area:
	<input id="cArea" name="cArea" type="text" class="form-control form-control-sm">
	<br> 
    Phone Number:
    <input id="cPhone" name="cPhone" type="number" class="form-control form-control-sm">
	<br>
	Complain:
    <input id="comp" name="comp" type="text" class="form-control form-control-sm">
	<br>
	<br>
	<input id="btnSave" name="btnSave" type="button" value="Save" class="btn btn-primary">
	<input type="hidden" id="hidComplainIDSave" name="hidComplainIDSave" value="">
</form>
<br>
<div id="alertSuccess" class="alert alert-success"></div>
<div id="alertError" class="alert alert-danger"></div>

<br>
<div id="divComplainsGrid">
	 <%
	 	Complain complains = new Complain();
	 	out.print(complains.readComplains());
	 %>
</div>

</div>
</div>
</div>
</body>
</html>

    