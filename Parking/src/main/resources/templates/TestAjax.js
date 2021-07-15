$(document).ready(function() {

    $.ajax
    ({
        url: 'http://localhost:8080/parkings',
        dataType: 'jsonp',
        success: function (data) {
            console.log("Fonctionne", data);
            parseJSON(data);
           // alert(JSON.stringify(data));
        },
        error: function (err) {
            console.log("Erreur", err);
        },

    });

    var parseJSON= function(data)    //fonction permettant de parcourir le format json
    {
        $(data).each(function(i)
        {
            createHTML(this);
        });
    }

    var createHTML= function(element)  //fonction permettant d'afficher un certain element
    {
        for (var i = 0; i < element.results.length; i++) {
            var info = $("<p>").html(element.results[i].text);
            $('#infos').append(info);
        }
    }

})
