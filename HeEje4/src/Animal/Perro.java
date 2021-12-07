
package Animal;

public class Perro extends Animal{

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad, raza);
    }

    @Override
    public String alimentarse(){
        String alimento;
        alimento = "Huesos";
        return alimento;
    }
}
