
public class Circunferencia {
    //atrivuto
    
    double area;
    double peri;
    private double radio;

    //constructores
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    // metodos
    
    public double calcularArea(){
        this.area = Math.PI * Math.pow(radio,2);
    return area;
    }
    
    public double calcularPerimetro(){
    this.peri = 2 * Math.PI * radio;
    return peri;
    }
    }
