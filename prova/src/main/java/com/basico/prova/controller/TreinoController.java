package com.basico.prova.controller;

import com.basico.prova.entities.Treino;
import com.basico.prova.service.TreinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/treino")
public class TreinoController {

    @Autowired
    private TreinoService treinoService;

    @GetMapping
    public List<Treino> listarTreinos() {
        return treinoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Treino> encontrarTreino(@PathVariable Long id) {
        return treinoService.encontrarPorId(id);
    }

    @PostMapping("/add")
    public Treino adicionarTreino(@RequestBody Treino treino) {
        return treinoService.salvar(treino);
    }

    @PutMapping("/alterar/{id}")
    public Treino alterarTreino(@PathVariable Long id,@RequestBody Treino treino) {
        return treinoService.atualizar(id, treino);
    }


    @DeleteMapping("/{id}")
    public void deletarTreino(@PathVariable Long id) {
        treinoService.deletar(id);
    }
    
    
    
    
}
