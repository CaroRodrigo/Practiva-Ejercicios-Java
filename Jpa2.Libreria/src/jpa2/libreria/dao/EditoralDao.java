
package jpa2.libreria.dao;

import java.util.List;
import jpa2.libreria.entidades.Editorial;


public class EditoralDao extends Dao{
     public Editorial crearEditorial(Editorial editorial) throws Exception {
        try {
            em.getTransaction().begin();
            em.persist(editorial);
            em.getTransaction().commit();
            return editorial;
        } catch (Exception e) {
            em.getTransaction().rollback();
        throw new Exception("Error al crear el editorial");
        }
    }
    
    public Editorial EliminarEditorial(Editorial editorial) throws Exception{
        try {
            em.getTransaction().begin();
            em.remove(em.merge(editorial));
            em.getTransaction().commit();
            return editorial;
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
            
        throw new Exception("Error al eleminar el editorial");
        }
    }
    public Editorial ModificarEditorial(Editorial editorial) throws Exception{
        try {
            em.getTransaction().begin();
            em.merge(editorial);
            em.getTransaction().commit();
            return editorial;
        } catch (Exception e) {
            em.getTransaction().rollback();
        throw new Exception("Error al modificar el editorial");
        }
    }
    
    public List<Editorial>mostrarEditoriales() throws Exception{
        try {
            return em.createQuery("Select a from Editorial a").getResultList();
        } catch (Exception e) {
            em.getTransaction().rollback();
        throw new Exception("Eror al eleminar el editorial");
        }
    }
}
