
package pooej4;

import java.util.Scanner;

public class Pooej4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Integer hs;
        Integer min;
        Integer seg;
        System.out.println("ingrese la hora exacta");
        System.out.print("Hora: ");
        hs = leer.nextInt();
        System.out.print("Minutos: ");
        min = leer.nextInt();
        System.out.print("Segundos: ");
        seg = leer.nextInt();
        
        
        Tiempo ti = new Tiempo(hs,min,seg);
       
        ti.imprimirHoraCompleta();
        
        
        
    }
    
}
