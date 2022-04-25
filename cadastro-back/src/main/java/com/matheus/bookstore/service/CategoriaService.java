package com.matheus.bookstore.service;

import com.matheus.bookstore.Categoria;
import com.matheus.bookstore.dto.CategoriaDTO;
import com.matheus.bookstore.exeptions.ObjectNotFoundExeptions;
import com.matheus.bookstore.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Integer id){
        Optional<Categoria> obj = repository.findById(id);
       return obj.orElseThrow(()->new ObjectNotFoundExeptions("Objeto nao encontrado"));
    }
    public List<Categoria> findAll() {
        return repository.findAll();
    }
    public Categoria create(Categoria obj){
        obj.setId(null);
        return repository.save(obj);
    }
    public String delete(Integer id){
          repository.deleteById(id);
          return "Objeto deletado";

    }
    public Categoria update(Integer id , CategoriaDTO objDTO) {
        Categoria obj = findById(id);
        if (obj == null) {
            return null;
        } else {
         obj.setDescricao(objDTO.getDescricao());
         obj.setCodigo_interno(objDTO.getCodigo_interno());
         return repository.save(obj);
        }
    }
}
