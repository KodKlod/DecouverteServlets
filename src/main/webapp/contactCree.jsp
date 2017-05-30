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
	<!--contactServlet fait référence à request.setAttribute("contactServlet", contact) dans CreerContact.java  -->
	<!--nomLname fait référence à l'attribut nomLname de Contact.java  -->
	Nom : ${contactServlet.nomLname}
	<br>
	Prenom : <c:out value="${contactServlet.prenomFname}" default="S'affiche si pas de prénom saisi"/>
	<br>
	<!--J'affiche les hobbies créés dans CreerContact.java  -->
	<H2>Ses ${nbHobbies} hobbies sont : </H2>	
	<ul>
		<c:forEach items="${contactServlet.hobbies}" var="hobby" varStatus="status">
			<li>Activité ${status.index} : ${hobby.activite}</li>
		</c:forEach>
	</ul>
</body>
</html>