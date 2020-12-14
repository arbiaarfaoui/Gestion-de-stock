package com.arbia.gestion.stock.demo.dao;

import com.arbia.gestion.stock.demo.entities.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur, Long> {
}
