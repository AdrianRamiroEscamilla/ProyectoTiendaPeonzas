package peonzas.control;


import java.sql.*;
import javax.sql.*;
import java.util.*;

import peonzas.domain.Peonza;
import peonzas.modelo.Coleccion;
import peonzas.servicios.PeonzasService;
import utilidades.Acceso;


public class EjemploUsoAccesoADatos {

    public static void main(String[] args) {
    	/**
    	 * Para el func
    	 */
    	String query = "Select * from cuerdas";
    	String ruta = "jdbc:mysql://10.90.36.16:3306/proyectopeonzas";
    	String usuario = "admin";
    	String password = "1111";
		ResultSet rs =    Acceso.consultMySql(ruta, usuario , password, query);

	    PeonzasService pservice = new PeonzasService();

		Coleccion  coleccion = new Coleccion();
		Coleccion  list =  pservice.InitProduct();
	      // Use iterator to display contents of al
	      System.out.print("Original contents of al: ");
	      for (int i=0; i<list.size();i++ ){
			   Peonza peonza = (Peonza) list.get(i);
			   System.out.println(peonza.getNombre());

	      }
	      
	      /*
	      Iterator itr = Arrays.asList(coleccion.getListaPeonzas()).iterator();
	      
	      while(itr.hasNext()) {
		   Peonza peonza = (Peonza) itr.next();
		   System.out.println(peonza.getNombre());
	   }
	    /*
    	try {
			while (rs.next()){
			System.out.println("Codigo "+rs.getString(1));
			System.out.println("Nombre "+rs.getString(2));
			System.out.println("Longitud "+rs.getString(3));

			System.out.println("Grosor "+rs.getString(4));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    		*/

        	
    	

    	
    	
}}
    	
    	
    	

