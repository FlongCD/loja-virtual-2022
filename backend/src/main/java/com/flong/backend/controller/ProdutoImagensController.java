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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.flong.backend.entity.ProdutoImagens;
import com.flong.backend.service.ProdutoImagensService;

@RestController
@RequestMapping("/api/produtoImagens")
public class ProdutoImagensController {
    
    @Autowired
    private ProdutoImagensService produtoProdutoImagensService;

    @GetMapping("/")
    public List<ProdutoImagens> buscarTodos(){
       return produtoProdutoImagensService.buscarTodos();
    }

    @PostMapping("/")
    public ProdutoImagens inserir(@RequestParam("idImagem") Long id, @RequestParam("file") MultipartFile file){
        return produtoProdutoImagensService.inserir(id, file);
    }
    
    @PutMapping("/")
    public ProdutoImagens alterar (@RequestBody ProdutoImagens produtoProdutoImagens){
        return produtoProdutoImagensService.alterar(produtoProdutoImagens);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> Excluir(@PathVariable("id") Long id){
        produtoProdutoImagensService.excluir(id);
        return ResponseEntity.ok().build();
    }

}
