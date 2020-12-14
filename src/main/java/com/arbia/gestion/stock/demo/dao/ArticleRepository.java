package com.arbia.gestion.stock.demo.dao;

import com.arbia.gestion.stock.demo.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
