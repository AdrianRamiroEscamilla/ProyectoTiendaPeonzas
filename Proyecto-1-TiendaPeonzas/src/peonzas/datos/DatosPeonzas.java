package peonzas.datos;

import java.sql.ResultSet;
import java.sql.SQLException;

import peonzas.domain.Peonza;
import utilidades.Acceso;

public class DatosPeonzas 
{
	Peonza peonza = new Peonza();
	public Peonza seePeonza()
	{
		
    	String query = "Select * from cuerdas";
    	String ruta = "jdbc:mysql://10.90.36.1/proyectoPeonzas";
    	String usuario = "admin";
    	String password = "1111";
		ResultSet rs = null;
		try {
			rs = Acceso.consultMySql(ruta, usuario , password, query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	try {
			while (rs.next()){
			
			System.out.println("Codigo "+rs.getInt(0));
			
			System.out.println("Nombre "+rs.getString(1));
			
			System.out.println("Longitud "+rs.getString(2));

			System.out.println("Grosor "+rs.getString(3));
			
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return peonza;
	}
}
