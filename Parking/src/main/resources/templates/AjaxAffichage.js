var xhr = new XMLHttpRequest();
xhr.open('GET', 'http://localhost:8080/parkings');
xhr.onreadystatechange = function() {
    if (xhr.readyState === 4) {
        var reponse = JSON.parse(xhr.responseText);
        alert(reponse.name);
    }
};
xhr.send();