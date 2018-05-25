package pruebas;

import peonzas.datos.DatosUsuario;
import peonzas.domain.Usuario;

public class PruebaSearchUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatosUsuario du = new DatosUsuario();
		Usuario user = du.searchUser(4);
		System.out.println(user.toString());
	}

}
