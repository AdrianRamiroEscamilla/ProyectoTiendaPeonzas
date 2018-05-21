package peonzas.domain;

public class Cuerda {
	
	private String nombre;
	private double longitud;
	private double grosor;
	private int id;
	
	public Cuerda(){
		
	}
	
	public Cuerda(String nombre, double longitud, double grosor, int id){
		this.id=id;
		this.longitud=longitud;
		this.nombre=nombre;
		this.grosor=grosor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getGrosor() {
		return grosor;
	}

	public void setGrosor(double grosor) {
		this.grosor = grosor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Características de la cuerda: "
				+ "\n\t1.Id: " + id + ""
				+ "\n\t2.Nombre: " + nombre + ""
				+ "\n\t2.Longitud:" + longitud + " cm."
				+ "\n\t3.Grosor: " + grosor + " cm.";
				
	}
	
	
}
