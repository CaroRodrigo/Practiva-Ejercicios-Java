
import java.util.Scanner;

/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial. 
 */
public class ejee20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int max;
        int num;
        int num2;
        int suma;
        int numadi;

        System.out.println("Ingrese un limite");
        max = leer.nextInt();

        System.out.println("ingrese el primer numero a sumar");
        num = leer.nextInt();
        System.out.println("ingrese otro numero a sumar");
        num2 = leer.nextInt();

        suma = num + num2;

        while (suma < max + 1) {
            System.out.println("ingrese otro numero a sumar");
            numadi = leer.nextInt();
            suma = suma + numadi;
        }

        System.out.println("la suma supero al numero maximo");
    }
}
