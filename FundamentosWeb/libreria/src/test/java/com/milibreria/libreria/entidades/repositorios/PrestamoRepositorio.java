
package com.milibreria.libreria.entidades.repositorios;

import com.milibreria.libreria.entidades.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestamoRepositorio extends JpaRepository<Prestamo, String> {
    
    @Query("SELECT c FROM Prestamo c WHERE = c.id = :id")
    public Prestamo buscarPrestamo(@Param("id") String id);
}
