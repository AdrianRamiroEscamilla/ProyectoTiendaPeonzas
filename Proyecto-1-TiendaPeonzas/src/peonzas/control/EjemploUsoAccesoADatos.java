package peonzas.control;


import java.sql.*;
import javax.sql.*;

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
    	

        	
    	

    	
    	
}}
    	
    	
    	

