package com.flong.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flong.backend.entity.Marca;
import com.flong.backend.service.MarcaService;

@RestController
@RequestMapping("/api/permissaopessoa")
public class PermissaoPessoaController {
    
    @Autowired
    private MarcaService permissaoPessoaService;

    @GetMapping("/")
    public List<Marca> buscarTodos(){
       return permissaoPessoaService.buscarTodos();
    }

    @PostMapping("/")
    public Marca inserir(@RequestBody Marca permissaoPessoa){
        return permissaoPessoaService.inserir(permissaoPessoa);
    }
    
    @PutMapping("/")
    public Marca alterar (@RequestBody Marca permissaoPessoa){
        return permissaoPessoaService.alterar(permissaoPessoa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> Excluir(@PathVariable("id") Long id){
        permissaoPessoaService.excluir(id);
        return ResponseEntity.ok().build();
    }

}
