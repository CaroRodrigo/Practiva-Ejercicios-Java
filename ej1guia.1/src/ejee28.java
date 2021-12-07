
import java.util.Scanner;

/*
 Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 0 y 10. El programa debe
indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para
realizar este ejercicio investigue como utilizar la función Math.random() de Java.
 */


public class ejee28 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0;
        int random ; 
        
        
         System.out.println("Adivine el resultado aleatorio del 1 al 10, ingrese un numero hasta conseguirlo");
         
        do {            
           num = leer.nextInt();
           random = (int)(Math.random()*11);
            System.out.println("el numero random es : " + random);
            
        } while (num != random);
        
        System.out.println("felicitaciones , adivinaste el numero");
        
        
    }
    
}
