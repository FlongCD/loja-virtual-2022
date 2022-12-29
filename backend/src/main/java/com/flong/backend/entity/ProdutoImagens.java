package com.flong.backend.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@SequenceGenerator(name = "produtosimagens_seq" ,initialValue = 1,  sequenceName = "produtosimagens_seq", allocationSize = 1)
@Table(name = "produtoimagens")
@Data
public class ProdutoImagens {
      
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produtosimagens_seq")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_imagem_produto")
    private Produto produto;

    private String nome;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;

    @Transient
    private byte[] arquivo;

}
