
import java.util.Scanner;

/*
 Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
public class ejee21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float num;
        float total = 0;
        float altura = 0;
        float enanos = 0;
        float cont = 0;

        System.out.println("Ingrese la cantitad de personas a medir");
        num = leer.nextFloat();

        do {            
              System.out.println("Ingrese la altura de la persona por ejemplo (1,70)");
            altura = leer.nextFloat();
            total = total + altura;
            cont = cont + 1;
            if (altura < 1.60) {
                enanos = enanos + 100;
            }
        } while (num > cont );
           
        System.out.println("El promedio de los que se encuentran debajo de 1.60mts son : " + (enanos / num) + " % ");
        System.out.println("El promedio de altura en general es : " + (total / num) + " mts"); 
    
   
}
}