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
import peonzas.datos.DatosUsuario;
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
    	if (request.getParameter("opcion").equals("Detalles"))  {
    	    // cadena no está vacía
    		processDetailPeonza(request,response);   	
    		
    	}else{
    	processHome(request, response);
    	}
    	//String opcion= request.getParameter("opcion");
    	
    	/*
    	if (request.getParameter("opcion")!=null){
    		    		
    		processDetailPeonza(request,response);
    	}else if (request.getParameter("opcion")==null){
    		
    		processHome(request, response);   	
		    	
    		} */
    	ArrayList<Peonza> alPeonzas;
    	ArrayList<Usuario> alUsuarios;
    	RequestDispatcher view;
    	String opcion = request.getParameter("opcion");
    	
    	switch (opcion)
    	{
    		case "Home":
    			alPeonzas = new DatosPeonzas().seePeonza();

    	    	request.setAttribute("productos", alPeonzas);

    	    	
    	    	view = request.getRequestDispatcher("Home.jsp");
    	    	view.forward(request, response);
    	    	
    			break;
    		case "Backoffice":
    			alPeonzas = new DatosPeonzas().seePeonza();
    			//alUsuarios = new DatosUsuario().seeUsuarios();
    	    	request.setAttribute("productos", alPeonzas);
    	    	//request.setAttribute("usuarios", alUsuarios );
    	    	
    	    	view = request.getRequestDispatcher("BackOffice.jsp");
    	    	view.forward(request, response);
    			break;
    		case "Detalles":
    			processDetailPeonza(request, response);
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
	
	protected void processDetailPeonza(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idPeonza = request.getParameter("idPeonza");
		request.setAttribute("idPeonza", idPeonza);
		
		RequestDispatcher view;
    	view = request.getRequestDispatcher("vistaDetallada.jsp");
    	view.forward(request, response);
	}
	
	
	
	

	

}
