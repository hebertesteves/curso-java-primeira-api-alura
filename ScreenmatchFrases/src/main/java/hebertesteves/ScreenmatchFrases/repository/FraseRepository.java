package hebertesteves.ScreenmatchFrases.repository;

import hebertesteves.ScreenmatchFrases.entity.Frases;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepository extends JpaRepository<Frases, Long> {

}
