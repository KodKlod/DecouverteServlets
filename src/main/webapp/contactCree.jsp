<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nouveau contact</title>
</head>
<body>
	<H1>Le nouveau contact a �t� cr��</H1>
	<br>
	<!--contact fait r�f�rence � l'objet contact de request.setAttribute("contact", contact) dans CreerContact.java  -->
	<!--nomLname fait r�f�rence � l'attribut nomLname de contact.java  -->
	Nom : ${contact.nomLname}
</body>
</html>