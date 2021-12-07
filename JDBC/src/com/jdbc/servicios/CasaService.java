/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.servicios;

import DAO.CasaDao;
import java.util.ArrayList;
import java.util.List;
import jdbc.entidades.Casas;


public class CasaService {
    CasaDao cdao = new CasaDao();
    public void casasDisponibles() throws Exception{
        try {
            List<Casas> ca = cdao.casasDisponibles();
            for (Casas casas : ca) {
                System.out.println(casas.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error al mostrar casas disponibles");
        }
    }
}
