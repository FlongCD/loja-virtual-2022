package com.flong.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flong.backend.entity.Imagens;
import com.flong.backend.repository.ImagensRepository;

@Service
public class ImagensService {
    
    @Autowired
    private ImagensRepository imagensRepository;

    public List<Imagens> buscarTodos(){
        return imagensRepository.findAll();
    }

    public Imagens inserir(Imagens Imagens){
        Imagens.setDataCriacao(new Date());
        Imagens imagensNovo = imagensRepository.saveAndFlush(Imagens);
        return imagensNovo;
    }

    public Imagens alterar(Imagens Imagens){
        Imagens.setDataAtualizacao(new Date());
        return imagensRepository.saveAndFlush(Imagens);
    }

    public void excluir(Long id){
        Imagens imagens = imagensRepository.findById(id).get();
        imagensRepository.delete(imagens);
    }
}
