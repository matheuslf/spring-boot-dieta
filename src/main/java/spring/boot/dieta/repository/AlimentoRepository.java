package spring.boot.dieta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.boot.dieta.model.Alimento;

public interface AlimentoRepository extends JpaRepository<Alimento, Long> {
    
}
