package com.flong.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flong.backend.entity.CarrinhoCompra;
import com.flong.backend.repository.CarrinhoCompraRepository;

@Service
public class CarrinhoCompraService {
    
    @Autowired
    private CarrinhoCompraRepository carrinhoCompraRepository;

    public List<CarrinhoCompra> buscarTodos(){
        return carrinhoCompraRepository.findAll();
    }

    public CarrinhoCompra inserir(CarrinhoCompra carrinhoCompra){
        carrinhoCompra.setDataCriacao(new Date());
        CarrinhoCompra carrinhoCompraNovo = carrinhoCompraRepository.saveAndFlush(carrinhoCompra);
        return carrinhoCompraNovo;
    }

    public CarrinhoCompra alterar(CarrinhoCompra carrinhoCompra){
        carrinhoCompra.setDataAtualizacao(new Date());
        return carrinhoCompraRepository.saveAndFlush(carrinhoCompra);
    }

    public void excluir(Long id){
        CarrinhoCompra carrinhoCompra = carrinhoCompraRepository.findById(id).get();
        carrinhoCompraRepository.delete(carrinhoCompra);
    }
}
