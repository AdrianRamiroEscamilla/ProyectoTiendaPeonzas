package peonzas.control;


import java.sql.*;
import javax.sql.*;

import utilidades.Acceso;


public class EjemploUsoAccesoADatos {

    public static void main(String[] args) throws SQLException {
    	/**
    	 * Para el func
    	 */
    	String query = "Select * from cuerdas";
    	String ruta = "jdbc:mysql://localhost/proyectoPeonzas";
    	String usuario = "root";
    	String password = "1111";
		ResultSet rs =    Acceso.consultMySql(ruta, usuario , password, query);
    	
    	while (rs.next()){
        System.out.println("Código "+rs.getString(1));
        System.out.println("Nombre "+rs.getString(2));
    	System.out.println("Longitud "+rs.getString(3));

    	System.out.println("Grosor "+rs.getString(4));

    	}
    	

        	
    	

    	
    	
}}
    	
    	
    	

