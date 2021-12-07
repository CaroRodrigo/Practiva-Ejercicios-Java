/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo
por parámetro. Después haremos otra función o procedimiento que imprima el
vector.
 */


public class ejee44 {

    public static void main(String[] args) {
        int[] vector;
        vector = new int [20];
        
        for (int i = 0; i < 20; i++) {
            vector[i] = ((int) (Math.random()*21));
        }
    
        mostrar(vector);
    }
    public static void mostrar(int[] vector){
        for (int aux : vector) {
            System.out.println(aux);
        }
    }
    }
