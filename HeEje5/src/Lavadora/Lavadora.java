
package Lavadora;

import Electrodomestico.Electrodomestico;

public class Lavadora extends Electrodomestico{
private double carga = 5;

    public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga=carga;
        
    }

    public Lavadora(int precioBase, int peso) {
        super(precioBase, peso);
    }

    public Lavadora() {
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        super.toString();
        return "Lavadora: " + super.toString() + ", Carga: " + carga ;
    }

    

}
    

