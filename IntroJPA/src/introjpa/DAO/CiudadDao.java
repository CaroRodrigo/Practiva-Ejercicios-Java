
package introjpa.DAO;

import introjpa.entidades.Ciudad;
import java.util.List;
import javax.persistence.NoResultException;


public class CiudadDao extends Dao {
    
    public Ciudad crear(Ciudad ciu) throws Exception {
        try {
            //comenzar la transaccion
            entityManager.getTransaction().begin();
            //ciusistir el objeto
            entityManager.persist(ciu);
            // ejecutar la transaccion
            entityManager.getTransaction().commit();
          
            return ciu;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw new Exception("Ocurrio un error al ciusister el objeto",e);
        }

    }
    
    public void eliminar(Ciudad ci) throws Exception{
        try {
            //comenzar la transaccion
            entityManager.getTransaction().begin();
            //ciusistir el objeto
            entityManager.remove(ci);
            // ejecutar la transaccion
            entityManager.getTransaction().commit();
          
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw new Exception("Ocurrio un error al ciusister el objeto",e);
        }
    }
    
    public List<Ciudad> mostrarCiudads() throws Exception{
        try {
            //Query JPQL
            return entityManager.createNativeQuery("select p from Ciudad p").getResultList();
        } catch (Exception e) {
            throw new Exception("Ocurrio un error al mostrar la listas",e);
        }
    }
    
    public Ciudad traerPorID(Ciudad ciu) throws NoResultException{
        try {
            return (Ciudad) entityManager.createQuery("select p from Ciudad p , where id = :pepe")
                    .setParameter("pepe", ciu).getSingleResult(); 
        } catch (NoResultException e) {
            throw new NoResultException("t,masdklhasdfl");
           
        }
        
    }
    
    public Ciudad traerPorID(Long id){
        //try {
            
            return (Ciudad) entityManager.createQuery("select p from Ciudad p , where id = :pepe")
                    .setParameter("pepe", id).getSingleResult();
            
        //} catch (NoResultException e) {
        //System.out.println("No se encontro ciudad con esa ID");
        //}
    }
    
    public <List>Ciudad traerPorCiudad(String ciudad){
        return (Ciudad) entityManager.createQuery("select p from Ciudad p, where p.cuidad.nombre = :nombre")
                                         .setParameter("ci",ciudad).getResultList();
    }
    
    public void modificarCiudad(Ciudad ciu){
        try {
            
            entityManager.getTransaction().begin();
            entityManager.merge(ciu);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error de sistema");
        }
    }
}

