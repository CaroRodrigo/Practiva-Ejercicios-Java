
import java.util.Scanner;

/*Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.*/
public class eje10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Bienvenido este programa le mostrara cual numero es mayor");
        
        System.out.println("Ingrese el primer numero entero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        num2 = leer.nextInt();

        if (num1 > num2) {
            System.out.println("El numero mayor es " + num1);
        } else {
            System.out.println("El numero mayor es " + num2);
        }
    }

}
