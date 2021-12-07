
package Carniceria;


public class Carniceria {
    private String corte;
    private String precio;

    public Carniceria() {
    }

    public Carniceria(String corte, String precio) {
        this.corte = corte;
        this.precio = precio;
    }

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "NewClass{" + "corte=" + corte + ", precio=" + precio + '}';
    }
    
    
}
