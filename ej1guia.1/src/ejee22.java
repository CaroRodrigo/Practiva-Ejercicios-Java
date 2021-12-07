
import java.util.Scanner;

/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y
los números serán introducidos por el usuario. Realice dos versiones del programa,
una usando el bucle “while” y otra con el bucle “do - while”.

 */
public class ejee22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int min = 999999999; // exacto todo lo que sea menos que eso entra como minimo
        int max = 0;
        int acu = 0;
        int total;
        int cont = 0;

        System.out.println("Ingrese la cantidad de numeros a evaluar");
        total = leer.nextInt();
//mas vale
        /*  
        while (acu < total) {
            System.out.println("ingrese el primer numero");
            num = leer.nextInt();
            if (num < min) {
                min = num;

            }
            if (max < num) {
                max = num;
            }
            acu = acu + 1;
            cont = cont + num;
        }
         */
        do {
            System.out.println("ingrese el primer numero");
            num = leer.nextInt();
            if (num < min) {
                min = num;

            }
            if (max < num) {
                max = num;
            }
            acu = acu + 1;
            cont = cont + num;
        } while (total > acu);
//
        System.out.println("el numero maximo ingresado es : " + max);
        System.out.println("el numero minimo ingresado es : " + min);
        System.out.println("el numero promedio de todos los numeros es : " + (cont / total));
    }

}
