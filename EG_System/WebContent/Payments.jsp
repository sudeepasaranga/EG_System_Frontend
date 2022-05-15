<%@page import="com.Payment" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Service</title>
	
<link rel="stylesheet" href="Views/bootstrap.min.css">
<link rel="stylesheet" href="Views/payments.css">
<script src="Components/jquery-3.2.1.js"></script>
<script src="Components/payments.js"></script>

</head>
<body style="background-image:url(https://images.pexels.com/photos/4862892/pexels-photo-4862892.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500)">
<div class="container">
 <div class="row">
 <div class="col-6">

<h1><b>Payment Management</b></h1>
<h4>Add New Payment Details</h4>
<form id="formPayments" name="formPayments" method="post" enctype="multipart/form-data">
	<h6>Date Of Payment</h6>
	<input id="dateOfpay" name="dateOfpay" type="text" class="form-control form-control-sm" placeholder="Enter date of payment">
	<br> <h6>Payment Method</h6>
	<input id="payMethod" name="payMethod" type="text" class="form-control form-control-sm" placeholder="Enter payment method">
	<br> <h6>CardHolder Name</h6>
	<input id="cardHolder" name="cardHolder" type="text" class="form-control form-control-sm" placeholder="Enter cardholder name">
	<br> <h6>Card Number</h6>
	<input id="cardNo" name="cardNo" type="text" class="form-control form-control-sm" placeholder="Enter card number">
	<br> <h6>CVV</h6>
	<input id="cvv" name="cvv" type="text" class="form-control form-control-sm" placeholder="CVV">
	<br> <h6>Expiration Date</h6>
	<input id="expDate" name="expDate" type="text" class="form-control form-control-sm" placeholder="Expiration date">
	<br> <h6>Total Amount</h6>
	<input id="totamount" name="totamount" type="text" class="form-control form-control-sm" placeholder="Total amount">
	<br>
	<br>
	<input id="btnSave" name="btnSave" type="button" value="Save" class="btn btn-primary">
	<input type="hidden" id="hidPaymentIdSave" name="hidPaymentIdSave" value="">
</form>
<br>
<div id="alertSuccess" class="alert alert-success"></div>
<div id="alertError" class="alert alert-danger"></div>

<br>
<h4>All Payments Details</h4>
<div id="divPaymentsGrid">
	 <%
	 	Payment payment = new Payment();
	 	out.print(payment.readPayment());
	 %>
</div>

</div>
</div>
</div>
</body>
</html>
