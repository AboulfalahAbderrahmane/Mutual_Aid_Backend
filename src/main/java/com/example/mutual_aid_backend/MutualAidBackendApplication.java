package com.example.mutual_aid_backend;

import com.example.mutual_aid_backend.entities.Benevole;
import com.example.mutual_aid_backend.entities.Necessiteux;
import com.example.mutual_aid_backend.entities.TypeAide;
import com.example.mutual_aid_backend.repositories.BenevoleRepository;
import com.example.mutual_aid_backend.repositories.NecessiteuxRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MutualAidBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MutualAidBackendApplication.class, args);
    }
    @Bean
    CommandLineRunner start(NecessiteuxRepository necessiteuxRepository, BenevoleRepository benevoleRepository){

        return args -> {
            necessiteuxRepository.save(new Necessiteux(null, "Nabil", "Bouzid", "Tunis", "12345678","nabil@gmail.com","je suis un necessiteux", TypeAide.NEEDFOOD));
            necessiteuxRepository.save(new Necessiteux(null, "Anass", "lalaoui", "casa", "0352155541","Anass@gmail.com","je suis un necessiteux",TypeAide.NEEDMEDICINE));
            necessiteuxRepository.save(new Necessiteux(null, "simo", "boukader", "rabat", "12345678","simo@gmail.com","je suis un necessiteux",TypeAide.NEEDCLOTHES));
            benevoleRepository.save(new Benevole(null, "Nabil", "Bouzid", "Tunis", "12345678","nabil@gmail.com","je suis un necessiteux"));
            benevoleRepository.save(new Benevole(null, "anass", "Bouzid", "Tunis", "12345678","anass@gmail.com","je suis un necessiteux"));
            benevoleRepository.save(new Benevole(null, "simo", "Bouzid", "Tunis", "12345678","simo@gmail.com","je suis un necessiteux"));
            benevoleRepository.findAll().forEach(System.out::println);
            necessiteuxRepository.findAll().forEach(System.out::println);

        };}


}
