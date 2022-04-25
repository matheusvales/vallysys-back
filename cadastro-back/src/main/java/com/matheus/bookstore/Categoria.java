package com.matheus.bookstore;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Categoria implements Serializable {
    private static final long serialVersionUID= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String codigo_interno;

    private String descricao;

    @JsonBackReference
    @OneToMany(mappedBy = "categoria")
    private List<Produto> produtos =new ArrayList<>();

    public Categoria(){
        super();
    }

    public Categoria(Integer id, String codigo_interno, String descricao) {
        this.id = id;
        this.codigo_interno = codigo_interno;
        this.descricao = descricao;
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

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return id.equals(categoria.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
