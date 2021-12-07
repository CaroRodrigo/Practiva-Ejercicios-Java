
package Baraja;

import Enum.Palo;


public class Baraja {
    private Integer num;
    private Palo palos;

    
    public Baraja(Integer num, Palo palos) {
        this.num = num;
        this.palos = palos;
    }
    

    public Baraja() {
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Palo getPalos() {
        return palos;
    }

    public void setPalos(Palo palos) {
        this.palos = palos;
    }

    @Override
    public String toString() {
        return "Carta{" + num + " "+ palos + '}';
    }
    
    
}
