<html>

	<head>
	<title>La page Hello.jsp</title>
	</head>

	<body>
	<p>D�couverte des Servlet - Hello.jsp</p>
	<H2>Hello</H2>
	<!--Les EL ci-dessous appellent des �l�ments de la m�thode doPost
	de la classe HelloWorld
	cette m�thode doPost se r�f�re elle-m^me � la pr�sente page-->
	1 :${nom}<br> <!--attribut du request.setAttribute("nom", prenom)-->
	2 :${param.nom}<br><!--param�tre du String prenom = request.getParameter("prenom")-->
	3 :${param['nom']}<br> <!--param�tre du String prenom = request.getParameter("prenom")-->
	4 :${requestScope.nom}<br><!--attribut du request.setAttribute("nom", prenom)-->
	une scriplet :<%=request.getHeader("User-Agent")%><br>
	une EL : ${header['user-agent']}
	</body>

</html>