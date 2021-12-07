package pooejee17;

import java.util.Scanner;

public class MesServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Mes me = new Mes();
    String ingreso;

    public void imprimirMes() {

        System.out.println("Adivine el mes secreto.");
        System.out.print("Introdusca el mes secreto en minusculas: ");
        ingreso = leer.next();

        
        while (!ingreso.equals(me.getMesSecreto())) {
            System.out.println("El mes ingresado es incorrecto");
            System.out.print("Introdusca el mes secreto en minusculas: ");
            ingreso = leer.next();
        }
        
/* asi no
        while ( ingreso != me.getMesSecreto()) {
            System.out.println("El mes ingresado es incorrecto");
            System.out.print("Introdusca el mes secreto en minusculas: ");
            ingreso = leer.next();
        }
  */      
        
        System.out.println("Haz ingresado el mes correcto");

        System.out.println("El mes secrero es: " + me.getMesSecreto());
    }

}