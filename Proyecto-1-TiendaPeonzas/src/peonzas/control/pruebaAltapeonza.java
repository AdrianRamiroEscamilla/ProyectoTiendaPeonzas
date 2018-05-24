package peonzas.control;


import peonzas.datos.DatosPeonzas;
import peonzas.domain.Peonza;


public class pruebaAltapeonza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Peonza peonza = new Peonza("peonzaprueba", 34, "material", 23, "imagen", "descripcion", 22.23, null, null, 23.23);
		System.out.println(peonza);
		
		DatosPeonzas miPeonza= new DatosPeonzas();
		miPeonza.altaPeonza(peonza);
		
		
		
	}

}
