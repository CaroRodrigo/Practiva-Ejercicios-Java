package integrador;
//Enviar a nahuelbullonjensen@gmail.com

import java.util.ArrayList;
import java.util.Arrays;


public class Integrador {

    public static void main(String[] args) {
        
        Practica practica = new Practica();
        // Ejercicio 1: Numero Palindromo
        try {
        System.out.println(practica.numeroPalindromo(Long.MAX_VALUE));    
        } catch (NullPointerException e) {
            System.out.println("false");
        }
        
        //Ejercicio 2: prisioneroDulce
        System.out.println(practica.prisioneroDulce(5,10,5));
        
        
        //Ejercicio 3: mediasAmigas
        ArrayList<String> medias = new ArrayList(Arrays.asList(new String[]{"A", "B", "C", "D", "A", "C", "D", "A"}));
        System.out.println(practica.mediasAmigas(medias));
    }
}
