/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa2.libreria.dao;

import java.util.List;
import jpa2.libreria.entidades.Autor;

/**
 *
 * @author W7
 */
public class AutorDao extends Dao {
    public Autor crearAutor(Autor autor) throws Exception {
        try {
            em.getTransaction().begin();
            em.persist(autor);
            em.getTransaction().commit();
            return autor;
        } catch (Exception e) {
            em.getTransaction().rollback();
        throw new Exception("Error al crear el autor");
        }
    }
    
    public void EliminarPorId(Autor autor) throws Exception{
        try {
         em.getTransaction().begin();
         em.remove(em.merge(autor));
         // tambien se puede borrar de esta manera
         //Autor autor = entityManager.find(Autor.class, id);
         //em.remove(autor);
         
         em.getTransaction().commit();
            
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
            
            
        throw new Exception("Error al eleminar el autor");
        }
    }
    public void EliminarAutorPorNombre(Autor autor) throws Exception{
        try {
         em.getTransaction().begin();
            em.createQuery("delete from Autor a where a.nombre = :nombre")
            .setParameter("nombre", autor.getNombre()).executeUpdate();
          em.getTransaction().commit();
            
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
            
            
        throw new Exception("Error al eleminar el autor");
        }
    }
    public Autor ModificarAutor(Autor autor) throws Exception{
        try {
            em.getTransaction().begin();
            em.merge(autor);
            em.getTransaction().commit();
            return autor;
        } catch (Exception e) {
            em.getTransaction().rollback();
        throw new Exception("Error al modificar el autor");
        }
    }
    
    public List<Autor>mostrarAutores() throws Exception{
        try {
            return em.createQuery("Select a from Autor a").getResultList();
        } catch (Exception e) {
            em.getTransaction().rollback();
        throw new Exception("Eror al eleminar el autor");
        }
    }
            
           
}
