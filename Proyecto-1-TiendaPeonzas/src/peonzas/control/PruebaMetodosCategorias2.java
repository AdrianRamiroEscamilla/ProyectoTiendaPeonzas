package peonzas.control;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import peonzas.datos.DatosPeonzas;
import peonzas.domain.Peonza;
import peonzas.modelo.Coleccion;
import peonzas.servicios.PeonzasService;

public class PruebaMetodosCategorias2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		prueba1Material();
		prueba2Tamanyo();
		prueba3Precio();
		prueba4Rango();
		}
		/**
		 * prueba1Material
		 * La prueba uno se realiza con la categoría y el nombre de la categoría
		 */
	public static void prueba1Material(){
		
		DatosPeonzas dp = new DatosPeonzas();
		ArrayList<Peonza> apeonzas = new ArrayList<>();
		apeonzas =dp.buscaCategoria("material", "madera");
		System.out.print(apeonzas.size());
		System.out.println("\nPRUEBA 1 con material\n");

		for (Peonza peonza : apeonzas){
			System.out.println(peonza.getNombre());
			System.out.println(peonza.getMaterial());
	}}
		/**
		 * La prueba 2 se realiza con categoría tamaño mayor que.
		 */
		public static void prueba2Tamanyo(){
			
			DatosPeonzas dp = new DatosPeonzas();
			ArrayList<Peonza> apeonzas = new ArrayList<>();
			apeonzas =dp.buscaCategoria("tamanyo", ">1.0");
			System.out.print(apeonzas.size());
			for (Peonza peonza : apeonzas){
				System.out.println("\nPRUEBA 2 con tamaño mayor que 1.0:\n");

				System.out.println(peonza.getNombre());
				System.out.println(peonza.getTamanyo());
		}}
		
			/**
			 * La prueba 3 se realiza con categoría precio menor que.
			 */
			public static void prueba3Precio(){
				
				DatosPeonzas dp = new DatosPeonzas();
				ArrayList<Peonza> apeonzas = new ArrayList<>();
				apeonzas =dp.buscaCategoria("precio", "<18.0");
				System.out.print(apeonzas.size());
				System.out.println("\nPRUEBA 3 con precio menor que 18.0:\n");

				for (Peonza peonza : apeonzas){

					System.out.println(peonza.getNombre());
					System.out.println(peonza.getPrecio());
			}}
			
				/**
				 * La prueba  se realiza con categoría precio en un rango.
				 */
				public static void prueba4Rango(){
					System.out.println("\nPRUEBA 4 con rango de precios entre 12 y 15:\n");

					DatosPeonzas dp = new DatosPeonzas();
					ArrayList<Peonza> apeonzas = new ArrayList<>();
					apeonzas =dp.buscaCategoria("precio", " between 12.0 and 15.0");
					System.out.print(apeonzas.size());

					for (Peonza peonza : apeonzas){

						System.out.println("Nombre "+peonza.getNombre());
						System.out.println("Precio "+peonza.getPrecio());
				}
				
			
			
			
			
			
			
			
			
			
			
			
			
		//dp.buscaCategoria("material", "metal");
		
		//dp.buscaCategoria("precio", "<25");
		//dp.buscaCategoria("precio", ">5");


		/**Código de ejemplo de como extraer los datos de la base de datos
		 * solo hay que copiarlo y pegarlo para podder utilizarlo.
		 
	    PeonzasService pservice = new PeonzasService();
	      ArrayList list = new ArrayList();
	      list =  pservice.InitProduct();
	      
	      // Use iterator to display contents of al
	      System.out.print("Original contents of al: ");
	      for (int i=0; i<list.size();i++ ){
			   Peonza peonza = (Peonza) list.get(i);
			   System.out.print("código "+peonza.getId());
			   System.out.println("   nombre" +peonza.getNombre());

	      }*/
	}

}
