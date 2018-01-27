$(function() {
	$( "#checkInDate" ).datepicker({
		dateFormat: "dd/mm/yy",
		onSelect: function () {
			var date = $(this).datepicker("getDate");
			date.setDate(date.getDate() + 1);
					
			$("#checkOutDate").datepicker('option', 'minDate', date);
		}
				
	});
});
		
$(function() {
	$( "#checkOutDate" ).datepicker({
		dateFormat: "dd/mm/yy"
	});
});

$( document ).ready(function() {
	$("#searchBtn").click(function() {
		var hotels = $("#deals");
		var dataForm = $('#form').serialize();
		
		$.ajax({
			url: "deals/list",
			method: "GET",
			data: dataForm,
			dataType: "html",
			success: function (result) {
				hotels.html(result);
			},
			error: function(message) {
				hotels.html("<span id=\"errorMsg\">Service is currently unavailable!</span>");
			}
		});
	});
});