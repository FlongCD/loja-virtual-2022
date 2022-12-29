package com.flong.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flong.backend.entity.CarrinhoCompraProduto;

public interface CarrinhoCompraProdutoRepository extends JpaRepository<CarrinhoCompraProduto, Long>{
    
}