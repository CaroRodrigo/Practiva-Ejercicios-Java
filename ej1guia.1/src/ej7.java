
import java.util.Scanner;

/*Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().*/
public class ej7 {


    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int num;
      int doble;
      int triple;
      int raiz;
      
        System.out.println("Ingrese un numero entero");
    num = leer.nextInt();
    
    doble = num * 2;
    triple = num * 3;
    
    
    System.out.println("El numero ingresado es : " + num + " .El doble es : " + doble + " .El triple es : " + triple + " y su raiz cuadrada es : " + Math.sqrt(num) );
    
    
    }
    
}
