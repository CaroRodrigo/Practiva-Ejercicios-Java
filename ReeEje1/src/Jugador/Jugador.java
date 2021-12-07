
package Jugador;


public class Jugador {
    private Integer id;
    private String nombre;
    private boolean vivo;

    public Jugador(Integer id, String nombre, boolean vivo) {
        this.id = id;
        this.nombre = nombre;
        this.vivo = vivo;
    }

    public Jugador() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", vivo=" + vivo + '}';
    }
    
    
    
}
