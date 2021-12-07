/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjpa.DAO;

import introjpa.entidades.Persona;
import java.util.List;
import javax.persistence.NoResultException;

public class PersonaDao extends Dao {

    public Persona crear(Persona per) throws Exception {
        try {
            //comenzar la transaccion
            entityManager.getTransaction().begin();
            //persistir el objeto
            entityManager.persist(per);
            // ejecutar la transaccion
            entityManager.getTransaction().commit();
          
            return per;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw new Exception("Ocurrio un error al persister el objeto",e);
        }

    }
    
    public void eliminar(Persona per) throws Exception{
        try {
            //comenzar la transaccion
            entityManager.getTransaction().begin();
            //persistir el objeto
            entityManager.remove(per);
            // ejecutar la transaccion
            entityManager.getTransaction().commit();
          
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw new Exception("Ocurrio un error al persister el objeto",e);
        }
    }
    
    public List<Persona> mostrarPersonas() throws Exception{
        try {
            //Query JPQL
            return entityManager.createNativeQuery("select p from Persona p").getResultList();
        } catch (Exception e) {
            throw new Exception("Ocurrio un error al mostrar la listas",e);
        }
    }
    
    public Persona traerPorID(Persona per){
        //try {
            return (Persona) entityManager.createQuery("select p from Persona p , where id = :pepe")
                    .setParameter("pepe", per).getSingleResult(); 
        //} catch (NoResultException e) {
            //System.out.println("No se encontro persona con esa ID");
        //}
        
    }
    
    public Persona traerPorID(Long id){
        //try {
            
            return (Persona) entityManager.createQuery("select p from Persona p , where id = :pepe")
                    .setParameter("pepe", id).getSingleResult();
            
        //} catch (NoResultException e) {
        //System.out.println("No se encontro persona con esa ID");
     //   }
    }
    
    public <List>Persona traerPorCiudad(String ciudad){
        return (Persona) entityManager.createQuery("select p from Persona p, where p.cuidad.nombre = :nombre")
                                         .setParameter("ci",ciudad).getResultList();
    }
    
    public void modificarPersona(Persona per){
        try {
            
            entityManager.getTransaction().begin();
            entityManager.merge(per);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error de sistema");
        }
    }
}
