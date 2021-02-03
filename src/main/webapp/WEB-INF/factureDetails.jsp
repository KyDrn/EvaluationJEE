<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nouvelle Facture !</title>
<%@include file="Commons/header.jsp"%>
</head>
<body>
 <%@include file="Commons/menu.jsp"%>
 
 <div class="container row">
  		<div class="col s6">
  			<p>Date de facturation : <c:out value="${facture.dateFacture}"/></p>
  			<p>Numéro de facture : <c:out value="${facture.numero}"/></p>
  		</div>
  		<div class="col s6">
	  		<p>Nom client : <c:out value="${facture.idclient.nom}"/></p>
		  	<p>Adresse client : <c:out value="${facture.idclient.adresse}"/></p>
  		</div>
  	</div>

<table style="width:100%">
  <tr>
    <th>Article</th>
    <th>Quantité</th>
    <th>Prix</th> 
  </tr>
  <c:forEach items="${lignesFacture}" var="ligne"> 
	 <tr>
	   <td><c:out value="${ligne.idarticle.nom}"/></td>
	   <td><c:out value="${ligne.qte}"/></td>
	   <td><c:out value="${ligne.prix}"/></td>
	 </tr>
  </c:forEach>
</table>
<p class="right" style="padding: 20px;">Total : <c:out value="${facture.prix}"/></p>


 <%@include file="Commons/footer.jsp"%>

</body>
</html>