package peonzas.servicios;

import java.util.ArrayList;
import java.util.List;

import peonzas.datos.Datos;
import peonzas.domain.Cuerda;
import peonzas.domain.Peonza;
import peonzas.domain.Punta;
import peonzas.modelo.Coleccion;

public class PeonzasService implements IPeonzasService{

	/*Aquí igual, los otros arraylist están de más.
	 * además que yo creo que habría que trabajar con la capa Colección
	 * en lugar de directamente con los arraylist.
	 */
	
	List <Peonza> ListaPeonzas= new ArrayList<>();
	List <Cuerda> ListaCuerdas= new ArrayList<>();
	List <Punta> ListaPuntas= new ArrayList<>();
	Datos datos = new Datos();
	Coleccion coleccion = new Coleccion();
	
	/**
	 * InitProduct carga los datos iniciales de los productos.
	 * @return
	 */
	public ArrayList InitProduct(){
		return  datos.atack();
	}
	
	/**
	 * metodo para mostrar la lista de peonzas
	 * @return
	 */
	public void add(Peonza peonza){
		ListaPeonzas.add(peonza);
	}
	/**
	 * método para el tamaño de la coleccion
	 * @param peonza
	 * @return
	 */
	public int size(Peonza peonza){
		return ListaPeonzas.size();
	}
	public void muestraPeonzas(){
		
		for(Peonza peonza:ListaPeonzas){
			System.out.println(peonza.toString());
		}
	}
	
	/**
	 * metodo para mostrar peonzas por material
	 * @return
	 */
	
	public void muestraPeonzasMaterial(String material){
		int i=0;
		for(i=0;i<ListaCuerdas.size();i++){
			if(ListaPeonzas.get(i).equals(material)){
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
	

	  
	 /**metodo para mostrar peonzas por tama�o
	  * 
	  * @param material
	  */
	  public void muestraPeonzasTamanyo(String tamanyo){
		int i=0;
		for(i=0;i<ListaCuerdas.size();i++){
			if(listaPeonzas.get(i).equals(tamanyo)){
				System.out.println(ListaCuerdas.get(i));
			}
		}
	}

	
	 
}
