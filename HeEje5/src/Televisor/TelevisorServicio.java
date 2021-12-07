
package Televisor;

import Electrodomestico.Electrodomestico;
import Electrodomestico.ElectrodomesticoServicio;

public class TelevisorServicio {
    
    
    public Electrodomestico precioFinal(int resolucion, boolean sintonizador,Electrodomestico e){
       
        Televisor t = new Televisor();
        
        
        if (sintonizador = true) {
            e.setPrecioBase(e.getPrecioBase()+500);
        }
        
        if (resolucion >= 40 ) {
            double aver = e.getPrecioBase()*1.3;
            int aver2= (int) aver;
            
            e.setPrecioBase(aver2);
        }
        
       
        return e;
    }
}
