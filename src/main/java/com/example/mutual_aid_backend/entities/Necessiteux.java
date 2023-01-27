package com.example.mutual_aid_backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Necessiteux  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    private String description;
    @Enumerated(EnumType.STRING)
    private TypeAide typeAide;


}
