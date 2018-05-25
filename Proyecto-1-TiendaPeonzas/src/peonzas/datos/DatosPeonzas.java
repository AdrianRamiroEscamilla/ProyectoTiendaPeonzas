package peonzas.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import peonzas.domain.Cuerda;
import peonzas.domain.Peonza;
import peonzas.domain.Punta;
import utilidades.Acceso;

public class DatosPeonzas {
	ArrayList<Peonza> alPeonzas = new ArrayList<>();
	

	public ArrayList<Peonza> seePeonza() {

		String query = "Select * from peonzas";
		String ruta = "jdbc:mysql://10.90.36.16/proyectopeonzas";
		String usuario = "admin";
		String password = "1111";

		ResultSet rs = Acceso.consultMySql(ruta, usuario, password, query);
		Peonza peonza;
		Punta punta ;
		Cuerda cuerda ;
		try {
			while (rs.next()) {
				peonza= new Peonza();
				punta = new Punta();
				cuerda = new Cuerda();
				peonza.setId(rs.getInt(1));
				peonza.setNombre(rs.getString(2));
				peonza.setTamanyo(rs.getDouble(3));
				peonza.setPrecio(rs.getDouble(4));
				peonza.setImagen(rs.getString(5));
				peonza.setMaterial(rs.getString(6));
				peonza.setCantidad(rs.getInt(7));
				punta.setIdPunta(rs.getInt(8));
				peonza.setPunta(punta);
				cuerda.setId(rs.getInt(9));
				peonza.setCuerda(cuerda);
				peonza.setDescripcion(rs.getString(10));

				alPeonzas.add(peonza);
				System.out.println(peonza.toString());

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return alPeonzas;

	}
	/**
	 * buscaCategoria
	 * Sirve para buscar en todas las categorías del menú vertical derecho.
	 * 
	 * @param categoria
	 * @param tipo
	 * @return ArrayList<Peonza>
	 */
	
	public ArrayList<Peonza> buscaCategoria(String categoria, String tipo ) {
		ArrayList<Peonza> apeonzas = new ArrayList<>();

		if (categoria.equals("material")){
			tipo = "='"+tipo+"'";
		}
		else if(categoria.equals("punta"))
		{
			tipo = "='"+tipo+"'";
		}
		if(categoria.equals("cuerda"))
		{
			tipo = "='"+tipo+"'";
		}
	
		String query = "Select * from peonzas WHERE "+categoria+tipo;
		String ruta = "jdbc:mysql://10.90.36.16/proyectopeonzas";
		String usuario = "admin";
		String password = "1111";

		ResultSet rs = Acceso.consultMySql(ruta, usuario, password, query);
		Peonza peonza;
		Cuerda cuerda = new Cuerda();
		Punta punta = new Punta();
		try {
			while (rs.next()) {
				peonza= new Peonza();
				peonza.setId(rs.getInt(1));
				peonza.setNombre(rs.getString(2));
				peonza.setTamanyo(rs.getDouble(3));
				peonza.setPrecio(rs.getDouble(4));
				peonza.setImagen(rs.getString(5));
				peonza.setMaterial(rs.getString(6));
				peonza.setCantidad(rs.getInt(7));
				peonza.setDescripcion(rs.getString(10));
				punta.setIdPunta(rs.getInt(8));
				peonza.setPunta(punta);
				cuerda.setId(rs.getInt(9));
				peonza.setCuerda(cuerda);

				apeonzas.add(peonza);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(apeonzas.size());

		return apeonzas;
	
	}
	
	public Peonza searchId(String idPeonza){
		
		String query = "Select * from peonzas WHERE idPeonza ='"+idPeonza+"'";
		String ruta = "jdbc:mysql://10.90.36.16/proyectopeonzas";
		String usuario = "admin";
		String password = "1111";

		ResultSet rs = Acceso.consultMySql(ruta, usuario, password, query);
		Peonza peonza = new Peonza();
		Punta punta = new Punta();
		Cuerda cuerda = new Cuerda();
		try {
			
			while(rs.next()){
			peonza.setId(rs.getInt(1));
			peonza.setNombre(rs.getString(2));
			peonza.setTamanyo(rs.getInt(3));
			peonza.setPrecio(rs.getDouble(4));
			peonza.setImagen(rs.getString(5));
			peonza.setMaterial(rs.getString(6));
			peonza.setCantidad(rs.getInt(7));
			punta.setIdPunta(rs.getInt(8));
			peonza.setPunta(punta);
			cuerda.setId(rs.getInt(9));
			peonza.setCuerda(cuerda);
			peonza.setDescripcion(rs.getString(10));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return peonza;
		
	}
}
