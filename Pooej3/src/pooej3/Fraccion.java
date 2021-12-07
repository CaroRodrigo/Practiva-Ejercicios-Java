package pooej3;

public class Fraccion {

    int suma;
    int resta;
    int multiplicacion;
    int divicion;

    public void sumar(int numero1, int numero2) {
        suma = numero1 + numero2;
    }

    public void restar(int numero1, int numero2) {
        resta = numero1 - numero2;
    }

    public void multiplicar(int numero1, int numero2) {
        multiplicacion = numero1 * numero2;
    }

    public void dividir(int numero1, int numero2) {
        divicion = numero1 / numero2;
    }

    public void resultados() {
        System.out.println("La suma de los numeros es : " + suma);
        System.out.println("La resta de los numeros es : " + resta);
        System.out.println("La multiplicacion de los numeros es : " + multiplicacion);
        System.out.println("La divicion de los numeros es : " + divicion);

    }

}
