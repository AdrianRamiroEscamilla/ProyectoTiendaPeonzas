package peonzas.servicios;

import java.util.ArrayList;
import java.util.List;

import peonzas.datos.Datos;
import peonzas.domain.Cuerda;
import peonzas.domain.Peonza;
import peonzas.domain.Punta;
import peonzas.modelo.Coleccion;

public class PeonzasService {

	/*Aquí igual, los otros arraylist están de más.
	 * además que yo creo que habría que trabajar con la capa Colección
	 * en lugar de directamente con los arraylist.
	 */
	
	List <Peonza> listaPeonzas= new ArrayList<>();
	List <Cuerda> ListaCuerdas= new ArrayList<>();
	List <Punta> ListaPuntas= new ArrayList<>();
	Datos datos = new Datos();
	Coleccion coleccion = new Coleccion();
	
	/**
	 * InitProduct carga los datos iniciales de los productos.
	 * @return
	 */
	public Coleccion InitProduct(){
		return datos.atack();
	}
	
	/**
	 * metodo para mostrar la lista de peonzas
	 * @return
	 */
	public void add(Peonza peonza){
		listaPeonzas.add(peonza);
	}
	/**
	 * método para el tamaño de la coleccion
	 * @param peonza
	 * @return
	 */
	public int size(Peonza peonza){
		return listaPeonzas.size();
	}
	public void muestraPeonzas(){
		
		for(Peonza peonza:listaPeonzas){
			System.out.println(peonza.toString());
		}
	}
	
	/**
	 * metodo para buscar peonzas
	 * @return
	 */
	
	public void buscaPeonzas(String material){
		int i=0;
		for(i=0;i<ListaCuerdas.size();i++){
			if(listaPeonzas.get(i).equals(material)){
				System.out.println(ListaCuerdas.get(i));
			}
		}
	}
	
	/**
	 * metodo para mostrar puntas
	 * @return
	 */
	
	public void muestraPuntas(){
		for(Punta punta:ListaPuntas){
			System.out.println(punta.toString());
		}
	}
	
	/**
	 * metodo para mostrar cuerdas
	 * @return
	 */
	
	public void muestraCuerdas(){
		for(Cuerda cuerda:ListaCuerdas){
			System.out.println(cuerda.toString());
		}
		
	}
}
