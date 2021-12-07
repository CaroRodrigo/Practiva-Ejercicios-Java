
package Electrodomestico;


public class Electrodomestico {
    protected int precioBase = 1000;
    protected String color = "Blanco";
    protected char consumoEnergetico = 'F';
    protected int peso = 5;

    public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    
    
    public Electrodomestico(int precioBase,int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        
    }
    public Electrodomestico() {
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Precio: " + precioBase + ", Color: " + color + ", Consumo Energetico: " + consumoEnergetico + ", Peso: " + peso ;
    }
    
}
