package ej1guia1;

import java.util.Scanner;

public class Ej1guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;

        System.out.println("ingrese su nombre");

        nombre = leer.netx();
        System.out.println("su nombre es" + nombre + "y estoy programando en java");

    }

}
