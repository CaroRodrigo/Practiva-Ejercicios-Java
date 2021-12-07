/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa2.libreria.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Libro implements Serializable {

    @Id
    private Long isbn;
    private String titulo;
    private Integer anio;
    private Integer ejemplares;
    private Integer prestados;

    @ManyToOne
    private Autor autor;
    @ManyToOne
    private Editorial editorial;

    public Libro(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer prestados, Autor autor, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Libro(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer prestados) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public Libro(Long isbn) {
        this.isbn = isbn;
    }

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public Libro() {
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getPrestados() {
        return prestados;
    }

    public void setPrestados(Integer prestados) {
        this.prestados = prestados;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", anio=" + anio + ", ejemplares=" + ejemplares + ", prestados=" + prestados + ", autor=" + autor + ", editorial=" + editorial + '}';
    }

    

    

}
