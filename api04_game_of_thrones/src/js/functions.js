$(document).ready(function() {
	$('.weather').hide();

	$('form').submit(function() {
    	city = document.getElementById('city-data').value;
    	url = "http://api.openweathermap.org/data/2.5/weather?q=" + encodeURIComponent(city) + "&appid=a1739ae497b642d73675a073fabf72c1";

    	$('.weather').fadeIn();

        $.get(url, function(res) {
            var $newCity = city;
            var $deg = res.main.temp;
            var $feels = res.main.feels_like;

            $(".city-name").append($newCity);
            $(".city-temp").append($deg);
            $(".it_feels").append($feels);
        }, 'json');
        return false;
    });

    $('#city-data').on('change', function() {
        $('.weather').hide();
        $('.city-name, .city-temp, .it_feels').html('');
    });
});
