
import java.util.Scanner;

/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee caracteres enviados por un sensor. Las lecturas se realizan
de a 5 caracteres (buffer) por vez, los cuales deben llegar con un formato fijo: el
primer carácter tiene que ser X y el último tiene que ser 0.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE que no sea correcta se considera inválida. Al finalizar el
proceso, se imprime un informe indicando la cantidad de lecturas correctas e
inválidas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring() y Length().
 */
public class ejee26 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String aver = "";
        int cont = 0;
        String primer = "";
        int cont2 = 0;
        String ulti = "";
        
        

        System.out.println("Ingrese codigos de 5 caracteres finaliza con : &&&&&");
        aver = leer.next();

        int lon = aver.length();
        ulti = aver.substring(lon - 1, lon);
        primer = aver.substring(0, 1);
        boolean v = primer.equals("x") && ulti.equals("0");
        boolean f = !primer.equals("x") || !ulti.equals("0");
        
     
        if ((aver.length() == 5)) {

            while (!aver.equals("&&&&&")) {
                
                if (v) {
                    cont = cont + 1;
            } else {
                    cont2 = cont2 + 1;
                }
                
                System.out.println("Ingrese codigos de 5 caracteres finaliza con : &&&&&");
                aver = leer.next();
            }

        } else {
            System.out.println("Cantidad de codigos incorrectos");
        }

        System.out.println("La cantidad de codigos correctos fueron " + cont);
        System.out.println("La cantidad de codigos incorrectos fueron " + cont2);
    }

}
