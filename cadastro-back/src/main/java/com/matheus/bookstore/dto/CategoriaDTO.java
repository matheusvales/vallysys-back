package com.matheus.bookstore.dto;

import com.matheus.bookstore.Categoria;

import java.io.Serializable;

public class CategoriaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String codigo_interno;
    private String descricao;

    public CategoriaDTO() {
        super();
    }

    public CategoriaDTO(Categoria obj) {
        super();
        this.id = obj.getId();
        this.codigo_interno = obj.getCodigo_interno();
        this.descricao = obj.getDescricao();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo_interno() {
        return codigo_interno;
    }

    public void setCodigo_interno(String nome) {
        this.codigo_interno = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
