package rodrigocaro.estanciaexterior.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rodrigocaro.estanciaexterior.entidades.Reserva;

@Repository
public interface ReservaRepositorio extends JpaRepository<Reserva, String> {
    
}
