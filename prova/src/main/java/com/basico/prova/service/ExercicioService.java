package com.basico.prova.service;

import com.basico.prova.entities.Exercicio;
import com.basico.prova.repository.ExercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExercicioService {


    private ExercicioRepository exercicioRepository;

    public ExercicioService(ExercicioRepository exercicioRepository) {
        this.exercicioRepository = exercicioRepository;
    }

    public List<Exercicio> listarTodos() {
        return exercicioRepository.findAll();
    }

    public Optional<Exercicio> encontrarPorId(Long id) {
        return exercicioRepository.findById(id);
    }

    public Exercicio salvar(Exercicio exercicio) {
        return exercicioRepository.save(exercicio);
    }

    public Exercicio alterar(Long id, Exercicio exercicio) {
        Exercicio novoExercicio = exercicioRepository.getOne(id);
        novoExercicio.setNomeExercicio(exercicio.getNomeExercicio());
        return exercicioRepository.save(novoExercicio);}

    public void deletar(Long id) {
        exercicioRepository.deleteById(id);
    }
}
