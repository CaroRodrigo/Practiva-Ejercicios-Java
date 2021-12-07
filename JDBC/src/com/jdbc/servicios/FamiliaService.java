package com.jdbc.servicios;

import DAO.DAOFamilia;
import java.sql.SQLException;
import java.util.List;
import jdbc.entidades.Familia;

public class FamiliaService {

    DAOFamilia fdao = new DAOFamilia();

    public void crearFamilia(Integer id, String nombre, Integer edadMin, Integer edadMa, Integer numHijos, String email, Integer idCasa) throws Exception {
        if (id < 0) {
            throw new Exception("Error al ingresar el id");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception("Error al ingresar el nombre");
        }
        Familia f = new Familia(id, nombre, edadMin, edadMa, numHijos, email, idCasa);

        fdao.crear(f);
    }

    public void mostrar() throws Exception {
        List<Familia> familia = fdao.listar310();
           
        if (familia.isEmpty()) {
           throw new Exception("No Existen familias para imprimir");
        } else {
            for (Familia familia1 : familia) {
                System.out.println(familia1.toString());
            }
                
                
            }
        }
    public void mostrarFamiliasY() throws Exception{
        
            List<Familia>f = fdao.familiasY();
            
            if (f.isEmpty()) {
                throw new Exception("no hay familias en la lista");       
            } else {
                for (Familia familia : f) {
                    System.out.println(familia.toString());
                }
            }
            
       
    }
    }

