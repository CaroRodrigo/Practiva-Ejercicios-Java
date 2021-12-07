/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coeje3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author W7
 */
public class Test {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<CantanteFamoso> listaDeCantantesFamosos = new ArrayList<>();
    
    
    public List<CantanteFamoso> crearCantante(List<CantanteFamoso> listaDeCantantesFamosos) {
     
        System.out.println("Ingrese 5 cantantes a la lista: ");

        do {

    CantanteFamoso c = new CantanteFamoso();        
            
            System.out.print("Ingrese el nombre del cantante: ");
            String nombre = leer.next();
            System.out.print("Ingrese su disco con mas ventas: ");
            String disco = leer.next();

            c.setNombre(nombre);
            c.setDiscoConMasVentas(disco);

            listaDeCantantesFamosos.add(c);

        } while (listaDeCantantesFamosos.size() != 5);

        return listaDeCantantesFamosos;
    }

    public List<CantanteFamoso> mostrarLista(List<CantanteFamoso> listaDeCantantesFamosos) {

        for (int i = 0; i < listaDeCantantesFamosos.size(); i++) {
            System.out.println(listaDeCantantesFamosos.get(i).toString());
        }

        return listaDeCantantesFamosos;
    }
   
   
    
    public List<CantanteFamoso> menu(List<CantanteFamoso> listaDeCantantesFamosos){
        Integer aux = 0;
        do {            
        System.out.println("Que desea hacer en su lista de artista?");
        System.out.println("Si desea agregar otro cantante ingrese 1 ");
        System.out.println("Si desea editar cantante ingrese 2 ");
        System.out.println("Si desea eliminar cantante ingrese 3 ");
        System.out.println("Si desea salir del programa ingrese 4 ");
        
        aux = leer.nextInt();
        
            if (aux == 1) {
                agregarCantante(listaDeCantantesFamosos);
            }
        
            if (aux == 3) {
                eliminarCantante(listaDeCantantesFamosos);
            }
            
        } while (aux != 4);
        
        System.out.println("Su Lista de cantantes quedo de la siguiente manera: ");
        
        return listaDeCantantesFamosos;
}
    public List<CantanteFamoso> agregarCantante(List<CantanteFamoso> listaDeCantantesFamosos){
        CantanteFamoso ca = new CantanteFamoso(); 
        System.out.println("Ingrese un nuevo cantante a la lista");
        System.out.print("Ingrese el nombre del cantante: ");
            String nombre = leer.next();
            System.out.print("Ingrese su disco con mas ventas: ");
            String disco = leer.next();
            ca.setNombre(nombre);
            ca.setDiscoConMasVentas(disco);

            listaDeCantantesFamosos.add(ca);
            
            return listaDeCantantesFamosos;
    }
    public void editarCantante(List<CantanteFamoso> listaDeCantantesFamosos){
         
        System.out.println("Ingrese el nombre del cantante que desee eliminar");
            String editar = leer.next();
            
            for (int i = 0; i < listaDeCantantesFamosos.size(); i++) {
                if (editar.equals(listaDeCantantesFamosos.get(i).getNombre())) {
                    //listaDeCantantesFamosos.set(i, e);
                }
        }
    }
    public void eliminarCantante(List<CantanteFamoso> listaDeCantantesFamosos){
         
        System.out.println("Ingrese el nombre del cantante que desee eliminar");
            String eliminar = leer.next();
            
            for (int i = 0; i < listaDeCantantesFamosos.size(); i++) {
                if (eliminar.equals(listaDeCantantesFamosos.get(i).getNombre())) {
                    listaDeCantantesFamosos.remove(i);
                }
        }
    }
    
    
    
}
