package co.simplon.poleEmploi.decouverteServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Extend HttpServlet class
public class HelloWorld extends HttpServlet {

	private String message;

	public void init() throws ServletException {
		// Do required initialization
		message = "Hello World Classe HelloWorld";
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Set response content type
		String prenom = request.getParameter("prenom");
		request.setAttribute("nom", prenom);
		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher("/WEB-INF/hello.jsp");
		dispatcher.forward(request, response);
	}

	// La signature de cette méthode est invariable
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/html");
		// Actual logic goes here.
		String prenom = request.getParameter("prenom");
		PrintWriter out = response.getWriter();
		if (prenom == null) {
			out.println("<h1>" + message + "</h1>");
		} else {
			out.println("<h1>" + "Salut " + prenom + "</h1>");
		}
	}

	public void destroy() {
		// do nothing.
	}

}