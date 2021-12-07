package jpa2.libreria.servicio;

import java.util.Scanner;
import jpa2.libreria.dao.AutorDao;
import jpa2.libreria.entidades.Autor;
import jpa2.libreria.entidades.Cliente;
import jpa2.libreria.entidades.Editorial;
import jpa2.libreria.entidades.Libro;
import jpa2.libreria.entidades.Prestamo;
import jpa2.libreria.servicio.AutorServicio;
import jpa2.libreria.servicio.ClienteServicio;
import jpa2.libreria.servicio.LibroServicio;
import jpa2.libreria.servicio.PrestamoServicio;

public class MenuServicio {

    Libro libro = new Libro();
    Autor autor = new Autor();
    Cliente cliente = new Cliente();
    Editorial editorial = new Editorial();
    Prestamo prestamo = new Prestamo();

    AutorServicio autorservicio = new AutorServicio();
    LibroServicio libroservicio = new LibroServicio();
    EditorialServicio editorialservicio = new EditorialServicio();
    PrestamoServicio prestamoservicio = new PrestamoServicio();
    ClienteServicio clienteservicio = new ClienteServicio();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void menu() throws Exception {
        Integer aux = 0;
        System.out.println("Bienvenido al menu de la libreria");
        do {
            System.out.println("************************************************");
            System.out.println("Ingrese el numero para realizar la accion.");
            System.out.println("Para ver listado,crear,modificar,buscar o eliminar un Libro ingrese 1");
            System.out.println("Para ver listado,crear,modificar,buscar o eliminar un Autor ingrese 2");
            System.out.println("Para ver listado,crear,modificar,buscar o eliminar un Cliente ingrese 3");
            System.out.println("Para ver listado,crear,modificar,buscar o eliminar una Editorial ingrese 4");
            System.out.println("Para realizar o cancelar un prestamo ingrese 5");
            System.out.println("Para salir ingrese 6");
            aux = leer.nextInt();

            if (aux == 1) {
                System.out.println("Para crear un libro ingrese 1");
                System.out.println("Para modificar un libro ingrese 2");
                System.out.println("Para buscar un libro ingrese 3");
                System.out.println("Para eliminar un libro ingrese 4");
                System.out.println("Para mostar todos los libros ingrese 5");
                Integer auxlibro = leer.nextInt();
                if (auxlibro == 1) {
                    System.out.println("Ingrese los datos del libro a crear");
                    System.out.println("IMPORTANTE: si no conoce algun dato ingrese: null ");
                    System.out.println("Datos obligatorios: ISBN, Titulo, Ejemplares y Ejemplares disponibles");
                    System.out.print("Ingrese el ISBN del Libro : ");
                    Long isbn = leer.nextLong();
                    System.out.print("Ingrese el TITULO del Libro : ");
                    String titulo = leer.next();
                    System.out.print("Ingrese el AÑO del Libro : ");
                    Integer anio = leer.nextInt();
                    System.out.print("Ingrese el La cantidad EJEMPLARES del Libro : ");
                    Integer ejemplares = leer.nextInt();
                    System.out.print("Ingrese el La cantidad EJEMPLARES DISPONIBLES del Libro : ");
                    Integer ejemplaresdisponibles = leer.nextInt();
                    libroservicio.crearLibro(isbn, titulo, anio, ejemplares, ejemplaresdisponibles);

                }
                if (auxlibro == 2) {
                    System.out.println("Si quiere modificar el titulo del libro ingrese 1");
                    System.out.println("Si quiere modificar el año del libro ingrese 2");
                    Integer opcion = leer.nextInt();
                    if (opcion == 1) {
                        System.out.print("Ingrese el titulo del libro a modificar: ");
                        String nombreviejo = leer.next();
                        System.out.print("Ingrese el nuevo titulo: ");
                        String nombrenuevo = leer.next();
                        libroservicio.modificarTitulodelLibro(nombreviejo, nombrenuevo);
                    }
                    if (opcion == 2) {
                        System.out.print("Ingrese el titulo del libro a modificar: ");
                        String nombre = leer.next();
                        System.out.print("Ingrese año del libro: ");
                        Integer anionuevo = leer.nextInt();
                        libroservicio.modificarAniodelLibro(nombre, anionuevo);
                    }

                }
                if (auxlibro == 3) {
                    System.out.println("Para buscar un libro por el ISBN ingrese 1");
                    System.out.println("Para buscar un libro por el TITULO ingrese 2");
                    Integer busqueda = leer.nextInt();
                    if (busqueda == 1) {
                        System.out.print("Ingrese el ISBN del titulo: ");
                        Long isbn2 = leer.nextLong();
                        libroservicio.buscarLibroPorIsbn(isbn2);
                    }
                    if (busqueda == 2) {
                        System.out.print("Ingrese el TITULO del libro: ");
                        String titulo2 = leer.next();
                        libroservicio.buscarLibroPorTitulo(titulo2);
                    }
                }
                if (auxlibro == 4) {
                    System.out.println("Si quiere eliminar el libro mediante su ISBN ingrese 1");
                    System.out.println("Si quiere eliminar el libro mediante su TITULO ingrese 2");
                    Integer eliminar = leer.nextInt();
                    if (eliminar == 1) {
                        System.out.print("Ingrese el ISBN del titulo a eliminar: ");
                        Long isbn3 = leer.nextLong();
                        libroservicio.eliminarLibroPorId(isbn3);
                    }
                    if (eliminar == 2) {
                        System.out.print("Ingrese el TITULO del libro a eliminar: ");
                        String titulo3 = leer.next();
                        libroservicio.buscarLibroPorTitulo(titulo3);
                    }
                }
                if (auxlibro == 5) {
                    libroservicio.mostrarLibros();
                }

                if (auxlibro != 1 || auxlibro != 2 || auxlibro != 3 || auxlibro != 4 || auxlibro != 5) {
                    System.out.println("La opcion ingresada no es valida... Redireccionando al menu");
                }

            }

            if (aux == 2) {

            }
            if (aux == 3) {

            }
            if (aux == 4) {

            }
            if (aux == 5) {

            }

            if (aux != 1 || aux != 2 || aux != 3 || aux != 4 || aux != 5 || aux != 6) {
                System.out.println("La opcion ingresada no es valida... Redireccionando al menu");
            }

        } while (aux != 6);
        System.out.println("Gracias por utilizar el menu libreria");
    }
}
