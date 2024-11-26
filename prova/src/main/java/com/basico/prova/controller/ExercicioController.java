package com.basico.prova.controller;

import com.basico.prova.entities.Exercicio;
import com.basico.prova.service.ExercicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/exercicios")
public class ExercicioController {

    @Autowired
    private ExercicioService exercicioService;

    @GetMapping
    public List<Exercicio> listarExercicios() {
        return exercicioService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Exercicio> encontrarExercicio(@PathVariable Long id) {
        return exercicioService.encontrarPorId(id);
    }

    @PostMapping("/add")
    public Exercicio adicionarExercicio(@RequestBody Exercicio exercicio) {
        return exercicioService.salvar(exercicio);
    }

    @PutMapping("/alterar/{id}")
    public Exercicio alterarExercicio(@PathVariable Long id, @RequestBody Exercicio exercicio) {
        return exercicioService.alterar(id, exercicio);
    }

    @DeleteMapping("/{id}")
    public void deletarExercicio(@PathVariable Long id) {
        exercicioService.deletar(id);
    }
    
    
    
}
