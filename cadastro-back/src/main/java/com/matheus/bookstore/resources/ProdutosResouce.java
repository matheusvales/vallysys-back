package com.matheus.bookstore.resources;

import com.matheus.bookstore.Produto;
import com.matheus.bookstore.dto.ProdutoDTO;
import com.matheus.bookstore.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/produto")
public class ProdutosResouce {
    @Autowired
    private ProdutoService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Produto> findById(@PathVariable Integer id) {
        Produto obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    @GetMapping(value="/get")
    public List <Produto> findAll2() {
        return service.findAll();
    }

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>>findAll(){
        List<Produto>list = service.findAll();
        List<ProdutoDTO> listDTO= list.stream().map(obj-> new ProdutoDTO(obj))
                .collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }
    @PostMapping
    public ResponseEntity<Produto>create(@RequestBody Produto obj){
        obj = service.create(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Produto>delete(@PathVariable Integer id){
        service.delete(id);
        return(null);
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<Produto>update(@PathVariable Integer id, @RequestBody ProdutoDTO objDTO){
       Produto newObj = service.update(id,objDTO);
       return ResponseEntity.ok().body(newObj);
    }
}


