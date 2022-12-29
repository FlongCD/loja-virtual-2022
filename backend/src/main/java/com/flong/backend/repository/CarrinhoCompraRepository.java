package com.flong.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flong.backend.entity.CarrinhoCompra;

public interface CarrinhoCompraRepository extends JpaRepository<CarrinhoCompra, Long>{
    
}