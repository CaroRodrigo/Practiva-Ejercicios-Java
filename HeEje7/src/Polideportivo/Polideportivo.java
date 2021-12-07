
package Polideportivo;

import Enum.Techo;
import java.util.Random;



public class Polideportivo {
    
    private double largo;
    private double ancho;
    private String nombre;
    private Techo te;

    public Polideportivo(String nombre) {
        Random r = new Random();
        int t = new Random().nextInt(2);
        this.largo = r.nextDouble()*100;
        this.ancho = r.nextDouble()*100;
        this.nombre = nombre;
        this.te = Techo.values()[t];
    }

    public Polideportivo() {
    }
    

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Techo getTe() {
        return te;
    }

    public void setTe(Techo te) {
        this.te = te;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "largo=" + largo + ", ancho=" + ancho + ", nombre=" + nombre + ", te=" + te + '}';
    }

  
    
}
