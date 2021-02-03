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

<table style="width:100%">
  <tr>
    <th>N°</th>
    <th>Date</th>
    <th>Client</th> 
    <th>Prix</th>  
  </tr>
  <c:forEach items="${factures}" var="facture">
	  <tr>
	    <td><a href="<%=application.getContextPath()%>/facture?id=${facture.id}" /><c:out value="${facture.numero}"/></td>
	    <td><c:out value="${facture.dateFacture}"/></td>
	    <td><c:out value="${facture.idclient.nom}"/></td>
	    <td><c:out value="${facture.prix}"/></td>
	  </tr>
  </c:forEach>
</table>


 <%@include file="Commons/footer.jsp"%>

</body>
</html>