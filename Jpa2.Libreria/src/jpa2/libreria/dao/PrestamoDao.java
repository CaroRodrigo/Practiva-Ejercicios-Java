package jpa2.libreria.dao;

import java.util.List;
import javax.persistence.NoResultException;
import jpa2.libreria.entidades.Libro;
import jpa2.libreria.entidades.Prestamo;
import jpa2.libreria.servicio.LibroServicio;

public class PrestamoDao extends Dao {

    public Prestamo crearPrestamo(Prestamo prestamo) throws Exception {
        try {
            em.getTransaction().begin();
            em.persist(prestamo);
            em.getTransaction().commit();
            return prestamo;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception("Error al crear el prestamo");
        }
    }

    public Prestamo EliminarPrestamo(Prestamo prestamo) throws Exception {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(prestamo));
            em.getTransaction().commit();
            return prestamo;
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();

            throw new Exception("Error al eleminar el prestamo");
        }
    }

    public Prestamo ModificarPrestamo(Prestamo prestamo) throws Exception {
        try {
            em.getTransaction().begin();
            em.merge(prestamo);
            em.getTransaction().commit();
            return prestamo;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception("Error al modificar el prestamo");
        }
    }

    public List<Prestamo> mostrarPrestamoes() throws Exception {
        try {
            return em.createQuery("Select a from Prestamo a").getResultList();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception("Eror al eleminar el prestamo");
        }
    }

    public Libro prestarDevolverLibro(Long isbn) throws NoResultException, Exception{

        try {
            LibroServicio libroservicio = new LibroServicio();
            Libro aux = libroservicio.buscarLibroPorIsbn(isbn);
            return aux;
        } catch (NoResultException e) {
            throw new NoResultException("No se encontro el ISBN del libro a prestar");
            
        }
    }

}
