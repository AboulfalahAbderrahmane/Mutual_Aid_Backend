package com.example.mutual_aid_backend.repositories;

import com.example.mutual_aid_backend.entities.Necessiteux;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NecessiteuxRepository extends JpaRepository<Necessiteux, Long> {
}
