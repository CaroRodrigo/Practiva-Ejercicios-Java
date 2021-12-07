
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E
 */
public class ejee31 {

    public static void main(String[] args) {

        String palabra = "";
        String aux = "";
        String aux2 = "";
        String aux3 = "";

        for (Integer i = 0; i < 10; i++) {
            aux = i.toString();

            for (Integer j = 0; j < 10; j++) {
                aux2 = j.toString();

                for (Integer k = 0; k < 10; k++) {
                    aux3 = k.toString();

                    palabra = aux + "-" + aux2 + "-" + aux3;

                    if (palabra.contains("3")) {
                        palabra = palabra.replace("3", "E");
                        System.out.println(palabra);
                    } else {
                        System.out.println(palabra);
                    }

                }
            }

        }

    }
}
