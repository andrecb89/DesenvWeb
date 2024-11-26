package com.basico.prova.entities;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Treino {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
        private Long id;
        private Long nmrSeries;
        private Long repeticoes;
        private Long descansoSeries;
        private String status;

        @ManyToMany
        private List<Exercicio> exercicios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNmrSeries() {
        return nmrSeries;
    }

    public void setNmrSeries(Long nmrSeries) {
        this.nmrSeries = nmrSeries;
    }

    public Long getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(Long repeticoes) {
        this.repeticoes = repeticoes;
    }

    public Long getDescansoSeries() {
        return descansoSeries;
    }

    public void setDescansoSeries(Long descansoSeries) {
        this.descansoSeries = descansoSeries;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }
}
