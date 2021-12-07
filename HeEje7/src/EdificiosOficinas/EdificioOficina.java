
package EdificiosOficinas;

import java.util.Random;


public class EdificioOficina {
    private Integer numeroDeOficinas;
    private double largo;
    private double ancho;
    private Integer numeroDePisos;

    public EdificioOficina() {
        Random r = new Random();
        
        this.numeroDeOficinas = r.nextInt()*10;
        this.largo = r.nextDouble();
        this.ancho = r.nextDouble();
        this.numeroDePisos = r.nextInt();
    }
    public Integer getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(Integer numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
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

    public Integer getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(Integer numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }

    @Override
    public String toString() {
        return "EdificioOficina{" + "numeroDeOficinas=" + numeroDeOficinas + ", largo=" + largo + ", ancho=" + ancho + ", numeroDePisos=" + numeroDePisos + '}';
    }
    
    
}
