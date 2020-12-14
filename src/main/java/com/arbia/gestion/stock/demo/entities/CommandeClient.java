package com.arbia.gestion.stock.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.*;
import java.beans.Transient;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
public class CommandeClient implements Serializable {

    @Id
    @GeneratedValue
    private Long idCommandeClient;
    private String code;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCommande;
    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;
    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient> ligneCommandeClients;
    private BigDecimal totalCommande;

    public Long getIdCommandeClient() {
        return idCommandeClient;
    }

    public void setIdCommandeClient(Long id) {
        this.idCommandeClient = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @JsonIgnore
    public List<LigneCommandeClient> getLigneCommandeClients() {
        return ligneCommandeClients;
    }

    public void setLigneCommandeClients(List<LigneCommandeClient> ligneCommandeClients) {
        this.ligneCommandeClients = ligneCommandeClients;
    }

    public BigDecimal getTotalCommande() {
        totalCommande = BigDecimal.ZERO;
        if (!ligneCommandeClients.isEmpty()) {
            for (LigneCommandeClient ligneCommandeClient : ligneCommandeClients) {
                if (ligneCommandeClient.getQuantite() != null && ligneCommandeClient.getPrixUnitaire() != null) {
                    BigDecimal totalLigne = ligneCommandeClient.getQuantite().multiply(ligneCommandeClient.getPrixUnitaire());
                    totalCommande = totalCommande.add(totalLigne);
                }
            }
        }
        return totalCommande;
    }

    @Transient
    public String getLigneCommandeJson() {
        if (!ligneCommandeClients.isEmpty()) {
            try {
                ObjectMapper mapper = new ObjectMapper();
                return mapper.writeValueAsString(ligneCommandeClients);
            } catch (JsonGenerationException e) {
                e.printStackTrace();
            } catch (JsonMappingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "";
    }
}

