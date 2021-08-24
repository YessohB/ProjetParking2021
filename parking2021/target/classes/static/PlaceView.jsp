<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link rel="stylesheet" href="Style.css" />
    <%@ page import="fr.miage.parking2021.metier.*"%>
    <jsp:useBean id="place" class="java.util.HashMap" scope="request"></jsp:useBean>
    <title>Place</title>
</head>
<h1>Place</h1>
<body class="fond">



<div>
    <h2 th:case="null">Liste des parkings : </h2>
    <div th:case="*">
        <table>
            <thead>
            <tr>
                <th>Numéro de place:</th>
                <th>Type:</th>
                <th>Libelle:</th>
                <th>Occupation:</th>
                <th>Numero parking:</th>
                <th>Edite</th>
                <th>Delete</th>
            </tr>
            </thead>
            <tbody>


            <tr>
                <td> <jsp:getProperty name="place" property="numPLace"/></td>
                <td><jsp:getProperty name="place" property="typeplace"/></td>
                <td><jsp:getProperty name="place" property="libelle"/></td>
                <td><jsp:getProperty name="place" property="occupation"/></td>
                <td><jsp:getProperty name="place" property="numParking"/></td>
                <td> <a th:href="@{edit/{id}(id=$place.nunPlace})}"></a></td>
                <td> <a th:href="@{delete/{id}(id=$place.numPLace})}"></a></td>

            </tr>

            </tbody>
        </table>

    </div>

</div>





</body>