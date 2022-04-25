package com.matheus.bookstore.dto;

import com.matheus.bookstore.Categoria;
import com.matheus.bookstore.Produto;

import java.io.Serializable;

public class ProdutoDTO implements Serializable {
    private static final long serialVersionUID = 1l;

    private Integer id;
    private String nome;
    private String codigo_interno;
    private String concorrente;
    private String situacao;
    private Categoria categoria;

    public ProdutoDTO(){super();}

    public ProdutoDTO(Produto obj) {
        super();
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.codigo_interno = obj.getCodigo_interno();
        this.concorrente = obj.getConcorrente();
        this.situacao = obj.getSituacao();

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo_interno() {
        return codigo_interno;
    }

    public void setCodigo_interno(String codigo_interno) {
        this.codigo_interno = codigo_interno;
    }

    public String getConcorrente() {
        return concorrente;
    }

    public void setConcorrente(String concorrente) {
        this.concorrente = concorrente;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
