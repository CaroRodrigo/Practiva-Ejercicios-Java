
package jdbc;

import DAO.DAOFamilia;
import com.jdbc.servicios.CasaService;
import com.jdbc.servicios.FamiliaService;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JDBC {

    public static void main(String[] args) {
      
        try {
            FamiliaService fs = new FamiliaService();
            CasaService cs = new CasaService();
            //fs.mostrar();
            //cs.casasDisponibles();
            fs.mostrarFamiliasY();
        } catch (Exception ex) {
           ex.printStackTrace();
            System.out.println("sos un burro");
        }
    }
    
}
