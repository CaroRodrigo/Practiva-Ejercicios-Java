
import java.util.Scanner;

/*
Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

 */
public class ejee23 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int num2;
        int resp;
        String seguro="";

        System.out.println("Ingrese el primer numero");
        num = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();

        do {
        System.out.println("Ingrese el numero de la accion para ejecutar");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        resp = leer.nextInt();
        

            switch (resp) {
                case 1:
                    System.out.println("La suma de " + num + " + " + num2 + " = " + (num + num2));
                    break;
                case 2:
                    System.out.println("La resta de " + num + " - " + num2 + " = " + (num - num2));
                    break;
                case 3:
                    System.out.println("El producto de " + num + " * " + num2 + " = " + (num * num2));
                    break;
                case 4:
                    System.out.println("La divicion de " + num + " / " + num2 + " = " + (num / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    leer.next();
                    seguro = leer.nextLine();
                    break;
                default:
                    System.out.println("ingrese un numero valido");
                    break;
            }
            
        } while (seguro.equals("s"));

    }
}
