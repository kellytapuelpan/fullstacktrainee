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
	$('#toggle-button').click(function(){
		$('.toggle-row p').toggle('slow');
	});
	$('#sdown-button').click(function(){
		$('.sdown-row .square').slideDown('slow');
	});
	$('#sup-button').click(function(){
		$('.sdown-row .square').slideUp('slow');
	});
	$('#stoggle-button').click(function(){
		$('.stoggle-row .circle').slideToggle('slow');
	});
	$('#fade-button').click(function(){
		$('.fade-row .circle').fadeIn('slow');
	});
	$('#fadeout-button').click(function(){
		$('.fadeout-row .circle').fadeOut('slow');
	});
	$('#addclass-button').click(function(){
		$('.addclass-row .square').addClass('pink');
	});
	$('#before-button').click(function(){
		$('.before-row .square').before( document.createTextNode( "Happy square!! " ) );
	});
	$('#after-button').click(function(){
		var newdiv = $( "<div id='object1'>Nice square!!</div>" )
		$('.after-row .square').after(newdiv);
	});
	$('#append-button').click(function(){
		var apdiv = $( "<p class='nice-text'>Today it's a sunny day</p>" )
		$('.append-row p').append(apdiv);
	});
	$('#html-button').click(function(){
		$('.html-row p').html( '<p class="red">Here we go <b>Again</b></p>' );
	});
	$('#attr-button').click(function(){
		var title = $('.attr-row p').attr( "title" );
		$('.attr-row p').append( title );
	});
	$('#val-button').click(function(){
		var invalue = $('#myinput').val();
    	$('.val-row p').text( invalue );
	});
	$('#text-button').click(function(){
		var title = $('.text-row p').attr( "title" );
		$('.text-row p').text( title );
	});
});