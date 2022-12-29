package com.example.phish.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user_table")
@Getter
@Setter
public class User {
    @Id
    @SequenceGenerator(name = "id_sequence_generator", sequenceName = "id_sequence_generator", allocationSize = 1)
    @GeneratedValue(generator = "id_sequence_generator")
    private Long userId;
    private String email;
    private String password;



}
