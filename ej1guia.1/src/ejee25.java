
import java.util.Scanner;

/*
 Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
números pares y la cantidad de números impares. Al igual que en el ejercicio
anterior los números negativos no deben sumarse. Nota: recordar el uso de la
sentencia break.
 */


public class ejee25 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num;
        int impar = 0;
        int par = 0;
        int todos = 0;
        
        
        do {            
            System.out.println("Ingrese un numero entero, la suma finaliza con multipo de 5");
            num = leer.nextInt();
            if (num > 0) {
                todos = todos + 1;
                }
            if (num%2==0) {
                par = par + 1;  
            }
            else if (num%2!=0) {
                impar = impar + 1;
            }
                  
        } while (num%5 !=0 );
        
        System.out.println("La cantidad de numeros positivos ingresados fueron : " + todos);
        System.out.println("La cantidad de numeros impares positivos ingresados fueron : " + impar);
        System.out.println("La cantidad de numeros pares positivos ingresados fueron : " + par);
    }
    
}
