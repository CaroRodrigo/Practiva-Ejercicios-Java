package Juego;

import Jugador.Jugador;
import Jugador.JugadorServicio;
import Revolver.RevolverServicio;
import java.util.ArrayList;
import java.util.List;

public class JuegoServicio {

    RevolverServicio re = new RevolverServicio();
    JugadorServicio jug = new JugadorServicio();

    public Juego llenarJuego() {
        Juego j = new Juego();
        j.setR(re.llenarRevolver());
        j=jug.llenarJugador(j);
        return j;
    }

    public void ronda(Juego j) {
        
            for (int i = 0; i < j.getJu().size(); i++) {
            if (jug.disparo(j.getJu().get(i),j) == true) {
                
            }

        }
            /*for (int i = 0; i < j.getJu().size(); i++) {
                if (j.getJu().get(i).isVivo()) {
                    
                }
            }*/
        
        
        
    }
}
