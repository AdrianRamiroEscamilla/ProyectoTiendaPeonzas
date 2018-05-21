package peonzas.modelo;

import java.util.ArrayList;
import java.util.List;

import peonzas.domain.Cuerda;
import peonzas.domain.Peonza;
import peonzas.domain.Punta;

public class PeonzaMetodos {

	List<Peonza>ListaPeonzas=new ArrayList<>();
	List<Punta>ListaPuntas=new ArrayList<>();
	List<Cuerda>ListaCuerdas=new ArrayList<>();
	
	/**
	 * metodo para mostrar la lista de peonzas
	 * @return
	 */
	public List<Peonza> muestraPeonzas(){
		int i=0;

		for(Peonza p:ListaPeonzas){
			
		}
		return null;
		
	}
	
	/**
	 * metodo para buscar peonzas
	 * @return
	 */
	public List<Peonza> buscaPeonzas(){
		
		return ListaPeonzas;
		
	}
	
	/**
	 * metodo para mostrar puntas
	 * @return
	 */
	public List<Punta> muestraPuntas(){
		return ListaPuntas;
		
		
	}
	
	/**
	 * metodo para mostrar cuerdas
	 * @return
	 */
	public List<Cuerda> muestraCuerdas(){
		return ListaCuerdas;
	}
}
