<html>

	<head>
	<title>La page Hello.jsp</title>
	</head>

	<body>
	<p>Découverte des Servlet - Hello.jsp</p>
	<H2>Hello</H2>
	<!--Les EL ci-dessous appellent des éléments de la méthode doPost
	de la classe HelloWorld
	cette méthode doPost se réfère elle-m^me à la présente page-->
	1 :${nom}<br> <!--attribut du request.setAttribute("nom", prenom)-->
	2 :${param.nom}<br><!--paramètre du String prenom = request.getParameter("prenom")-->
	3 :${param['nom']}<br> <!--paramètre du String prenom = request.getParameter("prenom")-->
	4 :${requestScope.nom}<br><!--attribut du request.setAttribute("nom", prenom)-->
	une scriplet :<%=request.getHeader("User-Agent")%><br>
	une EL : ${header['user-agent']}
	</body>

</html>