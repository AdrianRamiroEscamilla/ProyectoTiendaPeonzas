package peonzas.modelo;

import java.util.ArrayList;
import java.util.List;

import peonzas.domain.Peonza;

public class PeonzaExpert {

	public List<Peonza> getBrands(String material) {
        List<Peonza> ListaPeonzas = new ArrayList<>();
        if (material.equals("madera")) {
            ListaPeonzas.add(new Peonza("marron", 12, "Trompus", "adidas"));
            ListaPeonzas.add(new Peonza("marron", 12, "Carnicera", "adidas"));
        } else {
            ListaPeonzas.add(new Peonza("blanca", 15, "pegasus", "adidas"));
            
        }
        return (ListaPeonzas);
    }
}
