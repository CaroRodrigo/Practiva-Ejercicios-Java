
import java.util.Scanner;

/*
 . Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
public class ejee32 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;

        System.out.print(" ingrese el tamaño del cuadrado : ");
        num = teclado.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print(" * ");}
         
        System.out.println();
       
        for (int i = 0; i < num - 2; i++) {
            System.out.print(" * ");
            for (int j = 0; j <num-2; j++) {
            System.out.print("   ");     
            }
            System.out.println(" * ");
        }
        
     
        for (int i = 0; i < num; i++) {
            System.out.print(" * ");
        }
    }
}
