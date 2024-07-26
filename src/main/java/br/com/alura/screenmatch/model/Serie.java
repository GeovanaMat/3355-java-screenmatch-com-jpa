package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.Optional;
import java.util.OptionalDouble;

public class Serie {
    private String titulo;
    private Integer totalTemporadas;
    private Double avaliacao;
    private String atores;
    private String sinopse;
    private String poster;
    private Categoria genero;

    public Serie(DadosSerie dadosSerie) {
        this.atores  = dadosSerie.atores();
        this.titulo = dadosSerie.titulo();
        this.totalTemporadas = dadosSerie.totalTemporadas();
        this.avaliacao = OptionalDouble.of(Double.parseDouble(dadosSerie.avaliacao())).orElse(0);
        this.poster = dadosSerie.poster();
        this.sinopse = dadosSerie.sinopse();
        this.genero = Categoria.fromString(dadosSerie.genero().split(",")[0].trim());

    }
}
