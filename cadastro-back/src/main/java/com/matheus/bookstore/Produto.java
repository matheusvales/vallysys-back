package com.matheus.bookstore;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Produto implements Serializable {
    private static final long serialVersionUID= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String codigo_interno;
    private String concorrente;
    private String situacao;


    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Produto(){
        super();
    }

    public Produto(Integer id, String nome, String nome_autor, String concorrente, Categoria categoria, String situacao) {
        super();
        this.id = id;
        this.nome = nome;
        this.codigo_interno = codigo_interno;
        this.concorrente = concorrente;
        this.situacao = situacao;
        this.categoria= categoria;

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

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
            return id.equals(produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
