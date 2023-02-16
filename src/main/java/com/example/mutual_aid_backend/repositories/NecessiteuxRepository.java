package com.example.mutual_aid_backend.repositories;

import com.example.mutual_aid_backend.entities.Necessiteux;
import com.example.mutual_aid_backend.entities.TypeAide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NecessiteuxRepository extends JpaRepository<Necessiteux, Long> {
    @Query("select necessiteux from Necessiteux necessiteux where necessiteux.typeAide=:name ")
    List<Necessiteux> filtrer(@Param("name") TypeAide name);
}
