
package DAO;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import jdbc.entidades.Casas;

/**
 *
 * @author W7
 */
public class CasaDao extends DAO{
    private SimpleDateFormat sql = new SimpleDateFormat("YYYY-MM-dd");
    private SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY");
    
    public List<Casas> casasDisponibles() throws Exception{
        try {
            String query = "select * from casas where (fecha_desde >='2020-08-01' and fecha_hasta <='2020-08-31') and (pais like 'Reino U%')";
            String query2= "select * from casas where (fecha_desde <='2020-08-01') and DATEDIFF(fecha_desde >='2020-08-01' and fecha_hasta <='2020-08-31') >= CanDias;";
            consulta(query);
            List<Casas> ca = new ArrayList();
            
            while (reSet.next()) {                
                Casas c = new Casas();
                c.setIdCasa(reSet.getInt(1));
                c.setCalle(reSet.getString(2));
                c.setNumero(reSet.getInt(3));
                c.setCodigoPostal(reSet.getString(4));
                c.setCiudad(reSet.getString(5));
                c.setPais(reSet.getString(6));
                c.setFechaDesde(new Date(reSet.getDate(7).getTime()));
                c.setFechaHasta(new Date(reSet.getDate(8).getTime()));
                c.setTiempoMinimo(reSet.getInt(9));
                c.setTiempoMaximo(reSet.getInt(10));
                c.setPrecioHabitacion(reSet.getDouble(11));
                c.setTipoVivienda(reSet.getString(12));
                ca.add(c);
            }
            return ca;
            
        } catch (Exception e) {
        e.printStackTrace();
        throw new Exception("Error al realizar la busqueda");
        }finally{
            desconectarse();
        }
    }
}
