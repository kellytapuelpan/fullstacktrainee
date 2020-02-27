$( document ).ready(function() {

    var houses_id = [15,230,362,378];

    $.each(houses_id, function(i, value) {
        url = "https://anapioficeandfire.com/api/houses/" + houses_id[i];

        $.get(url, function(data) {
            $('img').click(function(e){
                e.preventDefault();
                $('.house-data').slideDown();
                var t = $(this).attr('id'); 
                
                if(t==houses_id[i]) {
                    var $houseName = data.name;
                    var $houseWords = data.words;
                    var $titles = data.titles;
                    var $region = data.region;
                    var $founded = data.founded;

                    $('.name').fadeOut(0,function(){
                        $(this).html($houseName).fadeIn();
                    });
                    $('.words').fadeOut(0,function(){
                        $(this).html($houseWords).fadeIn();
                    });

                    var output = '';
                    output += '<ul class="col-6 offset-3">';
                    $.each($titles, function (index, value) {
                        output += '<li>' + value + '</li>';
                    });
                    output += '</ul>';

                    $('.titles').fadeOut(0,function(){
                        $(this).html(output).fadeIn();
                    });

                    $('.region').fadeOut(0,function(){
                        $(this).html('<strong>Region:</strong> ' + $region).fadeIn();
                    });

                    $('.founded').fadeOut(0,function(){
                        $(this).html('<strong>Founded:</strong> ' + $founded).fadeIn();
                    });

                }
            });
        }, "json" );
    });
});