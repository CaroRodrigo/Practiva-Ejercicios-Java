
package com.milibreria.libreria.entidades.repositorios;

import com.milibreria.libreria.entidades.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface LibroRepositorio extends JpaRepository<Libro, Long> {
    @Query("SELECT l FROM Libro l WHERE l.libro.isbn = :isbn")
    public Libro buscarLibro(@Param(":isbn") Long isbn);
    
    @Query("SELECT l FROM Libro l WHERE l.libro.isbn = :isbn")
    public List<Libro> mostrarLibros(@Param(":isbn") Long isbn);
}
