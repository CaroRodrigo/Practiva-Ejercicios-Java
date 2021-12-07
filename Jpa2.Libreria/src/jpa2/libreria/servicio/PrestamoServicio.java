/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa2.libreria.servicio;

import java.util.List;
import javax.persistence.NoResultException;
import jpa2.libreria.dao.LibroDao;
import jpa2.libreria.dao.PrestamoDao;
import jpa2.libreria.entidades.Libro;

/**
 * libroservicio prestamodao
 */
public class PrestamoServicio {

    PrestamoDao prestamodao = new PrestamoDao();
    LibroDao librodao = new LibroDao();

    public void prestarLibroBuscarPorIsbn(Long isbn) throws NoResultException, Exception {
      
        Libro li = librodao.buscarLibroPorIsbn(isbn);
        
        if (li.getPrestados() < li.getEjemplares()) {
       li.setPrestados(li.getPrestados()+1);
       librodao.ModificarLibro(li);  
            System.out.println("El libro fue prestado exitosamente");
        }else{
            System.out.println("Todos los ejemplares de este libro ya se encuentan prestados");   
        }
        
    }
    
     public void devolverLibroBuscarPorIsbn(Long isbn) throws NoResultException, Exception {
        Libro aux = prestamodao.prestarDevolverLibro(isbn);
        Libro li = librodao.buscarLibroPorIsbn(isbn);
        
        if (li.getPrestados() <= li.getEjemplares() && li.getPrestados() > 0) {
       li.setPrestados(li.getPrestados()-1);
       librodao.ModificarLibro(li);  
            System.out.println("La Devolucion fue exitosa");
        }else{
            System.out.println("No se puede realziar devolucion, verifique el motivo");   
        }
        
    }
}
