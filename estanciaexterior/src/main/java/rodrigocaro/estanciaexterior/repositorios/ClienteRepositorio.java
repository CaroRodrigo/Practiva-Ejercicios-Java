package rodrigocaro.estanciaexterior.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rodrigocaro.estanciaexterior.entidades.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, String> {
    
}
