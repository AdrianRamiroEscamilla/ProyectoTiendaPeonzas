package peonzas.domain;

public class Peonza {

	
	private String nombre;
	private int id;
	private String material;
	private int cantidad;
	private String imagen;
	

	
	private String descripcion;
	private double precio;
	private Cuerda cuerda;
	private Punta punta;
	private double tamanyo;
	
	
	
	
	public Peonza(){
		
	}
	


	public Peonza(String nombre, int id, String material, int cantidad, String imagen, String descripcion,
			double precio, Cuerda cuerda, Punta punta, double tamanyo) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.material = material;
		this.cantidad = cantidad;
		this.imagen = imagen;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cuerda = cuerda;
		this.punta = punta;
		this.tamanyo = tamanyo;
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

	/*
	@Override
	public String toString() {
<<<<<<< HEAD
		return "Datos de la peonza: " 
				+ "\n\t1.Id: " + id
				+ "\n\t2.Nombre: " + nombre 
				+ "\n\t3.Descripci�n: " + descripcion
				+ "\n\t4.Material " + material 
				+ "\n\t5.Tama�o: " + tamanyo + " cm"
				+ "\n\t5.Cantidad: " + cantidad + " unidades"
				+ "\n\t6.Precio: " + precio + " � "
				+ "\n\t7.Cuerda: " + cuerda 
				+ "\n\t8.Punta: " + punta;
=======
		return "Peonza [nombre=" + nombre + ", id=" + id + ", material=" + material + ", cantidad=" + cantidad
				+ ", descripcion=" + descripcion + ", precio=" + precio + ", cuerda=" + cuerda + ", punta=" + punta
				+ ", imagen=" + imagen + ", tamanyo=" + tamanyo + "]";
>>>>>>> 8ea036e525040332e5728b3d51c7e8567bf0405c
	}*/

	


	
	
}
