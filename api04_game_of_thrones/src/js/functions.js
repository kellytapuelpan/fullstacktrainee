$( document ).ready(function() {

    var houses_id = [15,230,362,378];

    for(i=0; i<houses_id.length; i++) {
        url = "https://anapioficeandfire.com/api/houses/" + houses_id[i];
        console.log(url);
        console.log(houses_id[i]);
        console.log("img#" + houses_id[i]);

        $.get(url, function(data) {
            $('img#'+ houses_id[i]).click(function(){
                var $houseName = data.name;
                var $houseWords = data.words;
                console.log($houseName);
                console.log($houseWords);

                $('.name').append($houseName);
                $('.words').append($houseWords);
            });
        }, "json" );
    }
});