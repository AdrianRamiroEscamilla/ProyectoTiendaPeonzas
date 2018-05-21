package peonzas.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import peonzas.domain.Peonza;
import peonzas.modelo.PeonzaExpert;

import java.util.*;


/**
 * Servlet implementation class PeonzaSelect
 */
@WebServlet(
        name = "PeonzaSelect",
        urlPatterns = {"/PeonzaSelect.do"},
        asyncSupported = false)
public class PeonzaSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		/**
	     * @see HttpServlet#HttpServlet()
	     */
		//PASO 01: Recoger informacion
	    String c = request.getParameter("material");
	    PeonzaExpert be = new PeonzaExpert();
	    
	    //PASO 02: Recopilar la respuesta
	    List<Peonza> result = be.getBrands(c);
	    request.setAttribute("styles", result);
	    
	    //PASO 03: Salir      
	    RequestDispatcher view = request.getRequestDispatcher("Result.jsp");
	    view.forward(request, response);
	    //request.getRequestDispatcher("result.jsp").forward(request, response);
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
