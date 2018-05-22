package peonzas.control;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import peonzas.domain.Peonza;
import peonzas.modelo.Coleccion;
import peonzas.servicios.PeonzasService;

public class EjemploExtraccionListaDePeonzas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**Código de ejemplo de como extraer los datos de la base de datos
		 * solo hay que copiarlo y pegarlo para podder utilizarlo.
		 */
	    PeonzasService pservice = new PeonzasService();
	      ArrayList list = new ArrayList();
	      list =  pservice.InitProduct();
	      
	      // Use iterator to display contents of al
	      System.out.print("Original contents of al: ");
	      for (int i=0; i<list.size();i++ ){
			   Peonza peonza = (Peonza) list.get(i);
			   System.out.println("   nombre" +peonza.getNombre());

	      }
	}

}
