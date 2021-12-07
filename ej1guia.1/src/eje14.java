
import java.util.Scanner;

/*
 
 */

public class eje14 {

  
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      String Frase;
      
        System.out.println("ingrese una frase");
        Frase = leer.nextLine();
        
        Frase = Frase.substring(0,1);
        
        if (Frase.equals("a")) {
            System.out.println("Correcto");
        } else {
            System.out.println("incorrecto");
        }
       
        
        
    }
    
}
