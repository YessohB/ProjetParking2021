$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/parkings/"
    }).then(function(data, status, jqxhr) {
        $('.parkings-numParking').append(data.numParking);
        $('.parking-nomParking').append(data.nomParking);
        console.log(jqxhr);
    });
});