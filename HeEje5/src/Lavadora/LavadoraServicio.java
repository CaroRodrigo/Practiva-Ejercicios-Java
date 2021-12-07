
package Lavadora;


import Electrodomestico.Electrodomestico;
import Electrodomestico.ElectrodomesticoServicio;


public class LavadoraServicio {
    
    public Electrodomestico precioFinal(int carga,Electrodomestico e){
      
        if (carga > 30) {
            e.setPrecioBase(e.getPrecioBase()+500);
        } 
        return e;
    }
    
}
