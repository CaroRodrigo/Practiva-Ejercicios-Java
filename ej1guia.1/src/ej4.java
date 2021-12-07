/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java*/

import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;

        System.out.println("ingrese una frase");
        frase = leer.nextLine();
        System.out.println("La frase ingresada es: " + frase + " en mayusculas " + frase.toUpperCase() + " en minusculas :" + frase.toLowerCase() );
        

    }

}
