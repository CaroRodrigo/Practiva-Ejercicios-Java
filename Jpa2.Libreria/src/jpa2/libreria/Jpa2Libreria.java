package jpa2.libreria;

import java.util.logging.Level;
import java.util.logging.Logger;
import jpa2.libreria.servicio.MenuServicio;

public class Jpa2Libreria {

    public static void main(String[] args) {
        MenuServicio menuservicio = new MenuServicio();
        try {

            menuservicio.menu();

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("-.-");
        }
    }

}
