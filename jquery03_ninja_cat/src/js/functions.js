$( document ).ready(function() {
	$('.img-fluid').on('click', function() {
	    var id = $(this).attr('data-alt-src');
	    var src= '../src/img/';
	    $(this).attr('src', src + id);
	    $(this).toggle(change);
	});
});