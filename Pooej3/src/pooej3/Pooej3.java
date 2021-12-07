package pooej3;

import java.util.Scanner;

public class Pooej3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
        Fraccion fra = new Fraccion();

        fra.sumar(num1, num2);
        fra.restar(num1, num2);
        fra.multiplicar(num1, num2);
        fra.dividir(num1, num2);

        fra.resultados();
    }

}
