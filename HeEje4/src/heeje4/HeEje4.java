
package heeje4;

import Animal.Animal;
import Animal.Caballo;
import Animal.Gato;
import Animal.Perro;


public class HeEje4 {

    public static void main(String[] args) {
       Animal pe = new Perro("moustri moustri", 2, "callejero");
           
        System.out.println(pe.toString() + "El Perro se alimenta de : "+pe.alimentarse());
        
        Animal ga = new Gato("Feliz", 3, "Siames");
        
        System.out.println(ga.toString() + "El Gato se alimenta de : " + ga.alimentarse());
        
        Animal ca = new Caballo("Tiro al blanco", 5, "Criollo");
        System.out.println(ca.toString() + "El Caballo se alimenta de : " + ca.alimentarse());
    }
    
}
