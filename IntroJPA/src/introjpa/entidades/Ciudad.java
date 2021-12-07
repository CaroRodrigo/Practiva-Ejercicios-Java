
package introjpa.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ciudad implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    
    @OneToMany(mappedBy = "ciudad")
    private List<Persona> p;

    public Ciudad() {
    }

    public Ciudad(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Persona> getP() {
        return p;
    }

    public void setP(List<Persona> p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "id=" + id + ", nombre=" + nombre + ", p=" + p + '}';
    }
    
}
