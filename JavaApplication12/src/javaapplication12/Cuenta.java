
package javaapplication12;

public class Cuenta {
    private Integer numeroCuenta;
    private long dni;
    private double saldoActual;
    private double interesAnual;
    private double interesDiario;
  

    public Cuenta() {
    }

    public Cuenta(Integer numeroCuenta, long dni, double saldoActual, double interesAnual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interesAnual = interesAnual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
        
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }


    
 public double actualizarSaldo(){
     interesDiario = saldoActual / 365;
     saldoActual = (interesDiario * interesAnual) / 365 ;
     return saldoActual;
 }
    
 public double ingresar(double ingreso){
     saldoActual = saldoActual+ ingreso;
     return saldoActual;
 }
 
 public double retirar (double retiro){
     saldoActual = saldoActual - retiro;
     return saldoActual;
 }
 
 
 public void consultarSaldo(){
     System.out.println("Su saldo actual es :" + saldoActual);
 }
 
 
 public void consultarDatos(){
     System.out.println("El numero de cuenta es: " + numeroCuenta);
     System.out.println("El D.N.I del titular es: " + dni);
     System.out.println("El saldo de la cuenta es: "+ saldoActual);
     System.out.println("El interes anual de la cuenta es del : %" + interesAnual);
 }
 
}
    
    

