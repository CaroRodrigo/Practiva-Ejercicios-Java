/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

import java.util.Scanner;

public class Ejecutable {
public static void main(String[] args) {

       Scanner lector = new Scanner(System.in);

       int c = 0;

       int val = lector.nextInt();

        while(val > 0) {

               if(val % 2 == 0) 

                   c++;

        }

        System.out.println("Contador de pares: " + c);

    }

}