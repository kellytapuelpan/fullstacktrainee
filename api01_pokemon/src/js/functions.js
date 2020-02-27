$(document).ready(function(){

	function range(start, end) {
  		return Array(end - start + 1).fill().map((_, idx) => start + idx);
	}

	pokemonrange = range(1, 151);
	poke_id = pokemonrange;

	$.each(poke_id, function(i, value) {
		url = 'https://pokeapi.co/api/v2/pokemon/' + poke_id[i];
	    $.get(url, function(res) {
	        var html_str = '';
	        html_str += '<img id="' + res.id + '" src=' + res.sprites.front_default + ' alt=' + res.name + ' class="img-poke">';

	        $('.col-pokemon').append(html_str);

	        $('.col-pokemon img').sort(function(a, b) {
			  	return parseInt(a.id) - parseInt(b.id);
			}).each(function() {
			  	var elem = $(this);
			  	elem.remove();
			  	$(elem).appendTo('.col-pokemon');
			});
	    }, "json");
	});
});