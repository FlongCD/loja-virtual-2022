package com.flong.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flong.backend.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
    
}
