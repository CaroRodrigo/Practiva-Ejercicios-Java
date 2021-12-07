
import java.util.Iterator;
import java.util.Scanner;

/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */


public class ejee24 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int num = 0;
      int acu = 0;
        
      for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese 20 numeros enteros a sumar, la suma se corta con 0");
            num = leer.nextInt();
            if (num > 0) {
            acu = acu + num;
            }
            if (num == 0) {
                System.out.println("Se capturo el numero 0");
                break;
          }
        }
            System.out.println("La cantidad de los numeros sumados son : " + acu);
        }
      
    }
