
import java.util.Scanner;

/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + ( 9 * C / 5).*/
public class ej5 {

    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
   float grado;
   float f;
           
        System.out.println("Ingrese los grados centigrados a convertir");
     grado = leer.nextFloat();
     
     f = 32 + (9 * grado / 5);
     
        System.out.println("Los grados centigrados ingresados son: " + grado + " y su equibalente a Fahrenheit es : " + f );
        
     
   
   
   
   
   
    }
    
}
