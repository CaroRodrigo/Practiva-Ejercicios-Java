package rodrigocaro.estanciaexterior.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rodrigocaro.estanciaexterior.entidades.Comentario;

@Repository
public interface ComentarioRepositorio extends JpaRepository<Comentario, String>{
    
}
