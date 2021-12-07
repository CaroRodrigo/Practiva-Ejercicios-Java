
import java.util.Scanner;

/*
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje.
 */


public class eje16 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String Letra;
        
        System.out.println("Ingrese una vocal en minuscula");
        Letra = leer.next();
        
        if (Letra.equals("a")) {
            System.out.println("Letra correcta. Muchas gracias");    
        } else if (Letra.equals("e")) { 
        System.out.println("Letra correcta. Muchas gracias");
        } else if (Letra.equals("i")) { 
        System.out.println("Letra correcta. Muchas gracias");
        } else if (Letra.equals("o")) { 
        System.out.println("Letra correcta. Muchas gracias");
        } else if (Letra.equals("u")) { 
        System.out.println("Letra correcta. Muchas gracias");
        } else {
            System.out.println("Letra incorrecta");
        }
        
  
    }
    
}
