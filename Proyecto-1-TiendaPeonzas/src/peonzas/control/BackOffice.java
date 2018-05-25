package peonzas.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import peonzas.datos.DatosUsuario;
import peonzas.domain.Usuario;

/**
 * Servlet implementation class BackOffice
 */
@WebServlet("/BackOffice")
public class BackOffice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void processHandler(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
	}
    public BackOffice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	RequestDispatcher view;

		DatosUsuario alUsuarios = new DatosUsuario();
		int id = 0;
		try {
			id = Integer.parseInt(request.getParameter("idUsuario"));

		}catch (Exception e){
			e.printStackTrace();
		}
		Usuario usuario = alUsuarios.searchUser(id);

    	request.setAttribute("usuario", usuario );
    	
    	view = request.getRequestDispatcher("UserDetail.jsp");
    	view.forward(request, response);
		processHandler(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
