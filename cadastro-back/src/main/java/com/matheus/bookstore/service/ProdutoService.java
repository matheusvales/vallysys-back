package com.matheus.bookstore.service;

import com.matheus.bookstore.Produto;
import com.matheus.bookstore.dto.ProdutoDTO;
import com.matheus.bookstore.exeptions.ObjectNotFoundExeptions;
import com.matheus.bookstore.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public Produto findById(Integer id) {
        Optional<Produto> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundExeptions("Objeto nao encontrado"));
    }
   public List<Produto> findAll() {return repository.findAll();
    }

    public Produto create(Produto obj) {
        obj.setId(null);
        return repository.save(obj);
    }

    public String delete(Integer id) {
        repository.deleteById(id);
        return "Objeto deletado";
    }

    public Produto update(Integer id, ProdutoDTO objDTO) {
        Produto obj = findById(id);
        if(obj == null){
            return null;
        }else{
            obj.setNome(objDTO.getNome());
            obj.setCodigo_interno(objDTO.getCodigo_interno());
            obj.setConcorrente(objDTO.getConcorrente());
            obj.setSituacao(objDTO.getSituacao());
            obj.setCategoria(objDTO.getCategoria());
            return repository.save(obj);
        }
    }
}
