// JPA <- Java persistanse API

package introjpa;


import introjpa.DAO.CiudadDao;
import introjpa.DAO.PersonaDao;
import introjpa.entidades.Ciudad;
import introjpa.entidades.Persona;




public class IntroJPA {

   
    public static void main(String[] args) {
        try {
            PersonaDao p = new PersonaDao();
            CiudadDao cdao = new CiudadDao();
           
            Ciudad c1 = cdao.crear(new Ciudad("Cordoba"));
            p.crear(new Persona("Rodrigo", c1)); 
            
        } catch (Exception e) {
        e.printStackTrace();
            System.out.println("Error" + e.getMessage());
        }
    }
    
}
