package peonzas.domain;

public class Usuario {

int idUsuario;
String nombreUsuario;
String email;
String contrasena;
String nombre;
String apellidos;
int administrador;


/**
 * 
 */
public Usuario() {
	super();
	
}



/**
 * 
 * @param idUsuario
 * @param nombreUsuario
 * @param email
 * @param contrasena
 * @param nombre
 * @param apellidos
 * @param administrador
 */
public Usuario(int idUsuario, String nombreUsuario, String email, String contrasena, String nombre, String apellidos,
		int administrador) {
	super();
	this.idUsuario = idUsuario;
	this.nombreUsuario = nombreUsuario;
	this.email = email;
	this.contrasena = contrasena;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.administrador = administrador;
}



/**
 * 
 * @return
 */
public int getIdUsuario() {
	return idUsuario;
}

/**
 * 
 * @param idUsuario
 */

public void setIdUsuario(int idUsuario) {
	this.idUsuario = idUsuario;
}

/**
 * 
 * @return
 */

public String getNombreUsuario() {
	return nombreUsuario;
}

/**
 * 
 * @param nombre_usuario
 */

public void setNombreUsuario(String nombre_usuario) {
	this.nombreUsuario = nombre_usuario;
}

/**
 * 
 * @return
 */

public String getEmail() {
	return email;
}

/**
 * 
 * @param email
 */

public void setEmail(String email) {
	this.email = email;
}

/**
 * 
 * @return
 */

public String getContrasena() {
	return contrasena;
}

/**
 * 
 * @param contrasena
 */

public void setContrasena(String contrasena) {
	this.contrasena = contrasena;
}

/**
 * 
 * @return
 */

public String getNombre() {
	return nombre;
}

/**
 * 
 * @param nombre
 */

public void setNombre(String nombre) {
	this.nombre = nombre;
}

/**
 * 
 * @return
 */

public String getApellidos() {
	return apellidos;
}

/**
 * 
 * @param apellidos
 */

public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

/**
 * 
 * @return
 */

public int getAdministrador() {
	return administrador;
}
/**
 * 
 * @param administrador
 */


public void setAdministrador(int administrador) {
	this.administrador = administrador;
}


/**
 * 
 */

@Override
public String toString() {
	return "Usuario [idUsuario=" + idUsuario + ", nombre_usuario=" + nombreUsuario + ", email=" + email
			+ ", contrasena=" + contrasena + ", nombre=" + nombre + ", apellidos=" + apellidos + ", administrador="
			+ administrador + "]";
}


}
