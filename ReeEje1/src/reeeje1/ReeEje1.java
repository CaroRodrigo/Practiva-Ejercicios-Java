package reeeje1;

import Juego.Juego;
import Juego.JuegoServicio;
import Jugador.Jugador;
import Jugador.JugadorServicio;
import Revolver.Revolver;
import Revolver.RevolverServicio;
import java.util.ArrayList;
import java.util.List;

public class ReeEje1 {

    public static void main(String[] args) {
        JuegoServicio jue = new JuegoServicio();
        Juego ju = new Juego();      
        
        ju = jue.llenarJuego();

        
        jue.ronda(ju);
        
        
        

    }

}
