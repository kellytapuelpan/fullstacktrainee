$(document).ready(function() {
	$('.weather, .error').hide();

	$('form').submit(function() {
    	city = document.getElementById('city-data').value;
    	url = "http://api.openweathermap.org/data/2.5/weather?q=" + encodeURIComponent(city) + "&appid=a1739ae497b642d73675a073fabf72c1";

    	$('.weather').fadeIn();

        if($('#city-data').val()!='' ) {
            $.get(url, function(res) {
                var $newCity = city;
                var $deg = res.main.temp;
                var $feels = res.main.feels_like;

                $('.city-name').append($newCity);
                $('.city-temp').append($deg);
                $('.it_feels').append($feels);

                var map;
                function initMap() {
                    var $newLat = res.coord.lat;
                    var $newLng = res.coord.lon;
                    map = new google.maps.Map(document.getElementById('map'), {
                        center: {lat: $newLat, lng: $newLng},
                        zoom: 8
                    });
                }
                initMap();
            }, 'json');
            return false;
        } else {
            $('.weather').hide();
            $('.error').fadeIn();
            return false;
        }
    });

    $('#city-data').on('change', function() {
        $('.weather, .error').hide();
        $('.city-name, .city-temp, .it_feels').html('');
    });

});
