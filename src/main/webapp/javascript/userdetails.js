/**
 * 
 */
$(document).ready(function() {
	var contextPath = $("#web-context-root").text();
	$.getJSON(contextPath + "api/security/user").done(function(data) {
		$("#userDetailName").text(data.displayName);
		var photoUrl = "";
		if (data.photoId != null) {
			photoUrl = contextPath + "api/profile/photo/" + data.photoId;
		} else {
			photoUrl = contextPath + "api/profile/photo/-1";
		}
		$("#profileImage").prop("src", photoUrl);
	});
});