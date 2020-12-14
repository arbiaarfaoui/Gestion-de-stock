package com.arbia.gestion.stock.demo.dao;

import com.arbia.gestion.stock.demo.entities.Vente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenteRepository extends JpaRepository<Vente, Long> {
}
