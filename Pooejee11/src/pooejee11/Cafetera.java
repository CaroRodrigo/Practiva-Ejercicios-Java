package pooejee11;

public class Cafetera {

    private double capacidadMaxima;
    private double capacidadActual;
    

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.capacidadActual = 0;
    }

    public Cafetera(double capacidadMaxima) {
        capacidadActual = capacidadMaxima;
    }

    public Cafetera(double capacidadMaxima, double capacidadActual) {

    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public double llenarCafetera() {
        capacidadActual = 1000;
        return capacidadActual;
    }

    public double servirTaza(int servir){
        int taza = 200;
        int capacidadAServir = taza * servir;
        
                if (capacidadActual < capacidadAServir) {
            System.out.println("No tiene contenido para servir todas las tazas");
        }
                if (capacidadActual > capacidadAServir) {
                    System.out.println("Buenisimo, se sirvieron las tazas");
                    capacidadActual = capacidadActual - capacidadAServir;
        }
        
        return capacidadActual;
    }
    
    public double vaciarCafetera() {
        capacidadActual = 0;
        return capacidadActual;
    }
public double agregarCafe(double agregamos){
    capacidadActual = capacidadActual + agregamos; 
    if (capacidadActual > capacidadMaxima) {
        System.out.println("Usted no puede agregar esa cantidad por que supera la cantidad maxima");
    } 
    if (capacidadActual< capacidadMaxima) {
        System.out.println("Cafe agregado");
    }
    return capacidadActual;
}
    
}