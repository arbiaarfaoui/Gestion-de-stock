package com.arbia.gestion.stock.demo.dao;

import com.arbia.gestion.stock.demo.entities.LigneVente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneVenteRepository extends JpaRepository<LigneVente, Long> {
}
