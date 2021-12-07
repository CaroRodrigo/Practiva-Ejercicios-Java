package jpa2.libreria.servicio;

import java.util.List;
import javax.persistence.NoResultException;
import jpa2.libreria.dao.LibroDao;
import jpa2.libreria.entidades.Libro;

public class LibroServicio {

    LibroDao librodao = new LibroDao();

    public void crearLibro(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer prestados) throws Exception {
        if (titulo == null || titulo.isEmpty()) {
            System.out.println("Debe ingresar el nombre del libro");
        }
        if (isbn < 0) {
            System.out.println("Debe ingresar un ISBN");
        }

        Libro libro = new Libro(isbn, titulo, anio, ejemplares, prestados);
        librodao.crearLibro(libro);
        System.out.println("El libro fue creado con exito");
    }

    public List<Libro> mostrarLibros() throws Exception {
        List<Libro> libro = librodao.mostrarLibros();
        System.out.println("La lista de la libreria : ");
        for (Libro libro1 : libro) {
            System.out.println(libro1.toString());
        }
        return libro;
    }

    public void eliminarLibroPorNombre(String titulo) throws Exception {
        if (titulo == null || titulo.isEmpty()) {
            System.out.println("Debe ingresar el nombre del libro");
        }
        Libro libro = new Libro(titulo);
        librodao.EliminarLibroPorNombre(libro);
    }

    public void eliminarLibroPorId(Long isbn) throws Exception {
        if (isbn == null || isbn < 0) {
            System.out.println("Debe ingresar el Id del libro");
        }
        Libro libro = new Libro(isbn);
        librodao.EliminarPorId(libro);
        System.out.println("El libro fue eliminado con exito");
    }

    public Libro buscarLibroPorTitulo(String titulo) throws NoResultException {
        if (titulo == null || titulo.isEmpty()) {
            System.out.println("Debe ingresar el nombre del libro");
        }
        Libro libro = new Libro(titulo);
        System.out.println(librodao.buscarLibroPorTitulo(titulo).toString());
    return libro;
    }

    public Libro buscarLibroPorIsbn(Long isbn) throws NoResultException {
        if (isbn == null || isbn < 0) {
            System.out.println("Debe ingresar el nombre del libro");
        }
        Libro libro = new Libro(isbn);
        System.out.println(librodao.buscarLibroPorIsbn(isbn).toString());
        return librodao.buscarLibroPorIsbn(isbn);
    }

    public void modificarTitulodelLibro(String nombreviejo, String nombrenuevo) throws Exception {
            Libro li = librodao.buscarLibroPorTitulo(nombreviejo);
            li.setTitulo(nombrenuevo);
            librodao.ModificarLibro(li);
            System.out.println("El libro fue modificado exitosamente");
    }
    
    public void modificarAniodelLibro(String titulo , Integer anionuevo) throws Exception {
            Libro li = librodao.buscarLibroPorTitulo(titulo);
            li.setAnio(anionuevo);
            librodao.ModificarLibro(li);
            System.out.println("El libro fue modificado exitosamente");
    }
}
