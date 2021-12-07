/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa2.libreria.servicio;

import java.util.List;
import jpa2.libreria.dao.AutorDao;
import jpa2.libreria.entidades.Autor;


public class AutorServicio {
    AutorDao autordao = new AutorDao();
    
    public void crearAutor(String nombre) throws Exception{
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("Debe ingresar el nombre del autor");
        }
        Autor autor = new Autor(nombre);
        autordao.crearAutor(autor);
    }
    
    public void mostrarAutores() throws Exception{
            List<Autor> autor = autordao.mostrarAutores();
            for (Autor autor1 : autor) {
                System.out.println(autor1.toString());
        }
    }
    
    public void eliminarAutorPorNombre(String nombre) throws Exception{
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("Debe ingresar el nombre del autor");
        }
        Autor autor = new Autor(nombre);
        autordao.EliminarAutorPorNombre(autor);
    }
    
    public void eliminarAutorPorId(Long id) throws Exception{
        if (id == null || id < 0) {
            System.out.println("Debe ingresar el Id del autor");
        }
        Autor autor = new Autor(id);
        autordao.EliminarPorId(autor);
    }
}
