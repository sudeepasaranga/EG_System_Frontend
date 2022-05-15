$(document).ready(function()
{
	$("#alertSuccess").hide();
	$("#alertError").hide();
});

//SAVE ============================================
$(document).on("click", "#btnSave", function(event)
{
	// Clear alerts---------------------
	 $("#alertSuccess").text("");
	 $("#alertSuccess").hide();
	 $("#alertError").text("");
	 $("#alertError").hide(); 
	 
	// Form validation-------------------
	 var status = validatePaymentForm();
	 if (status != true)
		 {
		  $("#alertError").text(status);
		  $("#alertError").show();
		  return;
	 }
	 //If status equals to true
	 var type = ($("#hidPaymentIdSave").val() == "") ? "POST" : "PUT";
	 var formData = new FormData($("#formPayments")[0]);
	 console.log(formData);
	 $.ajax(
	 {
		 url : "PaymentsAPI",
		 type : type,
		 data : formData,
		 enctype : "multipart/form-data",
		 complete : function(response, status)
		 {
			 onPaymentSaveComplete(response.responseText, status);
		 },
		 processData : false,
		 contentType :false
	 }); 
});

function onPaymentSaveComplete(response, status)
{
	if (status == "success")
	 {
		var resultSet = JSON.parse(response);
		if (resultSet.status.trim() == "success")
		{
			$("#alertSuccess").text("Successfully saved.");
			$("#alertSuccess").show();
			$("#divPaymentsGrid").html(resultSet.data);
		} else if (resultSet.status.trim() == "error")
		{
			 $("#alertError").text(resultSet.data);
			 $("#alertError").show();
		}
	 } else if (status == "error")
	 {
			 $("#alertError").text("Error while saving.");
			 $("#alertError").show();
	 } else
	 {
			 $("#alertError").text("Unknown error while saving..");
			 $("#alertError").show();
	 } 
	
	 $("#hidPaymentIdSave").val("");
	 $("#formPayments")[0].reset();
}

//UPDATE==========================================
$(document).on("click", ".btnUpdate", function(event)
{
	 $("#hidPaymentIdSave").val($(this).data("paymentid")); 
	 $("#dateOfpay").val($(this).closest("tr").find('td:eq(0)').text());
	 $("#payMethod").val($(this).closest("tr").find('td:eq(1)').text());
	 $("#cardHolder").val($(this).closest("tr").find("td:eq(2)").text());
	 $("#cardNo").val($(this).closest("tr").find('td:eq(3)').text());
	 $("#cvv").val($(this).closest("tr").find('td:eq(4)').text());
	 $("#expDate").val($(this).closest("tr").find('td:eq(5)').text());
	 $("#totamount").val($(this).closest("tr").find('td:eq(6)').text());
});

//client-model
function validatePaymentForm()
{
	// date of payment
	if ($("#dateOfpay").val().trim() == "")
	{
		return "Please fill Date Of Payment field.";
	}
	// payment method
	if ($("#payMethod").val().trim() == "")
	{
		return "Please fill Payment Method field.";
	}
	// cardHolder name
	if ($("#cardHolder").val().trim() == "")
	{
		return "Please fill CardHolder Name field.";
	}
	// card number
	if ($("#cardNo").val().trim() == "")
	{
		return "Please fill Card Number field.";
	}
	// 
	if ($("#cvv").val().trim() == "")
	{
		return "Please fill CVV field.";
	}
	// 
	if ($("#expDate").val().trim() == "")
	{
		return "Please fill Expiry Date field.";
	}
	// 
	if ($("#totamount").val().trim() == "")
	{
		return "Please fill Total Amount field.";
	}
	
	
	
	
	return true;
}

$(document).on("click", ".btnRemove", function(event)
{
		$.ajax(
		 {
			 url : "PaymentsAPI",
			 type : "DELETE",
			 data : "paymentID=" + $(this).data("paymentid"),
			 dataType : "text",
			 complete : function(response, status)
			 {
				 onPaymentDeleteComplete(response.responseText, status);
			 }
		 });
});


function onPaymentDeleteComplete(response, status)
{
	if (status == "success")
	 {
		var resultSet = JSON.parse(response);
		if (resultSet.status.trim() == "success")
		{
			 $("#alertSuccess").text("Successfully deleted.");
			 $("#alertSuccess").show();
			 $("#divPaymentGrid").html(resultSet.data);
		} else if (resultSet.status.trim() == "error")
		{
			 $("#alertError").text(resultSet.data);
			 $("#alertError").show();
		}
	 } else if (status == "error")
	 {
			 $("#alertError").text("Error while deleting.");
			 $("#alertError").show();
	 } else
	 {
			 $("#alertError").text("Unknown error while deleting..");
			 $("#alertError").show();
	 }
}


