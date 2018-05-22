package peonzas.modelo;

import java.util.ArrayList;
import java.util.List;

import peonzas.domain.Cuerda;
import peonzas.domain.Peonza;
import peonzas.domain.Punta;

public class Coleccion {

	List<Peonza> listaPeonzas=new ArrayList<>();

	/*Los siguientes Arraylist no serán necesarios porque
	 * tened en cuenta que punta y cuerda son atributos de Peonza.
	 */
	 
	
	List<Punta>ListaPuntas=new ArrayList<>();
	List<Cuerda> ListaCuerdas=new ArrayList<>();
	
	public Coleccion(){
		
	}
	
	public Coleccion(List<Peonza> ListaPeonzas, List<Cuerda> ListaCuerdas, List<Punta> ListaPuntas){
		this.listaPeonzas=ListaPeonzas;
		this.ListaCuerdas=ListaCuerdas;
		this.ListaPuntas=ListaPuntas;
	}

	public List<Peonza> getListaPeonzas() {
		return listaPeonzas;
	}

	public void setListaPeonzas(List<Peonza> listaPeonzas) {
		listaPeonzas = listaPeonzas;
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
		return "Coleccion [ListaPeonzas=" + listaPeonzas + ", ListaPuntas=" + ListaPuntas + ", ListaCuerdas="
				+ ListaCuerdas + "]";
	}
	/**
	 * método para añadir nuevos elementos
	 * @param peonza
	 */
	public void add(Peonza peonza){
		listaPeonzas.add(peonza);
	}
	/**
	 * método para conocer el tamaño
	 * @param peonza
	 */


	public int size() {
		// TODO Auto-generated method stub
		return listaPeonzas.size();
	}
	/**
	 * Método que devuelve un objeto de la colección.
	 * @param num
	 * @return
	 */
	public Peonza get(int num){
		return listaPeonzas.get(num);
	}
}
