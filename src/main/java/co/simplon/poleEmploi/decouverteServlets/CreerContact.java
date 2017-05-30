package co.simplon.poleEmploi.decouverteServlets;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domaineMetier.Contact;
import domaineMetier.Hobbies;

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
		// et les coller dans un objet contact récupéré dans le projet tpjdbc
		Contact contact = new Contact();
		// Le parameter fait référence à l'attribut name de l'input
		contact.setNomLname(request.getParameter("nom"));
		contact.setPrenomFname(request.getParameter("prenom"));
		contact.setMail(request.getParameter("email"));
		// Je cree des hobbies pour mon contact
		Set<Hobbies> hobbies = new HashSet<Hobbies>();
		hobbies.add(new Hobbies(1, "Guitar"));
		hobbies.add(new Hobbies(2, "Harmonica"));
		// J'associe les hobbies au contact
		contact.setHobbies(hobbies);

		// Le .setAttibute pour pouvoir appeler les données
		// dans une page définie dans le getRequestDispatcher
		request.setAttribute("contactServlet", contact);
		// Je calcule le nb de hobbies du contact
		// pour pouvoir l'afficher ensuite
		final int size = hobbies.size();
		request.setAttribute("nbHobbies", size);

		// On peut encore simplifier en regroupant
		// les setAttribute dans une Map
		// et du coup on aura un seul setAttribute en référence

		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher("/contactCree.jsp");
		dispatcher.forward(request, response);


	}

}
