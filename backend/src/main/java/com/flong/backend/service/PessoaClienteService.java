package com.flong.backend.service;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flong.backend.dto.PessoaClienteRequestDTO;
import com.flong.backend.entity.Pessoa;
import com.flong.backend.repository.PessoaClienteRepository;

@Service
public class PessoaClienteService {
    
    @Autowired
    private PessoaClienteRepository pessoaRepository;    

    @Autowired
    private PermissaoPessoaService permissaoPessoaService;

    @Autowired
    private EmailService emailService;
    public Pessoa registrar(PessoaClienteRequestDTO pessoaClienteRequestDTO){
      Pessoa pessoa =  new PessoaClienteRequestDTO().converter(pessoaClienteRequestDTO);  
       pessoa.setDataCriacao(new Date());
       Pessoa pessoaNovo = pessoaRepository.saveAndFlush(pessoa);
       permissaoPessoaService.vincularPessoaPermissaoCliente(pessoaNovo);
       emailService.enviarEmailTexto(pessoaNovo.getEmail(), "Cadastro na Loja Flong", "O registro na loja foi realizado com sucesso. Em breve você receberá a senha de acesso por email");
       return pessoaNovo; 
    }


}
