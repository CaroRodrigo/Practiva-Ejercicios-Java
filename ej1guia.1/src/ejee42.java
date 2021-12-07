
import java.util.Scanner;

/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class ejee42 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] vector;
        int n = 0;
        int cont = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, num;

        System.out.println("Ingrese la cantidad de numeros a evaluar :ª");
        n = leer.nextInt();

        vector = new int[n];

        for (Integer i = 0; i < vector.length; i++) {
            System.out.println("ingrese un numero entero");
            num = leer.nextInt();
            if (num > 0 && num < 10) {
                cont = cont + 1;
            }
            if (num > 9 && num < 100) {
                cont2 = cont2 + 1;
            }
            if (num > 99 && num < 1000) {
                cont3 = cont3 + 1;
            }
            if (num > 999 && num < 10000) {
                cont4 = cont4 + 1;
            }
            if (num > 9999 && num < 100000) {
                cont5 = cont5 + 1;
            }
            else if (num < 0 || num > 99999) {
        cont6 = cont6 + 1;
        
        }

        }
        System.out.println("Los numeros ingresados con un dijito fueron : " + cont);
        System.out.println("Los numeros ingresados con dos dijitos fueron : " + cont2);
        System.out.println("Los numeros ingresados con tres dijitos fueron : " + cont3);
        System.out.println("Los numeros ingresados con cuatro dijitos fueron : " + cont4);
        System.out.println("Los numeros ingresados con cinco dijitos fueron : " + cont5);
        System.out.println("Los numeros incorrectos ingresados fueron : " + cont6 );   
    }
}

