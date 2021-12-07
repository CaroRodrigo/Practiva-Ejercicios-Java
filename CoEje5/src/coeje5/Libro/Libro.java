
package coeje5.Libro;

public class Libro {
    private String nombreLibro;
    private String autorLibro;
    private Integer ejemplaresLibro;
    private Integer ejemplaresPrestados;

    public Libro() {
    }

    public Libro(String nombreLibro, String autorLibro, Integer ejemplaresLibro, Integer ejemplaresPrestados) {
        this.nombreLibro = nombreLibro;
        this.autorLibro = autorLibro;
        this.ejemplaresLibro = ejemplaresLibro;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public Integer getEjemplaresLibro() {
        return ejemplaresLibro;
    }

    public void setEjemplaresLibro(Integer ejemplaresLibro) {
        this.ejemplaresLibro = ejemplaresLibro;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    @Override
    public String toString() {
        return "Libro= {" + " Nombre: " + nombreLibro + ", Autor: " + autorLibro + ", Cantidad de ejemplares: " + ejemplaresLibro + ", Ejemplares Prestados: " + ejemplaresPrestados + '}';
    }

    public int setEjemplaresPrestados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
