/**
 * 
 */
$(document).ready(function() {
	var contextPath = $("#web-context-root").text();
	var form = $("#register-form");
	var success=function (data, textStats, jqXHR){
		if(data.status=="success") 
			toastr.success("Your order has been successfully created.");
		else toastr.error("There's an error while saving your record.");
		$("#modalFee").modal("hide");
	};
	var rules = {
			"username" : {
				required: true
			},
			"password" : {
				required: true
			}
        };
	var messages = {};
	saveFormAndValidate(form, rules, messages, success);
	$("#btn-register").click(function(){
		if(form.valid()){
			form.submit();
		}
	});
	
});

function saveFormAndValidate(form, rules, messages, success) {
	var validator = form.validate({
		focusInvalid : true,
		rules : rules,
		messages : messages,
		submitHandler : function(form) {
			$("#modalConfirmation").modal({ backdrop: 'static', keyboard: false }).one('click', '[data-value]', function (e) {
				if($(this).data("value")=="1"){
					var action = $(form).attr("action");
					$(form).ajaxSubmit({
						url : action,
						type : "POST",
						success : success,
						error : function(data) {
							toastr.error("Error");
						}
					});
				}
				$("#modalConfirmation").modal("hide");
	        });
		}
	});
	return validator;
};