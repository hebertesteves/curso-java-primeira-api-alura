package hebertesteves.ScreenmatchFrases.repository;

import hebertesteves.ScreenmatchFrases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query("SELECT f FROM Frase f order by function('Random') LIMIT 1")
    Frase buscaFraseAleatoria();
}
