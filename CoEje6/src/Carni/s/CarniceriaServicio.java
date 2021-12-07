package Carni.s;

import Carniceria.Carniceria;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CarniceriaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Map<String, String> ca = new HashMap<>();

     public void menu() {
        
        Integer aux = 0;
        do {
            System.out.println("Bienvenido al menu de su carniria!");
            System.out.println("Elija una opcion: ");
            System.out.println("Para agregar un producto ingrese 1");
            System.out.println("Para ver listado de precio ingrese 2");
            System.out.println("Para eliminar un ingrese 3");
            System.out.println("Para modificar el precio de un producto ingrese 4");
            System.out.println("Para salir ingrese 5");

            aux = leer.nextInt();

            crearCartel();
            if ((aux > 0) && (aux < 7)) {

                if (aux == 1) {
                    agregarProducto();
                }
                if (aux == 2) {
                    mostrarMapa();
                }
                if (aux == 3) {
                    eliminarProducto();
                }
                if (aux == 4) {
                    //modificarPrecio();
                }
                
            } else {
                System.out.println("El numero ingresado no es valido");
            }
        } while (aux != 5);
 
    }
    
    
    public void crearCartel() {
        ca.put("Matambre".toUpperCase(), "$ 700".toUpperCase());
        ca.put("Costilla".toUpperCase(), "$ 720".toUpperCase());
        ca.put("Vacio".toUpperCase(), "$ 690".toUpperCase());
        ca.put("Falda".toUpperCase(), "$ 400".toUpperCase());
        ca.put("Matambre de cerdo".toUpperCase(), "$ 800".toUpperCase());
    }

    public void agregarProducto() {
        Carniceria corte = new Carniceria();
        System.out.print("Ingrese el corte: ");
        String co = leer.next().toUpperCase();
        System.out.print("Ingrese el valor del corte");
        String v = leer.next().toUpperCase();

        ca.put(co, v);
    }

    public void mostrarMapa() {
//        Iterator <Map.Entry<String,String>> it = ca.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry<String, String> next = it.next();
//            System.out.println(next.getKey()+","+next.getValue());    
//        }
//        
//        Iterator <Map.Entry<String,String>> it2 = ca.entrySet().iterator();
//        while (it2.hasNext()) {
//            Map.Entry<String, String> next = it2.next();
//            System.out.println(next);    
//        }
        
        for (Map.Entry<String, String> entry : ca.entrySet()) {
           System.out.println(entry);
        }
    }
    
    
    public void eliminarProducto() {
        
        System.out.print("Ingrese el corte a eliminar: ");
        String co = leer.next().toUpperCase();
        for (int i = 0; i < ca.size(); i++) {
            if (ca.containsKey(co)) {
                ca.remove(co);
                break;
            }else{
                System.out.println("No se encontro el corte a eliminar");
            }
        }
 
    }
}
