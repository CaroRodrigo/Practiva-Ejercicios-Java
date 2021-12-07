
import java.util.Scanner;

/*
Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
pasar que será una cadena, este no devolverá ningún valor y mostrará un mensaje
indicando el cambio (void).
El cambio de divisas son:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */

public class ejee36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Integer opc = 0;
        Double euros;
        String a = "", b = "", c = "";

        System.out.println("Ingrese el numero de la opcion correcta");
        System.out.println("Si desea convertir los euros a libras ingrese 1");
        System.out.println("Si desea convertir los euros a dolares ingrese 2");
        System.out.println("Si desea convertir los euros a yenes ingrese 3");
        opc = leer.nextInt();
        System.out.println("ingrese la cantidad de euros a convertir");
        euros = leer.nextDouble();
        
        System.out.println("La cantidad convertida es : " + total (opc, euros, a, b,c));
        
    }

    public static String total(Integer opc, Double euros, String a, String b, String c) {
    switch (opc) {
            case 1:
                euros = euros * 0.86;
                a = "£";
                return (euros.toString() + a);
            case 2:
                euros = euros * 1.28611;
                b = "USD";
                return (euros.toString()) + b;
            case 3:
                    euros = euros * 129.852;
                c = "¥";
                    return (euros.toString()) + c; 
        }
   
    return euros.toString();
    }
}
