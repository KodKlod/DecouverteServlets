<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nouveau contact</title>
</head>
<body>
	<H1>Le nouveau contact a été créé</H1>
	<br>
	<!--contact fait référence à l'objet contact de request.setAttribute("contact", contact) dans CreerContact.java  -->
	<!--nomLname fait référence à l'attribut nomLname de contact.java  -->
	Nom : ${contact.nomLname}
	<br>
	Prenom : <c:out value="${contact.prenomFname}" default="S'affiche si pas de prénom saisi"/>
	<br>
	<!--J'affiche ses hobbies que j'ai créé dans CreerContact.java  -->
	<H2>Ses hobbies sont : </H2>	
	<ul>
		<c:forEach items="${contact.hobbies}" var="hobby" varStatus="status">
			<li>Activité ${status.index} : ${hobby.activite}</li>
		</c:forEach>
	</ul>
</body>
</html>