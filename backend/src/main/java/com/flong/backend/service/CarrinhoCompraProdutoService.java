package com.flong.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flong.backend.entity.CarrinhoCompraProduto;
import com.flong.backend.repository.CarrinhoCompraProdutoRepository;

@Service
public class CarrinhoCompraProdutoService {
    
    @Autowired
    private CarrinhoCompraProdutoRepository carrinhoCompraProdutoRepository;

    public List<CarrinhoCompraProduto> buscarTodos(){
        return carrinhoCompraProdutoRepository.findAll();
    }

    public CarrinhoCompraProduto inserir(CarrinhoCompraProduto carrinhoCompraProduto){
        carrinhoCompraProduto.setDataCriacao(new Date());
        CarrinhoCompraProduto carrinhoCompraProdutoNovo = carrinhoCompraProdutoRepository.saveAndFlush(carrinhoCompraProduto);
        return carrinhoCompraProdutoNovo;
    }

    public CarrinhoCompraProduto alterar(CarrinhoCompraProduto carrinhoCompraProduto){
        carrinhoCompraProduto.setDataAtualizacao(new Date());
        return carrinhoCompraProdutoRepository.saveAndFlush(carrinhoCompraProduto);
    }

    public void excluir(Long id){
        CarrinhoCompraProduto carrinhoCompraProduto = carrinhoCompraProdutoRepository.findById(id).get();
        carrinhoCompraProdutoRepository.delete(carrinhoCompraProduto);
    }
}
