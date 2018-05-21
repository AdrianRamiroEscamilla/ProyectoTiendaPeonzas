package peonzas.modelo;

import java.util.ArrayList;
import java.util.List;

import peonzas.domain.Cuerda;
import peonzas.domain.Peonza;
import peonzas.domain.Punta;

public class Coleccion {

	List<Peonza>ListaPeonzas=new ArrayList<>();
	List<Punta>ListaPuntas=new ArrayList<>();
	List<Cuerda> ListaCuerdas=new ArrayList<>();
	
	public Coleccion(){
		
	}
	
	public Coleccion(List<Peonza> ListaPeonzas, List<Cuerda> ListaCuerdas, List<Punta> ListaPuntas){
		this.ListaPeonzas=ListaPeonzas;
		this.ListaCuerdas=ListaCuerdas;
		this.ListaPuntas=ListaPuntas;
	}

	public List<Peonza> getListaPeonzas() {
		return ListaPeonzas;
	}

	public void setListaPeonzas(List<Peonza> ListaPeonzas) {
		ListaPeonzas = ListaPeonzas;
	}

	public List<Punta> getListaPuntas() {
		return ListaPuntas;
	}

	public void setListaPuntas(List<Punta> ListaPuntas) {
		ListaPuntas = ListaPuntas;
	}

	public List<Cuerda> getListaCuerdas() {
		return ListaCuerdas;
	}

	public void setListaCuerdas(List<Cuerda> ListaCuerdas) {
		ListaCuerdas = ListaCuerdas;
	}

	@Override
	public String toString() {
		return "Coleccion [ListaPeonzas=" + ListaPeonzas + ", ListaPuntas=" + ListaPuntas + ", ListaCuerdas="
				+ ListaCuerdas + "]";
	}
	
	
}
