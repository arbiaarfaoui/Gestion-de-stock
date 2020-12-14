package com.arbia.gestion.stock.demo.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class LigneCommandeFournisseur implements Serializable {
    @Id
    @GeneratedValue
    private Long idLigneCdeFrs;
    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article;
    @ManyToOne
    @JoinColumn(name = "idCommandeFournisseur")
    private CommandeFournisseur commandeFournisseur;

    public Long getIdLigneCdeFrs() {
        return idLigneCdeFrs;
    }

    public void setIdLigneCdeFrs(Long id) {
        this.idLigneCdeFrs = id;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public CommandeFournisseur getCommandeFournisseur() {
        return commandeFournisseur;
    }

    public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
        this.commandeFournisseur = commandeFournisseur;
    }
}
