package pruebas;


import peonzas.datos.DatosPeonzas;
import peonzas.domain.Cuerda;
import peonzas.domain.Peonza;
import peonzas.domain.Punta;
import peonzas.domain.Usuario;


public class pruebaAltapeonza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prueba alta peonza
		//Peonza peonza = new Peonza( "peonzaprueba", 34, "rutaimagen ",21,"material","descripcion", 23.77,null, null, 21.33);
		//System.out.println(peonza.toString());
		
		DatosPeonzas miPeonza= new DatosPeonzas();
		//miPeonza.altaPeonza(peonza, 1, 2);
		
		//prueba cambio datos peonza
		Peonza peonza = new Peonza("cambioPeonza", 94, "imagenNuevaPeonza", 33, "suMaterial","Descri",24.44, null, null, 33.33);
		DatosPeonzas miPeonza2= new DatosPeonzas();
		miPeonza2.changePeonza(peonza, 1,2);
			System.out.println(peonza.toString());
		
	}

}
