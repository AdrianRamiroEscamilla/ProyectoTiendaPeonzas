package peonzas.control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import peonzas.datos.DatosPeonzas;
import peonzas.domain.Peonza;

/**
 * Servlet implementation class Categorias
 */
@WebServlet("/Categorias")
public class Categorias extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Categorias() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	
    protected void processHandler(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {


    	ArrayList<Peonza> alPeonzas = new DatosPeonzas().seePeonza();
    	
    	String categoria = (String) request.getAttribute("categoria");
    	request.setAttribute("categoria", categoria);
    	String parametro = (String) request.getAttribute("parametro");
    	request.setAttribute("parametro", parametro);

    	
    	RequestDispatcher view;
    	view = request.getRequestDispatcher("categoria.jsp");
    	view.forward(request, response);
    }
    
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processHandler( request,  response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
