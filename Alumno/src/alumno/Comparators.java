/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

import java.util.Comparator;

/**
 *
 * @author W7
 */
public class Comparators {

    public static Comparator<Alumno> comparadorAsc = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno al1, Alumno al2) {
            return al1.getNotaFinal().compareTo(al2.getNotaFinal());
        }
    };
    
    public static Comparator<Alumno> comparadorDesc = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno al1, Alumno al2) {
            return al2.getNotaFinal().compareTo(al1.getNotaFinal());
        }
    };

    public static Comparator<Alumno> ordenarporNombre = new Comparator<Alumno>(){
        @Override
         public int compare(Alumno al1, Alumno al2) {
            return al1.getNombre().compareTo(al2.getNombre());
        }
    };
    
}
