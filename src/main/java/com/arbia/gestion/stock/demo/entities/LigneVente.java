package com.arbia.gestion.stock.demo.entities;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class LigneVente implements Serializable {
    @Id
    @GeneratedValue
    private Long idLigneVente;
    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article;
    @ManyToOne
    @JoinColumn(name = "vente")
    private Vente vente;

    public Long getIdLigneVente() {
        return idLigneVente;
    }

    public void setIdLigneVente(Long id) {
        this.idLigneVente = id;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
