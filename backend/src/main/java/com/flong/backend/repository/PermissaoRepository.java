package com.flong.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flong.backend.entity.Permissao;

public interface PermissaoRepository extends JpaRepository<Permissao, Long>{
    
}
