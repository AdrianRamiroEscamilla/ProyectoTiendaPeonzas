package pruebas;

import peonzas.datos.DatosPeonzas;
import peonzas.datos.DatosUsuario;
import peonzas.domain.Usuario;

public class PruebaAltaUsuario {

	public static void main(String[] args) {

		//Para que la prueba funcione hay que cambiar los datos de nombre_usuario y email, ya que no pueden repetirse en la base de datos.
		DatosUsuario du = new DatosUsuario();
		Usuario usuario = new Usuario(0,"Admin19", "yuuup0i@correo.com", "1111", "Manolete","Cuellar Mateo", 0);
		if (du.userInput(usuario)){
		
			System.out.println(usuario.toString());}
		
		
	}

}
