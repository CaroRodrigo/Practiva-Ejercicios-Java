
import java.util.Scanner;

/*Dado un tiempo en minutos, calcular su equivalente en días, horas y minutos. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente:
1 día, 2 horas y 40 minutos.*/
public class ej8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int min;
        int hs;
        int dias;

        System.out.println("Ingrese la cantidad de minutos");
        min = leer.nextInt();

     
        hs = min / 60;
        dias = min / 1440;

       /* if (min > 60) {
            hs = hs + 1;
        } else if (hs > 24) {
            dias = dias + 1;
        }*/

        System.out.println("los Minutos ingresados equivalen a :" + dias + " dia/s " + hs + " horas " + min + " minutos");

    }

}
