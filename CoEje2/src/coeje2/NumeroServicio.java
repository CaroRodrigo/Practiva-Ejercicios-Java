package coeje2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NumeroServicio {

    Scanner leer = new Scanner(System.in);
    Numero num = new Numero();
    List<Double> operaciones = new ArrayList<Double>();
    

    public ArrayList<Integer> pedirNumeros() {
        Integer pedir = 0;
        do {
            System.out.print("Ingrese un numero, para finalizar -99: ");
            pedir = leer.nextInt();
            num.getListaDeNumeros().add(pedir);
        } while (pedir != -99);
        Integer eliminar = -99;
        num.getListaDeNumeros().remove(eliminar);

        return (ArrayList<Integer>) num.getListaDeNumeros();

    }

    public void calcularSuma() {

        Iterator<Integer> it = num.getListaDeNumeros().iterator();
        Double suma = 0.0;
        Double promedio = 0.0;

        while (it.hasNext()) {
            suma = suma + it.next();
        }
        promedio = suma / num.getListaDeNumeros().size();

        operaciones.add(promedio);
        operaciones.add(suma);

    }

    public void mostrarResultado() {
        Double aux = 0.0;
        aux =operaciones.get(operaciones.size() - 1);
        Integer aux2 = aux.intValue();
        
        System.out.println("Los numeros ingresados son: " + num.getListaDeNumeros());
        System.out.println("La suma de todos los numeros son: " + aux2);
        System.out.println("El promedio de los numeros ingresados son: " + operaciones.get(operaciones.size() - 2));

        System.out.println("Los numeros ingresados que estan por arriba del promedio son: ");
        for (Integer lista : num.getListaDeNumeros()) {
            if (lista > operaciones.get(operaciones.size() - 2)) {
                System.out.println(lista);
            }
        }
        System.out.println("Los numeros ingresados que estan por debajo del promedio son: ");
        for (Integer lista : num.getListaDeNumeros()) {
            if (lista < operaciones.get(operaciones.size() - 2)) {
                System.out.println(lista);
            }
        }

    }

}


