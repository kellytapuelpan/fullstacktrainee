$( document ).ready(function(pokemon) {
	function range(start, end) {
  		return Array(end - start + 1).fill().map((_, idx) => start + idx);
	}

	pokemon = range(1, 152);
	for(i=1; i<pokemon.length; i++) {
		$.get( "https://pokeapi.co/api/v2/pokemon/" + i, function( data ) {
			var $newDiv = $("<div id="+ data.id + "><img id=" + data.id + " src=" + data.sprites.front_default + " alt=" + data.name +"></div>");
			
			if(data.id < 10){
				$newDiv.attr("id", "pokemon-a" + data.id);
				$newDiv.attr("data-id", "0" + data.id);
			} else if(data.id < 100) {
				$newDiv.attr("id", "pokemon-b" + data.id);
			} else {
				$newDiv.attr("id", "pokemon" + data.id);
				$newDiv.attr("data-id", data.id);
			}

		  	$( ".row" ).append($newDiv);

		  	var mypokemonlist = $('.row');
			var listitems = mypokemonlist.children('div').get();
			listitems.sort(function(a, b) {
			    var compA = $(a).attr('id').toUpperCase();
			    var compB = $(b).attr('id').toUpperCase();
			    return (compA < compB) ? -1 : (compA > compB) ? 1 : 0;
			})
			$.each(listitems, function(idx, itm) {
			    mypokemonlist.append(itm);
			});
		}, "json" );
	}
});