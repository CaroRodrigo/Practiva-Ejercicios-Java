package rodrigocaro.estanciaexterior.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rodrigocaro.estanciaexterior.entidades.Familia;

@Repository
public interface FamiliaRepositorio extends JpaRepository<Familia, String>{
    
}
