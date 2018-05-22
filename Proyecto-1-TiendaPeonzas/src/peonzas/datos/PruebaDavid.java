package peonzas.datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import peonzas.domain.*;
import utilidades.Acceso;

public class PruebaDavid {
	
	//Metodo que devuelve todas las peonzas

			public void viewPeonza() throws SQLException {
				
			String query = "Select * from peonzas";
		    	String ruta = "jdbc:mysql://10.90.36.16/proyectopeonzas";
		    	String usuario = "admin";
		    	String password = "1111";
				
		    	ResultSet rs = Acceso.consultMySql(ruta, usuario , password, query);
		    	ArrayList<Peonza> alPeonza = new ArrayList<>();
		    		
					while (rs.next()){
					Peonza peonza = new Peonza(); //Lo hacemos dentro para que generee un objeto por cada linea
					peonza.setId(rs.getInt(1));
					peonza.setDescripcion(rs.getString(10));
					alPeonza.add(peonza); //guardamos el objeto en un arraylist porque para el siguiente bucle se lo pisa y se pierde
						
					}
			}

}
