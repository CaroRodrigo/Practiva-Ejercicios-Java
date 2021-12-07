package rodrigocaro.estanciaexterior.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rodrigocaro.estanciaexterior.entidades.Casa;

@Repository
public interface CasaRepositorio extends JpaRepository<Casa, String> {
    
}
