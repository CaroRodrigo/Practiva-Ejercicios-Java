/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coeje5.uti;

import coeje5.Libro.Libro;
import java.util.Comparator;

/**
 *
 * @author W7
 */
public class Comparators {
    public static Comparator<Libro> ordenarporNombre = new Comparator<Libro>(){
        @Override
         public int compare(Libro al1, Libro al2) {
            return al1.getNombreLibro().compareTo(al2.getNombreLibro());
        }
    };
}
