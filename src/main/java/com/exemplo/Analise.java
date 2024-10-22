package com.exemplo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Analise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeEnsaio;
    private String nomeMetodo;
    private String nomeMatriz;
    private String nomeUnidade;
    private Double preco;
    private String resultado;  // Adicione este atributo

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeEnsaio() {
        return nomeEnsaio;
    }

    public void setNomeEnsaio(String nomeEnsaio) {
        this.nomeEnsaio = nomeEnsaio;
    }

    public String getNomeMetodo() {
        return nomeMetodo;
    }

    public void setNomeMetodo(String nomeMetodo) {
        this.nomeMetodo = nomeMetodo;
    }

    public String getNomeMatriz() {
        return nomeMatriz;
    }

    public void setNomeMatriz(String nomeMatriz) {
        this.nomeMatriz = nomeMatriz;
    }

    public String getNomeUnidade() {
        return nomeUnidade;
    }

    public void setNomeUnidade(String nomeUnidade) {
        this.nomeUnidade = nomeUnidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getResultado() {  // Adicione o getter
        return resultado;
    }

    public void setResultado(String resultado) {  // Adicione o setter
        this.resultado = resultado;
    }
}
