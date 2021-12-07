package pooej6;

import java.util.Scanner;

public class Pooej6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String ti;
        String au;
        System.out.print("Ingrese el titulo de la cancion: ");
        ti = leer.nextLine();
        System.out.print("Ingrese el autor de la cancion: ");
        au = leer.nextLine();

        Cancion ca = new Cancion(ti, au);
        ca.imprimirResultado();

        Cancion ca2 = new Cancion();
        System.out.print(" Ingrese el titulo de la segunda cancion:");
        ca2.setTitulo(leer.nextLine());
        System.out.print(" Ingrese el autor de la segunda cancion:");
        ca2.setAutor(leer.nextLine());
        
        System.out.println("El titulo de la cancion es : " + ca2.getTitulo() + ". Y su autor es : " + ca2.getAutor());
        
    }

}
