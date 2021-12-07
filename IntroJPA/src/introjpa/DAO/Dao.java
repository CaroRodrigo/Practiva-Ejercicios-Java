/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjpa.DAO;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Dao {
    protected EntityManager entityManager= Persistence.createEntityManagerFactory("IntroJPAPU").createEntityManager();
}
