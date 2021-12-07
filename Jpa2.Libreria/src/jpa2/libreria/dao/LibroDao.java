package jpa2.libreria.dao;

import java.util.List;
import javax.persistence.NoResultException;
import jpa2.libreria.entidades.Libro;

public class LibroDao extends Dao {

    public Libro crearLibro(Libro libro) throws Exception {
        try {
            em.getTransaction().begin();
            em.persist(libro);
            em.getTransaction().commit();
            return libro;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception("Error al crear el libro");
        }
    }

    public Libro EliminarLibro(Libro libro) throws Exception {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(libro));
            em.getTransaction().commit();
            return libro;
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();

            throw new Exception("Error al eleminar el libro");
        }
    }

    public Libro ModificarLibro(Libro libro) throws Exception {
        try {
            em.getTransaction().begin();
            em.merge(libro);
            em.getTransaction().commit();
            return libro;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception("Error al modificar el libro");
        }
    }

    public List<Libro> mostrarLibros() throws Exception {
        try {
            return em.createQuery("Select a from Libro a").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            throw new Exception("Error al mostrar los libro");
        }
    }

    public void EliminarLibroPorNombre(Libro libro) throws Exception {
        try {
            em.getTransaction().begin();
            em.createQuery("delete from Autor a where a.nombre = :nombre")
                    .setParameter("nombre", libro.getTitulo()).executeUpdate();
            em.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();

            throw new Exception("Error al eleminar el autor");
        }
    }

    public void EliminarPorId(Libro libro) throws Exception {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(libro));
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

    public Libro buscarLibroPorTitulo(String titulo) throws NoResultException {
        try {
            return (Libro) em.createQuery("select l from Libro l where l.titulo = :tit")
                    .setParameter("tit", titulo).getSingleResult();
        } catch (NoResultException ex) {
            throw new NoResultException("El titulo ingresado no se encuentra en la libreria");
        }

    }

    public Libro buscarLibroPorIsbn(Long isbn) throws NoResultException {
        try {
            return (Libro) em.createQuery("select l from Libro l where l.isbn = :is")
                    .setParameter("is", isbn).getSingleResult();
        } catch (NoResultException ex) {
            ex.printStackTrace();
            throw new NoResultException("El titulo ingresado no se encuentra en la libreria");
        }
    }
}
