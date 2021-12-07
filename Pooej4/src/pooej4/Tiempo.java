
package pooej4;

public class Tiempo {
    private Integer hora;
    private Integer minutos;
    private Integer segundos;
    

    public void tiempo (){
    
    }

    public Tiempo(Integer hora, Integer minutos, Integer segundos) {
        if (hora > 24 || hora < 0) {
       System.out.println("La hora ingresada es invalida");
        }else {
        this.hora = hora;}
        
        if (minutos > 59 || minutos < 0) {
       System.out.println("Los minutos ingresados son invalidos");
        }else {
        this.minutos = minutos;}
        if (segundos > 59 || segundos < 0) {
            System.out.println("Los segundos ingresados son invalidos");
        }else {
        this.segundos = segundos;}
    }
    
    
    /*
    public Integer getHora() {
        
        return hora;
    }

    public void setHora(Integer hora) {
      
       this.hora = hora;
    }

    public Integer getMinutos() {
       
        
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public Integer getSegundos() {
        return segundos;
    }

    public void setSegundos(Integer segundos) {
        this.segundos = segundos;
    }
    
    */
    public void imprimirHoraCompleta(){
        
            
        System.out.println("La ingresada fue : " + hora +":" + minutos +":"+ segundos);
    
    }
    
}
