<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />

  <link
  rel="stylesheet"
  href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
  integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
  crossorigin="anonymous"
  >
  <link rel="stylesheet" href="stylepage.css">

<!-- Utilisation de Boostrap -> pages responsives --> 

  <title>Info Parking</title>
</head>


<body>
<section> 
<div class="container"> 
 <div class="alert alert-warning" role="alert-warning">
   Veuillez � respecter les gestes barri�res pour lutter contre le Covid-19
 </div>
</div>
</section>

<section> 
  <div class="bg-dark">
    <div class="container">
      <div class="row">
        <nav class="col navbar navbar-expand-lg navbar-dark">
          <a class="navbar-brand" href="index.html">
          <img src="images/logomodif.jpg" width="50" height="50"alt="Site logo">
          </a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div id="navbarContent" class="collapse navbar-collapse">
            <ul class="navbar-nav">
              <li class="nav-item">
                <a class="nav-link active" href="index.html">Accueil</a>
              </li>
              <li>
                <div class="container">
                  <form class="form-inline" action="/recherche/" method="get">
                    <fieldset>    
                      <div class="input-group">
                        <div class="input-group-prepend">
                          <select id="oCategorie" name="oCategorie" class="form-control">
                            <option selected="selected" value="0">Cat�gorie</option>
                            <option value="1"> R�gion </option>
                            <option value="2"> Ville </option>
                          </select>
                        </div>
                     <input id="oSaisie" name="oSaisie" type="text" class="form-control" aria-label="Saisie de mots cl�s" required="required">
                     <div class="input-group-append">
                  <button class="btn btn-primary" type="submit">Recherche</button>
                 </div>
               </div>
            </fieldset> 
          </form>
          </div>
          </ul>
          </div>
        </nav>
      </div>
    </div>
  </div>
</section>


<br>

  <div class="container">
    <div class="row">
      <div class="col">
        <h1>Pr�sent d�j� dans 10 m�tropoles fran�aises </h1>
      </div>
    </div> 

  <div class="container">
    <div class="row mb-4">
      <div class="col">          
        <div id="carouselControls" class="carousel slide" data-ride="carousel">
          <div class="carousel-inner">
            <div class="carousel-item active">
              <img src="images/m�tropoles/bordeaux.jpg" class="d-block w-100" alt="Bordeaux">
            </div>
            <div class="carousel-item">
              <img src="images/m�tropoles/lille.jpg" class="d-block w-100" alt="Lille">
            </div>
            <div class="carousel-item">
              <img src="images/m�tropoles/nantes.jpg" class="d-block w-100" alt="Nantes">
            </div>
            <div class="carousel-item">
              <img src="images/m�tropoles/paris.jpeg" class="d-block w-100" alt="Paris">
            </div>
          </div>
          <a class="carousel-control-prev" href="#carouselControls" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
          </a>
          <a class="carousel-control-next" href="#carouselControls" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
          </a>          
        </div>        
      </div>
    </div>

    
    <div class="row">
      <div class="col-12 col-lg-4">
        <div class="card mb-4 mb-lg-0 border-primary shadow">
          <div class="card-body">
            <h5 class="card-title">Informations G�n�rales :</h5>
            <p class="card-text">Place totale : ...</p>
            <p class="card-text">Type de places : ...</p>
          </div>
        </div>
      </div>
      <div class="col-12 col-lg-4">
        <div class="card mb-4 mb-lg-0 border-primary shadow">
          <div class="card-body">
            <h5 class="card-title">Informations en temps r�el : </h5>
            <p class="card-text">Places disponibles : </p>
            <p class="card-text">dont :  </p>
            <p class="card-text">... places classiques  </p>
            <p class="card-text">... places handicap�s </p>
          </div>
        </div>
      </div>
      <div class="col-12 col-lg-4">
        <div class="card mb-4 mb-lg-0 border-primary shadow">
          <div class="card-body">
            <h5 class="card-title">Situation g�ographique : </h5>
           
            <p>
                <!--Google map-->
              <div id="map-container-google-2" class="z-depth-1-half map-container" style="height: 200px">
                <div id="wrapper-9cd199b9cc5410cd3b1ad21cab2e54d3">
				<div id="map-9cd199b9cc5410cd3b1ad21cab2e54d3"></div>
				<a href="https://1map.com/fr/map-embed">1 Map</a></div>
              </div>
               <!--Google Maps-->
            </p>
          </div>
        </div>
      </div>
    </div>


    <div class="bg-dark">
      <div class="container">
        <div class="row">
        </div>
      </div>
    </div>

    <br> 
    <br> 

    <div class="bg-light">
      <div class="container">
        <div class="row">
          <div class="col">
            <ul class="list-inline text-center">
              <li class="list-inline-item"><a href="#">About Us</a></li>
              <li class="list-inline-item">&middot;</li>
              <li class="list-inline-item"><a href="#">Privacy</a></li>
              <li class="list-inline-item">&middot;</li>
              <li class="list-inline-item"><a href="#">Terms of Use</a></li>
            </ul>
          </div>
        </div>
      </div>    
    </div>  


    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
	<!-- GoogleMap  -->
	<script>(function () {
        var setting = {"zoom":13,"queryString":"Talence, France","place_id":"ChIJC5nYpnAnVQ0RINEWSBdlBgQ","satellite":false,"centerCoord":[44.806108704967954,-0.5918584875966459],"cid":"0x40665174816d120","lang":"fr","cityUrl":"/france/talence-31904","cityAnchorText":"Carte de Talence, Sud de la France, France","id":"map-9cd199b9cc5410cd3b1ad21cab2e54d3","embed_id":"526789"};
        var d = document;
        var s = d.createElement('script');
        s.src = 'https://1map.com/js/script-for-user.js?embed_id=526789';
        s.async = true;
        s.onload = function (e) {
          window.OneMap.initMap(setting)
        };
        var to = d.getElementsByTagName('script')[0];
        to.parentNode.insertBefore(s, to);
        })();
	</script>
  </body>
  </html>