package com.flong.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flong.backend.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
