package Jugador;

import Juego.Juego;
import Revolver.RevolverServicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JugadorServicio {

    RevolverServicio r = new RevolverServicio();

    public Juego llenarJugador(Juego j) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Jugador j1 = new Jugador(1, "J1", true);
        Jugador j2 = new Jugador(2, "J2", true);
        Jugador j3 = new Jugador(3, "J3", true);
        Jugador j4 = new Jugador(4, "J4", true);
        Jugador j5 = new Jugador(5, "J5", true);
        Jugador j6 = new Jugador(6, "J6", true);

        j.getJu().add(j1);
        j.getJu().add(j2);
        j.getJu().add(j3);
        j.getJu().add(j4);
        j.getJu().add(j5);
        j.getJu().add(j6);
        return j;
    }

    public boolean disparo(Jugador jugador,Juego j) {
boolean muerto;
        
        if (r.disparar(j) == true) {
            jugador.setVivo(false);
            muerto = true;
            System.out.println("El jugador" + jugador.toString() + "Esta muerto");
            r.siguienteBala(j);
        } else {
            r.siguienteBala(j);
            muerto = false;
            System.out.println("El jugador" + jugador.toString() + "Esta vivo");
        }

        return muerto;
    }

}
