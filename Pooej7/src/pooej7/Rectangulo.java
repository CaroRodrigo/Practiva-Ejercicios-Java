package pooej7;

public class Rectangulo {

    private int alto;
    private int largo;
    private int superficie;
    private int perimetro;

    public Rectangulo(int alto, int largo) {
        this.alto = alto;
        this.largo = largo;
    }

    public int getSuperficie() {
        this.superficie = largo * alto;
        return superficie;
    }

    public int getPerimetro() {
        this.perimetro = (largo + alto) * 2;
        return perimetro;
    }

    
    
    public void mostraRec() {
        for (int i = 0; i < largo; i++) {

            System.out.print(" * ");
            
        }
        System.out.println();

        for (int i = 0; i < alto-2; i++) {
            System.out.print(" * ");        
        for (int j = 0; j < largo-2; j++) {
                System.out.print("   ");
        }
        System.out.println(" * ");
        }

        for (int i = 0; i < largo; i++) {
            System.out.print(" * ");
        }
    }
}
