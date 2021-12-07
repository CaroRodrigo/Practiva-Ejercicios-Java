package Baraja;

import Enum.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class BarajaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Queue<Baraja> ma = new LinkedList<>();
    Queue<Baraja> removidas = new LinkedList<>();

    public void menu() {
        int accion;
        do {
            System.out.println("Bienvenido a su menu Baraja, mucha suerte!");
            System.out.println("Ingrese la opcion a ejecutar");
            System.out.println("Ingrese 1 para ver las cartas de la baraja");
            System.out.println("Ingrese 2 para mezclar las cartas");
            System.out.println("Ingrese 3 para sacar una carta");
            System.out.println("Ingrese 4 para repartir");
            System.out.println("Ingrese 5 para ver las cartas que salieron");
            System.out.println("Ingrese 6 para ver las cartas disponibles para repartir");
            System.out.println("Ingrese 7 para repartir");
            accion = leer.nextInt();

            if (accion == 1) {
                mostrarBaraja();
            } else if (accion == 2) {
                mezclar();
            } else if (accion == 3) {
                siguienteCarta();
            } else if (accion == 4) {
                repartirCartas();
            } else if (accion == 5) {
                cartasDelMonton();
            } else if (accion == 6) {
                cartasDisponibles();
            }else if (accion == 7) {
                System.out.println("Gracias por jugar");
            }else {
                System.out.println("El numero ingresado es incorrecto");
            }

        } while (accion != 7);

    }

    public void crearCartas2(){
        for (int i = 1; i < 13; i++) {
            if ((i==8) || (i==9) ) {
                System.out.println("");
                continue;
            } else {
            ma.add(new Baraja(i,Palo.BASTO));
            ma.add(new Baraja(i,Palo.ESPADA));
            ma.add(new Baraja(i,Palo.COPA));
            ma.add(new Baraja(i,Palo.ORO));
            }    
        }
    }
    

    public void mezclar() {
        System.out.println("-------------Cartas Mezcladas-------------");
        List<Baraja> mazo = new ArrayList<>(ma);
        Collections.shuffle(mazo);
        Queue<Baraja> ma2 = new LinkedList<>(mazo);
        ma = ma2;

    }

    public void siguienteCarta() {
        System.out.println("-----------------------");

        if (ma.size() <= 0) {
            System.out.println("No hay mas cartas para repartir.");
        } else {
            System.out.println("Carta Repartida");
            removidas.add(ma.poll());

        }
    }

    public void repartirCartas() {
        System.out.print("Cuantas cartas desea repartir?: ");
        int repartir = leer.nextInt();

        if ((ma.size() - repartir) < 0) {
            System.out.println("Cartas insuficientes en el mazo para repartir");
        } else {
            System.out.println("Cartas Repartidas ");
            for (int i = 0; i < repartir; i++) {
                removidas.add(ma.poll());
            }
        }
    }

    public void cartasDisponibles(){
        System.out.println("Las Cartas que aun se pueden repartir son:" + ma.size());
    }
    
    public void cartasDelMonton() {
        if (ma.size() == 40) {
            System.out.println("No a salido ninguna carta");
        } else {
            System.out.println("Las cartas que salieron son: ");
            for (Baraja re : removidas) {
                System.out.println(re);
            }
        }
    }

    public void mostrarBaraja() {
        for (Baraja baraja : ma) {
            System.out.println(baraja);
        }
    }
}
