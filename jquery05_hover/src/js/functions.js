$( document ).ready(function() {

	var change = $('.img-fluid').map(function() {
		pole = $(this).attr('src');
	    return pole;
	}).get();

	$('.img-fluid').hover(function(){
		orig  = $(this).attr('src');
		var num = Math.floor(Math.random() * change.length);
		data = $(this).attr('src', change[num]);
	},function(){
		$(this).attr("src",orig);
	});

});