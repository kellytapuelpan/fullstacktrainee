$( document ).ready(function() {

	function range(start, end) {
  		return Array(end - start + 1).fill().map((_, idx) => start + idx);
	}

	pokemonrange = range(1, 152);

	for(i=1; i<pokemonrange.length; i++) {
		url = "https://pokeapi.co/api/v2/pokemon/" + i;	
		$.get( url, function( data ) {

			var obj = data.types;

			for(j=0; j<obj.length; j++) {
				if(j == 0) {
					listTypes = data.types[0].type.name;
				} else if(j == 1) {
					listTypes = data.types[0].type.name + ', ' +data.types[1].type.name;
				}
			}

			var $newDiv = $("<div class='cont-poke'><div class='cont-img' data-toggle='modal' data-id=" + data.id + " data-target='#div" + data.id + "'><img id=" + data.id + " src=" + data.sprites.front_default + " alt=" + data.name +" class='img-poke'></div><div class='data-poke modal fade' id='div" + data.id + "' tabindex='-1' role='dialog' aria-labelledby='div" + data.id + "Label' aria-hidden='true'><div class='modal-dialog text-center'><button type='button' class='close' data-dismiss='modal' aria-label='Close'><span aria-hidden='true'>x</span></button><h4 class='pt-4'>"+ data.name +"</h4><img id='alt" + data.id + "' src=" + data.sprites.front_shiny + " alt="+ data.name +" class='img-poke-modal'><div class='info-poke pb-3'><ul><li><strong>Types: </strong>"+ listTypes +"</li><li><strong>Height:</strong> " + data.height + "</li><li><strong>Weight:</strong> " + data.weight + "</li></ul></div></div></div></div>");
			if(data.id < 10){
				$newDiv.attr("id", "pokemon-a" + data.id);
				$newDiv.attr("data-id", "0" + data.id);
			} else if(data.id <= 99) {
				$newDiv.attr("id", "pokemon-b" + data.id);
				$newDiv.attr("data-id", data.id);
			} else {
				$newDiv.attr("id", "pokemon" + data.id);
				$newDiv.attr("data-id", data.id);
			}

			$(".col-pokemon").append($newDiv);
		   
			var mylist = $('.col-pokemon');
			var listitems = mylist.children('div.cont-poke').get();
			listitems.sort(function(a, b) {
			    var compA = $(a).attr('id').toUpperCase();
			    var compB = $(b).attr('id').toUpperCase();
			    return (compA < compB) ? -1 : (compA > compB) ? 1 : 0;
			})
			$.each(listitems, function(idx, itm) {
			    mylist.append(itm);
			});

		}, "json" );
	}
});
