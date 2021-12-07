
package alumno;

public class Alumno {

    private String nombre;
    private Integer legajo;
    private String sexo;
    
    private Double notaFinal;

    public Alumno() {
    }

    public Alumno(String nombre, Double notaFinal) {
        this.nombre = nombre;
        this.notaFinal = notaFinal;
    }

    public Alumno(String nombre, Integer legajo, String sexo, Double notaFinal) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.sexo = sexo;
        this.notaFinal = notaFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

  

    public Double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Double notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "CursoProgramacionEgg{" + "nombre=" + nombre + ", legajo=" + legajo + ", sexo=" + sexo + ", notaFinal=" + notaFinal + '}';
    }
    
    
    
}
