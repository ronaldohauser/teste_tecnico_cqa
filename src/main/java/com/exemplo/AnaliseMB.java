package com.exemplo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ManagedBean
@ViewScoped
public class AnaliseMB {

    private Analise analise = new Analise();
    private AnaliseService analiseService;

    public AnaliseMB() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("seu_persistence_unit");
        EntityManager em = emf.createEntityManager();
        analiseService = new AnaliseService(em);
    }

    public String salvar() {
        analiseService.salvarAnalise(analise);
        analise = new Analise(); // Limpa o formulário após salvar
        return "Análise gravada com sucesso";
    }

    // Getters e Setters
    public Analise getAnalise() {
        return analise;
    }

    public void setAnalise(Analise analise) {
        this.analise = analise;
    }
}
