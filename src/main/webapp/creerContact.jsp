<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Nouveau Contact</title>
	</head>
	<body>
		<!--le post fait reference � la methode doPost de la servlet
		CreerContact  -->
		<form method="post" action="creerContact.do">
			<fieldset>
			    <legend>Cr�ation de contact</legend>
			    <label for="nom">Nom</label>
			    <input type="text" id="nom" name="nom">
			    <br>
			    <br>
			    <label for="prenom">Pr�nom</label>
			    <input type="button" value="Bonjour">
			    <input type="text" id="prenom" name="prenom">
			    <br>
			    <br>
			    <label for="email">email</label>
			    <input type="text" id="email" name = "email">
		  </fieldset>
		  <br>
		  <br>
		  <input type="submit" name="creer" value="valider">
		</form>
	</body>
</html>