package peonzas.servicios;

import java.util.ArrayList;
import java.util.List;

import peonzas.domain.Cuerda;
import peonzas.domain.Peonza;
import peonzas.domain.Punta;

public class PeonzasMetodos {

	
	List <Peonza> ListaPeonzas= new ArrayList<>();
	List <Cuerda> ListaCuerdas= new ArrayList<>();
	List <Punta> ListaPuntas= new ArrayList<>();
	
	/**
	 * metodo para mostrar la lista de peonzas
	 * @return
	 */
	public void muestraPeonzas(){
		
		for(Peonza peonza:ListaPeonzas){
			System.out.println(peonza.toString());
		}
	}
	
	/**
	 * metodo para buscar peonzas
	 * @return
	 */
	public List<Peonza> buscaPeonzas(String material){
		for(int i=0;i<ListaCuerdas.size();i++){
			if(ListaPeonzas.get(i).equals(material)){
				System.out.println(ListaCuerdas.get(i));
			}
		}
		return ListaPeonzas;
		
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
