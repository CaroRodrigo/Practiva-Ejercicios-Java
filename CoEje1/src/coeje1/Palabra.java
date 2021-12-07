package coeje1;

import java.util.*;

public class Palabra {

    private ArrayList<String> listaDePalabras = new ArrayList();

    public Palabra() {
    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<String> pedirPalabra() {
        Palabra miLista = new Palabra();
        System.out.println("Ingrese las palabras a guardar en su lista palabra.");

        String palabra = "";

        do {
            System.out.print("Ingrese la palabra, para finalizar @ : ");
            palabra = leer.next();
            miLista.listaDePalabras.add(palabra);
        } while (!palabra.equals("@"));
        String eliminar = "@";
        miLista.listaDePalabras.remove(eliminar);
        return miLista.listaDePalabras;
    }

    public void mostrarAlfabeticamente(List<String> alf) {

        Collections.sort(alf);
        System.out.println("Las palabras ingresadas por orden alfabeticas son: ");

        System.out.println(alf);
    }

    public void longitud(List<String> longi) {
        System.out.println("Ingrese el numero de letras de las palabras a mostrar. ej 4. ");
        Integer lon = leer.nextInt();
        for (String aux : longi) {

            if (aux.length() == lon) {
                System.out.println(aux);
            }

        }
    }

}
