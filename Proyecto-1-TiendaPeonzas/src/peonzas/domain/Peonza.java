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
	private String imagen;
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
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "Peonza [nombre=" + nombre + ", id=" + id + ", material=" + material + ", cantidad=" + cantidad
				+ ", descripcion=" + descripcion + ", precio=" + precio + ", cuerda=" + cuerda + ", punta=" + punta
				+ ", imagen=" + imagen + ", tamanyo=" + tamanyo + "]";
	}

	


	
	
}
