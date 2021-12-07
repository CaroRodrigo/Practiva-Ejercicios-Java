
package Polideportivo;

import Enum.Techo;
import Interfases.Edificio;
import Interfases.InstalacionDeportiva;
import java.util.ArrayList;
import java.util.List;




public class PolideportivoServicio implements Edificio, InstalacionDeportiva{

List<Polideportivo> poli = new ArrayList<Polideportivo>();

        public void agregarDeportivo(){
        poli.add(new Polideportivo("Carlos Cerutti"));
        poli.add(new Polideportivo("Diego Maradona"));
        poli.add(new Polideportivo("Raul Spiricueta"));    
        for (Polideportivo polideportivo : poli) {
                System.out.println(polideportivo);
            }
        }

        public int mostrarLista(){
            return poli.size();
        }
        
    @Override
    public double calcularSuperficie() {
        double resultado1 = 0;
        double resultado2 = 0;
        double resultado3 = 0;
        
        
        for (Polideportivo polideportivo : poli) {
               if (polideportivo.getNombre().equals("Carlos Cerutti")) {
                resultado1 = polideportivo.getAncho()* polideportivo.getLargo();
            } else if(polideportivo.getNombre().equals("Diego Maradona")){
                    resultado2 = polideportivo.getAncho()* polideportivo.getLargo();
                    }else if(polideportivo.getNombre().equals("Raul Spiricueta")){
                        resultado3 = polideportivo.getAncho()* polideportivo.getLargo();
                    }
        }
        
        System.out.println("La supperficie del polideportivo Carlos Cerutti es: " + resultado1);
        System.out.println("La supperficie del polideportivo Diego Maradona es: " + resultado2);
        return resultado3;
    }

    @Override
    public int tipoDeInstalacionAbierto() {
        
        int abierto = 0;
        int cerrado = 0;
        
        for (Polideportivo polideportivo : poli) {
            if (polideportivo.getTe().equals(Techo.ABIERTO)) {
                abierto = abierto + 1;
            }else{
                cerrado = cerrado + 1;
            }
        }
        
        return abierto;
    }
    
    

    
        



   

   
   


    
    
}
