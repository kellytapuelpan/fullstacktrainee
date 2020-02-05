$( document ).ready(function() {
	$('.cont-image').click(function(){
		$(this).parent().fadeOut('slow');
	});
	$('#restore').click(function() {
	    location.reload();
	});
});