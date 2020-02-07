$( document ).ready(function(pokemon) {
	function range(start, end) {
  		return Array(end - start + 1).fill().map((_, idx) => start + idx);
	}

	pokemon = range(1, 152);
	for(i=1; i<pokemon.length; i++) {
		$.get( "https://pokeapi.co/api/v2/pokemon/" + i, function( data ) {
		  	$( ".row" ).append("<img src=" + data.sprites.front_default + " alt=" + data.name +">" );
		}, "json" );
	}
});