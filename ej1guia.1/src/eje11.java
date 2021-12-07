/*Crear un programa que dado un numero determine si es par o impar.*/
import java.util.Scanner;

public class eje11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;

        System.out.println("Bienvenido este programa indicara si el numero ingresado es par o impar");
        System.out.println("Ingrese un numero entero");
        num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero ingresado es par");
        } else {
            System.out.println("El numero ingresado es impar");
        }

    }

}
