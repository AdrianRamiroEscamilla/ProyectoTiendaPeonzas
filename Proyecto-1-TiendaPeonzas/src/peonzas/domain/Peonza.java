package peonzas.domain;

public class Peonza {

	
	private String nombre;
	private int id;
	private String material;
	private int cantidad;
	private String imagen;
	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

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
				+ "\n\t3.Descripci�n: " + descripcion
				+ "\n\t4.Material " + material 
				+ "\n\t5.Tama�o: " + tamanyo + " cm"
				+ "\n\t5.Cantidad: " + cantidad + " unidades"
				+ "\n\t6.Precio: " + precio + " � "
				+ "\n\t7.Cuerda: " + cuerda 
				+ "\n\t8.Punta: " + punta;
	}

	
	
	
}
