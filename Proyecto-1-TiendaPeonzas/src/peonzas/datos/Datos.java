package peonzas.datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import peonzas.domain.Cuerda;
import peonzas.domain.Peonza;
import peonzas.domain.Punta;
import peonzas.modelo.Coleccion;
import utilidades.Acceso;

public class Datos {
	Coleccion coleccion = new Coleccion();
	
	
	public ArrayList atack(){
	  	String query = "Select * from peonzas";
    	String ruta = "jdbc:mysql://10.90.36.16/proyectopeonzas";
    	String usuario = "admin";
    	String password = "1111";
		
    	ResultSet rs = Acceso.consultMySql(ruta, usuario , password, query);
		
			try {
				while (rs.next()){
				Peonza peonza = new Peonza();
				Punta punta = new Punta();
				Cuerda cuerda = new Cuerda();
				peonza.setId(rs.getInt(1));
				peonza.setNombre(rs.getString(2));  
				peonza.setTamanyo((rs.getFloat(3)));
				peonza.setPrecio((rs.getFloat(4)));
				peonza.setImagen(rs.getString(5));
				peonza.setMaterial(rs.getString(6));
				peonza.setCantidad(rs.getInt(7));
				punta.setIdPunta(rs.getInt(8));
				peonza.setPunta(punta);
				cuerda.setId(rs.getInt(9));
				peonza.setCuerda(cuerda);
				peonza.setMaterial(rs.getString(10));

				coleccion.add(peonza);
				
				
				
				System.out.println(coleccion.size());
				
				
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	
    	ArrayList al = (ArrayList) coleccion.getListaPeonzas();

    	
    	return   al;
    	
    	
    	
	}
	
	
	

	
	
	/*
	 * 
	 * private String nombre;
	private int id;
	private String material;
	private int cantidad;
	private String descripcion;
	private double precio;
	private Cuerda cuerda;
	private Punta punta;
	private double tamanyo;
	
	 */

}
