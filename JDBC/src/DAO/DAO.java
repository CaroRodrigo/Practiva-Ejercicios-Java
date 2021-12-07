/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author W7
 */
public class DAO {
    protected Connection con = null;
    protected Statement sta = null;
    protected ResultSet reSet = null;
    
    private String user = "root";
    private String password = "root";
    private String schema = "estancias_exterior";
    
    
    public void conectarse() throws ClassNotFoundException, SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/" + schema + "?useSSL=false";
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            throw new ClassNotFoundException ("error");
        } catch (SQLException ex) {
           throw new SQLException ("Error al conectarse");
        }
    }
    
    public void desconectarse() throws SQLException{
        try {
            if (con != null) {
            con.close();
        }
        if (sta != null) {
            sta.close();
        }
        if (reSet != null) {
            reSet.close();
        } 
        } catch (SQLException e) {
        e.printStackTrace();
        throw new SQLException("error al desconectarse");
        }
        
       
    }
    
    public void insertarModificarEliminar(String query) throws SQLException, ClassNotFoundException{ // INSERT INTO Familias VALUES(.....)
        conectarse();
        try {
            sta= con.createStatement();
            sta.executeUpdate(query); // execute()---> PUEDE HACER CONSULTAS SELECT UPDATE DELETE INSERT, executeQuery() -----> SOLO PUEDE HACER SELECT, executeUpdate()--->UPDATE DELETE INSERT 
        } catch (SQLException e) {
            e.printStackTrace();
            con.rollback();//GUARDA AUTOMATICAMENTE LA ULTIMA ACTUALIZACION QUE SE HIZO EN LA BASE DE DATOS
            throw new SQLException ("Error al crear un CRUD");//CREATE READ UPDATE DELETE = CRUD
        }finally{
            desconectarse();
        }
    }
    
    public void consulta(String query) throws ClassNotFoundException, SQLException{
        conectarse();
        try {
            sta= (Statement) con.createStatement();//SELECT * FROM familias;
            reSet = sta.executeQuery(query);// executeQuery() ---> SOLO HACEMOS CONSULTA SELECT;
        } catch (SQLException e) {
        e.printStackTrace();
        throw new SQLException ("Error al crear un CRUD");//CREATE READ UPDATE DELETE = CRUD
        }
    }
}
