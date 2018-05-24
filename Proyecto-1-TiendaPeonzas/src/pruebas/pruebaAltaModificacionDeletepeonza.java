package pruebas;


import peonzas.datos.DatosPeonzas;
import peonzas.domain.Cuerda;
import peonzas.domain.Peonza;
import peonzas.domain.Punta;


public class pruebaAltaModificacionDeletepeonza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
	}
	public static void pruebaDelete(){
		
		Peonza peonza = new Peonza( "peonzaprueba",100, "rutaimagen ",21,"material","descripcion", 23.77,null, null, 21.33);
		System.out.println(peonza.toString());
		
		DatosPeonzas miPeonza= new DatosPeonzas();
		miPeonza.deletePeonza(peonza);
		
		
	}
	public static void pruebaAlta(){
		
		Peonza peonza = new Peonza( "peonzaprueba", 34, "rutaimagen ",21,"material","descripcion", 23.77,null, null, 21.33);
		System.out.println(peonza.toString());
		
		DatosPeonzas miPeonza= new DatosPeonzas();
		miPeonza.altaPeonza(peonza, 1, 2);
		
		
	}

}
