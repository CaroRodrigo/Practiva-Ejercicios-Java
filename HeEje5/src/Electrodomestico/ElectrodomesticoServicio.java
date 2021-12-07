package Electrodomestico;

import Lavadora.Lavadora;
import Lavadora.LavadoraServicio;
import Televisor.Televisor;
import Televisor.TelevisorServicio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ElectrodomesticoServicio {

    public Electrodomestico consumoEnergetico(char letra, Electrodomestico e) {
        if (letra == 'A' || letra == 'B'
                || letra == 'C' || letra == 'D'
                || letra == 'E' || letra == 'F') {

            e.setConsumoEnergetico(letra);

        } else {
            e.setConsumoEnergetico('F');
        }
        return e;
    }

    public Electrodomestico comprobarColor(Electrodomestico e) {

        if (e.getColor().equals("BLANCO")) {
            e.setColor("BLANCO");
        } else if (e.getColor().equals("NEGRO")) {
            e.setColor("NEGRO");
        } else if (e.getColor().equals("ROJO")) {
            e.setColor("ROJO");
        } else if (e.getColor().equals("AZUL")) {
            e.setColor("AZUL");
        } else if (e.getColor().equals("GRIS")) {
            e.setColor("GRIS");
        } else {
            e.setColor("BLANCO");
        }
        return e;
    }

    public Electrodomestico precioFinal(Electrodomestico e) {

        if (e.getConsumoEnergetico() == 'A') {
            e.setPrecioBase(e.getPrecioBase() + 1000);
        } else if (e.getConsumoEnergetico() == 'B') {
            e.setPrecioBase(e.getPrecioBase() + 800);
        } else if (e.getConsumoEnergetico() == 'C') {
            e.setPrecioBase(e.getPrecioBase() + 600);
        } else if (e.getConsumoEnergetico() == 'D') {
            e.setPrecioBase(e.getPrecioBase() + 500);
        } else if (e.getConsumoEnergetico() == 'E') {
            e.setPrecioBase(e.getPrecioBase() + 300);
        } else if (e.getConsumoEnergetico() == 'F') {
            e.setPrecioBase(e.getPrecioBase() + 100);

            if (e.getPeso() >= 0 && e.getPeso() <= 19) {
                e.setPrecioBase(e.getPrecioBase() + 100);
            } else if (e.getPeso() >= 20 && e.getPeso() <= 49) {
                e.setPrecioBase(e.getPrecioBase() + 500);
            } else if (e.getPeso() >= 50 && e.getPeso() <= 79) {
                e.setPrecioBase(e.getPrecioBase() + 800);
            } else if (e.getPeso() > 80) {
                e.setPrecioBase(e.getPrecioBase() + 1000);
            }
        }
        return e;
    }
    Electrodomestico[] e = new Electrodomestico[10];

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ElectrodomesticoServicio es = new ElectrodomesticoServicio();
        Lavadora l = new Lavadora();
        LavadoraServicio ls = new LavadoraServicio();

        TelevisorServicio ts = new TelevisorServicio();
        List<String> color = new ArrayList<String>();
        color.add("Blanco");
        color.add("Negro");
        color.add("Gris");
        color.add("Azul");
        color.add("Rojo");
        color.add("Violeta");
        color.add("Marron");
        List<String> con = new ArrayList<String>();
        con.add("A");
        con.add("B");
        con.add("C");
        con.add("D");
        con.add("E");
        con.add("F");
        con.add("G");
        con.add("H");
        con.add("I");
        con.add("J");
        con.add("K");
        con.add("L");

        

        int total = 0;
        for (int i = 0; i < 10; i++) {

            System.out.println("Que electrodomestico quiere agregar, ingrese un numero");
            System.out.print("1 - LAVADORA , 2 - TELEVISOR     :");
            int opcion = leer.nextInt();
            while (opcion < 1 || opcion > 2) {
                do {
                    System.out.println("El numero ingresado es incorrecto");
                    System.out.println("Que electrodomestico quiere agregar, ingrese un numero");
                    System.out.print("1 - LAVADORA , 2 - TELEVISOR     :");
                    opcion = leer.nextInt();
                } while (opcion == 1 && opcion == 2);
            }
            Random rand = new Random();
            //creando un color aleatori
            int numAleatorio = rand.nextInt(color.size());
            String random = color.get(numAleatorio).toUpperCase();
            int numAleatorio2 = rand.nextInt(con.size());
            //creando consumo energetico aleatorio
            String cons = con.get(numAleatorio2);
            char consumo = cons.charAt(0);
            //creando precio aleatorio
            int precio = (int) Math.floor(Math.random() * (5000 - 1000) + 1000);
            //creando peso
            int peso = (int) Math.floor(Math.random() * (100 - 18) + 18);
            //creando carga
            int carga = (int) Math.floor(Math.random() * (50 - 10) + 10);
            int pulgadas = (int) Math.floor(Math.random() * (80 - 20) + 20);


            if (opcion == 1) {
                

                e[i] = new Lavadora(precio, random, consumo, peso, carga);
                e[i] = (Lavadora) es.comprobarColor(e[i]);
                e[i] = (Lavadora) es.consumoEnergetico(consumo, e[i]);
                e[i] = (Lavadora) es.precioFinal(e[i]);
                e[i] = (Lavadora) ls.precioFinal(carga, e[i]);
            } else if (opcion == 2) {
                e[i] = new Televisor(precio, random, consumo,peso, pulgadas, rand.nextBoolean());
                e[i] = (Televisor) es.comprobarColor(e[i]);
                e[i] = (Televisor) es.consumoEnergetico(consumo, e[i]);
                e[i] = (Televisor) es.precioFinal(e[i]);
                e[i] = (Televisor) ts.precioFinal(pulgadas, rand.nextBoolean(), e[i]);
            }

            total = total + e[i].getPrecioBase();
            System.out.println("Electrodomestico agregado!");
        }
        for (Electrodomestico electrodomestico : e) {
            System.out.println(electrodomestico.toString());

        }

        System.out.println(total);

    }

    public void mostrarPrecio() {
        double auxt = 0;
        double auxl = 0;

        for (int i = 0; i < e.length; i++) {
            if (e[i] instanceof Televisor) {
                auxt = auxt + e[i].getPrecioBase();
            }
            if (e[i] instanceof Lavadora) {
                auxl = auxl + e[i].getPrecioBase();

            }

        }
        System.out.println("La suma de todas las lavadoras son: $" + auxl);
        System.out.println("La suma de todos los televisores son: $" + auxt);
        System.out.println("La suma de todos los electrodomesticos son: $" + (auxl + auxt));
    }

}
