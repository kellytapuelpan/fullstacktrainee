$( document ).ready(function() {
	$('.hide-img').hide();

	var puzzle = $('.img-fluid').map(function() {
	    return $(this).attr('data-alt-src')
	}).get();

	$('.img-fluid').click(function() {
	    var num = Math.floor(Math.random() * puzzle.length);
	    data = $(this).attr('data-alt-src', puzzle[num]);
	    url = $(this).attr('src', puzzle[num]);
	});
});