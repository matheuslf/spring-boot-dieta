package spring.boot.dieta.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import spring.boot.dieta.model.Dieta;
import spring.boot.dieta.repository.DietaRepository;

@Service
public class DietaService {

    private final DietaRepository dietaRepository;

    public DietaService(DietaRepository dietaRepository) {
        this.dietaRepository = dietaRepository;
    }

    public Dieta adicionarDieta(Dieta dieta) {
        dieta.getAlimentos().forEach(alimento -> alimento.setDieta(dieta));
        return dietaRepository.save(dieta);
    }

    public List<Dieta> listarDietas() {
        return dietaRepository.findAll();
    }

    public List<Dieta> listarDietasPorDia(LocalDate dia) {
        return dietaRepository.findByDia(dia);
    }
    
}
