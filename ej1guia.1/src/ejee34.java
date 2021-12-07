
import java.util.Scanner;

/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
public class ejee34 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;

        System.out.println("Escriba 4 numeros enteros del 1 al 20");
        System.out.print("Escriba el primer numero : ");
        num = leer.nextInt();
        System.out.print("Escriba el segundo numero : ");
        num2 = leer.nextInt();
        System.out.print("Escriba el tercer numero : ");
        num3 = leer.nextInt();
        System.out.print("Escriba el cuarto numero : ");
        num4 = leer.nextInt();

        if (num > 0 && num < 21) {
        System.out.print(num);
        for (int i = 0; i < num; i++) {
            System.out.print(" *");}
           } else {
           System.out.print("ATENCION : el primer numero ingresado ( " + num + " ) es incorrecto");  }
        
        
        
        System.out.println();
        
        if (num2 > 0 && num2 < 21) {
        System.out.print(num2);
        for (int i = 0; i < num2; i++) {
            System.out.print(" *");}
        } else {
           System.out.print("ATENCION : el segundo numero ingresado ( " + num2 + " ) es incorrecto");  }
        
        
        System.out.println();

         if (num3 > 0 && num3 < 21) {
        System.out.print(num3);
        for (int i = 0; i < num3; i++) {
            System.out.print(" *"); }
        } else {
           System.out.print("ATENCION : el tercer numero ingresado ( " + num3 + " ) es incorrecto");  }
        
        System.out.println();

        if (num4 > 0 && num4 < 21) {
        System.out.print(num4);
        for (int i = 0; i < num4; i++) {
            System.out.print(" *");}
        } else {
           System.out.print("ATENCION : el cuarto numero ingresado ( " + num4 + " ) es incorrecto");  }
    
        System.out.println();
    
    }

}
