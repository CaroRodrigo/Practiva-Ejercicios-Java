
package Juego;

import Jugador.Jugador;
import Revolver.Revolver;
import java.util.ArrayList;
import java.util.List;


public class Juego {
    private List<Jugador> ju = new ArrayList<>();
    private Revolver r = new Revolver();

    public Juego(Revolver r) {
        this.r = r;
    }

    public Juego() {
    }
    

    public List<Jugador> getJu() {
        return ju;
    }

    public void setJu(List<Jugador> ju) {
        this.ju = ju;
    }

    public Revolver getR() {
        return r;
    }

    public void setR(Revolver r) {
        this.r = r;
    }


    
    
}
