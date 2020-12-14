package com.arbia.gestion.stock.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.InputStream;

@Repository

public interface FlickrRepository {
    public String savePhoto(InputStream photo, String title) throws Exception;
}
