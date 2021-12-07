
package pooejee11;

import java.util.Scanner;


public class CafeteraServi {
    Scanner leer = new Scanner(System.in);
   
    public Cafetera crearCafetera(){
    Cafetera ca = new Cafetera();
    return ca;
    }
public void HagamosCafe(Cafetera ca){
 System.out.println("**********************************************");
 System.out.println("Bienvenido al menu de su cafetera");
 System.out.println("Esta misma cuenta con una capacidad maxima de 1000 cc");
 System.out.println("**********************************************");
int y = 0;
    do {        
        
    
        System.out.println("Seleccione una opcion:");
        System.out.println("Para llenar la cafetera ingrese: 1");
        System.out.println("Para servir en tazas de (200 cc) ingrese: 2");
        System.out.println("Para vaciar la cafetera ingrese: 3");
        System.out.println("Para añadir mas cafe en la cafetera ingrese: 4");
        System.out.println("**********************************************");
        String x = leer.next();

        while (!x.equals("1") && !x.equals("2") && !x.equals("3") && !x.equals("4")) {            
            System.out.println("Ingrese una opcion valida");
            x = leer.next();
        }
        
        if (x.equals("1")) {
            System.out.print("La cafetera se encuentra llena su contenido es de: " + ca.llenarCafetera() + " cc" );
        }
        if (x.equals("2")) {
            System.out.println("Cuantas tazas desea servir (200 cc) ?: ");
            int servir = leer.nextInt();
            System.out.println("En la cafetera quedan :" + ca.servirTaza(servir) + "cc");
        }
        if (x.equals("3")) {
            System.out.println("La cafetera se encuentra vacia su contenido es de: " + ca.vaciarCafetera() + " cc");
        }
        if (x.equals("4")) {
            System.out.println("Cuanto cafe desea añadir a la cafetera?");
            double agregamos = leer.nextDouble();
            System.out.println(+ ca.agregarCafe(agregamos) + "cc");
        }
        System.out.println("");
      
        System.out.println("Desea hacer alguna otra operacion?");
			System.out.println("1. Si");
			System.out.println("2. Apagar la cafetera");
             y = leer.nextInt();
                  
            System.out.println("Ingrese una opcion valida");
} while (y == 1);		
    System.out.println("Muchas gracias, nos vemos la proxima vez que busques un buen cafe");
}

}
    

