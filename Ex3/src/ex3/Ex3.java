package ex3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int numRandom = (int) Math.floor(Math.random() * 500);
        System.out.println(numRandom);
        System.out.print("Ingrese un numero: ");
        int teclado = 0;
        int cont = 0;

        do {
            try {
                teclado = leer.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Tiene que ingresar un numero, el error fue tomado como intento");
                teclado = leer.nextInt();
            } finally {
                cont = cont + 1;
            }

            if (teclado > numRandom) {
                System.out.println("El numero es menor");
            } else {
                System.out.println("El numero es mayor");
            }
            teclado = leer.nextInt();
            cont = cont + 1;
        } while (teclado != numRandom);

        System.out.println("Adivinaste");
        System.out.println("Adivinar te costo: " + cont + " intentos");
    }

}
