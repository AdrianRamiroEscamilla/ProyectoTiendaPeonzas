package peonzas.datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import peonzas.domain.Peonza;
import utilidades.Acceso;

public class DatosPeonzas 
{
	ArrayList<Peonza> alPeonzas = new ArrayList<>();
	Peonza peonza = new Peonza();
	public ArrayList<Peonza> seePeonza() 
	{
		
	  	String query = "Select * from peonzas";
    	String ruta = "jdbc:mysql://10.90.36.16/proyectopeonzas";
    	String usuario = "admin";
    	String password = "1111";
		
    	ResultSet rs = Acceso.consultMySql(ruta, usuario , password, query);
	
    	
    
    		
			try {
				while (rs.next())
				{
				peonza.setId(rs.getInt(1));
				peonza.setNombre(rs.getString(2));
				peonza.setTamanyo(rs.getDouble(3));
				peonza.setPrecio(rs.getDouble(4));		
				peonza.setImagen(rs.getString(5));
				peonza.setMaterial(rs.getString(6));
				peonza.setCantidad(rs.getInt(7));
				peonza.setDescripcion(rs.getString(10));
				System.out.println(peonza.toString());	
				alPeonzas.add(peonza);
				
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return alPeonzas;	
    	
	}
}
