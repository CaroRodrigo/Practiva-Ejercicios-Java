package Test;

import EdificiosOficinas.EdificioOficina;
import EdificiosOficinas.EdificioServicio;
import Enum.Techo;
import Interfases.InstalacionDeportiva;
import Polideportivo.Polideportivo;
import Polideportivo.PolideportivoServicio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        
        List<EdificioOficina> edi = new ArrayList<EdificioOficina>();
        EdificioServicio eS = new EdificioServicio();
        PolideportivoServicio pS = new PolideportivoServicio();
        

        

        edi.add(new EdificioOficina());
        edi.add(new EdificioOficina());
System.out.println("hola");
        int a = 2;
        int c = 0;
        /*Iterator<Polideportivo> it = poli.iterator();
        while (it.hasNext()) {
            if ("ABIERTO".equals(Techo.values()[0].toString())) {

                a = a + 1;

            } else {
                c = c + 1;
            }
        
        
            
        }*/
        
        
        pS.agregarDeportivo();
        int x ;
        double y;
       
        x = pS.tipoDeInstalacionAbierto();
        System.out.println("La cantidad de polideportivos abiertos son: " + x);
        System.out.println("polideportivos cerrados son: " + (pS.mostrarLista()- x));
        y= pS.calcularSuperficie();
        System.out.println("La superficie del polideportivo Raul Spiricueta es: " + y);
                
    }
}
 

