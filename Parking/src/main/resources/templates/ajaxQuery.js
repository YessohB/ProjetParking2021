

$(function (){

    var $orders = $("#orders");
    $.ajax({
        type: 'GET',
        url: 'http://localhost:8080/parkings',
        dataType: 'json',
        contentType: 'application/json',

        success: function (data) {
            console.log('success', data);
          //  $.each(orders, function (i, order) {
          //      $orders.append('<li>Nom du parking: ' + order.nomParking + ', Taille: ' + order.taille + '</li>');
          //});
        }
    });

});

