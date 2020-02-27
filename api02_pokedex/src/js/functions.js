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
	        html_str += '<div id="' + res.id + '" class="cont-poke">';
	        	html_str += '<div class="cont-img" data-toggle="modal" data-id=' + res.id + ' data-target="#div' + res.id + '">';
	        		html_str += '<img id="img' + res.id + '" src=' + res.sprites.front_default + ' alt=' + res.name + ' class="img-poke">';
	        	html_str += '</div>';
	        	html_str += '<div class="data-poke modal fade" id="div' + res.id + '" tabindex="-1" role="dialog" aria-labelledby="div' + res.id + 'Label" aria-hidden="true">';
			        html_str += '<div class="modal-dialog text-center">';
				        html_str += '<button type="button" class="close" data-dismiss="modal" aria-label="Close">';
							html_str += '<span aria-hidden="true">x</span>';
						html_str += '</button>';
						html_str += '<h4 class="pt-4">'+ res.name +'</h4>';
						html_str += '<img id="alt"' + res.id + '" src=' + res.sprites.front_shiny + ' alt=' + res.name + ' class="img-poke-modal">';
				        html_str += '<div class="info-poke pb-3">';
					        html_str += '<p class="mb-1"><strong>Types:</strong></p>';
					        html_str += '<ul class="mb-2">'; 
					        for(var i = 0; i < res.types.length; i++) {
					            html_str += '<li>- ' + res.types[i].type.name + '</li>';
					        }
					        html_str += '</ul>';
					        html_str += '<p class="mb-1"><strong>Height:</strong> ' + res.height + '</p>';
					        html_str += '<p class="mb-1"><strong>Weight:</strong> ' + res.weight + '</p>';
					    html_str += '</div>';
				    html_str += '</div>';
			    html_str += '</div>';
	        html_str += '</div>';

	        $('.col-pokemon').append(html_str);

	        $('.col-pokemon .cont-poke').sort(function(a, b) {
			  	return parseInt(a.id) - parseInt(b.id);
			}).each(function() {
			  	var elem = $(this);
			  	elem.remove();
			  	$(elem).appendTo('.col-pokemon');
			});
	    }, "json");
	});
});