package peonzas.domain;

public class Peonza {

	private String nombre;
	private int id;
	private String material;
	private int cantidad;
	private String descripcion;
	private double precio;
	private Cuerda cuerda;
	private Punta punta;
	private double tamanyo;
	
	
	
	
	public Peonza(){
		
	}
	
	public Peonza (String nombre, int id, String material, double tamanyo, double precio, int cantidad, String descripcion, Cuerda cuerda, Punta punta) {
		this.cantidad=cantidad;
		this.material=material;
		this.id=id;
		this.descripcion=descripcion;
		this.cuerda=cuerda;
		this.punta=punta;
		this.tamanyo=tamanyo;
		this.nombre=nombre;
		this.precio=precio;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripion() {
		return descripcion;
	}

	public void setDescripion(String descripion) {
		this.descripcion = descripion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Cuerda getCuerda() {
		return cuerda;
	}

	public void setCuerda(Cuerda cuerda) {
		this.cuerda = cuerda;
	}

	public Punta getPunta() {
		return punta;
	}

	public void setPunta(Punta punta) {
		this.punta = punta;
	}

	public double getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(double tamanyo) {
		this.tamanyo = tamanyo;
	}

	@Override
	public String toString() {
		return "Datos de la peonza: " 
				+ "\n\t1.Id: " + id
				+ "\n\t2.Nombre: " + nombre 
				+ "\n\t3.Descripción: " + descripcion
				+ "\n\t4.Material " + material 
				+ "\n\t5.Tamaño: " + tamanyo + " cm"
				+ "\n\t5.Cantidad: " + cantidad + " unidades"
				+ "\n\t6.Precio: " + precio + " € "
				+ "\n\t7.Cuerda: " + cuerda 
				+ "\n\t8.Punta: " + punta;
	}

	
	
	
}
