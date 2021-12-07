
import java.util.Scanner;

/*
 Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos odontológicos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
que represente el costo del tratamiento (previo al descuento) y determine el importe
en efectivo a pagar por dicho socio
 */

public class eje17 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
        float tratamiento;
        float tipoA;
        float tipoB;
        float resultadoA;
        float resultadoB;
        
        String Tipo;
        
        System.out.println("Bienvenido, Que tipo de socio es A , B o C ");
        Tipo = leer.next();
        System.out.println("Cual es el costo de su tratamiento odontologico?");
        tratamiento = leer.nextFloat();
        
        tipoA = tratamiento*50/100;
        tipoB = tratamiento*35/100;
        
        resultadoA = tratamiento - tipoA;
        resultadoB = tratamiento - tipoB;
                
        
        if (Tipo.equals("A")) {
            System.out.println("El costo del tratamiento es de: $ " + tratamiento + " . Le corresponde un %50 de descuento, el total a pagar es de: $ " + resultadoA);
        } else if (Tipo.equals("B")) {
        System.out.println("El costo del tratamiento es de: $ " + tratamiento + " . Le corresponde un %35 de descuento, el total a pagar es de: $ " + resultadoB);
        } else if (Tipo.equals("C")) {
            System.out.println("Los Socios tipo C no gozan de ningun descuento en su tratamiento, el total a pagar es de: $" + tratamiento);
        } else {
            System.out.println("Tipo de socio incorrecto");
        }
    
    }
    
}
