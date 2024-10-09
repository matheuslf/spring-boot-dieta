package spring.boot.dieta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.boot.dieta.model.Dieta;
import java.util.List;
import java.time.LocalDate;


public interface DietaRepository extends JpaRepository<Dieta, Long> {

    List<Dieta> findByDia(LocalDate dia);
    
}
