package com.arbia.gestion.stock.demo.dao;

import com.arbia.gestion.stock.demo.entities.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeClientRepository extends JpaRepository<CommandeClient, Long> {
}
