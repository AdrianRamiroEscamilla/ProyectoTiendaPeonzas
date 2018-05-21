package peonzas.domain;

public class Peonza {

	private String color;
	private int peso;
	private String marca;
	private String material;
	
	
	public Peonza(){
		
	}
	
	public Peonza(String color, int peso, String marca, String material) {
		this.color=color;
		this.marca=marca;
		this.material=material;
		this.peso=peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Peonza [color=" + color + ", peso=" + peso + ", marca=" + marca + ", material=" + material + "]";
	}
	
	
}
