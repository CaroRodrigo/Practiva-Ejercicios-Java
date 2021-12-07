
package pooejee14;



public class Persona {
    private String nombre = "Cosme Fulanito";;
    private Integer edad = 10;;
    private char sexo = 'H';
    private double peso = 80;
    private double altura = 1.72;
    

    public Persona() {
    }

    public Persona(String nombre, Integer edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, Integer edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        
    }

    

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public String toString() {
        return "Persona con parametros definidos \n" + "Nombre: " + nombre + ", Edad: " + edad + ", Sexo: " + sexo + ", Peso: " + peso + ", Altura: " + altura ;
    }
}
