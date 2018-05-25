package peonzas.datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

		String query = "insert into usuarios (nombre_usuario, email, contraseña, nombre, apellidos, administrador)values ('"+usuario.getNombreUsuario()+"','"+usuario.getEmail()+"','"+usuario.getContrasena()+"','"+usuario.getNombre()+"',"
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
	
	/**
	 * userChange
	 * Método para modificar usuarios
	 * @param usuario
	 * @return
	 */
	public boolean userChange(Usuario usuario){
		int num = -3;
		boolean booleano = false;
		String ruta = "jdbc:mysql://10.90.36.16:3306/proyectopeonzas";
		String user = "admin";
		String password = "1111";

		String query = 	"update usuarios set nombre_usuario='"+usuario.getNombreUsuario()+"', email='"+usuario.getEmail()+"', contraseña='"+usuario.getContrasena()+"', nombre='"+usuario.getNombre()+"', apellidos='"+usuario.getApellidos()+"', administrador="+usuario.getAdministrador()+" WHERE idUsuario="+usuario.getIdUsuario();

		
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

	

	/**
	 * userDelete
	 * Método para eliminar usuarios
	 * @param usuario
	 * @return
	 */
	public boolean userDelete(Usuario usuario){
		int num = -3;
		boolean booleano = false;
		String ruta = "jdbc:mysql://10.90.36.16:3306/proyectopeonzas";
		String user = "admin";
		String password = "1111";

		String query = 	"delete from usuarios WHERE idUsuario="+usuario.getIdUsuario();

		
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
	
	/**
	 * seeUsuarios
	 * Método para listar los usuarios
	 * @return
	 */
	public ArrayList <Usuario> seeUsuarios (){
		ArrayList <Usuario> users = new ArrayList<>();
		String ruta = "jdbc:mysql://10.90.36.16:3306/proyectopeonzas";
		String user = "admin";
		String password = "1111";

		String query = 	"select * from usuarios";
		try {
			 ResultSet Rs =Acceso.consultMySql(ruta, user, password, query);
			 while (Rs.next()){
				 Usuario usuario = new Usuario();
				 usuario.setIdUsuario(Rs.getInt(1));
				 usuario.setNombreUsuario(Rs.getString(2));
				 usuario.setEmail(Rs.getString(3));
				 usuario.setContrasena(Rs.getString(4));
				 usuario.setNombre(Rs.getString(5));
				 usuario.setApellidos(Rs.getString(6));
				 usuario.setAdministrador(Rs.getInt(7));
				 
				 users.add(usuario);
				 System.out.println(usuario.getNombre());
			 }
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return users;
	}

	/**
	 * seeUsuarios
	 * Método para listar los usuarios
	 * @return
	 */
	public Usuario searchUser (int i){
		String ruta = "jdbc:mysql://10.90.36.16:3306/proyectopeonzas";
		String user = "admin";
		String password = "1111";
		Usuario usuario = new Usuario();
		String query = 	"select * from usuarios WHERE idUsuario="+i;
		try {
			 ResultSet Rs =Acceso.consultMySql(ruta, user, password, query);
			 while (Rs.next()){
				 usuario.setIdUsuario(Rs.getInt(1));
				 usuario.setNombreUsuario(Rs.getString(2));
				 usuario.setEmail(Rs.getString(3));
				 usuario.setContrasena(Rs.getString(4));
				 usuario.setNombre(Rs.getString(5));
				 usuario.setApellidos(Rs.getString(6));
				 usuario.setAdministrador(Rs.getInt(7));
				 
				 System.out.println(usuario.getNombre());
			 }
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usuario;
	}

	
	
	
	
	
}
