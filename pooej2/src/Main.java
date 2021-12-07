
import java.util.Scanner;


public class Main {

 
    public static void main(String[] args) {
        Circunferencia ci = new Circunferencia(0);
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el radio del circulo : ");
        ci.setRadio(sc.nextDouble());
        
        System.out.println("El area del circulo es : "+ ci.calcularArea());
        System.out.println("El perimetro del circulo es : "+ ci.calcularPerimetro());
    
}
}