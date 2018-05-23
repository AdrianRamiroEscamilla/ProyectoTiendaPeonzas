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
		    	Peonza peonza; //asignamos la variable fuera para qie se vea desde fuera del while
		    		
					while (rs.next()){
					peonza = new Peonza(); //Pero la creamos dentro para que genere un objeto por cada linea
					peonza.setId(rs.getInt(1));
					peonza.setDescripcion(rs.getString(10));
					alPeonza.add(peonza); //guardamos el objeto en un arraylist porque para el siguiente bucle se lo pisa y se pierde
					}

			}

}
