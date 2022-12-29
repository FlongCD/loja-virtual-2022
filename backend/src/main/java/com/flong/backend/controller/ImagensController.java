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

import com.flong.backend.entity.Imagens;
import com.flong.backend.service.ImagensService;

@RestController
@RequestMapping("/api/imagens")
public class ImagensController {
    
    @Autowired
    private ImagensService imagensService;

    @GetMapping("/")
    public List<Imagens> buscarTodos(){
       return imagensService.buscarTodos();
    }

    @PostMapping("/")
    public Imagens inserir(@RequestBody Imagens imagens){
        return imagensService.inserir(imagens);
    }
    
    @PutMapping("/")
    public Imagens alterar (@RequestBody Imagens imagens){
        return imagensService.alterar(imagens);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> Excluir(@PathVariable("id") Long id){
        imagensService.excluir(id);
        return ResponseEntity.ok().build();
    }

}
