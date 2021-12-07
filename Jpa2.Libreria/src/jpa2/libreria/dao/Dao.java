
package jpa2.libreria.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;


public class Dao {
    protected EntityManager em = Persistence.createEntityManagerFactory("Jpa2.LibreriaPU")
                                 .createEntityManager();
}
