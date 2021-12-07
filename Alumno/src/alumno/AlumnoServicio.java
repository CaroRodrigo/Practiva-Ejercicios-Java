package alumno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AlumnoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Alumno> lista = new ArrayList();

    public void crearAlumno() {
        Integer aux = 0;

        do {
            Alumno a = new Alumno();
            System.out.print("Ingrese el nombre completo del alumno: ");
            a.setNombre(leer.next());
            System.out.print("Ingrese el legajo del alumno: ");
            a.setLegajo(leer.nextInt());
            System.out.print("Ingrese el sexo del alumno(M / F): ");
            String s = leer.next();
            char se = s.charAt(0);
            String sos = Character.toString(se).toUpperCase();
            if (sos.equals("F") || sos.equals("H")) {
                a.setSexo(sos);
            }
            System.out.print("Ingrese la nota final del alumno: ");
            a.setNotaFinal(leer.nextDouble());

            System.out.print("Desea agregar otro alumno? (1 SI/2 NO)");
            aux = leer.nextInt();

            if ((aux != 1) && (aux != 2)) {
                do {
                    System.out.println("El numero ingresado es incorrecto");
                    System.out.print("Desea agregar otro alumno? (1 SI/2 NO)");
                    aux = leer.nextInt();
                } while ((aux != 1) && (aux != 2));

            }
            
            lista.add(a);

        } while (aux != 2);

        System.out.println("--------- Su lista de alumnos es : -----------");
        mostrarLista();
        System.out.println("Lista por nota orden descendente");
        ordenarPorNotaDes();
        System.out.println("Lista por nota orden ascendente");
        ordenarPorNotaAs();
        System.out.println("Lista por nota nombres (orden alfabrtico)");
        ordenarPorNombre();
        
        
        //ordenarPorNota();

    }

    public void crearAlumno2(){
       Alumno al1 = new Alumno("Rodrigo Caro", 37315716,"M", 3.5);
       Alumno al2 = new Alumno("Roberto Caro", 30315716,"M", 8.5);
       Alumno al3 = new Alumno("Cosme Fulanito", 20315716,"M", 7.5);
       Alumno al4 = new Alumno("Juan Topo", 14315716,"M", 9.5);
       Alumno al5 = new Alumno("Joel Soñora", 39315716,"M", 1.5);
        
        lista.add(al1);
        lista.add(al2);
        lista.add(al3);
        lista.add(al4);
        lista.add(al5);
        
        System.out.println("Lista original");
        mostrarLista();
        System.out.println("Lista por nota orden descendente");
        ordenarPorNotaDes();
        System.out.println("Lista por nota orden ascendente");
        ordenarPorNotaAs();
        System.out.println("Lista por nota nombres (orden alfabrtico)");
        ordenarPorNombre();
                 
    }
    
    public void mostrarLista() {
        for (Alumno alu : lista) {
            System.out.println(alu);
        }
    }
    
    public void ordenarPorNotaDes(){
        Collections.sort(lista, Comparators.comparadorDesc );
        for (Alumno alumno : lista) {
            System.out.println(alumno);
        }
    }
    
    public void ordenarPorNotaAs(){
        
        Collections.sort(lista, Comparators.comparadorAsc);
        for (Alumno alumno : lista) {
            System.out.println(alumno);
        }
    }
    
    public void ordenarPorNombre(){
        Collections.sort(lista, Comparators.ordenarporNombre);
        for (Alumno alumno : lista) {
            System.out.println(alumno);
        }
    }
    
    //Set<Alumno> alumnosSet = new TreeSet(Comparators.comparadorDesc ));
}
