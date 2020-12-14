package com.arbia.gestion.stock.demo.dao;

import com.arbia.gestion.stock.demo.entities.MvtStk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MvtStkRepository extends JpaRepository<MvtStk, Long> {
}
