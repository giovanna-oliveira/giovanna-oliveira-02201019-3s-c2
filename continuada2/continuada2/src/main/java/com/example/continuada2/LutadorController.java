package com.example.continuada2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/lutadores")
public class LutadorController {

    @Autowired
    private LutadorRepository repository;

    @PostMapping
    public ResponseEntity postLutador(@RequestBody @Valid Lutador lutador){
        repository.save(lutador);
        return ResponseEntity.status(201).build();
    }

    @GetMapping
    public List<Lutador> getLutador(){
        return repository.findAllByOrderByForcaLutaDesc();
    }

    @GetMapping("/contagem-vivos")
    public List<Lutador> getLutadoresVivos(){
        return repository.findByVidaGreaterThan(0.0);
    }

    @GetMapping("/mortos")
    public List<Lutador> getMortos(){
        return repository.findByVidaLessThan(0.0);
    }

    @PostMapping("/{id}/concentrar")
    public ResponseEntity postConcentrar(@PathVariable int id){
        if(repository.findByIdAndConcentracoesRealizadasGreaterThan(id))
    }


    @PostMapping("/golpe {dados}")
    public List<Lutador> postGolpe(@RequestBody){

        return ResponseEntity.status(201).build();
    }

}
