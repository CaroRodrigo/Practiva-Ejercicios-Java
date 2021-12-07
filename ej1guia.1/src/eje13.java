
import java.util.Scanner;

/*
 Realizar un programa que pida introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */


public class eje13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String Palabra;
        
        System.out.println("Ingrese una frase");
        Palabra = leer.next();
            
         if (Palabra.length() == 8) {
            System.out.println("la frase ingresada es: Correcta");
        } else {
             System.out.println("la frase ingresada es: incorrecta");
        }
     
    }

    
    }
    

