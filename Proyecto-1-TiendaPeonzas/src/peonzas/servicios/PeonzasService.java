package peonzas.servicios;

import java.util.ArrayList;
import java.util.List;


import peonzas.datos.DatosPeonzas;
import peonzas.domain.Cuerda;
import peonzas.domain.Peonza;
import peonzas.domain.Punta;


public class PeonzasService {

	/*Aquí igual, los otros arraylist están de más.
	 * además que yo creo que habría que trabajar con la capa Colección
	 * en lugar de directamente con los arraylist.
	 */
	
	List <Peonza> ListaPeonzas= new ArrayList<>();
	List <Cuerda> ListaCuerdas= new ArrayList<>();
	List <Punta> ListaPuntas= new ArrayList<>();
	
	
	
	/**
	 * metodo para a�adir peonzas
	 * @return
	 */
	public boolean altaPeonza(Peonza peonza, int punta, int cuerda) {
		return new DatosPeonzas().altaPeonza(peonza, punta, cuerda);
	}
	/**
	 * metodo para borrar peonzas
	 * @return
	 */
	public boolean deletePeonza(Peonza peonza) {
		return new DatosPeonzas().deletePeonza(peonza);
	}
	/**
	
	/**
	 * método para el tamaño de la coleccion
	 * @param peonza
	 * @return
	 */
	public int size(Peonza peonza){
		return ListaPeonzas.size();
	}
	public ArrayList<Peonza> seePeonzas(){
		
		return new DatosPeonzas().seePeonza();
	}
	
	/**
	 * metodo para mostrar peonzas por categoria
	 * @return
	 */
	
	public ArrayList<Peonza> searchCategoria(String categoria,String tipo){
		return new DatosPeonzas().buscaCategoria(categoria, tipo);
	}
	
	/**
	 * Buscar por id peonza
	 * @param peonza
	 * @return
	 */
	public Peonza searchId(String idPeonza)
	{
		return new DatosPeonzas().searchId(idPeonza);
	}
	 
}
