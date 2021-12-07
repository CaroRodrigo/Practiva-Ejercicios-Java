package coeje5.Servicio;

import coeje5.Libro.Libro;
import coeje5.uti.Comparators;
import java.util.*;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Libreria {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Set<Libro> libros = new TreeSet<Libro>(Comparators.ordenarporNombre);

    public void menuLibreria() {
        Integer aux = 0;
        do {
            System.out.println("Bienvenido al menu de su libreria!");
            System.out.println("Elija una opcion: ");
            System.out.println("Para agregar un libro ingrese 1");
            System.out.println("Para prestar un libro ingrese 2");
            System.out.println("Para devolver un libro ingrese 3");
            System.out.println("Para mostrar el listado de libros ingrese 4");
            System.out.println("Para eliminar ingrese 5");
            System.out.println("Para salir ingrese 6");

            aux = leer.nextInt();

            crearLibro();
            if ((aux > 0) && (aux < 7)) {

                if (aux == 1) {
                    agregarLibro();
                }
                if (aux == 2) {
                    prestamo();
                }
                if (aux == 3) {
                    devolucion();
                }
                if (aux == 4) {
                    mostrarLista();
                }
                if (aux == 5) {
                    eliminarCantante();
                }
            } else {
                System.out.println("El numero ingresado no es valido");
            }
        } while (aux != 6);

    }

    public void crearLibro() {
        Libro l1 = new Libro("Harry Potter".toUpperCase(), "Cosme Fulanito".toUpperCase(), 3, 2);
        Libro l2 = new Libro("El Principito".toUpperCase(), "Qseyo".toUpperCase(), 3, 0);
        Libro l3 = new Libro("Una luna de papel".toUpperCase(), "Dross".toUpperCase(), 3, 2);
        Libro l4 = new Libro("Aventuras por el mundo".toUpperCase(), "Luisito comunica".toUpperCase(), 3, 1);
        libros.add(l1);
        libros.add(l2);
        libros.add(l3);
        libros.add(l4);
    }

    public void agregarLibro() {
        Libro li = new Libro();
        System.out.print("Ingrese el nombre del libro: ");
        li.setNombreLibro(leer.next().toUpperCase());
        System.out.print("Ingrese el autor del libro: ");
        li.setAutorLibro(leer.next().toUpperCase());
        System.out.print("Ingrese la cantidad de ejemplares que tenemos del libro: ");
        li.setEjemplaresLibro(leer.nextInt());
        System.out.print("Ingrese la cantidad de ejerplares que se prestaron del libro: ");
        li.setEjemplaresPrestados(leer.nextInt());
        libros.add(li);
    }

    public void prestamo() {
        Libro lib = new Libro();
        System.out.print("Ingrese el titulo del libro que se va prestar: ");
        String aux = leer.next().toUpperCase();

        for (Libro libro : libros) {
            if (libro.getNombreLibro().equals(aux)) {
                if (libro.getEjemplaresLibro() > libro.getEjemplaresPrestados()) {
                    libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() + 1);
                    System.out.println("El libro fue prestado con exito");
                } else {
                    System.out.println("No se pudo prestar este libro, por que ya no quedan ejemplares disponibles");
                }
                if (!libro.getNombreLibro().equals(aux)) {
                    System.out.println("No se encontro el libro");
                }
            }
        }

    }

    public void devolucion() {

        System.out.print("Ingrese el titulo del libro que desea devolver: ");
        String aux = leer.next().toUpperCase();

        for (Libro libro : libros) {
            if (libro.getNombreLibro().equals(aux)) {
                if (libro.getEjemplaresPrestados() > 0) {
                    libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() - 1);
                    System.out.println("El libro fue devuelto con exito");
                    break;
                } else {
                    System.out.println("El libro ingresado todavia no ha sido prestado");
                    break;
                } 
            }
            {
                  System.out.println("No se encontro el libro en nuestra libreria");
                
            }
        }

    }

    public void mostrarLista() {
        for (Libro libro : libros) {
            System.out.println("listado" + libro);
        }
    }

    public void eliminarCantante() {

        System.out.println("Ingrese el nombre del cantante que desee eliminar");
        String eliminar = leer.next();

        Iterator<Libro> it = libros.iterator();

        while (it.hasNext()) {
            Libro next = it.next();
            if (next.getNombreLibro().equals(eliminar.toUpperCase())) {
                it.remove();
            }
        }

    }
}
