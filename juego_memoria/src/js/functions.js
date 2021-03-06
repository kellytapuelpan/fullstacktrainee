let timer= new Timer();
function createDeck(){
	/*$('img').hide();*/
  	timer.addEventListener('secondsUpdated', function(e) { 
  		$('#timer, .modal-timer').html(timer.getTimeValues().toString());
	});
}

$(function() {

	let allCardsOrg= [
		'../src/img/piglet.jpg',
		'../src/img/piglet.jpg',
		'../src/img/puppy.jpg',
		'../src/img/puppy.jpg',
		'../src/img/puppy2.jpeg',
		'../src/img/puppy2.jpeg',
		'../src/img/ericito.jpg',
		'../src/img/ericito.jpg',
		'../src/img/ericito2.jpeg',
		'../src/img/ericito2.jpeg',
		'../src/img/pandita.jpg',
		'../src/img/pandita.jpg',
		'../src/img/pandita2.jpg',
		'../src/img/pandita2.jpg',
		'../src/img/kittie.jpeg',
		'../src/img/kittie.jpeg',
	];
  	
	let clickedCards = [];
	let count = 0;
	const allCards = shuffle(allCardsOrg);
	const deck = $('.deck');
	const modal = document.getElementById('winnerModal');
	const span = document.getElementsByClassName('close')[0];

	if(count===0){
		timer.start();
	}

	allCards.forEach(function(item) {
		const cardElement = createCard(item);
		$(deck).append(cardElement);
		$('.card').addClass('open');
	});

	function createCard(cssSrc) {
		const int = document.createElement('div');
		$(int).addClass('card col-md-3 col-6 mb-3');

		const divInt = document.createElement('div');
		$(divInt).addClass('int-card');

		const imag = document.createElement('img');
		$(imag).attr('src',cssSrc);
		$(imag).addClass('img-fluid');

		$(int).append(divInt);
		$(divInt).append(imag);

		$(int).click(function(e) {
			if ($(int).hasClass('show') && !$(int).hasClass()) {
				setInterval(onClick, 1000);
			}
			if (clickedCards.length <= 1) {
				checkIfWinner();
				handleCardOnClick(this);
			}
			if ($('.match').length === 16) {
				timer.stop();
				$('#winnerModal').addClass('show-modal');
			}
		});

		return int;
	}

	function checkIfWinner() {
		if ($('.match').length === 16) {
			createDeck();
			timer.stop();
		}
	}
	if ($('.match').length === 16) {
		timer.stop();
		$('#winnerModal').addClass('show-modal');
	}

	function handleCardOnClick(clickedCard) {
		//console.log(clickedCard);

		$(clickedCard).addClass('show');
		clickedCards.push(clickedCard);

		if (clickedCards.length > 1) {
			count++;

			$('span.moves').html(function() {
				return count;
			});

			if ($(clickedCards[0]).find('img').attr('src') === $(clickedCards[1]).find('img').attr('src')) {
				$('.show').addClass('match');
				$('.card').removeClass('show');
				clickedCards = [];
			} else {
				setTimeout(function() {
					$('.card').removeClass('show');
					clickedCards = [];
				}, 1000);
			}
		}
	}

	$('.restart, #close-modal').click(function(e) {
		location.reload(this);
		createDeck();
	    timer.stop();
	    $('#timer').html(timer.getTimeValues().toString());
	});
	$("#close-modal").click(function(){
		$('#winnerModal').removeClass('show-modal');
	});

	function shuffle(array) {
		var currentIndex = array.length,
			temporaryValue,
			randomIndex;

		while (currentIndex !== 0) {
			randomIndex = Math.floor(Math.random() * currentIndex);
			currentIndex -= 1;
			temporaryValue = array[currentIndex];
			array[currentIndex] = array[randomIndex];
			array[randomIndex] = temporaryValue;
		}
		return array;
	}
});