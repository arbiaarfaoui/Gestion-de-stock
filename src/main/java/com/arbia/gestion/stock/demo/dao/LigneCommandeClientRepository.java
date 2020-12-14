package com.arbia.gestion.stock.demo.dao;

import com.arbia.gestion.stock.demo.entities.LigneCommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LigneCommandeClientRepository  extends JpaRepository<LigneCommandeClient, Long> {

}
