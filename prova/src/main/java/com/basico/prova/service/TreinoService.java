package com.basico.prova.service;

import com.basico.prova.entities.Treino;
import com.basico.prova.repository.TreinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TreinoService {

    @Autowired
    private TreinoRepository treinoRepository;


    public List<Treino> listarTodos() {
        return treinoRepository.findAll();
    }

    public Optional<Treino> encontrarPorId(Long id) {
        return treinoRepository.findById(id);
    }

    public Treino salvar(Treino treino) {
        Treino treinoSalvo = treinoRepository.save(treino);
        return treinoSalvo;
    }

    public Treino atualizar(Long id, Treino treino) {
        Treino novoTreino = treinoRepository.getOne(id);
        novoTreino.setNmrSeries(treino.getNmrSeries());
        novoTreino.setRepeticoes(treino.getRepeticoes());
        novoTreino.setDescansoSeries(treino.getDescansoSeries());
        novoTreino.setStatus(treino.getStatus());
        novoTreino.setExercicios(treino.getExercicios());
        return treinoRepository.save(novoTreino);}

    public void deletar(Long id) {
        treinoRepository.deleteById(id);
    }
    
    
}
