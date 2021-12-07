package pooejee10;

import java.util.Scanner;

public class ServicioFecha {

    Scanner leer = new Scanner(System.in);
    Fecha fe = new Fecha();

    public void leer() {
        System.out.print("Ingrese un dia (1-31): ");
        fe.setMes(leer.nextInt());
        
        System.out.print("Ingrese un mes (1-12): ");
        fe.setMes(leer.nextInt());
       
        System.out.print("Ingrese un año (1990-2050): ");
        fe.setAño(leer.nextInt());

    }

    public void bisiesto() {
        if (fe.getAño() % 4 == 0 && fe.getAño() % 100 != 0 && fe.getAño() % 400 == 0) {
            System.out.println("el año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }

    public void validar() {
        if (fe.getDia() < 1 && fe.getDia() > 31) {
            fe.setDia(1);
        } else {
            fe.getDia();
        }
        if (fe.getMes() < 1 && fe.getMes() > 31) {
            fe.setMes(1);
        } else {
            fe.getMes();
        }
        if (fe.getAño() < 1900 && fe.getAño() > 2050) {
            fe.setAño(1990);
        } else {
            fe.getMes();
        }
    }

    
    public void diasTranscurridos(){
        
        
        
    }
  
}
