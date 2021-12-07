
package coeje5;

import coeje5.Libro.Libro;
import coeje5.Servicio.Libreria;
import java.util.Set;
import java.util.TreeSet;

public class CoEje5 {

    
    public static void main(String[] args) {
        Libreria l = new Libreria();
        Set<Libro> libros = new TreeSet<>();
        l.menuLibreria();
       
    }
    
}
