
package coeje3;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        CantanteFamoso ca = new CantanteFamoso();
        Test p = new Test();
        
        ArrayList<CantanteFamoso> lista = new ArrayList<>();
        p.crearCantante(lista);
        p.mostrarLista(lista);
        p.agregarCantante(lista);
        p.mostrarLista(lista);
        p.menu(lista);
        p.mostrarLista(lista);
        
        System.out.println("Gracias por utilizar nuestro programa, nos vemos la proxima!"); 
    }    
}
