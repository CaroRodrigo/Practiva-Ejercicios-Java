
package Televisor;

import Electrodomestico.Electrodomestico;

public class Televisor extends Electrodomestico {
    private int resolucion = 20;
    private boolean sintonizador = false;

    public Televisor(int precioBase, String color, char consumoEnergetico, 
                     int peso, int resolucion,boolean sintonizador) {
        
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion=resolucion;
        this.sintonizador=sintonizador;
    }

    public Televisor(int precioBase, int peso) {
        super(precioBase, peso);
    }

    public Televisor() {
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    

    @Override
    public String toString() {
        super.toString();
        return "Televisor: " + super.toString() + ", Resolucion: " + resolucion + ", Sintonizador: " + sintonizador ;
    }   
}