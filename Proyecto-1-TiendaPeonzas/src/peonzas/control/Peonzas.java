package peonzas.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Peonzas
 */
@WebServlet("/Peonzas")
public class Peonzas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Peonzas() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void processRequestHandler(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String origen = request.getParameter("Pagina");
        //Si vienes de la pagina 1, vas a la 2
        if (origen.contentEquals("pagina1")) {
        	processMenu(request,response);
        } else if (origen.contentEquals("pagina2")) {
            //Vienes de la pagina 2 y vas a la 3
        	processPeticion(request,response);
        }
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
