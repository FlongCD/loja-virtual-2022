package com.flong.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flong.backend.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    
}
