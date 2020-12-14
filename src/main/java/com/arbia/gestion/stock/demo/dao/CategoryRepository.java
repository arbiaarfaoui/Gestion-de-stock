package com.arbia.gestion.stock.demo.dao;

import com.arbia.gestion.stock.demo.entities.Article;
import com.arbia.gestion.stock.demo.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
