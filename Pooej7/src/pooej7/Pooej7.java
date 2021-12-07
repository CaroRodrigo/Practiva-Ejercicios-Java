
package pooej7;

import java.util.Scanner;


public class Pooej7 {

  
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int alt;
       int lar;
       
        System.out.println("Ingrese el alto del rectangulo");
        alt = leer.nextInt();
        System.out.println("Ingrese el largo del rectangulo");
        lar = leer.nextInt();
       Rectangulo rec = new Rectangulo(alt,lar); 
       
        System.out.println("La superficie del rectangulo es :" +rec.getSuperficie());
        System.out.println("El perimetro del rectangulo es :" +rec.getPerimetro());
        
        rec.mostraRec();
        
        System.out.println("");
    }
    
}
