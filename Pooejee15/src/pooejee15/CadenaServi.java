package pooejee15;

import java.util.Scanner;

public class CadenaServi {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena ca = new Cadena();
    Cadena ca2 = new Cadena();
    Cadena ca3 = new Cadena();
    
    public Cadena crearFrase() {

        System.out.print("Ingrese una frase: ");
        ca.setFrase(leer.nextLine());
        System.out.println("La longitud de la frase es: " + ca.getFrase().length());

        return ca;
    }

    public void imprimirCadena(Cadena ca) {

    }

    public void mostrarVocales() {
        int aux = 0;
        for (int i = 0; i < ca.getFrase().length(); i++) {

            if (ca.getFrase().toLowerCase().charAt(i) == 'a' ||
                ca.getFrase().toLowerCase().charAt(i) == 'e' ||
                ca.getFrase().toLowerCase().charAt(i) == 'i' ||
                ca.getFrase().toLowerCase().charAt(i) == 'o' ||
                ca.getFrase().toLowerCase().charAt(i) == 'u') {
                aux = aux + 1;
            }

        }
        System.out.println("La cantidad de vocales es: " + aux);

    }

    public void invertirPalabra() {
        String palabrainvertida = "";
        for (int i = ca.getFrase().length() - 1; i >= 0; i--) {
            palabrainvertida = palabrainvertida + ca.getFrase().charAt(i);
        }
        System.out.println("Frase original:  " + ca.getFrase());
        System.out.println("Frase invertida: " + palabrainvertida);
    }

    public void vecesRepetido() {
        System.out.println("Este servicio le permitira contar cuantas veces aparece un caracter en la frase.");
        System.out.print("Ingrese el caracter que desea contabilizar: ");
        Integer aux2 = 0;
        String se = leer.next();
        char caracter = se.toLowerCase().charAt(0);

        for (int i = 0; i < ca.getFrase().length(); i++) {

            if (ca.getFrase().toLowerCase().charAt(i) == caracter) {
                aux2 = aux2 + 1;
            }

        }

        System.out.println("El caracter: ---> " + caracter + " <--- se repite: " + aux2 + " veces");

    }

    public void compararLongitud(){
        System.out.println("");
        System.out.println("");
        System.out.print("Ingrese otra fase: ");
        ca2.setFrase(leer.next());
        
        System.out.println("Como dijimos antes la longitud de la primera frase es: " + ca.getFrase().length());
        System.out.println("Y la longitud de la segunda frase es: " + ca2.getFrase().length());
    }
    
    public void unirFrases(){
        System.out.print("Ingrese otra fase para unirla a la primera: ");
        ca3.setFrase(leer.next());
        
        System.out.println(ca.getFrase().concat(ca2.getFrase().concat(ca3.getFrase())));
    }
    
    public void reemplazar(){
        System.out.println("Acontinuacion reemplazaremos todas las letras A.");
        System.out.print("Ingrese con que caracter desee remplazarlo: ");
        String aux3 = leer.next();
        char aux4 = aux3.charAt(0);
        String aux5 = Character.toString(aux4);
        
        System.out.println(ca.getFrase().concat(ca2.getFrase().concat(ca3.getFrase())).replace("a", aux5));
    }
}
