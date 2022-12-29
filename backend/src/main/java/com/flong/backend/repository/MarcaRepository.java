package com.flong.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flong.backend.entity.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long>{
    
}
