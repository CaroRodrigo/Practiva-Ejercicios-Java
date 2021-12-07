
import java.util.Scanner;

/*Dada las horas trabajadas de una persona y el valor por hora. Calcular su salario e
imprimirlo. Salario = Hs. trabajadas * valor por hora */
public class ej6 {

    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     float horas;
     float valor;
     float salario;
           
        System.out.println("ingrese las cantidad de horas trabajadas");
     horas = leer.nextFloat();
     
     System.out.println("ingrese el valor de una hora de trabajo");
     valor = leer.nextFloat();
     
     salario = horas * valor;
     
     System.out.println("Por lo trabajado le corresponde un salario de : $" + salario );
     
    }
    
}
