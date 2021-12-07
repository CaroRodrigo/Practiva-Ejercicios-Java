
package coprueba;

import java.util.*;

public class CoPrueba {

    public static void main(String[] args) {
        List miLista = new ArrayList();
        
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        imprimir(miLista);
        
        System.out.println("-------------------------------");
        
       Set miSet = new HashSet();
       miSet.add("Enero 5993921");
       miSet.add("Febrero");
       miSet.add("Marzo");
       miSet.add("Abril");
       miSet.add("Mayo");
       miSet.add("Junio");
       miSet.add("Julio");
       miSet.add("Agosto");
       miSet.add("Septiembre");
       miSet.add("Octubre");
       miSet.add("Noviembre");
       miSet.add("Diciembre");
        imprimir(miSet);
        
        System.out.println("------------------------------");
        
        Map miMapa = new HashMap();
        miMapa.put(1, "2020");
        miMapa.put(2,"2021");
        miMapa.put(3,"2022");
        
        String mapa = (String) miMapa.get(2);
        System.out.println("es el año " + mapa);
        
        // devuelve solo el key... como es set se puede imprimir como collection
        //imprime las llaves
        imprimir(miMapa.keySet()); 
        // devuelve solo los valores... como es set se puede imprimir como collection
        //imprime los valores
        imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection coleccion){
        coleccion.forEach((imp) -> {
            System.out.println(imp);
        });
            
        }
    }

