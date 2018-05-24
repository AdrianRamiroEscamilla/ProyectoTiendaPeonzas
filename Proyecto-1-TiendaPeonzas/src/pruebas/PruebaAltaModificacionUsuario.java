package pruebas;

import peonzas.datos.DatosPeonzas;
import peonzas.datos.DatosUsuario;
import peonzas.domain.Usuario;

public class PruebaAltaModificacionUsuario {

	public static void main(String[] args) {

	pruebaAlta();
	pruebaChange();
	pruebaDelete();
	
}
	
	/**
	 * prueba para dar de alta a los productos
	 */
	public static void pruebaAlta(){
	//Para que la prueba funcione hay que cambiar los datos de nombre_usuario y email, ya que no pueden repetirse en la base de datos.
	DatosUsuario du = new DatosUsuario();
	Usuario usuario = new Usuario(0,"Admin19", "yuuup0i@correo.com", "1111", "Manolete","Cuellar Mateo", 0);
	if (du.userInput(usuario)){
	
		System.out.println(usuario.toString());}
	
	
	}
	/**
	 * prueba para la eliminación de los usuarios
	 */
	
	public static void pruebaDelete(){
		

		DatosUsuario du = new DatosUsuario();

	Usuario usuario = new Usuario(14,"Admin42", "yuuup042@correo.com", "1111", "Manolete","Cuellar Mateo", 0);
	du.userDelete(usuario);
		System.out.println(usuario.toString());}
	
	

/**
 * prueba para realizar cambios
 */

public static void pruebaChange(){
	

	DatosUsuario du = new DatosUsuario();

Usuario usuario = new Usuario(14,"Admin42", "yuuup042@correo.com", "1111", "Manolete","Cuellar Mateo", 0);
du.userChange(usuario);
	System.out.println(usuario.toString());}



}
