/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa2.libreria.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Prestamo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Temporal(TemporalType.DATE)
    private Date devolucion;
    @ManyToOne
    private Libro libro;
    @ManyToOne
    private Cliente cliente;


    public Prestamo(Date fecha, Date devolucion) {
        this.fecha = fecha;
        this.devolucion = devolucion;
    }

    public Prestamo() {
    }

    public Prestamo(Long id, Date fecha, Date devolucion) {
        this.id = id;
        this.fecha = fecha;
        this.devolucion = devolucion;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "id=" + id + ", fecha=" + fecha + ", devolucion=" + devolucion + ", libro=" + libro + ", cliente=" + cliente + '}';
    }

    
    
    
    
    
    
}
