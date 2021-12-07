
import java.util.Scanner;

/*
 Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta. 
 */

public class ejee19 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        
    
        do {            
        System.out.println("Ingrese una nota, la misma puede ser del 0 al 10");
        num = leer.nextInt();       
        } while (num <0 || num > 10 );
    
        System.out.println("Nota almacenada correctamente, muchas gracias.");
         
    }   
    
    
    
}
