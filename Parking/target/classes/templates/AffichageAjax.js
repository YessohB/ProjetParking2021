// Au chargement de la page, déclencher la fonction ajaxBox_update()
window.onload = ajaxBox_update;

// Fonction effectuant la requête AJAX

function ajaxBox_update()
{
// Récupération de l'objet XHR
    var xhr;

// On assigne une fonction qui, lorsque l'état de la requête change, va traiter le résultat
    xhr.onreadystatechange = function()
    {
// readyState 4 = requête terminée
        if (xhr.readyState == 4)
        {
// status 200 = page requêtée trouvée
            if (xhr.status == 200)
                ajaxBox_parseJson(xhr.responseText); // Traitement JSON
// Page non trouvée
            else
                ajaxBox_setText('Error...');
        }
    };

// Préparation de la requête
    var url = 'http://localhost:8080/parkings';
    xhr.open('GET', url, true);

// Execution de la requête
    xhr.send(null);
}

// Fonction de traitement des données JSON retournées
// Récupère le noeud JSON data.texte_1

function ajaxBox_parseJson(pJsonString)
{
    var jsonObjet = eval('('+ pJsonString +')');
    ajaxBox_setText(jsonObjet.data.text_1);
}


// Fonction de mise à jour du contenu de la div #ajaxBox
// Ajout d'un element <p> contenant le message, dans le div #ajaxBox
function ajaxBox_setText(pText)
{
    var elt = document.getElementById('ajaxBox');
    var p = elt.appendChild(document.createElement('p'));
    p.appendChild(document.createTextNode(pText));
}