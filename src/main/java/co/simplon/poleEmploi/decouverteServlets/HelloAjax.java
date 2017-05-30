package co.simplon.poleEmploi.decouverteServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloAjax
 */
@WebServlet("/HelloAjax")
public class HelloAjax extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String message;

	public void init() throws ServletException {
		// Do required initialization
		message = "Salut inconnu !";
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloAjax() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/plain");
		// Actual logic goes here.
		String prenom = request.getParameter("prenom");
		PrintWriter out = response.getWriter();
		if (prenom == null) {
			response.setStatus(HttpServletResponse.SC_NOT_IMPLEMENTED);

		} else {
			out.println("Hello " + prenom);
			response.setStatus(HttpServletResponse.SC_OK);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
