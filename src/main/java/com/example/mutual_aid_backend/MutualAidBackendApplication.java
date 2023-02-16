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
            necessiteuxRepository.save(new Necessiteux(null, "Jean", "Dupont", "12 Rue des Lilas , Paris", "12345678","jean.dupont@example.com","Besoin d'aide pour l'achat de nourriture","Aide alimentaire", TypeAide.NEED_FOOD));
            necessiteuxRepository.save(new Necessiteux(null, "Paul", "Martin", "54 Rue du Moulin, Lyon", "12345678","paul.martin@example.com","Besoin d'un logement temporaire","Logement temporaire", TypeAide.NEED_MONEY));
            necessiteuxRepository.save(new Necessiteux(null, "Julie", "Roux", "78 Avenue des Prés, Toulouse", "12345678","julie.roux@example.com","Besoin d'une aide pour les enfants","Enfants", TypeAide.NEED_CLOTHES));
            necessiteuxRepository.save(new Necessiteux(null, "Antoine", "Fournier", "16 Rue des Ormes, Rennes", "12345678","antoine.fournier@example.com","Besoin d'une aide pour les animaux","Animaux", TypeAide.NEED_FOOD));
            necessiteuxRepository.save(new Necessiteux(null, "François", "Girard", "33 Rue des Mimosas, Strasbourg", "12345678","laure.girard@example.com","Besoin d'une aide pour les transports","Transports", TypeAide.NEED_MONEY));
            necessiteuxRepository.save(new Necessiteux(null, "Laure", "Caron", "21 Rue des Cerisiers, Bordeaux\"", "12345678","nfrancois.caron@example.com","Besoin d'une aide pour l'éducation","Éducation", TypeAide.NEED_FOOD));

            necessiteuxRepository.save(new Necessiteux(null, "Marie", "Lefebvre", "6 Avenue des Roses, Marseille", "12345678","marie.lefebvre@example.com","Besoin d'une assistance médicale","Assistance médicale", TypeAide.NEED_MEDICINE));
            necessiteuxRepository.save(new Necessiteux(null, "Lucie", "Moreau", "27 Rue de la Paix, Nice", "12345678","lucie.moreau@example.com","Besoin d'une aide financière pour les factures","Aide financière", TypeAide.NEED_MONEY));
            necessiteuxRepository.save(new Necessiteux(null, "Alice", "Dubois", "9 Rue des Champs, Lille", "12345678","alice.dubois@example.com","Besoin d'une aide pour la recherche d'emploi","Recherche d'emploi", TypeAide.NEED_OTHERS));

            benevoleRepository.save(new Benevole(null, "Nabil", "Bouzid", "Tunis", "12345678","nabil@gmail.com","je suis un necessiteux"));
            benevoleRepository.save(new Benevole(null, "anass", "Bouzid", "Tunis", "12345678","anass@gmail.com","je suis un necessiteux"));
            benevoleRepository.save(new Benevole(null, "simo", "Bouzid", "Tunis", "12345678","simo@gmail.com","je suis un necessiteux"));
            benevoleRepository.findAll().forEach(System.out::println);
            necessiteuxRepository.findAll().forEach(System.out::println);

        };}


}
