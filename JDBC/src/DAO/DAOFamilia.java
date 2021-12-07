package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.entidades.Familia;

public class DAOFamilia extends DAO {

    public void crear(Familia familia) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO familias VALUES (" + familia.getIdFamilia()
                + ", '" + familia.getNombre() + "' ," + familia.getEdadMinima()
                + ", " + familia.getEdadMaxima() + ", " + familia.getNumHijos()
                + ", '" + familia.getEmail() + "' ," + familia.getIdCasaFamilia()
                + ")";
        insertarModificarEliminar(query);
    }

    public void eliminar(int id) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM familias where = id_familia = " + id + "";
        insertarModificarEliminar(query);
    }

    public void modificar(Familia familia) throws SQLException, ClassNotFoundException {
        String query = "UPDATE FROM familias SET '" + familia.getNombre() + "' WHERE = nombre = " + familia.getIdFamilia() + "";
        insertarModificarEliminar(query);
    }

    public List<Familia> listar(String query) throws SQLException, Exception {
        try {
            consulta(query);
            List<Familia> familia = new ArrayList();
            while (reSet.next()) {
                Familia f = new Familia();
                f.setIdFamilia(reSet.getInt("id_familia"));
                f.setNombre(reSet.getString(2));
                f.setEdadMinima(reSet.getInt(3));
                f.setEdadMaxima(reSet.getInt("energia_maxima"));
                f.setNumHijos(reSet.getInt(5));
                f.setEmail(reSet.getString(6));
                f.setIdCasaFamilia(reSet.getInt("id_casa_familia"));
                familia.add(f);
            }
            return familia;
        } catch (Exception e) {
            throw new Exception("Error en la consulta, o al mostrar los datos");
        } finally {
            desconectarse();
        }
    }

    public List<Familia> listar310() throws Exception {
        try {
            String query = "select * from familias "
                    + "where num_hijos >= 3 "
                    + " and edad_minima < 10";
            consulta(query);
            List<Familia> familia = new ArrayList();
            while (reSet.next()) {
                Familia f = new Familia();
                f.setIdFamilia(reSet.getInt(1));
                f.setNombre(reSet.getString(2));
                f.setEdadMinima(reSet.getInt(3));
                f.setEdadMaxima(reSet.getInt(4));
                f.setNumHijos(reSet.getInt(5));
                f.setEmail(reSet.getString(6));
                f.setIdCasaFamilia(reSet.getInt(7));
                familia.add(f);
            }
            return familia;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error en la consulta al mostrar los datos");
        } finally {
            desconectarse();
        }

    }
    
    public List<Familia> familiasY() throws SQLException, Exception{
        try {
            String query= "select nombre from familias where nombre like '%y'";            
            consulta(query);
            List<Familia> fa = new ArrayList();
            while(reSet.next()){
                Familia f = new Familia();
                
                f.setNombre(reSet.getString(1));
                
                fa.add(f);
            }
            return fa;
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error al mostrar la consulta");
        }finally{
            desconectarse();
        }
    }
    
    public List<Familia> hotmail() throws Exception {
        try {
            String query = "select * from familias "
                    + "where email like '%hotmail%';";
            consulta(query);
            List<Familia> familia = new ArrayList();
            while (reSet.next()) {
                Familia f = new Familia();
                f.setIdFamilia(reSet.getInt(1));
                f.setNombre(reSet.getString(2));
                f.setEdadMinima(reSet.getInt(3));
                f.setEdadMaxima(reSet.getInt(4));
                f.setNumHijos(reSet.getInt(5));
                f.setEmail(reSet.getString(6));
                f.setIdCasaFamilia(reSet.getInt(7));
                familia.add(f);
            }
            return familia;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error en la consulta al mostrar los datos");
        } finally {
            desconectarse();
        }

    }
}
