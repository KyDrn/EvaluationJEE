<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nouvel Article !</title>
<%@include file="Commons/header.jsp"%>
</head>
<body>
 <%@include file="Commons/menu.jsp"%>

<table style="width:100%">
  <tr>
    <th>Nom</th>
    <th>Adresse</th> 
  </tr>
  <c:forEach items="${articles}" var="article">
  <tr>
    <td><c:out value="${article.nom}"/></td>
	<td><c:out value="${article.prix}"/></td>
  </tr>
  </c:forEach>
</table>
<a href="<%=application.getContextPath()%>/articles/create" style="margin: 20px; display: block;">
   <button class="btn btn-primary" style="margin: auto; display: block;">AJOUTER UN ARTICLE</button>
</a>
	


 <%@include file="Commons/footer.jsp"%>

</body>
</html>