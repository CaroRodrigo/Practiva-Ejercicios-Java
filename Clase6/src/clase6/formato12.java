package clase6;


import java.io.*;

public class formato12 {

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


