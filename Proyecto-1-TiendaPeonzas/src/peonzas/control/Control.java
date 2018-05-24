package peonzas.control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import peonzas.datos.DatosPeonzas;

import peonzas.domain.*;
import peonzas.modelo.Coleccion;
import peonzas.servicios.PeonzasService;

import peonzas.domain.Peonza;


/**
 * Servlet implementation class Control
 */
@WebServlet("/Control")
public class Control extends HttpServlet {
	
    PeonzasService Pservice = new PeonzasService();
 
    
	private static final long serialVersionUID = 1L;
	
    protected void processHandler(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
    	ArrayList<Peonza> alPeonzas ;
    	String opcion = request.getParameter("opcion");
    	
    	switch (opcion)
    	{
    		case "Home":
    			alPeonzas = new DatosPeonzas().seePeonza();

    	    	request.setAttribute("productos", alPeonzas);

    	    	RequestDispatcher view;
    	    	view = request.getRequestDispatcher("Home.jsp");
    	    	view.forward(request, response);
    	    	
    			break;
    		case "Backoffice":
    			alPeonzas = new DatosPeonzas().seePeonza();

    	    	request.setAttribute("productos", alPeonzas);

    	    	RequestDispatcher viewBackOffice;
    	    	viewBackOffice = request.getRequestDispatcher("BackOffice.jsp");
    	    	viewBackOffice.forward(request, response);
    			break;
    	}
    	
    	
    }
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Control() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
