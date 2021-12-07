/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */


import java.util.Scanner;


public class eje12 {


    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        String Frace;

        System.out.println("ingrese la frase correcta");
        Frace = leer.nextLine();

        if (Frace.equals("eureka")) {
            System.out.println("La frace es correcta");
        } else {
            System.out.println("La frace es incorrecta");
        }
    }
    
}
