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
		DatosUsuario alUsuarios = new DatosUsuario();

    	RequestDispatcher view;
    	
     	String name = request.getParameter("name");
     	
     	System.out.println("el name es "+name);
     	if (name!=null){
     		
     		switch (name){
     		 
     		case "guardar":
     			Usuario usuario = new Usuario();
        		usuario.setIdUsuario(Integer.parseInt(request.getParameter("id")));
        		usuario.setNombreUsuario(request.getParameter("nombreUsuario"));
        		usuario.setNombre(request.getParameter("nombre"));
        		usuario.setApellidos(request.getParameter("apellidos"));
        		usuario.setEmail(request.getParameter("email"));
        		usuario.setContrasena(request.getParameter("contrasena"));
        		usuario.setAdministrador(Integer.parseInt(request.getParameter("administrador")));
        		System.out.println(usuario.toString());
        		alUsuarios.userChange(usuario);
        		response.sendRedirect("Control?opcion=Backoffice");
     			break;
     		
     		case "crear":
     			Usuario userNew = new Usuario();
        		userNew.setIdUsuario(Integer.parseInt(request.getParameter("id")));
        		userNew.setNombreUsuario(request.getParameter("nombreUsuario"));
        		userNew.setNombre(request.getParameter("nombre"));
        		userNew.setApellidos(request.getParameter("apellidos"));
        		userNew.setEmail(request.getParameter("email"));
        		userNew.setContrasena(request.getParameter("contrasena"));
        		userNew.setAdministrador(Integer.parseInt(request.getParameter("administrador")));
        		System.out.println(userNew.toString());
        		alUsuarios.userInput(userNew);
        		response.sendRedirect("Control?opcion=Backoffice");
     			break;
     			
     		case "detalle":
     		int  idd = 0;
    		try {

    			 idd = Integer.parseInt(request.getParameter("id"));
    			System.out.println("el id es" + idd);
    		}catch (Exception e){
    			e.printStackTrace();
    		}
    		Usuario usuario1 = alUsuarios.searchUser( idd);
    		System.out.println(usuario1.getNombre());
        	request.setAttribute("usuario", usuario1 );
        	
        	view = request.getRequestDispatcher("UserDetail.jsp");
        	view.forward(request, response);
        	break;
        	
     		case "eliminar":
     		
     			int	 idd1 =0;
        		try {

        		idd1= Integer.parseInt(request.getParameter("id"));
        			System.out.println("el id a eliminar es" + idd1);
        		}catch (Exception e){
        			e.printStackTrace();
        		}
        		Usuario usuariod = new Usuario();
        		usuariod.setIdUsuario( idd1);
        	 alUsuarios.userDelete(usuariod);
    		response.sendRedirect("Control?opcion=Backoffice");
 			break;
	}}
    
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
