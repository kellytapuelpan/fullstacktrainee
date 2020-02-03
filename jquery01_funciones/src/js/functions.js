$( document ).ready(function() {
	$('.hide-row p.show-it').hide();
	$('#click-button').click(function(){
		$('.click-row p').css( "color", "red" );
	});
	$('#hide-button').click(function(){
		$('.hide-row p').hide('slow');
	});
	$('#show-button').click(function(){
		$('.hide-row p.show-it').show('slow');
	});
});