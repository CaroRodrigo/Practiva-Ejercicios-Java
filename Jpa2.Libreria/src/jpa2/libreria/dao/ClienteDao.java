
package jpa2.libreria.dao;

import java.util.List;
import javax.persistence.NoResultException;
import jpa2.libreria.entidades.Cliente;
import jpa2.libreria.entidades.Cliente;


public class ClienteDao extends Dao{
     public Cliente crearCliente(Cliente cliente) throws Exception {
        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
            return cliente;
        } catch (Exception e) {
            em.getTransaction().rollback();
        throw new Exception("Error al crear el cliente");
        }
    }
    
    public Cliente EliminarCliente(Cliente cliente) throws Exception{
        try {
            em.getTransaction().begin();
            em.remove(em.merge(cliente));
            em.getTransaction().commit();
            return cliente;
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
            
        throw new Exception("Error al eleminar el cliente");
        }
    }
    public Cliente ModificarCliente(Cliente cliente) throws Exception{
        try {
            em.getTransaction().begin();
            em.merge(cliente);
            em.getTransaction().commit();
            return cliente;
        } catch (Exception e) {
            em.getTransaction().rollback();
        throw new Exception("Error al modificar el cliente");
        }
    }
    
    public List<Cliente>mostrarClientees() throws Exception{
        try {
            return em.createQuery("Select a from Cliente a").getResultList();
        } catch (Exception e) {
            em.getTransaction().rollback();
        throw new Exception("Eror al eleminar el cliente");
        }
    }
    
     public Cliente buscarClientePorDni(Long dni) throws NoResultException {
        try {
            return (Cliente) em.createQuery("select c from Cliente c where c.dni = :dni")
                    .setParameter("dni", dni).getSingleResult();
        } catch (NoResultException ex) {
            throw new NoResultException("No se encontro el DNI ingresado");
        }
    }
}
