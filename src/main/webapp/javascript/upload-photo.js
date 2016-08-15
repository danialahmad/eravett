$(document).ready(function() {
	var contextPath = $("#web-context-root").text();
	$(".file-dropzone").on('dragover', handleDragEnter);
	$(".file-dropzone").on('dragleave', handleDragLeave);
	$(".file-dropzone").on('drop', handleDragLeave);
	function handleDragEnter(e) {
		this.classList.add('drag-over');
	}
	function handleDragLeave(e) {
		this.classList.remove('drag-over');
	}
	Dropzone.options.dropzoneForm = {
		url : contextPath + "api/upload/photo/profile",
		autoProcessQueue : false,
		uploadMultiple : false,
		maxFilesize : 2, // MB
		previewsContainer : ".dropzone-previews",
		//previewsContainer : "#imgprev",
		maxFiles : 1,
		acceptedFiles: 'image/*',
		addRemoveLinks : true,
		init : function() {
		    this.on("addedfile", function() {
		    	$("#upload-button").show();
				if (this.files[1] != null) {
					this.removeFile(this.files[0]);
				}
			});
		    this.on("success", function (file, response) {
		    	console.log(response);
		    	if(response.status=="success"){
		    		var blobId = response.result;
		    		$("#photoId").val(blobId);
		    		$("#profileRegistrationPatientPhoto").attr("src", contextPath + "api/profile/photo/" + blobId);
		    		$("#modalDropzone").modal("hide");
		    	}
		    });
			var myDropzone = this;
			$('#upload-button').on("click", function(e) {
				var d=$(".dz-image > img").attr('src');
				
				//$("#profileRegistrationPatientPhoto").attr("src", d);
				myDropzone.processQueue();
			});
		}
	}
	$("#modalDropzone").on("hide.bs.modal", function (e) {
		$(this)
	        .find("input,textarea,select,hidden")
	        .not("[type='radio']")
	        .val('')
	        .end();
	    $(this)
	       .find("input[type=checkbox], input[type=radio]")
	       .attr("checked", false)
	       .end();
	    $(".dropzone-previews").empty();
	});
});