package com.arbia.gestion.stock.demo.dao;

import com.arbia.gestion.stock.demo.entities.CommandeFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeFournisseurRepository extends JpaRepository<CommandeFournisseur, Long> {
}
