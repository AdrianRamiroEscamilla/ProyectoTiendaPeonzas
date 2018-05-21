package peonzas.domain;

public class Punta {

	private int idPunta;
	private String nombre;
	private String tipo;
	
	public Punta(){
		
	}
	
	public Punta(int idPunta, String nombre, String tipo) {
		this.idPunta=idPunta;
		this.nombre=nombre;
		this.tipo=tipo;
	}

	public int getIdPunta() {
		return idPunta;
	}

	public void setIdPunta(int idPunta) {
		this.idPunta = idPunta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Características de la punta:"
				+ "\n\t1.Id: " + idPunta 
				+ "\n\t2.Nombre: " + nombre 
				+ "\n\t3.Tipo=" + tipo;
	}
	
	
}
