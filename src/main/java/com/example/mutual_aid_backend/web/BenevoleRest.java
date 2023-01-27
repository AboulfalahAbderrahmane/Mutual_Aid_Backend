package com.example.mutual_aid_backend.web;

import com.example.mutual_aid_backend.entities.Benevole;
import com.example.mutual_aid_backend.repositories.BenevoleRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")

public class BenevoleRest {
    BenevoleRepository benevoleRepository;
    @GetMapping("/benevole")
    public List<Benevole> getBenevole(){
        return benevoleRepository.findAll();
    }
    @PostMapping("/benevole")
    public Benevole saveBenevole(@RequestBody Benevole benevole){
        log.info("benevole: " + benevole.toString());
        return benevoleRepository.save(benevole);
    }
    @GetMapping("/benevole/{id}")
    public Benevole getBenevole(@PathVariable Long id){
        return benevoleRepository.findById(id).get();
    }
    @DeleteMapping("/benevole/{id}")
    public void deleteBenevole(@PathVariable Long id){
        benevoleRepository.deleteById(id);
    }
    @PutMapping("/benevole/{id}")
    public Benevole updateBenevole(@PathVariable Long id,@RequestBody Benevole benevole){
        benevole.setId(id);
        return benevoleRepository.save(benevole);
    }
}
