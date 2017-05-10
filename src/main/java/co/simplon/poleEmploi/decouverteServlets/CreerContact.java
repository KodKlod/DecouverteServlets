package co.simplon.poleEmploi.decouverteServlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domaineMetier.Contact;

/**
 * Servlet implementation class CreerContact
 */
@WebServlet("/CreerContact")
public class CreerContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreerContact() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// Récupérer les données saisies dans les inputs de la jsp
		// et les coller dans contact ?
		Contact contact = new Contact();
		contact.setPrenomFname(request.getParameter("nom"));
		contact.setPrenomFname(request.getParameter("prenom"));
		contact.setPrenomFname(request.getParameter("email"));
		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher("/creerContact.jsp");
		dispatcher.forward(request, response);

	}

}
