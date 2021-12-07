
package Animal;


public abstract class Animal {
    private String nombre;
    private int edad;
    private String raza;

    public Animal(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public abstract String alimentarse();

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + '}';
    }

  
   
}
