
package coeje1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoEje1 {

 
    public static void main(String[] args) {
        Palabra pal = new Palabra();
        List<String> pal2 = new ArrayList();
      
        pal2 = pal.pedirPalabra();
        pal.mostrarAlfabeticamente(pal2);
       pal.longitud(pal2);
        
        
    }
    
}
