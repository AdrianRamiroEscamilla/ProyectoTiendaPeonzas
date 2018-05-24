package peonzas.datos;

import java.sql.SQLException;

import peonzas.domain.Usuario;
import utilidades.Acceso;

public class DatosUsuario {
	
	/**
	 * userInput
	 * Método para añadir nuevos usuarios
	 * @param usuario
	 * @return
	 */
	public boolean userInput(Usuario usuario){
		int num = 0;
		boolean booleano = false;
		String ruta = "jdbc:mysql://10.90.36.16:3306/proyectopeonzas";
		String user = "admin";
		String password = "1111";
		//String query = "insert into usuarios (nombre_usuario, email, contraseña, nombre, apellidos, administrador) values ('you', 'eee@coreo.com', '1111','nombre','apellidos',1)";

		String query = "insert into usuarios (nombre_usuario, email, contraseña, nombre, apellidos, administrador)values ('"+usuario.getNombre_usuario()+"','"+usuario.getEmail()+"','"+usuario.getContrasena()+"','"+usuario.getNombre()+"',"
						+ "'"+usuario.getApellidos()+"','"+usuario.getAdministrador()+"')";
	
		
		try {
			 num =Acceso.modifMySql(ruta, user, password, query);
			booleano=true;
		} catch (SQLException e) {
			booleano = false;
			e.printStackTrace();
		}
		System.out.println(num);
		return booleano;
		
		
	}

}
