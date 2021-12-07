
package Animal;


public class Caballo extends Animal{

    public Caballo(String nombre, int edad, String raza) {
        super(nombre, edad, raza);
    }
    
    @Override
    public String alimentarse(){
        String alimentarse = "Alfalfa";
        return alimentarse;
    }
}
