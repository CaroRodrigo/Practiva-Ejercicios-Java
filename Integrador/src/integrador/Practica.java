package integrador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Practica {

    /**
     * El programa debera tomar un numero x y determinar si es palindromo o no
     * **Contemplar que el num que llega puede ser null,en caso de que sea null,
     * retornar false, en caso que sea palindromo retornar true.
     *
     * @param num
     * @return esPalindromo
     */
    public Boolean numeroPalindromo(Long num) {
        Long dividir = 0L, invertir = 0L;
        Long aux = num;
        Boolean palindromo = false;

        while (num != 0) {
            dividir = num % 10;
            invertir = invertir * 10 + dividir;
            num = num / 10;
        }
        if (Objects.equals(invertir, aux)) {
            palindromo = true;
        } else if (!Objects.equals(invertir, aux)) {
            palindromo = false;
        }
        return palindromo;
    }

    /**
     * Estamos en caramelolandia, donde estan los peores ladrones de dulces. Una
     * vez al mes, se sienta una n cantidad de presos en ronda, contemplando al
     * primer preso que se sienta, como el preso 0. A los presos se le repartira
     * una m cantidad de caramelos contemplando que se comenzaran a repartir los
     * caramelos desde el primer preso (inicio). El ultimo caramelo en
     * repartirse estara podrido, determinar a que preso, segun su posicion en
     * la ronda le tocara.
     *
     * @param inicio
     * @param cantidadCaramelos
     * @param cantidadPresos
     * @return presoQueLeTocoElCarameloPodrido
     */

    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadPresos) {
        for (int i = 0; i < cantidadCaramelos; i++) {
            if (inicio == cantidadPresos - 1) {
                inicio = 0;
            } else {
                inicio = inicio + 1;
            }
        }
        return inicio;
    }

    /**
     * En un universo paralelo, donde los habitantes son medias, existe un
     * crucero de medias donde se sube una lista de medias. Esta lista de
     * tripulantes del crucero es una Collection de letras, lo que se debera
     * hacer, es filtrar la lista de medias que se suben al crucero y retornar
     * una lista que contenga los grupos de medias que si tenian amigas. Esta
     * lista final de medias amigas se mostraran ordenadas de menor a mayor. A
     * continuacion un ejemplo:
     *
     * List de medias que llegan : A,B,A,B,C,A,F,Z,C,H **F,Z,H no tienen amigas
     * :( List que se deberia retornar : A,B,C
     *
     *
     * @param pasajeros
     * @return mediasAmigas
     */
    public List<String> mediasAmigas(List<String> pasajeros) {
        List<String> parejas = new ArrayList();
        
        
        Collections.sort(pasajeros);
        for (int i = 0; i < pasajeros.size(); i++) {
            for (int j = 0; j < pasajeros.size(); j++) {
                if (pasajeros.get(i).equals(pasajeros.get(j)) && i != j) {
                    
                    parejas.add(pasajeros.remove(i));
                }
            }
        }
        
        Set<String> parejas2 = new HashSet(parejas);
        
        List<String> parejas3 = new ArrayList(parejas2);
        return parejas3;
    }
//aguanten un toque me llaman al cel
}
