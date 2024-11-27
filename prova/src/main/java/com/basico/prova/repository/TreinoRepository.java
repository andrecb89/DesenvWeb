package com.basico.prova.repository;

import com.basico.prova.entities.Treino;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TreinoRepository extends JpaRepository<Treino, Long> {

    Optional<List<Treino>> findAllByStatus(String status);



}
