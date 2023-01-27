package com.example.mutual_aid_backend.web;

import com.example.mutual_aid_backend.entities.Necessiteux;
import com.example.mutual_aid_backend.repositories.NecessiteuxRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")

public class NecessiteuxRest {
    private NecessiteuxRepository necessiteuxRepository;
    @GetMapping("/necessiteux")
    public List<Necessiteux> getNecessiteux(){
        return necessiteuxRepository.findAll();
    }
    @PostMapping("/necessiteux")
    public Necessiteux saveNecessiteux(@RequestBody Necessiteux necessiteux){
        return necessiteuxRepository.save(necessiteux);
    }
    @GetMapping("/necessiteux/{id}")
    public Necessiteux getNecessiteux(@PathVariable Long id){
        return necessiteuxRepository.findById(id).get();
    }
    @DeleteMapping("/necessiteux/{id}")
    public void deleteNecessiteux(@PathVariable Long id){
        necessiteuxRepository.deleteById(id);
    }
    @PutMapping("/necessiteux/{id}")
    public Necessiteux updateNecessiteux(@PathVariable Long id,@RequestBody Necessiteux necessiteux){
        necessiteux.setId(id);
        return necessiteuxRepository.save(necessiteux);
    }

}
